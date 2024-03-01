// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.payload.contentnegotiation;

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
import com.payload.contentnegotiation.implementation.SameBodiesImpl;

/**
 * Initializes a new instance of the synchronous ContentNegotiationClient type.
 */
@ServiceClient(builder = ContentNegotiationClientBuilder.class)
public final class SameBodyClient {
    @Generated
    private final SameBodiesImpl serviceClient;

    /**
     * Initializes an instance of SameBodyClient class.
     * 
     * @param serviceClient the service client implementation.
     */
    @Generated
    SameBodyClient(SameBodiesImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * The getAvatarAsPng operation.
     * <p><strong>Response Body Schema</strong></p>
     * <pre>{@code
     * BinaryData
     * }</pre>
     * 
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the response body along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> getAvatarAsPngWithResponse(RequestOptions requestOptions) {
        return this.serviceClient.getAvatarAsPngWithResponse(requestOptions);
    }

    /**
     * The getAvatarAsJpeg operation.
     * <p><strong>Response Body Schema</strong></p>
     * <pre>{@code
     * BinaryData
     * }</pre>
     * 
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the response body along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> getAvatarAsJpegWithResponse(RequestOptions requestOptions) {
        return this.serviceClient.getAvatarAsJpegWithResponse(requestOptions);
    }

    /**
     * The getAvatarAsPng operation.
     * 
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public BinaryData getAvatarAsPng() {
        // Generated convenience method for getAvatarAsPngWithResponse
        RequestOptions requestOptions = new RequestOptions();
        return getAvatarAsPngWithResponse(requestOptions).getValue();
    }

    /**
     * The getAvatarAsJpeg operation.
     * 
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public BinaryData getAvatarAsJpeg() {
        // Generated convenience method for getAvatarAsJpegWithResponse
        RequestOptions requestOptions = new RequestOptions();
        return getAvatarAsJpegWithResponse(requestOptions).getValue();
    }
}
