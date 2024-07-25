// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com._specs_.azure.core.basic.implementation;

import com._specs_.azure.core.basic.BasicServiceVersion;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.exception.ClientAuthenticationException;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.exception.ResourceModifiedException;
import com.azure.core.exception.ResourceNotFoundException;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.PagedResponse;
import com.azure.core.http.rest.PagedResponseBase;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.util.BinaryData;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in TwoModelsAsPageItems.
 */
public final class TwoModelsAsPageItemsImpl {
    /**
     * The proxy service used to perform REST calls.
     */
    private final TwoModelsAsPageItemsService service;

    /**
     * The service client containing this operation class.
     */
    private final BasicClientImpl client;

    /**
     * Initializes an instance of TwoModelsAsPageItemsImpl.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    TwoModelsAsPageItemsImpl(BasicClientImpl client) {
        this.service = RestProxy.create(TwoModelsAsPageItemsService.class, client.getHttpPipeline(),
            client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * Gets Service version.
     * 
     * @return the serviceVersion value.
     */
    public BasicServiceVersion getServiceVersion() {
        return client.getServiceVersion();
    }

    /**
     * The interface defining all the services for BasicClientTwoModelsAsPageItems to be used by the proxy service to
     * perform REST calls.
     */
    @Host("http://localhost:3000")
    @ServiceInterface(name = "BasicClientTwoModels")
    public interface TwoModelsAsPageItemsService {
        @Get("/azure/core/basic/first-item")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(value = ClientAuthenticationException.class, code = { 401 })
        @UnexpectedResponseExceptionType(value = ResourceNotFoundException.class, code = { 404 })
        @UnexpectedResponseExceptionType(value = ResourceModifiedException.class, code = { 409 })
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Mono<Response<BinaryData>> listFirstItem(@QueryParam("api-version") String apiVersion,
            @HeaderParam("accept") String accept, RequestOptions requestOptions, Context context);

        @Get("/azure/core/basic/first-item")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(value = ClientAuthenticationException.class, code = { 401 })
        @UnexpectedResponseExceptionType(value = ResourceNotFoundException.class, code = { 404 })
        @UnexpectedResponseExceptionType(value = ResourceModifiedException.class, code = { 409 })
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Response<BinaryData> listFirstItemSync(@QueryParam("api-version") String apiVersion,
            @HeaderParam("accept") String accept, RequestOptions requestOptions, Context context);

        @Get("/azure/core/basic/second-item")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(value = ClientAuthenticationException.class, code = { 401 })
        @UnexpectedResponseExceptionType(value = ResourceNotFoundException.class, code = { 404 })
        @UnexpectedResponseExceptionType(value = ResourceModifiedException.class, code = { 409 })
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Mono<Response<BinaryData>> listSecondItem(@QueryParam("api-version") String apiVersion,
            @HeaderParam("accept") String accept, RequestOptions requestOptions, Context context);

        @Get("/azure/core/basic/second-item")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(value = ClientAuthenticationException.class, code = { 401 })
        @UnexpectedResponseExceptionType(value = ResourceNotFoundException.class, code = { 404 })
        @UnexpectedResponseExceptionType(value = ResourceModifiedException.class, code = { 409 })
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Response<BinaryData> listSecondItemSync(@QueryParam("api-version") String apiVersion,
            @HeaderParam("accept") String accept, RequestOptions requestOptions, Context context);

        @Get("{nextLink}")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(value = ClientAuthenticationException.class, code = { 401 })
        @UnexpectedResponseExceptionType(value = ResourceNotFoundException.class, code = { 404 })
        @UnexpectedResponseExceptionType(value = ResourceModifiedException.class, code = { 409 })
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Mono<Response<BinaryData>> listFirstItemNext(@PathParam(value = "nextLink", encoded = true) String nextLink,
            @HeaderParam("accept") String accept, RequestOptions requestOptions, Context context);

        @Get("{nextLink}")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(value = ClientAuthenticationException.class, code = { 401 })
        @UnexpectedResponseExceptionType(value = ResourceNotFoundException.class, code = { 404 })
        @UnexpectedResponseExceptionType(value = ResourceModifiedException.class, code = { 409 })
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Response<BinaryData> listFirstItemNextSync(@PathParam(value = "nextLink", encoded = true) String nextLink,
            @HeaderParam("accept") String accept, RequestOptions requestOptions, Context context);

        @Get("{nextLink}")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(value = ClientAuthenticationException.class, code = { 401 })
        @UnexpectedResponseExceptionType(value = ResourceNotFoundException.class, code = { 404 })
        @UnexpectedResponseExceptionType(value = ResourceModifiedException.class, code = { 409 })
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Mono<Response<BinaryData>> listSecondItemNext(@PathParam(value = "nextLink", encoded = true) String nextLink,
            @HeaderParam("accept") String accept, RequestOptions requestOptions, Context context);

