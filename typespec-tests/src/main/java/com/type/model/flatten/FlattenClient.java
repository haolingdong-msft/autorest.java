// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.type.model.flatten;

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
import com.type.model.flatten.implementation.FlattenClientImpl;
import com.type.model.flatten.models.FlattenModel;
import com.type.model.flatten.models.NestedFlattenModel;

/**
 * Initializes a new instance of the synchronous FlattenClient type.
 */
@ServiceClient(builder = FlattenClientBuilder.class)
public final class FlattenClient {
    @Generated
    private final FlattenClientImpl serviceClient;

    /**
     * Initializes an instance of FlattenClient class.
     * 
     * @param serviceClient the service client implementation.
     */
    @Generated
    FlattenClient(FlattenClientImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * The putFlattenModel operation.
     * <p><strong>Request Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     name: String (Required)
     *     properties (Required): {
     *         description: String (Required)
     *         age: int (Required)
     *     }
     * }
     * }</pre>
     * 
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     name: String (Required)
     *     properties (Required): {
     *         description: String (Required)
     *         age: int (Required)
     *     }
     * }
     * }</pre>
     * 
     * @param input This is the model with one level of flattening.
     * 
     * The input parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return this is the model with one level of flattening along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> putFlattenModelWithResponse(BinaryData input, RequestOptions requestOptions) {
        return this.serviceClient.putFlattenModelWithResponse(input, requestOptions);
    }

    /**
     * The putNestedFlattenModel operation.
     * <p><strong>Request Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     name: String (Required)
     *     properties (Required): {
     *         summary: String (Required)
     *         properties (Required): {
     *             description: String (Required)
     *             age: int (Required)
     *         }
     *     }
     * }
     * }</pre>
     * 
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     name: String (Required)
     *     properties (Required): {
     *         summary: String (Required)
     *         properties (Required): {
     *             description: String (Required)
     *             age: int (Required)
     *         }
     *     }
     * }
     * }</pre>
     * 
     * @param input This is the model with two levels of flattening.
     * 
     * The input parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return this is the model with two levels of flattening along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> putNestedFlattenModelWithResponse(BinaryData input, RequestOptions requestOptions) {
        return this.serviceClient.putNestedFlattenModelWithResponse(input, requestOptions);
    }

    /**
     * The putFlattenModel operation.
     * 
     * @param input This is the model with one level of flattening.
     * 
     * The input parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return this is the model with one level of flattening.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public FlattenModel putFlattenModel(FlattenModel input) {
        // Generated convenience method for putFlattenModelWithResponse
        RequestOptions requestOptions = new RequestOptions();
        return putFlattenModelWithResponse(BinaryData.fromObject(input), requestOptions).getValue()
            .toObject(FlattenModel.class);
    }

    /**
     * The putNestedFlattenModel operation.
     * 
     * @param input This is the model with two levels of flattening.
     * 
     * The input parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return this is the model with two levels of flattening.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public NestedFlattenModel putNestedFlattenModel(NestedFlattenModel input) {
        // Generated convenience method for putNestedFlattenModelWithResponse
        RequestOptions requestOptions = new RequestOptions();
        return putNestedFlattenModelWithResponse(BinaryData.fromObject(input), requestOptions).getValue()
            .toObject(NestedFlattenModel.class);
    }
}
