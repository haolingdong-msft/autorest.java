// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.type.model.inheritance.singlediscriminator;

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
import com.type.model.inheritance.singlediscriminator.implementation.SingleDiscriminatorClientImpl;
import com.type.model.inheritance.singlediscriminator.models.Bird;
import com.type.model.inheritance.singlediscriminator.models.Dinosaur;

/**
 * Initializes a new instance of the synchronous SingleDiscriminatorClient type.
 */
@ServiceClient(builder = SingleDiscriminatorClientBuilder.class)
public final class SingleDiscriminatorClient {
    @Generated
    private final SingleDiscriminatorClientImpl serviceClient;

    /**
     * Initializes an instance of SingleDiscriminatorClient class.
     * 
     * @param serviceClient the service client implementation.
     */
    @Generated
    SingleDiscriminatorClient(SingleDiscriminatorClientImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * The getModel operation.
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     kind: String (Required)
     *     wingspan: int (Required)
     * }
     * }</pre>
     * 
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return this is base model for polymorphic single level inheritance with a discriminator along with
     * {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> getModelWithResponse(RequestOptions requestOptions) {
        return this.serviceClient.getModelWithResponse(requestOptions);
    }

    /**
     * The putModel operation.
     * <p><strong>Request Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     kind: String (Required)
     *     wingspan: int (Required)
     * }
     * }</pre>
     * 
     * @param input This is base model for polymorphic single level inheritance with a discriminator.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> putModelWithResponse(BinaryData input, RequestOptions requestOptions) {
        return this.serviceClient.putModelWithResponse(input, requestOptions);
    }

    /**
     * The getRecursiveModel operation.
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     kind: String (Required)
     *     wingspan: int (Required)
     * }
     * }</pre>
     * 
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return this is base model for polymorphic single level inheritance with a discriminator along with
     * {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> getRecursiveModelWithResponse(RequestOptions requestOptions) {
        return this.serviceClient.getRecursiveModelWithResponse(requestOptions);
    }

    /**
     * The putRecursiveModel operation.
     * <p><strong>Request Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     kind: String (Required)
     *     wingspan: int (Required)
     * }
     * }</pre>
     * 
     * @param input This is base model for polymorphic single level inheritance with a discriminator.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> putRecursiveModelWithResponse(BinaryData input, RequestOptions requestOptions) {
        return this.serviceClient.putRecursiveModelWithResponse(input, requestOptions);
    }

    /**
     * The getMissingDiscriminator operation.
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     kind: String (Required)
     *     wingspan: int (Required)
     * }
     * }</pre>
     * 
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return this is base model for polymorphic single level inheritance with a discriminator along with
     * {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> getMissingDiscriminatorWithResponse(RequestOptions requestOptions) {
        return this.serviceClient.getMissingDiscriminatorWithResponse(requestOptions);
    }

    /**
     * The getWrongDiscriminator operation.
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     kind: String (Required)
     *     wingspan: int (Required)
     * }
     * }</pre>
     * 
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return this is base model for polymorphic single level inheritance with a discriminator along with
     * {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> getWrongDiscriminatorWithResponse(RequestOptions requestOptions) {
        return this.serviceClient.getWrongDiscriminatorWithResponse(requestOptions);
    }

    /**
     * The getLegacyModel operation.
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     kind: String (Required)
     *     size: int (Required)
     * }
     * }</pre>
     * 
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return define a base class in the legacy way along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> getLegacyModelWithResponse(RequestOptions requestOptions) {
        return this.serviceClient.getLegacyModelWithResponse(requestOptions);
    }

    /**
     * The getModel operation.
     * 
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return this is base model for polymorphic single level inheritance with a discriminator.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Bird getModel() {
        // Generated convenience method for getModelWithResponse
        RequestOptions requestOptions = new RequestOptions();
        return getModelWithResponse(requestOptions).getValue().toObject(Bird.class);
    }

    /**
     * The putModel operation.
     * 
     * @param input This is base model for polymorphic single level inheritance with a discriminator.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void putModel(Bird input) {
        // Generated convenience method for putModelWithResponse
        RequestOptions requestOptions = new RequestOptions();
        putModelWithResponse(BinaryData.fromObject(input), requestOptions).getValue();
    }

    /**
     * The getRecursiveModel operation.
     * 
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return this is base model for polymorphic single level inheritance with a discriminator.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Bird getRecursiveModel() {
        // Generated convenience method for getRecursiveModelWithResponse
        RequestOptions requestOptions = new RequestOptions();
        return getRecursiveModelWithResponse(requestOptions).getValue().toObject(Bird.class);
    }

    /**
     * The putRecursiveModel operation.
     * 
     * @param input This is base model for polymorphic single level inheritance with a discriminator.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void putRecursiveModel(Bird input) {
        // Generated convenience method for putRecursiveModelWithResponse
        RequestOptions requestOptions = new RequestOptions();
        putRecursiveModelWithResponse(BinaryData.fromObject(input), requestOptions).getValue();
    }

    /**
     * The getMissingDiscriminator operation.
     * 
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return this is base model for polymorphic single level inheritance with a discriminator.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Bird getMissingDiscriminator() {
        // Generated convenience method for getMissingDiscriminatorWithResponse
        RequestOptions requestOptions = new RequestOptions();
        return getMissingDiscriminatorWithResponse(requestOptions).getValue().toObject(Bird.class);
    }

    /**
     * The getWrongDiscriminator operation.
     * 
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return this is base model for polymorphic single level inheritance with a discriminator.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Bird getWrongDiscriminator() {
        // Generated convenience method for getWrongDiscriminatorWithResponse
        RequestOptions requestOptions = new RequestOptions();
        return getWrongDiscriminatorWithResponse(requestOptions).getValue().toObject(Bird.class);
    }

    /**
     * The getLegacyModel operation.
     * 
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return define a base class in the legacy way.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Dinosaur getLegacyModel() {
        // Generated convenience method for getLegacyModelWithResponse
        RequestOptions requestOptions = new RequestOptions();
        return getLegacyModelWithResponse(requestOptions).getValue().toObject(Dinosaur.class);
    }
}
