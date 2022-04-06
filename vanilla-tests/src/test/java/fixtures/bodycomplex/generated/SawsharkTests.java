// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package fixtures.bodycomplex.generated;

import com.azure.core.util.BinaryData;
import fixtures.bodycomplex.models.Sawshark;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class SawsharkTests {
    @Test
    public void testDeserialize() {
        Sawshark model =
                BinaryData.fromString(
                                "{\"fishtype\":\"sawshark\",\"age\":485990541,\"birthday\":\"2021-08-18T07:24:05Z\",\"species\":\"cpecfvmmcoofs\",\"length\":70.36964,\"siblings\":[{\"fishtype\":\"Fish\",\"species\":\"gbmqjqabcypmiv\",\"length\":1.4300108,\"siblings\":[{\"fishtype\":\"Fish\",\"species\":\"vccfw\",\"length\":23.822641,\"siblings\":[{\"fishtype\":\"Fish\",\"species\":\"cfionl\",\"length\":74.844604},{\"fishtype\":\"Fish\",\"species\":\"tqgtzxdpnqbqq\",\"length\":78.130844},{\"fishtype\":\"Fish\",\"species\":\"feallnwsu\",\"length\":71.703186},{\"fishtype\":\"Fish\",\"species\":\"jampmngnzscxaqw\",\"length\":78.40503}]},{\"fishtype\":\"Fish\",\"species\":\"cbonqvpk\",\"length\":78.45201,\"siblings\":[{\"fishtype\":\"Fish\",\"species\":\"jease\",\"length\":64.567604}]},{\"fishtype\":\"Fish\",\"species\":\"oflokey\",\"length\":65.696785,\"siblings\":[{\"fishtype\":\"Fish\",\"species\":\"bdlwtgrhpdjpj\",\"length\":79.58986}]},{\"fishtype\":\"Fish\",\"species\":\"xazjpqyegual\",\"length\":0.90652704,\"siblings\":[{\"fishtype\":\"Fish\",\"species\":\"e\",\"length\":38.9275},{\"fishtype\":\"Fish\",\"species\":\"v\",\"length\":61.968},{\"fishtype\":\"Fish\",\"species\":\"wdslfhotwmcy\",\"length\":44.5553}]}]},{\"fishtype\":\"Fish\",\"species\":\"bjnpg\",\"length\":39.36754,\"siblings\":[{\"fishtype\":\"Fish\",\"species\":\"dehxnltyfsoppu\",\"length\":80.94732,\"siblings\":[{\"fishtype\":\"Fish\",\"species\":\"zwdejbavor\",\"length\":65.58722},{\"fishtype\":\"Fish\",\"species\":\"ohctbqvudwx\",\"length\":28.46756}]},{\"fishtype\":\"Fish\",\"species\":\"vo\",\"length\":79.285,\"siblings\":[{\"fishtype\":\"Fish\",\"species\":\"ugw\",\"length\":54.083855},{\"fishtype\":\"Fish\",\"species\":\"lhslazjdyggdtj\",\"length\":44.614758},{\"fishtype\":\"Fish\",\"species\":\"kuofqweykhme\",\"length\":85.40872},{\"fishtype\":\"Fish\",\"species\":\"yexfwh\",\"length\":93.54928}]},{\"fishtype\":\"Fish\",\"species\":\"bvyvdcsity\",\"length\":35.394787,\"siblings\":[{\"fishtype\":\"Fish\",\"species\":\"dectehfiqsc\",\"length\":61.13135},{\"fishtype\":\"Fish\",\"species\":\"vhezrkgqhcj\",\"length\":43.637413}]},{\"fishtype\":\"Fish\",\"species\":\"vgmkqsleyyvxyqjp\",\"length\":90.606155,\"siblings\":[{\"fishtype\":\"Fish\",\"species\":\"pngjcrcczsqpjhvm\",\"length\":67.3958}]}]}]}")
                        .toObject(Sawshark.class);
        Assertions.assertEquals("cpecfvmmcoofs", model.getSpecies());
        Assertions.assertEquals(70.36964f, model.getLength());
        Assertions.assertEquals("gbmqjqabcypmiv", model.getSiblings().get(0).getSpecies());
        Assertions.assertEquals(1.4300108f, model.getSiblings().get(0).getLength());
        Assertions.assertEquals("vccfw", model.getSiblings().get(0).getSiblings().get(0).getSpecies());
        Assertions.assertEquals(23.822641f, model.getSiblings().get(0).getSiblings().get(0).getLength());
        Assertions.assertEquals(
                "cfionl", model.getSiblings().get(0).getSiblings().get(0).getSiblings().get(0).getSpecies());
        Assertions.assertEquals(
                74.844604f, model.getSiblings().get(0).getSiblings().get(0).getSiblings().get(0).getLength());
        Assertions.assertEquals(485990541, model.getAge());
        Assertions.assertEquals(OffsetDateTime.parse("2021-08-18T07:24:05Z"), model.getBirthday());
    }
}
