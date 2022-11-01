// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.adp;

import com.azure.adp.models.UploadSpecialFile;
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

/** Initializes a new instance of the synchronous AutonomousDevelopmentPlatformClient type. */
@ServiceClient(builder = UploadSpecialFilesClientBuilder.class)
public final class UploadSpecialFilesClient {
    @Generated private final UploadSpecialFilesAsyncClient client;

    /**
     * Initializes an instance of UploadSpecialFilesClient class.
     *
     * @param client the async client.
     */
    @Generated
    UploadSpecialFilesClient(UploadSpecialFilesAsyncClient client) {
        this.client = client;
    }

    /**
     * List special files for the upload.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     clientFileName: String (Required)
     *     fileUploadUri: String (Required)
     * }
     * }</pre>
     *
     * @param uploadId The upload resource identifier.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return paged collection of UploadSpecialFile items as paginated response with {@link PagedIterable}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<BinaryData> list(String uploadId, RequestOptions requestOptions) {
        return new PagedIterable<>(this.client.list(uploadId, requestOptions));
    }

    /**
     * Initiates the process of generating SAS signed URIs for uploading special files for the upload.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     operationId: String (Required)
     *     status: String(Created/InProgress/Succeeded/Failed/Canceled) (Required)
     *     operationType: String(FinalizeFileList/ShardFiles/CompleteUpload/AbortUpload) (Optional)
     *     error: ResponseError (Optional)
     * }
     * }</pre>
     *
     * @param uploadId The upload resource identifier.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link SyncPoller} for polling of the long running operation response.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    public SyncPoller<BinaryData, BinaryData> beginGenerate(String uploadId, RequestOptions requestOptions) {
        return this.client.beginGenerate(uploadId, requestOptions).getSyncPoller();
    }

    /**
     * List special files for the upload.
     *
     * @param uploadId The upload resource identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.exception.HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return paged collection of UploadSpecialFile items as paginated response with {@link PagedIterable}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<UploadSpecialFile> list(String uploadId) {
        // Generated convenience method for list
        return new PagedIterable<>(client.list(uploadId));
    }
}
