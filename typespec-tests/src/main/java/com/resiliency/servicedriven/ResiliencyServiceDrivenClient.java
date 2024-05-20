// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.resiliency.servicedriven;

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
import com.azure.core.util.logging.ClientLogger;
import com.resiliency.servicedriven.implementation.ResiliencyServiceDrivenClientImpl;
import java.util.Arrays;

/**
 * Initializes a new instance of the synchronous ResiliencyServiceDrivenClient type.
 */
@ServiceClient(builder = ResiliencyServiceDrivenClientBuilder.class)
public final class ResiliencyServiceDrivenClient {
    @Generated
    private final ResiliencyServiceDrivenClientImpl serviceClient;

    /**
     * Initializes an instance of ResiliencyServiceDrivenClient class.
     * 
     * @param serviceClient the service client implementation.
     */
    @Generated
    ResiliencyServiceDrivenClient(ResiliencyServiceDrivenClientImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Added operation.
     * 
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> addOperationWithResponse(RequestOptions requestOptions) {
        return this.serviceClient.addOperationWithResponse(requestOptions);
    }

    /**
     * Test that grew up from accepting no parameters to an optional input parameter.
     * <p><strong>Query Parameters</strong></p>
     * <table border="1">
     * <caption>Query Parameters</caption>
     * <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     * <tr><td>new-parameter</td><td>String</td><td>No</td><td>A sequence of textual characters.
     * 
     * The newParameter parameter</td></tr>
     * </table>
     * You can add these to a request with {@link RequestOptions#addQueryParam}
     * 
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> fromNoneWithResponse(RequestOptions requestOptions) {
        return this.serviceClient.fromNoneWithResponse(requestOptions);
    }

    /**
     * Operation that grew up from accepting one required parameter to accepting a required parameter and an optional
     * parameter.
     * <p><strong>Query Parameters</strong></p>
     * <table border="1">
     * <caption>Query Parameters</caption>
     * <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     * <tr><td>new-parameter</td><td>String</td><td>No</td><td>A sequence of textual characters.
     * 
     * The newParameter parameter</td></tr>
     * </table>
     * You can add these to a request with {@link RequestOptions#addQueryParam}
     * 
     * @param parameter A sequence of textual characters.
     * 
     * The parameter parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> fromOneRequiredWithResponse(String parameter, RequestOptions requestOptions) {
        return this.serviceClient.fromOneRequiredWithResponse(parameter, requestOptions);
    }

    /**
     * Tests that we can grow up an operation from accepting one optional parameter to accepting two optional
     * parameters.
     * <p><strong>Query Parameters</strong></p>
     * <table border="1">
     * <caption>Query Parameters</caption>
     * <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     * <tr><td>parameter</td><td>String</td><td>No</td><td>A sequence of textual characters.
     * 
     * The parameter parameter</td></tr>
     * <tr><td>new-parameter</td><td>String</td><td>No</td><td>A sequence of textual characters.
     * 
     * The newParameter parameter</td></tr>
     * </table>
     * You can add these to a request with {@link RequestOptions#addQueryParam}
     * 
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> fromOneOptionalWithResponse(RequestOptions requestOptions) {
        return this.serviceClient.fromOneOptionalWithResponse(requestOptions);
    }

    /**
     * Added operation.
     * 
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void addOperation() {
        // Generated convenience method for addOperationWithResponse
        RequestOptions requestOptions = new RequestOptions();
        addOperationWithResponse(requestOptions).getValue();
    }

    /**
     * Test that grew up from accepting no parameters to an optional input parameter.
     * 
     * @param newParameter A sequence of textual characters.
     * 
     * The newParameter parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void fromNone(String newParameter) {
        // Generated convenience method for fromNoneWithResponse
        RequestOptions requestOptions = new RequestOptions();
        if (!Arrays.asList("v2").contains(serviceClient.getServiceVersion().getVersion())) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Parameter newParameter is only available in api-version v2."));
        }
        if (newParameter != null) {
            requestOptions.addQueryParam("new-parameter", newParameter, false);
        }
        fromNoneWithResponse(requestOptions).getValue();
    }

    /**
     * Test that grew up from accepting no parameters to an optional input parameter.
     * 
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void fromNone() {
        // Generated convenience method for fromNoneWithResponse
        RequestOptions requestOptions = new RequestOptions();
        fromNoneWithResponse(requestOptions).getValue();
    }

    /**
     * Operation that grew up from accepting one required parameter to accepting a required parameter and an optional
     * parameter.
     * 
     * @param parameter A sequence of textual characters.
     * 
     * The parameter parameter.
     * @param newParameter A sequence of textual characters.
     * 
     * The newParameter parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void fromOneRequired(String parameter, String newParameter) {
        // Generated convenience method for fromOneRequiredWithResponse
        RequestOptions requestOptions = new RequestOptions();
        if (!Arrays.asList("v2").contains(serviceClient.getServiceVersion().getVersion())) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Parameter newParameter is only available in api-version v2."));
        }
        if (newParameter != null) {
            requestOptions.addQueryParam("new-parameter", newParameter, false);
        }
        fromOneRequiredWithResponse(parameter, requestOptions).getValue();
    }

    /**
     * Operation that grew up from accepting one required parameter to accepting a required parameter and an optional
     * parameter.
     * 
     * @param parameter A sequence of textual characters.
     * 
     * The parameter parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void fromOneRequired(String parameter) {
        // Generated convenience method for fromOneRequiredWithResponse
        RequestOptions requestOptions = new RequestOptions();
        fromOneRequiredWithResponse(parameter, requestOptions).getValue();
    }

    /**
     * Tests that we can grow up an operation from accepting one optional parameter to accepting two optional
     * parameters.
     * 
     * @param parameter A sequence of textual characters.
     * 
     * The parameter parameter.
     * @param newParameter A sequence of textual characters.
     * 
     * The newParameter parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void fromOneOptional(String parameter, String newParameter) {
        // Generated convenience method for fromOneOptionalWithResponse
        RequestOptions requestOptions = new RequestOptions();
        if (!Arrays.asList("v2").contains(serviceClient.getServiceVersion().getVersion())) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Parameter newParameter is only available in api-version v2."));
        }
        if (parameter != null) {
            requestOptions.addQueryParam("parameter", parameter, false);
        }
        if (newParameter != null) {
            requestOptions.addQueryParam("new-parameter", newParameter, false);
        }
        fromOneOptionalWithResponse(requestOptions).getValue();
    }

    /**
     * Tests that we can grow up an operation from accepting one optional parameter to accepting two optional
     * parameters.
     * 
     * @param parameter A sequence of textual characters.
     * 
     * The parameter parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void fromOneOptional(String parameter) {
        // Generated convenience method for fromOneOptionalWithResponse
        RequestOptions requestOptions = new RequestOptions();
        if (parameter != null) {
            requestOptions.addQueryParam("parameter", parameter, false);
        }
        fromOneOptionalWithResponse(requestOptions).getValue();
    }

    /**
     * Tests that we can grow up an operation from accepting one optional parameter to accepting two optional
     * parameters.
     * 
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void fromOneOptional() {
        // Generated convenience method for fromOneOptionalWithResponse
        RequestOptions requestOptions = new RequestOptions();
        fromOneOptionalWithResponse(requestOptions).getValue();
    }

    private static final ClientLogger LOGGER = new ClientLogger(ResiliencyServiceDrivenClient.class);
}
