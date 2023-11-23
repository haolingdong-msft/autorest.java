// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.autorest.template;

import com.azure.autorest.extension.base.plugin.JavaSettings;
import com.azure.autorest.model.clientmodel.ClientModel;
import com.azure.autorest.model.javamodel.JavaClass;
import com.azure.autorest.model.javamodel.JavaFile;
import com.azure.autorest.model.javamodel.JavaVisibility;
import com.azure.autorest.util.ClientModelUtil;
import com.azure.autorest.util.CodeNamer;
import com.azure.autorest.util.TemplateUtil;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class JsonMergePatchHelperTemplate implements IJavaTemplate<List<ClientModel>, JavaFile>{

    private static final JsonMergePatchHelperTemplate INSTANCE = new JsonMergePatchHelperTemplate();

    protected JsonMergePatchHelperTemplate() {
    }

    public static JsonMergePatchHelperTemplate getInstance() {
        return INSTANCE;
    }

    @Override
    public void write(List<ClientModel> models, JavaFile javaFile) {
        // imports
        JavaSettings settings = JavaSettings.getInstance();
        Set<String> imports = new HashSet<>();
        addImports(imports, models, settings);
        javaFile.declareImport(imports);


        javaFile.publicClass(null, TemplateUtil.JSON_MERGE_PATCH_HELPER_CLASS_NAME, javaClass -> {
            addAccessorProperties(models, javaClass);
            addAccessorInterfaces(models, javaClass);
            addGettersAndSetters(models, javaClass);
        });
    }

    /**
     * Add imports for JsonMergePatchHelper.
     * @param imports
     * @param models
     * @param settings
     */
    private void addImports(Set<String> imports, List<ClientModel> models, JavaSettings settings) {
        if (models != null && !models.isEmpty()) {
            models.forEach(model -> {
                model.addImportsTo(imports, settings);
            });
        }
    }

    /**
     * Add accessor properties for each model that is used in json-merge-patch.
     *
     * @param models
     * @param javaClass
     */
    private void addAccessorProperties(List<ClientModel> models, JavaClass javaClass) {
        if (models != null && !models.isEmpty()) {
            models.forEach(model -> {
                if (ClientModelUtil.isJsonMergePatchModel(model)) {
                    javaClass.privateMemberVariable(String.format("static %sAccessor %sAccessor", model.getName(), CodeNamer.getModelNamer().modelPropertySetterName(model.getName())));
                }
            });
        }
    }

    /**
     * Add accessor interfaces for each model that is used in json-merge-patch.
     *
     * @param models
     * @param javaClass
     */
    private void addAccessorInterfaces(List<ClientModel> models, JavaClass javaClass) {
        if (models != null && !models.isEmpty()) {
            models.forEach(model -> {
                if (ClientModelUtil.isJsonMergePatchModel(model)) {
                    javaClass.interfaceBlock(JavaVisibility.Public, String.format("%sAccessor", model.getName()), interfaceBlock -> {
                        interfaceBlock.publicMethod(String.format("%s prepareModelForJsonMergePatch(%s %s, boolean jsonMergePatchEnabled)", model.getName(), model.getName(), CodeNamer.getModelNamer().modelPropertySetterName(model.getName())));
                    });
                }
            });
        }
    }


    /**
     * Add getter and setter for each model that is used in json-merge-patch.
     *
     * @param models
     * @param javaClass
     */
    private void addGettersAndSetters(List<ClientModel> models, JavaClass javaClass) {
        if (models != null && !models.isEmpty()) {
            models.forEach(model -> {
                if (ClientModelUtil.isJsonMergePatchModel(model)) {
                    // setters
                    javaClass.publicStaticMethod(String.format("void set%sAccessor(%sAccessor accessor)", model.getName(), model.getName()),methodBlock -> {
                        methodBlock.line(String.format("%sAccessor = accessor;", CodeNamer.getModelNamer().modelPropertySetterName(model.getName())));
                    });
                    // getters
                    javaClass.publicStaticMethod(String.format("%sAccessor get%sAccessor()", model.getName(), model.getName()), methodBlock -> {
                        methodBlock.line(String.format("return %sAccessor;",CodeNamer.getModelNamer().modelPropertySetterName(model.getName())));
                    });

                }
            });
        }
    }
}
