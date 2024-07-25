// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package fixtures.bodydate;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.Put;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import fixtures.bodydate.models.ErrorException;
import java.time.LocalDate;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in DateOperations.
 */
public final class DateOperations {
    /**
     * The proxy service used to perform REST calls.
     */
    private final DateOperationsService service;

    /**
     * The service client containing this operation class.
     */
    private final AutoRestDateTestService client;

    /**
     * Initializes an instance of DateOperations.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    DateOperations(AutoRestDateTestService client) {
        this.service
            = RestProxy.create(DateOperationsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for AutoRestDateTestServiceDateOperations to be used by the proxy service
     * to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "AutoRestDateTestServ")
    public interface DateOperationsService {
        @Get("/date/null")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<Response<LocalDate>> getNull(@HostParam("$host") String host, @HeaderParam("Accept") String accept,
            Context context);

        @Get("/date/invaliddate")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<Response<LocalDate>> getInvalidDate(@HostParam("$host") String host, @HeaderParam("Accept") String accept,
            Context context);

        @Get("/date/overflowdate")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<Response<LocalDate>> getOverflowDate(@HostParam("$host") String host, @HeaderParam("Accept") String accept,
            Context context);

        @Get("/date/underflowdate")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<Response<LocalDate>> getUnderflowDate(@HostParam("$host") String host,
            @HeaderParam("Accept") String accept, Context context);

        @Put("/date/max")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<Response<Void>> putMaxDate(@HostParam("$host") String host,
            @BodyParam("application/json") LocalDate dateBody, @HeaderParam("Accept") String accept, Context context);

        @Get("/date/max")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<Response<LocalDate>> getMaxDate(@HostParam("$host") String host, @HeaderParam("Accept") String accept,
            Context context);

        @Put("/date/min")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<Response<Void>> putMinDate(@HostParam("$host") String host,
            @BodyParam("application/json") LocalDate dateBody, @HeaderParam("Accept") String accept, Context context);

        @Get("/date/min")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<Response<LocalDate>> getMinDate(@HostParam("$host") String host, @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Get null date value.
     * 
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return null date value along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<LocalDate>> getNullWithResponseAsync() {
        return FluxUtil.withContext(context -> getNullWithResponseAsync(context));
    }

    /**
     * Get null date value.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return null date value along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<LocalDate>> getNullWithResponseAsync(Context context) {
        if (this.client.getHost() == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter this.client.getHost() is required and cannot be null."));
        }
        final String accept = "application/json";
        return service.getNull(this.client.getHost(), accept, context);
    }

    /**
     * Get null date value.
     * 
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return null date value on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<LocalDate> getNullAsync() {
        return getNullWithResponseAsync().flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Get null date value.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return null date value on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<LocalDate> getNullAsync(Context context) {
        return getNullWithResponseAsync(context).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Get null date value.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return null date value along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<LocalDate> getNullWithResponse(Context context) {
        return getNullWithResponseAsync(context).block();
    }

    /**
     * Get null date value.
     * 
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return null date value.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public LocalDate getNull() {
        return getNullWithResponse(Context.NONE).getValue();
    }

    /**
     * Get invalid date value.
     * 
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return invalid date value along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<LocalDate>> getInvalidDateWithResponseAsync() {
        return FluxUtil.withContext(context -> getInvalidDateWithResponseAsync(context));
    }

    /**
     * Get invalid date value.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return invalid date value along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<LocalDate>> getInvalidDateWithResponseAsync(Context context) {
        if (this.client.getHost() == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter this.client.getHost() is required and cannot be null."));
        }
        final String accept = "application/json";
        return service.getInvalidDate(this.client.getHost(), accept, context);
    }

    /**
     * Get invalid date value.
     * 
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return invalid date value on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<LocalDate> getInvalidDateAsync() {
        return getInvalidDateWithResponseAsync().flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Get invalid date value.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return invalid date value on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<LocalDate> getInvalidDateAsync(Context context) {
        return getInvalidDateWithResponseAsync(context).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Get invalid date value.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return invalid date value along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<LocalDate> getInvalidDateWithResponse(Context context) {
        return getInvalidDateWithResponseAsync(context).block();
    }

    /**
     * Get invalid date value.
     * 
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return invalid date value.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public LocalDate getInvalidDate() {
        return getInvalidDateWithResponse(Context.NONE).getValue();
    }

    /**
     * Get overflow date value.
     * 
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return overflow date value along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<LocalDate>> getOverflowDateWithResponseAsync() {
        return FluxUtil.withContext(context -> getOverflowDateWithResponseAsync(context));
    }

    /**
     * Get overflow date value.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return overflow date value along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<LocalDate>> getOverflowDateWithResponseAsync(Context context) {
        if (this.client.getHost() == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter this.client.getHost() is required and cannot be null."));
        }
        final String accept = "application/json";
        return service.getOverflowDate(this.client.getHost(), accept, context);
    }

    /**
     * Get overflow date value.
     * 
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return overflow date value on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<LocalDate> getOverflowDateAsync() {
        return getOverflowDateWithResponseAsync().flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Get overflow date value.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return overflow date value on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<LocalDate> getOverflowDateAsync(Context context) {
        return getOverflowDateWithResponseAsync(context).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Get overflow date value.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return overflow date value along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<LocalDate> getOverflowDateWithResponse(Context context) {
        return getOverflowDateWithResponseAsync(context).block();
    }

    /**
     * Get overflow date value.
     * 
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return overflow date value.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public LocalDate getOverflowDate() {
        return getOverflowDateWithResponse(Context.NONE).getValue();
    }

    /**
     * Get underflow date value.
     * 
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return underflow date value along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<LocalDate>> getUnderflowDateWithResponseAsync() {
        return FluxUtil.withContext(context -> getUnderflowDateWithResponseAsync(context));
    }

    /**
     * Get underflow date value.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return underflow date value along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<LocalDate>> getUnderflowDateWithResponseAsync(Context context) {
        if (this.client.getHost() == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter this.client.getHost() is required and cannot be null."));
        }
        final String accept = "application/json";
        return service.getUnderflowDate(this.client.getHost(), accept, context);
    }

    /**
     * Get underflow date value.
     * 
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return underflow date value on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<LocalDate> getUnderflowDateAsync() {
        return getUnderflowDateWithResponseAsync().flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Get underflow date value.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return underflow date value on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<LocalDate> getUnderflowDateAsync(Context context) {
        return getUnderflowDateWithResponseAsync(context).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Get underflow date value.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return underflow date value along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<LocalDate> getUnderflowDateWithResponse(Context context) {
        return getUnderflowDateWithResponseAsync(context).block();
    }

    /**
     * Get underflow date value.
     * 
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return underflow date value.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public LocalDate getUnderflowDate() {
        return getUnderflowDateWithResponse(Context.NONE).getValue();
    }

    /**
     * Put max date value 9999-12-31.
     * 
     * @param dateBody date body.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the max date value along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> putMaxDateWithResponseAsync(LocalDate dateBody) {
        return FluxUtil.withContext(context -> putMaxDateWithResponseAsync(dateBody, context));
    }

    /**
     * Put max date value 9999-12-31.
     * 
     * @param dateBody date body.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the max date value along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> putMaxDateWithResponseAsync(LocalDate dateBody, Context context) {
        if (this.client.getHost() == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter this.client.getHost() is required and cannot be null."));
        }
        if (dateBody == null) {
            return Mono.error(new IllegalArgumentException("Parameter dateBody is required and cannot be null."));
        }
        final String accept = "application/json";
        return service.putMaxDate(this.client.getHost(), dateBody, accept, context);
    }

    /**
     * Put max date value 9999-12-31.
     * 
     * @param dateBody date body.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the max date value on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> putMaxDateAsync(LocalDate dateBody) {
        return putMaxDateWithResponseAsync(dateBody).flatMap(ignored -> Mono.empty());
    }

    /**
     * Put max date value 9999-12-31.
     * 
     * @param dateBody date body.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the max date value on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> putMaxDateAsync(LocalDate dateBody, Context context) {
        return putMaxDateWithResponseAsync(dateBody, context).flatMap(ignored -> Mono.empty());
    }

    /**
     * Put max date value 9999-12-31.
     * 
     * @param dateBody date body.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the max date value along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> putMaxDateWithResponse(LocalDate dateBody, Context context) {
        return putMaxDateWithResponseAsync(dateBody, context).block();
    }

    /**
     * Put max date value 9999-12-31.
     * 
     * @param dateBody date body.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void putMaxDate(LocalDate dateBody) {
        putMaxDateWithResponse(dateBody, Context.NONE);
    }

    /**
     * Get max date value 9999-12-31.
     * 
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return max date value 9999-12-31 along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<LocalDate>> getMaxDateWithResponseAsync() {
        return FluxUtil.withContext(context -> getMaxDateWithResponseAsync(context));
    }

    /**
     * Get max date value 9999-12-31.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return max date value 9999-12-31 along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<LocalDate>> getMaxDateWithResponseAsync(Context context) {
        if (this.client.getHost() == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter this.client.getHost() is required and cannot be null."));
        }
        final String accept = "application/json";
        return service.getMaxDate(this.client.getHost(), accept, context);
    }

    /**
     * Get max date value 9999-12-31.
     * 
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return max date value 9999-12-31 on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<LocalDate> getMaxDateAsync() {
        return getMaxDateWithResponseAsync().flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Get max date value 9999-12-31.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return max date value 9999-12-31 on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<LocalDate> getMaxDateAsync(Context context) {
        return getMaxDateWithResponseAsync(context).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Get max date value 9999-12-31.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return max date value 9999-12-31 along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<LocalDate> getMaxDateWithResponse(Context context) {
        return getMaxDateWithResponseAsync(context).block();
    }

    /**
     * Get max date value 9999-12-31.
     * 
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return max date value 9999-12-31.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public LocalDate getMaxDate() {
        return getMaxDateWithResponse(Context.NONE).getValue();
    }

    /**
     * Put min date value 0000-01-01.
     * 
     * @param dateBody date body.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the min date value along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> putMinDateWithResponseAsync(LocalDate dateBody) {
        return FluxUtil.withContext(context -> putMinDateWithResponseAsync(dateBody, context));
    }

    /**
     * Put min date value 0000-01-01.
     * 
     * @param dateBody date body.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the min date value along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> putMinDateWithResponseAsync(LocalDate dateBody, Context context) {
        if (this.client.getHost() == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter this.client.getHost() is required and cannot be null."));
        }
        if (dateBody == null) {
            return Mono.error(new IllegalArgumentException("Parameter dateBody is required and cannot be null."));
        }
        final String accept = "application/json";
        return service.putMinDate(this.client.getHost(), dateBody, accept, context);
    }

    /**
     * Put min date value 0000-01-01.
     * 
     * @param dateBody date body.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the min date value on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> putMinDateAsync(LocalDate dateBody) {
        return putMinDateWithResponseAsync(dateBody).flatMap(ignored -> Mono.empty());
    }

    /**
     * Put min date value 0000-01-01.
     * 
     * @param dateBody date body.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the min date value on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> putMinDateAsync(LocalDate dateBody, Context context) {
        return putMinDateWithResponseAsync(dateBody, context).flatMap(ignored -> Mono.empty());
    }

    /**
     * Put min date value 0000-01-01.
     * 
     * @param dateBody date body.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the min date value along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> putMinDateWithResponse(LocalDate dateBody, Context context) {
        return putMinDateWithResponseAsync(dateBody, context).block();
    }

    /**
     * Put min date value 0000-01-01.
     * 
     * @param dateBody date body.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void putMinDate(LocalDate dateBody) {
        putMinDateWithResponse(dateBody, Context.NONE);
    }

    /**
     * Get min date value 0000-01-01.
     * 
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return min date value 0000-01-01 along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<LocalDate>> getMinDateWithResponseAsync() {
        return FluxUtil.withContext(context -> getMinDateWithResponseAsync(context));
    }

    /**
     * Get min date value 0000-01-01.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return min date value 0000-01-01 along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<LocalDate>> getMinDateWithResponseAsync(Context context) {
        if (this.client.getHost() == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter this.client.getHost() is required and cannot be null."));
        }
        final String accept = "application/json";
        return service.getMinDate(this.client.getHost(), accept, context);
    }

    /**
     * Get min date value 0000-01-01.
     * 
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return min date value 0000-01-01 on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<LocalDate> getMinDateAsync() {
        return getMinDateWithResponseAsync().flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Get min date value 0000-01-01.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return min date value 0000-01-01 on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<LocalDate> getMinDateAsync(Context context) {
        return getMinDateWithResponseAsync(context).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Get min date value 0000-01-01.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return min date value 0000-01-01 along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<LocalDate> getMinDateWithResponse(Context context) {
        return getMinDateWithResponseAsync(context).block();
    }

    /**
     * Get min date value 0000-01-01.
     * 
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return min date value 0000-01-01.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public LocalDate getMinDate() {
        return getMinDateWithResponse(Context.NONE).getValue();
    }
}
