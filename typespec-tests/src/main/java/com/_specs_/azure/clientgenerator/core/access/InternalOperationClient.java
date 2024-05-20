// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com._specs_.azure.clientgenerator.core.access;

import com._specs_.azure.clientgenerator.core.access.implementation.InternalOperationsImpl;
import com._specs_.azure.clientgenerator.core.access.implementation.models.InternalDecoratorModelInInternal;
import com._specs_.azure.clientgenerator.core.access.implementation.models.NoDecoratorModelInInternal;
import com._specs_.azure.clientgenerator.core.access.models.PublicDecoratorModelInInternal;
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

/**
 * Initializes a new instance of the synchronous AccessClient type.
 */
@ServiceClient(builder = AccessClientBuilder.class)
public final class InternalOperationClient {
    @Generated
    private final InternalOperationsImpl serviceClient;

    /**
     * Initializes an instance of InternalOperationClient class.
     * 
     * @param serviceClient the service client implementation.
     */
    @Generated
    InternalOperationClient(InternalOperationsImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * The noDecoratorInInternal operation.
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     name: String (Required)
     * }
     * }</pre>
     * 
     * @param name A sequence of textual characters.
     * 
     * The name parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return used in an internal operation, should be generated but not exported along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<BinaryData> noDecoratorInInternalWithResponse(String name, RequestOptions requestOptions) {
        return this.serviceClient.noDecoratorInInternalWithResponse(name, requestOptions);
    }

    /**
     * The internalDecoratorInInternal operation.
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     name: String (Required)
     * }
     * }</pre>
     * 
     * @param name A sequence of textual characters.
     * 
     * The name parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return used in an internal operation, should be generated but not exported along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<BinaryData> internalDecoratorInInternalWithResponse(String name, RequestOptions requestOptions) {
        return this.serviceClient.internalDecoratorInInternalWithResponse(name, requestOptions);
    }

    /**
     * The publicDecoratorInInternal operation.
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     name: String (Required)
     * }
     * }</pre>
     * 
     * @param name A sequence of textual characters.
     * 
     * The name parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return used in an internal operation but with public decorator, should be generated and exported along with
     * {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<BinaryData> publicDecoratorInInternalWithResponse(String name, RequestOptions requestOptions) {
        return this.serviceClient.publicDecoratorInInternalWithResponse(name, requestOptions);
    }

    /**
     * The noDecoratorInInternal operation.
     * 
     * @param name A sequence of textual characters.
     * 
     * The name parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return used in an internal operation, should be generated but not exported.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    NoDecoratorModelInInternal noDecoratorInInternal(String name) {
        // Generated convenience method for noDecoratorInInternalWithResponse
        RequestOptions requestOptions = new RequestOptions();
        return noDecoratorInInternalWithResponse(name, requestOptions).getValue()
            .toObject(NoDecoratorModelInInternal.class);
    }

    /**
     * The internalDecoratorInInternal operation.
     * 
     * @param name A sequence of textual characters.
     * 
     * The name parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return used in an internal operation, should be generated but not exported.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    InternalDecoratorModelInInternal internalDecoratorInInternal(String name) {
        // Generated convenience method for internalDecoratorInInternalWithResponse
        RequestOptions requestOptions = new RequestOptions();
        return internalDecoratorInInternalWithResponse(name, requestOptions).getValue()
            .toObject(InternalDecoratorModelInInternal.class);
    }

    /**
     * The publicDecoratorInInternal operation.
     * 
     * @param name A sequence of textual characters.
     * 
     * The name parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return used in an internal operation but with public decorator, should be generated and exported.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    PublicDecoratorModelInInternal publicDecoratorInInternal(String name) {
        // Generated convenience method for publicDecoratorInInternalWithResponse
        RequestOptions requestOptions = new RequestOptions();
        return publicDecoratorInInternalWithResponse(name, requestOptions).getValue()
            .toObject(PublicDecoratorModelInInternal.class);
    }
}
