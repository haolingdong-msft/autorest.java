// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.adp;

import com.azure.adp.implementation.DiscoverySpecialFilesImpl;
import com.azure.adp.models.DiscoverySpecialFile;
import com.azure.core.annotation.Generated;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.exception.ClientAuthenticationException;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.exception.ResourceModifiedException;
import com.azure.core.exception.ResourceNotFoundException;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.util.BinaryData;
import com.azure.core.util.polling.PollerFlux;

/** Initializes a new instance of the asynchronous AutonomousDevelopmentPlatformClient type. */
@ServiceClient(builder = DiscoverySpecialFilesClientBuilder.class, isAsync = true)
public final class DiscoverySpecialFilesAsyncClient {
    @Generated private final DiscoverySpecialFilesImpl serviceClient;

    /**
     * Initializes an instance of DiscoverySpecialFilesAsyncClient class.
     *
     * @param serviceClient the service client implementation.
     */
    @Generated
    DiscoverySpecialFilesAsyncClient(DiscoverySpecialFilesImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * List special files details for the discovery resource.
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
     * @param discoveryId The discovery identifier.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return paged collection of DiscoverySpecialFile items as paginated response with {@link PagedFlux}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<BinaryData> list(String discoveryId, RequestOptions requestOptions) {
        return this.serviceClient.listAsync(discoveryId, requestOptions);
    }

    /**
     * Initiates the process of generating SAS signed URIs for uploading special files for the discovery.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     operationId: String (Required)
     *     status: String(Created/InProgress/Succeeded/Failed/Canceled) (Required)
     *     operationType: String(CompleteDiscovery/FinalizeFileList/AbortDiscovery) (Optional)
     *     error: ResponseError (Optional)
     * }
     * }</pre>
     *
     * @param discoveryId The discovery identifier.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link PollerFlux} for polling of discovery long running operation response.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    public PollerFlux<BinaryData, BinaryData> beginGenerate(String discoveryId, RequestOptions requestOptions) {
        return this.serviceClient.beginGenerateAsync(discoveryId, requestOptions);
    }

    /**
     * List special files details for the discovery resource.
     *
     * @param discoveryId The discovery identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.exception.HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return paged collection of DiscoverySpecialFile items as paginated response with {@link PagedFlux}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<DiscoverySpecialFile> list(String discoveryId) {
        // Generated convenience method for list
        RequestOptions requestOptions = new RequestOptions();
        return list(discoveryId, requestOptions)
                .mapPage(protocolMethodData -> protocolMethodData.toObject(DiscoverySpecialFile.class));
    }
}
