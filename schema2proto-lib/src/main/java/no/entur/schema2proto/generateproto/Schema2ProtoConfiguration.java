/*-
 * #%L
 * schema2proto-lib
 * %%
 * Copyright (C) 2019 Entur
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
package no.entur.schema2proto.generateproto;

import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.regex.Pattern;

public class Schema2ProtoConfiguration {
	public static final String DEFAULT_PROTO_PACKAGE = "default";
	public File xsdFile = null;
	public String outputFilename = null;
	public File outputDirectory = null;
	public String defaultProtoPackage = null;
	public String forceProtoPackage = null;
	public boolean inheritanceToComposition = false;
	public SortedMap<Pattern, String> customTypeMappings = new TreeMap<>(Comparator.comparing(Pattern::pattern));;
	public SortedMap<Pattern, String> customTypeReplacements = new TreeMap<>(Comparator.comparing(Pattern::pattern));;
	public SortedMap<Pattern, String> customNameMappings = new TreeMap<>(Comparator.comparing(Pattern::pattern));;
	public List<String> customImports = new ArrayList<>();
	public List<String> customImportLocations = new ArrayList<>();
	public SortedMap<String, Object> options = new TreeMap<>();
	public List<FieldPath> ignoreOutputFields = new ArrayList<>();
	public boolean includeMessageDocs = true;
	public boolean includeFieldDocs = true;
	public boolean includeSourceLocationInDoc = false;
	public boolean includeValidationRules = false;
	public boolean skipEmptyTypeInheritance = false;
	public boolean includeXsdOptions = false;
	public File protoLockFile;
	public boolean failIfRemovedFields = true;
	public boolean derivationBySubsumption = false;
	public boolean includeGoPackageOptions = false;
	public String goPackageSourcePrefix = null;
}
