// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
package com.adp.datamanagement;

import com.adp.datamanagement.models.LongRunningOperation;
import com.adp.datamanagement.models.StateMachine;
import com.adp.datamanagement.models.StateMachineAction;
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

/** Initializes a new instance of the synchronous MeasurementStateMachineClient type. */
@ServiceClient(builder = MeasurementStateMachineClientBuilder.class)
public final class MeasurementStateMachineClient {

    @Generated private final MeasurementStateMachineAsyncClient client;

    /**
     * Initializes an instance of MeasurementStateMachineClient class.
     *
     * @param client the async client.
     */
    @Generated
    MeasurementStateMachineClient(MeasurementStateMachineAsyncClient client) {
        this.client = client;
    }

    /**
     * Returns the state machine instance for the measurement.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     id: String (Required)
     *     type: String (Required)
     *     availableActionNames (Required): [
     *         String (Required)
     *     ]
     * }
     * }</pre>
     *
     * @param measurementId The measurement identifier.
     * @param id The state machine identifier.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return state machine along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> getWithResponse(String measurementId, String id, RequestOptions requestOptions) {
        return this.client.getWithResponse(measurementId, id, requestOptions).block();
    }

    /**
     * List state machines instance for the measurement.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     id: String (Required)
     *     type: String (Required)
     *     availableActionNames (Required): [
     *         String (Required)
     *     ]
     * }
     * }</pre>
     *
     * @param measurementId The measurement identifier.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return paged collection of StateMachine items as paginated response with {@link PagedIterable}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<BinaryData> list(String measurementId, RequestOptions requestOptions) {
        return new PagedIterable<>(this.client.list(measurementId, requestOptions));
    }

    /**
     * Initiates process of applying an action on the measurement.
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
     *     actionName: String (Required)
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
     * @param id The state machine identifier.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link SyncPoller} for polling of state machine.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    public SyncPoller<BinaryData, BinaryData> beginAct(String measurementId, String id, RequestOptions requestOptions) {
        return this.client.beginAct(measurementId, id, requestOptions).getSyncPoller();
    }

    /**
     * Returns the state machine instance for the measurement.
     *
     * @param measurementId The measurement identifier.
     * @param id The state machine identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.exception.HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return state machine.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public StateMachine get(String measurementId, String id) {
        // Generated convenience method for getWithResponse
        RequestOptions requestOptions = new RequestOptions();
        return getWithResponse(measurementId, id, requestOptions).getValue().toObject(StateMachine.class);
    }

    /**
     * List state machines instance for the measurement.
     *
     * @param measurementId The measurement identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.exception.HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return paged collection of StateMachine items as paginated response with {@link PagedIterable}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<StateMachine> list(String measurementId) {
        // Generated convenience method for list
        return new PagedIterable<>(client.list(measurementId));
    }

    /**
     * Initiates process of applying an action on the measurement.
     *
     * @param measurementId The measurement identifier.
     * @param id The state machine identifier.
     * @param operationId The long running operation identifier. Operation-Id should be valid UUID string.
     * @param body Parameter of type 'StateMachineAction' in the body.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.exception.HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of state machine.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    public SyncPoller<LongRunningOperation, Object> beginAct(
            String measurementId, String id, String operationId, StateMachineAction body) {
        // Generated convenience method for beginActWithModel
        return client.beginAct(measurementId, id, operationId, body).getSyncPoller();
    }

    /**
     * Initiates process of applying an action on the measurement.
     *
     * @param measurementId The measurement identifier.
     * @param id The state machine identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.exception.HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of state machine.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    public SyncPoller<LongRunningOperation, Object> beginAct(String measurementId, String id) {
        // Generated convenience method for beginActWithModel
        return client.beginAct(measurementId, id).getSyncPoller();
    }
}
