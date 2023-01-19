// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.cadl.builtin;

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
import com.azure.core.util.DateTimeRfc1123;
import com.cadl.builtin.models.Builtin;
import java.time.OffsetDateTime;

/** Initializes a new instance of the synchronous BuiltinClient type. */
@ServiceClient(builder = BuiltinClientBuilder.class)
public final class BuiltinClient {
    @Generated private final BuiltinAsyncClient client;

    /**
     * Initializes an instance of BuiltinClient class.
     *
     * @param client the async client.
     */
    @Generated
    BuiltinClient(BuiltinAsyncClient client) {
        this.client = client;
    }

    /**
     * The read operation.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>filter</td><td>String</td><td>No</td><td>The filter parameter</td></tr>
     * </table>
     *
     * You can add these to a request with {@link RequestOptions#addQueryParam}
     *
     * <p><strong>Header Parameters</strong>
     *
     * <table border="1">
     *     <caption>Header Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>x-ms-date</td><td>OffsetDateTime</td><td>No</td><td>The dateTime parameter</td></tr>
     * </table>
     *
     * You can add these to a request with {@link RequestOptions#addHeader}
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     formatString (Required): {
     *         base64Encoded: Base64Url (Required)
     *         binary: byte[] (Required)
     *         dateTime: OffsetDateTime (Required)
     *         dateTimeRfc1123: DateTimeRfc1123 (Required)
     *         password: String (Required)
     *         uri: String (Required)
     *         extensibleEnum: String(Value1/Value2) (Required)
     *         extensibleEnumScalar: String(Value1/Value2) (Required)
     *     }
     *     boolean: boolean (Required)
     *     string: String (Required)
     *     bytes: byte[] (Required)
     *     int: int (Required)
     *     safeint: long (Required)
     *     long: long (Required)
     *     float: double (Required)
     *     double: double (Required)
     *     duration: Duration (Required)
     *     dateTime: OffsetDateTime (Required)
     *     stringList (Required): [
     *         String (Required)
     *     ]
     *     bytesDict (Required): {
     *         String: byte[] (Required)
     *     }
     *     url: String (Required)
     * }
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
    public Response<BinaryData> readWithResponse(RequestOptions requestOptions) {
        return this.client.readWithResponse(requestOptions).block();
    }

    /**
     * The write operation.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     formatString (Required): {
     *         base64Encoded: Base64Url (Required)
     *         binary: byte[] (Required)
     *         dateTime: OffsetDateTime (Required)
     *         dateTimeRfc1123: DateTimeRfc1123 (Required)
     *         password: String (Required)
     *         uri: String (Required)
     *         extensibleEnum: String(Value1/Value2) (Required)
     *         extensibleEnumScalar: String(Value1/Value2) (Required)
     *     }
     *     boolean: boolean (Required)
     *     string: String (Required)
     *     bytes: byte[] (Required)
     *     int: int (Required)
     *     safeint: long (Required)
     *     long: long (Required)
     *     float: double (Required)
     *     double: double (Required)
     *     duration: Duration (Required)
     *     dateTime: OffsetDateTime (Required)
     *     stringList (Required): [
     *         String (Required)
     *     ]
     *     bytesDict (Required): {
     *         String: byte[] (Required)
     *     }
     *     url: String (Required)
     * }
     * }</pre>
     *
     * @param body The body parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> writeWithResponse(BinaryData body, RequestOptions requestOptions) {
        return this.client.writeWithResponse(body, requestOptions).block();
    }

    /**
     * The read operation.
     *
     * @param dateTime The dateTime parameter.
     * @param filter The filter parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.exception.HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Builtin read(OffsetDateTime dateTime, String filter) {
        // Generated convenience method for readWithResponse
        RequestOptions requestOptions = new RequestOptions();
        if (dateTime != null) {
            requestOptions.setHeader("x-ms-date", String.valueOf(new DateTimeRfc1123(dateTime)));
        }
        if (filter != null) {
            requestOptions.addQueryParam("filter", filter);
        }
        return readWithResponse(requestOptions).getValue().toObject(Builtin.class);
    }

    /**
     * The read operation.
     *
     * @throws com.azure.core.exception.HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Builtin read() {
        // Generated convenience method for readWithResponse
        RequestOptions requestOptions = new RequestOptions();
        return readWithResponse(requestOptions).getValue().toObject(Builtin.class);
    }
}
