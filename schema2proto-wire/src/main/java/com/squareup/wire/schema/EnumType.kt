/*
 * Copyright (C) 2015 Square, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.squareup.wire.schema

import com.squareup.wire.schema.Options.ENUM_OPTIONS
import com.squareup.wire.schema.Reserved.Companion.fromElements
import com.squareup.wire.schema.internal.parser.EnumElement
import java.util.*

class EnumType public constructor(
        private var protoType: ProtoType,
        private val location: Location,
        private val documentation: String,
        private var name: String,
        private val constants: List<EnumConstant>,
        private val reserveds: MutableList<Reserved>,
        private val options: Options
) : Type() {
    private var allowAlias: Any? = null

    // TODO(jrodbx): Konvert to overridden vals, once Type is konverted
    override fun location() = location

    override fun type() = protoType
    override fun documentation() = documentation
    override fun options() = options
    override fun nestedTypes() = emptyList<Type>() // Enums do not allow nested type declarations.

    fun allowAlias() = allowAlias != null && allowAlias == true

    /** Returns the constant named `name`, or null if this enum has no such constant.  */
    fun constant(name: String) = constants.find { it.name == name }

    /** Returns the constant tagged `tag`, or null if this enum has no such constant.  */
    fun constant(tag: Int) = constants.find { it.tag == tag }

    fun constants() = constants

    fun reserveds() = reserveds

    internal override fun link(linker: Linker) {}

    internal override fun linkOptions(linker: Linker) {
        options.link(linker)
        for (constant in constants) {
            constant.linkOptions(linker)
        }
        allowAlias = options.get(ALLOW_ALIAS)
    }

    internal override fun validate(linker: Linker) {
        var linker = linker
        linker = linker.withContext(this)

        if (!allowAlias()) {
            validateTagUniqueness(linker)
        }
    }

    private fun validateTagUniqueness(linker: Linker) {
        val tagToConstants = linkedMapOf<Int, MutableList<EnumConstant>>()
        constants.forEach {
            tagToConstants
                    .getOrPut(it.tag) { mutableListOf() }
                    .add(it)
        }

        for ((tag, constants) in tagToConstants) {
            if (constants.size > 1) {
                val error = buildString {
                    append("multiple enum constants share tag $tag:")
                    constants.forEachIndexed { index, it ->
                        append("\n  ${index + 1}. ${it.name} (${it.location})")
                    }
                }
                linker.addError("%s", error)
            }
        }
    }

    fun addReserved(documentation: String?, location: Location?, tag: Int) {
        val alreadyReserved = reserveds.stream().anyMatch { reservation: Reserved -> reservation.matchesTag(tag) }
        if (!alreadyReserved) {
            reserveds.add(Reserved(location!!, documentation!!, Arrays.asList(tag)))
        }
    }

    fun addReserved(documentation: String?, location: Location?, fieldName: String) {
        val alreadyReserved = reserveds.stream().anyMatch { reservation: Reserved -> reservation.matchesName(fieldName) }
        if (!alreadyReserved) {
            reserveds.add(Reserved(location!!, documentation!!, Arrays.asList(fieldName)))
        }
    }


    internal override fun retainAll(
            schema: Schema,
            markSet: MarkSet
    ): Type? {
        // If this type is not retained, prune it.
        if (!markSet.contains(protoType)) return null

        val retainedConstants = constants
                .filter { markSet.contains(ProtoMember.get(protoType, it.name)) }
                .map { it.retainAll(schema, markSet) }

        val result = EnumType(
                protoType, location, documentation, name,
                retainedConstants, reserveds,
                options.retainAll(schema, markSet)
        )
        result.allowAlias = allowAlias
        return result
    }

    fun toElement(): EnumElement {
        return EnumElement(
                location,
                name,
                documentation,
                options.toElements(),
                Reserved.toElements(reserveds),
                EnumConstant.toElements(constants)
        )
    }

    fun name(): String {
        return name;
    }

    fun updateName(newMessageName: String) {
        name = newMessageName;
        protoType = ProtoType.get(protoType.enclosingTypeOrPackage(), newMessageName);
    }

    companion object {
        internal val ALLOW_ALIAS = ProtoMember.get(ENUM_OPTIONS, "allow_alias")

        @JvmStatic
        fun fromElement(
                protoType: ProtoType,
                enumElement: EnumElement
        ): EnumType {
            val constants = EnumConstant.fromElements(enumElement.constants)
            val options = Options(Options.ENUM_OPTIONS, enumElement.options)
            val reserveds = fromElements(enumElement.reserveds)



            return EnumType(
                    protoType, enumElement.location, enumElement.documentation,
                    enumElement.name, constants, reserveds.toMutableList(), options
            )
        }
    }
}
