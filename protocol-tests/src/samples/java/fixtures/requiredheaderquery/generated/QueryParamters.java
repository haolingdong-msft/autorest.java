// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package fixtures.requiredheaderquery.generated;

import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import fixtures.requiredheaderquery.DpgRequiredHeaderQueryClient;
import fixtures.requiredheaderquery.DpgRequiredHeaderQueryClientBuilder;
import java.time.OffsetDateTime;
import java.util.Arrays;

public class QueryParamters {
    public static void main(String[] args) {
        DpgRequiredHeaderQueryClient dpgRequiredHeaderQueryClient =
                new DpgRequiredHeaderQueryClientBuilder().host("http://localhost:3000").buildClient();
        // BEGIN:fixtures.requiredheaderquery.generated.paramsgetrequiredqueryparam.queryparamters
        RequestOptions requestOptions =
                new RequestOptions()
                        .addQueryParam("parameter_int", "17")
                        .addQueryParam("parameter_optional_csv_int_array", "6,7,8")
                        .addQueryParam("parameter_optional_multi_int_array", "9")
                        .addQueryParam("parameter_optional_multi_int_array", "10");
        Response<BinaryData> response =
                dpgRequiredHeaderQueryClient.getRequiredQueryParamWithResponse(
                        true,
                        Arrays.asList("one", "two", "three"),
                        Arrays.asList(1, 2, 3),
                        Arrays.asList("four", "five"),
                        Arrays.asList(4, 5),
                        Arrays.asList("gamma", "beta"),
                        OffsetDateTime.parse("1985-04-12T23:20:50Z"),
                        requestOptions);
        // END:fixtures.requiredheaderquery.generated.paramsgetrequiredqueryparam.queryparamters
    }
}
