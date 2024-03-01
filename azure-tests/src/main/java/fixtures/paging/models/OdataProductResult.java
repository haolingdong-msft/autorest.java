// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package fixtures.paging.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * The OdataProductResult model.
 */
@Fluent
public final class OdataProductResult implements JsonSerializable<OdataProductResult> {
    /*
     * The values property.
     */
    private List<Product> values;

    /*
     * The odata.nextLink property.
     */
    private String odataNextLink;

    /**
     * Creates an instance of OdataProductResult class.
     */
    public OdataProductResult() {
    }

    /**
     * Get the values property: The values property.
     * 
     * @return the values value.
     */
    public List<Product> getValues() {
        return this.values;
    }

    /**
     * Set the values property: The values property.
     * 
     * @param values the values value to set.
     * @return the OdataProductResult object itself.
     */
    public OdataProductResult setValues(List<Product> values) {
        this.values = values;
        return this;
    }

    /**
     * Get the odataNextLink property: The odata.nextLink property.
     * 
     * @return the odataNextLink value.
     */
    public String getOdataNextLink() {
        return this.odataNextLink;
    }

    /**
     * Set the odataNextLink property: The odata.nextLink property.
     * 
     * @param odataNextLink the odataNextLink value to set.
     * @return the OdataProductResult object itself.
     */
    public OdataProductResult setOdataNextLink(String odataNextLink) {
        this.odataNextLink = odataNextLink;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (getValues() != null) {
            getValues().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("values", this.values, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeStringField("odata.nextLink", this.odataNextLink);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of OdataProductResult from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of OdataProductResult if the JsonReader was pointing to an instance of it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the OdataProductResult.
     */
    public static OdataProductResult fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            OdataProductResult deserializedOdataProductResult = new OdataProductResult();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("values".equals(fieldName)) {
                    List<Product> values = reader.readArray(reader1 -> Product.fromJson(reader1));
                    deserializedOdataProductResult.values = values;
                } else if ("odata.nextLink".equals(fieldName)) {
                    deserializedOdataProductResult.odataNextLink = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedOdataProductResult;
        });
    }
}
