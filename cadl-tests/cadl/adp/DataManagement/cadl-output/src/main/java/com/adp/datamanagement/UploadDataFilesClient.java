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
import com.azure.core.util.BinaryData;
import com.azure.core.util.polling.SyncPoller;

/** Initializes a new instance of the synchronous UploadDataFilesClient type. */
@ServiceClient(builder = UploadDataFilesClientBuilder.class)
public final class UploadDataFilesClient {
    @Generated private final UploadDataFilesAsyncClient client;

    /**
     * Initializes an instance of UploadDataFilesClient class.
     *
     * @param client the async client.
     */
    @Generated
    UploadDataFilesClient(UploadDataFilesAsyncClient client) {
        this.client = client;
    }

    /**
     * Initiates the process of allocating the data files.
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
     * @return the {@link SyncPoller} for polling of data file resource.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    public SyncPoller<BinaryData, BinaryData> beginGenerate(String uploadId, RequestOptions requestOptions) {
        return this.client.beginGenerate(uploadId, requestOptions).getSyncPoller();
    }

    /**
     * List special files details for the upload resource. Returns SAS signed URI that allows uploading data files to
     * Azure Storage. This URI expires in 24 hours.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     clientFileName: String (Required)
     *     fileUri: String (Required)
     * }
     * }</pre>
     *
     * @param uploadId The upload resource identifier.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return paged collection of UploadDataFile items as paginated response with {@link PagedIterable}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<BinaryData> listWritableUris(String uploadId, RequestOptions requestOptions) {
        return new PagedIterable<>(this.client.listWritableUris(uploadId, requestOptions));
    }
}
