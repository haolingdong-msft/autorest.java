// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.type.model.usage;

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
import com.type.model.usage.implementation.UsageClientImpl;
import com.type.model.usage.models.InputOutputRecord;
import com.type.model.usage.models.InputRecord;
import com.type.model.usage.models.OutputRecord;
import reactor.core.publisher.Mono;

/**
 * Initializes a new instance of the asynchronous UsageClient type.
 */
@ServiceClient(builder = UsageClientBuilder.class, isAsync = true)
public final class UsageAsyncClient {
    @Generated
    private final UsageClientImpl serviceClient;

    /**
     * Initializes an instance of UsageAsyncClient class.
     * 
     * @param serviceClient the service client implementation.
     */
    @Generated
    UsageAsyncClient(UsageClientImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * The input operation.
     * <p><strong>Request Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     requiredProp: String (Required)
     * }
     * }</pre>
     * 
     * @param input Record used in operation parameters
     * 
     * The input parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> inputWithResponse(BinaryData input, RequestOptions requestOptions) {
        return this.serviceClient.inputWithResponseAsync(input, requestOptions);
    }

    /**
     * The output operation.
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     requiredProp: String (Required)
     * }
     * }</pre>
     * 
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return record used in operation return type along with {@link Response} on successful completion of
     * {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> outputWithResponse(RequestOptions requestOptions) {
        return this.serviceClient.outputWithResponseAsync(requestOptions);
    }

    /**
     * The inputAndOutput operation.
     * <p><strong>Request Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     requiredProp: String (Required)
     * }
     * }</pre>
     * 
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     requiredProp: String (Required)
     * }
     * }</pre>
     * 
     * @param body Record used both as operation parameter and return type
     * 
     * The body parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return record used both as operation parameter and return type along with {@link Response} on successful
     * completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> inputAndOutputWithResponse(BinaryData body, RequestOptions requestOptions) {
        return this.serviceClient.inputAndOutputWithResponseAsync(body, requestOptions);
    }

    /**
     * The input operation.
     * 
     * @param input Record used in operation parameters
     * 
     * The input parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> input(InputRecord input) {
        // Generated convenience method for inputWithResponse
        RequestOptions requestOptions = new RequestOptions();
        return inputWithResponse(BinaryData.fromObject(input), requestOptions).flatMap(FluxUtil::toMono);
    }

    /**
     * The output operation.
     * 
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return record used in operation return type on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<OutputRecord> output() {
        // Generated convenience method for outputWithResponse
        RequestOptions requestOptions = new RequestOptions();
        return outputWithResponse(requestOptions).flatMap(FluxUtil::toMono)
            .map(protocolMethodData -> protocolMethodData.toObject(OutputRecord.class));
    }

    /**
     * The inputAndOutput operation.
     * 
     * @param body Record used both as operation parameter and return type
     * 
     * The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return record used both as operation parameter and return type on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<InputOutputRecord> inputAndOutput(InputOutputRecord body) {
        // Generated convenience method for inputAndOutputWithResponse
        RequestOptions requestOptions = new RequestOptions();
        return inputAndOutputWithResponse(BinaryData.fromObject(body), requestOptions).flatMap(FluxUtil::toMono)
            .map(protocolMethodData -> protocolMethodData.toObject(InputOutputRecord.class));
    }
}
