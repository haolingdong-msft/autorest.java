// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.encode.bytes;

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
import com.azure.core.util.Base64Url;
import com.azure.core.util.BinaryData;
import com.azure.core.util.FluxUtil;
import com.encode.bytes.implementation.ResponseBodiesImpl;
import reactor.core.publisher.Mono;

/**
 * Initializes a new instance of the asynchronous BytesClient type.
 */
@ServiceClient(builder = BytesClientBuilder.class, isAsync = true)
public final class ResponseBodyAsyncClient {
    @Generated
    private final ResponseBodiesImpl serviceClient;

    /**
     * Initializes an instance of ResponseBodyAsyncClient class.
     * 
     * @param serviceClient the service client implementation.
     */
    @Generated
    ResponseBodyAsyncClient(ResponseBodiesImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * The defaultMethod operation.
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>{@code
     * byte[]
     * }</pre>
     * 
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the request has succeeded along with {@link Response} on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> defaultMethodWithResponse(RequestOptions requestOptions) {
        return this.serviceClient.defaultMethodWithResponseAsync(requestOptions);
    }

    /**
     * The octetStream operation.
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>{@code
     * BinaryData
     * }</pre>
     * 
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the request has succeeded along with {@link Response} on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> octetStreamWithResponse(RequestOptions requestOptions) {
        return this.serviceClient.octetStreamWithResponseAsync(requestOptions);
    }

    /**
     * The customContentType operation.
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>{@code
     * BinaryData
     * }</pre>
     * 
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the request has succeeded along with {@link Response} on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> customContentTypeWithResponse(RequestOptions requestOptions) {
        return this.serviceClient.customContentTypeWithResponseAsync(requestOptions);
    }

    /**
     * The base64 operation.
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>{@code
     * byte[]
     * }</pre>
     * 
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the request has succeeded along with {@link Response} on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> base64WithResponse(RequestOptions requestOptions) {
        return this.serviceClient.base64WithResponseAsync(requestOptions);
    }

    /**
     * The base64url operation.
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>{@code
     * Base64Url
     * }</pre>
     * 
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the request has succeeded along with {@link Response} on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> base64urlWithResponse(RequestOptions requestOptions) {
        return this.serviceClient.base64urlWithResponseAsync(requestOptions);
    }

    /**
     * The defaultMethod operation.
     * 
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the request has succeeded on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<byte[]> defaultMethod() {
        // Generated convenience method for defaultMethodWithResponse
        RequestOptions requestOptions = new RequestOptions();
        return defaultMethodWithResponse(requestOptions).flatMap(FluxUtil::toMono)
            .map(protocolMethodData -> protocolMethodData.toObject(byte[].class));
    }

    /**
     * The octetStream operation.
     * 
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the request has succeeded on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<BinaryData> octetStream() {
        // Generated convenience method for octetStreamWithResponse
        RequestOptions requestOptions = new RequestOptions();
        return octetStreamWithResponse(requestOptions).flatMap(FluxUtil::toMono);
    }

    /**
     * The customContentType operation.
     * 
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the request has succeeded on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<BinaryData> customContentType() {
        // Generated convenience method for customContentTypeWithResponse
        RequestOptions requestOptions = new RequestOptions();
        return customContentTypeWithResponse(requestOptions).flatMap(FluxUtil::toMono);
    }

    /**
     * The base64 operation.
     * 
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the request has succeeded on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<byte[]> base64() {
        // Generated convenience method for base64WithResponse
        RequestOptions requestOptions = new RequestOptions();
        return base64WithResponse(requestOptions).flatMap(FluxUtil::toMono)
            .map(protocolMethodData -> protocolMethodData.toObject(byte[].class));
    }

    /**
     * The base64url operation.
     * 
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the request has succeeded on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<byte[]> base64url() {
        // Generated convenience method for base64urlWithResponse
        RequestOptions requestOptions = new RequestOptions();
        return base64urlWithResponse(requestOptions).flatMap(FluxUtil::toMono)
            .map(protocolMethodData -> protocolMethodData.toObject(Base64Url.class).decodedBytes());
    }
}
