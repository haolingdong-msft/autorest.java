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
import com.cadl.builtin.implementation.BuiltinClientImpl;
import com.cadl.builtin.models.Builtin;
import java.time.OffsetDateTime;

/** Initializes a new instance of the synchronous BuiltinClient type. */
@ServiceClient(builder = BuiltinClientBuilder.class)
public final class BuiltinClient {
    @Generated private final BuiltinClientImpl serviceClient;

    /**
     * Initializes an instance of BuiltinClient class.
     *
     * @param serviceClient the service client implementation.
     */
    @Generated
    BuiltinClient(BuiltinClientImpl serviceClient) {
        this.serviceClient = serviceClient;
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
     *     <tr><td>query-opt</td><td>String</td><td>No</td><td>The queryParamOptional parameter</td></tr>
     *     <tr><td>query-opt-encoded</td><td>String</td><td>No</td><td>The queryParamOptionalEncoded parameter</td></tr>
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
     *     date: LocalDate (Required)
     *     dateTime: OffsetDateTime (Required)
     *     stringList (Required): [
     *         String (Required)
     *     ]
     *     bytesDict (Required): {
     *         String: byte[] (Required)
     *     }
     *     url: String (Required)
     *     nullableFloatDict (Required): {
     *         String: double (Required)
     *     }
     *     encoded (Required): {
     *         timeInSeconds: long (Required)
     *         timeInSecondsFraction: double (Required)
     *         timeInSecondsOptional: Long (Optional)
     *         dateTime: OffsetDateTime (Required)
     *         dateTimeRfc7231: DateTimeRfc1123 (Required)
     *         base64: byte[] (Required)
     *         base64url: Base64Url (Required)
     *     }
     * }
     * }</pre>
     *
     * @param queryParam The queryParam parameter.
     * @param queryParamEncoded The queryParamEncoded parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the response body along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> readWithResponse(
            String queryParam, String queryParamEncoded, RequestOptions requestOptions) {
        return this.serviceClient.readWithResponse(queryParam, queryParamEncoded, requestOptions);
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
     *     date: LocalDate (Required)
     *     dateTime: OffsetDateTime (Required)
     *     stringList (Required): [
     *         String (Required)
     *     ]
     *     bytesDict (Required): {
     *         String: byte[] (Required)
     *     }
     *     url: String (Required)
     *     nullableFloatDict (Required): {
     *         String: double (Required)
     *     }
     *     encoded (Required): {
     *         timeInSeconds: long (Required)
     *         timeInSecondsFraction: double (Required)
     *         timeInSecondsOptional: Long (Optional)
     *         dateTime: OffsetDateTime (Required)
     *         dateTimeRfc7231: DateTimeRfc1123 (Required)
     *         base64: byte[] (Required)
     *         base64url: Base64Url (Required)
     *     }
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
        return this.serviceClient.writeWithResponse(body, requestOptions);
    }

    /**
     * The read operation.
     *
     * @param queryParam The queryParam parameter.
     * @param queryParamEncoded The queryParamEncoded parameter.
     * @param dateTime The dateTime parameter.
     * @param filter The filter parameter.
     * @param queryParamOptional The queryParamOptional parameter.
     * @param queryParamOptionalEncoded The queryParamOptionalEncoded parameter.
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
    public Builtin read(
            String queryParam,
            String queryParamEncoded,
            OffsetDateTime dateTime,
            String filter,
            String queryParamOptional,
            String queryParamOptionalEncoded) {
        // Generated convenience method for readWithResponse
        RequestOptions requestOptions = new RequestOptions();
        if (dateTime != null) {
            requestOptions.setHeader("x-ms-date", String.valueOf(new DateTimeRfc1123(dateTime)));
        }
        if (filter != null) {
            requestOptions.addQueryParam("filter", filter, false);
        }
        if (queryParamOptional != null) {
            requestOptions.addQueryParam("query-opt", queryParamOptional, false);
        }
        if (queryParamOptionalEncoded != null) {
            requestOptions.addQueryParam("query-opt-encoded", queryParamOptionalEncoded, true);
        }
        return readWithResponse(queryParam, queryParamEncoded, requestOptions).getValue().toObject(Builtin.class);
    }

    /**
     * The read operation.
     *
     * @param queryParam The queryParam parameter.
     * @param queryParamEncoded The queryParamEncoded parameter.
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
    public Builtin read(String queryParam, String queryParamEncoded) {
        // Generated convenience method for readWithResponse
        RequestOptions requestOptions = new RequestOptions();
        return readWithResponse(queryParam, queryParamEncoded, requestOptions).getValue().toObject(Builtin.class);
    }
}
