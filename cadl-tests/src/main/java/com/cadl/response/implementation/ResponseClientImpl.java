// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.cadl.response.implementation;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.Delete;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.Post;
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
import com.cadl.response.ResponseServiceVersion;
import reactor.core.publisher.Mono;

/** Initializes a new instance of the ResponseClient type. */
public final class ResponseClientImpl {
    /** The proxy service used to perform REST calls. */
    private final ResponseClientService service;

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

    /** Service version. */
    private final ResponseServiceVersion serviceVersion;

    /**
     * Gets Service version.
     *
     * @return the serviceVersion value.
     */
    public ResponseServiceVersion getServiceVersion() {
        return this.serviceVersion;
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
     * Initializes an instance of ResponseClient client.
     *
     * @param endpoint Server parameter.
     * @param serviceVersion Service version.
     */
    public ResponseClientImpl(String endpoint, ResponseServiceVersion serviceVersion) {
        this(
                new HttpPipelineBuilder()
                        .policies(new UserAgentPolicy(), new RetryPolicy(), new CookiePolicy())
                        .build(),
                JacksonAdapter.createDefaultSerializerAdapter(),
                endpoint,
                serviceVersion);
    }

    /**
     * Initializes an instance of ResponseClient client.
     *
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param endpoint Server parameter.
     * @param serviceVersion Service version.
     */
    public ResponseClientImpl(HttpPipeline httpPipeline, String endpoint, ResponseServiceVersion serviceVersion) {
        this(httpPipeline, JacksonAdapter.createDefaultSerializerAdapter(), endpoint, serviceVersion);
    }

    /**
     * Initializes an instance of ResponseClient client.
     *
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param serializerAdapter The serializer to serialize an object into a string.
     * @param endpoint Server parameter.
     * @param serviceVersion Service version.
     */
    public ResponseClientImpl(
            HttpPipeline httpPipeline,
            SerializerAdapter serializerAdapter,
            String endpoint,
            ResponseServiceVersion serviceVersion) {
        this.httpPipeline = httpPipeline;
        this.serializerAdapter = serializerAdapter;
        this.endpoint = endpoint;
        this.serviceVersion = serviceVersion;
        this.service = RestProxy.create(ResponseClientService.class, this.httpPipeline, this.getSerializerAdapter());
    }

    /**
     * The interface defining all the services for ResponseClient to be used by the proxy service to perform REST calls.
     */
    @Host("{endpoint}")
    @ServiceInterface(name = "ResponseClient")
    public interface ResponseClientService {
        @Get("/response/get-binary")
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
        Mono<Response<byte[]>> getBinary(
                @HostParam("endpoint") String endpoint,
                @HeaderParam("accept") String accept,
                RequestOptions requestOptions,
                Context context);

        @Get("/response/get-array")
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
        Mono<Response<BinaryData>> getArray(
                @HostParam("endpoint") String endpoint,
                @HeaderParam("accept") String accept,
                RequestOptions requestOptions,
                Context context);

        @Get("/response/get-another-array")
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
        Mono<Response<BinaryData>> getAnotherArray(
                @HostParam("endpoint") String endpoint,
                @HeaderParam("accept") String accept,
                RequestOptions requestOptions,
                Context context);

        @Put("/response/create-with-headers")
        @ExpectedResponses({201})
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
        Mono<Response<BinaryData>> createWithHeaders(
                @HostParam("endpoint") String endpoint,
                @HeaderParam("accept") String accept,
                RequestOptions requestOptions,
                Context context);

        @Delete("/response/delete-with-headers")
        @ExpectedResponses({204})
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
        Mono<Response<Void>> deleteWithHeaders(
                @HostParam("endpoint") String endpoint,
                @HeaderParam("accept") String accept,
                RequestOptions requestOptions,
                Context context);

        @Post("/response/resources")
        @ExpectedResponses({201})
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
        Mono<Response<BinaryData>> createResource(
                @HostParam("endpoint") String endpoint,
                @QueryParam("api-version") String apiVersion,
                @HeaderParam("accept") String accept,
                @BodyParam("application/json") BinaryData resourceCreateOrReplaceModel,
                RequestOptions requestOptions,
                Context context);
    }

    /**
     * The getBinary operation.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * byte[]
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<byte[]>> getBinaryWithResponseAsync(RequestOptions requestOptions) {
        final String accept = "application/json, image/png";
        return FluxUtil.withContext(context -> service.getBinary(this.getEndpoint(), accept, requestOptions, context));
    }

    /**
     * The getBinary operation.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * byte[]
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the response body along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<byte[]> getBinaryWithResponse(RequestOptions requestOptions) {
        return getBinaryWithResponseAsync(requestOptions).block();
    }

    /**
     * The getArray operation.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * [
     *      (Required){
     *         id: String (Required)
     *         name: String (Required)
     *         description: String (Optional)
     *         type: String (Required)
     *     }
     * ]
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return array of Resource along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> getArrayWithResponseAsync(RequestOptions requestOptions) {
        final String accept = "application/json";
        return FluxUtil.withContext(context -> service.getArray(this.getEndpoint(), accept, requestOptions, context));
    }

    /**
     * The getArray operation.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * [
     *      (Required){
     *         id: String (Required)
     *         name: String (Required)
     *         description: String (Optional)
     *         type: String (Required)
     *     }
     * ]
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return array of Resource along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> getArrayWithResponse(RequestOptions requestOptions) {
        return getArrayWithResponseAsync(requestOptions).block();
    }

    /**
     * The getAnotherArray operation.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * [
     *      (Required){
     *         id: String (Required)
     *         name: String (Required)
     *         description: String (Optional)
     *         type: String (Required)
     *     }
     * ]
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return array of Resource along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> getAnotherArrayWithResponseAsync(RequestOptions requestOptions) {
        final String accept = "application/json";
        return FluxUtil.withContext(
                context -> service.getAnotherArray(this.getEndpoint(), accept, requestOptions, context));
    }

    /**
     * The getAnotherArray operation.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * [
     *      (Required){
     *         id: String (Required)
     *         name: String (Required)
     *         description: String (Optional)
     *         type: String (Required)
     *     }
     * ]
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return array of Resource along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> getAnotherArrayWithResponse(RequestOptions requestOptions) {
        return getAnotherArrayWithResponseAsync(requestOptions).block();
    }

    /**
     * The createWithHeaders operation.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     id: String (Required)
     *     name: String (Required)
     *     description: String (Optional)
     *     type: String (Required)
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> createWithHeadersWithResponseAsync(RequestOptions requestOptions) {
        final String accept = "application/json";
        return FluxUtil.withContext(
                context -> service.createWithHeaders(this.getEndpoint(), accept, requestOptions, context));
    }

    /**
     * The createWithHeaders operation.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     id: String (Required)
     *     name: String (Required)
     *     description: String (Optional)
     *     type: String (Required)
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
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> createWithHeadersWithResponse(RequestOptions requestOptions) {
        return createWithHeadersWithResponseAsync(requestOptions).block();
    }

    /**
     * The deleteWithHeaders operation.
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> deleteWithHeadersWithResponseAsync(RequestOptions requestOptions) {
        final String accept = "application/json";
        return FluxUtil.withContext(
                context -> service.deleteWithHeaders(this.getEndpoint(), accept, requestOptions, context));
    }

    /**
     * The deleteWithHeaders operation.
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> deleteWithHeadersWithResponse(RequestOptions requestOptions) {
        return deleteWithHeadersWithResponseAsync(requestOptions).block();
    }

    /**
     * Creates a new resource with response as anonymous model.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     description: String (Optional)
     *     type: String (Required)
     * }
     * }</pre>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     id: String (Required)
     *     name: String (Required)
     *     description: String (Optional)
     *     type: String (Required)
     * }
     * }</pre>
     *
     * @param resourceCreateOrReplaceModel The template for adding updateable properties.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> createResourceWithResponseAsync(
            BinaryData resourceCreateOrReplaceModel, RequestOptions requestOptions) {
        final String accept = "application/json";
        return FluxUtil.withContext(
                context ->
                        service.createResource(
                                this.getEndpoint(),
                                this.getServiceVersion().getVersion(),
                                accept,
                                resourceCreateOrReplaceModel,
                                requestOptions,
                                context));
    }

    /**
     * Creates a new resource with response as anonymous model.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     description: String (Optional)
     *     type: String (Required)
     * }
     * }</pre>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     id: String (Required)
     *     name: String (Required)
     *     description: String (Optional)
     *     type: String (Required)
     * }
     * }</pre>
     *
     * @param resourceCreateOrReplaceModel The template for adding updateable properties.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the response body along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> createResourceWithResponse(
            BinaryData resourceCreateOrReplaceModel, RequestOptions requestOptions) {
        return createResourceWithResponseAsync(resourceCreateOrReplaceModel, requestOptions).block();
    }
}
