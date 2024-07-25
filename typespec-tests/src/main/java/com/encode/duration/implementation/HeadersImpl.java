// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.encode.duration.implementation;

import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.exception.ClientAuthenticationException;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.exception.ResourceModifiedException;
import com.azure.core.exception.ResourceNotFoundException;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.core.util.serializer.CollectionFormat;
import com.azure.core.util.serializer.JacksonAdapter;
import java.time.Duration;
import java.util.List;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in Headers.
 */
public final class HeadersImpl {
    /**
     * The proxy service used to perform REST calls.
     */
    private final HeadersService service;

    /**
     * The service client containing this operation class.
     */
    private final DurationClientImpl client;

    /**
     * Initializes an instance of HeadersImpl.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    HeadersImpl(DurationClientImpl client) {
        this.service = RestProxy.create(HeadersService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for DurationClientHeaders to be used by the proxy service to perform REST
     * calls.
     */
    @Host("http://localhost:3000")
    @ServiceInterface(name = "DurationClientHeader")
    public interface HeadersService {
        @Get("/encode/duration/header/default")
        @ExpectedResponses({ 204 })
        @UnexpectedResponseExceptionType(value = ClientAuthenticationException.class, code = { 401 })
        @UnexpectedResponseExceptionType(value = ResourceNotFoundException.class, code = { 404 })
        @UnexpectedResponseExceptionType(value = ResourceModifiedException.class, code = { 409 })
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Mono<Response<Void>> defaultMethod(@HeaderParam("duration") Duration duration,
            @HeaderParam("accept") String accept, RequestOptions requestOptions, Context context);

        @Get("/encode/duration/header/default")
        @ExpectedResponses({ 204 })
        @UnexpectedResponseExceptionType(value = ClientAuthenticationException.class, code = { 401 })
        @UnexpectedResponseExceptionType(value = ResourceNotFoundException.class, code = { 404 })
        @UnexpectedResponseExceptionType(value = ResourceModifiedException.class, code = { 409 })
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Response<Void> defaultMethodSync(@HeaderParam("duration") Duration duration,
            @HeaderParam("accept") String accept, RequestOptions requestOptions, Context context);

        @Get("/encode/duration/header/iso8601")
        @ExpectedResponses({ 204 })
        @UnexpectedResponseExceptionType(value = ClientAuthenticationException.class, code = { 401 })
        @UnexpectedResponseExceptionType(value = ResourceNotFoundException.class, code = { 404 })
        @UnexpectedResponseExceptionType(value = ResourceModifiedException.class, code = { 409 })
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Mono<Response<Void>> iso8601(@HeaderParam("duration") Duration duration, @HeaderParam("accept") String accept,
            RequestOptions requestOptions, Context context);

        @Get("/encode/duration/header/iso8601")
        @ExpectedResponses({ 204 })
        @UnexpectedResponseExceptionType(value = ClientAuthenticationException.class, code = { 401 })
        @UnexpectedResponseExceptionType(value = ResourceNotFoundException.class, code = { 404 })
        @UnexpectedResponseExceptionType(value = ResourceModifiedException.class, code = { 409 })
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Response<Void> iso8601Sync(@HeaderParam("duration") Duration duration, @HeaderParam("accept") String accept,
            RequestOptions requestOptions, Context context);

        @Get("/encode/duration/header/iso8601-array")
        @ExpectedResponses({ 204 })
        @UnexpectedResponseExceptionType(value = ClientAuthenticationException.class, code = { 401 })
        @UnexpectedResponseExceptionType(value = ResourceNotFoundException.class, code = { 404 })
        @UnexpectedResponseExceptionType(value = ResourceModifiedException.class, code = { 409 })
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Mono<Response<Void>> iso8601Array(@HeaderParam("duration") String duration,
            @HeaderParam("accept") String accept, RequestOptions requestOptions, Context context);

        @Get("/encode/duration/header/iso8601-array")
        @ExpectedResponses({ 204 })
        @UnexpectedResponseExceptionType(value = ClientAuthenticationException.class, code = { 401 })
        @UnexpectedResponseExceptionType(value = ResourceNotFoundException.class, code = { 404 })
        @UnexpectedResponseExceptionType(value = ResourceModifiedException.class, code = { 409 })
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Response<Void> iso8601ArraySync(@HeaderParam("duration") String duration, @HeaderParam("accept") String accept,
            RequestOptions requestOptions, Context context);

