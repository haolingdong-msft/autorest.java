// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package fixtures.bodycomplex;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import fixtures.bodycomplex.implementation.ReadonlypropertiesImpl;
import fixtures.bodycomplex.implementation.models.ErrorException;
import fixtures.bodycomplex.implementation.models.ReadonlyObj;
import reactor.core.publisher.Mono;

/**
 * <!-- start generated doc -->
 * Initializes a new instance of the asynchronous AutoRestComplexTestService type.
 * <!-- end generated doc -->
 */
@ServiceClient(builder = AutoRestComplexTestServiceBuilder.class, isAsync = true)
public final class ReadonlypropertyAsyncClient {
    @Generated
    private final ReadonlypropertiesImpl serviceClient;

    /**
     * Initializes an instance of ReadonlypropertyAsyncClient class.
     * 
     * @param serviceClient the service client implementation.
     */
    @Generated
    ReadonlypropertyAsyncClient(ReadonlypropertiesImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Get complex types that have readonly properties.
     * 
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return complex types that have readonly properties along with {@link Response} on successful completion of
     * {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<ReadonlyObj>> getValidWithResponse() {
        return this.serviceClient.getValidWithResponseAsync();
    }

    /**
     * Get complex types that have readonly properties.
     * 
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return complex types that have readonly properties on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ReadonlyObj> getValid() {
        return this.serviceClient.getValidAsync();
    }

    /**
     * Put complex types that have readonly properties.
     * 
     * @param complexBody The complexBody parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> putValidWithResponse(ReadonlyObj complexBody) {
        return this.serviceClient.putValidWithResponseAsync(complexBody);
    }

    /**
     * Put complex types that have readonly properties.
     * 
     * @param complexBody The complexBody parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> putValid(ReadonlyObj complexBody) {
        return this.serviceClient.putValidAsync(complexBody);
    }
}
