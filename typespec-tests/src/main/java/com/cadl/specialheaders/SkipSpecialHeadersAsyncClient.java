// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.cadl.specialheaders;

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
import com.azure.core.util.FluxUtil;
import com.cadl.specialheaders.implementation.SkipSpecialHeadersImpl;
import reactor.core.publisher.Mono;

/**
 * Initializes a new instance of the asynchronous SpecialHeadersClient type.
 */
@ServiceClient(builder = SpecialHeadersClientBuilder.class, isAsync = true)
public final class SkipSpecialHeadersAsyncClient {
    @Generated
    private final SkipSpecialHeadersImpl serviceClient;

    /**
     * Initializes an instance of SkipSpecialHeadersAsyncClient class.
     * 
     * @param serviceClient the service client implementation.
     */
    @Generated
    SkipSpecialHeadersAsyncClient(SkipSpecialHeadersImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * skip special headers.
     * 
     * @param name The name parameter.
     * @param foo The foo parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return there is no content to send for this request, but the headers may be useful along with {@link Response}
     * on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> deleteWithSpecialHeadersWithResponse(String name, String foo,
        RequestOptions requestOptions) {
        return this.serviceClient.deleteWithSpecialHeadersWithResponseAsync(name, foo, requestOptions);
    }

    /**
     * skip special headers.
     * 
     * @param name The name parameter.
     * @param foo The foo parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return there is no content to send for this request, but the headers may be useful on successful completion of
     * {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> deleteWithSpecialHeaders(String name, String foo) {
        // Generated convenience method for deleteWithSpecialHeadersWithResponse
        RequestOptions requestOptions = new RequestOptions();
        return deleteWithSpecialHeadersWithResponse(name, foo, requestOptions).flatMap(FluxUtil::toMono);
    }
}
