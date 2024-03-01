// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.client.naming.implementation;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Host;
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
import reactor.core.publisher.Mono;

/**
 * Initializes a new instance of the NamingClient type.
 */
public final class NamingClientImpl {
    /**
     * The proxy service used to perform REST calls.
     */
    private final NamingClientService service;

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
     * The ModelsImpl object to access its operations.
     */
    private final ModelsImpl models;

    /**
     * Gets the ModelsImpl object to access its operations.
     * 
     * @return the ModelsImpl object.
     */
    public ModelsImpl getModels() {
        return this.models;
    }

    /**
     * Initializes an instance of NamingClient client.
     */
    public NamingClientImpl() {
        this(new HttpPipelineBuilder().policies(new UserAgentPolicy(), new RetryPolicy()).build(),
            JacksonAdapter.createDefaultSerializerAdapter());
    }

    /**
     * Initializes an instance of NamingClient client.
     * 
     * @param httpPipeline The HTTP pipeline to send requests through.
     */
    public NamingClientImpl(HttpPipeline httpPipeline) {
        this(httpPipeline, JacksonAdapter.createDefaultSerializerAdapter());
    }

    /**
     * Initializes an instance of NamingClient client.
     * 
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param serializerAdapter The serializer to serialize an object into a string.
     */
    public NamingClientImpl(HttpPipeline httpPipeline, SerializerAdapter serializerAdapter) {
        this.httpPipeline = httpPipeline;
        this.serializerAdapter = serializerAdapter;
        this.models = new ModelsImpl(this);
        this.service = RestProxy.create(NamingClientService.class, this.httpPipeline, this.getSerializerAdapter());
    }

    /**
     * The interface defining all the services for NamingClient to be used by the proxy service to perform REST calls.
     */
    @Host("http://localhost:3000")
    @ServiceInterface(name = "NamingClient")
    public interface NamingClientService {
        @Post("/client/naming/operation")
        @ExpectedResponses({ 204 })
        @UnexpectedResponseExceptionType(value = ClientAuthenticationException.class, code = { 401 })
        @UnexpectedResponseExceptionType(value = ResourceNotFoundException.class, code = { 404 })
        @UnexpectedResponseExceptionType(value = ResourceModifiedException.class, code = { 409 })
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Mono<Response<Void>> clientName(@HeaderParam("accept") String accept, RequestOptions requestOptions,
            Context context);

        @Post("/client/naming/operation")
        @ExpectedResponses({ 204 })
        @UnexpectedResponseExceptionType(value = ClientAuthenticationException.class, code = { 401 })
        @UnexpectedResponseExceptionType(value = ResourceNotFoundException.class, code = { 404 })
        @UnexpectedResponseExceptionType(value = ResourceModifiedException.class, code = { 409 })
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Response<Void> clientNameSync(@HeaderParam("accept") String accept, RequestOptions requestOptions,
            Context context);

        @Post("/client/naming/parameter")
        @ExpectedResponses({ 204 })
        @UnexpectedResponseExceptionType(value = ClientAuthenticationException.class, code = { 401 })
        @UnexpectedResponseExceptionType(value = ResourceNotFoundException.class, code = { 404 })
        @UnexpectedResponseExceptionType(value = ResourceModifiedException.class, code = { 409 })
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Mono<Response<Void>> parameter(@QueryParam("defaultName") String clientName,
            @HeaderParam("accept") String accept, RequestOptions requestOptions, Context context);

        @Post("/client/naming/parameter")
        @ExpectedResponses({ 204 })
        @UnexpectedResponseExceptionType(value = ClientAuthenticationException.class, code = { 401 })
        @UnexpectedResponseExceptionType(value = ResourceNotFoundException.class, code = { 404 })
        @UnexpectedResponseExceptionType(value = ResourceModifiedException.class, code = { 409 })
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Response<Void> parameterSync(@QueryParam("defaultName") String clientName, @HeaderParam("accept") String accept,
            RequestOptions requestOptions, Context context);

        @Post("/client/naming/property/client")
        @ExpectedResponses({ 204 })
        @UnexpectedResponseExceptionType(value = ClientAuthenticationException.class, code = { 401 })
        @UnexpectedResponseExceptionType(value = ResourceNotFoundException.class, code = { 404 })
        @UnexpectedResponseExceptionType(value = ResourceModifiedException.class, code = { 409 })
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Mono<Response<Void>> client(@HeaderParam("accept") String accept,
            @BodyParam("application/json") BinaryData clientNameModel, RequestOptions requestOptions, Context context);

        @Post("/client/naming/property/client")
        @ExpectedResponses({ 204 })
        @UnexpectedResponseExceptionType(value = ClientAuthenticationException.class, code = { 401 })
        @UnexpectedResponseExceptionType(value = ResourceNotFoundException.class, code = { 404 })
        @UnexpectedResponseExceptionType(value = ResourceModifiedException.class, code = { 409 })
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Response<Void> clientSync(@HeaderParam("accept") String accept,
            @BodyParam("application/json") BinaryData clientNameModel, RequestOptions requestOptions, Context context);

