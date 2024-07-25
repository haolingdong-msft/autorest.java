// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.type.union;

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
import com.type.union.implementation.MixedTypesImpl;
import com.type.union.implementation.models.SendRequest9;
import com.type.union.models.GetResponse;
import com.type.union.models.MixedTypesCases;

/**
 * Initializes a new instance of the synchronous UnionClient type.
 */
@ServiceClient(builder = UnionClientBuilder.class)
public final class MixedTypesClient {
    @Generated
    private final MixedTypesImpl serviceClient;

    /**
     * Initializes an instance of MixedTypesClient class.
     * 
     * @param serviceClient the service client implementation.
     */
    @Generated
    MixedTypesClient(MixedTypesImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * The get operation.
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     prop (Required): {
     *         model: BinaryData (Required)
     *         literal: BinaryData (Required)
     *         int: BinaryData (Required)
     *         boolean: BinaryData (Required)
     *         array (Required): [
     *             BinaryData (Required)
     *         ]
     *     }
     * }
     * }</pre>
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
    public Response<BinaryData> getWithResponse(RequestOptions requestOptions) {
        return this.serviceClient.getWithResponse(requestOptions);
    }

    /**
     * The send operation.
     * <p><strong>Request Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     prop (Required): {
     *         model: BinaryData (Required)
     *         literal: BinaryData (Required)
     *         int: BinaryData (Required)
     *         boolean: BinaryData (Required)
     *         array (Required): [
     *             BinaryData (Required)
     *         ]
     *     }
     * }
     * }</pre>
     * 
     * @param sendRequest The sendRequest parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return there is no content to send for this request, but the headers may be useful along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> sendWithResponse(BinaryData sendRequest, RequestOptions requestOptions) {
        return this.serviceClient.sendWithResponse(sendRequest, requestOptions);
    }

    /**
     * The get operation.
     * 
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the request has succeeded.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public GetResponse get() {
        // Generated convenience method for getWithResponse
        RequestOptions requestOptions = new RequestOptions();
        return getWithResponse(requestOptions).getValue().toObject(GetResponse.class);
    }

    /**
     * The send operation.
     * 
     * @param prop The prop parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void send(MixedTypesCases prop) {
        // Generated convenience method for sendWithResponse
        RequestOptions requestOptions = new RequestOptions();
        SendRequest9 sendRequestObj = new SendRequest9(prop);
        BinaryData sendRequest = BinaryData.fromObject(sendRequestObj);
        sendWithResponse(sendRequest, requestOptions).getValue();
    }
}
