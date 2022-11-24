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
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import com.azure.core.util.polling.SyncPoller;

/** Initializes a new instance of the synchronous UploadClient type. */
@ServiceClient(builder = UploadClientBuilder.class)
public final class UploadClient {

    @Generated private final UploadAsyncClient client;

    /**
     * Initializes an instance of UploadClient class.
     *
     * @param client the async client.
     */
    @Generated
    UploadClient(UploadAsyncClient client) {
        this.client = client;
    }

    /**
     * Creates a new ingestion upload instance.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     externalPackageId: String (Optional)
     *     discoveryId: String (Optional)
     * }
     * }</pre>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     uploadId: String (Required)
     *     externalPackageId: String (Optional)
     *     discoveryId: String (Optional)
     *     manifestUri: String (Optional)
     *     status: String(Created/GeneratingSpecialFilesUploadInfo/GeneratedSpecialFilesUploadInfo/GeneratingDataFilesUploadInfo/GeneratedDataFilesUploadInfo/Completing/Completed/Aborting/Aborted/Failed) (Optional)
     *     resourceEndpoint: String (Optional)
     *     etag: String (Required)
     * }
     * }</pre>
     *
     * @param uploadId The upload resource identifier.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return an upload resource along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> createOrReplaceWithResponse(String uploadId, RequestOptions requestOptions) {
        return this.client.createOrReplaceWithResponse(uploadId, requestOptions).block();
    }

    /**
     * Get discovery by ID.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     uploadId: String (Required)
     *     externalPackageId: String (Optional)
     *     discoveryId: String (Optional)
     *     manifestUri: String (Optional)
     *     status: String(Created/GeneratingSpecialFilesUploadInfo/GeneratedSpecialFilesUploadInfo/GeneratingDataFilesUploadInfo/GeneratedDataFilesUploadInfo/Completing/Completed/Aborting/Aborted/Failed) (Optional)
     *     resourceEndpoint: String (Optional)
     *     etag: String (Required)
     * }
     * }</pre>
     *
     * @param uploadId The upload resource identifier.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return discovery by ID along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> getWithResponse(String uploadId, RequestOptions requestOptions) {
        return this.client.getWithResponse(uploadId, requestOptions).block();
    }

    /**
     * Initiates the process of completing the upload and creating the measurements.
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
     * Object
     * }</pre>
     *
     * @param uploadId The upload resource identifier.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link SyncPoller} for polling of an upload resource.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    public SyncPoller<BinaryData, BinaryData> beginComplete(String uploadId, RequestOptions requestOptions) {
        return this.client.beginComplete(uploadId, requestOptions).getSyncPoller();
    }

    /**
     * Initiates the process of cancelling the upload.
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
     * Object
     * }</pre>
     *
     * @param uploadId The upload resource identifier.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link SyncPoller} for polling of an upload resource.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    public SyncPoller<BinaryData, BinaryData> beginCancel(String uploadId, RequestOptions requestOptions) {
        return this.client.beginCancel(uploadId, requestOptions).getSyncPoller();
    }
}
