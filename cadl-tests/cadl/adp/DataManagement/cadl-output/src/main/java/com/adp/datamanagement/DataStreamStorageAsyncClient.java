// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
package com.adp.datamanagement;

import com.adp.datamanagement.implementation.DataStreamStorageClientImpl;
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

/** Initializes a new instance of the asynchronous DataStreamStorageClient type. */
@ServiceClient(builder = DataStreamStorageClientBuilder.class, isAsync = true)
public final class DataStreamStorageAsyncClient {

    @Generated private final DataStreamStorageClientImpl serviceClient;

    /**
     * Initializes an instance of DataStreamStorageAsyncClient class.
     *
     * @param serviceClient the service client implementation.
     */
    @Generated
    DataStreamStorageAsyncClient(DataStreamStorageClientImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Create or replace storage information of the data-stream. Returns the data-stream storage resource with SAS
     * signed URIs that allow uploading to Azure Storage. The SAS token expires in 24 hours.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     type: String (Required)
     *     rollingInformation (Optional): {
     *         strategy: String(Time/Size) (Required)
     *         unit: String(Seconds/Minutes/kB/MB/GB) (Required)
     *         value: int (Required)
     *     }
     * }
     * }</pre>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     type: String (Required)
     *     rollingInformation (Optional): {
     *         strategy: String(Time/Size) (Required)
     *         unit: String(Seconds/Minutes/kB/MB/GB) (Required)
     *         value: int (Required)
     *     }
     *     manifestUri: String (Required)
     *     dataFolderUri: String (Optional)
     *     shards (Required): [
     *          (Required){
     *             shardFolderUri: String (Required)
     *             manifestFileUri: String (Required)
     *         }
     *     ]
     *     etag: String (Required)
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
     * @return common data-stream storage model along with {@link Response} on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> createWithResponse(
            String measurementId, String dataStreamId, RequestOptions requestOptions) {
        return this.serviceClient.createWithResponseAsync(measurementId, dataStreamId, requestOptions);
    }

    /**
     * Returns the data-stream storage resource with SAS signed URIs that allow uploading to Azure Storage. The SAS
     * token expires in 24 hours.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     type: String (Required)
     *     rollingInformation (Optional): {
     *         strategy: String(Time/Size) (Required)
     *         unit: String(Seconds/Minutes/kB/MB/GB) (Required)
     *         value: int (Required)
     *     }
     *     manifestUri: String (Required)
     *     dataFolderUri: String (Optional)
     *     shards (Required): [
     *          (Required){
     *             shardFolderUri: String (Required)
     *             manifestFileUri: String (Required)
     *         }
     *     ]
     *     etag: String (Required)
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
     * @return common data-stream storage model along with {@link Response} on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> getWritableUrisWithResponse(
            String measurementId, String dataStreamId, RequestOptions requestOptions) {
        return this.serviceClient.getWritableUrisWithResponseAsync(measurementId, dataStreamId, requestOptions);
    }
}
