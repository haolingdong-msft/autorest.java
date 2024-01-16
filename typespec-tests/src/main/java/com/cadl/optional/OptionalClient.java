// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.cadl.optional;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.exception.ClientAuthenticationException;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.exception.ResourceModifiedException;
import com.azure.core.exception.ResourceNotFoundException;
import com.azure.core.http.HttpHeaderName;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import com.cadl.optional.implementation.OptionalOpsImpl;
import com.cadl.optional.models.AllPropertiesOptional;
import com.cadl.optional.models.Optional;

/**
 * <!-- start generated doc -->
 * Initializes a new instance of the synchronous OptionalClient type.
 * <!-- end generated doc -->
 */
@ServiceClient(builder = OptionalClientBuilder.class)
public final class OptionalClient {
    @Generated
    private final OptionalOpsImpl serviceClient;

    /**
     * Initializes an instance of OptionalClient class.
     * 
     * @param serviceClient the service client implementation.
     */
    @Generated
    OptionalClient(OptionalOpsImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * The put operation.
     * <p>
     * <strong>Query Parameters</strong>
     * </p>
     * <table border="1">
     * <caption>Query Parameters</caption>
     * <tr>
     * <th>Name</th>
     * <th>Type</th>
     * <th>Required</th>
     * <th>Description</th>
     * </tr>
     * <tr>
     * <td>booleanNullable</td>
     * <td>Boolean</td>
     * <td>No</td>
     * <td>Boolean with `true` and `false` values.</td>
     * </tr>
     * <tr>
     * <td>string</td>
     * <td>String</td>
     * <td>No</td>
     * <td>A sequence of textual characters.</td>
     * </tr>
     * <tr>
     * <td>stringNullable</td>
     * <td>String</td>
     * <td>No</td>
     * <td>A sequence of textual characters.</td>
     * </tr>
     * </table>
     * You can add these to a request with {@link RequestOptions#addQueryParam}
     * <p>
     * <strong>Header Parameters</strong>
     * </p>
     * <table border="1">
     * <caption>Header Parameters</caption>
     * <tr>
     * <th>Name</th>
     * <th>Type</th>
     * <th>Required</th>
     * <th>Description</th>
     * </tr>
     * <tr>
     * <td>request-header-optional</td>
     * <td>String</td>
     * <td>No</td>
     * <td>A sequence of textual characters.</td>
     * </tr>
     * </table>
     * You can add these to a request with {@link RequestOptions#addHeader}
     * <p>
     * <strong>Request Body Schema</strong>
     * </p>
     * <pre>{@code
     * {
     *     boolean: Boolean (Optional)
     *     booleanNullable: Boolean (Optional)
     *     booleanRequired: boolean (Required)
     *     booleanRequiredNullable: Boolean (Required)
     *     string: String (Optional)
     *     stringNullable: String (Optional)
     *     stringRequired: String (Required)
     *     stringRequiredNullable: String (Required)
     *     bytes: byte[] (Optional)
     *     int: Integer (Optional)
     *     long: Long (Optional)
     *     float: Double (Optional)
     *     double: Double (Optional)
     *     duration: Duration (Optional)
     *     dateTime: OffsetDateTime (Optional)
     *     stringList (Optional): [
     *         String (Optional)
     *     ]
     *     bytesDict (Optional): {
     *         String: byte[] (Required)
     *     }
     * }
     * }</pre>
     * <p>
     * <strong>Response Body Schema</strong>
     * </p>
     * <pre>{@code
     * {
     *     boolean: Boolean (Optional)
     *     booleanNullable: Boolean (Optional)
     *     booleanRequired: Boolean (Optional)
     *     booleanRequiredNullable: Boolean (Optional)
     *     string: String (Optional)
     *     stringNullable: String (Optional)
     *     stringRequired: String (Optional)
     *     stringRequiredNullable: String (Optional)
     *     bytes: byte[] (Optional)
     *     int: Integer (Optional)
     *     long: Long (Optional)
     *     float: Double (Optional)
     *     double: Double (Optional)
     *     duration: Duration (Optional)
     *     dateTime: OffsetDateTime (Optional)
     *     stringList (Optional): [
     *         String (Optional)
     *     ]
     *     bytesDict (Optional): {
     *         String: byte[] (Required)
     *     }
     *     immutable (Optional): {
     *         stringReadWriteRequired: String (Required)
     *         stringReadOnlyOptional: String (Optional)
     *     }
     * }
     * }</pre>
     * 
     * @param requestHeaderRequired A sequence of textual characters.
     * @param booleanRequired Boolean with `true` and `false` values.
     * @param booleanRequiredNullable Boolean with `true` and `false` values.
     * @param stringRequired A sequence of textual characters.
     * @param stringRequiredNullable A sequence of textual characters.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the response body along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> putWithResponse(String requestHeaderRequired, boolean booleanRequired,
        Boolean booleanRequiredNullable, String stringRequired, String stringRequiredNullable,
        RequestOptions requestOptions) {
        return this.serviceClient.putWithResponse(requestHeaderRequired, booleanRequired, booleanRequiredNullable,
            stringRequired, stringRequiredNullable, requestOptions);
    }

    /**
     * The put operation.
     * 
     * @param requestHeaderRequired A sequence of textual characters.
     * @param booleanRequired Boolean with `true` and `false` values.
     * @param booleanRequiredNullable Boolean with `true` and `false` values.
     * @param stringRequired A sequence of textual characters.
     * @param stringRequiredNullable A sequence of textual characters.
     * @param requestHeaderOptional A sequence of textual characters.
     * @param booleanNullable Boolean with `true` and `false` values.
     * @param string A sequence of textual characters.
     * @param stringNullable A sequence of textual characters.
     * @param optional The optional parameter.
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
    public AllPropertiesOptional put(String requestHeaderRequired, boolean booleanRequired,
        Boolean booleanRequiredNullable, String stringRequired, String stringRequiredNullable,
        String requestHeaderOptional, Boolean booleanNullable, String string, String stringNullable,
        Optional optional) {
        // Generated convenience method for putWithResponse
        RequestOptions requestOptions = new RequestOptions();
        if (requestHeaderOptional != null) {
            requestOptions.setHeader(HttpHeaderName.fromString("request-header-optional"), requestHeaderOptional);
        }
        if (booleanNullable != null) {
            requestOptions.addQueryParam("booleanNullable", String.valueOf(booleanNullable), false);
        }
        if (string != null) {
            requestOptions.addQueryParam("string", string, false);
        }
        if (stringNullable != null) {
            requestOptions.addQueryParam("stringNullable", stringNullable, false);
        }
        if (optional != null) {
            requestOptions.setBody(BinaryData.fromObject(optional));
        }
        return putWithResponse(requestHeaderRequired, booleanRequired, booleanRequiredNullable, stringRequired,
            stringRequiredNullable, requestOptions).getValue().toObject(AllPropertiesOptional.class);
    }

    /**
     * The put operation.
     * 
     * @param requestHeaderRequired A sequence of textual characters.
     * @param booleanRequired Boolean with `true` and `false` values.
     * @param booleanRequiredNullable Boolean with `true` and `false` values.
     * @param stringRequired A sequence of textual characters.
     * @param stringRequiredNullable A sequence of textual characters.
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
    public AllPropertiesOptional put(String requestHeaderRequired, boolean booleanRequired,
        Boolean booleanRequiredNullable, String stringRequired, String stringRequiredNullable) {
        // Generated convenience method for putWithResponse
        RequestOptions requestOptions = new RequestOptions();
        return putWithResponse(requestHeaderRequired, booleanRequired, booleanRequiredNullable, stringRequired,
            stringRequiredNullable, requestOptions).getValue().toObject(AllPropertiesOptional.class);
    }
}
