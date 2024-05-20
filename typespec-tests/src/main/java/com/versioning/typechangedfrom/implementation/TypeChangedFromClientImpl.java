// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.versioning.typechangedfrom.implementation;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.Post;
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
import com.versioning.typechangedfrom.TypeChangedFromServiceVersion;
import reactor.core.publisher.Mono;

/**
 * Initializes a new instance of the TypeChangedFromClient type.
 */
public final class TypeChangedFromClientImpl {
    /**
     * The proxy service used to perform REST calls.
     */
    private final TypeChangedFromClientService service;

    /**
     * Need to be set as 'http://localhost:3000' in client.
     */
    private final String endpoint;

    /**
     * Gets Need to be set as 'http://localhost:3000' in client.
     * 
     * @return the endpoint value.
     */
    public String getEndpoint() {
        return this.endpoint;
    }

    /**
     * Need to be set as 'v1' or 'v2' in client.
     */
    private final String version;

    /**
     * Gets Need to be set as 'v1' or 'v2' in client.
     * 
     * @return the version value.
     */
    public String getVersion() {
        return this.version;
    }

    /**
     * Service version.
     */
    private final TypeChangedFromServiceVersion serviceVersion;

    /**
     * Gets Service version.
     * 
     * @return the serviceVersion value.
     */
    public TypeChangedFromServiceVersion getServiceVersion() {
        return this.serviceVersion;
    }

    /**
     * The HTTP pipeline to send requests through.
     */
    private final HttpPipeline httpPipeline;

    /**
     * Gets The HTTP pipeline to send requests through.
     * 
     * @return the httpPipeline value.
     */
    public HttpPipeline getHttpPipeline() {
        return this.httpPipeline;
    }

    /**
     * The serializer to serialize an object into a string.
     */
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
     * Initializes an instance of TypeChangedFromClient client.
     * 
     * @param endpoint Need to be set as 'http://localhost:3000' in client.
     * @param version Need to be set as 'v1' or 'v2' in client.
     * @param serviceVersion Service version.
     */
    public TypeChangedFromClientImpl(String endpoint, String version, TypeChangedFromServiceVersion serviceVersion) {
        this(new HttpPipelineBuilder().policies(new UserAgentPolicy(), new RetryPolicy()).build(),
            JacksonAdapter.createDefaultSerializerAdapter(), endpoint, version, serviceVersion);
    }

    /**
     * Initializes an instance of TypeChangedFromClient client.
     * 
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param endpoint Need to be set as 'http://localhost:3000' in client.
     * @param version Need to be set as 'v1' or 'v2' in client.
     * @param serviceVersion Service version.
     */
    public TypeChangedFromClientImpl(HttpPipeline httpPipeline, String endpoint, String version,
        TypeChangedFromServiceVersion serviceVersion) {
        this(httpPipeline, JacksonAdapter.createDefaultSerializerAdapter(), endpoint, version, serviceVersion);
    }

    /**
     * Initializes an instance of TypeChangedFromClient client.
     * 
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param serializerAdapter The serializer to serialize an object into a string.
     * @param endpoint Need to be set as 'http://localhost:3000' in client.
     * @param version Need to be set as 'v1' or 'v2' in client.
     * @param serviceVersion Service version.
     */
    public TypeChangedFromClientImpl(HttpPipeline httpPipeline, SerializerAdapter serializerAdapter, String endpoint,
        String version, TypeChangedFromServiceVersion serviceVersion) {
        this.httpPipeline = httpPipeline;
        this.serializerAdapter = serializerAdapter;
        this.endpoint = endpoint;
        this.version = version;
        this.serviceVersion = serviceVersion;
        this.service
            = RestProxy.create(TypeChangedFromClientService.class, this.httpPipeline, this.getSerializerAdapter());
    }

    /**
     * The interface defining all the services for TypeChangedFromClient to be used by the proxy service to perform REST
     * calls.
     */
    @Host("{endpoint}/versioning/type-changed-from/api-version:{version}")
    @ServiceInterface(name = "TypeChangedFromClien")
    public interface TypeChangedFromClientService {
        @Post("/test")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(value = ClientAuthenticationException.class, code = { 401 })
        @UnexpectedResponseExceptionType(value = ResourceNotFoundException.class, code = { 404 })
        @UnexpectedResponseExceptionType(value = ResourceModifiedException.class, code = { 409 })
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Mono<Response<BinaryData>> test(@HostParam("endpoint") String endpoint, @HostParam("version") String version,
            @QueryParam("param") String param, @HeaderParam("accept") String accept,
            @BodyParam("application/json") BinaryData body, RequestOptions requestOptions, Context context);

        @Post("/test")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(value = ClientAuthenticationException.class, code = { 401 })
        @UnexpectedResponseExceptionType(value = ResourceNotFoundException.class, code = { 404 })
        @UnexpectedResponseExceptionType(value = ResourceModifiedException.class, code = { 409 })
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Response<BinaryData> testSync(@HostParam("endpoint") String endpoint, @HostParam("version") String version,
            @QueryParam("param") String param, @HeaderParam("accept") String accept,
            @BodyParam("application/json") BinaryData body, RequestOptions requestOptions, Context context);
    }

    /**
     * The test operation.
     * <p><strong>Request Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     prop: String (Required)
     *     changedProp: String (Required)
     * }
     * }</pre>
     * 
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     prop: String (Required)
     *     changedProp: String (Required)
     * }
     * }</pre>
     * 
     * @param param A sequence of textual characters.
     * 
     * The param parameter.
     * @param body The body parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> testWithResponseAsync(String param, BinaryData body,
        RequestOptions requestOptions) {
        final String accept = "application/json";
        return FluxUtil.withContext(context -> service.test(this.getEndpoint(), this.getVersion(), param, accept, body,
            requestOptions, context));
    }

    /**
     * The test operation.
     * <p><strong>Request Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     prop: String (Required)
     *     changedProp: String (Required)
     * }
     * }</pre>
     * 
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     prop: String (Required)
     *     changedProp: String (Required)
     * }
     * }</pre>
     * 
     * @param param A sequence of textual characters.
     * 
     * The param parameter.
     * @param body The body parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the response body along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> testWithResponse(String param, BinaryData body, RequestOptions requestOptions) {
        final String accept = "application/json";
        return service.testSync(this.getEndpoint(), this.getVersion(), param, accept, body, requestOptions,
            Context.NONE);
    }
}
