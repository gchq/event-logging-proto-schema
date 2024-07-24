/*
 * Copyright (C) 2014 Square, Inc.
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
package com.squareup.wire.schema.internal.parser

import com.squareup.wire.schema.Location
import com.squareup.wire.schema.internal.Util.appendDocumentation
import com.squareup.wire.schema.internal.Util.appendIndented

data class RpcElement(
        val location: Location,
        val name: String,
        val documentation: String = "",
        val requestType: String,
        val responseType: String,
        val requestStreaming: Boolean = false,
        val responseStreaming: Boolean = false,
        val options: List<OptionElement> = emptyList()
) {
    fun toSchema() = buildString {
        appendDocumentation(this, documentation)
        append("rpc $name (")

        if (requestStreaming) {
            append("stream ")
        }
        append("$requestType) returns (")

        if (responseStreaming) {
            append("stream ")
        }
        append("$responseType)")

        if (options.isNotEmpty()) {
            append(" {\n")
            for (option in options) {
                appendIndented(this, option.toSchemaDeclaration())
            }
            append('}')
        }

        append(";\n")
    }
}
