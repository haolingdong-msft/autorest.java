// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package fixtures.streamstyleserialization.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * <!-- start generated doc -->
 * The IntWrapper model.
 * <!-- end generated doc -->
 */
@Fluent
public final class IntWrapper implements JsonSerializable<IntWrapper> {
    /*
     * The field1 property.
     */
    private Integer field1;

    /*
     * The field2 property.
     */
    private Integer field2;

    /**
     * Creates an instance of IntWrapper class.
     */
    public IntWrapper() {
    }

    /**
     * Get the field1 property: The field1 property.
     * 
     * @return the field1 value.
     */
    public Integer getField1() {
        return this.field1;
    }

    /**
     * Set the field1 property: The field1 property.
     * 
     * @param field1 the field1 value to set.
     * @return the IntWrapper object itself.
     */
    public IntWrapper setField1(Integer field1) {
        this.field1 = field1;
        return this;
    }

    /**
     * Get the field2 property: The field2 property.
     * 
     * @return the field2 value.
     */
    public Integer getField2() {
        return this.field2;
    }

    /**
     * Set the field2 property: The field2 property.
     * 
     * @param field2 the field2 value to set.
     * @return the IntWrapper object itself.
     */
    public IntWrapper setField2(Integer field2) {
        this.field2 = field2;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeNumberField("field1", this.field1);
        jsonWriter.writeNumberField("field2", this.field2);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of IntWrapper from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of IntWrapper if the JsonReader was pointing to an instance of it, or null if it was pointing
     * to JSON null.
     * @throws IOException If an error occurs while reading the IntWrapper.
     */
    public static IntWrapper fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            IntWrapper deserializedIntWrapper = new IntWrapper();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("field1".equals(fieldName)) {
                    deserializedIntWrapper.field1 = reader.getNullable(JsonReader::getInt);
                } else if ("field2".equals(fieldName)) {
                    deserializedIntWrapper.field2 = reader.getNullable(JsonReader::getInt);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedIntWrapper;
        });
    }
}
