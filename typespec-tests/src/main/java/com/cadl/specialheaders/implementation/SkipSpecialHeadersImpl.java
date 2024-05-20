// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.cadl.specialheaders.implementation;

import com.azure.core.annotation.Delete;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
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
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.cadl.specialheaders.SpecialHeadersServiceVersion;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in SkipSpecialHeaders.
 */
public final class SkipSpecialHeadersImpl {
    /**
     * The proxy service used to perform REST calls.
     */
    private final SkipSpecialHeadersService service;

    /**
     * The service client containing this operation class.
     */
    private final SpecialHeadersClientImpl client;

    /**
     * Initializes an instance of SkipSpecialHeadersImpl.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    SkipSpecialHeadersImpl(SpecialHeadersClientImpl client) {
        this.service = RestProxy.create(SkipSpecialHeadersService.class, client.getHttpPipeline(),
            client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * Gets Service version.
     * 
     * @return the serviceVersion value.
     */
    public SpecialHeadersServiceVersion getServiceVersion() {
        return client.getServiceVersion();
    }

    /**
     * The interface defining all the services for SpecialHeadersClientSkipSpecialHeaders to be used by the proxy
     * service to perform REST calls.
     */
    @Host("{endpoint}")
    @ServiceInterface(name = "SpecialHeadersClient")
    public interface SkipSpecialHeadersService {
        @Delete("/skip-special-headers/resources/{name}")
        @ExpectedResponses({ 204 })
        @UnexpectedResponseExceptionType(value = ClientAuthenticationException.class, code = { 401 })
        @UnexpectedResponseExceptionType(value = ResourceNotFoundException.class, code = { 404 })
        @UnexpectedResponseExceptionType(value = ResourceModifiedException.class, code = { 409 })
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Mono<Response<Void>> deleteWithSpecialHeaders(@HostParam("endpoint") String endpoint,
            @QueryParam("api-version") String apiVersion, @PathParam("name") String name,
            @HeaderParam("foo") String foo, @HeaderParam("accept") String accept, RequestOptions requestOptions,
            Context context);

        @Delete("/skip-special-headers/resources/{name}")
        @ExpectedResponses({ 204 })
        @UnexpectedResponseExceptionType(value = ClientAuthenticationException.class, code = { 401 })
        @UnexpectedResponseExceptionType(value = ResourceNotFoundException.class, code = { 404 })
        @UnexpectedResponseExceptionType(value = ResourceModifiedException.class, code = { 409 })
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Response<Void> deleteWithSpecialHeadersSync(@HostParam("endpoint") String endpoint,
            @QueryParam("api-version") String apiVersion, @PathParam("name") String name,
            @HeaderParam("foo") String foo, @HeaderParam("accept") String accept, RequestOptions requestOptions,
            Context context);
    }

    /**
     * skip special headers.
     * 
     * @param name A sequence of textual characters.
     * 
     * The name parameter.
     * @param foo A sequence of textual characters.
     * 
     * The foo parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> deleteWithSpecialHeadersWithResponseAsync(String name, String foo,
        RequestOptions requestOptions) {
        final String accept = "application/json";
        return FluxUtil.withContext(context -> service.deleteWithSpecialHeaders(this.client.getEndpoint(),
            this.client.getServiceVersion().getVersion(), name, foo, accept, requestOptions, context));
    }

    /**
     * skip special headers.
     * 
     * @param name A sequence of textual characters.
     * 
     * The name parameter.
     * @param foo A sequence of textual characters.
     * 
     * The foo parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> deleteWithSpecialHeadersWithResponse(String name, String foo, RequestOptions requestOptions) {
        final String accept = "application/json";
        return service.deleteWithSpecialHeadersSync(this.client.getEndpoint(),
            this.client.getServiceVersion().getVersion(), name, foo, accept, requestOptions, Context.NONE);
    }
}
