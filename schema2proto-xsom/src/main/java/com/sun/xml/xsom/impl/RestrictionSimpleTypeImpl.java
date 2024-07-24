/*
 * Copyright (c) 1997, 2018 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Distribution License v. 1.0, which is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * SPDX-License-Identifier: BSD-3-Clause
 */

package com.sun.xml.xsom.impl;

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

import com.sun.xml.xsom.XSFacet;
import com.sun.xml.xsom.XSRestrictionSimpleType;
import com.sun.xml.xsom.XSVariety;
import com.sun.xml.xsom.XSSimpleType;
import com.sun.xml.xsom.impl.parser.SchemaDocumentImpl;
import com.sun.xml.xsom.visitor.XSSimpleTypeFunction;
import com.sun.xml.xsom.visitor.XSSimpleTypeVisitor;
import org.xml.sax.Locator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class RestrictionSimpleTypeImpl extends SimpleTypeImpl implements XSRestrictionSimpleType {

    public RestrictionSimpleTypeImpl( SchemaDocumentImpl _parent,
                                      AnnotationImpl _annon, Locator _loc, ForeignAttributesImpl _fa,
                                      String _name, boolean _anonymous, Set<XSVariety> finalSet,
                                      Ref.SimpleType _baseType ) {

        super( _parent, _annon, _loc, _fa, _name, _anonymous, finalSet, _baseType );
    }


    private final List<XSFacet> facets = new ArrayList<XSFacet>();
    public void addFacet( XSFacet facet ) {
        facets.add(facet);
    }
    public Iterator<XSFacet> iterateDeclaredFacets() {
        return facets.iterator();
    }

    public Collection<? extends XSFacet> getDeclaredFacets() {
        return facets;
    }

    public XSFacet getDeclaredFacet( String name ) {
        int len = facets.size();
        for( int i=0; i<len; i++ ) {
            XSFacet f = facets.get(i);
            if(f.getName().equals(name))
                return f;
        }
        return null;
    }

    public List<XSFacet> getDeclaredFacets(String name) {
        List<XSFacet> r = new ArrayList<XSFacet>();
        for( XSFacet f : facets )
            if(f.getName().equals(name))
                r.add(f);
        return r;
    }

    public XSFacet getFacet( String name ) {
        XSFacet f = getDeclaredFacet(name);
        if(f!=null)     return f;

        // none was found on this datatype. check the base type.
        return getSimpleBaseType().getFacet(name);
    }

    public List<XSFacet> getFacets( String name ) {
        List<XSFacet> f = getDeclaredFacets(name);
        if(!f.isEmpty())     return f;

        // none was found on this datatype. check the base type.
        return getSimpleBaseType().getFacets(name);
    }

    public XSVariety getVariety() { return getSimpleBaseType().getVariety(); }

    public XSSimpleType getPrimitiveType() {
        if(isPrimitive())       return this;
        return getSimpleBaseType().getPrimitiveType();
    }

    public boolean isPrimitive() {
        return getSimpleBaseType()==getOwnerSchema().getRoot().anySimpleType;
    }

    public void visit( XSSimpleTypeVisitor visitor ) {
        visitor.restrictionSimpleType(this);
    }
    public Object apply( XSSimpleTypeFunction function ) {
        return function.restrictionSimpleType(this);
    }

    public boolean isRestriction() { return true; }
    public XSRestrictionSimpleType asRestriction() { return this; }
}
