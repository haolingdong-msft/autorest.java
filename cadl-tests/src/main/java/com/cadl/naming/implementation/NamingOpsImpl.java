// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.cadl.naming.implementation;

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
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.util.BinaryData;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in NamingOps. */
public final class NamingOpsImpl {
    /** The proxy service used to perform REST calls. */
    private final NamingOpsService service;

    /** The service client containing this operation class. */
    private final NamingClientImpl client;

    /**
     * Initializes an instance of NamingOpsImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    NamingOpsImpl(NamingClientImpl client) {
        this.service =
                RestProxy.create(NamingOpsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for NamingNamingOps to be used by the proxy service to perform REST
     * calls.
     */
    @Host("{endpoint}")
    @ServiceInterface(name = "NamingNamingOps")
    private interface NamingOpsService {
        @Post("/naming")
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
        Mono<Response<BinaryData>> post(
                @HostParam("endpoint") String endpoint,
                @QueryParam("name") String name,
                @HeaderParam("accept") String accept,
                RequestOptions requestOptions,
                Context context);
    }

    /**
     * summary of POST op
     *
     * <p>description of POST op.
     *
     * <p><strong>Header Parameters</strong>
     *
     * <table border="1">
     *     <caption>Header Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>etag</td><td>String</td><td>No</td><td>summary of etag header parameter
     *
     * description of etag header parameter</td></tr>
     * </table>
     *
     * You can add these to a request with {@link RequestOptions#addHeader}
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     name: String (Required)
     *     data: byte[] (Required)
     * }
     * }</pre>
     *
     * @param name summary of name query parameter
     *     <p>description of name query parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return summary of Response along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> postWithResponseAsync(String name, RequestOptions requestOptions) {
        final String accept = "application/json";
        return FluxUtil.withContext(
                context -> service.post(this.client.getEndpoint(), name, accept, requestOptions, context));
    }

    /**
     * summary of POST op
     *
     * <p>description of POST op.
     *
     * <p><strong>Header Parameters</strong>
     *
     * <table border="1">
     *     <caption>Header Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>etag</td><td>String</td><td>No</td><td>summary of etag header parameter
     *
     * description of etag header parameter</td></tr>
     * </table>
     *
     * You can add these to a request with {@link RequestOptions#addHeader}
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     name: String (Required)
     *     data: byte[] (Required)
     * }
     * }</pre>
     *
     * @param name summary of name query parameter
     *     <p>description of name query parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return summary of Response along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> postWithResponseAsync(
            String name, RequestOptions requestOptions, Context context) {
        final String accept = "application/json";
        return service.post(this.client.getEndpoint(), name, accept, requestOptions, context);
    }

    /**
     * summary of POST op
     *
     * <p>description of POST op.
     *
     * <p><strong>Header Parameters</strong>
     *
     * <table border="1">
     *     <caption>Header Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>etag</td><td>String</td><td>No</td><td>summary of etag header parameter
     *
     * description of etag header parameter</td></tr>
     * </table>
     *
     * You can add these to a request with {@link RequestOptions#addHeader}
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     name: String (Required)
     *     data: byte[] (Required)
     * }
     * }</pre>
     *
     * @param name summary of name query parameter
     *     <p>description of name query parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return summary of Response along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> postWithResponse(String name, RequestOptions requestOptions) {
        return postWithResponseAsync(name, requestOptions).block();
    }
}
