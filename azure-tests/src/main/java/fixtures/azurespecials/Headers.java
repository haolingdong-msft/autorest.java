// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package fixtures.azurespecials;

import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Head;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.Post;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.ResponseBase;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import fixtures.azurespecials.models.ErrorException;
import fixtures.azurespecials.models.HeaderCustomNamedRequestIdParamGroupingParameters;
import fixtures.azurespecials.models.HeadersCustomNamedRequestIdHeaders;
import fixtures.azurespecials.models.HeadersCustomNamedRequestIdHeadHeaders;
import fixtures.azurespecials.models.HeadersCustomNamedRequestIdParamGroupingHeaders;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in Headers.
 */
public final class Headers {
    /**
     * The proxy service used to perform REST calls.
     */
    private final HeadersService service;

    /**
     * The service client containing this operation class.
     */
    private final AutoRestAzureSpecialParametersTestClient client;

    /**
     * Initializes an instance of Headers.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    Headers(AutoRestAzureSpecialParametersTestClient client) {
        this.service = RestProxy.create(HeadersService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for AutoRestAzureSpecialParametersTestClientHeaders to be used by the
     * proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "AutoRestAzureSpecial")
    public interface HeadersService {
        @Post("/azurespecials/customNamedRequestId")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<ResponseBase<HeadersCustomNamedRequestIdHeaders, Void>> customNamedRequestId(
            @HostParam("$host") String host, @HeaderParam("foo-client-request-id") String fooClientRequestId,
            @HeaderParam("Accept") String accept, Context context);

        @Post("/azurespecials/customNamedRequestId")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<Response<Void>> customNamedRequestIdNoCustomHeaders(@HostParam("$host") String host,
            @HeaderParam("foo-client-request-id") String fooClientRequestId, @HeaderParam("Accept") String accept,
            Context context);

        @Post("/azurespecials/customNamedRequestIdParamGrouping")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<ResponseBase<HeadersCustomNamedRequestIdParamGroupingHeaders, Void>> customNamedRequestIdParamGrouping(
            @HostParam("$host") String host, @HeaderParam("foo-client-request-id") String fooClientRequestId,
            @HeaderParam("Accept") String accept, Context context);

        @Post("/azurespecials/customNamedRequestIdParamGrouping")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<Response<Void>> customNamedRequestIdParamGroupingNoCustomHeaders(@HostParam("$host") String host,
            @HeaderParam("foo-client-request-id") String fooClientRequestId, @HeaderParam("Accept") String accept,
            Context context);

        @Head("/azurespecials/customNamedRequestIdHead")
        @ExpectedResponses({ 200, 404 })
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<ResponseBase<HeadersCustomNamedRequestIdHeadHeaders, Boolean>> customNamedRequestIdHead(
            @HostParam("$host") String host, @HeaderParam("foo-client-request-id") String fooClientRequestId,
            @HeaderParam("Accept") String accept, Context context);

        @Head("/azurespecials/customNamedRequestIdHead")
        @ExpectedResponses({ 200, 404 })
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<Response<Boolean>> customNamedRequestIdHeadNoCustomHeaders(@HostParam("$host") String host,
            @HeaderParam("foo-client-request-id") String fooClientRequestId, @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Send foo-client-request-id = 9C4D50EE-2D56-4CD3-8152-34347DC9F2B0 in the header of the request.
     * 
     * @param fooClientRequestId The fooRequestId.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link ResponseBase} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ResponseBase<HeadersCustomNamedRequestIdHeaders, Void>>
        customNamedRequestIdWithResponseAsync(String fooClientRequestId) {
        if (this.client.getHost() == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter this.client.getHost() is required and cannot be null."));
        }
        if (fooClientRequestId == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter fooClientRequestId is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil.withContext(
            context -> service.customNamedRequestId(this.client.getHost(), fooClientRequestId, accept, context));
    }

    /**
     * Send foo-client-request-id = 9C4D50EE-2D56-4CD3-8152-34347DC9F2B0 in the header of the request.
     * 
     * @param fooClientRequestId The fooRequestId.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link ResponseBase} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ResponseBase<HeadersCustomNamedRequestIdHeaders, Void>>
        customNamedRequestIdWithResponseAsync(String fooClientRequestId, Context context) {
        if (this.client.getHost() == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter this.client.getHost() is required and cannot be null."));
        }
        if (fooClientRequestId == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter fooClientRequestId is required and cannot be null."));
        }
        final String accept = "application/json";
        return service.customNamedRequestId(this.client.getHost(), fooClientRequestId, accept, context);
    }

    /**
     * Send foo-client-request-id = 9C4D50EE-2D56-4CD3-8152-34347DC9F2B0 in the header of the request.
     * 
     * @param fooClientRequestId The fooRequestId.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> customNamedRequestIdAsync(String fooClientRequestId) {
        return customNamedRequestIdWithResponseAsync(fooClientRequestId).flatMap(ignored -> Mono.empty());
    }

    /**
     * Send foo-client-request-id = 9C4D50EE-2D56-4CD3-8152-34347DC9F2B0 in the header of the request.
     * 
     * @param fooClientRequestId The fooRequestId.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> customNamedRequestIdAsync(String fooClientRequestId, Context context) {
        return customNamedRequestIdWithResponseAsync(fooClientRequestId, context).flatMap(ignored -> Mono.empty());
    }

    /**
     * Send foo-client-request-id = 9C4D50EE-2D56-4CD3-8152-34347DC9F2B0 in the header of the request.
     * 
     * @param fooClientRequestId The fooRequestId.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link ResponseBase}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ResponseBase<HeadersCustomNamedRequestIdHeaders, Void>
        customNamedRequestIdWithResponse(String fooClientRequestId, Context context) {
        return customNamedRequestIdWithResponseAsync(fooClientRequestId, context).block();
    }

    /**
     * Send foo-client-request-id = 9C4D50EE-2D56-4CD3-8152-34347DC9F2B0 in the header of the request.
     * 
     * @param fooClientRequestId The fooRequestId.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void customNamedRequestId(String fooClientRequestId) {
        customNamedRequestIdWithResponse(fooClientRequestId, Context.NONE);
    }

    /**
     * Send foo-client-request-id = 9C4D50EE-2D56-4CD3-8152-34347DC9F2B0 in the header of the request.
     * 
     * @param fooClientRequestId The fooRequestId.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> customNamedRequestIdNoCustomHeadersWithResponseAsync(String fooClientRequestId) {
        if (this.client.getHost() == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter this.client.getHost() is required and cannot be null."));
        }
        if (fooClientRequestId == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter fooClientRequestId is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil.withContext(context -> service.customNamedRequestIdNoCustomHeaders(this.client.getHost(),
            fooClientRequestId, accept, context));
    }

    /**
     * Send foo-client-request-id = 9C4D50EE-2D56-4CD3-8152-34347DC9F2B0 in the header of the request.
     * 
     * @param fooClientRequestId The fooRequestId.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> customNamedRequestIdNoCustomHeadersWithResponseAsync(String fooClientRequestId,
        Context context) {
        if (this.client.getHost() == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter this.client.getHost() is required and cannot be null."));
        }
        if (fooClientRequestId == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter fooClientRequestId is required and cannot be null."));
        }
        final String accept = "application/json";
        return service.customNamedRequestIdNoCustomHeaders(this.client.getHost(), fooClientRequestId, accept, context);
    }

    /**
     * Send foo-client-request-id = 9C4D50EE-2D56-4CD3-8152-34347DC9F2B0 in the header of the request.
     * 
     * @param fooClientRequestId The fooRequestId.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> customNamedRequestIdNoCustomHeadersWithResponse(String fooClientRequestId, Context context) {
        return customNamedRequestIdNoCustomHeadersWithResponseAsync(fooClientRequestId, context).block();
    }

    /**
     * Send foo-client-request-id = 9C4D50EE-2D56-4CD3-8152-34347DC9F2B0 in the header of the request, via a parameter
     * group.
     * 
     * @param headerCustomNamedRequestIdParamGroupingParameters Parameter group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link ResponseBase} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ResponseBase<HeadersCustomNamedRequestIdParamGroupingHeaders, Void>>
        customNamedRequestIdParamGroupingWithResponseAsync(
            HeaderCustomNamedRequestIdParamGroupingParameters headerCustomNamedRequestIdParamGroupingParameters) {
        if (this.client.getHost() == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter this.client.getHost() is required and cannot be null."));
        }
        if (headerCustomNamedRequestIdParamGroupingParameters == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter headerCustomNamedRequestIdParamGroupingParameters is required and cannot be null."));
        } else {
            headerCustomNamedRequestIdParamGroupingParameters.validate();
        }
        final String accept = "application/json";
        String fooClientRequestId = headerCustomNamedRequestIdParamGroupingParameters.getFooClientRequestId();
        return FluxUtil.withContext(context -> service.customNamedRequestIdParamGrouping(this.client.getHost(),
            fooClientRequestId, accept, context));
    }

    /**
     * Send foo-client-request-id = 9C4D50EE-2D56-4CD3-8152-34347DC9F2B0 in the header of the request, via a parameter
     * group.
     * 
     * @param headerCustomNamedRequestIdParamGroupingParameters Parameter group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link ResponseBase} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ResponseBase<HeadersCustomNamedRequestIdParamGroupingHeaders, Void>>
        customNamedRequestIdParamGroupingWithResponseAsync(
            HeaderCustomNamedRequestIdParamGroupingParameters headerCustomNamedRequestIdParamGroupingParameters,
            Context context) {
        if (this.client.getHost() == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter this.client.getHost() is required and cannot be null."));
        }
        if (headerCustomNamedRequestIdParamGroupingParameters == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter headerCustomNamedRequestIdParamGroupingParameters is required and cannot be null."));
        } else {
            headerCustomNamedRequestIdParamGroupingParameters.validate();
        }
        final String accept = "application/json";
        String fooClientRequestId = headerCustomNamedRequestIdParamGroupingParameters.getFooClientRequestId();
        return service.customNamedRequestIdParamGrouping(this.client.getHost(), fooClientRequestId, accept, context);
    }

    /**
     * Send foo-client-request-id = 9C4D50EE-2D56-4CD3-8152-34347DC9F2B0 in the header of the request, via a parameter
     * group.
     * 
     * @param headerCustomNamedRequestIdParamGroupingParameters Parameter group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> customNamedRequestIdParamGroupingAsync(
        HeaderCustomNamedRequestIdParamGroupingParameters headerCustomNamedRequestIdParamGroupingParameters) {
        return customNamedRequestIdParamGroupingWithResponseAsync(headerCustomNamedRequestIdParamGroupingParameters)
            .flatMap(ignored -> Mono.empty());
    }

    /**
     * Send foo-client-request-id = 9C4D50EE-2D56-4CD3-8152-34347DC9F2B0 in the header of the request, via a parameter
     * group.
     * 
     * @param headerCustomNamedRequestIdParamGroupingParameters Parameter group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> customNamedRequestIdParamGroupingAsync(
        HeaderCustomNamedRequestIdParamGroupingParameters headerCustomNamedRequestIdParamGroupingParameters,
        Context context) {
        return customNamedRequestIdParamGroupingWithResponseAsync(headerCustomNamedRequestIdParamGroupingParameters,
            context).flatMap(ignored -> Mono.empty());
    }

    /**
     * Send foo-client-request-id = 9C4D50EE-2D56-4CD3-8152-34347DC9F2B0 in the header of the request, via a parameter
     * group.
     * 
     * @param headerCustomNamedRequestIdParamGroupingParameters Parameter group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link ResponseBase}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ResponseBase<HeadersCustomNamedRequestIdParamGroupingHeaders, Void>
        customNamedRequestIdParamGroupingWithResponse(
            HeaderCustomNamedRequestIdParamGroupingParameters headerCustomNamedRequestIdParamGroupingParameters,
            Context context) {
        return customNamedRequestIdParamGroupingWithResponseAsync(headerCustomNamedRequestIdParamGroupingParameters,
            context).block();
    }

    /**
     * Send foo-client-request-id = 9C4D50EE-2D56-4CD3-8152-34347DC9F2B0 in the header of the request, via a parameter
     * group.
     * 
     * @param headerCustomNamedRequestIdParamGroupingParameters Parameter group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void customNamedRequestIdParamGrouping(
        HeaderCustomNamedRequestIdParamGroupingParameters headerCustomNamedRequestIdParamGroupingParameters) {
        customNamedRequestIdParamGroupingWithResponse(headerCustomNamedRequestIdParamGroupingParameters, Context.NONE);
    }

    /**
     * Send foo-client-request-id = 9C4D50EE-2D56-4CD3-8152-34347DC9F2B0 in the header of the request, via a parameter
     * group.
     * 
     * @param headerCustomNamedRequestIdParamGroupingParameters Parameter group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> customNamedRequestIdParamGroupingNoCustomHeadersWithResponseAsync(
        HeaderCustomNamedRequestIdParamGroupingParameters headerCustomNamedRequestIdParamGroupingParameters) {
        if (this.client.getHost() == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter this.client.getHost() is required and cannot be null."));
        }
        if (headerCustomNamedRequestIdParamGroupingParameters == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter headerCustomNamedRequestIdParamGroupingParameters is required and cannot be null."));
        } else {
            headerCustomNamedRequestIdParamGroupingParameters.validate();
        }
        final String accept = "application/json";
        String fooClientRequestId = headerCustomNamedRequestIdParamGroupingParameters.getFooClientRequestId();
        return FluxUtil
            .withContext(context -> service.customNamedRequestIdParamGroupingNoCustomHeaders(this.client.getHost(),
                fooClientRequestId, accept, context));
    }

    /**
     * Send foo-client-request-id = 9C4D50EE-2D56-4CD3-8152-34347DC9F2B0 in the header of the request, via a parameter
     * group.
     * 
     * @param headerCustomNamedRequestIdParamGroupingParameters Parameter group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> customNamedRequestIdParamGroupingNoCustomHeadersWithResponseAsync(
        HeaderCustomNamedRequestIdParamGroupingParameters headerCustomNamedRequestIdParamGroupingParameters,
        Context context) {
        if (this.client.getHost() == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter this.client.getHost() is required and cannot be null."));
        }
        if (headerCustomNamedRequestIdParamGroupingParameters == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter headerCustomNamedRequestIdParamGroupingParameters is required and cannot be null."));
        } else {
            headerCustomNamedRequestIdParamGroupingParameters.validate();
        }
        final String accept = "application/json";
        String fooClientRequestId = headerCustomNamedRequestIdParamGroupingParameters.getFooClientRequestId();
        return service.customNamedRequestIdParamGroupingNoCustomHeaders(this.client.getHost(), fooClientRequestId,
            accept, context);
    }

    /**
     * Send foo-client-request-id = 9C4D50EE-2D56-4CD3-8152-34347DC9F2B0 in the header of the request, via a parameter
     * group.
     * 
     * @param headerCustomNamedRequestIdParamGroupingParameters Parameter group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> customNamedRequestIdParamGroupingNoCustomHeadersWithResponse(
        HeaderCustomNamedRequestIdParamGroupingParameters headerCustomNamedRequestIdParamGroupingParameters,
        Context context) {
        return customNamedRequestIdParamGroupingNoCustomHeadersWithResponseAsync(
            headerCustomNamedRequestIdParamGroupingParameters, context).block();
    }

    /**
     * Send foo-client-request-id = 9C4D50EE-2D56-4CD3-8152-34347DC9F2B0 in the header of the request.
     * 
     * @param fooClientRequestId The fooRequestId.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return whether resource exists along with {@link ResponseBase} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ResponseBase<HeadersCustomNamedRequestIdHeadHeaders, Boolean>>
        customNamedRequestIdHeadWithResponseAsync(String fooClientRequestId) {
        if (this.client.getHost() == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter this.client.getHost() is required and cannot be null."));
        }
        if (fooClientRequestId == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter fooClientRequestId is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil.withContext(
            context -> service.customNamedRequestIdHead(this.client.getHost(), fooClientRequestId, accept, context));
    }

    /**
     * Send foo-client-request-id = 9C4D50EE-2D56-4CD3-8152-34347DC9F2B0 in the header of the request.
     * 
     * @param fooClientRequestId The fooRequestId.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return whether resource exists along with {@link ResponseBase} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ResponseBase<HeadersCustomNamedRequestIdHeadHeaders, Boolean>>
        customNamedRequestIdHeadWithResponseAsync(String fooClientRequestId, Context context) {
        if (this.client.getHost() == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter this.client.getHost() is required and cannot be null."));
        }
        if (fooClientRequestId == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter fooClientRequestId is required and cannot be null."));
        }
        final String accept = "application/json";
        return service.customNamedRequestIdHead(this.client.getHost(), fooClientRequestId, accept, context);
    }

    /**
     * Send foo-client-request-id = 9C4D50EE-2D56-4CD3-8152-34347DC9F2B0 in the header of the request.
     * 
     * @param fooClientRequestId The fooRequestId.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return whether resource exists on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Boolean> customNamedRequestIdHeadAsync(String fooClientRequestId) {
        return customNamedRequestIdHeadWithResponseAsync(fooClientRequestId)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Send foo-client-request-id = 9C4D50EE-2D56-4CD3-8152-34347DC9F2B0 in the header of the request.
     * 
     * @param fooClientRequestId The fooRequestId.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return whether resource exists on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Boolean> customNamedRequestIdHeadAsync(String fooClientRequestId, Context context) {
        return customNamedRequestIdHeadWithResponseAsync(fooClientRequestId, context)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Send foo-client-request-id = 9C4D50EE-2D56-4CD3-8152-34347DC9F2B0 in the header of the request.
     * 
     * @param fooClientRequestId The fooRequestId.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return whether resource exists along with {@link ResponseBase}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ResponseBase<HeadersCustomNamedRequestIdHeadHeaders, Boolean>
        customNamedRequestIdHeadWithResponse(String fooClientRequestId, Context context) {
        return customNamedRequestIdHeadWithResponseAsync(fooClientRequestId, context).block();
    }

    /**
     * Send foo-client-request-id = 9C4D50EE-2D56-4CD3-8152-34347DC9F2B0 in the header of the request.
     * 
     * @param fooClientRequestId The fooRequestId.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return whether resource exists.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public boolean customNamedRequestIdHead(String fooClientRequestId) {
        return customNamedRequestIdHeadWithResponse(fooClientRequestId, Context.NONE).getValue();
    }

    /**
     * Send foo-client-request-id = 9C4D50EE-2D56-4CD3-8152-34347DC9F2B0 in the header of the request.
     * 
     * @param fooClientRequestId The fooRequestId.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return whether resource exists along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Boolean>> customNamedRequestIdHeadNoCustomHeadersWithResponseAsync(String fooClientRequestId) {
        if (this.client.getHost() == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter this.client.getHost() is required and cannot be null."));
        }
        if (fooClientRequestId == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter fooClientRequestId is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil.withContext(context -> service.customNamedRequestIdHeadNoCustomHeaders(this.client.getHost(),
            fooClientRequestId, accept, context));
    }

    /**
     * Send foo-client-request-id = 9C4D50EE-2D56-4CD3-8152-34347DC9F2B0 in the header of the request.
     * 
     * @param fooClientRequestId The fooRequestId.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return whether resource exists along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Boolean>> customNamedRequestIdHeadNoCustomHeadersWithResponseAsync(String fooClientRequestId,
        Context context) {
        if (this.client.getHost() == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter this.client.getHost() is required and cannot be null."));
        }
        if (fooClientRequestId == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter fooClientRequestId is required and cannot be null."));
        }
        final String accept = "application/json";
        return service.customNamedRequestIdHeadNoCustomHeaders(this.client.getHost(), fooClientRequestId, accept,
            context);
    }

    /**
     * Send foo-client-request-id = 9C4D50EE-2D56-4CD3-8152-34347DC9F2B0 in the header of the request.
     * 
     * @param fooClientRequestId The fooRequestId.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return whether resource exists along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Boolean> customNamedRequestIdHeadNoCustomHeadersWithResponse(String fooClientRequestId,
        Context context) {
        return customNamedRequestIdHeadNoCustomHeadersWithResponseAsync(fooClientRequestId, context).block();
    }
}
