// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package fixtures.bodycomplex.generated;

import com.azure.core.util.BinaryData;
import fixtures.bodycomplex.models.DatetimeWrapper;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class DatetimeWrapperTests {
    @Test
    public void testDeserialize() {
        DatetimeWrapper model =
                BinaryData.fromString("{\"field\":\"2021-06-29T08:49:50Z\",\"now\":\"2021-06-25T01:54:31Z\"}")
                        .toObject(DatetimeWrapper.class);
        Assertions.assertEquals(OffsetDateTime.parse("2021-06-29T08:49:50Z"), model.getField());
        Assertions.assertEquals(OffsetDateTime.parse("2021-06-25T01:54:31Z"), model.getNow());
    }
}
