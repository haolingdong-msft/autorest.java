// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package fixtures.url;

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
import fixtures.url.implementation.PathItemsImpl;

/**
 * Initializes a new instance of the synchronous AutoRestUrlTestServiceClient type.
 */
@ServiceClient(builder = PathItemsClientBuilder.class)
public final class PathItemsClient {
    @Generated
    private final PathItemsImpl serviceClient;

    /**
     * Initializes an instance of PathItemsClient class.
     * 
     * @param serviceClient the service client implementation.
     */
    @Generated
    PathItemsClient(PathItemsImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * send globalStringPath='globalStringPath', pathItemStringPath='pathItemStringPath',
     * localStringPath='localStringPath', globalStringQuery='globalStringQuery',
     * pathItemStringQuery='pathItemStringQuery', localStringQuery='localStringQuery'.
     * <p><strong>Query Parameters</strong></p>
     * <table border="1">
     * <caption>Query Parameters</caption>
     * <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     * <tr><td>pathItemStringQuery</td><td>String</td><td>No</td><td>A string value 'pathItemStringQuery' that appears
     * as a query parameter</td></tr>
     * <tr><td>localStringQuery</td><td>String</td><td>No</td><td>should contain value 'localStringQuery'</td></tr>
     * </table>
     * You can add these to a request with {@link RequestOptions#addQueryParam}
     * 
     * @param pathItemStringPath A string value 'pathItemStringPath' that appears in the path.
     * @param localStringPath should contain value 'localStringPath'.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return successfully received all query parameters in uri along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> getAllWithValuesWithResponse(String pathItemStringPath, String localStringPath,
        RequestOptions requestOptions) {
        return this.serviceClient.getAllWithValuesWithResponse(pathItemStringPath, localStringPath, requestOptions);
    }

    /**
     * send globalStringPath='globalStringPath', pathItemStringPath='pathItemStringPath',
     * localStringPath='localStringPath', globalStringQuery=null, pathItemStringQuery='pathItemStringQuery',
     * localStringQuery='localStringQuery'.
     * <p><strong>Query Parameters</strong></p>
     * <table border="1">
     * <caption>Query Parameters</caption>
     * <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     * <tr><td>pathItemStringQuery</td><td>String</td><td>No</td><td>A string value 'pathItemStringQuery' that appears
     * as a query parameter</td></tr>
     * <tr><td>localStringQuery</td><td>String</td><td>No</td><td>should contain value 'localStringQuery'</td></tr>
     * </table>
     * You can add these to a request with {@link RequestOptions#addQueryParam}
     * 
     * @param pathItemStringPath A string value 'pathItemStringPath' that appears in the path.
     * @param localStringPath should contain value 'localStringPath'.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return successfully received all query parameters but global along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> getGlobalQueryNullWithResponse(String pathItemStringPath, String localStringPath,
        RequestOptions requestOptions) {
        return this.serviceClient.getGlobalQueryNullWithResponse(pathItemStringPath, localStringPath, requestOptions);
    }

    /**
     * send globalStringPath=globalStringPath, pathItemStringPath='pathItemStringPath',
     * localStringPath='localStringPath', globalStringQuery=null, pathItemStringQuery='pathItemStringQuery',
     * localStringQuery=null.
     * <p><strong>Query Parameters</strong></p>
     * <table border="1">
     * <caption>Query Parameters</caption>
     * <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     * <tr><td>pathItemStringQuery</td><td>String</td><td>No</td><td>A string value 'pathItemStringQuery' that appears
     * as a query parameter</td></tr>
     * <tr><td>localStringQuery</td><td>String</td><td>No</td><td>should contain null value</td></tr>
     * </table>
     * You can add these to a request with {@link RequestOptions#addQueryParam}
     * 
     * @param pathItemStringPath A string value 'pathItemStringPath' that appears in the path.
     * @param localStringPath should contain value 'localStringPath'.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return successfully received only the pathItemQuery query parameter along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> getGlobalAndLocalQueryNullWithResponse(String pathItemStringPath, String localStringPath,
        RequestOptions requestOptions) {
        return this.serviceClient.getGlobalAndLocalQueryNullWithResponse(pathItemStringPath, localStringPath,
            requestOptions);
    }

    /**
     * send globalStringPath='globalStringPath', pathItemStringPath='pathItemStringPath',
     * localStringPath='localStringPath', globalStringQuery='globalStringQuery', pathItemStringQuery=null,
     * localStringQuery=null.
     * <p><strong>Query Parameters</strong></p>
     * <table border="1">
     * <caption>Query Parameters</caption>
     * <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     * <tr><td>pathItemStringQuery</td><td>String</td><td>No</td><td>should contain value null</td></tr>
     * <tr><td>localStringQuery</td><td>String</td><td>No</td><td>should contain value null</td></tr>
     * </table>
     * You can add these to a request with {@link RequestOptions#addQueryParam}
     * 
     * @param pathItemStringPath A string value 'pathItemStringPath' that appears in the path.
     * @param localStringPath should contain value 'localStringPath'.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return successfully received only global query parameter along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> getLocalPathItemQueryNullWithResponse(String pathItemStringPath, String localStringPath,
        RequestOptions requestOptions) {
        return this.serviceClient.getLocalPathItemQueryNullWithResponse(pathItemStringPath, localStringPath,
            requestOptions);
    }
}
