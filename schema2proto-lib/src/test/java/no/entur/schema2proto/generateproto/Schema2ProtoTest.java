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
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Test;

import no.entur.schema2proto.AbstractMappingTest;

public class Schema2ProtoTest extends AbstractMappingTest {

	private File expectedRootFolder = new File("src/test/resources/expectedproto/legacy");

	@Test
	public void compareAtomProtobuf() throws IOException {

		generateProtobufNoOptions("atom.xsd");
		compareExpectedAndGenerated(expectedRootFolder, "default/atom.proto", generatedRootFolder, "default/default.proto");
	}

	@Test
	public void compareRecipeProtobuf() throws IOException {
		generateProtobufNoOptions("recipe.xsd");
		compareExpectedAndGenerated(expectedRootFolder, "default/recipe.proto", generatedRootFolder, "default/default.proto");
	}

	@Test
	public void compareShiporderProtobuf() throws IOException {
		generateProtobufNoOptions("shiporder.xsd");
		compareExpectedAndGenerated(expectedRootFolder, "default/shiporder.proto", generatedRootFolder, "default/default.proto");
	}

	@Test
	public void compareBackwardsCompatibleProtobuf() throws IOException {
		Schema2ProtoConfiguration configuration = new Schema2ProtoConfiguration();
		configuration.protoLockFile = new File("src/test/resources/protolock/proto.lock");
		generateProtobuf("backwards-compatibility.xsd", configuration);
		compareExpectedAndGenerated(expectedRootFolder, "default/backwards-compatibility.proto", generatedRootFolder, "default/default.proto");
	}

	@Test
	public void compareTestChoiceProtobuf() throws IOException {
		generateProtobufNoOptions("test-choice.xsd");
		compareExpectedAndGenerated(expectedRootFolder, "default/test-choice.proto", generatedRootFolder, "default/default.proto");
	}

	@Test
	public void compareTestDatatypesProtobuf() throws IOException {
		generateProtobufNoOptions("test-datatypes.xsd");
		compareExpectedAndGenerated(expectedRootFolder, "default/test-datatypes.proto", generatedRootFolder, "default/default.proto");
	}

	@Test
	public void compareTestExtensionProtobuf() throws IOException {
		generateProtobufNoOptions("test-extension.xsd");
		compareExpectedAndGenerated(expectedRootFolder, "default/test-extension.proto", generatedRootFolder, "default/default.proto");
	}

	@Test
	public void compareTestExtensionAttributesProtobuf() throws IOException {
		generateProtobufNoOptions("test-extension-attributes.xsd");
		compareExpectedAndGenerated(expectedRootFolder, "default/test-extension-attributes.proto", generatedRootFolder, "default/default.proto");
	}

	@Test
	public void compareTestRangeProtobuf() throws IOException {
		generateProtobufNoOptions("test-range.xsd");
		compareExpectedAndGenerated(expectedRootFolder, "default/test-range.proto", generatedRootFolder, "default/default.proto");
	}

	// @Test
	public void compareXmlRecipemlProtobuf() throws IOException {
		generateProtobufNoOptions("xml-recipeml.xsd");
		compareExpectedAndGenerated(expectedRootFolder, "default/xml-recipeml.proto", generatedRootFolder, "default/default.proto");
	}

	// @Test
	public void compareRecipemlProtobuf() throws IOException {
		generateProtobufNoOptions("recipeml.xsd");
		compareExpectedAndGenerated(expectedRootFolder, "default/recipeml.proto", generatedRootFolder, "default/default.proto");
	}

	@Test
	public void fieldAndMessageRenaming() throws IOException {
		Schema2ProtoConfiguration configuration = new Schema2ProtoConfiguration();
		configuration.customTypeMappings = toMap(
				"^ElementListOriginalNameType$:ElementListNewNameType,^ElementInListOfComplexTypeOriginalName$:ElementInListOfComplexTypeNewName,^ComplexTypeOriginalName$:ComplexTypeNewName,^ElementInListOriginalName$:ElementInListNewName");
		configuration.customNameMappings = toMap(
				"^ElementListOriginalNameType$:ElementListNewNameType,^ElementInListOfComplexTypeOriginalName$:ElementInListOfComplexTypeNewName,^ComplexTypeOriginalName$:ComplexTypeNewName,^ElementInListOriginalName$:ElementInListNewName");
		configuration.forceProtoPackage = "org.myrecipies";
		configuration.inheritanceToComposition = false;

		generateProtobuf("complexTypeRenaming.xsd", configuration);
		compareExpectedAndGenerated(expectedRootFolder, "default/complexTypeRenaming.proto", generatedRootFolder, "org/myrecipies/org_myrecipies.proto");
	}

	private SortedMap<Pattern, String> toMap(String data) {
		Map unsortedMap = Arrays.stream(data.split(","))
				.map(entry -> entry.split(":"))
				.collect(Collectors.toMap(strings -> Pattern.compile(strings[0]), strings -> strings[1]));

		SortedMap<Pattern, String> sortedMap = new TreeMap<>(Comparator.comparing(Pattern::pattern));
		sortedMap.putAll(unsortedMap);
		return sortedMap;
	}

}
