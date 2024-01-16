// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package fixtures.url.multi;

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
import fixtures.url.multi.implementation.QueriesImpl;

/**
 * <!-- start generated doc -->
 * Initializes a new instance of the synchronous AutoRestUrlMutliCollectionFormatTestServiceClient type.
 * <!-- end generated doc -->
 */
@ServiceClient(builder = AutoRestUrlMutliCollectionFormatTestServiceClientBuilder.class)
public final class AutoRestUrlMutliCollectionFormatTestServiceClient {
    @Generated
    private final QueriesImpl serviceClient;

    /**
     * Initializes an instance of AutoRestUrlMutliCollectionFormatTestServiceClient class.
     * 
     * @param serviceClient the service client implementation.
     */
    @Generated
    AutoRestUrlMutliCollectionFormatTestServiceClient(QueriesImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Get a null array of string using the multi-array format.
     * <p>
     * <strong>Query Parameters</strong>
     * </p>
     * <table border="1">
     * <caption>Query Parameters</caption>
     * <tr>
     * <th>Name</th>
     * <th>Type</th>
     * <th>Required</th>
     * <th>Description</th>
     * </tr>
     * <tr>
     * <td>arrayQuery</td>
     * <td>List&lt;String&gt;</td>
     * <td>No</td>
     * <td>a null array of string using the multi-array format. Call {@link RequestOptions#addQueryParam} to add string
     * to array.</td>
     * </tr>
     * </table>
     * You can add these to a request with {@link RequestOptions#addQueryParam}
     * 
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return a null array of string using the multi-array format along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> arrayStringMultiNullWithResponse(RequestOptions requestOptions) {
        return this.serviceClient.arrayStringMultiNullWithResponse(requestOptions);
    }

    /**
     * Get an empty array [] of string using the multi-array format.
     * <p>
     * <strong>Query Parameters</strong>
     * </p>
     * <table border="1">
     * <caption>Query Parameters</caption>
     * <tr>
     * <th>Name</th>
     * <th>Type</th>
     * <th>Required</th>
     * <th>Description</th>
     * </tr>
     * <tr>
     * <td>arrayQuery</td>
     * <td>List&lt;String&gt;</td>
     * <td>No</td>
     * <td>an empty array [] of string using the multi-array format. Call {@link RequestOptions#addQueryParam} to add
     * string to array.</td>
     * </tr>
     * </table>
     * You can add these to a request with {@link RequestOptions#addQueryParam}
     * 
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return an empty array [] of string using the multi-array format along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> arrayStringMultiEmptyWithResponse(RequestOptions requestOptions) {
        return this.serviceClient.arrayStringMultiEmptyWithResponse(requestOptions);
    }

    /**
     * Get an array of string ['ArrayQuery1', 'begin!*'();:@ &amp;=+$,/?#[]end' , null, ''] using the mult-array format.
     * <p>
     * <strong>Query Parameters</strong>
     * </p>
     * <table border="1">
     * <caption>Query Parameters</caption>
     * <tr>
     * <th>Name</th>
     * <th>Type</th>
     * <th>Required</th>
     * <th>Description</th>
     * </tr>
     * <tr>
     * <td>arrayQuery</td>
     * <td>List&lt;String&gt;</td>
     * <td>No</td>
     * <td>an array of string ['ArrayQuery1', 'begin!*'();:@ &amp;=+$,/?#[]end' , null, ''] using the mult-array format.
     * Call {@link RequestOptions#addQueryParam} to add string to array.</td>
     * </tr>
     * </table>
     * You can add these to a request with {@link RequestOptions#addQueryParam}
     * 
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return an array of string ['ArrayQuery1', 'begin!*'();:@ &amp;=+$,/?#[]end' , null, ''] using the mult-array
     * format along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> arrayStringMultiValidWithResponse(RequestOptions requestOptions) {
        return this.serviceClient.arrayStringMultiValidWithResponse(requestOptions);
    }
}
