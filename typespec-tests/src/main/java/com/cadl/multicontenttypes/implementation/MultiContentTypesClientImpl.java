// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.cadl.multicontenttypes.implementation;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.Post;
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
import reactor.core.publisher.Mono;

/**
 * Initializes a new instance of the MultiContentTypesClient type.
 */
public final class MultiContentTypesClientImpl {
    /**
     * The proxy service used to perform REST calls.
     */
    private final MultiContentTypesClientService service;

    /**
     * Server parameter.
     */
    private final String endpoint;

    /**
     * Gets Server parameter.
     * 
     * @return the endpoint value.
     */
    public String getEndpoint() {
        return this.endpoint;
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
     * The SingleContentTypesImpl object to access its operations.
     */
    private final SingleContentTypesImpl singleContentTypes;

    /**
     * Gets the SingleContentTypesImpl object to access its operations.
     * 
     * @return the SingleContentTypesImpl object.
     */
    public SingleContentTypesImpl getSingleContentTypes() {
        return this.singleContentTypes;
    }

    /**
     * The MultipleContentTypesOnRequestsImpl object to access its operations.
     */
    private final MultipleContentTypesOnRequestsImpl multipleContentTypesOnRequests;

    /**
     * Gets the MultipleContentTypesOnRequestsImpl object to access its operations.
     * 
     * @return the MultipleContentTypesOnRequestsImpl object.
     */
    public MultipleContentTypesOnRequestsImpl getMultipleContentTypesOnRequests() {
        return this.multipleContentTypesOnRequests;
    }

    /**
     * Initializes an instance of MultiContentTypesClient client.
     * 
     * @param endpoint Server parameter.
     */
    public MultiContentTypesClientImpl(String endpoint) {
        this(new HttpPipelineBuilder().policies(new UserAgentPolicy(), new RetryPolicy()).build(),
            JacksonAdapter.createDefaultSerializerAdapter(), endpoint);
    }

    /**
     * Initializes an instance of MultiContentTypesClient client.
     * 
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param endpoint Server parameter.
     */
    public MultiContentTypesClientImpl(HttpPipeline httpPipeline, String endpoint) {
        this(httpPipeline, JacksonAdapter.createDefaultSerializerAdapter(), endpoint);
    }

    /**
     * Initializes an instance of MultiContentTypesClient client.
     * 
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param serializerAdapter The serializer to serialize an object into a string.
     * @param endpoint Server parameter.
     */
    public MultiContentTypesClientImpl(HttpPipeline httpPipeline, SerializerAdapter serializerAdapter,
        String endpoint) {
        this.httpPipeline = httpPipeline;
        this.serializerAdapter = serializerAdapter;
        this.endpoint = endpoint;
        this.singleContentTypes = new SingleContentTypesImpl(this);
        this.multipleContentTypesOnRequests = new MultipleContentTypesOnRequestsImpl(this);
        this.service
            = RestProxy.create(MultiContentTypesClientService.class, this.httpPipeline, this.getSerializerAdapter());
    }

    /**
     * The interface defining all the services for MultiContentTypesClient to be used by the proxy service to perform
     * REST calls.
     */
    @Host("{endpoint}")
    @ServiceInterface(name = "MultiContentTypesCli")
    public interface MultiContentTypesClientService {
        @Post("/upload/overload/multi-body-types")
        @ExpectedResponses({ 204 })
        @UnexpectedResponseExceptionType(value = ClientAuthenticationException.class, code = { 401 })
        @UnexpectedResponseExceptionType(value = ResourceNotFoundException.class, code = { 404 })
        @UnexpectedResponseExceptionType(value = ResourceModifiedException.class, code = { 409 })
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Mono<Response<Void>> uploadWithOverload(@HostParam("endpoint") String endpoint,
            @HeaderParam("content-type") String contentType, @HeaderParam("accept") String accept,
            @BodyParam("application/json") BinaryData data, RequestOptions requestOptions, Context context);

        @Post("/upload/overload/multi-body-types")
        @ExpectedResponses({ 204 })
        @UnexpectedResponseExceptionType(value = ClientAuthenticationException.class, code = { 401 })
        @UnexpectedResponseExceptionType(value = ResourceNotFoundException.class, code = { 404 })
        @UnexpectedResponseExceptionType(value = ResourceModifiedException.class, code = { 409 })
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Response<Void> uploadWithOverloadSync(@HostParam("endpoint") String endpoint,
            @HeaderParam("content-type") String contentType, @HeaderParam("accept") String accept,
            @BodyParam("application/json") BinaryData data, RequestOptions requestOptions, Context context);
    }

    /**
     * multiple data types map to multiple content types.
     * <p>
     * <strong>Request Body Schema</strong>
     * </p>
     * <pre>{@code
     * BinaryData
     * }</pre>
     * 
     * @param contentType The contentType parameter. Allowed values: "text/plain", "application/json",
     * "application/octet-stream", "image/jpeg", "image/png".
     * @param data The data parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> uploadWithOverloadWithResponseAsync(String contentType, BinaryData data,
        RequestOptions requestOptions) {
        final String accept = "application/json";
        return FluxUtil.withContext(context -> service.uploadWithOverload(this.getEndpoint(), contentType, accept, data,
            requestOptions, context));
    }

    /**
     * multiple data types map to multiple content types.
     * <p>
     * <strong>Request Body Schema</strong>
     * </p>
     * <pre>{@code
     * BinaryData
     * }</pre>
     * 
     * @param contentType The contentType parameter. Allowed values: "text/plain", "application/json",
     * "application/octet-stream", "image/jpeg", "image/png".
     * @param data The data parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> uploadWithOverloadWithResponse(String contentType, BinaryData data,
        RequestOptions requestOptions) {
        final String accept = "application/json";
        return service.uploadWithOverloadSync(this.getEndpoint(), contentType, accept, data, requestOptions,
            Context.NONE);
    }
}
