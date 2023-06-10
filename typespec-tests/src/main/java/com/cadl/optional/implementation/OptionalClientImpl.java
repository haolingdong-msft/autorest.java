// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.cadl.optional.implementation;

import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.Put;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.exception.ClientAuthenticationException;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.exception.ResourceModifiedException;
import com.azure.core.exception.ResourceNotFoundException;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.policy.CookiePolicy;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.UserAgentPolicy;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.util.BinaryData;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.core.util.serializer.JacksonAdapter;
import com.azure.core.util.serializer.SerializerAdapter;
import reactor.core.publisher.Mono;

/** Initializes a new instance of the OptionalClient type. */
public final class OptionalClientImpl {
    /** The proxy service used to perform REST calls. */
    private final OptionalClientService service;

    /** Server parameter. */
    private final String endpoint;

    /**
     * Gets Server parameter.
     *
     * @return the endpoint value.
     */
    public String getEndpoint() {
        return this.endpoint;
    }

    /** The HTTP pipeline to send requests through. */
    private final HttpPipeline httpPipeline;

    /**
     * Gets The HTTP pipeline to send requests through.
     *
     * @return the httpPipeline value.
     */
    public HttpPipeline getHttpPipeline() {
        return this.httpPipeline;
    }

    /** The serializer to serialize an object into a string. */
    private final SerializerAdapter serializerAdapter;

    /**
     * Gets The serializer to serialize an object into a string.
     *
     * @return the serializerAdapter value.
     */
    public SerializerAdapter getSerializerAdapter() {
        return this.serializerAdapter;
    }

    /**
     * Initializes an instance of OptionalClient client.
     *
     * @param endpoint Server parameter.
     */
    public OptionalClientImpl(String endpoint) {
        this(
                new HttpPipelineBuilder()
                        .policies(new UserAgentPolicy(), new RetryPolicy(), new CookiePolicy())
                        .build(),
                JacksonAdapter.createDefaultSerializerAdapter(),
                endpoint);
    }

    /**
     * Initializes an instance of OptionalClient client.
     *
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param endpoint Server parameter.
     */
    public OptionalClientImpl(HttpPipeline httpPipeline, String endpoint) {
        this(httpPipeline, JacksonAdapter.createDefaultSerializerAdapter(), endpoint);
    }

    /**
     * Initializes an instance of OptionalClient client.
     *
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param serializerAdapter The serializer to serialize an object into a string.
     * @param endpoint Server parameter.
     */
    public OptionalClientImpl(HttpPipeline httpPipeline, SerializerAdapter serializerAdapter, String endpoint) {
        this.httpPipeline = httpPipeline;
        this.serializerAdapter = serializerAdapter;
        this.endpoint = endpoint;
        this.service = RestProxy.create(OptionalClientService.class, this.httpPipeline, this.getSerializerAdapter());
    }

    /**
     * The interface defining all the services for OptionalClient to be used by the proxy service to perform REST calls.
     */
    @Host("{endpoint}")
    @ServiceInterface(name = "OptionalClient")
    public interface OptionalClientService {
        @Put("/optional/put")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(
                value = ClientAuthenticationException.class,
                code = {401})
        @UnexpectedResponseExceptionType(
                value = ResourceNotFoundException.class,
                code = {404})
        @UnexpectedResponseExceptionType(
                value = ResourceModifiedException.class,
                code = {409})
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Mono<Response<BinaryData>> put(
                @HostParam("endpoint") String endpoint,
                @HeaderParam("request-header-required") String requestHeaderRequired,
                @QueryParam("booleanRequired") boolean booleanRequired,
                @QueryParam("booleanRequiredNullable") Boolean booleanRequiredNullable,
                @QueryParam("stringRequired") String stringRequired,
                @QueryParam("stringRequiredNullable") String stringRequiredNullable,
                @HeaderParam("accept") String accept,
                RequestOptions requestOptions,
                Context context);

