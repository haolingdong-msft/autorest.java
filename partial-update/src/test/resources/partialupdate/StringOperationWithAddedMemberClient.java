// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.autorest.postprocessor.util;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import fixtures.bodystring.implementation.StringOperationsImpl;
import fixtures.bodystring.implementation.EnumsImpl;

/** Initializes a new instance of the synchronous AutoRestSwaggerBatService type. */
@ServiceClient(builder = AutoRestSwaggerBatServiceBuilder.class)
public final class StringOperationWithAddedMemberClient {

    @Generated private final StringOperationsImpl serviceClient;

    private static final TypeReference<List<TransliteratedText>> CUSTOMIZED_FIELD =
            new TypeReference<List<TransliteratedText>>() {};

    @Generated
    private static final TypeReference<List<TransliteratedText>> GENERATED_FIELD =
            new TypeReference<List<TransliteratedText>>() {};

    // manually add field
    private EnumsImpl enumsClient;

    /**
     * Initializes an instance of StringOperations client.
     *
     * @param serviceClient the service client implementation.
     */
    @Generated
    StringOperationClient(StringOperationsImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    // manually add one constructor
    StringOperationClient(StringOperationsImpl serviceClient, String test) {
        this.serviceClient = serviceClient;
    }

    /**
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @return the response.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> putNullWithResponse(RequestOptions requestOptions) {
        return this.serviceClient.putNullWithResponse(requestOptions);
    }

    // manually add method
    public void addedMethod() {
        System.out.println("addedMethod");
    }

}
