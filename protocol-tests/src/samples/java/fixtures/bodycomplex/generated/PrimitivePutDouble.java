// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package fixtures.bodycomplex.generated;

import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import fixtures.bodycomplex.PrimitiveClient;
import fixtures.bodycomplex.PrimitiveClientBuilder;

public class PrimitivePutDouble {
    public static void main(String[] args) {
        PrimitiveClient primitiveClient = new PrimitiveClientBuilder().host("http://localhost:3000").buildClient();
        // BEGIN:fixtures.bodycomplex.generated.primitiveputdouble.primitiveputdouble
        BinaryData complexBody =
                BinaryData.fromString(
                        "{\"field1\":3.0E-100,\"field_56_zeros_after_the_dot_and_negative_zero_before_dot_and_this_is_a_long_field_name_on_purpose\":-5.0E-57}");
        RequestOptions requestOptions = new RequestOptions();
        Response<Void> response = primitiveClient.putDoubleWithResponse(complexBody, requestOptions);
        // END:fixtures.bodycomplex.generated.primitiveputdouble.primitiveputdouble
    }
}