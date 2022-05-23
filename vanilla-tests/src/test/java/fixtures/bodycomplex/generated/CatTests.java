// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package fixtures.bodycomplex.generated;

import com.azure.core.util.BinaryData;
import fixtures.bodycomplex.models.Cat;
import fixtures.bodycomplex.models.Dog;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class CatTests {
    @Test
    public void testDeserialize() {
        Cat model =
                BinaryData.fromString(
                                "{\"color\":\"jbpzvgnwzsymg\",\"hates\":[{\"food\":\"cyzkohdbihanuf\",\"id\":808084535,\"name\":\"jysagith\"}],\"id\":731883185,\"name\":\"bifpikxwczb\"}")
                        .toObject(Cat.class);
        Assertions.assertEquals(731883185, model.getId());
        Assertions.assertEquals("bifpikxwczb", model.getName());
        Assertions.assertEquals("jbpzvgnwzsymg", model.getColor());
        Assertions.assertEquals(808084535, model.getHates().get(0).getId());
        Assertions.assertEquals("jysagith", model.getHates().get(0).getName());
        Assertions.assertEquals("cyzkohdbihanuf", model.getHates().get(0).getFood());
    }

    @Test
    public void testSerialize() {
        Cat model =
                new Cat()
                        .setId(731883185)
                        .setName("bifpikxwczb")
                        .setColor("jbpzvgnwzsymg")
                        .setHates(
                                Arrays.asList(
                                        new Dog().setId(808084535).setName("jysagith").setFood("cyzkohdbihanuf")));
        model = BinaryData.fromObject(model).toObject(Cat.class);
        Assertions.assertEquals(731883185, model.getId());
        Assertions.assertEquals("bifpikxwczb", model.getName());
        Assertions.assertEquals("jbpzvgnwzsymg", model.getColor());
        Assertions.assertEquals(808084535, model.getHates().get(0).getId());
        Assertions.assertEquals("jysagith", model.getHates().get(0).getName());
        Assertions.assertEquals("cyzkohdbihanuf", model.getHates().get(0).getFood());
    }
}