/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodyboolean.implementation;

import com.microsoft.rest.v2.BodyResponse;
import com.microsoft.rest.v2.RestProxy;
import com.microsoft.rest.v2.ServiceCallback;
import com.microsoft.rest.v2.ServiceFuture;
import com.microsoft.rest.v2.VoidResponse;
import com.microsoft.rest.v2.annotations.BodyParam;
import com.microsoft.rest.v2.annotations.ExpectedResponses;
import com.microsoft.rest.v2.annotations.GET;
import com.microsoft.rest.v2.annotations.Host;
import com.microsoft.rest.v2.annotations.PUT;
import com.microsoft.rest.v2.annotations.UnexpectedResponseExceptionType;
import fixtures.bodyboolean.Bools;
import fixtures.bodyboolean.models.ErrorException;
import io.reactivex.Completable;
import io.reactivex.Maybe;
import io.reactivex.Single;

/**
 * An instance of this class provides access to all the operations defined in
 * Bools.
 */
public final class BoolsImpl implements Bools {
    /**
     * The proxy service used to perform REST calls.
     */
    private BoolsService service;

    /**
     * The service client containing this operation class.
     */
    private AutoRestBoolTestServiceImpl client;

    /**
     * Initializes an instance of BoolsImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    public BoolsImpl(AutoRestBoolTestServiceImpl client) {
        this.service = RestProxy.create(BoolsService.class, client);
        this.client = client;
    }

    /**
     * The interface defining all the services for Bools to be used by the
     * proxy service to perform REST calls.
     */
    @Host("http://localhost:3000")
    private interface BoolsService {
        @GET("bool/true")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<BodyResponse<Boolean>> getTrue();

        @PUT("bool/true")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<VoidResponse> putTrue(@BodyParam("application/json; charset=utf-8") boolean boolBody);

        @GET("bool/false")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<BodyResponse<Boolean>> getFalse();

        @PUT("bool/false")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<VoidResponse> putFalse(@BodyParam("application/json; charset=utf-8") boolean boolBody);

        @GET("bool/null")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<BodyResponse<Boolean>> getNull();

        @GET("bool/invalid")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<BodyResponse<Boolean>> getInvalid();
    }

    /**
     * Get true Boolean value.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the boolean object if successful.
     */
    public boolean getTrue() {
        return getTrueAsync().blockingGet();
    }

    /**
     * Get true Boolean value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    public ServiceFuture<Boolean> getTrueAsync(ServiceCallback<Boolean> serviceCallback) {
        return ServiceFuture.fromBody(getTrueAsync(), serviceCallback);
    }

    /**
     * Get true Boolean value.
     *
     * @return a Single which performs the network request upon subscription.
     */
    public Single<BodyResponse<Boolean>> getTrueWithRestResponseAsync() {
        return service.getTrue();
    }

    /**
     * Get true Boolean value.
     *
     * @return a Single which performs the network request upon subscription.
     */
    public Maybe<Boolean> getTrueAsync() {
        return getTrueWithRestResponseAsync()
            .flatMapMaybe((BodyResponse<Boolean> res) -> res.body() == null ? Maybe.empty() : Maybe.just(res.body()));
    }

    /**
     * Set Boolean value true.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    public void putTrue() {
        putTrueAsync().blockingAwait();
    }

    /**
     * Set Boolean value true.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    public ServiceFuture<Void> putTrueAsync(ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(putTrueAsync(), serviceCallback);
    }

    /**
     * Set Boolean value true.
     *
     * @return a Single which performs the network request upon subscription.
     */
    public Single<VoidResponse> putTrueWithRestResponseAsync() {
        final boolean boolBody = true;
        return service.putTrue(boolBody);
    }

    /**
     * Set Boolean value true.
     *
     * @return a Single which performs the network request upon subscription.
     */
    public Completable putTrueAsync() {
        return putTrueWithRestResponseAsync()
            .ignoreElement();
    }

    /**
     * Get false Boolean value.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the boolean object if successful.
     */
    public boolean getFalse() {
        return getFalseAsync().blockingGet();
    }

    /**
     * Get false Boolean value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    public ServiceFuture<Boolean> getFalseAsync(ServiceCallback<Boolean> serviceCallback) {
        return ServiceFuture.fromBody(getFalseAsync(), serviceCallback);
    }

    /**
     * Get false Boolean value.
     *
     * @return a Single which performs the network request upon subscription.
     */
    public Single<BodyResponse<Boolean>> getFalseWithRestResponseAsync() {
        return service.getFalse();
    }

    /**
     * Get false Boolean value.
     *
     * @return a Single which performs the network request upon subscription.
     */
    public Maybe<Boolean> getFalseAsync() {
        return getFalseWithRestResponseAsync()
            .flatMapMaybe((BodyResponse<Boolean> res) -> res.body() == null ? Maybe.empty() : Maybe.just(res.body()));
    }

    /**
     * Set Boolean value false.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    public void putFalse() {
        putFalseAsync().blockingAwait();
    }

    /**
     * Set Boolean value false.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    public ServiceFuture<Void> putFalseAsync(ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(putFalseAsync(), serviceCallback);
    }

    /**
     * Set Boolean value false.
     *
     * @return a Single which performs the network request upon subscription.
     */
    public Single<VoidResponse> putFalseWithRestResponseAsync() {
        final boolean boolBody = false;
        return service.putFalse(boolBody);
    }

    /**
     * Set Boolean value false.
     *
     * @return a Single which performs the network request upon subscription.
     */
    public Completable putFalseAsync() {
        return putFalseWithRestResponseAsync()
            .ignoreElement();
    }

    /**
     * Get null Boolean value.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the boolean object if successful.
     */
    public boolean getNull() {
        return getNullAsync().blockingGet();
    }

    /**
     * Get null Boolean value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    public ServiceFuture<Boolean> getNullAsync(ServiceCallback<Boolean> serviceCallback) {
        return ServiceFuture.fromBody(getNullAsync(), serviceCallback);
    }

    /**
     * Get null Boolean value.
     *
     * @return a Single which performs the network request upon subscription.
     */
    public Single<BodyResponse<Boolean>> getNullWithRestResponseAsync() {
        return service.getNull();
    }

    /**
     * Get null Boolean value.
     *
     * @return a Single which performs the network request upon subscription.
     */
    public Maybe<Boolean> getNullAsync() {
        return getNullWithRestResponseAsync()
            .flatMapMaybe((BodyResponse<Boolean> res) -> res.body() == null ? Maybe.empty() : Maybe.just(res.body()));
    }

    /**
     * Get invalid Boolean value.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the boolean object if successful.
     */
    public boolean getInvalid() {
        return getInvalidAsync().blockingGet();
    }

    /**
     * Get invalid Boolean value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    public ServiceFuture<Boolean> getInvalidAsync(ServiceCallback<Boolean> serviceCallback) {
        return ServiceFuture.fromBody(getInvalidAsync(), serviceCallback);
    }

    /**
     * Get invalid Boolean value.
     *
     * @return a Single which performs the network request upon subscription.
     */
    public Single<BodyResponse<Boolean>> getInvalidWithRestResponseAsync() {
        return service.getInvalid();
    }

    /**
     * Get invalid Boolean value.
     *
     * @return a Single which performs the network request upon subscription.
     */
    public Maybe<Boolean> getInvalidAsync() {
        return getInvalidWithRestResponseAsync()
            .flatMapMaybe((BodyResponse<Boolean> res) -> res.body() == null ? Maybe.empty() : Maybe.just(res.body()));
    }
}
