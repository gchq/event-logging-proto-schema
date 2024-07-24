package no.entur.schema2proto.compatibility;

/*-
 * #%L
 * schema2proto-lib
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

import java.util.Set;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;

import no.entur.schema2proto.compatibility.protolock.AbstractNameIDPair;

public class ConflictResolverHelper {

	public static BiMap<String, Integer> createBiMap(Set<? extends AbstractNameIDPair> fields) {
		BiMap<String, Integer> fieldMap = HashBiMap.create();
		fields.stream().forEach(e -> fieldMap.put(e.getName(), e.getId()));
		return fieldMap;
	}

}
