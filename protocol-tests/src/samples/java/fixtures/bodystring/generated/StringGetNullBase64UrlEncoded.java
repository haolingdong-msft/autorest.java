// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package fixtures.bodystring.generated;

import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import fixtures.bodystring.StringOperationClient;
import fixtures.bodystring.StringOperationClientBuilder;

public class StringGetNullBase64UrlEncoded {
    public static void main(String[] args) {
        StringOperationClient stringOperationClient
            = new StringOperationClientBuilder().host("http://localhost:3000").buildClient();
        // BEGIN:fixtures.bodystring.generated.stringgetnullbase64urlencoded.stringgetnullbase64urlencoded
        RequestOptions requestOptions = new RequestOptions();
        Response<BinaryData> response = stringOperationClient.getNullBase64UrlEncodedWithResponse(requestOptions);
        // END:fixtures.bodystring.generated.stringgetnullbase64urlencoded.stringgetnullbase64urlencoded
    }
}
