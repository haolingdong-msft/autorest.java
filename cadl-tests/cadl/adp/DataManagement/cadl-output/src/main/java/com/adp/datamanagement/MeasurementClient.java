// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
package com.adp.datamanagement;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.exception.ClientAuthenticationException;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.exception.ResourceModifiedException;
import com.azure.core.exception.ResourceNotFoundException;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import com.azure.core.util.polling.SyncPoller;

/** Initializes a new instance of the synchronous MeasurementClient type. */
@ServiceClient(builder = MeasurementClientBuilder.class)
public final class MeasurementClient {

    @Generated private final MeasurementAsyncClient client;

    /**
     * Initializes an instance of MeasurementClient class.
     *
     * @param client the async client.
     */
    @Generated
    MeasurementClient(MeasurementAsyncClient client) {
        this.client = client;
    }

    /**
     * Get measurement by ID.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     measurementId: String (Required)
     *     location: String (Required)
     *     ingestTimestampUtc: OffsetDateTime (Optional)
     *     resourceEndpoint: String (Optional)
     *     externalPackageId: String (Optional)
     *     uploadId: String (Optional)
     *     discoveryId: String (Optional)
     *     recordTimestampUtc: OffsetDateTime (Optional)
     *     etag: String (Required)
     * }
     * }</pre>
     *
     * @param measurementId The measurement identifier.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return measurement by ID along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> getWithResponse(String measurementId, RequestOptions requestOptions) {
        return this.client.getWithResponse(measurementId, requestOptions).block();
    }

    /**
     * Deletes the measurement.
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
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     operationId: String (Required)
     *     status: String(Created/InProgress/Succeeded/Failed/Canceled) (Required)
     *     operationType: String(default) (Optional)
     *     error: ResponseError (Optional)
     *     resultUri: String (Optional)
     *     etag: String (Required)
     * }
     * }</pre>
     *
     * @param measurementId The measurement identifier.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    public SyncPoller<BinaryData, Void> beginDelete(String measurementId, RequestOptions requestOptions) {
        return this.client.beginDelete(measurementId, requestOptions).getSyncPoller();
    }

    /**
     * Lists the measurements in a workspace.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     measurementId: String (Required)
     *     location: String (Required)
     *     ingestTimestampUtc: OffsetDateTime (Optional)
     *     resourceEndpoint: String (Optional)
     *     externalPackageId: String (Optional)
     *     uploadId: String (Optional)
     *     discoveryId: String (Optional)
     *     recordTimestampUtc: OffsetDateTime (Optional)
     *     etag: String (Required)
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return paged collection of Measurement items as paginated response with {@link PagedIterable}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<BinaryData> list(RequestOptions requestOptions) {
        return new PagedIterable<>(this.client.list(requestOptions));
    }

    /**
     * Lists the measurements in a workspace with extended metadata.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     measurementId: String (Required)
     *     location: String (Required)
     *     ingestTimestampUtc: OffsetDateTime (Optional)
     *     resourceEndpoint: String (Optional)
     *     externalPackageId: String (Optional)
     *     uploadId: String (Optional)
     *     discoveryId: String (Optional)
     *     recordTimestampUtc: OffsetDateTime (Optional)
     *     etag: String (Required)
     *     metadata (Required): {
     *         String: String (Required)
     *     }
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return paged collection of MeasurementWithMetadata items as paginated response with {@link PagedIterable}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<BinaryData> queryMeasurementsWithMetadata(RequestOptions requestOptions) {
        return new PagedIterable<>(this.client.queryMeasurementsWithMetadata(requestOptions));
    }

    /**
     * Lists the measurements in a workspace that are in the given measurement IDs list.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     measurementIds (Required): [
     *         String (Required)
     *     ]
     * }
     * }</pre>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     measurementId: String (Required)
     *     location: String (Required)
     *     ingestTimestampUtc: OffsetDateTime (Optional)
     *     resourceEndpoint: String (Optional)
     *     externalPackageId: String (Optional)
     *     uploadId: String (Optional)
     *     discoveryId: String (Optional)
     *     recordTimestampUtc: OffsetDateTime (Optional)
     *     etag: String (Required)
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return paged collection of Measurement items as paginated response with {@link PagedIterable}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<BinaryData> findByIds(RequestOptions requestOptions) {
        return new PagedIterable<>(this.client.findByIds(requestOptions));
    }
}
