// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.models.property.optional;

import com.models.property.optional.models.DurationProperty;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

@Disabled("cadl-ranch definition error")
class DurationOperationClientTest {

    DurationOperationClient client = new DurationOperationClientBuilder().buildClient();

    @Test
    void getAll() {
        DurationProperty durationProperty = client.getAll();
        Assertions.assertEquals("PT2974H14M12.011S", durationProperty.getProperty().toString());
    }

    @Test
    void getDefault() {
        DurationProperty durationProperty = client.getDefault();
        Assertions.assertNull(durationProperty.getProperty());
    }

    @Test
    void putAll() {
//        Duration duration = Duration.parse("PT2974H14M12.011S");
//        DurationProperty property = new DurationProperty();
//        property.setProperty(duration);
//        client.putAll(property);
    }

    @Test
    void putDefault() {
//        DurationProperty property = new DurationProperty();
//        property.setProperty(duration);
//        client.putAll(property);
    }
}