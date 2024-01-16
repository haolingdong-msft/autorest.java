// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package fixtures.headexceptions;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.exception.ClientAuthenticationException;
import com.azure.core.exception.ResourceModifiedException;
import com.azure.core.exception.ResourceNotFoundException;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import fixtures.headexceptions.implementation.HeadExceptionsImpl;
import fixtures.headexceptions.models.CustomizedException;
import reactor.core.publisher.Mono;

/**
 * <!-- start generated doc -->
 * Initializes a new instance of the asynchronous AutoRestHeadExceptionTestServiceClient type.
 * <!-- end generated doc -->
 */
@ServiceClient(builder = AutoRestHeadExceptionTestServiceClientBuilder.class, isAsync = true)
public final class AutoRestHeadExceptionTestServiceAsyncClient {
    @Generated
    private final HeadExceptionsImpl serviceClient;

    /**
     * Initializes an instance of AutoRestHeadExceptionTestServiceAsyncClient class.
     * 
     * @param serviceClient the service client implementation.
     */
    @Generated
    AutoRestHeadExceptionTestServiceAsyncClient(HeadExceptionsImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Return 200 status code if successful.
     * 
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws CustomizedException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> head200WithResponse(RequestOptions requestOptions) {
        return this.serviceClient.head200WithResponseAsync(requestOptions);
    }

    /**
     * Return 204 status code if successful.
     * 
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws CustomizedException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> head204WithResponse(RequestOptions requestOptions) {
        return this.serviceClient.head204WithResponseAsync(requestOptions);
    }

    /**
     * Return 404 status code if successful.
     * 
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws CustomizedException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> head404WithResponse(RequestOptions requestOptions) {
        return this.serviceClient.head404WithResponseAsync(requestOptions);
    }
}
