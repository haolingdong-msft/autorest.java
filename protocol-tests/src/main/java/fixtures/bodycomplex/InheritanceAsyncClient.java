// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package fixtures.bodycomplex;

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
import fixtures.bodycomplex.implementation.InheritancesImpl;
import reactor.core.publisher.Mono;

/**
 * Initializes a new instance of the asynchronous AutoRestComplexTestServiceClient type.
 */
@ServiceClient(builder = InheritanceClientBuilder.class, isAsync = true)
public final class InheritanceAsyncClient {
    @Generated
    private final InheritancesImpl serviceClient;

    /**
     * Initializes an instance of InheritanceAsyncClient class.
     * 
     * @param serviceClient the service client implementation.
     */
    @Generated
    InheritanceAsyncClient(InheritancesImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Get complex types that extend others.
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     id: Integer (Optional)
     *     name: String (Optional)
     *     color: String (Optional)
     *     hates (Optional): [
     *          (Optional){
     *             id: Integer (Optional)
     *             name: String (Optional)
     *             food: String (Optional)
     *         }
     *     ]
     *     breed: String (Optional)
     * }
     * }</pre>
     * 
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return complex types that extend others along with {@link Response} on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> getValidWithResponse(RequestOptions requestOptions) {
        return this.serviceClient.getValidWithResponseAsync(requestOptions);
    }

    /**
     * Put complex types that extend others.
     * <p><strong>Request Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     id: Integer (Optional)
     *     name: String (Optional)
     *     color: String (Optional)
     *     hates (Optional): [
     *          (Optional){
     *             id: Integer (Optional)
     *             name: String (Optional)
     *             food: String (Optional)
     *         }
     *     ]
     *     breed: String (Optional)
     * }
     * }</pre>
     * 
     * @param complexBody Please put a siamese with id=2, name="Siameee", color=green, breed=persion, which hates 2
     * dogs, the 1st one named "Potato" with id=1 and food="tomato", and the 2nd one named "Tomato" with id=-1 and
     * food="french fries".
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return empty Response along with {@link Response} on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> putValidWithResponse(BinaryData complexBody, RequestOptions requestOptions) {
        return this.serviceClient.putValidWithResponseAsync(complexBody, requestOptions);
    }
}
