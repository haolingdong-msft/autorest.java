// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.autorest.partialupdate.util;

import com.github.javaparser.ast.AccessSpecifier;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.body.EnumDeclaration;
import org.junit.jupiter.api.Test;


import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static com.github.javaparser.StaticJavaParser.parse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PartialUpdateHandlerTest {

    @Test
    public void testClassOrInterfaceFile_AddMemberToExistingFile() throws IOException, URISyntaxException {
        String existingFileContent = new String(Files.readAllBytes(Paths.get(getClass().getClassLoader().getResource("partialupdate/StringOperationWithAddedMemberClient.java").toURI())));
        String generatedFileContent = new String(Files.readAllBytes(Paths.get(getClass().getClassLoader().getResource("partialupdate/StringOperationGeneratedClient.java").toURI())));

        String output = PartialUpdateHandler.handlePartialUpdateForFile(generatedFileContent, existingFileContent);

        CompilationUnit compilationUnit = parse(output);
        assertEquals(1, compilationUnit.getTypes().size());
        assertEquals(6, compilationUnit.getTypes().get(0).getMembers().size());
        assertEquals(2, compilationUnit.getTypes().get(0).getConstructors().size());
        assertEquals(2, compilationUnit.getTypes().get(0).getFields().size());
        assertEquals(2, compilationUnit.getTypes().get(0).getMethods().size());

        assertEquals(1, compilationUnit.getTypes().get(0).getMethodsByName("addedMethod").size());
        assertTrue(compilationUnit.getTypes().get(0).getFieldByName("enumsClient").isPresent());
        assertEquals(2, compilationUnit.getTypes().get(0).getConstructors().get(1).getParameters().size());

    }

    @Test
    public void testClassOrInterfaceFile_UpdateMethodSignatureToExistingFile() throws URISyntaxException, IOException {
        String existingFileContent = new String(Files.readAllBytes(Paths.get(getClass().getClassLoader().getResource("partialupdate/StringOperationWithUpdateMemberClient.java").toURI())));
        String generatedFileContent = new String(Files.readAllBytes(Paths.get(getClass().getClassLoader().getResource("partialupdate/StringOperationGeneratedClient.java").toURI())));

        String output = PartialUpdateHandler.handlePartialUpdateForFile(generatedFileContent, existingFileContent);

        CompilationUnit compilationUnit = parse(output);
        assertEquals(1, compilationUnit.getTypes().size());
        assertEquals(1, compilationUnit.getTypes().get(0).getMethodsByName("putNullWithResponse").size());
        assertEquals(2, compilationUnit.getTypes().get(0).getMethodsByName("putNullWithResponse").get(0).getParameters().size());
        assertEquals("test", compilationUnit.getTypes().get(0).getMethodsByName("putNullWithResponse").get(0).getParameters().get(1).getName().asString());
        assertEquals(AccessSpecifier.NONE, compilationUnit.getTypes().get(0).getMethodsByName("putNullWithResponse").get(0).getAccessSpecifier());
    }

    @Test
    public void testClassOrInterfaceFile_RemoveMethodToExistingFile() throws URISyntaxException, IOException {
        String existingFileContent = new String(Files.readAllBytes(Paths.get(getClass().getClassLoader().getResource("partialupdate/StringOperationWithRemovedMemberGeneratedClient.java").toURI())));
        String generatedFileContent = new String(Files.readAllBytes(Paths.get(getClass().getClassLoader().getResource("partialupdate/StringOperationGeneratedClient.java").toURI())));

        String output = PartialUpdateHandler.handlePartialUpdateForFile(generatedFileContent, existingFileContent);

        CompilationUnit compilationUnit = parse(output);
        assertEquals(1, compilationUnit.getTypes().size());
        // method is re-generated again
        assertEquals(1, compilationUnit.getTypes().get(0).getMethods().size());
        assertEquals(1, compilationUnit.getTypes().get(0).getMethodsByName("putNullWithResponse").size());
    }


    @Test
    public void testClassOrInterfaceFile_SawaggerAddAPI() throws URISyntaxException, IOException {
        String existingFileContent = new String(Files.readAllBytes(Paths.get(getClass().getClassLoader().getResource("partialupdate/StringOperationGeneratedClient.java").toURI())));
        String generatedFileContent = new String(Files.readAllBytes(Paths.get(getClass().getClassLoader().getResource("partialupdate/StringOperationWithAddedMemberGeneratedClient.java").toURI())));

        String output = PartialUpdateHandler.handlePartialUpdateForFile(generatedFileContent, existingFileContent);

        CompilationUnit compilationUnit = parse(output);
        assertEquals(1, compilationUnit.getTypes().size());
        assertEquals(2, compilationUnit.getTypes().get(0).getMethods().size());
        assertEquals(1, compilationUnit.getTypes().get(0).getMethodsByName("getWhitespaceWithResponse").size());
    }

    @Test
    public void testClassOrInterfaceFile_GeneratedFileRemoveAPI() throws URISyntaxException, IOException {
        String existingFileContent = new String(Files.readAllBytes(Paths.get(getClass().getClassLoader().getResource("partialupdate/StringOperationGeneratedClient.java").toURI())));
        String generatedFileContent = new String(Files.readAllBytes(Paths.get(getClass().getClassLoader().getResource("partialupdate/StringOperationWithRemovedMemberGeneratedClient.java").toURI())));

        String output = PartialUpdateHandler.handlePartialUpdateForFile(generatedFileContent, existingFileContent);

        CompilationUnit compilationUnit = parse(output);
        assertEquals(1, compilationUnit.getTypes().size());
        assertEquals(0, compilationUnit.getTypes().get(0).getMethods().size());
    }

    @Test
    public void testClassOrInterfaceFile_GeneratedFileUpdateAPI() throws URISyntaxException, IOException {
        String existingFileContent = new String(Files.readAllBytes(Paths.get(getClass().getClassLoader().getResource("partialupdate/StringOperationGeneratedClient.java").toURI())));
        String generatedFileContent = new String(Files.readAllBytes(Paths.get(getClass().getClassLoader().getResource("partialupdate/StringOperationWithUpdateMemberGeneratedClient.java").toURI())));

        String output = PartialUpdateHandler.handlePartialUpdateForFile(generatedFileContent, existingFileContent);

        CompilationUnit compilationUnit = parse(output);
        assertEquals(1, compilationUnit.getTypes().size());
        assertEquals(1, compilationUnit.getTypes().get(0).getMethods().size());
        assertEquals(1, compilationUnit.getTypes().get(0).getMethodsByName("putNullWithResponse").size());
        assertEquals("updateParam", compilationUnit.getTypes().get(0).getMethodsByName("putNullWithResponse").get(0).getParameter(1).getName().asString());
    }

    @Test
    public void testClassOrInterfaceFile_GeneratedFileUpdateAPIAndExistingFileUpdateMethod() throws URISyntaxException, IOException {
        String existingFileContent = new String(Files.readAllBytes(Paths.get(getClass().getClassLoader().getResource("partialupdate/StringOperationWithUpdateMemberClient.java").toURI())));
        String generatedFileContent = new String(Files.readAllBytes(Paths.get(getClass().getClassLoader().getResource("partialupdate/StringOperationWithUpdateMemberGeneratedClient.java").toURI())));

        String output = PartialUpdateHandler.handlePartialUpdateForFile(generatedFileContent, existingFileContent);

        CompilationUnit compilationUnit = parse(output);
        assertEquals(1, compilationUnit.getTypes().size());
        assertEquals(1, compilationUnit.getTypes().get(0).getMethods().size());
        assertEquals(1, compilationUnit.getTypes().get(0).getMethodsByName("putNullWithResponse").size());
        assertEquals("test", compilationUnit.getTypes().get(0).getMethodsByName("putNullWithResponse").get(0).getParameter(1).getName().asString());
        assertEquals(AccessSpecifier.NONE, compilationUnit.getTypes().get(0).getMethodsByName("putNullWithResponse").get(0).getAccessSpecifier());
    }

    @Test
    public void testClassOrInterfaceFile_GeneratedFileRemoveAPIAndExistingFileUpdateMethod() throws URISyntaxException, IOException {
        String existingFileContent = new String(Files.readAllBytes(Paths.get(getClass().getClassLoader().getResource("partialupdate/StringOperationWithUpdateMemberClient.java").toURI())));
        String generatedFileContent = new String(Files.readAllBytes(Paths.get(getClass().getClassLoader().getResource("partialupdate/StringOperationWithRemovedMemberGeneratedClient.java").toURI())));

        String output = PartialUpdateHandler.handlePartialUpdateForFile(generatedFileContent, existingFileContent);

        CompilationUnit compilationUnit = parse(output);
        assertEquals(1, compilationUnit.getTypes().size());
        assertEquals(1, compilationUnit.getTypes().get(0).getMethods().size());
        assertEquals(1, compilationUnit.getTypes().get(0).getMethodsByName("putNullWithResponse").size());
        assertEquals("test", compilationUnit.getTypes().get(0).getMethodsByName("putNullWithResponse").get(0).getParameter(1).getName().asString());
    }

    @Test
    public void testClassOrInterfaceFile_WhenGeneratedFileHasSameNameButDifferentSignatureWithExistingGeneratedMethod_ThenShouldIncludeThisSameNameMethod() throws URISyntaxException, IOException {
        String existingFileContent = new String(Files.readAllBytes(Paths.get(getClass().getClassLoader().getResource("partialupdate/PagedGeneratedAsyncClient.java").toURI())));
        String generatedFileContent = new String(Files.readAllBytes(Paths.get(getClass().getClassLoader().getResource("partialupdate/PagedGeneratedAsyncClientWithConvenienceMethod.java").toURI())));

        String output = PartialUpdateHandler.handlePartialUpdateForFile(generatedFileContent, existingFileContent);

        CompilationUnit compilationUnit = parse(output);
        assertEquals(1, compilationUnit.getTypes().size());
        assertEquals(4, compilationUnit.getTypes().get(0).getMembers().size());
        assertEquals(1, compilationUnit.getTypes().get(0).getConstructors().size());
        assertEquals(1, compilationUnit.getTypes().get(0).getFields().size());
        assertEquals(2, compilationUnit.getTypes().get(0).getMethods().size());

        assertEquals(2, compilationUnit.getTypes().get(0).getMethodsByName("list").size());
    }

    @Test
    public void testClassOrInterfaceFile_WhenNoChangesAreMadeOnNextGeneration_ThenTheFileShouldStaySame() throws URISyntaxException, IOException {
        String existingFileContent = new String(Files.readAllBytes(Paths.get(getClass().getClassLoader().getResource("partialupdate/PagedGeneratedAsyncClientWithConvenienceMethod.java").toURI())));
        String generatedFileContent = new String(Files.readAllBytes(Paths.get(getClass().getClassLoader().getResource("partialupdate/PagedGeneratedAsyncClientWithConvenienceMethod.java").toURI())));

        String output = PartialUpdateHandler.handlePartialUpdateForFile(generatedFileContent, existingFileContent);

        CompilationUnit compilationUnit = parse(output);
        assertEquals(1, compilationUnit.getTypes().size());
        assertEquals(4, compilationUnit.getTypes().get(0).getMembers().size());
        assertEquals(1, compilationUnit.getTypes().get(0).getConstructors().size());
        assertEquals(1, compilationUnit.getTypes().get(0).getFields().size());
        assertEquals(2, compilationUnit.getTypes().get(0).getMethods().size());

        assertEquals(2, compilationUnit.getTypes().get(0).getMethodsByName("list").size());
    }

    @Test
    public void testClassOrInterfaceFile_VerifyGeneratedFileShouldNotContainDuplicateMethods() throws URISyntaxException, IOException {
        String existingFileContent = new String(Files.readAllBytes(Paths.get(getClass().getClassLoader().getResource("partialupdate/StringOperationWithDuplicateMethodGeneratedClient.java").toURI())));
        String generatedFileContent = new String(Files.readAllBytes(Paths.get(getClass().getClassLoader().getResource("partialupdate/StringOperationWithDuplicateMethodGeneratedClient.java").toURI())));

        Exception exception = assertThrows(RuntimeException.class, () -> {
            PartialUpdateHandler.handlePartialUpdateForFile(generatedFileContent, existingFileContent);
        });

        String expectedMessage = "Found duplicate methods in the generated file.";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));

    }
    @Test
    public void testModuleInfoFile_WhenGeneratedFileEqualsExistingFile_ThenUseGeneratedFile() {
        String existingFileContent = "// Copyright (c) Microsoft Corporation. All rights reserved.\n" +
                "// Licensed under the MIT License.\n" +
                "// Code generated by Microsoft (R) AutoRest Code Generator.\n" +
                "\n" +
                "module com.azure.iot.deviceupdate {\n" +
                "\n" +
                "    requires transitive com.azure.core;\n" +
                "\n" +
                "    exports com.azure.iot.deviceupdate;\n" +
                "}\n";
        String generatedFileContent = "// Copyright (c) Microsoft Corporation. All rights reserved.\n" +
                "// Licensed under the MIT License.\n" +
                "// Code generated by Microsoft (R) AutoRest Code Generator.\n" +
                "\n" +
                "module com.azure.iot.deviceupdate {\n" +
                "\n" +
                "    requires transitive com.azure.core;\n" +
                "\n" +
                "    exports com.azure.iot.deviceupdate;\n" +
                "}\n";

        String output = PartialUpdateHandler.handlePartialUpdateForFile(generatedFileContent, existingFileContent);

        CompilationUnit compilationUnit = parse(output);
        assertEquals(true, compilationUnit.getModule().isPresent());
        assertEquals("com.azure.iot.deviceupdate", compilationUnit.getModule().get().getName().toString());
        assertEquals(2, compilationUnit.getModule().get().getDirectives().size());
    }

    @Test
    public void testModuleInfoFile_WhenExistingFileHasUpdates_ThenUseExistingFile() {
        String existingFileContent = "// Copyright (c) Microsoft Corporation. All rights reserved.\n" +
                "// Licensed under the MIT License.\n" +
                "// Code generated by Microsoft (R) AutoRest Code Generator.\n" +
                "\n" +
                "\n" +
                "module com.azure.messaging.webpubsubnew {\n" +
                "    requires transitive com.azure.core;\n" +
                "\n" +
                "    exports com.azure.messaging.webpubsubnew;\n" +
                "    exports com.azure.messaging.webpubsubnew.models;\n" +
                "}";
        String generatedFileContent = "// Copyright (c) Microsoft Corporation. All rights reserved.\n" +
                "// Licensed under the MIT License.\n" +
                "// Code generated by Microsoft (R) AutoRest Code Generator.\n" +
                "\n" +
                "\n" +
                "module com.azure.messaging.webpubsubnew {\n" +
                "    requires transitive com.azure.core;\n" +
                "\n" +
                "    exports com.azure.messaging.webpubsubnew;\n" +
                "}";

        String output = PartialUpdateHandler.handlePartialUpdateForFile(generatedFileContent, existingFileContent);

        CompilationUnit compilationUnit = parse(output);
        assertNotNull(compilationUnit.getOrphanComments());
        assertEquals(3, compilationUnit.getOrphanComments().size());
        assertEquals(true, compilationUnit.getModule().isPresent());
        assertEquals("com.azure.messaging.webpubsubnew", compilationUnit.getModule().get().getName().toString());
        assertEquals(3, compilationUnit.getModule().get().getDirectives().size());
    }

    @Test
    public void testModuleInfoFile_MergeExistingFileAndGeneratedFile_WhenExistingFileContentHasMoreDirectives() {
        String existingFileContent = "// Copyright (c) Microsoft Corporation. All rights reserved.\n" +
                "// Licensed under the MIT License.\n" +
                "// Code generated by Microsoft (R) AutoRest Code Generator.\n" +
                "module com.azure.messaging.webpubsubnew {\n" +
                "    requires transitive com.azure.core;\n" +
                "\n" +
                "    exports com.azure.messaging.webpubsubnew;\n" +
                "    exports com.azure.messaging.webpubsubnew.models;\n" +
                "}";
        String generatedFileContent = "// Copyright (c) Microsoft Corporation. All rights reserved.\n" +
                "// Licensed under the MIT License.\n" +
                "// Code generated by Microsoft (R) AutoRest Code Generator.\n" +
                "module com.azure.messaging.webpubsubnew {\n" +
                "    requires transitive com.azure.core;\n" +
                "\n" +
                "    exports com.azure.messaging.webpubsubnew;\n" +
                "}";
        String output = PartialUpdateHandler.handlePartialUpdateForFile(generatedFileContent, existingFileContent);

        CompilationUnit compilationUnit = parse(output);
        assertEquals(true, compilationUnit.getModule().isPresent());
        assertEquals("com.azure.messaging.webpubsubnew", compilationUnit.getModule().get().getName().toString());
        assertEquals(3, compilationUnit.getModule().get().getDirectives().size());
        assertEquals("requires transitive com.azure.core;", compilationUnit.getModule().get().getDirectives().get(0).asModuleRequiresDirective().getTokenRange().get().toString());
        assertEquals("exports com.azure.messaging.webpubsubnew;", compilationUnit.getModule().get().getDirectives().get(1).asModuleExportsDirective().getTokenRange().get().toString());
        assertEquals("exports com.azure.messaging.webpubsubnew.models;", compilationUnit.getModule().get().getDirectives().get(2).asModuleExportsDirective().getTokenRange().get().toString());

    }

    @Test
    public void testModuleInfoFile_MergeExistingFileAndGeneratedFile_WhenGeneratedFileContentHasMoreDirectives() {
        String existingFileContent = "module com.azure.communication.phonenumbersdemo {\n" +
                "    requires transitive com.azure.core;\n" +
                "\n" +
                "    exports com.azure.communication.phonenumbersdemo;\n" +
                "}";
        String generatedFileContent = "" +
                "module com.azure.communication.phonenumbersdemo {\n" +
                "    requires transitive com.azure.core;\n" +
                "\n" +
                "    exports com.azure.communication.phonenumbersdemo;\n" +
                "    exports com.azure.communication.phonenumbersdemo.models;\n" +
                "\n" +
                "    opens com.azure.communication.phonenumbersdemo.implementation.models to\n" +
                "            com.azure.core,\n" +
                "            com.fasterxml.jackson.databind;\n" +
                "    opens com.azure.communication.phonenumbersdemo.models to\n" +
                "            com.azure.core,\n" +
                "            com.fasterxml.jackson.databind;\n" +
                "}";
        String output = PartialUpdateHandler.handlePartialUpdateForFile(generatedFileContent, existingFileContent);

        CompilationUnit compilationUnit = parse(output);
        assertEquals(true, compilationUnit.getModule().isPresent());
        assertEquals("com.azure.communication.phonenumbersdemo", compilationUnit.getModule().get().getName().toString());
        assertEquals(5, compilationUnit.getModule().get().getDirectives().size());
        assertEquals("requires transitive com.azure.core;", compilationUnit.getModule().get().getDirectives().get(0).asModuleRequiresDirective().getTokenRange().get().toString());
        assertEquals("exports com.azure.communication.phonenumbersdemo;", compilationUnit.getModule().get().getDirectives().get(1).asModuleExportsDirective().getTokenRange().get().toString());
        assertEquals("exports com.azure.communication.phonenumbersdemo.models;", compilationUnit.getModule().get().getDirectives().get(2).asModuleExportsDirective().getTokenRange().get().toString());
        assertEquals("opens com.azure.communication.phonenumbersdemo.implementation.models to com.azure.core, com.fasterxml.jackson.databind;", compilationUnit.getModule().get().getDirectives().get(3).asModuleOpensDirective().getTokenRange().get().toString());
        assertEquals("opens com.azure.communication.phonenumbersdemo.models to com.azure.core, com.fasterxml.jackson.databind;", compilationUnit.getModule().get().getDirectives().get(4).asModuleOpensDirective().getTokenRange().get().toString());
    }

    @Test
    public void testModuleInfoFile_MergeExistingFileAndGeneratedFile_WhenExistingAndGeneratedFileHasSameContent() {
        String existingFileContent = "module com.azure.communication.phonenumbersdemo {\n" +
                "    requires transitive com.azure.core;\n" +
                "\n" +
                "    exports com.azure.communication.phonenumbersdemo;\n" +
                "    exports com.azure.communication.phonenumbersdemo.models;\n" +
                "\n" +
                "    opens com.azure.communication.phonenumbersdemo.implementation.models to\n" +
                "            com.azure.core,\n" +
                "            com.fasterxml.jackson.databind;\n" +
                "    opens com.azure.communication.phonenumbersdemo.models to\n" +
                "            com.azure.core,\n" +
                "            com.fasterxml.jackson.databind;\n" +
                "}";
        String generatedFileContent =
                "module com.azure.communication.phonenumbersdemo {\n" +
                        "    requires transitive com.azure.core;\n" +
                        "\n" +
                        "    exports com.azure.communication.phonenumbersdemo;\n" +
                        "    exports com.azure.communication.phonenumbersdemo.models;\n" +
                        "\n" +
                        "    opens com.azure.communication.phonenumbersdemo.implementation.models to\n" +
                        "            com.azure.core,\n" +
                        "            com.fasterxml.jackson.databind;\n" +
                        "    opens com.azure.communication.phonenumbersdemo.models to\n" +
                        "            com.azure.core,\n" +
                        "            com.fasterxml.jackson.databind;\n" +
                        "}";
        String output = PartialUpdateHandler.handlePartialUpdateForFile(generatedFileContent, existingFileContent);

        CompilationUnit compilationUnit = parse(output);
        assertEquals(true, compilationUnit.getModule().isPresent());
        assertEquals("com.azure.communication.phonenumbersdemo", compilationUnit.getModule().get().getName().toString());
        assertEquals(5, compilationUnit.getModule().get().getDirectives().size());
        assertEquals("requires transitive com.azure.core;", compilationUnit.getModule().get().getDirectives().get(0).asModuleRequiresDirective().getTokenRange().get().toString());
        assertEquals("exports com.azure.communication.phonenumbersdemo;", compilationUnit.getModule().get().getDirectives().get(1).asModuleExportsDirective().getTokenRange().get().toString());
        assertEquals("exports com.azure.communication.phonenumbersdemo.models;", compilationUnit.getModule().get().getDirectives().get(2).asModuleExportsDirective().getTokenRange().get().toString());
        assertEquals("opens com.azure.communication.phonenumbersdemo.implementation.models to com.azure.core, com.fasterxml.jackson.databind;", compilationUnit.getModule().get().getDirectives().get(3).asModuleOpensDirective().getTokenRange().get().toString());
        assertEquals("opens com.azure.communication.phonenumbersdemo.models to com.azure.core, com.fasterxml.jackson.databind;", compilationUnit.getModule().get().getDirectives().get(4).asModuleOpensDirective().getTokenRange().get().toString());
    }

    @Test
    public void testModuleInfoFile_MergeExistingFileAndGeneratedFile_IgnoreEmptyLineAndWhiteSpace() {
        String existingFileContent = "module com.azure.communication.phonenumbersdemo {\n" +
                "    requires transitive com.azure.core;\n" +
                "\n" +
                "\n" +
                "    exports      com.azure.communication.phonenumbersdemo;     \n" +
                "    exports com.azure.communication.phonenumbersdemo.models;\n" +
                "\n" +
                "}";
        String generatedFileContent =
                "module com.azure.communication.phonenumbersdemo {\n" +
                        "    requires transitive com.azure.core;\n" +
                        "\n" +
                        "    exports com.azure.communication.phonenumbersdemo;\n" +
                        "    exports com.azure.communication.phonenumbersdemo.models;\n" +
                        "\n" +
                        "}";
        String output = PartialUpdateHandler.handlePartialUpdateForFile(generatedFileContent, existingFileContent);

        CompilationUnit compilationUnit = parse(output);
        assertEquals(true, compilationUnit.getModule().isPresent());
        assertEquals("com.azure.communication.phonenumbersdemo", compilationUnit.getModule().get().getName().toString());
        assertEquals(3, compilationUnit.getModule().get().getDirectives().size());
        assertEquals("requires transitive com.azure.core;", compilationUnit.getModule().get().getDirectives().get(0).asModuleRequiresDirective().getTokenRange().get().toString());
        assertEquals("exports com.azure.communication.phonenumbersdemo;", compilationUnit.getModule().get().getDirectives().get(1).asModuleExportsDirective().getTokenRange().get().toString());
        assertEquals("exports com.azure.communication.phonenumbersdemo.models;", compilationUnit.getModule().get().getDirectives().get(2).asModuleExportsDirective().getTokenRange().get().toString());
    }


    @Test
    public void testEnumFile() throws URISyntaxException, IOException {
        String existingFileContent = new String(Files.readAllBytes(Paths.get(getClass().getClassLoader().getResource("partialupdate/Color.java").toURI())));
        String generatedFileContent = new String(Files.readAllBytes(Paths.get(getClass().getClassLoader().getResource("partialupdate/ColorGenerated.java").toURI())));

        String output = PartialUpdateHandler.handlePartialUpdateForFile(generatedFileContent, existingFileContent);

        CompilationUnit compilationUnit = parse(output);
        EnumDeclaration enumDeclaration = compilationUnit.getTypes().get(0).asEnumDeclaration();
        // assertions for enum values with correct order
        assertEquals(6, enumDeclaration.getEntries().size());
        assertEquals("WHITE", enumDeclaration.getEntries().get(0).getName().getIdentifier());
        assertEquals(0, enumDeclaration.getEntries().get(0).getAnnotations().size());
        assertEquals("RED", enumDeclaration.getEntries().get(1).getName().getIdentifier());
        assertEquals(1, enumDeclaration.getEntries().get(1).getAnnotations().size());
        assertEquals("BLACK", enumDeclaration.getEntries().get(2).getName().getIdentifier());
        assertEquals(0, enumDeclaration.getEntries().get(2).getAnnotations().size());
        assertEquals("BLUE", enumDeclaration.getEntries().get(3).getName().getIdentifier());
        assertEquals(1, enumDeclaration.getEntries().get(3).getAnnotations().size());
        assertEquals("GREEN", enumDeclaration.getEntries().get(4).getName().getIdentifier());
        assertEquals(1, enumDeclaration.getEntries().get(4).getAnnotations().size());
        assertEquals("YELLOW", enumDeclaration.getEntries().get(5).getName().getIdentifier());
        assertEquals(0, enumDeclaration.getEntries().get(5).getAnnotations().size());

        // assertions for enum methods
        assertEquals(1, enumDeclaration.getMethodsByName("addMethod").size());
        assertFalse(enumDeclaration.getMethodsByName("addMethod").get(0).getAnnotations().stream().anyMatch(annotationExpr -> annotationExpr.getName().toString().equals("Generated")));
        assertEquals(1, enumDeclaration.getMethodsByName("fromString").size());
        assertFalse(enumDeclaration.getMethodsByName("fromString").get(0).getAnnotations().stream().anyMatch(annotationExpr -> annotationExpr.getName().toString().equals("Generated")));
    }


}