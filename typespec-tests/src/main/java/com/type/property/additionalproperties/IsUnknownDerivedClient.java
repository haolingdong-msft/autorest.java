// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.type.property.additionalproperties;

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
import com.type.property.additionalproperties.implementation.IsUnknownDerivedsImpl;
import com.type.property.additionalproperties.models.IsUnknownAdditionalPropertiesDerived;

/**
 * Initializes a new instance of the synchronous AdditionalPropertiesClient type.
 */
@ServiceClient(builder = AdditionalPropertiesClientBuilder.class)
public final class IsUnknownDerivedClient {
    @Generated
    private final IsUnknownDerivedsImpl serviceClient;

    /**
     * Initializes an instance of IsUnknownDerivedClient class.
     * 
     * @param serviceClient the service client implementation.
     */
    @Generated
    IsUnknownDerivedClient(IsUnknownDerivedsImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Get call.
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     name: String (Required)
     *      (Optional): {
     *         String: Object (Required)
     *     }
     *     index: int (Required)
     *     age: Double (Optional)
     * }
     * }</pre>
     * 
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return call along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> getWithResponse(RequestOptions requestOptions) {
        return this.serviceClient.getWithResponse(requestOptions);
    }

    /**
     * Put operation.
     * <p><strong>Request Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     name: String (Required)
     *      (Optional): {
     *         String: Object (Required)
     *     }
     *     index: int (Required)
     *     age: Double (Optional)
     * }
     * }</pre>
     * 
     * @param body The model extends from a type that is Record&lt;unknown&gt; type.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> putWithResponse(BinaryData body, RequestOptions requestOptions) {
        return this.serviceClient.putWithResponse(body, requestOptions);
    }

    /**
     * Get call.
     * 
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return call.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public IsUnknownAdditionalPropertiesDerived get() {
        // Generated convenience method for getWithResponse
        RequestOptions requestOptions = new RequestOptions();
        return getWithResponse(requestOptions).getValue().toObject(IsUnknownAdditionalPropertiesDerived.class);
    }

    /**
     * Put operation.
     * 
     * @param body The model extends from a type that is Record&lt;unknown&gt; type.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void put(IsUnknownAdditionalPropertiesDerived body) {
        // Generated convenience method for putWithResponse
        RequestOptions requestOptions = new RequestOptions();
        putWithResponse(BinaryData.fromObject(body), requestOptions).getValue();
    }
}
