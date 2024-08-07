// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.parameters.spread;

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
import com.parameters.spread.implementation.AliasImpl;
import com.parameters.spread.implementation.models.SpreadAsRequestBodyRequest1;
import com.parameters.spread.implementation.models.SpreadAsRequestParameterRequest;
import com.parameters.spread.implementation.models.SpreadWithMultipleParametersRequest;
import com.parameters.spread.models.SpreadWithMultipleParametersOptions;

/**
 * Initializes a new instance of the synchronous SpreadClient type.
 */
@ServiceClient(builder = SpreadClientBuilder.class)
public final class AliasClient {
    @Generated
    private final AliasImpl serviceClient;

    /**
     * Initializes an instance of AliasClient class.
     * 
     * @param serviceClient the service client implementation.
     */
    @Generated
    AliasClient(AliasImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * The spreadAsRequestBody operation.
     * <p><strong>Request Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     name: String (Required)
     * }
     * }</pre>
     * 
     * @param spreadAsRequestBodyRequest The spreadAsRequestBodyRequest parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> spreadAsRequestBodyWithResponse(BinaryData spreadAsRequestBodyRequest,
        RequestOptions requestOptions) {
        return this.serviceClient.spreadAsRequestBodyWithResponse(spreadAsRequestBodyRequest, requestOptions);
    }

    /**
     * The spreadAsRequestParameter operation.
     * <p><strong>Request Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     name: String (Required)
     * }
     * }</pre>
     * 
     * @param id The id parameter.
     * @param xMsTestHeader The xMsTestHeader parameter.
     * @param spreadAsRequestParameterRequest The spreadAsRequestParameterRequest parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> spreadAsRequestParameterWithResponse(String id, String xMsTestHeader,
        BinaryData spreadAsRequestParameterRequest, RequestOptions requestOptions) {
        return this.serviceClient.spreadAsRequestParameterWithResponse(id, xMsTestHeader,
            spreadAsRequestParameterRequest, requestOptions);
    }

    /**
     * The spreadWithMultipleParameters operation.
     * <p><strong>Request Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     prop1: String (Required)
     *     prop2: String (Required)
     *     prop3: String (Required)
     *     prop4: String (Required)
     *     prop5: String (Required)
     *     prop6: String (Required)
     * }
     * }</pre>
     * 
     * @param id The id parameter.
     * @param xMsTestHeader The xMsTestHeader parameter.
     * @param spreadWithMultipleParametersRequest The spreadWithMultipleParametersRequest parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> spreadWithMultipleParametersWithResponse(String id, String xMsTestHeader,
        BinaryData spreadWithMultipleParametersRequest, RequestOptions requestOptions) {
        return this.serviceClient.spreadWithMultipleParametersWithResponse(id, xMsTestHeader,
            spreadWithMultipleParametersRequest, requestOptions);
    }

    /**
     * The spreadAsRequestBody operation.
     * 
     * @param name The name parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void spreadAsRequestBody(String name) {
        // Generated convenience method for spreadAsRequestBodyWithResponse
        RequestOptions requestOptions = new RequestOptions();
        SpreadAsRequestBodyRequest1 spreadAsRequestBodyRequestObj = new SpreadAsRequestBodyRequest1(name);
        BinaryData spreadAsRequestBodyRequest = BinaryData.fromObject(spreadAsRequestBodyRequestObj);
        spreadAsRequestBodyWithResponse(spreadAsRequestBodyRequest, requestOptions).getValue();
    }

    /**
     * The spreadAsRequestParameter operation.
     * 
     * @param id The id parameter.
     * @param xMsTestHeader The xMsTestHeader parameter.
     * @param name The name parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void spreadAsRequestParameter(String id, String xMsTestHeader, String name) {
        // Generated convenience method for spreadAsRequestParameterWithResponse
        RequestOptions requestOptions = new RequestOptions();
        SpreadAsRequestParameterRequest spreadAsRequestParameterRequestObj = new SpreadAsRequestParameterRequest(name);
        BinaryData spreadAsRequestParameterRequest = BinaryData.fromObject(spreadAsRequestParameterRequestObj);
        spreadAsRequestParameterWithResponse(id, xMsTestHeader, spreadAsRequestParameterRequest, requestOptions)
            .getValue();
    }

    /**
     * The spreadWithMultipleParameters operation.
     * 
     * @param options Options for spreadWithMultipleParameters API.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void spreadWithMultipleParameters(SpreadWithMultipleParametersOptions options) {
        // Generated convenience method for spreadWithMultipleParametersWithResponse
        RequestOptions requestOptions = new RequestOptions();
        String id = options.getId();
        String xMsTestHeader = options.getXMsTestHeader();
        SpreadWithMultipleParametersRequest spreadWithMultipleParametersRequestObj
            = new SpreadWithMultipleParametersRequest(options.getProp1(), options.getProp2(), options.getProp3(),
                options.getProp4(), options.getProp5(), options.getProp6());
        BinaryData spreadWithMultipleParametersRequest = BinaryData.fromObject(spreadWithMultipleParametersRequestObj);
        spreadWithMultipleParametersWithResponse(id, xMsTestHeader, spreadWithMultipleParametersRequest, requestOptions)
            .getValue();
    }
}
