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

/**
 * Base interface of all "declarations".
 * 
 * @author
 *  Kohsuke Kawaguchi (kohsuke.kawaguchi@sun.com)
 */
public interface XSDeclaration extends XSComponent
{
    /**
     * Target namespace to which this component belongs.
     * <code>""</code> is used to represent the default no namespace.
     */
    String getTargetNamespace();

    /**
     * Gets the (local) name of the declaration.
     *
     * @return null if this component is anonymous.
     */
    String getName();

    /**
     * @deprecated use the isGlobal method, which always returns
     * the opposite of this function. Or the isLocal method.
     */
    boolean isAnonymous();

    /**
     * Returns true if this declaration is a global declaration.
     * 
     * Global declarations are those declaration that can be enumerated
     * through the schema object.
     */
    boolean isGlobal();

    /**
     * Returns true if this declaration is a local declaration.
     * Equivalent of <code>!isGlobal()</code>
     */
    boolean isLocal();
}
