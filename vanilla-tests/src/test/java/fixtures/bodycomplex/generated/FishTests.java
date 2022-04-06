// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package fixtures.bodycomplex.generated;

import com.azure.core.util.BinaryData;
import fixtures.bodycomplex.models.Fish;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class FishTests {
    @Test
    public void testDeserialize() {
        Fish model =
                BinaryData.fromString(
                                "{\"fishtype\":\"Fish\",\"species\":\"k\",\"length\":32.04869,\"siblings\":[{\"fishtype\":\"Fish\",\"species\":\"ccsnhsjc\",\"length\":26.373684,\"siblings\":[{\"fishtype\":\"Fish\",\"species\":\"kryhtnapczwlokj\",\"length\":68.2114,\"siblings\":[{\"fishtype\":\"Fish\",\"species\":\"vnipjox\",\"length\":40.86501},{\"fishtype\":\"Fish\",\"species\":\"hgejspodma\",\"length\":85.94899},{\"fishtype\":\"Fish\",\"species\":\"deh\",\"length\":93.700584}]}]},{\"fishtype\":\"Fish\",\"species\":\"ahuxinpm\",\"length\":69.22819,\"siblings\":[{\"fishtype\":\"Fish\",\"species\":\"wixjsprozvcp\",\"length\":49.213947,\"siblings\":[{\"fishtype\":\"Fish\",\"species\":\"vwmf\",\"length\":36.996067}]}]},{\"fishtype\":\"Fish\",\"species\":\"cmdv\",\"length\":71.018425,\"siblings\":[{\"fishtype\":\"Fish\",\"species\":\"suuv\",\"length\":60.36252,\"siblings\":[{\"fishtype\":\"Fish\",\"species\":\"k\",\"length\":67.264824},{\"fishtype\":\"Fish\",\"species\":\"dio\",\"length\":47.16013},{\"fishtype\":\"Fish\",\"species\":\"lwejdpv\",\"length\":15.661436},{\"fishtype\":\"Fish\",\"species\":\"qpsoacctazak\",\"length\":2.8880775}]}]}]}")
                        .toObject(Fish.class);
        Assertions.assertEquals("k", model.getSpecies());
        Assertions.assertEquals(32.04869f, model.getLength());
        Assertions.assertEquals("ccsnhsjc", model.getSiblings().get(0).getSpecies());
        Assertions.assertEquals(26.373684f, model.getSiblings().get(0).getLength());
        Assertions.assertEquals("kryhtnapczwlokj", model.getSiblings().get(0).getSiblings().get(0).getSpecies());
        Assertions.assertEquals(68.2114f, model.getSiblings().get(0).getSiblings().get(0).getLength());
        Assertions.assertEquals(
                "vnipjox", model.getSiblings().get(0).getSiblings().get(0).getSiblings().get(0).getSpecies());
        Assertions.assertEquals(
                40.86501f, model.getSiblings().get(0).getSiblings().get(0).getSiblings().get(0).getLength());
    }
}
