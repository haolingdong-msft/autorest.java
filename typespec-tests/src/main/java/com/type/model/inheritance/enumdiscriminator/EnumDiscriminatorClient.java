// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.type.model.inheritance.enumdiscriminator;

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
import com.type.model.inheritance.enumdiscriminator.implementation.EnumDiscriminatorClientImpl;
import com.type.model.inheritance.enumdiscriminator.models.Dog;
import com.type.model.inheritance.enumdiscriminator.models.Snake;

/**
 * Initializes a new instance of the synchronous EnumDiscriminatorClient type.
 */
@ServiceClient(builder = EnumDiscriminatorClientBuilder.class)
public final class EnumDiscriminatorClient {
    @Generated
    private final EnumDiscriminatorClientImpl serviceClient;

    /**
     * Initializes an instance of EnumDiscriminatorClient class.
     * 
     * @param serviceClient the service client implementation.
     */
    @Generated
    EnumDiscriminatorClient(EnumDiscriminatorClientImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Receive model with extensible enum discriminator type.
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     kind: String(golden) (Required)
     *     weight: int (Required)
     * }
     * }</pre>
     * 
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return test extensible enum type for discriminator along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> getExtensibleModelWithResponse(RequestOptions requestOptions) {
        return this.serviceClient.getExtensibleModelWithResponse(requestOptions);
    }

    /**
     * Send model with extensible enum discriminator type.
     * <p><strong>Request Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     kind: String(golden) (Required)
     *     weight: int (Required)
     * }
     * }</pre>
     * 
     * @param input Test extensible enum type for discriminator
     * 
     * The input parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> putExtensibleModelWithResponse(BinaryData input, RequestOptions requestOptions) {
        return this.serviceClient.putExtensibleModelWithResponse(input, requestOptions);
    }

    /**
     * Get a model omitting the discriminator.
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     kind: String(golden) (Required)
     *     weight: int (Required)
     * }
     * }</pre>
     * 
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return a model omitting the discriminator along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> getExtensibleModelMissingDiscriminatorWithResponse(RequestOptions requestOptions) {
        return this.serviceClient.getExtensibleModelMissingDiscriminatorWithResponse(requestOptions);
    }

    /**
     * Get a model containing discriminator value never defined.
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     kind: String(golden) (Required)
     *     weight: int (Required)
     * }
     * }</pre>
     * 
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return a model containing discriminator value never defined along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> getExtensibleModelWrongDiscriminatorWithResponse(RequestOptions requestOptions) {
        return this.serviceClient.getExtensibleModelWrongDiscriminatorWithResponse(requestOptions);
    }

    /**
     * Receive model with fixed enum discriminator type.
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     kind: String(cobra) (Required)
     *     length: int (Required)
     * }
     * }</pre>
     * 
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return test fixed enum type for discriminator along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> getFixedModelWithResponse(RequestOptions requestOptions) {
        return this.serviceClient.getFixedModelWithResponse(requestOptions);
    }

    /**
     * Send model with fixed enum discriminator type.
     * <p><strong>Request Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     kind: String(cobra) (Required)
     *     length: int (Required)
     * }
     * }</pre>
     * 
     * @param input Test fixed enum type for discriminator
     * 
     * The input parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> putFixedModelWithResponse(BinaryData input, RequestOptions requestOptions) {
        return this.serviceClient.putFixedModelWithResponse(input, requestOptions);
    }

    /**
     * Get a model omitting the discriminator.
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     kind: String(cobra) (Required)
     *     length: int (Required)
     * }
     * }</pre>
     * 
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return a model omitting the discriminator along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> getFixedModelMissingDiscriminatorWithResponse(RequestOptions requestOptions) {
        return this.serviceClient.getFixedModelMissingDiscriminatorWithResponse(requestOptions);
    }

    /**
     * Get a model containing discriminator value never defined.
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     kind: String(cobra) (Required)
     *     length: int (Required)
     * }
     * }</pre>
     * 
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return a model containing discriminator value never defined along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> getFixedModelWrongDiscriminatorWithResponse(RequestOptions requestOptions) {
        return this.serviceClient.getFixedModelWrongDiscriminatorWithResponse(requestOptions);
    }

    /**
     * Receive model with extensible enum discriminator type.
     * 
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return test extensible enum type for discriminator.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Dog getExtensibleModel() {
        // Generated convenience method for getExtensibleModelWithResponse
        RequestOptions requestOptions = new RequestOptions();
        return getExtensibleModelWithResponse(requestOptions).getValue().toObject(Dog.class);
    }

    /**
     * Send model with extensible enum discriminator type.
     * 
     * @param input Test extensible enum type for discriminator
     * 
     * The input parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void putExtensibleModel(Dog input) {
        // Generated convenience method for putExtensibleModelWithResponse
        RequestOptions requestOptions = new RequestOptions();
        putExtensibleModelWithResponse(BinaryData.fromObject(input), requestOptions).getValue();
    }

    /**
     * Get a model omitting the discriminator.
     * 
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a model omitting the discriminator.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Dog getExtensibleModelMissingDiscriminator() {
        // Generated convenience method for getExtensibleModelMissingDiscriminatorWithResponse
        RequestOptions requestOptions = new RequestOptions();
        return getExtensibleModelMissingDiscriminatorWithResponse(requestOptions).getValue().toObject(Dog.class);
    }

    /**
     * Get a model containing discriminator value never defined.
     * 
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a model containing discriminator value never defined.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Dog getExtensibleModelWrongDiscriminator() {
        // Generated convenience method for getExtensibleModelWrongDiscriminatorWithResponse
        RequestOptions requestOptions = new RequestOptions();
        return getExtensibleModelWrongDiscriminatorWithResponse(requestOptions).getValue().toObject(Dog.class);
    }

    /**
     * Receive model with fixed enum discriminator type.
     * 
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return test fixed enum type for discriminator.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Snake getFixedModel() {
        // Generated convenience method for getFixedModelWithResponse
        RequestOptions requestOptions = new RequestOptions();
        return getFixedModelWithResponse(requestOptions).getValue().toObject(Snake.class);
    }

    /**
     * Send model with fixed enum discriminator type.
     * 
     * @param input Test fixed enum type for discriminator
     * 
     * The input parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void putFixedModel(Snake input) {
        // Generated convenience method for putFixedModelWithResponse
        RequestOptions requestOptions = new RequestOptions();
        putFixedModelWithResponse(BinaryData.fromObject(input), requestOptions).getValue();
    }

    /**
     * Get a model omitting the discriminator.
     * 
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a model omitting the discriminator.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Snake getFixedModelMissingDiscriminator() {
        // Generated convenience method for getFixedModelMissingDiscriminatorWithResponse
        RequestOptions requestOptions = new RequestOptions();
        return getFixedModelMissingDiscriminatorWithResponse(requestOptions).getValue().toObject(Snake.class);
    }

    /**
     * Get a model containing discriminator value never defined.
     * 
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a model containing discriminator value never defined.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Snake getFixedModelWrongDiscriminator() {
        // Generated convenience method for getFixedModelWrongDiscriminatorWithResponse
        RequestOptions requestOptions = new RequestOptions();
        return getFixedModelWrongDiscriminatorWithResponse(requestOptions).getValue().toObject(Snake.class);
    }
}
