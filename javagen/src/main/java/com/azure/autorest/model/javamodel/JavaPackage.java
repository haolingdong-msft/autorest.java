// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.autorest.model.javamodel;

import com.azure.autorest.extension.base.plugin.JavaSettings;
import com.azure.autorest.extension.base.plugin.NewPlugin;
import com.azure.autorest.extension.base.plugin.PluginLogger;
import com.azure.autorest.model.clientmodel.AsyncSyncClient;
import com.azure.autorest.model.clientmodel.ClientBuilder;
import com.azure.autorest.model.clientmodel.ClientException;
import com.azure.autorest.model.clientmodel.ClientModel;
import com.azure.autorest.model.clientmodel.ClientResponse;
import com.azure.autorest.model.clientmodel.EnumType;
import com.azure.autorest.model.clientmodel.Manager;
import com.azure.autorest.model.clientmodel.MethodGroupClient;
import com.azure.autorest.model.clientmodel.ModuleInfo;
import com.azure.autorest.model.clientmodel.PackageInfo;
import com.azure.autorest.model.clientmodel.PageDetails;
import com.azure.autorest.model.clientmodel.Pom;
import com.azure.autorest.model.clientmodel.ProtocolExample;
import com.azure.autorest.model.clientmodel.ServiceClient;
import com.azure.autorest.model.clientmodel.ServiceVersion;
import com.azure.autorest.model.clientmodel.TestContext;
import com.azure.autorest.model.clientmodel.XmlSequenceWrapper;
import com.azure.autorest.model.projectmodel.Project;
import com.azure.autorest.model.projectmodel.TextFile;
import com.azure.autorest.model.xmlmodel.XmlFile;
import com.azure.autorest.template.ChangelogTemplate;
import com.azure.autorest.template.ModelTestTemplate;
import com.azure.autorest.template.ProtocolSampleBlankTemplate;
import com.azure.autorest.template.ProtocolTestBaseTemplate;
import com.azure.autorest.template.ProtocolTestTemplate;
import com.azure.autorest.template.ReadmeTemplate;
import com.azure.autorest.template.ServiceSyncClientTemplate;
import com.azure.autorest.template.SwaggerReadmeTemplate;
import com.azure.autorest.template.Templates;
import org.slf4j.Logger;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class JavaPackage {
    private final Logger logger;

    private final JavaSettings settings;
    private final List<JavaFile> javaFiles;
    private final List<XmlFile> xmlFiles;
    protected final List<TextFile> textFiles = new ArrayList<>();

    private final JavaFileFactory javaFileFactory;

    private final Set<String> filePaths = new HashSet<>();

    public JavaPackage(NewPlugin host) {
        this.settings = JavaSettings.getInstance();
        this.javaFiles = new ArrayList<>();
        this.xmlFiles = new ArrayList<>();
        this.javaFileFactory = new JavaFileFactory(settings);
        this.logger = new PluginLogger(host, JavaPackage.class);
    }

    protected JavaFileFactory getJavaFileFactory() {
        return javaFileFactory;
    }

    public List<JavaFile> getJavaFiles() {
        return javaFiles;
    }

    public List<XmlFile> getXmlFiles() {
        return xmlFiles;
    }

    public List<TextFile> getTextFiles() {
        return textFiles;
    }

    public final void addManager(String package_Keyword, String name, Manager model) {
        JavaFile javaFile = javaFileFactory.createSourceFile(package_Keyword, name);
        Templates.getManagerTemplate().write(model, javaFile);
        addJavaFile(javaFile);
    }

    public final void addServiceClient(String package_Keyword, String name, ServiceClient model) {
        JavaFile javaFile = javaFileFactory.createSourceFile(package_Keyword, name);
        Templates.getServiceClientTemplate().write(model, javaFile);
        addJavaFile(javaFile);
    }

    public final void addAsyncServiceClient(String packageKeyWord, AsyncSyncClient asyncClient) {
        JavaFile javaFile = javaFileFactory.createSourceFile(packageKeyWord, asyncClient.getClassName());
        Templates.getServiceAsyncClientTemplate().write(asyncClient, javaFile);
        addJavaFile(javaFile);
    }

    public final void addSyncServiceClient(String packageKeyWord, AsyncSyncClient syncClient) {
        JavaFile javaFile = javaFileFactory.createSourceFile(packageKeyWord, syncClient.getClassName());
        Templates.getServiceSyncClientTemplate().write(syncClient, javaFile);
        addJavaFile(javaFile);
    }

    public final void addSyncServiceClient(String packageKeyWord, AsyncSyncClient syncClient, boolean syncClientWrapAsync) {
        JavaFile javaFile = javaFileFactory.createSourceFile(packageKeyWord, syncClient.getClassName());
        ServiceSyncClientTemplate template = syncClientWrapAsync
                ? Templates.getServiceSyncClientWrapAsyncClientTemplate()
                : Templates.getServiceSyncClientTemplate();
        template.write(syncClient, javaFile);
        addJavaFile(javaFile);
    }

    public final void addServiceClientInterface(String name, ServiceClient model) {
        JavaFile javaFile = javaFileFactory.createSourceFile(settings.getPackage(), name);
        Templates.getServiceClientInterfaceTemplate().write(model, javaFile);
        addJavaFile(javaFile);
    }

    public final void addServiceClientInterface(String package_Keyword, String name, ServiceClient model) {
        JavaFile javaFile = javaFileFactory.createSourceFile(package_Keyword, name);
        Templates.getServiceClientInterfaceTemplate().write(model, javaFile);
        addJavaFile(javaFile);
    }

    public final void addServiceClientBuilder(ClientBuilder model) {
        JavaFile javaFile = javaFileFactory.createSourceFile(model.getPackageName(), model.getClassName());
        Templates.getServiceClientBuilderTemplate().write(model, javaFile);
        addJavaFile(javaFile);
    }

    public final void addServiceVersion(String package_Keyword, ServiceVersion serviceVersion) {
        JavaFile javaFile = javaFileFactory.createSourceFile(package_Keyword, serviceVersion.getClassName());
        Templates.getServiceVersionTemplate().write(serviceVersion, javaFile);
        addJavaFile(javaFile);
    }

    public final void addMethodGroup(String package_Keyword, String name, MethodGroupClient model) {
        JavaFile javaFile = javaFileFactory.createSourceFile(package_Keyword, name);
        Templates.getMethodGroupTemplate().write(model, javaFile);
        addJavaFile(javaFile);
    }

    public final void addMethodGroupInterface(String name, MethodGroupClient model) {
        JavaFile javaFile = javaFileFactory.createSourceFile(settings.getPackage(), name);
        Templates.getMethodGroupInterfaceTemplate().write(model, javaFile);
        addJavaFile(javaFile);
    }

    public final void addMethodGroupInterface(String package_Keyword, String name, MethodGroupClient model) {
        JavaFile javaFile = javaFileFactory.createSourceFile(package_Keyword, name);
        Templates.getMethodGroupInterfaceTemplate().write(model, javaFile);
        addJavaFile(javaFile);
    }

    public final void addModel(String package_Keyword, String name, ClientModel model) {
        JavaFile javaFile = javaFileFactory.createSourceFile(package_Keyword, name);
        Templates.getModelTemplate().write(model, javaFile);
        addJavaFile(javaFile);
    }

    public final void addException(String package_Keyword, String name, ClientException model) {
        JavaFile javaFile = javaFileFactory.createSourceFile(package_Keyword, name);
        Templates.getExceptionTemplate().write(model, javaFile);
        addJavaFile(javaFile);
    }

    public final void addEnum(String package_Keyword, String name, EnumType model) {
        JavaFile javaFile = javaFileFactory.createSourceFile(package_Keyword, name);
        Templates.getEnumTemplate().write(model, javaFile);
        addJavaFile(javaFile);
    }

    public final void addPage(String package_Keyword, String name, PageDetails model) {
        JavaFile javaFile = javaFileFactory.createSourceFile(package_Keyword, name);
        Templates.getPageTemplate().write(model, javaFile);
        addJavaFile(javaFile);
    }

    public final void addClientResponse(String package_Keyword, String name, ClientResponse model) {
        JavaFile javaFile = javaFileFactory.createSourceFile(package_Keyword, name);
        Templates.getResponseTemplate().write(model, javaFile);
        addJavaFile(javaFile);
    }

    public final void addXmlSequenceWrapper(String package_Keyword, String name, XmlSequenceWrapper model) {
        JavaFile javaFile = javaFileFactory.createSourceFile(package_Keyword, name);
        Templates.getXmlSequenceWrapperTemplate().write(model, javaFile);
        addJavaFile(javaFile);
    }

    public final void addPackageInfo(String package_Keyword, String name, PackageInfo model) {
        JavaFile javaFile = javaFileFactory.createEmptySourceFile(package_Keyword, name);
        Templates.getPackageInfoTemplate().write(model, javaFile);
        addJavaFile(javaFile);
    }

    public final void addModuleInfo(ModuleInfo moduleInfo) {
        JavaFile javaFile = javaFileFactory.createEmptySourceFile("", "module-info");
        Templates.getModuleInfoTemplate().write(moduleInfo, javaFile);
        addJavaFile(javaFile);
    }

    public final void addPom(String name, Pom pom) {
        XmlFile xmlFile = new XmlFile(name, new XmlFile.Options().setIndent(2));
        Templates.getPomTemplate().write(pom, xmlFile);
        this.checkDuplicateFile(xmlFile.getFilePath());
        xmlFiles.add(xmlFile);
    }
    
    protected void addJavaFile(JavaFile javaFile) {
        this.checkDuplicateFile(javaFile.getFilePath());
        filePaths.add(javaFile.getFilePath());
        javaFiles.add(javaFile);
    }

    public void addProtocolExamples(ProtocolExample protocolExample) {
        JavaFile javaFile = javaFileFactory.createSampleFile(settings.getPackage("generated"), protocolExample.getFilename());
        Templates.getProtocolSampleTemplate().write(protocolExample, javaFile);
        this.checkDuplicateFile(javaFile.getFilePath());
        javaFiles.add(javaFile);
    }

    public void addProtocolExamplesBlank() {
        JavaFile javaFile = javaFileFactory.createSampleFile(settings.getPackage(), "ReadmeSamples");
        new ProtocolSampleBlankTemplate().write(null, javaFile);
        this.checkDuplicateFile(javaFile.getFilePath());
        javaFiles.add(javaFile);
    }

    public void addProtocolTestBase(TestContext testContext) {
        JavaFile javaFile = javaFileFactory.createTestFile(testContext.getPackageName(), testContext.getTestBaseClassName());
        ProtocolTestBaseTemplate.getInstance().write(testContext, javaFile);
        this.checkDuplicateFile(javaFile.getFilePath());
        javaFiles.add(javaFile);
    }

    public void addProtocolTest(TestContext testContext) {
        String className = testContext.getTestCase().getFilename() + "Tests";
        JavaFile javaFile = javaFileFactory.createTestFile(testContext.getPackageName(), className);
        ProtocolTestTemplate.getInstance().write(testContext, javaFile);
        this.checkDuplicateFile(javaFile.getFilePath());
        javaFiles.add(javaFile);
    }

    public void addModelUnitTest(ClientModel model) {
        String className = model.getName() + "Tests";
        JavaFile javaFile = javaFileFactory.createTestFile(JavaSettings.getInstance().getPackage("generated"), className);
        ModelTestTemplate.getInstance().write(model, javaFile);
        this.checkDuplicateFile(javaFile.getFilePath());
        javaFiles.add(javaFile);
    }

    public void addReadmeMarkdown(Project project) {
        TextFile textFile = new TextFile("README.md", new ReadmeTemplate().write(project));
        this.checkDuplicateFile(textFile.getFilePath());
        textFiles.add(textFile);
    }

    public void addSwaggerReadmeMarkdown(Project project) {
        TextFile textFile = new TextFile("swagger/README_SPEC.md", new SwaggerReadmeTemplate().write(project));
        this.checkDuplicateFile(textFile.getFilePath());
        textFiles.add(textFile);
    }

    public void addChangelogMarkdown(Project project) {
        TextFile textFile = new TextFile("CHANGELOG.md", new ChangelogTemplate().write(project));
        this.checkDuplicateFile(textFile.getFilePath());
        textFiles.add(textFile);
    }

    protected void checkDuplicateFile(String filePath) {
        if (filePaths.contains(filePath)) {
//            throw new IllegalStateException(String.format("Name conflict for output file '%1$s'.", filePath));
            logger.warn(String.format("Name conflict for output file '%1$s'.", filePath));
        }
    }
}