        @Put("/optional/put")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(
                value = ClientAuthenticationException.class,
                code = {401})
        @UnexpectedResponseExceptionType(
                value = ResourceNotFoundException.class,
                code = {404})
        @UnexpectedResponseExceptionType(
                value = ResourceModifiedException.class,
                code = {409})
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Response<BinaryData> putSync(
                @HostParam("endpoint") String endpoint,
                @HeaderParam("request-header-required") String requestHeaderRequired,
                @QueryParam("booleanRequired") boolean booleanRequired,
                @QueryParam("booleanRequiredNullable") Boolean booleanRequiredNullable,
                @QueryParam("stringRequired") String stringRequired,
                @QueryParam("stringRequiredNullable") String stringRequiredNullable,
                @HeaderParam("accept") String accept,
                RequestOptions requestOptions,
                Context context);
    }

    /**
     * The put operation.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>booleanNullable</td><td>Boolean</td><td>No</td><td>Boolean with `true` and `false` values.</td></tr>
     *     <tr><td>string</td><td>String</td><td>No</td><td>A sequence of textual characters.</td></tr>
     *     <tr><td>stringNullable</td><td>String</td><td>No</td><td>A sequence of textual characters.</td></tr>
     * </table>
     *
     * You can add these to a request with {@link RequestOptions#addQueryParam}
     *
     * <p><strong>Header Parameters</strong>
     *
     * <table border="1">
     *     <caption>Header Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>request-header-optional</td><td>String</td><td>No</td><td>A sequence of textual characters.</td></tr>
     * </table>
     *
     * You can add these to a request with {@link RequestOptions#addHeader}
     *
     * <p><strong>Request Body Schema</strong>
     *
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
     *         String: byte[] (Optional)
     *     }
     * }
     * }</pre>
     *
     * <p><strong>Response Body Schema</strong>
     *
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
     *         String: byte[] (Optional)
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
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> putWithResponseAsync(
            String requestHeaderRequired,
            boolean booleanRequired,
            Boolean booleanRequiredNullable,
            String stringRequired,
            String stringRequiredNullable,
            RequestOptions requestOptions) {
        final String accept = "application/json";
        return FluxUtil.withContext(
                context ->
                        service.put(
                                this.getEndpoint(),
                                requestHeaderRequired,
                                booleanRequired,
                                booleanRequiredNullable,
                                stringRequired,
                                stringRequiredNullable,
                                accept,
                                requestOptions,
                                context));
    }

    /**
     * The put operation.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>booleanNullable</td><td>Boolean</td><td>No</td><td>Boolean with `true` and `false` values.</td></tr>
     *     <tr><td>string</td><td>String</td><td>No</td><td>A sequence of textual characters.</td></tr>
     *     <tr><td>stringNullable</td><td>String</td><td>No</td><td>A sequence of textual characters.</td></tr>
     * </table>
     *
     * You can add these to a request with {@link RequestOptions#addQueryParam}
     *
     * <p><strong>Header Parameters</strong>
     *
     * <table border="1">
     *     <caption>Header Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>request-header-optional</td><td>String</td><td>No</td><td>A sequence of textual characters.</td></tr>
     * </table>
     *
     * You can add these to a request with {@link RequestOptions#addHeader}
     *
     * <p><strong>Request Body Schema</strong>
     *
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
     *         String: byte[] (Optional)
     *     }
     * }
     * }</pre>
     *
     * <p><strong>Response Body Schema</strong>
     *
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
     *         String: byte[] (Optional)
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
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> putWithResponse(
            String requestHeaderRequired,
            boolean booleanRequired,
            Boolean booleanRequiredNullable,
            String stringRequired,
            String stringRequiredNullable,
            RequestOptions requestOptions) {
        final String accept = "application/json";
        return service.putSync(
                this.getEndpoint(),
                requestHeaderRequired,
                booleanRequired,
                booleanRequiredNullable,
                stringRequired,
                stringRequiredNullable,
                accept,
                requestOptions,
                Context.NONE);
    }
}
