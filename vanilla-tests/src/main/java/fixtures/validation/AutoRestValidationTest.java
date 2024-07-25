// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package fixtures.validation;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Post;
import com.azure.core.annotation.Put;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.UserAgentPolicy;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.core.util.serializer.JacksonAdapter;
import com.azure.core.util.serializer.SerializerAdapter;
import fixtures.validation.models.ErrorException;
import fixtures.validation.models.Product;
import reactor.core.publisher.Mono;

/**
 * Initializes a new instance of the AutoRestValidationTest type.
 */
public final class AutoRestValidationTest {
    /**
     * The proxy service used to perform REST calls.
     */
    private final AutoRestValidationTestService service;

    /**
     * Subscription ID.
     */
    private final String subscriptionId;

    /**
     * Gets Subscription ID.
     * 
     * @return the subscriptionId value.
     */
    public String getSubscriptionId() {
        return this.subscriptionId;
    }

    /**
     * server parameter.
     */
    private final String host;

    /**
     * Gets server parameter.
     * 
     * @return the host value.
     */
    public String getHost() {
        return this.host;
    }

    /**
     * Api Version.
     */
    private final String apiVersion;

    /**
     * Gets Api Version.
     * 
     * @return the apiVersion value.
     */
    public String getApiVersion() {
        return this.apiVersion;
    }

    /**
     * The HTTP pipeline to send requests through.
     */
    private final HttpPipeline httpPipeline;

    /**
     * Gets The HTTP pipeline to send requests through.
     * 
     * @return the httpPipeline value.
     */
    public HttpPipeline getHttpPipeline() {
        return this.httpPipeline;
    }

    /**
     * The serializer to serialize an object into a string.
     */
    private final SerializerAdapter serializerAdapter;

    /**
     * Gets The serializer to serialize an object into a string.
     * 
     * @return the serializerAdapter value.
     */
    public SerializerAdapter getSerializerAdapter() {
        return this.serializerAdapter;
    }

    /**
     * Initializes an instance of AutoRestValidationTest client.
     * 
     * @param subscriptionId Subscription ID.
     * @param host server parameter.
     * @param apiVersion Api Version.
     */
    AutoRestValidationTest(String subscriptionId, String host, String apiVersion) {
        this(new HttpPipelineBuilder().policies(new UserAgentPolicy(), new RetryPolicy()).build(),
            JacksonAdapter.createDefaultSerializerAdapter(), subscriptionId, host, apiVersion);
    }

    /**
     * Initializes an instance of AutoRestValidationTest client.
     * 
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param subscriptionId Subscription ID.
     * @param host server parameter.
     * @param apiVersion Api Version.
     */
    AutoRestValidationTest(HttpPipeline httpPipeline, String subscriptionId, String host, String apiVersion) {
        this(httpPipeline, JacksonAdapter.createDefaultSerializerAdapter(), subscriptionId, host, apiVersion);
    }

    /**
     * Initializes an instance of AutoRestValidationTest client.
     * 
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param serializerAdapter The serializer to serialize an object into a string.
     * @param subscriptionId Subscription ID.
     * @param host server parameter.
     * @param apiVersion Api Version.
     */
    AutoRestValidationTest(HttpPipeline httpPipeline, SerializerAdapter serializerAdapter, String subscriptionId,
        String host, String apiVersion) {
        this.httpPipeline = httpPipeline;
        this.serializerAdapter = serializerAdapter;
        this.subscriptionId = subscriptionId;
        this.host = host;
        this.apiVersion = apiVersion;
        this.service
            = RestProxy.create(AutoRestValidationTestService.class, this.httpPipeline, this.getSerializerAdapter());
    }

