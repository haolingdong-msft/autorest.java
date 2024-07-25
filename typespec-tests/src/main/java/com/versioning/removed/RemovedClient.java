// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.versioning.removed;

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
import com.versioning.removed.implementation.RemovedClientImpl;
import com.versioning.removed.models.ModelV2;

/**
 * Initializes a new instance of the synchronous RemovedClient type.
 */
@ServiceClient(builder = RemovedClientBuilder.class)
public final class RemovedClient {
    @Generated
    private final RemovedClientImpl serviceClient;

    /**
     * Initializes an instance of RemovedClient class.
     * 
     * @param serviceClient the service client implementation.
     */
    @Generated
    RemovedClient(RemovedClientImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * The v2 operation.
     * <p><strong>Request Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     prop: String (Required)
     *     enumProp: String(enumMemberV2) (Required)
     *     unionProp: BinaryData (Required)
     * }
     * }</pre>
     * 
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     prop: String (Required)
     *     enumProp: String(enumMemberV2) (Required)
     *     unionProp: BinaryData (Required)
     * }
     * }</pre>
     * 
     * @param body The body parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the request has succeeded along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> v2WithResponse(BinaryData body, RequestOptions requestOptions) {
        return this.serviceClient.v2WithResponse(body, requestOptions);
    }

    /**
     * The v2 operation.
     * 
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the request has succeeded.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ModelV2 v2(ModelV2 body) {
        // Generated convenience method for v2WithResponse
        RequestOptions requestOptions = new RequestOptions();
        return v2WithResponse(BinaryData.fromObject(body), requestOptions).getValue().toObject(ModelV2.class);
    }
}
