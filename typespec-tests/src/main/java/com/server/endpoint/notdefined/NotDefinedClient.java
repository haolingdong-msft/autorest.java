// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.server.endpoint.notdefined;

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
import com.server.endpoint.notdefined.implementation.NotDefinedClientImpl;

/**
 * Initializes a new instance of the synchronous NotDefinedClient type.
 */
@ServiceClient(builder = NotDefinedClientBuilder.class)
public final class NotDefinedClient {
    @Generated
    private final NotDefinedClientImpl serviceClient;

    /**
     * Initializes an instance of NotDefinedClient class.
     * 
     * @param serviceClient the service client implementation.
     */
    @Generated
    NotDefinedClient(NotDefinedClientImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * The valid operation.
     * 
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the request has succeeded along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> validWithResponse(RequestOptions requestOptions) {
        return this.serviceClient.validWithResponse(requestOptions);
    }

    /**
     * The valid operation.
     * 
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void valid() {
        // Generated convenience method for validWithResponse
        RequestOptions requestOptions = new RequestOptions();
        validWithResponse(requestOptions).getValue();
    }
}
