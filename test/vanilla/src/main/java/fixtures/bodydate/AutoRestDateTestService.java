/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodydate;

import com.microsoft.rest.v2.RestClient;

/**
 * The interface for AutoRestDateTestService class.
 */
public interface AutoRestDateTestService {
    /**
     * Gets the REST client.
     *
     * @return the {@link RestClient} object.
    */
    RestClient restClient();

    /**
     * The default base URL.
     */
    String DEFAULT_BASE_URL = "https://localhost";

    /**
     * Gets the Dates object to access its operations.
     * @return the Dates object.
     */
    Dates dates();

}
