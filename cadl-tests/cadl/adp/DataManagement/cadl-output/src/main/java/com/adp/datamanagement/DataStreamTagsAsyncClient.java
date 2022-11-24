// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
package com.adp.datamanagement;

import com.adp.datamanagement.implementation.DataStreamTagsClientImpl;
import com.azure.core.annotation.Generated;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.exception.ClientAuthenticationException;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.exception.ResourceModifiedException;
import com.azure.core.exception.ResourceNotFoundException;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import reactor.core.publisher.Mono;

/** Initializes a new instance of the asynchronous DataStreamTagsClient type. */
@ServiceClient(builder = DataStreamTagsClientBuilder.class, isAsync = true)
public final class DataStreamTagsAsyncClient {

    @Generated private final DataStreamTagsClientImpl serviceClient;

    /**
     * Initializes an instance of DataStreamTagsAsyncClient class.
     *
     * @param serviceClient the service client implementation.
     */
    @Generated
    DataStreamTagsAsyncClient(DataStreamTagsClientImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Returns set of the data-stream tags.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     id: String (Required)
     *     tags (Required): [
     *          (Required){
     *             key: String (Required)
     *             value: String (Required)
     *         }
     *     ]
     * }
     * }</pre>
     *
     * @param measurementId The measurement identifier.
     * @param dataStreamId The data stream identifier.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return a data-stream tags along with {@link Response} on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> getWithResponse(
            String measurementId, String dataStreamId, RequestOptions requestOptions) {
        return this.serviceClient.getWithResponseAsync(measurementId, dataStreamId, requestOptions);
    }

    /**
     * Create or replace all tags at once.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     tags (Required): [
     *          (Required){
     *             key: String (Required)
     *             value: String (Required)
     *         }
     *     ]
     * }
     * }</pre>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     tags (Required): [
     *          (Required){
     *             key: String (Required)
     *             value: String (Required)
     *         }
     *     ]
     * }
     * }</pre>
     *
     * @param measurementId The measurement identifier.
     * @param dataStreamId The data stream identifier.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return tag set along with {@link Response} on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> createWithResponse(
            String measurementId, String dataStreamId, RequestOptions requestOptions) {
        return this.serviceClient.createWithResponseAsync(measurementId, dataStreamId, requestOptions);
    }
}
