// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package fixtures.paging;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.exception.ClientAuthenticationException;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.exception.ResourceModifiedException;
import com.azure.core.exception.ResourceNotFoundException;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.util.BinaryData;
import fixtures.paging.implementation.PagingsImpl;

/**
 * Initializes a new instance of the synchronous AutoRestPagingTestServiceClient type.
 */
@ServiceClient(builder = AutoRestPagingTestServiceClientBuilder.class)
public final class AutoRestPagingTestServiceClient {
    @Generated
    private final PagingsImpl serviceClient;

    /**
     * Initializes an instance of AutoRestPagingTestServiceClient class.
     * 
     * @param serviceClient the service client implementation.
     */
    @Generated
    AutoRestPagingTestServiceClient(PagingsImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * A paging operation that must return result of the default 'value' node.
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     properties (Optional): {
     *         id: Integer (Optional)
     *         name: String (Optional)
     *     }
     * }
     * }</pre>
     * 
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return a list of products as paginated response with {@link PagedIterable}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<BinaryData> getNoItemNamePages(RequestOptions requestOptions) {
        return this.serviceClient.getNoItemNamePages(requestOptions);
    }

    /**
     * A paging operation that gets an empty next link and should stop after page 1.
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     properties (Optional): {
     *         id: Integer (Optional)
     *         name: String (Optional)
     *     }
     * }
     * }</pre>
     * 
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return a list of products as paginated response with {@link PagedIterable}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<BinaryData> getEmptyNextLinkNamePages(RequestOptions requestOptions) {
        return this.serviceClient.getEmptyNextLinkNamePages(requestOptions);
    }

    /**
     * A paging operation that must ignore any kind of nextLink, and stop after page 1.
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     properties (Optional): {
     *         id: Integer (Optional)
     *         name: String (Optional)
     *     }
     * }
     * }</pre>
     * 
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return a list of products as paginated response with {@link PagedIterable}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<BinaryData> getNullNextLinkNamePages(RequestOptions requestOptions) {
        return this.serviceClient.getNullNextLinkNamePages(requestOptions);
    }

    /**
     * A paging operation that finishes on the first call without a nextlink.
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     properties (Optional): {
     *         id: Integer (Optional)
     *         name: String (Optional)
     *     }
     * }
     * }</pre>
     * 
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return initial response with ProvisioningState='Canceled' as paginated response with {@link PagedIterable}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<BinaryData> getSinglePages(RequestOptions requestOptions) {
        return this.serviceClient.getSinglePages(requestOptions);
    }

    /**
     * A paging operation that finishes on the first call with body params without a nextlink.
     * <p><strong>Request Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     name: String (Optional)
     * }
     * }</pre>
     * 
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     properties (Optional): {
     *         id: Integer (Optional)
     *         name: String (Optional)
     *     }
     * }
     * }</pre>
     * 
     * @param parameters put {'name': 'body'} to pass the test.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return initial response with ProvisioningState='Canceled' as paginated response with {@link PagedIterable}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<BinaryData> getSinglePagesWithBodyParams(BinaryData parameters,
        RequestOptions requestOptions) {
        return this.serviceClient.getSinglePagesWithBodyParams(parameters, requestOptions);
    }

    /**
     * A paging operation whose first response's items list is empty, but still returns a next link. Second (and final)
     * call, will give you an items list of 1.
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     properties (Optional): {
     *         id: Integer (Optional)
     *         name: String (Optional)
     *     }
     * }
     * }</pre>
     * 
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return first call returns an empty items list, second (and final) call returns an items list of length 1 as
     * paginated response with {@link PagedIterable}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<BinaryData> firstResponseEmpty(RequestOptions requestOptions) {
        return this.serviceClient.firstResponseEmpty(requestOptions);
    }

    /**
     * A paging operation that includes a nextLink that has 10 pages.
     * <p><strong>Header Parameters</strong></p>
     * <table border="1">
     * <caption>Header Parameters</caption>
     * <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     * <tr><td>client-request-id</td><td>String</td><td>No</td><td>The clientRequestId parameter</td></tr>
     * <tr><td>maxresults</td><td>Integer</td><td>No</td><td>Sets the maximum number of items to return in the
     * response.</td></tr>
     * <tr><td>timeout</td><td>Integer</td><td>No</td><td>Sets the maximum time that the server can spend processing the
     * request, in seconds. The default is 30 seconds.</td></tr>
     * </table>
     * You can add these to a request with {@link RequestOptions#addHeader}
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     properties (Optional): {
     *         id: Integer (Optional)
     *         name: String (Optional)
     *     }
     * }
     * }</pre>
     * 
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return initial response with ProvisioningState='Canceled' as paginated response with {@link PagedIterable}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<BinaryData> getMultiplePages(RequestOptions requestOptions) {
        return this.serviceClient.getMultiplePages(requestOptions);
    }

    /**
     * A paging operation that includes a next operation. It has a different query parameter from it's next operation
     * nextOperationWithQueryParams. Returns a ProductResult.
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     properties (Optional): {
     *         id: Integer (Optional)
     *         name: String (Optional)
     *     }
     * }
     * }</pre>
     * 
     * @param requiredQueryParameter A required integer query parameter. Put in value '100' to pass test.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return initial response with ProvisioningState='Canceled' as paginated response with {@link PagedIterable}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<BinaryData> getWithQueryParams(int requiredQueryParameter, RequestOptions requestOptions) {
        return this.serviceClient.getWithQueryParams(requiredQueryParameter, requestOptions);
    }

    /**
     * Define `filter` as a query param for all calls. However, the returned next link will also include the `filter` as
     * part of it. Make sure you don't end up duplicating the `filter` param in the url sent.
     * <p><strong>Query Parameters</strong></p>
     * <table border="1">
     * <caption>Query Parameters</caption>
     * <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     * <tr><td>$filter</td><td>String</td><td>No</td><td>OData filter options. Pass in 'foo'</td></tr>
     * </table>
     * You can add these to a request with {@link RequestOptions#addQueryParam}
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     properties (Optional): {
     *         id: Integer (Optional)
     *         name: String (Optional)
     *     }
     * }
     * }</pre>
     * 
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return initial response with ProvisioningState='Canceled' as paginated response with {@link PagedIterable}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<BinaryData> duplicateParams(RequestOptions requestOptions) {
        return this.serviceClient.duplicateParams(requestOptions);
    }

    /**
     * Paging with max page size. We don't want to.
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     properties (Optional): {
     *         id: Integer (Optional)
     *         name: String (Optional)
     *     }
     * }
     * }</pre>
     * 
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return initial response with ProvisioningState='Canceled' as paginated response with {@link PagedIterable}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<BinaryData> pageWithMaxPageSize(RequestOptions requestOptions) {
        return this.serviceClient.pageWithMaxPageSize(requestOptions);
    }

    /**
     * A paging operation that includes a nextLink in odata format that has 10 pages.
     * <p><strong>Header Parameters</strong></p>
     * <table border="1">
     * <caption>Header Parameters</caption>
     * <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     * <tr><td>client-request-id</td><td>String</td><td>No</td><td>The clientRequestId parameter</td></tr>
     * <tr><td>maxresults</td><td>Integer</td><td>No</td><td>Sets the maximum number of items to return in the
     * response.</td></tr>
     * <tr><td>timeout</td><td>Integer</td><td>No</td><td>Sets the maximum time that the server can spend processing the
     * request, in seconds. The default is 30 seconds.</td></tr>
     * </table>
     * You can add these to a request with {@link RequestOptions#addHeader}
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     properties (Optional): {
     *         id: Integer (Optional)
     *         name: String (Optional)
     *     }
     * }
     * }</pre>
     * 
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return initial response with ProvisioningState='Canceled' as paginated response with {@link PagedIterable}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<BinaryData> getOdataMultiplePages(RequestOptions requestOptions) {
        return this.serviceClient.getOdataMultiplePages(requestOptions);
    }

    /**
     * A paging operation that includes a nextLink that has 10 pages.
     * <p><strong>Header Parameters</strong></p>
     * <table border="1">
     * <caption>Header Parameters</caption>
     * <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     * <tr><td>client-request-id</td><td>String</td><td>No</td><td>The clientRequestId parameter</td></tr>
     * <tr><td>maxresults</td><td>Integer</td><td>No</td><td>Sets the maximum number of items to return in the
     * response.</td></tr>
     * <tr><td>timeout</td><td>Integer</td><td>No</td><td>Sets the maximum time that the server can spend processing the
     * request, in seconds. The default is 30 seconds.</td></tr>
     * </table>
     * You can add these to a request with {@link RequestOptions#addHeader}
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     properties (Optional): {
     *         id: Integer (Optional)
     *         name: String (Optional)
     *     }
     * }
     * }</pre>
     * 
     * @param offset Offset of return value.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return initial response with ProvisioningState='Canceled' as paginated response with {@link PagedIterable}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<BinaryData> getMultiplePagesWithOffset(int offset, RequestOptions requestOptions) {
        return this.serviceClient.getMultiplePagesWithOffset(offset, requestOptions);
    }

    /**
     * A paging operation that fails on the first call with 500 and then retries and then get a response including a
     * nextLink that has 10 pages.
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     properties (Optional): {
     *         id: Integer (Optional)
     *         name: String (Optional)
     *     }
     * }
     * }</pre>
     * 
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return initial response with ProvisioningState='Canceled' as paginated response with {@link PagedIterable}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<BinaryData> getMultiplePagesRetryFirst(RequestOptions requestOptions) {
        return this.serviceClient.getMultiplePagesRetryFirst(requestOptions);
    }

    /**
     * A paging operation that includes a nextLink that has 10 pages, of which the 2nd call fails first with 500. The
     * client should retry and finish all 10 pages eventually.
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     properties (Optional): {
     *         id: Integer (Optional)
     *         name: String (Optional)
     *     }
     * }
     * }</pre>
     * 
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return initial response with ProvisioningState='Canceled' as paginated response with {@link PagedIterable}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<BinaryData> getMultiplePagesRetrySecond(RequestOptions requestOptions) {
        return this.serviceClient.getMultiplePagesRetrySecond(requestOptions);
    }

    /**
     * A paging operation that receives a 400 on the first call.
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     properties (Optional): {
     *         id: Integer (Optional)
     *         name: String (Optional)
     *     }
     * }
     * }</pre>
     * 
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return initial response with ProvisioningState='Canceled' as paginated response with {@link PagedIterable}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<BinaryData> getSinglePagesFailure(RequestOptions requestOptions) {
        return this.serviceClient.getSinglePagesFailure(requestOptions);
    }

    /**
     * A paging operation that receives a 400 on the second call.
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     properties (Optional): {
     *         id: Integer (Optional)
     *         name: String (Optional)
     *     }
     * }
     * }</pre>
     * 
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return initial response with ProvisioningState='Canceled' as paginated response with {@link PagedIterable}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<BinaryData> getMultiplePagesFailure(RequestOptions requestOptions) {
        return this.serviceClient.getMultiplePagesFailure(requestOptions);
    }

    /**
     * A paging operation that receives an invalid nextLink.
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     properties (Optional): {
     *         id: Integer (Optional)
     *         name: String (Optional)
     *     }
     * }
     * }</pre>
     * 
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return initial response with ProvisioningState='Canceled' as paginated response with {@link PagedIterable}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<BinaryData> getMultiplePagesFailureUri(RequestOptions requestOptions) {
        return this.serviceClient.getMultiplePagesFailureUri(requestOptions);
    }

    /**
     * A paging operation that doesn't return a full URL, just a fragment.
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     properties (Optional): {
     *         id: Integer (Optional)
     *         name: String (Optional)
     *     }
     * }
     * }</pre>
     * 
     * @param apiVersion Sets the api version to use.
     * @param tenant Sets the tenant to use.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return paging response with a fragment nextLink as paginated response with {@link PagedIterable}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<BinaryData> getMultiplePagesFragmentNextLink(String apiVersion, String tenant,
        RequestOptions requestOptions) {
        return this.serviceClient.getMultiplePagesFragmentNextLink(apiVersion, tenant, requestOptions);
    }

    /**
     * A paging operation that doesn't return a full URL, just a fragment with parameters grouped.
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     properties (Optional): {
     *         id: Integer (Optional)
     *         name: String (Optional)
     *     }
     * }
     * }</pre>
     * 
     * @param apiVersion Sets the api version to use.
     * @param tenant Sets the tenant to use.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return paging response with a fragment nextLink as paginated response with {@link PagedIterable}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<BinaryData> getMultiplePagesFragmentWithGroupingNextLink(String apiVersion, String tenant,
        RequestOptions requestOptions) {
        return this.serviceClient.getMultiplePagesFragmentWithGroupingNextLink(apiVersion, tenant, requestOptions);
    }

    /**
     * A long-running paging operation that includes a nextLink that has 10 pages.
     * <p><strong>Header Parameters</strong></p>
     * <table border="1">
     * <caption>Header Parameters</caption>
     * <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     * <tr><td>client-request-id</td><td>String</td><td>No</td><td>The clientRequestId parameter</td></tr>
     * <tr><td>maxresults</td><td>Integer</td><td>No</td><td>Sets the maximum number of items to return in the
     * response.</td></tr>
     * <tr><td>timeout</td><td>Integer</td><td>No</td><td>Sets the maximum time that the server can spend processing the
     * request, in seconds. The default is 30 seconds.</td></tr>
     * </table>
     * You can add these to a request with {@link RequestOptions#addHeader}
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     properties (Optional): {
     *         id: Integer (Optional)
     *         name: String (Optional)
     *     }
     * }
     * }</pre>
     * 
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return operation is in progress as paginated response with {@link PagedIterable}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<BinaryData> getMultiplePagesLro(RequestOptions requestOptions) {
        return this.serviceClient.getMultiplePagesLro(requestOptions);
    }

    /**
     * A paging operation with api version. When calling the next link, you want to append your client's api version to
     * the next link.
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     properties (Optional): {
     *         id: Integer (Optional)
     *         name: String (Optional)
     *     }
     * }
     * }</pre>
     * 
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return initial response with ProvisioningState='Canceled' as paginated response with {@link PagedIterable}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<BinaryData> appendApiVersion(RequestOptions requestOptions) {
        return this.serviceClient.appendApiVersion(requestOptions);
    }

    /**
     * A paging operation with api version. When calling the next link, you want to reformat it and override the
     * returned api version with your client's api version.
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     properties (Optional): {
     *         id: Integer (Optional)
     *         name: String (Optional)
     *     }
     * }
     * }</pre>
     * 
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return initial response with ProvisioningState='Canceled' as paginated response with {@link PagedIterable}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<BinaryData> replaceApiVersion(RequestOptions requestOptions) {
        return this.serviceClient.replaceApiVersion(requestOptions);
    }

    /**
     * A paging operation that returns a paging model whose item name is is overriden by x-ms-client-name 'indexes'.
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     properties (Optional): {
     *         id: Integer (Optional)
     *         name: String (Optional)
     *     }
     * }
     * }</pre>
     * 
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return returns a paging model whose item names are called 'indexes', not 'value' as paginated response with
     * {@link PagedIterable}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<BinaryData> getPagingModelWithItemNameWithXmsClientName(RequestOptions requestOptions) {
        return this.serviceClient.getPagingModelWithItemNameWithXmsClientName(requestOptions);
    }
}
