/*
 * Copyright (c) 1997, 2018 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Distribution License v. 1.0, which is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * SPDX-License-Identifier: BSD-3-Clause
 */

package com.sun.xml.xsom;

/*-
 * #%L
 * XSOM
 * %%
 * Copyright (C) 2019 - 2020 Entur
 * %%
 * Licensed under the EUPL, Version 1.1 or – as soon they will be
 * approved by the European Commission - subsequent versions of the
 * EUPL (the "Licence");
 * 
 * You may not use this work except in compliance with the Licence.
 * You may obtain a copy of the Licence at:
 * 
 * http://ec.europa.eu/idabc/eupl5
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the Licence is distributed on an "AS IS" basis,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the Licence for the specific language governing permissions and
 * limitations under the Licence.
 * #L%
 */

import com.sun.xml.xsom.parser.SchemaDocument;

import java.util.Iterator;
import java.util.Map;

/**
 * Schema.
 * 
 * Container of declarations that belong to the same target namespace.
 * 
 * @author
 *  Kohsuke Kawaguchi (kohsuke.kawaguchi@sun.com)
 */
public interface XSSchema extends XSComponent
{
    /**
     * Gets the target namespace of the schema.
     *
     * @return
     *      can be empty, but never be null.
     */
    String getTargetNamespace();

    /**
     * Gets all the {@link XSAttributeDecl}s in this schema
     * keyed by their local names.
     */
    Map<String,XSAttributeDecl> getAttributeDecls();
    Iterator<XSAttributeDecl> iterateAttributeDecls();
    XSAttributeDecl getAttributeDecl(String localName);

    /**
     * Gets all the {@link XSElementDecl}s in this schema.
     */
    Map<String,XSElementDecl> getElementDecls();
    Iterator<XSElementDecl> iterateElementDecls();
    XSElementDecl getElementDecl(String localName);

    /**
     * Gets all the {@link XSAttGroupDecl}s in this schema.
     */
    Map<String,XSAttGroupDecl> getAttGroupDecls();
    Iterator<XSAttGroupDecl> iterateAttGroupDecls();
    XSAttGroupDecl getAttGroupDecl(String localName);

    /**
     * Gets all the {@link XSModelGroupDecl}s in this schema.
     */
    Map<String,XSModelGroupDecl> getModelGroupDecls();
    Iterator<XSModelGroupDecl> iterateModelGroupDecls();
    XSModelGroupDecl getModelGroupDecl(String localName);

    /**
     * Gets all the {@link XSType}s in this schema (union of
     * {@link #getSimpleTypes()} and {@link #getComplexTypes()}
     */
    Map<String,XSType> getTypes();
    Iterator<XSType> iterateTypes();
    XSType getType(String localName);

    /**
     * Gets all the {@link XSSimpleType}s in this schema.
     */
    Map<String,XSSimpleType> getSimpleTypes();
    Iterator<XSSimpleType> iterateSimpleTypes();
    XSSimpleType getSimpleType(String localName);

    /**
     * Gets all the {@link XSComplexType}s in this schema.
     */
    Map<String,XSComplexType> getComplexTypes();
    Iterator<XSComplexType> iterateComplexTypes();
    XSComplexType getComplexType(String localName);

    /**
     * Gets all the {@link XSNotation}s in this schema.
     */
    Map<String,XSNotation> getNotations();
    Iterator<XSNotation> iterateNotations();
    XSNotation getNotation(String localName);

    /**
     * Gets all the {@link XSIdentityConstraint}s in this schema,
     * keyed by their names.
     */
    Map<String,XSIdentityConstraint> getIdentityConstraints();

    /**
     * Gets the identity constraint of the given name, or null if not found.
     */
    XSIdentityConstraint getIdentityConstraint(String localName);

    /**
     * Sine an {@link XSSchema} is not necessarily defined in
     * one schema document (for example one schema can span across
     * many documents through {@code <xs:include>s}.),
     * so this method always returns null.
     *
     * @deprecated
     *      Since this method always returns null, if you are calling
     *      this method from {@link XSSchema} and not from {@link XSComponent},
     *      there's something wrong with your code.
     */
    SchemaDocument getSourceDocument();

    /**
     * Gets the root schema set that includes this schema.
     *
     * @return never null.
     */
    XSSchemaSet getRoot();
}
