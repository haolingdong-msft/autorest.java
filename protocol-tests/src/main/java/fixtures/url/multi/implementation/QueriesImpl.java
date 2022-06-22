// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package fixtures.url.multi.implementation;

import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
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
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in Queries. */
public final class QueriesImpl {
    /** The proxy service used to perform REST calls. */
    private final QueriesService service;

    /** The service client containing this operation class. */
    private final AutoRestUrlMutliCollectionFormatTestServiceClientImpl client;

    /**
     * Initializes an instance of QueriesImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    QueriesImpl(AutoRestUrlMutliCollectionFormatTestServiceClientImpl client) {
        this.service = RestProxy.create(QueriesService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for AutoRestUrlMutliCollectionFormatTestServiceQueries to be used by the
     * proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "AutoRestUrlMutliColl")
    private interface QueriesService {
        @Get("/queries/array/multi/string/null")
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
        Mono<Response<Void>> arrayStringMultiNull(
                @HostParam("$host") String host,
                @HeaderParam("Accept") String accept,
                RequestOptions requestOptions,
                Context context);

        @Get("/queries/array/multi/string/empty")
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
        Mono<Response<Void>> arrayStringMultiEmpty(
                @HostParam("$host") String host,
                @HeaderParam("Accept") String accept,
                RequestOptions requestOptions,
                Context context);

        @Get("/queries/array/multi/string/valid")
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
        Mono<Response<Void>> arrayStringMultiValid(
                @HostParam("$host") String host,
                @HeaderParam("Accept") String accept,
                RequestOptions requestOptions,
                Context context);
    }

    /**
     * Get a null array of string using the multi-array format.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>arrayQuery</td><td>List&lt;String&gt;</td><td>No</td><td>a null array of string using the multi-array format. Call {@link RequestOptions#addQueryParam} to add string to array.</td></tr>
     * </table>
     *
     * You can add these to a request with {@code new RequestOptions.addQueryParam()}
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return a null array of string using the multi-array format along with {@link Response} on successful completion
     *     of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> arrayStringMultiNullWithResponseAsync(RequestOptions requestOptions) {
        final String accept = "application/json";
        return FluxUtil.withContext(
                context -> service.arrayStringMultiNull(this.client.getHost(), accept, requestOptions, context));
    }

    /**
     * Get a null array of string using the multi-array format.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>arrayQuery</td><td>List&lt;String&gt;</td><td>No</td><td>a null array of string using the multi-array format. Call {@link RequestOptions#addQueryParam} to add string to array.</td></tr>
     * </table>
     *
     * You can add these to a request with {@code new RequestOptions.addQueryParam()}
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return a null array of string using the multi-array format along with {@link Response} on successful completion
     *     of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> arrayStringMultiNullWithResponseAsync(RequestOptions requestOptions, Context context) {
        final String accept = "application/json";
        return service.arrayStringMultiNull(this.client.getHost(), accept, requestOptions, context);
    }

    /**
     * Get a null array of string using the multi-array format.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>arrayQuery</td><td>List&lt;String&gt;</td><td>No</td><td>a null array of string using the multi-array format. Call {@link RequestOptions#addQueryParam} to add string to array.</td></tr>
     * </table>
     *
     * You can add these to a request with {@code new RequestOptions.addQueryParam()}
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return a null array of string using the multi-array format along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> arrayStringMultiNullWithResponse(RequestOptions requestOptions) {
        return arrayStringMultiNullWithResponseAsync(requestOptions).block();
    }

    /**
     * Get an empty array [] of string using the multi-array format.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>arrayQuery</td><td>List&lt;String&gt;</td><td>No</td><td>an empty array [] of string using the multi-array format. Call {@link RequestOptions#addQueryParam} to add string to array.</td></tr>
     * </table>
     *
     * You can add these to a request with {@code new RequestOptions.addQueryParam()}
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return an empty array [] of string using the multi-array format along with {@link Response} on successful
     *     completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> arrayStringMultiEmptyWithResponseAsync(RequestOptions requestOptions) {
        final String accept = "application/json";
        return FluxUtil.withContext(
                context -> service.arrayStringMultiEmpty(this.client.getHost(), accept, requestOptions, context));
    }

    /**
     * Get an empty array [] of string using the multi-array format.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>arrayQuery</td><td>List&lt;String&gt;</td><td>No</td><td>an empty array [] of string using the multi-array format. Call {@link RequestOptions#addQueryParam} to add string to array.</td></tr>
     * </table>
     *
     * You can add these to a request with {@code new RequestOptions.addQueryParam()}
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return an empty array [] of string using the multi-array format along with {@link Response} on successful
     *     completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> arrayStringMultiEmptyWithResponseAsync(RequestOptions requestOptions, Context context) {
        final String accept = "application/json";
        return service.arrayStringMultiEmpty(this.client.getHost(), accept, requestOptions, context);
    }

    /**
     * Get an empty array [] of string using the multi-array format.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>arrayQuery</td><td>List&lt;String&gt;</td><td>No</td><td>an empty array [] of string using the multi-array format. Call {@link RequestOptions#addQueryParam} to add string to array.</td></tr>
     * </table>
     *
     * You can add these to a request with {@code new RequestOptions.addQueryParam()}
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return an empty array [] of string using the multi-array format along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> arrayStringMultiEmptyWithResponse(RequestOptions requestOptions) {
        return arrayStringMultiEmptyWithResponseAsync(requestOptions).block();
    }

    /**
     * Get an array of string ['ArrayQuery1', 'begin!*'();:@ &amp;=+$,/?#[]end' , null, ''] using the mult-array format.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>arrayQuery</td><td>List&lt;String&gt;</td><td>No</td><td>an array of string ['ArrayQuery1', 'begin!*'();:@ &amp;=+$,/?#[]end' , null, ''] using the mult-array format. Call {@link RequestOptions#addQueryParam} to add string to array.</td></tr>
     * </table>
     *
     * You can add these to a request with {@code new RequestOptions.addQueryParam()}
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return an array of string ['ArrayQuery1', 'begin!*'();:@ &amp;=+$,/?#[]end' , null, ''] using the mult-array
     *     format along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> arrayStringMultiValidWithResponseAsync(RequestOptions requestOptions) {
        final String accept = "application/json";
        return FluxUtil.withContext(
                context -> service.arrayStringMultiValid(this.client.getHost(), accept, requestOptions, context));
    }

    /**
     * Get an array of string ['ArrayQuery1', 'begin!*'();:@ &amp;=+$,/?#[]end' , null, ''] using the mult-array format.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>arrayQuery</td><td>List&lt;String&gt;</td><td>No</td><td>an array of string ['ArrayQuery1', 'begin!*'();:@ &amp;=+$,/?#[]end' , null, ''] using the mult-array format. Call {@link RequestOptions#addQueryParam} to add string to array.</td></tr>
     * </table>
     *
     * You can add these to a request with {@code new RequestOptions.addQueryParam()}
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return an array of string ['ArrayQuery1', 'begin!*'();:@ &amp;=+$,/?#[]end' , null, ''] using the mult-array
     *     format along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> arrayStringMultiValidWithResponseAsync(RequestOptions requestOptions, Context context) {
        final String accept = "application/json";
        return service.arrayStringMultiValid(this.client.getHost(), accept, requestOptions, context);
    }

    /**
     * Get an array of string ['ArrayQuery1', 'begin!*'();:@ &amp;=+$,/?#[]end' , null, ''] using the mult-array format.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>arrayQuery</td><td>List&lt;String&gt;</td><td>No</td><td>an array of string ['ArrayQuery1', 'begin!*'();:@ &amp;=+$,/?#[]end' , null, ''] using the mult-array format. Call {@link RequestOptions#addQueryParam} to add string to array.</td></tr>
     * </table>
     *
     * You can add these to a request with {@code new RequestOptions.addQueryParam()}
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return an array of string ['ArrayQuery1', 'begin!*'();:@ &amp;=+$,/?#[]end' , null, ''] using the mult-array
     *     format along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> arrayStringMultiValidWithResponse(RequestOptions requestOptions) {
        return arrayStringMultiValidWithResponseAsync(requestOptions).block();
    }
}
