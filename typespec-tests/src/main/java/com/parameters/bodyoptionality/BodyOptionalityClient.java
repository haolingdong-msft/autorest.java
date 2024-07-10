// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.parameters.bodyoptionality;

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
import com.parameters.bodyoptionality.implementation.BodyOptionalityClientImpl;
import com.parameters.bodyoptionality.implementation.models.RequiredImplicitRequest;
import com.parameters.bodyoptionality.models.BodyModel;

/**
 * Initializes a new instance of the synchronous BodyOptionalityClient type.
 */
@ServiceClient(builder = BodyOptionalityClientBuilder.class)
public final class BodyOptionalityClient {
    @Generated
    private final BodyOptionalityClientImpl serviceClient;

    /**
     * Initializes an instance of BodyOptionalityClient class.
     * 
     * @param serviceClient the service client implementation.
     */
    @Generated
    BodyOptionalityClient(BodyOptionalityClientImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * The requiredExplicit operation.
     * <p><strong>Request Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     name: String (Required)
     * }
     * }</pre>
     * 
     * @param body The body parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> requiredExplicitWithResponse(BinaryData body, RequestOptions requestOptions) {
        return this.serviceClient.requiredExplicitWithResponse(body, requestOptions);
    }

    /**
     * The requiredImplicit operation.
     * <p><strong>Request Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     name: String (Required)
     * }
     * }</pre>
     * 
     * @param requiredImplicitRequest The requiredImplicitRequest parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> requiredImplicitWithResponse(BinaryData requiredImplicitRequest,
        RequestOptions requestOptions) {
        return this.serviceClient.requiredImplicitWithResponse(requiredImplicitRequest, requestOptions);
    }

    /**
     * The requiredExplicit operation.
     * 
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void requiredExplicit(BodyModel body) {
        // Generated convenience method for requiredExplicitWithResponse
        RequestOptions requestOptions = new RequestOptions();
        requiredExplicitWithResponse(BinaryData.fromObject(body), requestOptions).getValue();
    }

    /**
     * The requiredImplicit operation.
     * 
     * @param name The name parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void requiredImplicit(String name) {
        // Generated convenience method for requiredImplicitWithResponse
        RequestOptions requestOptions = new RequestOptions();
        RequiredImplicitRequest requiredImplicitRequestObj = new RequiredImplicitRequest(name);
        BinaryData requiredImplicitRequest = BinaryData.fromObject(requiredImplicitRequestObj);
        requiredImplicitWithResponse(requiredImplicitRequest, requestOptions).getValue();
    }
}