        @Get("/encode/duration/header/int32-seconds")
        @ExpectedResponses({ 204 })
        @UnexpectedResponseExceptionType(value = ClientAuthenticationException.class, code = { 401 })
        @UnexpectedResponseExceptionType(value = ResourceNotFoundException.class, code = { 404 })
        @UnexpectedResponseExceptionType(value = ResourceModifiedException.class, code = { 409 })
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Mono<Response<Void>> int32Seconds(@HeaderParam("duration") long duration, @HeaderParam("accept") String accept,
            RequestOptions requestOptions, Context context);

        @Get("/encode/duration/header/int32-seconds")
        @ExpectedResponses({ 204 })
        @UnexpectedResponseExceptionType(value = ClientAuthenticationException.class, code = { 401 })
        @UnexpectedResponseExceptionType(value = ResourceNotFoundException.class, code = { 404 })
        @UnexpectedResponseExceptionType(value = ResourceModifiedException.class, code = { 409 })
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Response<Void> int32SecondsSync(@HeaderParam("duration") long duration, @HeaderParam("accept") String accept,
            RequestOptions requestOptions, Context context);

        @Get("/encode/duration/header/float-seconds")
        @ExpectedResponses({ 204 })
        @UnexpectedResponseExceptionType(value = ClientAuthenticationException.class, code = { 401 })
        @UnexpectedResponseExceptionType(value = ResourceNotFoundException.class, code = { 404 })
        @UnexpectedResponseExceptionType(value = ResourceModifiedException.class, code = { 409 })
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Mono<Response<Void>> floatSeconds(@HeaderParam("duration") double duration,
            @HeaderParam("accept") String accept, RequestOptions requestOptions, Context context);

        @Get("/encode/duration/header/float-seconds")
        @ExpectedResponses({ 204 })
        @UnexpectedResponseExceptionType(value = ClientAuthenticationException.class, code = { 401 })
        @UnexpectedResponseExceptionType(value = ResourceNotFoundException.class, code = { 404 })
        @UnexpectedResponseExceptionType(value = ResourceModifiedException.class, code = { 409 })
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Response<Void> floatSecondsSync(@HeaderParam("duration") double duration, @HeaderParam("accept") String accept,
            RequestOptions requestOptions, Context context);

        @Get("/encode/duration/header/float64-seconds")
        @ExpectedResponses({ 204 })
        @UnexpectedResponseExceptionType(value = ClientAuthenticationException.class, code = { 401 })
        @UnexpectedResponseExceptionType(value = ResourceNotFoundException.class, code = { 404 })
        @UnexpectedResponseExceptionType(value = ResourceModifiedException.class, code = { 409 })
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Mono<Response<Void>> float64Seconds(@HeaderParam("duration") double duration,
            @HeaderParam("accept") String accept, RequestOptions requestOptions, Context context);

        @Get("/encode/duration/header/float64-seconds")
        @ExpectedResponses({ 204 })
        @UnexpectedResponseExceptionType(value = ClientAuthenticationException.class, code = { 401 })
        @UnexpectedResponseExceptionType(value = ResourceNotFoundException.class, code = { 404 })
        @UnexpectedResponseExceptionType(value = ResourceModifiedException.class, code = { 409 })
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Response<Void> float64SecondsSync(@HeaderParam("duration") double duration,
            @HeaderParam("accept") String accept, RequestOptions requestOptions, Context context);
    }

