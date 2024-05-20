// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.versioning.typechangedfrom;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.exception.ClientAuthenticationException;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.exception.ResourceModifiedException;
import com.azure.core.exception.ResourceNotFoundException;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import com.versioning.typechangedfrom.implementation.TypeChangedFromClientImpl;
import com.versioning.typechangedfrom.models.TestModel;

/**
 * Initializes a new instance of the synchronous TypeChangedFromClient type.
 */
@ServiceClient(builder = TypeChangedFromClientBuilder.class)
public final class TypeChangedFromClient {
    @Generated
    private final TypeChangedFromClientImpl serviceClient;

    /**
     * Initializes an instance of TypeChangedFromClient class.
     * 
     * @param serviceClient the service client implementation.
     */
    @Generated
    TypeChangedFromClient(TypeChangedFromClientImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * The test operation.
     * <p><strong>Request Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     prop: String (Required)
     *     changedProp: String (Required)
     * }
     * }</pre>
     * 
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     prop: String (Required)
     *     changedProp: String (Required)
     * }
     * }</pre>
     * 
     * @param param A sequence of textual characters.
     * 
     * The param parameter.
     * @param body The body parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the response body along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> testWithResponse(String param, BinaryData body, RequestOptions requestOptions) {
        return this.serviceClient.testWithResponse(param, body, requestOptions);
    }

    /**
     * The test operation.
     * 
     * @param param A sequence of textual characters.
     * 
     * The param parameter.
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public TestModel test(String param, TestModel body) {
        // Generated convenience method for testWithResponse
        RequestOptions requestOptions = new RequestOptions();
        return testWithResponse(param, BinaryData.fromObject(body), requestOptions).getValue()
            .toObject(TestModel.class);
    }
}