        @Get("{nextLink}")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(value = ClientAuthenticationException.class, code = { 401 })
        @UnexpectedResponseExceptionType(value = ResourceNotFoundException.class, code = { 404 })
        @UnexpectedResponseExceptionType(value = ResourceModifiedException.class, code = { 409 })
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Response<BinaryData> listSecondItemNextSync(@PathParam(value = "nextLink", encoded = true) String nextLink,
            @HeaderParam("accept") String accept, RequestOptions requestOptions, Context context);
    }

    /**
     * Two operations with two different page item types should be successfully generated. Should generate model for
     * FirstItem.
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     id: int (Required)
     * }
     * }</pre>
     * 
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the request has succeeded along with {@link PagedResponse} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<BinaryData>> listFirstItemSinglePageAsync(RequestOptions requestOptions) {
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.listFirstItem(this.client.getServiceVersion().getVersion(), accept,
                requestOptions, context))
            .map(res -> new PagedResponseBase<>(res.getRequest(), res.getStatusCode(), res.getHeaders(),
                getValues(res.getValue(), "value"), getNextLink(res.getValue(), "nextLink"), null));
    }

    /**
     * Two operations with two different page item types should be successfully generated. Should generate model for
     * FirstItem.
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     id: int (Required)
     * }
     * }</pre>
     * 
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the request has succeeded as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<BinaryData> listFirstItemAsync(RequestOptions requestOptions) {
        RequestOptions requestOptionsForNextPage = new RequestOptions();
        requestOptionsForNextPage.setContext(
            requestOptions != null && requestOptions.getContext() != null ? requestOptions.getContext() : Context.NONE);
        return new PagedFlux<>(() -> listFirstItemSinglePageAsync(requestOptions),
            nextLink -> listFirstItemNextSinglePageAsync(nextLink, requestOptionsForNextPage));
    }

    /**
     * Two operations with two different page item types should be successfully generated. Should generate model for
     * FirstItem.
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     id: int (Required)
     * }
     * }</pre>
     * 
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the request has succeeded along with {@link PagedResponse}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private PagedResponse<BinaryData> listFirstItemSinglePage(RequestOptions requestOptions) {
        final String accept = "application/json";
        Response<BinaryData> res = service.listFirstItemSync(this.client.getServiceVersion().getVersion(), accept,
            requestOptions, Context.NONE);
        return new PagedResponseBase<>(res.getRequest(), res.getStatusCode(), res.getHeaders(),
            getValues(res.getValue(), "value"), getNextLink(res.getValue(), "nextLink"), null);
    }

    /**
     * Two operations with two different page item types should be successfully generated. Should generate model for
     * FirstItem.
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     id: int (Required)
     * }
     * }</pre>
     * 
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the request has succeeded as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<BinaryData> listFirstItem(RequestOptions requestOptions) {
        RequestOptions requestOptionsForNextPage = new RequestOptions();
        requestOptionsForNextPage.setContext(
            requestOptions != null && requestOptions.getContext() != null ? requestOptions.getContext() : Context.NONE);
        return new PagedIterable<>(() -> listFirstItemSinglePage(requestOptions),
            nextLink -> listFirstItemNextSinglePage(nextLink, requestOptionsForNextPage));
    }

    /**
     * Two operations with two different page item types should be successfully generated. Should generate model for
     * SecondItem.
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     name: String (Required)
     * }
     * }</pre>
     * 
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the request has succeeded along with {@link PagedResponse} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<BinaryData>> listSecondItemSinglePageAsync(RequestOptions requestOptions) {
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.listSecondItem(this.client.getServiceVersion().getVersion(), accept,
                requestOptions, context))
            .map(res -> new PagedResponseBase<>(res.getRequest(), res.getStatusCode(), res.getHeaders(),
                getValues(res.getValue(), "value"), getNextLink(res.getValue(), "nextLink"), null));
    }

    /**
     * Two operations with two different page item types should be successfully generated. Should generate model for
     * SecondItem.
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     name: String (Required)
     * }
     * }</pre>
     * 
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the request has succeeded as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<BinaryData> listSecondItemAsync(RequestOptions requestOptions) {
        RequestOptions requestOptionsForNextPage = new RequestOptions();
        requestOptionsForNextPage.setContext(
            requestOptions != null && requestOptions.getContext() != null ? requestOptions.getContext() : Context.NONE);
        return new PagedFlux<>(() -> listSecondItemSinglePageAsync(requestOptions),
            nextLink -> listSecondItemNextSinglePageAsync(nextLink, requestOptionsForNextPage));
    }

    /**
     * Two operations with two different page item types should be successfully generated. Should generate model for
     * SecondItem.
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     name: String (Required)
     * }
     * }</pre>
     * 
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the request has succeeded along with {@link PagedResponse}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private PagedResponse<BinaryData> listSecondItemSinglePage(RequestOptions requestOptions) {
        final String accept = "application/json";
        Response<BinaryData> res = service.listSecondItemSync(this.client.getServiceVersion().getVersion(), accept,
            requestOptions, Context.NONE);
        return new PagedResponseBase<>(res.getRequest(), res.getStatusCode(), res.getHeaders(),
            getValues(res.getValue(), "value"), getNextLink(res.getValue(), "nextLink"), null);
    }

    /**
     * Two operations with two different page item types should be successfully generated. Should generate model for
     * SecondItem.
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     name: String (Required)
     * }
     * }</pre>
     * 
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the request has succeeded as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<BinaryData> listSecondItem(RequestOptions requestOptions) {
        RequestOptions requestOptionsForNextPage = new RequestOptions();
        requestOptionsForNextPage.setContext(
            requestOptions != null && requestOptions.getContext() != null ? requestOptions.getContext() : Context.NONE);
        return new PagedIterable<>(() -> listSecondItemSinglePage(requestOptions),
            nextLink -> listSecondItemNextSinglePage(nextLink, requestOptionsForNextPage));
    }

    /**
     * Get the next page of items.
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     id: int (Required)
     * }
     * }</pre>
     * 
     * @param nextLink The URL to get the next list of items.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the request has succeeded along with {@link PagedResponse} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<BinaryData>> listFirstItemNextSinglePageAsync(String nextLink,
        RequestOptions requestOptions) {
        final String accept = "application/json";
        return FluxUtil.withContext(context -> service.listFirstItemNext(nextLink, accept, requestOptions, context))
            .map(res -> new PagedResponseBase<>(res.getRequest(), res.getStatusCode(), res.getHeaders(),
                getValues(res.getValue(), "value"), getNextLink(res.getValue(), "nextLink"), null));
    }

    /**
     * Get the next page of items.
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     id: int (Required)
     * }
     * }</pre>
     * 
     * @param nextLink The URL to get the next list of items.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the request has succeeded along with {@link PagedResponse}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private PagedResponse<BinaryData> listFirstItemNextSinglePage(String nextLink, RequestOptions requestOptions) {
        final String accept = "application/json";
        Response<BinaryData> res = service.listFirstItemNextSync(nextLink, accept, requestOptions, Context.NONE);
        return new PagedResponseBase<>(res.getRequest(), res.getStatusCode(), res.getHeaders(),
            getValues(res.getValue(), "value"), getNextLink(res.getValue(), "nextLink"), null);
    }

    /**
     * Get the next page of items.
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     name: String (Required)
     * }
     * }</pre>
     * 
     * @param nextLink The URL to get the next list of items.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the request has succeeded along with {@link PagedResponse} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<BinaryData>> listSecondItemNextSinglePageAsync(String nextLink,
        RequestOptions requestOptions) {
        final String accept = "application/json";
        return FluxUtil.withContext(context -> service.listSecondItemNext(nextLink, accept, requestOptions, context))
            .map(res -> new PagedResponseBase<>(res.getRequest(), res.getStatusCode(), res.getHeaders(),
                getValues(res.getValue(), "value"), getNextLink(res.getValue(), "nextLink"), null));
    }

    /**
     * Get the next page of items.
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     name: String (Required)
     * }
     * }</pre>
     * 
     * @param nextLink The URL to get the next list of items.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the request has succeeded along with {@link PagedResponse}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private PagedResponse<BinaryData> listSecondItemNextSinglePage(String nextLink, RequestOptions requestOptions) {
        final String accept = "application/json";
        Response<BinaryData> res = service.listSecondItemNextSync(nextLink, accept, requestOptions, Context.NONE);
        return new PagedResponseBase<>(res.getRequest(), res.getStatusCode(), res.getHeaders(),
            getValues(res.getValue(), "value"), getNextLink(res.getValue(), "nextLink"), null);
    }

    private List<BinaryData> getValues(BinaryData binaryData, String path) {
        try {
            Map<?, ?> obj = binaryData.toObject(Map.class);
            List<?> values = (List<?>) obj.get(path);
            return values.stream().map(BinaryData::fromObject).collect(Collectors.toList());
        } catch (RuntimeException e) {
            return null;
        }
    }

    private String getNextLink(BinaryData binaryData, String path) {
        try {
            Map<?, ?> obj = binaryData.toObject(Map.class);
            return (String) obj.get(path);
        } catch (RuntimeException e) {
            return null;
        }
    }
}
