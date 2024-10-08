// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.encode.numeric;

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
import com.encode.numeric.implementation.PropertiesImpl;
import com.encode.numeric.models.SafeintAsStringProperty;
import com.encode.numeric.models.Uint32AsStringProperty;

/**
 * Initializes a new instance of the synchronous NumericClient type.
 */
@ServiceClient(builder = NumericClientBuilder.class)
public final class NumericClient {
    @Generated
    private final PropertiesImpl serviceClient;

    /**
     * Initializes an instance of NumericClient class.
     * 
     * @param serviceClient the service client implementation.
     */
    @Generated
    NumericClient(PropertiesImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * The safeintAsString operation.
     * <p><strong>Request Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     value: long (Required)
     * }
     * }</pre>
     * 
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     value: long (Required)
     * }
     * }</pre>
     * 
     * @param body The body parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the response body along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> safeintAsStringWithResponse(BinaryData body, RequestOptions requestOptions) {
        return this.serviceClient.safeintAsStringWithResponse(body, requestOptions);
    }

    /**
     * The uint32AsStringOptional operation.
     * <p><strong>Request Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     value: Integer (Optional)
     * }
     * }</pre>
     * 
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     value: Integer (Optional)
     * }
     * }</pre>
     * 
     * @param body The body parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the response body along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> uint32AsStringOptionalWithResponse(BinaryData body, RequestOptions requestOptions) {
        return this.serviceClient.uint32AsStringOptionalWithResponse(body, requestOptions);
    }

    /**
     * The safeintAsString operation.
     * 
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public SafeintAsStringProperty safeintAsString(SafeintAsStringProperty body) {
        // Generated convenience method for safeintAsStringWithResponse
        RequestOptions requestOptions = new RequestOptions();
        return safeintAsStringWithResponse(BinaryData.fromObject(body), requestOptions).getValue()
            .toObject(SafeintAsStringProperty.class);
    }

    /**
     * The uint32AsStringOptional operation.
     * 
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Uint32AsStringProperty uint32AsStringOptional(Uint32AsStringProperty body) {
        // Generated convenience method for uint32AsStringOptionalWithResponse
        RequestOptions requestOptions = new RequestOptions();
        return uint32AsStringOptionalWithResponse(BinaryData.fromObject(body), requestOptions).getValue()
            .toObject(Uint32AsStringProperty.class);
    }
}
