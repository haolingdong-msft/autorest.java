// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.client.structure.service;

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
import com.client.structure.service.implementation.GroupsImpl;

/**
 * <!-- start generated doc -->
 * Initializes a new instance of the synchronous RenamedOperationClient type.
 * <!-- end generated doc -->
 */
@ServiceClient(builder = RenamedOperationClientBuilder.class)
public final class GroupClient {
    @Generated
    private final GroupsImpl serviceClient;

    /**
     * Initializes an instance of GroupClient class.
     * 
     * @param serviceClient the service client implementation.
     */
    @Generated
    GroupClient(GroupsImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * The renamedTwo operation.
     * 
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> renamedTwoWithResponse(RequestOptions requestOptions) {
        return this.serviceClient.renamedTwoWithResponse(requestOptions);
    }

    /**
     * The renamedFour operation.
     * 
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> renamedFourWithResponse(RequestOptions requestOptions) {
        return this.serviceClient.renamedFourWithResponse(requestOptions);
    }

    /**
     * The renamedSix operation.
     * 
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> renamedSixWithResponse(RequestOptions requestOptions) {
        return this.serviceClient.renamedSixWithResponse(requestOptions);
    }

    /**
     * The renamedTwo operation.
     * 
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void renamedTwo() {
        // Generated convenience method for renamedTwoWithResponse
        RequestOptions requestOptions = new RequestOptions();
        renamedTwoWithResponse(requestOptions).getValue();
    }

    /**
     * The renamedFour operation.
     * 
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void renamedFour() {
        // Generated convenience method for renamedFourWithResponse
        RequestOptions requestOptions = new RequestOptions();
        renamedFourWithResponse(requestOptions).getValue();
    }

    /**
     * The renamedSix operation.
     * 
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void renamedSix() {
        // Generated convenience method for renamedSixWithResponse
        RequestOptions requestOptions = new RequestOptions();
        renamedSixWithResponse(requestOptions).getValue();
    }
}