        @Post("/client/naming/property/language")
        @ExpectedResponses({ 204 })
        @UnexpectedResponseExceptionType(value = ClientAuthenticationException.class, code = { 401 })
        @UnexpectedResponseExceptionType(value = ResourceNotFoundException.class, code = { 404 })
        @UnexpectedResponseExceptionType(value = ResourceModifiedException.class, code = { 409 })
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Mono<Response<Void>> language(@HeaderParam("accept") String accept,
            @BodyParam("application/json") BinaryData languageClientNameModel, RequestOptions requestOptions,
            Context context);

        @Post("/client/naming/property/language")
        @ExpectedResponses({ 204 })
        @UnexpectedResponseExceptionType(value = ClientAuthenticationException.class, code = { 401 })
        @UnexpectedResponseExceptionType(value = ResourceNotFoundException.class, code = { 404 })
        @UnexpectedResponseExceptionType(value = ResourceModifiedException.class, code = { 409 })
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Response<Void> languageSync(@HeaderParam("accept") String accept,
            @BodyParam("application/json") BinaryData languageClientNameModel, RequestOptions requestOptions,
            Context context);

        @Post("/client/naming/property/compatible-with-encoded-name")
        @ExpectedResponses({ 204 })
        @UnexpectedResponseExceptionType(value = ClientAuthenticationException.class, code = { 401 })
        @UnexpectedResponseExceptionType(value = ResourceNotFoundException.class, code = { 404 })
        @UnexpectedResponseExceptionType(value = ResourceModifiedException.class, code = { 409 })
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Mono<Response<Void>> compatibleWithEncodedName(@HeaderParam("accept") String accept,
            @BodyParam("application/json") BinaryData clientNameAndJsonEncodedNameModel, RequestOptions requestOptions,
            Context context);

        @Post("/client/naming/property/compatible-with-encoded-name")
        @ExpectedResponses({ 204 })
        @UnexpectedResponseExceptionType(value = ClientAuthenticationException.class, code = { 401 })
        @UnexpectedResponseExceptionType(value = ResourceNotFoundException.class, code = { 404 })
        @UnexpectedResponseExceptionType(value = ResourceModifiedException.class, code = { 409 })
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Response<Void> compatibleWithEncodedNameSync(@HeaderParam("accept") String accept,
            @BodyParam("application/json") BinaryData clientNameAndJsonEncodedNameModel, RequestOptions requestOptions,
            Context context);

        @Post("/client/naming/header")
        @ExpectedResponses({ 204 })
        @UnexpectedResponseExceptionType(value = ClientAuthenticationException.class, code = { 401 })
        @UnexpectedResponseExceptionType(value = ResourceNotFoundException.class, code = { 404 })
        @UnexpectedResponseExceptionType(value = ResourceModifiedException.class, code = { 409 })
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Mono<Response<Void>> request(@HeaderParam("default-name") String clientName,
            @HeaderParam("accept") String accept, RequestOptions requestOptions, Context context);

        @Post("/client/naming/header")
        @ExpectedResponses({ 204 })
        @UnexpectedResponseExceptionType(value = ClientAuthenticationException.class, code = { 401 })
        @UnexpectedResponseExceptionType(value = ResourceNotFoundException.class, code = { 404 })
        @UnexpectedResponseExceptionType(value = ResourceModifiedException.class, code = { 409 })
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Response<Void> requestSync(@HeaderParam("default-name") String clientName, @HeaderParam("accept") String accept,
            RequestOptions requestOptions, Context context);

        @Get("/client/naming/header")
        @ExpectedResponses({ 204 })
        @UnexpectedResponseExceptionType(value = ClientAuthenticationException.class, code = { 401 })
        @UnexpectedResponseExceptionType(value = ResourceNotFoundException.class, code = { 404 })
        @UnexpectedResponseExceptionType(value = ResourceModifiedException.class, code = { 409 })
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Mono<Response<Void>> response(@HeaderParam("accept") String accept, RequestOptions requestOptions,
            Context context);

        @Get("/client/naming/header")
        @ExpectedResponses({ 204 })
        @UnexpectedResponseExceptionType(value = ClientAuthenticationException.class, code = { 401 })
        @UnexpectedResponseExceptionType(value = ResourceNotFoundException.class, code = { 404 })
        @UnexpectedResponseExceptionType(value = ResourceModifiedException.class, code = { 409 })
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Response<Void> responseSync(@HeaderParam("accept") String accept, RequestOptions requestOptions,
            Context context);
    }

