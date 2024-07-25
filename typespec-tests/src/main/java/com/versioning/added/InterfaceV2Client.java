// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.versioning.added;

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
import com.versioning.added.implementation.InterfaceV2sImpl;
import com.versioning.added.models.ModelV2;

/**
 * Initializes a new instance of the synchronous AddedClient type.
 */
@ServiceClient(builder = AddedClientBuilder.class)
public final class InterfaceV2Client {
    @Generated
    private final InterfaceV2sImpl serviceClient;

    /**
     * Initializes an instance of InterfaceV2Client class.
     * 
     * @param serviceClient the service client implementation.
     */
    @Generated
    InterfaceV2Client(InterfaceV2sImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * The v2InInterface operation.
     * <p><strong>Request Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     prop: String (Required)
     *     enumProp: String(enumMember) (Required)
     *     unionProp: BinaryData (Required)
     * }
     * }</pre>
     * 
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     prop: String (Required)
     *     enumProp: String(enumMember) (Required)
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
    public Response<BinaryData> v2InInterfaceWithResponse(BinaryData body, RequestOptions requestOptions) {
        return this.serviceClient.v2InInterfaceWithResponse(body, requestOptions);
    }

    /**
     * The v2InInterface operation.
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
    public ModelV2 v2InInterface(ModelV2 body) {
        // Generated convenience method for v2InInterfaceWithResponse
        RequestOptions requestOptions = new RequestOptions();
        return v2InInterfaceWithResponse(BinaryData.fromObject(body), requestOptions).getValue()
            .toObject(ModelV2.class);
    }
}
