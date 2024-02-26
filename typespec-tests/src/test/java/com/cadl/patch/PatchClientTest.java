// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.cadl.patch;

import com.azure.core.util.BinaryData;
import com.cadl.patch.implementation.JsonMergePatchHelper;
import com.cadl.patch.models.Fish;
import com.cadl.patch.models.InnerModel;
import com.cadl.patch.models.Resource;
import com.cadl.patch.models.Salmon;
import com.cadl.patch.models.Shark;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.JsonNodeType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class PatchClientTest {
    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();
    @Test
    public void testSerializationForNumbers() throws JsonProcessingException {
        Resource resource = new Resource();
        JsonMergePatchHelper.getResourceAccessor().prepareModelForJsonMergePatch(resource, true);
        resource.setIntValue(null);
        resource.setLongValue(null);
        String json = BinaryData.fromObject(resource).toString();
        JsonNode node = OBJECT_MAPPER.readTree(json);
        Assertions.assertEquals(JsonNodeType.NULL,  node.get("longValue").getNodeType());
        Assertions.assertEquals(JsonNodeType.NULL,  node.get("intValue").getNodeType());
    }

    @Test
    public void testSerializationForString() throws JsonProcessingException {
        Resource resource = new Resource();
        JsonMergePatchHelper.getResourceAccessor().prepareModelForJsonMergePatch(resource, true);
        resource.setDescription(null);
        String json = BinaryData.fromObject(resource).toString();
        JsonNode node = OBJECT_MAPPER.readTree(json);
        Assertions.assertEquals(JsonNodeType.NULL, node.get("description").getNodeType());
    }

    @Test
    public void testSerializationForNestedModelProperty() throws JsonProcessingException {
        Resource resource = new Resource();
        resource.setInnerModelProperty(new InnerModel());

        // serialize for inner model property
        JsonMergePatchHelper.getResourceAccessor().prepareModelForJsonMergePatch(resource, true);
        resource.getInnerModelProperty().setDescription(null);
        String json = BinaryData.fromObject(resource).toString();
        JsonNode node = OBJECT_MAPPER.readTree(json);
        Assertions.assertEquals(JsonNodeType.NULL, node.get("wireNameForInnerModelProperty").get("description").getNodeType());

        // serialize for outer model property
        resource.setInnerModelProperty(null);
        json = BinaryData.fromObject(resource).toString();
        node = OBJECT_MAPPER.readTree(json);
        Assertions.assertEquals(JsonNodeType.NULL, node.get("wireNameForInnerModelProperty").getNodeType());
    }

    @Test
    public void testSerializationForMapProperty() throws JsonProcessingException {
        Resource resource = new Resource();
        JsonMergePatchHelper.getResourceAccessor().prepareModelForJsonMergePatch(resource, true);
        Map<String, InnerModel> map = new HashMap<>();
        map.put("key", null);
        resource.setMap(map);
        String json = BinaryData.fromObject(resource).toString();
        JsonNode node = OBJECT_MAPPER.readTree(json);
        Assertions.assertEquals(JsonNodeType.NULL, node.get("map").get("key").getNodeType());
    }

    @Test
    public void testSerializationForMapNullKeyProperty() {
        Exception exception = Assertions.assertThrows(NullPointerException.class, () -> {
            Resource resource = new Resource();
            JsonMergePatchHelper.getResourceAccessor().prepareModelForJsonMergePatch(resource, true);
            Map<String, InnerModel> map = new HashMap<>();
            resource.setMap(map);
            map.put(null, new InnerModel());
            BinaryData.fromObject(resource).toString();
        });

        String expectedMessage = "'fieldName' cannot be null.";
        String actualMessage = exception.getMessage();

        Assertions.assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    public void testSerializationForArrayProperty() throws JsonProcessingException {
        Resource resource = new Resource();
        resource.setArray(Arrays.asList(new InnerModel().setName("value1"), new InnerModel().setName("value2")));
        JsonMergePatchHelper.getResourceAccessor().prepareModelForJsonMergePatch(resource, true);
        Map<String, InnerModel> map = new HashMap<>();
        map.put("key", null);
        resource.setMap(map);
        resource.getArray().set(0, null);
        String json = BinaryData.fromObject(resource).toString(); // {"map":{"key":null},"array":[{"name":"value2"}]}
        JsonNode node = OBJECT_MAPPER.readTree(json);
        Assertions.assertEquals(JsonNodeType.NULL, node.get("map").get("key").getNodeType());
        Assertions.assertEquals(1, node.get("array").size());
        Assertions.assertEquals("value2", node.get("array").get(0).get("name").asText());
    }

    @Test
    public void testSerializationForEnum() throws JsonProcessingException {
        Resource resource = new Resource();
        resource.setEnumValue(null);
        JsonMergePatchHelper.getResourceAccessor().prepareModelForJsonMergePatch(resource, true);
        resource.setEnumValue(null);
        String json = BinaryData.fromObject(resource).toString();
        JsonNode node = OBJECT_MAPPER.readTree(json);
        Assertions.assertEquals(JsonNodeType.NULL, node.get("enumValue").getNodeType());
    }

    @Test
    public void testSerializationForHierarchicalModel() throws JsonProcessingException {
        Fish fish = new Salmon().setAge(1);
        fish.setColor("pink");
        JsonMergePatchHelper.getFishAccessor().prepareModelForJsonMergePatch(fish, true);
        fish.setColor(null);
        String json = BinaryData.fromObject(fish).toString();
        JsonNode node = OBJECT_MAPPER.readTree(json);
        Assertions.assertEquals(JsonNodeType.NULL, node.get("color").getNodeType());
    }
}