    /**
     * The interface defining all the services for AutoRestValidationTest to be used by the proxy service to perform
     * REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "AutoRestValidationTe")
    public interface AutoRestValidationTestService {
        @Get("/fakepath/{subscriptionId}/{resourceGroupName}/{id}")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<Response<Product>> validationOfMethodParameters(@HostParam("$host") String host,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName, @PathParam("id") int id,
            @QueryParam("apiVersion") String apiVersion, @HeaderParam("Accept") String accept, Context context);

        @Put("/fakepath/{subscriptionId}/{resourceGroupName}/{id}")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<Response<Product>> validationOfBody(@HostParam("$host") String host,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName, @PathParam("id") int id,
            @QueryParam("apiVersion") String apiVersion, @BodyParam("application/json") Product body,
            @HeaderParam("Accept") String accept, Context context);

        @Get("/validation/constantsInPath/{constantParam}/value")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Mono<Response<Void>> getWithConstantInPath(@HostParam("$host") String host,
            @PathParam("constantParam") String constantParam, Context context);

        @Post("/validation/constantsInPath/{constantParam}/value")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Mono<Response<Product>> postWithConstantInBody(@HostParam("$host") String host,
            @PathParam("constantParam") String constantParam, @BodyParam("application/json") Product body,
            @HeaderParam("Accept") String accept, Context context);
    }

    /**
     * Validates input parameters on the method. See swagger for details.
     * 
     * @param resourceGroupName Required string between 3 and 10 chars with pattern [a-zA-Z0-9]+.
     * @param id Required int multiple of 10 from 100 to 1000.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of caches along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Product>> validationOfMethodParametersWithResponseAsync(String resourceGroupName, int id) {
        return FluxUtil
            .withContext(context -> validationOfMethodParametersWithResponseAsync(resourceGroupName, id, context));
    }

    /**
     * Validates input parameters on the method. See swagger for details.
     * 
     * @param resourceGroupName Required string between 3 and 10 chars with pattern [a-zA-Z0-9]+.
     * @param id Required int multiple of 10 from 100 to 1000.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of caches along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Product>> validationOfMethodParametersWithResponseAsync(String resourceGroupName, int id,
        Context context) {
        if (this.getHost() == null) {
            return Mono.error(new IllegalArgumentException("Parameter this.getHost() is required and cannot be null."));
        }
        if (this.getSubscriptionId() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        final String accept = "application/json";
        return service.validationOfMethodParameters(this.getHost(), this.getSubscriptionId(), resourceGroupName, id,
            this.getApiVersion(), accept, context);
    }

    /**
     * Validates input parameters on the method. See swagger for details.
     * 
     * @param resourceGroupName Required string between 3 and 10 chars with pattern [a-zA-Z0-9]+.
     * @param id Required int multiple of 10 from 100 to 1000.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of caches on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Product> validationOfMethodParametersAsync(String resourceGroupName, int id) {
        return validationOfMethodParametersWithResponseAsync(resourceGroupName, id)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Validates input parameters on the method. See swagger for details.
     * 
     * @param resourceGroupName Required string between 3 and 10 chars with pattern [a-zA-Z0-9]+.
     * @param id Required int multiple of 10 from 100 to 1000.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of caches on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Product> validationOfMethodParametersAsync(String resourceGroupName, int id, Context context) {
        return validationOfMethodParametersWithResponseAsync(resourceGroupName, id, context)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Validates input parameters on the method. See swagger for details.
     * 
     * @param resourceGroupName Required string between 3 and 10 chars with pattern [a-zA-Z0-9]+.
     * @param id Required int multiple of 10 from 100 to 1000.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of caches along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Product> validationOfMethodParametersWithResponse(String resourceGroupName, int id,
        Context context) {
        return validationOfMethodParametersWithResponseAsync(resourceGroupName, id, context).block();
    }

    /**
     * Validates input parameters on the method. See swagger for details.
     * 
     * @param resourceGroupName Required string between 3 and 10 chars with pattern [a-zA-Z0-9]+.
     * @param id Required int multiple of 10 from 100 to 1000.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of caches.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Product validationOfMethodParameters(String resourceGroupName, int id) {
        return validationOfMethodParametersWithResponse(resourceGroupName, id, Context.NONE).getValue();
    }

    /**
     * Validates body parameters on the method. See swagger for details.
     * 
     * @param resourceGroupName Required string between 3 and 10 chars with pattern [a-zA-Z0-9]+.
     * @param id Required int multiple of 10 from 100 to 1000.
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of caches along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Product>> validationOfBodyWithResponseAsync(String resourceGroupName, int id, Product body) {
        return FluxUtil.withContext(context -> validationOfBodyWithResponseAsync(resourceGroupName, id, body, context));
    }

    /**
     * Validates body parameters on the method. See swagger for details.
     * 
     * @param resourceGroupName Required string between 3 and 10 chars with pattern [a-zA-Z0-9]+.
     * @param id Required int multiple of 10 from 100 to 1000.
     * @param body The body parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of caches along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Product>> validationOfBodyWithResponseAsync(String resourceGroupName, int id, Product body,
        Context context) {
        if (this.getHost() == null) {
            return Mono.error(new IllegalArgumentException("Parameter this.getHost() is required and cannot be null."));
        }
        if (this.getSubscriptionId() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (body != null) {
            body.validate();
        }
        final String accept = "application/json";
        return service.validationOfBody(this.getHost(), this.getSubscriptionId(), resourceGroupName, id,
            this.getApiVersion(), body, accept, context);
    }

    /**
     * Validates body parameters on the method. See swagger for details.
     * 
     * @param resourceGroupName Required string between 3 and 10 chars with pattern [a-zA-Z0-9]+.
     * @param id Required int multiple of 10 from 100 to 1000.
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of caches on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Product> validationOfBodyAsync(String resourceGroupName, int id, Product body) {
        return validationOfBodyWithResponseAsync(resourceGroupName, id, body)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Validates body parameters on the method. See swagger for details.
     * 
     * @param resourceGroupName Required string between 3 and 10 chars with pattern [a-zA-Z0-9]+.
     * @param id Required int multiple of 10 from 100 to 1000.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of caches on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Product> validationOfBodyAsync(String resourceGroupName, int id) {
        final Product body = null;
        return validationOfBodyWithResponseAsync(resourceGroupName, id, body)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Validates body parameters on the method. See swagger for details.
     * 
     * @param resourceGroupName Required string between 3 and 10 chars with pattern [a-zA-Z0-9]+.
     * @param id Required int multiple of 10 from 100 to 1000.
     * @param body The body parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of caches on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Product> validationOfBodyAsync(String resourceGroupName, int id, Product body, Context context) {
        return validationOfBodyWithResponseAsync(resourceGroupName, id, body, context)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Validates body parameters on the method. See swagger for details.
     * 
     * @param resourceGroupName Required string between 3 and 10 chars with pattern [a-zA-Z0-9]+.
     * @param id Required int multiple of 10 from 100 to 1000.
     * @param body The body parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of caches along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Product> validationOfBodyWithResponse(String resourceGroupName, int id, Product body,
        Context context) {
        return validationOfBodyWithResponseAsync(resourceGroupName, id, body, context).block();
    }

    /**
     * Validates body parameters on the method. See swagger for details.
     * 
     * @param resourceGroupName Required string between 3 and 10 chars with pattern [a-zA-Z0-9]+.
     * @param id Required int multiple of 10 from 100 to 1000.
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of caches.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Product validationOfBody(String resourceGroupName, int id, Product body) {
        return validationOfBodyWithResponse(resourceGroupName, id, body, Context.NONE).getValue();
    }

    /**
     * Validates body parameters on the method. See swagger for details.
     * 
     * @param resourceGroupName Required string between 3 and 10 chars with pattern [a-zA-Z0-9]+.
     * @param id Required int multiple of 10 from 100 to 1000.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of caches.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Product validationOfBody(String resourceGroupName, int id) {
        final Product body = null;
        return validationOfBodyWithResponse(resourceGroupName, id, body, Context.NONE).getValue();
    }

    /**
     * The getWithConstantInPath operation.
     * 
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return success along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> getWithConstantInPathWithResponseAsync() {
        return FluxUtil.withContext(context -> getWithConstantInPathWithResponseAsync(context));
    }

    /**
     * The getWithConstantInPath operation.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return success along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> getWithConstantInPathWithResponseAsync(Context context) {
        if (this.getHost() == null) {
            return Mono.error(new IllegalArgumentException("Parameter this.getHost() is required and cannot be null."));
        }
        final String constantParam = "constant";
        return service.getWithConstantInPath(this.getHost(), constantParam, context);
    }

    /**
     * The getWithConstantInPath operation.
     * 
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return success on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> getWithConstantInPathAsync() {
        return getWithConstantInPathWithResponseAsync().flatMap(ignored -> Mono.empty());
    }

    /**
     * The getWithConstantInPath operation.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return success on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> getWithConstantInPathAsync(Context context) {
        return getWithConstantInPathWithResponseAsync(context).flatMap(ignored -> Mono.empty());
    }

    /**
     * The getWithConstantInPath operation.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return success along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> getWithConstantInPathWithResponse(Context context) {
        return getWithConstantInPathWithResponseAsync(context).block();
    }

    /**
     * The getWithConstantInPath operation.
     * 
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void getWithConstantInPath() {
        getWithConstantInPathWithResponse(Context.NONE);
    }

    /**
     * The postWithConstantInBody operation.
     * 
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return success along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Product>> postWithConstantInBodyWithResponseAsync(Product body) {
        return FluxUtil.withContext(context -> postWithConstantInBodyWithResponseAsync(body, context));
    }

    /**
     * The postWithConstantInBody operation.
     * 
     * @param body The body parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return success along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Product>> postWithConstantInBodyWithResponseAsync(Product body, Context context) {
        if (this.getHost() == null) {
            return Mono.error(new IllegalArgumentException("Parameter this.getHost() is required and cannot be null."));
        }
        if (body != null) {
            body.validate();
        }
        final String constantParam = "constant";
        final String accept = "application/json";
        return service.postWithConstantInBody(this.getHost(), constantParam, body, accept, context);
    }

    /**
     * The postWithConstantInBody operation.
     * 
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return success on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Product> postWithConstantInBodyAsync(Product body) {
        return postWithConstantInBodyWithResponseAsync(body).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * The postWithConstantInBody operation.
     * 
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return success on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Product> postWithConstantInBodyAsync() {
        final Product body = null;
        return postWithConstantInBodyWithResponseAsync(body).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * The postWithConstantInBody operation.
     * 
     * @param body The body parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return success on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Product> postWithConstantInBodyAsync(Product body, Context context) {
        return postWithConstantInBodyWithResponseAsync(body, context).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * The postWithConstantInBody operation.
     * 
     * @param body The body parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return success along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Product> postWithConstantInBodyWithResponse(Product body, Context context) {
        return postWithConstantInBodyWithResponseAsync(body, context).block();
    }

    /**
     * The postWithConstantInBody operation.
     * 
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return success.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Product postWithConstantInBody(Product body) {
        return postWithConstantInBodyWithResponse(body, Context.NONE).getValue();
    }

    /**
     * The postWithConstantInBody operation.
     * 
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return success.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Product postWithConstantInBody() {
        final Product body = null;
        return postWithConstantInBodyWithResponse(body, Context.NONE).getValue();
    }
}
