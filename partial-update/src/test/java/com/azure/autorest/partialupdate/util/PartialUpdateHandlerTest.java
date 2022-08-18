package com.azure.autorest.partialupdate.util;

import junit.framework.TestCase;
import org.junit.Test;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class PartialUpdateHandlerTest extends TestCase {

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
        assertEquals(AccessSpecifier.PACKAGE_PRIVATE, compilationUnit.getTypes().get(0).getMethodsByName("putNullWithResponse").get(0).getAccessSpecifier());
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
        assertEquals(AccessSpecifier.PACKAGE_PRIVATE, compilationUnit.getTypes().get(0).getMethodsByName("putNullWithResponse").get(0).getAccessSpecifier());
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

}