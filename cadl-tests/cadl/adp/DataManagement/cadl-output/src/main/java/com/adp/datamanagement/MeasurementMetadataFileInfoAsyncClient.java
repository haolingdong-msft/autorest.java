// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
package com.adp.datamanagement;

import com.adp.datamanagement.implementation.MeasurementMetadataFileInfoClientImpl;
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
import com.azure.core.util.polling.PollerFlux;
import reactor.core.publisher.Mono;

/** Initializes a new instance of the asynchronous MeasurementMetadataFileInfoClient type. */
@ServiceClient(builder = MeasurementMetadataFileInfoClientBuilder.class, isAsync = true)
public final class MeasurementMetadataFileInfoAsyncClient {

    @Generated private final MeasurementMetadataFileInfoClientImpl serviceClient;

    /**
     * Initializes an instance of MeasurementMetadataFileInfoAsyncClient class.
     *
     * @param serviceClient the service client implementation.
     */
    @Generated
    MeasurementMetadataFileInfoAsyncClient(MeasurementMetadataFileInfoClientImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Initiates a process that replaces the measurement's metadata file.
     *
     * <p><strong>Header Parameters</strong>
     *
     * <table border="1">
     *     <caption>Header Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>operation-id</td><td>String</td><td>No</td><td>The long running operation identifier. Operation-Id should be valid UUID string.</td></tr>
     * </table>
     *
     * You can add these to a request with {@link RequestOptions#addHeader}
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     pendingFileETag: String (Required)
     * }
     * }</pre>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * Object
     * }</pre>
     *
     * @param measurementId The measurement identifier.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link PollerFlux} for polling of measurement metadata file information model.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    public PollerFlux<BinaryData, BinaryData> beginComplete(String measurementId, RequestOptions requestOptions) {
        return this.serviceClient.beginCompleteAsync(measurementId, requestOptions);
    }

    /**
     * Returns SAS signed URI that allows uploading temporary measurement metadata file to Azure Storage. This URI
     * expires in 24 hours.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     metadataFileName: String (Required)
     *     metadataFileUri: String (Required)
     *     etagHeader: String (Optional)
     * }
     * }</pre>
     *
     * @param measurementId The measurement identifier.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return measurement metadata file information model along with {@link Response} on successful completion of
     *     {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> getWritableUriWithResponse(String measurementId, RequestOptions requestOptions) {
        return this.serviceClient.getWritableUriWithResponseAsync(measurementId, requestOptions);
    }
}
