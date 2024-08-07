// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.cadl.multipart.implementation;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
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
 * Initializes a new instance of the MultipartClient type.
 */
public final class MultipartClientImpl {
    /**
     * The proxy service used to perform REST calls.
     */
    private final MultipartClientService service;

    /**
     * Service host.
     */
    private final String endpoint;

    /**
     * Gets Service host.
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
     * Initializes an instance of MultipartClient client.
     * 
     * @param endpoint Service host.
     */
    public MultipartClientImpl(String endpoint) {
        this(new HttpPipelineBuilder().policies(new UserAgentPolicy(), new RetryPolicy()).build(),
            JacksonAdapter.createDefaultSerializerAdapter(), endpoint);
    }

    /**
     * Initializes an instance of MultipartClient client.
     * 
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param endpoint Service host.
     */
    public MultipartClientImpl(HttpPipeline httpPipeline, String endpoint) {
        this(httpPipeline, JacksonAdapter.createDefaultSerializerAdapter(), endpoint);
    }

    /**
     * Initializes an instance of MultipartClient client.
     * 
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param serializerAdapter The serializer to serialize an object into a string.
     * @param endpoint Service host.
     */
    public MultipartClientImpl(HttpPipeline httpPipeline, SerializerAdapter serializerAdapter, String endpoint) {
        this.httpPipeline = httpPipeline;
        this.serializerAdapter = serializerAdapter;
        this.endpoint = endpoint;
        this.service = RestProxy.create(MultipartClientService.class, this.httpPipeline, this.getSerializerAdapter());
    }

    /**
     * The interface defining all the services for MultipartClient to be used by the proxy service to perform REST
     * calls.
     */
    @Host("{endpoint}")
    @ServiceInterface(name = "MultipartClient")
    public interface MultipartClientService {
        // @Multipart not supported by RestProxy
        @Post("/upload/images/{name}")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(value = ClientAuthenticationException.class, code = { 401 })
        @UnexpectedResponseExceptionType(value = ResourceNotFoundException.class, code = { 404 })
        @UnexpectedResponseExceptionType(value = ResourceModifiedException.class, code = { 409 })
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Mono<Response<Void>> upload(@HostParam("endpoint") String endpoint, @PathParam("name") String name,
            @HeaderParam("content-type") String contentType, @BodyParam("multipart/form-data") BinaryData data,
            RequestOptions requestOptions, Context context);

        // @Multipart not supported by RestProxy
        @Post("/upload/images/{name}")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(value = ClientAuthenticationException.class, code = { 401 })
        @UnexpectedResponseExceptionType(value = ResourceNotFoundException.class, code = { 404 })
        @UnexpectedResponseExceptionType(value = ResourceModifiedException.class, code = { 409 })
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Response<Void> uploadSync(@HostParam("endpoint") String endpoint, @PathParam("name") String name,
            @HeaderParam("content-type") String contentType, @BodyParam("multipart/form-data") BinaryData data,
            RequestOptions requestOptions, Context context);

        @Post("/uploadHttpPart/images/{name}")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(value = ClientAuthenticationException.class, code = { 401 })
        @UnexpectedResponseExceptionType(value = ResourceNotFoundException.class, code = { 404 })
        @UnexpectedResponseExceptionType(value = ResourceModifiedException.class, code = { 409 })
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Mono<Response<Void>> uploadHttpPart(@HostParam("endpoint") String endpoint, @PathParam("name") String name,
            @HeaderParam("content-type") String contentType, RequestOptions requestOptions, Context context);

        @Post("/uploadHttpPart/images/{name}")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(value = ClientAuthenticationException.class, code = { 401 })
        @UnexpectedResponseExceptionType(value = ResourceNotFoundException.class, code = { 404 })
        @UnexpectedResponseExceptionType(value = ResourceModifiedException.class, code = { 409 })
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Response<Void> uploadHttpPartSync(@HostParam("endpoint") String endpoint, @PathParam("name") String name,
            @HeaderParam("content-type") String contentType, RequestOptions requestOptions, Context context);
    }

    /**
     * The upload operation.
     * <p><strong>Query Parameters</strong></p>
     * <table border="1">
     * <caption>Query Parameters</caption>
     * <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     * <tr><td>compress</td><td>Boolean</td><td>No</td><td>The compress parameter</td></tr>
     * </table>
     * You can add these to a request with {@link RequestOptions#addQueryParam}
     * 
     * @param name The name parameter.
     * @param data The data parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> uploadWithResponseAsync(String name, BinaryData data, RequestOptions requestOptions) {
        final String contentType = "multipart/form-data";
        return FluxUtil.withContext(
            context -> service.upload(this.getEndpoint(), name, contentType, data, requestOptions, context));
    }

    /**
     * The upload operation.
     * <p><strong>Query Parameters</strong></p>
     * <table border="1">
     * <caption>Query Parameters</caption>
     * <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     * <tr><td>compress</td><td>Boolean</td><td>No</td><td>The compress parameter</td></tr>
     * </table>
     * You can add these to a request with {@link RequestOptions#addQueryParam}
     * 
     * @param name The name parameter.
     * @param data The data parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> uploadWithResponse(String name, BinaryData data, RequestOptions requestOptions) {
        final String contentType = "multipart/form-data";
        return service.uploadSync(this.getEndpoint(), name, contentType, data, requestOptions, Context.NONE);
    }

    /**
     * The uploadHttpPart operation.
     * <p><strong>Query Parameters</strong></p>
     * <table border="1">
     * <caption>Query Parameters</caption>
     * <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     * <tr><td>compress</td><td>Boolean</td><td>No</td><td>The compress parameter</td></tr>
     * </table>
     * You can add these to a request with {@link RequestOptions#addQueryParam}
     * 
     * @param name The name parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> uploadHttpPartWithResponseAsync(String name, RequestOptions requestOptions) {
        final String contentType = "multipart/form-data";
        return FluxUtil.withContext(
            context -> service.uploadHttpPart(this.getEndpoint(), name, contentType, requestOptions, context));
    }

    /**
     * The uploadHttpPart operation.
     * <p><strong>Query Parameters</strong></p>
     * <table border="1">
     * <caption>Query Parameters</caption>
     * <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     * <tr><td>compress</td><td>Boolean</td><td>No</td><td>The compress parameter</td></tr>
     * </table>
     * You can add these to a request with {@link RequestOptions#addQueryParam}
     * 
     * @param name The name parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> uploadHttpPartWithResponse(String name, RequestOptions requestOptions) {
        final String contentType = "multipart/form-data";
        return service.uploadHttpPartSync(this.getEndpoint(), name, contentType, requestOptions, Context.NONE);
    }
}
