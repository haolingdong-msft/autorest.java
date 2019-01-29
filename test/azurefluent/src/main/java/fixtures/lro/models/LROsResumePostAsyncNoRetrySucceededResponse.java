/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.lro.models;

import com.microsoft.rest.v2.RestResponse;
import com.microsoft.rest.v2.http.HttpRequest;
import fixtures.lro.LROsPostAsyncNoRetrySucceededHeaders;
import fixtures.lro.implementation.ProductInner;
import java.util.Map;

/**
 * Contains all response data for the resumePostAsyncNoRetrySucceeded operation.
 */
public final class LROsResumePostAsyncNoRetrySucceededResponse extends RestResponse<LROsPostAsyncNoRetrySucceededHeaders, ProductInner> {
    /**
     * Creates an instance of LROsResumePostAsyncNoRetrySucceededResponse.
     *
     * @param request the request which resulted in this LROsResumePostAsyncNoRetrySucceededResponse.
     * @param statusCode the status code of the HTTP response.
     * @param headers the deserialized headers of the HTTP response.
     * @param rawHeaders the raw headers of the HTTP response.
     * @param body the deserialized body of the HTTP response.
     */
    public LROsResumePostAsyncNoRetrySucceededResponse(HttpRequest request, int statusCode, LROsPostAsyncNoRetrySucceededHeaders headers, Map<String, String> rawHeaders, ProductInner body) {
        super(request, statusCode, headers, rawHeaders, body);
    }

    /**
     * @return the deserialized response headers.
     */
    @Override
    public LROsPostAsyncNoRetrySucceededHeaders headers() {
        return super.headers();
    }

    /**
     * @return the deserialized response body.
     */
    @Override
    public ProductInner body() {
        return super.body();
    }
}
