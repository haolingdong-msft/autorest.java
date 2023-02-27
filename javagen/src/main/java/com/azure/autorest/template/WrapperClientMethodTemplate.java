// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.autorest.template;

import com.azure.autorest.extension.base.plugin.JavaSettings;
import com.azure.autorest.model.clientmodel.ClassType;
import com.azure.autorest.model.clientmodel.ClientMethod;
import com.azure.autorest.model.clientmodel.ClientMethodParameter;
import com.azure.autorest.model.clientmodel.ClientMethodType;
import com.azure.autorest.model.clientmodel.PrimitiveType;
import com.azure.autorest.model.clientmodel.ProxyMethod;
import com.azure.autorest.model.javamodel.JavaBlock;
import com.azure.autorest.model.javamodel.JavaClass;
import com.azure.autorest.model.javamodel.JavaType;
import com.azure.autorest.model.javamodel.JavaVisibility;
import com.azure.autorest.util.TemplateUtil;

import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

/**
 * Template to generate client methods that are wrappers around the client methods generated by
 * {@link ClientMethodTemplate}.
 *
 */
public class WrapperClientMethodTemplate extends ClientMethodTemplateBase {

    private static final WrapperClientMethodTemplate INSTANCE = new WrapperClientMethodTemplate();

    protected WrapperClientMethodTemplate() {
    }

    public static WrapperClientMethodTemplate getInstance() {
        return INSTANCE;
    }

    @Override
    public void write(ClientMethod clientMethod, JavaType typeBlock) {
        JavaSettings settings = JavaSettings.getInstance();

        if (clientMethod.getType() == ClientMethodType.PagingAsyncSinglePage || clientMethod.getType() == ClientMethodType.PagingSyncSinglePage) {
            return;
        }

        ProxyMethod restAPIMethod = clientMethod.getProxyMethod();
        if (settings.isDataPlaneClient()) {
            typeBlock.javadocComment(comment -> generateProtocolMethodJavadoc(clientMethod, comment));
        } else {
            generateJavadoc(clientMethod, typeBlock, restAPIMethod);
        }

        addGeneratedAnnotation(typeBlock);
        TemplateUtil.writeClientMethodServiceMethodAnnotation(clientMethod, typeBlock);

        String methodName = clientMethod.getName();
        if (clientMethod.getType().name().contains("Async") && methodName.endsWith("Async")) {
            methodName = methodName.substring(0, methodName.length() - "Async".length());
        }

        String declaration = String.format("%1$s %2$s(%3$s)", clientMethod.getReturnValue().getType(), methodName, clientMethod.getParametersDeclaration());
        Consumer<JavaBlock> method = function -> {

            boolean shouldReturn = true;
            if (clientMethod.getReturnValue() != null && clientMethod.getReturnValue().getType() instanceof PrimitiveType) {
                PrimitiveType type = (PrimitiveType) clientMethod.getReturnValue().getType();
                if (type.asNullable() == ClassType.Void) {
                    shouldReturn = false;
                }
            }

            writeMethodInvocation(clientMethod, function, shouldReturn);
        };
        if (clientMethod.getMethodVisibilityInWrapperClient() == JavaVisibility.Public) {
            typeBlock.publicMethod(declaration, method);
        } else if (typeBlock instanceof JavaClass) {
            JavaClass classBlock = (JavaClass) typeBlock;
            classBlock.method(clientMethod.getMethodVisibilityInWrapperClient(), null, declaration, method);
        }

    }

    /**
     * Extension to write the client method invocation.
     *
     * @param clientMethod the client method
     * @param function the method block to write the method invocation
     * @param shouldReturn whether method need return value
     */
    protected void writeMethodInvocation(ClientMethod clientMethod, JavaBlock function, boolean shouldReturn) {
        List<ClientMethodParameter> parameters = clientMethod.getMethodInputParameters();
        function.line((shouldReturn ? "return " : "") + "this.serviceClient.%1$s(%2$s);",
                clientMethod.getName(),
                parameters.stream().map(ClientMethodParameter::getName).collect(Collectors.joining(", ")));
    }

    protected void generateJavadoc(ClientMethod clientMethod, JavaType typeBlock, ProxyMethod restAPIMethod) {
        typeBlock.javadocComment(comment -> {
            comment.description(clientMethod.getDescription());
            List<ClientMethodParameter> methodParameters = clientMethod.getMethodInputParameters();
            for (ClientMethodParameter parameter : methodParameters) {
                comment.param(parameter.getName(), parameter.getDescription());
            }
            if (clientMethod.getParametersDeclaration() != null && !clientMethod.getParametersDeclaration().isEmpty()) {
                comment.methodThrows("IllegalArgumentException", "thrown if parameters fail the validation");
            }
            if (restAPIMethod != null) {
                if (restAPIMethod.getUnexpectedResponseExceptionType() != null) {
                    comment.methodThrows(restAPIMethod.getUnexpectedResponseExceptionType().toString(),
                            "thrown if the request is rejected by server");
                }
                comment.methodThrows("RuntimeException", "all other wrapped checked exceptions if the request fails to be sent");
            }
            comment.methodReturns(clientMethod.getReturnValue().getDescription());
        });
    }

    protected void addGeneratedAnnotation(JavaType typeBlock) {
        typeBlock.annotation("Generated");
    }
}
