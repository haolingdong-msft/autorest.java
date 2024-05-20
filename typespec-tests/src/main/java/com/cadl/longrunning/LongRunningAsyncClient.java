// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.cadl.longrunning;

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
import com.azure.core.util.polling.PollOperationDetails;
import com.cadl.longrunning.implementation.LongRunningClientImpl;
import com.cadl.longrunning.models.JobData;
import com.cadl.longrunning.models.JobResult;
import com.cadl.longrunning.models.JobResultResult;
import com.cadl.longrunning.models.PollResponse;
import reactor.core.publisher.Mono;

/**
 * Initializes a new instance of the asynchronous LongRunningClient type.
 */
@ServiceClient(builder = LongRunningClientBuilder.class, isAsync = true)
public final class LongRunningAsyncClient {
    @Generated
    private final LongRunningClientImpl serviceClient;

    /**
     * Initializes an instance of LongRunningAsyncClient class.
     * 
     * @param serviceClient the service client implementation.
     */
    @Generated
    LongRunningAsyncClient(LongRunningClientImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * The longRunning operation.
     * 
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link PollerFlux} for polling of long-running operation.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    public PollerFlux<BinaryData, BinaryData> beginLongRunning(RequestOptions requestOptions) {
        return this.serviceClient.beginLongRunningAsync(requestOptions);
    }

    /**
     * A remote procedure call (RPC) operation.
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     id: String (Required)
     *     status: String(notStarted/running/Succeeded/Failed/canceled) (Required)
     *     createdDateTime: OffsetDateTime (Optional)
     *     expirationDateTime: OffsetDateTime (Optional)
     *     lastUpdateDateTime: OffsetDateTime (Optional)
     *     error (Optional): {
     *         code: String (Required)
     *         message: String (Required)
     *         target: String (Optional)
     *         details (Optional): [
     *             (recursive schema, see above)
     *         ]
     *         innererror (Optional): {
     *             code: String (Optional)
     *             innererror (Optional): (recursive schema, see innererror above)
     *         }
     *     }
     *     result (Optional): {
     *         data: String (Required)
     *     }
     * }
     * }</pre>
     * 
     * @param id Universally Unique Identifier
     * 
     * The id parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> getJobWithResponse(String id, RequestOptions requestOptions) {
        return this.serviceClient.getJobWithResponseAsync(id, requestOptions);
    }

    /**
     * A remote procedure call (RPC) operation.
     * <p><strong>Header Parameters</strong></p>
     * <table border="1">
     * <caption>Header Parameters</caption>
     * <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     * <tr><td>repeatability-request-id</td><td>String</td><td>No</td><td>Repeatability request ID header</td></tr>
     * <tr><td>repeatability-first-sent</td><td>String</td><td>No</td><td>Repeatability first sent header as
     * HTTP-date</td></tr>
     * </table>
     * You can add these to a request with {@link RequestOptions#addHeader}
     * <p><strong>Request Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     configuration: String (Optional)
     *     nullableFloatDict (Required): {
     *         String: Double (Optional)
     *     }
     * }
     * }</pre>
     * 
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     id: String (Required)
     *     status: String (Required)
     *     error (Optional): {
     *         code: String (Required)
     *         message: String (Required)
     *         target: String (Optional)
     *         details (Optional): [
     *             (recursive schema, see above)
     *         ]
     *         innererror (Optional): {
     *             code: String (Optional)
     *             innererror (Optional): (recursive schema, see innererror above)
     *         }
     *     }
     * }
     * }</pre>
     * 
     * @param jobData The jobData parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link PollerFlux} for polling of status details for long running operations.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    public PollerFlux<BinaryData, BinaryData> beginCreateJob(BinaryData jobData, RequestOptions requestOptions) {
        return this.serviceClient.beginCreateJobAsync(jobData, requestOptions);
    }

    /**
     * The longRunning operation.
     * 
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link PollerFlux} for polling of long-running operation.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    public PollerFlux<PollResponse, Void> beginLongRunning() {
        // Generated convenience method for beginLongRunningWithModel
        RequestOptions requestOptions = new RequestOptions();
        return serviceClient.beginLongRunningWithModelAsync(requestOptions);
    }

    /**
     * A remote procedure call (RPC) operation.
     * 
     * @param id Universally Unique Identifier
     * 
     * The id parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<JobResult> getJob(String id) {
        // Generated convenience method for getJobWithResponse
        RequestOptions requestOptions = new RequestOptions();
        return getJobWithResponse(id, requestOptions).flatMap(FluxUtil::toMono)
            .map(protocolMethodData -> protocolMethodData.toObject(JobResult.class));
    }

    /**
     * A remote procedure call (RPC) operation.
     * 
     * @param jobData The jobData parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link PollerFlux} for polling of status details for long running operations.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    public PollerFlux<PollOperationDetails, JobResultResult> beginCreateJob(JobData jobData) {
        // Generated convenience method for beginCreateJobWithModel
        RequestOptions requestOptions = new RequestOptions();
        return serviceClient.beginCreateJobWithModelAsync(BinaryData.fromObject(jobData), requestOptions);
    }
}
