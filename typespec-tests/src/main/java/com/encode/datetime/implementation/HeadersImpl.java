// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.encode.datetime.implementation;

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
import com.azure.core.util.DateTimeRfc1123;
import com.azure.core.util.FluxUtil;
import com.azure.core.util.serializer.CollectionFormat;
import com.azure.core.util.serializer.JacksonAdapter;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.stream.Collectors;
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
    private final DatetimeClientImpl client;

    /**
     * Initializes an instance of HeadersImpl.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    HeadersImpl(DatetimeClientImpl client) {
        this.service = RestProxy.create(HeadersService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for DatetimeClientHeaders to be used by the proxy service to perform REST
     * calls.
     */
    @Host("http://localhost:3000")
    @ServiceInterface(name = "DatetimeClientHeader")
    public interface HeadersService {
        @Get("/encode/datetime/header/default")
        @ExpectedResponses({ 204 })
        @UnexpectedResponseExceptionType(value = ClientAuthenticationException.class, code = { 401 })
        @UnexpectedResponseExceptionType(value = ResourceNotFoundException.class, code = { 404 })
        @UnexpectedResponseExceptionType(value = ResourceModifiedException.class, code = { 409 })
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Mono<Response<Void>> defaultMethod(@HeaderParam("value") DateTimeRfc1123 value, RequestOptions requestOptions,
            Context context);

        @Get("/encode/datetime/header/default")
        @ExpectedResponses({ 204 })
        @UnexpectedResponseExceptionType(value = ClientAuthenticationException.class, code = { 401 })
        @UnexpectedResponseExceptionType(value = ResourceNotFoundException.class, code = { 404 })
        @UnexpectedResponseExceptionType(value = ResourceModifiedException.class, code = { 409 })
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Response<Void> defaultMethodSync(@HeaderParam("value") DateTimeRfc1123 value, RequestOptions requestOptions,
            Context context);

        @Get("/encode/datetime/header/rfc3339")
        @ExpectedResponses({ 204 })
        @UnexpectedResponseExceptionType(value = ClientAuthenticationException.class, code = { 401 })
        @UnexpectedResponseExceptionType(value = ResourceNotFoundException.class, code = { 404 })
        @UnexpectedResponseExceptionType(value = ResourceModifiedException.class, code = { 409 })
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Mono<Response<Void>> rfc3339(@HeaderParam("value") OffsetDateTime value, RequestOptions requestOptions,
            Context context);

        @Get("/encode/datetime/header/rfc3339")
        @ExpectedResponses({ 204 })
        @UnexpectedResponseExceptionType(value = ClientAuthenticationException.class, code = { 401 })
        @UnexpectedResponseExceptionType(value = ResourceNotFoundException.class, code = { 404 })
        @UnexpectedResponseExceptionType(value = ResourceModifiedException.class, code = { 409 })
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Response<Void> rfc3339Sync(@HeaderParam("value") OffsetDateTime value, RequestOptions requestOptions,
            Context context);

        @Get("/encode/datetime/header/rfc7231")
        @ExpectedResponses({ 204 })
        @UnexpectedResponseExceptionType(value = ClientAuthenticationException.class, code = { 401 })
        @UnexpectedResponseExceptionType(value = ResourceNotFoundException.class, code = { 404 })
        @UnexpectedResponseExceptionType(value = ResourceModifiedException.class, code = { 409 })
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Mono<Response<Void>> rfc7231(@HeaderParam("value") DateTimeRfc1123 value, RequestOptions requestOptions,
            Context context);

        @Get("/encode/datetime/header/rfc7231")
        @ExpectedResponses({ 204 })
        @UnexpectedResponseExceptionType(value = ClientAuthenticationException.class, code = { 401 })
        @UnexpectedResponseExceptionType(value = ResourceNotFoundException.class, code = { 404 })
        @UnexpectedResponseExceptionType(value = ResourceModifiedException.class, code = { 409 })
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Response<Void> rfc7231Sync(@HeaderParam("value") DateTimeRfc1123 value, RequestOptions requestOptions,
            Context context);

        @Get("/encode/datetime/header/unix-timestamp")
        @ExpectedResponses({ 204 })
        @UnexpectedResponseExceptionType(value = ClientAuthenticationException.class, code = { 401 })
        @UnexpectedResponseExceptionType(value = ResourceNotFoundException.class, code = { 404 })
        @UnexpectedResponseExceptionType(value = ResourceModifiedException.class, code = { 409 })
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Mono<Response<Void>> unixTimestamp(@HeaderParam("value") long value, RequestOptions requestOptions,
            Context context);

        @Get("/encode/datetime/header/unix-timestamp")
        @ExpectedResponses({ 204 })
        @UnexpectedResponseExceptionType(value = ClientAuthenticationException.class, code = { 401 })
        @UnexpectedResponseExceptionType(value = ResourceNotFoundException.class, code = { 404 })
        @UnexpectedResponseExceptionType(value = ResourceModifiedException.class, code = { 409 })
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Response<Void> unixTimestampSync(@HeaderParam("value") long value, RequestOptions requestOptions,
            Context context);

        @Get("/encode/datetime/header/unix-timestamp-array")
        @ExpectedResponses({ 204 })
        @UnexpectedResponseExceptionType(value = ClientAuthenticationException.class, code = { 401 })
        @UnexpectedResponseExceptionType(value = ResourceNotFoundException.class, code = { 404 })
        @UnexpectedResponseExceptionType(value = ResourceModifiedException.class, code = { 409 })
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Mono<Response<Void>> unixTimestampArray(@HeaderParam("value") String value, RequestOptions requestOptions,
            Context context);

        @Get("/encode/datetime/header/unix-timestamp-array")
        @ExpectedResponses({ 204 })
        @UnexpectedResponseExceptionType(value = ClientAuthenticationException.class, code = { 401 })
        @UnexpectedResponseExceptionType(value = ResourceNotFoundException.class, code = { 404 })
        @UnexpectedResponseExceptionType(value = ResourceModifiedException.class, code = { 409 })
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Response<Void> unixTimestampArraySync(@HeaderParam("value") String value, RequestOptions requestOptions,
            Context context);
    }

    /**
     * The defaultMethod operation.
     * 
     * @param value The value parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> defaultMethodWithResponseAsync(OffsetDateTime value, RequestOptions requestOptions) {
        DateTimeRfc1123 valueConverted = new DateTimeRfc1123(value);
        return FluxUtil.withContext(context -> service.defaultMethod(valueConverted, requestOptions, context));
    }

    /**
     * The defaultMethod operation.
     * 
     * @param value The value parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> defaultMethodWithResponse(OffsetDateTime value, RequestOptions requestOptions) {
        DateTimeRfc1123 valueConverted = new DateTimeRfc1123(value);
        return service.defaultMethodSync(valueConverted, requestOptions, Context.NONE);
    }

    /**
     * The rfc3339 operation.
     * 
     * @param value The value parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> rfc3339WithResponseAsync(OffsetDateTime value, RequestOptions requestOptions) {
        return FluxUtil.withContext(context -> service.rfc3339(value, requestOptions, context));
    }

    /**
     * The rfc3339 operation.
     * 
     * @param value The value parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> rfc3339WithResponse(OffsetDateTime value, RequestOptions requestOptions) {
        return service.rfc3339Sync(value, requestOptions, Context.NONE);
    }

    /**
     * The rfc7231 operation.
     * 
     * @param value The value parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> rfc7231WithResponseAsync(OffsetDateTime value, RequestOptions requestOptions) {
        DateTimeRfc1123 valueConverted = new DateTimeRfc1123(value);
        return FluxUtil.withContext(context -> service.rfc7231(valueConverted, requestOptions, context));
    }

    /**
     * The rfc7231 operation.
     * 
     * @param value The value parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> rfc7231WithResponse(OffsetDateTime value, RequestOptions requestOptions) {
        DateTimeRfc1123 valueConverted = new DateTimeRfc1123(value);
        return service.rfc7231Sync(valueConverted, requestOptions, Context.NONE);
    }

    /**
     * The unixTimestamp operation.
     * 
     * @param value The value parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> unixTimestampWithResponseAsync(OffsetDateTime value, RequestOptions requestOptions) {
        long valueConverted = value.toEpochSecond();
        return FluxUtil.withContext(context -> service.unixTimestamp(valueConverted, requestOptions, context));
    }

    /**
     * The unixTimestamp operation.
     * 
     * @param value The value parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> unixTimestampWithResponse(OffsetDateTime value, RequestOptions requestOptions) {
        long valueConverted = value.toEpochSecond();
        return service.unixTimestampSync(valueConverted, requestOptions, Context.NONE);
    }

    /**
     * The unixTimestampArray operation.
     * 
     * @param value The value parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> unixTimestampArrayWithResponseAsync(List<OffsetDateTime> value,
        RequestOptions requestOptions) {
        String valueConverted = JacksonAdapter.createDefaultSerializerAdapter()
            .serializeIterable(
                value.stream().map(paramItemValue -> paramItemValue.toEpochSecond()).collect(Collectors.toList()),
                CollectionFormat.CSV);
        return FluxUtil.withContext(context -> service.unixTimestampArray(valueConverted, requestOptions, context));
    }

    /**
     * The unixTimestampArray operation.
     * 
     * @param value The value parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> unixTimestampArrayWithResponse(List<OffsetDateTime> value, RequestOptions requestOptions) {
        String valueConverted = JacksonAdapter.createDefaultSerializerAdapter()
            .serializeIterable(
                value.stream().map(paramItemValue -> paramItemValue.toEpochSecond()).collect(Collectors.toList()),
                CollectionFormat.CSV);
        return service.unixTimestampArraySync(valueConverted, requestOptions, Context.NONE);
    }
}
