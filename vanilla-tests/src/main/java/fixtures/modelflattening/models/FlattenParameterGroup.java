// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package fixtures.modelflattening.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Parameter group.
 */
@Fluent
public final class FlattenParameterGroup implements JsonSerializable<FlattenParameterGroup> {
    /*
     * Product name with value 'groupproduct'
     */
    private String name;

    /*
     * Simple body product to put
     */
    private SimpleProduct simpleBodyProduct;

    /*
     * Unique identifier representing a specific product for a given latitude & longitude. For example, uberX in San Francisco will have a different product_id than uberX in Los Angeles.
     */
    private String productId;

    /*
     * Description of product.
     */
    private String description;

    /*
     * Display name of product.
     */
    private String maxProductDisplayName;

    /*
     * Capacity of product. For example, 4 people.
     */
    private SimpleProductPropertiesMaxProductCapacity capacity;

    /*
     * Generic URL value.
     */
    private String genericValue;

    /*
     * URL value.
     */
    private String odataValue;

    /**
     * Creates an instance of FlattenParameterGroup class.
     */
    public FlattenParameterGroup() {
    }

    /**
     * Get the name property: Product name with value 'groupproduct'.
     * 
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: Product name with value 'groupproduct'.
     * 
     * @param name the name value to set.
     * @return the FlattenParameterGroup object itself.
     */
    public FlattenParameterGroup setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the simpleBodyProduct property: Simple body product to put.
     * 
     * @return the simpleBodyProduct value.
     */
    public SimpleProduct getSimpleBodyProduct() {
        return this.simpleBodyProduct;
    }

    /**
     * Set the simpleBodyProduct property: Simple body product to put.
     * 
     * @param simpleBodyProduct the simpleBodyProduct value to set.
     * @return the FlattenParameterGroup object itself.
     */
    public FlattenParameterGroup setSimpleBodyProduct(SimpleProduct simpleBodyProduct) {
        this.simpleBodyProduct = simpleBodyProduct;
        return this;
    }

    /**
     * Get the productId property: Unique identifier representing a specific product for a given latitude &amp;
     * longitude. For example, uberX in San Francisco will have a different product_id than uberX in Los Angeles.
     * 
     * @return the productId value.
     */
    public String getProductId() {
        return this.productId;
    }

    /**
     * Set the productId property: Unique identifier representing a specific product for a given latitude &amp;
     * longitude. For example, uberX in San Francisco will have a different product_id than uberX in Los Angeles.
     * 
     * @param productId the productId value to set.
     * @return the FlattenParameterGroup object itself.
     */
    public FlattenParameterGroup setProductId(String productId) {
        this.productId = productId;
        return this;
    }

    /**
     * Get the description property: Description of product.
     * 
     * @return the description value.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Set the description property: Description of product.
     * 
     * @param description the description value to set.
     * @return the FlattenParameterGroup object itself.
     */
    public FlattenParameterGroup setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the maxProductDisplayName property: Display name of product.
     * 
     * @return the maxProductDisplayName value.
     */
    public String getMaxProductDisplayName() {
        return this.maxProductDisplayName;
    }

    /**
     * Set the maxProductDisplayName property: Display name of product.
     * 
     * @param maxProductDisplayName the maxProductDisplayName value to set.
     * @return the FlattenParameterGroup object itself.
     */
    public FlattenParameterGroup setMaxProductDisplayName(String maxProductDisplayName) {
        this.maxProductDisplayName = maxProductDisplayName;
        return this;
    }

    /**
     * Get the capacity property: Capacity of product. For example, 4 people.
     * 
     * @return the capacity value.
     */
    public SimpleProductPropertiesMaxProductCapacity getCapacity() {
        return this.capacity;
    }

    /**
     * Set the capacity property: Capacity of product. For example, 4 people.
     * 
     * @param capacity the capacity value to set.
     * @return the FlattenParameterGroup object itself.
     */
    public FlattenParameterGroup setCapacity(SimpleProductPropertiesMaxProductCapacity capacity) {
        this.capacity = capacity;
        return this;
    }

    /**
     * Get the genericValue property: Generic URL value.
     * 
     * @return the genericValue value.
     */
    public String getGenericValue() {
        return this.genericValue;
    }

    /**
     * Set the genericValue property: Generic URL value.
     * 
     * @param genericValue the genericValue value to set.
     * @return the FlattenParameterGroup object itself.
     */
    public FlattenParameterGroup setGenericValue(String genericValue) {
        this.genericValue = genericValue;
        return this;
    }

    /**
     * Get the odataValue property: URL value.
     * 
     * @return the odataValue value.
     */
    public String getOdataValue() {
        return this.odataValue;
    }

    /**
     * Set the odataValue property: URL value.
     * 
     * @param odataValue the odataValue value to set.
     * @return the FlattenParameterGroup object itself.
     */
    public FlattenParameterGroup setOdataValue(String odataValue) {
        this.odataValue = odataValue;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (getName() == null) {
            throw new IllegalArgumentException("Missing required property name in model FlattenParameterGroup");
        }
        if (getSimpleBodyProduct() != null) {
            getSimpleBodyProduct().validate();
        }
        if (getProductId() == null) {
            throw new IllegalArgumentException("Missing required property productId in model FlattenParameterGroup");
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("name", this.name);
        jsonWriter.writeStringField("productId", this.productId);
        jsonWriter.writeJsonField("SimpleBodyProduct", this.simpleBodyProduct);
        jsonWriter.writeStringField("description", this.description);
        jsonWriter.writeStringField("max_product_display_name", this.maxProductDisplayName);
        jsonWriter.writeStringField("capacity", this.capacity == null ? null : this.capacity.toString());
        jsonWriter.writeStringField("generic_value", this.genericValue);
        jsonWriter.writeStringField("@odata.value", this.odataValue);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of FlattenParameterGroup from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of FlattenParameterGroup if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the FlattenParameterGroup.
     */
    public static FlattenParameterGroup fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            FlattenParameterGroup deserializedFlattenParameterGroup = new FlattenParameterGroup();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedFlattenParameterGroup.name = reader.getString();
                } else if ("productId".equals(fieldName)) {
                    deserializedFlattenParameterGroup.productId = reader.getString();
                } else if ("SimpleBodyProduct".equals(fieldName)) {
                    deserializedFlattenParameterGroup.simpleBodyProduct = SimpleProduct.fromJson(reader);
                } else if ("description".equals(fieldName)) {
                    deserializedFlattenParameterGroup.description = reader.getString();
                } else if ("max_product_display_name".equals(fieldName)) {
                    deserializedFlattenParameterGroup.maxProductDisplayName = reader.getString();
                } else if ("capacity".equals(fieldName)) {
                    deserializedFlattenParameterGroup.capacity
                        = SimpleProductPropertiesMaxProductCapacity.fromString(reader.getString());
                } else if ("generic_value".equals(fieldName)) {
                    deserializedFlattenParameterGroup.genericValue = reader.getString();
                } else if ("@odata.value".equals(fieldName)) {
                    deserializedFlattenParameterGroup.odataValue = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedFlattenParameterGroup;
        });
    }
}
