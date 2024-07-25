// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.authentication.oauth2;

import com.authentication.oauth2.implementation.OAuth2ClientImpl;
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
import reactor.core.publisher.Mono;

/**
 * Initializes a new instance of the asynchronous OAuth2Client type.
 */
@ServiceClient(builder = OAuth2ClientBuilder.class, isAsync = true)
public final class OAuth2AsyncClient {
    @Generated
    private final OAuth2ClientImpl serviceClient;

    /**
     * Initializes an instance of OAuth2AsyncClient class.
     * 
     * @param serviceClient the service client implementation.
     */
    @Generated
    OAuth2AsyncClient(OAuth2ClientImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Check whether client is authenticated.
     * 
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
    public Mono<Response<Void>> validWithResponse(RequestOptions requestOptions) {
        return this.serviceClient.validWithResponseAsync(requestOptions);
    }

    /**
     * Check whether client is authenticated. Will return an invalid bearer error.
     * 
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
    public Mono<Response<Void>> invalidWithResponse(RequestOptions requestOptions) {
        return this.serviceClient.invalidWithResponseAsync(requestOptions);
    }

    /**
     * Check whether client is authenticated.
     * 
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
    public Mono<Void> valid() {
        // Generated convenience method for validWithResponse
        RequestOptions requestOptions = new RequestOptions();
        return validWithResponse(requestOptions).flatMap(FluxUtil::toMono);
    }

    /**
     * Check whether client is authenticated. Will return an invalid bearer error.
     * 
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
    public Mono<Void> invalid() {
        // Generated convenience method for invalidWithResponse
        RequestOptions requestOptions = new RequestOptions();
        return invalidWithResponse(requestOptions).flatMap(FluxUtil::toMono);
    }
}