    /**
     * The defaultMethod operation.
     * 
     * @param duration The duration parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return there is no content to send for this request, but the headers may be useful along with {@link Response}
     * on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> defaultMethodWithResponseAsync(Duration duration, RequestOptions requestOptions) {
        final String accept = "application/json";
        return FluxUtil.withContext(context -> service.defaultMethod(duration, accept, requestOptions, context));
    }

    /**
     * The defaultMethod operation.
     * 
     * @param duration The duration parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return there is no content to send for this request, but the headers may be useful along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> defaultMethodWithResponse(Duration duration, RequestOptions requestOptions) {
        final String accept = "application/json";
        return service.defaultMethodSync(duration, accept, requestOptions, Context.NONE);
    }

    /**
     * The iso8601 operation.
     * 
     * @param duration The duration parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return there is no content to send for this request, but the headers may be useful along with {@link Response}
     * on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> iso8601WithResponseAsync(Duration duration, RequestOptions requestOptions) {
        final String accept = "application/json";
        return FluxUtil.withContext(context -> service.iso8601(duration, accept, requestOptions, context));
    }

    /**
     * The iso8601 operation.
     * 
     * @param duration The duration parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return there is no content to send for this request, but the headers may be useful along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> iso8601WithResponse(Duration duration, RequestOptions requestOptions) {
        final String accept = "application/json";
        return service.iso8601Sync(duration, accept, requestOptions, Context.NONE);
    }

    /**
     * The iso8601Array operation.
     * 
     * @param duration The duration parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return there is no content to send for this request, but the headers may be useful along with {@link Response}
     * on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> iso8601ArrayWithResponseAsync(List<Duration> duration, RequestOptions requestOptions) {
        final String accept = "application/json";
        String durationConverted
            = JacksonAdapter.createDefaultSerializerAdapter().serializeIterable(duration, CollectionFormat.CSV);
        return FluxUtil
            .withContext(context -> service.iso8601Array(durationConverted, accept, requestOptions, context));
    }

    /**
     * The iso8601Array operation.
     * 
     * @param duration The duration parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return there is no content to send for this request, but the headers may be useful along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> iso8601ArrayWithResponse(List<Duration> duration, RequestOptions requestOptions) {
        final String accept = "application/json";
        String durationConverted
            = JacksonAdapter.createDefaultSerializerAdapter().serializeIterable(duration, CollectionFormat.CSV);
        return service.iso8601ArraySync(durationConverted, accept, requestOptions, Context.NONE);
    }

    /**
     * The int32Seconds operation.
     * 
     * @param duration The duration parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return there is no content to send for this request, but the headers may be useful along with {@link Response}
     * on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> int32SecondsWithResponseAsync(Duration duration, RequestOptions requestOptions) {
        final String accept = "application/json";
        long durationConverted = duration.getSeconds();
        return FluxUtil
            .withContext(context -> service.int32Seconds(durationConverted, accept, requestOptions, context));
    }

    /**
     * The int32Seconds operation.
     * 
     * @param duration The duration parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return there is no content to send for this request, but the headers may be useful along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> int32SecondsWithResponse(Duration duration, RequestOptions requestOptions) {
        final String accept = "application/json";
        long durationConverted = duration.getSeconds();
        return service.int32SecondsSync(durationConverted, accept, requestOptions, Context.NONE);
    }

    /**
     * The floatSeconds operation.
     * 
     * @param duration The duration parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return there is no content to send for this request, but the headers may be useful along with {@link Response}
     * on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> floatSecondsWithResponseAsync(Duration duration, RequestOptions requestOptions) {
        final String accept = "application/json";
        double durationConverted = (double) duration.toNanos() / 1000_000_000L;
        return FluxUtil
            .withContext(context -> service.floatSeconds(durationConverted, accept, requestOptions, context));
    }

    /**
     * The floatSeconds operation.
     * 
     * @param duration The duration parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return there is no content to send for this request, but the headers may be useful along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> floatSecondsWithResponse(Duration duration, RequestOptions requestOptions) {
        final String accept = "application/json";
        double durationConverted = (double) duration.toNanos() / 1000_000_000L;
        return service.floatSecondsSync(durationConverted, accept, requestOptions, Context.NONE);
    }

    /**
     * The float64Seconds operation.
     * 
     * @param duration The duration parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return there is no content to send for this request, but the headers may be useful along with {@link Response}
     * on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> float64SecondsWithResponseAsync(Duration duration, RequestOptions requestOptions) {
        final String accept = "application/json";
        double durationConverted = (double) duration.toNanos() / 1000_000_000L;
        return FluxUtil
            .withContext(context -> service.float64Seconds(durationConverted, accept, requestOptions, context));
    }

    /**
     * The float64Seconds operation.
     * 
     * @param duration The duration parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return there is no content to send for this request, but the headers may be useful along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> float64SecondsWithResponse(Duration duration, RequestOptions requestOptions) {
        final String accept = "application/json";
        double durationConverted = (double) duration.toNanos() / 1000_000_000L;
        return service.float64SecondsSync(durationConverted, accept, requestOptions, Context.NONE);
    }
}