    /**
     * The clientName operation.
     * 
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> clientNameWithResponseAsync(RequestOptions requestOptions) {
        final String accept = "application/json";
        return FluxUtil.withContext(context -> service.clientName(accept, requestOptions, context));
    }

    /**
     * The clientName operation.
     * 
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> clientNameWithResponse(RequestOptions requestOptions) {
        final String accept = "application/json";
        return service.clientNameSync(accept, requestOptions, Context.NONE);
    }

    /**
     * The parameter operation.
     * 
     * @param clientName A sequence of textual characters.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> parameterWithResponseAsync(String clientName, RequestOptions requestOptions) {
        final String accept = "application/json";
        return FluxUtil.withContext(context -> service.parameter(clientName, accept, requestOptions, context));
    }

    /**
     * The parameter operation.
     * 
     * @param clientName A sequence of textual characters.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> parameterWithResponse(String clientName, RequestOptions requestOptions) {
        final String accept = "application/json";
        return service.parameterSync(clientName, accept, requestOptions, Context.NONE);
    }

    /**
     * The client operation.
     * <p><strong>Request Body Schema</strong></p>
     * <pre>{@code
     * {
     *     defaultName: boolean (Required)
     * }
     * }</pre>
     * 
     * @param clientNameModel The clientNameModel parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> clientWithResponseAsync(BinaryData clientNameModel, RequestOptions requestOptions) {
        final String accept = "application/json";
        return FluxUtil.withContext(context -> service.client(accept, clientNameModel, requestOptions, context));
    }

    /**
     * The client operation.
     * <p><strong>Request Body Schema</strong></p>
     * <pre>{@code
     * {
     *     defaultName: boolean (Required)
     * }
     * }</pre>
     * 
     * @param clientNameModel The clientNameModel parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> clientWithResponse(BinaryData clientNameModel, RequestOptions requestOptions) {
        final String accept = "application/json";
        return service.clientSync(accept, clientNameModel, requestOptions, Context.NONE);
    }

    /**
     * The language operation.
     * <p><strong>Request Body Schema</strong></p>
     * <pre>{@code
     * {
     *     defaultName: boolean (Required)
     * }
     * }</pre>
     * 
     * @param languageClientNameModel The languageClientNameModel parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> languageWithResponseAsync(BinaryData languageClientNameModel,
        RequestOptions requestOptions) {
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.language(accept, languageClientNameModel, requestOptions, context));
    }

    /**
     * The language operation.
     * <p><strong>Request Body Schema</strong></p>
     * <pre>{@code
     * {
     *     defaultName: boolean (Required)
     * }
     * }</pre>
     * 
     * @param languageClientNameModel The languageClientNameModel parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> languageWithResponse(BinaryData languageClientNameModel, RequestOptions requestOptions) {
        final String accept = "application/json";
        return service.languageSync(accept, languageClientNameModel, requestOptions, Context.NONE);
    }

    /**
     * The compatibleWithEncodedName operation.
     * <p><strong>Request Body Schema</strong></p>
     * <pre>{@code
     * {
     *     wireName: boolean (Required)
     * }
     * }</pre>
     * 
     * @param clientNameAndJsonEncodedNameModel The clientNameAndJsonEncodedNameModel parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> compatibleWithEncodedNameWithResponseAsync(BinaryData clientNameAndJsonEncodedNameModel,
        RequestOptions requestOptions) {
        final String accept = "application/json";
        return FluxUtil.withContext(context -> service.compatibleWithEncodedName(accept,
            clientNameAndJsonEncodedNameModel, requestOptions, context));
    }

    /**
     * The compatibleWithEncodedName operation.
     * <p><strong>Request Body Schema</strong></p>
     * <pre>{@code
     * {
     *     wireName: boolean (Required)
     * }
     * }</pre>
     * 
     * @param clientNameAndJsonEncodedNameModel The clientNameAndJsonEncodedNameModel parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> compatibleWithEncodedNameWithResponse(BinaryData clientNameAndJsonEncodedNameModel,
        RequestOptions requestOptions) {
        final String accept = "application/json";
        return service.compatibleWithEncodedNameSync(accept, clientNameAndJsonEncodedNameModel, requestOptions,
            Context.NONE);
    }

    /**
     * The request operation.
     * 
     * @param clientName A sequence of textual characters.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> requestWithResponseAsync(String clientName, RequestOptions requestOptions) {
        final String accept = "application/json";
        return FluxUtil.withContext(context -> service.request(clientName, accept, requestOptions, context));
    }

    /**
     * The request operation.
     * 
     * @param clientName A sequence of textual characters.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> requestWithResponse(String clientName, RequestOptions requestOptions) {
        final String accept = "application/json";
        return service.requestSync(clientName, accept, requestOptions, Context.NONE);
    }

    /**
     * The response operation.
     * 
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> responseWithResponseAsync(RequestOptions requestOptions) {
        final String accept = "application/json";
        return FluxUtil.withContext(context -> service.response(accept, requestOptions, context));
    }

    /**
     * The response operation.
     * 
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> responseWithResponse(RequestOptions requestOptions) {
        final String accept = "application/json";
        return service.responseSync(accept, requestOptions, Context.NONE);
    }
}
