// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package fixtures.httpinfrastructure;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import fixtures.httpinfrastructure.implementation.HttpRedirectsImpl;

/** Initializes a new instance of the synchronous AutoRestHttpInfrastructureTestService type. */
@ServiceClient(builder = AutoRestHttpInfrastructureTestServiceBuilder.class)
public final class HttpRedirectsClient {
    @Generated private final HttpRedirectsImpl serviceClient;

    /**
     * Initializes an instance of HttpRedirects client.
     *
     * @param serviceClient the service client implementation.
     */
    @Generated
    HttpRedirectsClient(HttpRedirectsImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Return 300 status code and redirect to /http/success/200.
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> head300WithResponse(RequestOptions requestOptions) {
        return this.serviceClient.head300WithResponse(requestOptions);
    }

    /**
     * Return 300 status code and redirect to /http/success/200.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * [
     *     String
     * ]
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> get300WithResponse(RequestOptions requestOptions) {
        return this.serviceClient.get300WithResponse(requestOptions);
    }

    /**
     * Return 301 status code and redirect to /http/success/200.
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> head301WithResponse(RequestOptions requestOptions) {
        return this.serviceClient.head301WithResponse(requestOptions);
    }

    /**
     * Return 301 status code and redirect to /http/success/200.
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> get301WithResponse(RequestOptions requestOptions) {
        return this.serviceClient.get301WithResponse(requestOptions);
    }

    /**
     * Put true Boolean value in request returns 301. This request should not be automatically redirected, but should
     * return the received 301 to the caller for evaluation.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * Boolean
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> put301WithResponse(RequestOptions requestOptions) {
        return this.serviceClient.put301WithResponse(requestOptions);
    }

    /**
     * Return 302 status code and redirect to /http/success/200.
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> head302WithResponse(RequestOptions requestOptions) {
        return this.serviceClient.head302WithResponse(requestOptions);
    }

    /**
     * Return 302 status code and redirect to /http/success/200.
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> get302WithResponse(RequestOptions requestOptions) {
        return this.serviceClient.get302WithResponse(requestOptions);
    }

    /**
     * Patch true Boolean value in request returns 302. This request should not be automatically redirected, but should
     * return the received 302 to the caller for evaluation.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * Boolean
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> patch302WithResponse(RequestOptions requestOptions) {
        return this.serviceClient.patch302WithResponse(requestOptions);
    }

    /**
     * Post true Boolean value in request returns 303. This request should be automatically redirected usign a get,
     * ultimately returning a 200 status code.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * Boolean
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> post303WithResponse(RequestOptions requestOptions) {
        return this.serviceClient.post303WithResponse(requestOptions);
    }

    /**
     * Redirect with 307, resulting in a 200 success.
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> head307WithResponse(RequestOptions requestOptions) {
        return this.serviceClient.head307WithResponse(requestOptions);
    }

    /**
     * Redirect get with 307, resulting in a 200 success.
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> get307WithResponse(RequestOptions requestOptions) {
        return this.serviceClient.get307WithResponse(requestOptions);
    }

    /**
     * options redirected with 307, resulting in a 200 after redirect.
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> options307WithResponse(RequestOptions requestOptions) {
        return this.serviceClient.options307WithResponse(requestOptions);
    }

    /**
     * Put redirected with 307, resulting in a 200 after redirect.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * Boolean
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> put307WithResponse(RequestOptions requestOptions) {
        return this.serviceClient.put307WithResponse(requestOptions);
    }

    /**
     * Patch redirected with 307, resulting in a 200 after redirect.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * Boolean
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> patch307WithResponse(RequestOptions requestOptions) {
        return this.serviceClient.patch307WithResponse(requestOptions);
    }

    /**
     * Post redirected with 307, resulting in a 200 after redirect.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * Boolean
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> post307WithResponse(RequestOptions requestOptions) {
        return this.serviceClient.post307WithResponse(requestOptions);
    }

    /**
     * Delete redirected with 307, resulting in a 200 after redirect.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * Boolean
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> delete307WithResponse(RequestOptions requestOptions) {
        return this.serviceClient.delete307WithResponse(requestOptions);
    }
}