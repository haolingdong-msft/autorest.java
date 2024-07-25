// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.formrecognizer.documentanalysis.dpg;

import com.azure.ai.formrecognizer.documentanalysis.dpg.implementation.MiscellaneousImpl;
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
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import reactor.core.publisher.Mono;

/**
 * Initializes a new instance of the asynchronous FormRecognizerClient type.
 */
@ServiceClient(builder = MiscellaneousClientBuilder.class, isAsync = true)
public final class MiscellaneousAsyncClient {
    @Generated
    private final MiscellaneousImpl serviceClient;

    /**
     * Initializes an instance of MiscellaneousAsyncClient class.
     * 
     * @param serviceClient the service client implementation.
     */
    @Generated
    MiscellaneousAsyncClient(MiscellaneousImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Lists all operations.
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     operationId: String (Required)
     *     status: String(notStarted/running/failed/succeeded/canceled) (Required)
     *     percentCompleted: Integer (Optional)
     *     createdDateTime: OffsetDateTime (Required)
     *     lastUpdatedDateTime: OffsetDateTime (Required)
     *     kind: String(documentModelBuild/documentModelCompose/documentModelCopyTo) (Required)
     *     resourceLocation: String (Required)
     *     apiVersion: String (Optional)
     *     tags (Optional): {
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
     * @return oK as paginated response with {@link PagedFlux}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<BinaryData> listOperations(RequestOptions requestOptions) {
        return this.serviceClient.listOperationsAsync(requestOptions);
    }

    /**
     * Gets operation info.
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     kind: String (Required)
     *     operationId: String (Required)
     *     status: String(notStarted/running/failed/succeeded/canceled) (Required)
     *     percentCompleted: Integer (Optional)
     *     createdDateTime: OffsetDateTime (Required)
     *     lastUpdatedDateTime: OffsetDateTime (Required)
     *     resourceLocation: String (Required)
     *     apiVersion: String (Optional)
     *     tags (Optional): {
     *         String: String (Required)
     *     }
     *     error (Optional): {
     *         code: String (Required)
     *         message: String (Required)
     *         target: String (Optional)
     *         details (Optional): [
     *             (recursive schema, see above)
     *         ]
     *         innererror (Optional): {
     *             code: String (Required)
     *             message: String (Optional)
     *             innererror (Optional): (recursive schema, see innererror above)
     *         }
     *     }
     * }
     * }</pre>
     * 
     * @param operationId Unique operation ID.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return operation info along with {@link Response} on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> getOperationWithResponse(String operationId, RequestOptions requestOptions) {
        return this.serviceClient.getOperationWithResponseAsync(operationId, requestOptions);
    }

    /**
     * Return information about the current resource.
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     customDocumentModels (Required): {
     *         count: int (Required)
     *         limit: int (Required)
     *     }
     * }
     * }</pre>
     * 
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return oK along with {@link Response} on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> getResourceInfoWithResponse(RequestOptions requestOptions) {
        return this.serviceClient.getResourceInfoWithResponseAsync(requestOptions);
    }
}
