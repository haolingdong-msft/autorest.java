// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
package com.adp.datamanagement;

import com.adp.datamanagement.implementation.DiscoveryOperationsClientImpl;
import com.adp.datamanagement.models.Discovery;
import com.adp.datamanagement.models.DiscoveryCreationParameters;
import com.adp.datamanagement.models.LongRunningOperation;
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
import com.azure.core.util.FluxUtil;
import com.azure.core.util.polling.PollerFlux;
import reactor.core.publisher.Mono;

/** Initializes a new instance of the asynchronous DiscoveryOperationsClient type. */
@ServiceClient(builder = DiscoveryOperationsClientBuilder.class, isAsync = true)
public final class DiscoveryOperationsAsyncClient {

    @Generated private final DiscoveryOperationsClientImpl serviceClient;

    /**
     * Initializes an instance of DiscoveryOperationsAsyncClient class.
     *
     * @param serviceClient the service client implementation.
     */
    @Generated
    DiscoveryOperationsAsyncClient(DiscoveryOperationsClientImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Creates a new ingestion discovery instance.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     externalPackageId: String (Optional)
     * }
     * }</pre>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     discoveryId: String (Required)
     *     externalPackageId: String (Optional)
     *     manifestUri: String (Optional)
     *     status: String(Created/GeneratingSpecialFilesUploadInfo/GeneratedSpecialFilesUploadInfo/Completing/Completed/Aborting/Aborted/Failed) (Optional)
     *     etag: String (Required)
     * }
     * }</pre>
     *
     * @param discoveryId The discovery identifier.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return a discovery resource along with {@link Response} on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> createOrReplaceWithResponse(String discoveryId, RequestOptions requestOptions) {
        return this.serviceClient.createOrReplaceWithResponseAsync(discoveryId, requestOptions);
    }

    /**
     * Get discovery by ID.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     discoveryId: String (Required)
     *     externalPackageId: String (Optional)
     *     manifestUri: String (Optional)
     *     status: String(Created/GeneratingSpecialFilesUploadInfo/GeneratedSpecialFilesUploadInfo/Completing/Completed/Aborting/Aborted/Failed) (Optional)
     *     etag: String (Required)
     * }
     * }</pre>
     *
     * @param discoveryId The discovery identifier.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return discovery by ID along with {@link Response} on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> getWithResponse(String discoveryId, RequestOptions requestOptions) {
        return this.serviceClient.getWithResponseAsync(discoveryId, requestOptions);
    }

    /**
     * Initiates the process of completing the discovery and creating the upload file grouping manifest files.
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
     * @param discoveryId The discovery identifier.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link PollerFlux} for polling of a discovery resource.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    public PollerFlux<BinaryData, BinaryData> beginComplete(String discoveryId, RequestOptions requestOptions) {
        return this.serviceClient.beginCompleteAsync(discoveryId, requestOptions);
    }

    /**
     * Initiates the process of cancelling the discovery.
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
     * @param discoveryId The discovery identifier.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link PollerFlux} for polling of a discovery resource.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    public PollerFlux<BinaryData, BinaryData> beginCancel(String discoveryId, RequestOptions requestOptions) {
        return this.serviceClient.beginCancelAsync(discoveryId, requestOptions);
    }

    /**
     * Creates a new ingestion discovery instance.
     *
     * @param discoveryId The discovery identifier.
     * @param body Parameter of type 'DiscoveryCreationParameters' in the body.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.exception.HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a discovery resource on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Discovery> createOrReplace(String discoveryId, DiscoveryCreationParameters body) {
        // Generated convenience method for createOrReplaceWithResponse
        RequestOptions requestOptions = new RequestOptions();
        if (body != null) {
            requestOptions.setBody(BinaryData.fromObject(body));
        }
        return createOrReplaceWithResponse(discoveryId, requestOptions)
                .flatMap(FluxUtil::toMono)
                .map(protocolMethodData -> protocolMethodData.toObject(Discovery.class));
    }

    /**
     * Creates a new ingestion discovery instance.
     *
     * @param discoveryId The discovery identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.exception.HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a discovery resource on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Discovery> createOrReplace(String discoveryId) {
        // Generated convenience method for createOrReplaceWithResponse
        RequestOptions requestOptions = new RequestOptions();
        return createOrReplaceWithResponse(discoveryId, requestOptions)
                .flatMap(FluxUtil::toMono)
                .map(protocolMethodData -> protocolMethodData.toObject(Discovery.class));
    }

    /**
     * Get discovery by ID.
     *
     * @param discoveryId The discovery identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.exception.HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return discovery by ID on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Discovery> get(String discoveryId) {
        // Generated convenience method for getWithResponse
        RequestOptions requestOptions = new RequestOptions();
        return getWithResponse(discoveryId, requestOptions)
                .flatMap(FluxUtil::toMono)
                .map(protocolMethodData -> protocolMethodData.toObject(Discovery.class));
    }

    /**
     * Initiates the process of completing the discovery and creating the upload file grouping manifest files.
     *
     * @param discoveryId The discovery identifier.
     * @param operationId The long running operation identifier. Operation-Id should be valid UUID string.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.exception.HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link PollerFlux} for polling of a discovery resource.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    public PollerFlux<LongRunningOperation, Object> beginComplete(String discoveryId, String operationId) {
        // Generated convenience method for beginCompleteWithModel
        RequestOptions requestOptions = new RequestOptions();
        if (operationId != null) {
            requestOptions.setHeader("operation-id", operationId);
        }
        return serviceClient.beginCompleteWithModelAsync(discoveryId, requestOptions);
    }

    /**
     * Initiates the process of completing the discovery and creating the upload file grouping manifest files.
     *
     * @param discoveryId The discovery identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.exception.HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link PollerFlux} for polling of a discovery resource.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    public PollerFlux<LongRunningOperation, Object> beginComplete(String discoveryId) {
        // Generated convenience method for beginCompleteWithModel
        RequestOptions requestOptions = new RequestOptions();
        return serviceClient.beginCompleteWithModelAsync(discoveryId, requestOptions);
    }

    /**
     * Initiates the process of cancelling the discovery.
     *
     * @param discoveryId The discovery identifier.
     * @param operationId The long running operation identifier. Operation-Id should be valid UUID string.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.exception.HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link PollerFlux} for polling of a discovery resource.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    public PollerFlux<LongRunningOperation, Object> beginCancel(String discoveryId, String operationId) {
        // Generated convenience method for beginCancelWithModel
        RequestOptions requestOptions = new RequestOptions();
        if (operationId != null) {
            requestOptions.setHeader("operation-id", operationId);
        }
        return serviceClient.beginCancelWithModelAsync(discoveryId, requestOptions);
    }

    /**
     * Initiates the process of cancelling the discovery.
     *
     * @param discoveryId The discovery identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.exception.HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link PollerFlux} for polling of a discovery resource.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    public PollerFlux<LongRunningOperation, Object> beginCancel(String discoveryId) {
        // Generated convenience method for beginCancelWithModel
        RequestOptions requestOptions = new RequestOptions();
        return serviceClient.beginCancelWithModelAsync(discoveryId, requestOptions);
    }
}
