// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package fixtures.llcupdate1;

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
import fixtures.llcupdate1.implementation.ParamsImpl;
import reactor.core.publisher.Mono;

/**
 * Initializes a new instance of the asynchronous DpgClient type.
 */
@ServiceClient(builder = DpgClientBuilder.class, isAsync = true)
public final class DpgAsyncClient {
    @Generated
    private final ParamsImpl serviceClient;

    /**
     * Initializes an instance of DpgAsyncClient class.
     * 
     * @param serviceClient the service client implementation.
     */
    @Generated
    DpgAsyncClient(ParamsImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Head request, no params. Initially has no query parameters. After evolution, a new optional query parameter is
     * added.
     * <p><strong>Query Parameters</strong></p>
     * <table border="1">
     * <caption>Query Parameters</caption>
     * <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     * <tr><td>new_parameter</td><td>String</td><td>No</td><td>I'm a new input optional parameter</td></tr>
     * </table>
     * You can add these to a request with {@link RequestOptions#addQueryParam}
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>{@code
     * Object
     * }</pre>
     * 
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return answer from service along with {@link Response} on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> headNoParamsWithResponse(RequestOptions requestOptions) {
        return this.serviceClient.headNoParamsWithResponseAsync(requestOptions);
    }

    /**
     * Get true Boolean value on path.
     * Initially only has one required Query Parameter. After evolution, a new optional query parameter is added.
     * <p><strong>Query Parameters</strong></p>
     * <table border="1">
     * <caption>Query Parameters</caption>
     * <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     * <tr><td>new_parameter</td><td>String</td><td>No</td><td>I'm a new input optional parameter</td></tr>
     * </table>
     * You can add these to a request with {@link RequestOptions#addQueryParam}
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>{@code
     * Object
     * }</pre>
     * 
     * @param parameter I am a required parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return true Boolean value on path.
     * Initially only has one required Query Parameter along with {@link Response} on successful completion of
     * {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> getRequiredWithResponse(String parameter, RequestOptions requestOptions) {
        return this.serviceClient.getRequiredWithResponseAsync(parameter, requestOptions);
    }

    /**
     * Initially has one required query parameter and one optional query parameter. After evolution, a new optional
     * query parameter is added.
     * <p><strong>Query Parameters</strong></p>
     * <table border="1">
     * <caption>Query Parameters</caption>
     * <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     * <tr><td>optionalParam</td><td>String</td><td>No</td><td>I am an optional parameter</td></tr>
     * <tr><td>new_parameter</td><td>String</td><td>No</td><td>I'm a new input optional parameter</td></tr>
     * </table>
     * You can add these to a request with {@link RequestOptions#addQueryParam}
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>{@code
     * Object
     * }</pre>
     * 
     * @param requiredParam I am a required parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return answer from service along with {@link Response} on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> putRequiredOptionalWithResponse(String requiredParam,
        RequestOptions requestOptions) {
        return this.serviceClient.putRequiredOptionalWithResponseAsync(requiredParam, requestOptions);
    }

    /**
     * POST a JSON or a JPEG.
     * <p><strong>Request Body Schema</strong></p>
     * 
     * <pre>{@code
     * BinaryData
     * }</pre>
     * 
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>{@code
     * Object
     * }</pre>
     * 
     * @param contentType The content type. Allowed values: "application/json", "image/jpeg".
     * @param parameter I am a body parameter with a new content type. My only valid JSON entry is { url:
     * "http://example.org/myimage.jpeg" }.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return answer from service along with {@link Response} on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> postParametersWithResponse(String contentType, BinaryData parameter,
        RequestOptions requestOptions) {
        return this.serviceClient.postParametersWithResponseAsync(contentType, parameter, requestOptions);
    }

    /**
     * Delete something.
     * Initially the path exists but there is no delete method. After evolution this is a new method in a known path.
     * 
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return i deleted something, but I won't tell you what along with {@link Response} on successful completion of
     * {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> deleteParametersWithResponse(RequestOptions requestOptions) {
        return this.serviceClient.deleteParametersWithResponseAsync(requestOptions);
    }

    /**
     * Get true Boolean value on path.
     * Initially has one optional query parameter. After evolution, a new optional query parameter is added.
     * <p><strong>Query Parameters</strong></p>
     * <table border="1">
     * <caption>Query Parameters</caption>
     * <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     * <tr><td>optionalParam</td><td>String</td><td>No</td><td>I am an optional parameter</td></tr>
     * <tr><td>new_parameter</td><td>String</td><td>No</td><td>I'm a new input optional parameter</td></tr>
     * </table>
     * You can add these to a request with {@link RequestOptions#addQueryParam}
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>{@code
     * Object
     * }</pre>
     * 
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return true Boolean value on path.
     * Initially has one optional query parameter along with {@link Response} on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> getOptionalWithResponse(RequestOptions requestOptions) {
        return this.serviceClient.getOptionalWithResponseAsync(requestOptions);
    }

    /**
     * I'm a new operation.
     * Initiallty neither path or method exist for this operation. After evolution, this is a new method in a new path.
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>{@code
     * Object
     * }</pre>
     * 
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return answer from service along with {@link Response} on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> getNewOperationWithResponse(RequestOptions requestOptions) {
        return this.serviceClient.getNewOperationWithResponseAsync(requestOptions);
    }
}
