// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package fixtures.header;

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
import fixtures.header.implementation.HeadersImpl;
import java.time.Duration;
import java.time.OffsetDateTime;

/**
 * Initializes a new instance of the synchronous AutoRestSwaggerBatHeaderServiceClient type.
 */
@ServiceClient(builder = AutoRestSwaggerBatHeaderServiceClientBuilder.class)
public final class AutoRestSwaggerBatHeaderServiceClient {
    @Generated
    private final HeadersImpl serviceClient;

    /**
     * Initializes an instance of AutoRestSwaggerBatHeaderServiceClient class.
     * 
     * @param serviceClient the service client implementation.
     */
    @Generated
    AutoRestSwaggerBatHeaderServiceClient(HeadersImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Send a post request with header value "User-Agent": "overwrite".
     * 
     * @param userAgent Send a post request with header value "User-Agent": "overwrite".
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return empty Response along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> paramExistingKeyWithResponse(String userAgent, RequestOptions requestOptions) {
        return this.serviceClient.paramExistingKeyWithResponse(userAgent, requestOptions);
    }

    /**
     * Get a response with header value "User-Agent": "overwrite".
     * 
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return a response with header value "User-Agent": "overwrite" along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> responseExistingKeyWithResponse(RequestOptions requestOptions) {
        return this.serviceClient.responseExistingKeyWithResponse(requestOptions);
    }

    /**
     * Send a post request with header value "Content-Type": "text/html".
     * 
     * @param contentType Send a post request with header value "Content-Type": "text/html".
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return empty Response along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> paramProtectedKeyWithResponse(String contentType, RequestOptions requestOptions) {
        return this.serviceClient.paramProtectedKeyWithResponse(contentType, requestOptions);
    }

    /**
     * Get a response with header value "Content-Type": "text/html".
     * 
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return a response with header value "Content-Type": "text/html" along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> responseProtectedKeyWithResponse(RequestOptions requestOptions) {
        return this.serviceClient.responseProtectedKeyWithResponse(requestOptions);
    }

    /**
     * Send a post request with header values "scenario": "positive", "value": 1 or "scenario": "negative", "value": -2.
     * 
     * @param scenario Send a post request with header values "scenario": "positive" or "negative".
     * @param value Send a post request with header values 1 or -2.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return empty Response along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> paramIntegerWithResponse(String scenario, int value, RequestOptions requestOptions) {
        return this.serviceClient.paramIntegerWithResponse(scenario, value, requestOptions);
    }

    /**
     * Get a response with header value "value": 1 or -2.
     * 
     * @param scenario Send a post request with header values "scenario": "positive" or "negative".
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return a response with header value "value": 1 or -2 along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> responseIntegerWithResponse(String scenario, RequestOptions requestOptions) {
        return this.serviceClient.responseIntegerWithResponse(scenario, requestOptions);
    }

    /**
     * Send a post request with header values "scenario": "positive", "value": 105 or "scenario": "negative", "value":
     * -2.
     * 
     * @param scenario Send a post request with header values "scenario": "positive" or "negative".
     * @param value Send a post request with header values 105 or -2.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return empty Response along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> paramLongWithResponse(String scenario, long value, RequestOptions requestOptions) {
        return this.serviceClient.paramLongWithResponse(scenario, value, requestOptions);
    }

    /**
     * Get a response with header value "value": 105 or -2.
     * 
     * @param scenario Send a post request with header values "scenario": "positive" or "negative".
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return a response with header value "value": 105 or -2 along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> responseLongWithResponse(String scenario, RequestOptions requestOptions) {
        return this.serviceClient.responseLongWithResponse(scenario, requestOptions);
    }

    /**
     * Send a post request with header values "scenario": "positive", "value": 0.07 or "scenario": "negative", "value":
     * -3.0.
     * 
     * @param scenario Send a post request with header values "scenario": "positive" or "negative".
     * @param value Send a post request with header values 0.07 or -3.0.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return empty Response along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> paramFloatWithResponse(String scenario, float value, RequestOptions requestOptions) {
        return this.serviceClient.paramFloatWithResponse(scenario, value, requestOptions);
    }

    /**
     * Get a response with header value "value": 0.07 or -3.0.
     * 
     * @param scenario Send a post request with header values "scenario": "positive" or "negative".
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return a response with header value "value": 0.07 or -3.0 along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> responseFloatWithResponse(String scenario, RequestOptions requestOptions) {
        return this.serviceClient.responseFloatWithResponse(scenario, requestOptions);
    }

    /**
     * Send a post request with header values "scenario": "positive", "value": 7e120 or "scenario": "negative", "value":
     * -3.0.
     * 
     * @param scenario Send a post request with header values "scenario": "positive" or "negative".
     * @param value Send a post request with header values 7e120 or -3.0.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return empty Response along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> paramDoubleWithResponse(String scenario, double value, RequestOptions requestOptions) {
        return this.serviceClient.paramDoubleWithResponse(scenario, value, requestOptions);
    }

    /**
     * Get a response with header value "value": 7e120 or -3.0.
     * 
     * @param scenario Send a post request with header values "scenario": "positive" or "negative".
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return a response with header value "value": 7e120 or -3.0 along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> responseDoubleWithResponse(String scenario, RequestOptions requestOptions) {
        return this.serviceClient.responseDoubleWithResponse(scenario, requestOptions);
    }

    /**
     * Send a post request with header values "scenario": "true", "value": true or "scenario": "false", "value": false.
     * 
     * @param scenario Send a post request with header values "scenario": "true" or "false".
     * @param value Send a post request with header values true or false.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return empty Response along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> paramBoolWithResponse(String scenario, boolean value, RequestOptions requestOptions) {
        return this.serviceClient.paramBoolWithResponse(scenario, value, requestOptions);
    }

    /**
     * Get a response with header value "value": true or false.
     * 
     * @param scenario Send a post request with header values "scenario": "true" or "false".
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return a response with header value "value": true or false along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> responseBoolWithResponse(String scenario, RequestOptions requestOptions) {
        return this.serviceClient.responseBoolWithResponse(scenario, requestOptions);
    }

    /**
     * Send a post request with header values "scenario": "valid", "value": "The quick brown fox jumps over the lazy
     * dog" or "scenario": "null", "value": null or "scenario": "empty", "value": "".
     * <p><strong>Header Parameters</strong></p>
     * <table border="1">
     * <caption>Header Parameters</caption>
     * <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     * <tr><td>value</td><td>String</td><td>No</td><td>Send a post request with header values "The quick brown fox jumps
     * over the lazy dog" or null or ""</td></tr>
     * </table>
     * You can add these to a request with {@link RequestOptions#addHeader}
     * 
     * @param scenario Send a post request with header values "scenario": "valid" or "null" or "empty".
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return empty Response along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> paramStringWithResponse(String scenario, RequestOptions requestOptions) {
        return this.serviceClient.paramStringWithResponse(scenario, requestOptions);
    }

    /**
     * Get a response with header values "The quick brown fox jumps over the lazy dog" or null or "".
     * 
     * @param scenario Send a post request with header values "scenario": "valid" or "null" or "empty".
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return a response with header values "The quick brown fox jumps over the lazy dog" or null or "" along with
     * {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> responseStringWithResponse(String scenario, RequestOptions requestOptions) {
        return this.serviceClient.responseStringWithResponse(scenario, requestOptions);
    }

    /**
     * Send a post request with header values "scenario": "valid", "value": "2010-01-01" or "scenario": "min", "value":
     * "0001-01-01".
     * 
     * @param scenario Send a post request with header values "scenario": "valid" or "min".
     * @param value Send a post request with header values "2010-01-01" or "0001-01-01".
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return empty Response along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> paramDateWithResponse(String scenario, String value, RequestOptions requestOptions) {
        return this.serviceClient.paramDateWithResponse(scenario, value, requestOptions);
    }

    /**
     * Get a response with header values "2010-01-01" or "0001-01-01".
     * 
     * @param scenario Send a post request with header values "scenario": "valid" or "min".
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return a response with header values "2010-01-01" or "0001-01-01" along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> responseDateWithResponse(String scenario, RequestOptions requestOptions) {
        return this.serviceClient.responseDateWithResponse(scenario, requestOptions);
    }

    /**
     * Send a post request with header values "scenario": "valid", "value": "2010-01-01T12:34:56Z" or "scenario": "min",
     * "value": "0001-01-01T00:00:00Z".
     * 
     * @param scenario Send a post request with header values "scenario": "valid" or "min".
     * @param value Send a post request with header values "2010-01-01T12:34:56Z" or "0001-01-01T00:00:00Z".
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return empty Response along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> paramDatetimeWithResponse(String scenario, OffsetDateTime value,
        RequestOptions requestOptions) {
        return this.serviceClient.paramDatetimeWithResponse(scenario, value, requestOptions);
    }

    /**
     * Get a response with header values "2010-01-01T12:34:56Z" or "0001-01-01T00:00:00Z".
     * 
     * @param scenario Send a post request with header values "scenario": "valid" or "min".
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return a response with header values "2010-01-01T12:34:56Z" or "0001-01-01T00:00:00Z" along with
     * {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> responseDatetimeWithResponse(String scenario, RequestOptions requestOptions) {
        return this.serviceClient.responseDatetimeWithResponse(scenario, requestOptions);
    }

    /**
     * Send a post request with header values "scenario": "valid", "value": "Wed, 01 Jan 2010 12:34:56 GMT" or
     * "scenario": "min", "value": "Mon, 01 Jan 0001 00:00:00 GMT".
     * <p><strong>Header Parameters</strong></p>
     * <table border="1">
     * <caption>Header Parameters</caption>
     * <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     * <tr><td>value</td><td>OffsetDateTime</td><td>No</td><td>Send a post request with header values "Wed, 01 Jan 2010
     * 12:34:56 GMT" or "Mon, 01 Jan 0001 00:00:00 GMT"</td></tr>
     * </table>
     * You can add these to a request with {@link RequestOptions#addHeader}
     * 
     * @param scenario Send a post request with header values "scenario": "valid" or "min".
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return empty Response along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> paramDatetimeRfc1123WithResponse(String scenario, RequestOptions requestOptions) {
        return this.serviceClient.paramDatetimeRfc1123WithResponse(scenario, requestOptions);
    }

    /**
     * Get a response with header values "Wed, 01 Jan 2010 12:34:56 GMT" or "Mon, 01 Jan 0001 00:00:00 GMT".
     * 
     * @param scenario Send a post request with header values "scenario": "valid" or "min".
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return a response with header values "Wed, 01 Jan 2010 12:34:56 GMT" or "Mon, 01 Jan 0001 00:00:00 GMT" along
     * with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> responseDatetimeRfc1123WithResponse(String scenario, RequestOptions requestOptions) {
        return this.serviceClient.responseDatetimeRfc1123WithResponse(scenario, requestOptions);
    }

    /**
     * Send a post request with header values "scenario": "valid", "value": "P123DT22H14M12.011S".
     * 
     * @param scenario Send a post request with header values "scenario": "valid".
     * @param value Send a post request with header values "P123DT22H14M12.011S".
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return empty Response along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> paramDurationWithResponse(String scenario, Duration value, RequestOptions requestOptions) {
        return this.serviceClient.paramDurationWithResponse(scenario, value, requestOptions);
    }

    /**
     * Get a response with header values "P123DT22H14M12.011S".
     * 
     * @param scenario Send a post request with header values "scenario": "valid".
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return a response with header values "P123DT22H14M12.011S" along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> responseDurationWithResponse(String scenario, RequestOptions requestOptions) {
        return this.serviceClient.responseDurationWithResponse(scenario, requestOptions);
    }

    /**
     * Send a post request with header values "scenario": "valid", "value": "啊齄丂狛狜隣郎隣兀﨩".
     * 
     * @param scenario Send a post request with header values "scenario": "valid".
     * @param value Send a post request with header values "啊齄丂狛狜隣郎隣兀﨩".
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return empty Response along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> paramByteWithResponse(String scenario, byte[] value, RequestOptions requestOptions) {
        return this.serviceClient.paramByteWithResponse(scenario, value, requestOptions);
    }

    /**
     * Get a response with header values "啊齄丂狛狜隣郎隣兀﨩".
     * 
     * @param scenario Send a post request with header values "scenario": "valid".
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return a response with header values "啊齄丂狛狜隣郎隣兀﨩" along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> responseByteWithResponse(String scenario, RequestOptions requestOptions) {
        return this.serviceClient.responseByteWithResponse(scenario, requestOptions);
    }

    /**
     * Send a post request with header values "scenario": "valid", "value": "GREY" or "scenario": "null", "value": null.
     * <p><strong>Header Parameters</strong></p>
     * <table border="1">
     * <caption>Header Parameters</caption>
     * <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     * <tr><td>value</td><td>String</td><td>No</td><td>Send a post request with header values 'GREY' . Allowed values:
     * "White", "black", "GREY".</td></tr>
     * </table>
     * You can add these to a request with {@link RequestOptions#addHeader}
     * 
     * @param scenario Send a post request with header values "scenario": "valid" or "null" or "empty".
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return empty Response along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> paramEnumWithResponse(String scenario, RequestOptions requestOptions) {
        return this.serviceClient.paramEnumWithResponse(scenario, requestOptions);
    }

    /**
     * Get a response with header values "GREY" or null.
     * 
     * @param scenario Send a post request with header values "scenario": "valid" or "null" or "empty".
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return a response with header values "GREY" or null along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> responseEnumWithResponse(String scenario, RequestOptions requestOptions) {
        return this.serviceClient.responseEnumWithResponse(scenario, requestOptions);
    }

    /**
     * Send x-ms-client-request-id = 9C4D50EE-2D56-4CD3-8152-34347DC9F2B0 in the header of the request.
     * 
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return empty Response indicates that x-ms-client-request-id was successfuly received along with
     * {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> customRequestIdWithResponse(RequestOptions requestOptions) {
        return this.serviceClient.customRequestIdWithResponse(requestOptions);
    }
}
