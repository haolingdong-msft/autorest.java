// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package fixtures.streamstyleserializationctorargs.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The StringWrapper model.
 */
@Fluent
public final class StringWrapper implements JsonSerializable<StringWrapper> {
    /*
     * The field property.
     */
    private String field;

    /*
     * The empty property.
     */
    private String empty;

    /*
     * The null property.
     */
    private String nullProperty;

    /**
     * Creates an instance of StringWrapper class.
     */
    public StringWrapper() {
    }

    /**
     * Get the field property: The field property.
     * 
     * @return the field value.
     */
    public String getField() {
        return this.field;
    }

    /**
     * Set the field property: The field property.
     * 
     * @param field the field value to set.
     * @return the StringWrapper object itself.
     */
    public StringWrapper setField(String field) {
        this.field = field;
        return this;
    }

    /**
     * Get the empty property: The empty property.
     * 
     * @return the empty value.
     */
    public String getEmpty() {
        return this.empty;
    }

    /**
     * Set the empty property: The empty property.
     * 
     * @param empty the empty value to set.
     * @return the StringWrapper object itself.
     */
    public StringWrapper setEmpty(String empty) {
        this.empty = empty;
        return this;
    }

    /**
     * Get the nullProperty property: The null property.
     * 
     * @return the nullProperty value.
     */
    public String getNullProperty() {
        return this.nullProperty;
    }

    /**
     * Set the nullProperty property: The null property.
     * 
     * @param nullProperty the nullProperty value to set.
     * @return the StringWrapper object itself.
     */
    public StringWrapper setNullProperty(String nullProperty) {
        this.nullProperty = nullProperty;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("field", this.field);
        jsonWriter.writeStringField("empty", this.empty);
        jsonWriter.writeStringField("null", this.nullProperty);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of StringWrapper from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of StringWrapper if the JsonReader was pointing to an instance of it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the StringWrapper.
     */
    public static StringWrapper fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            StringWrapper deserializedStringWrapper = new StringWrapper();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("field".equals(fieldName)) {
                    deserializedStringWrapper.field = reader.getString();
                } else if ("empty".equals(fieldName)) {
                    deserializedStringWrapper.empty = reader.getString();
                } else if ("null".equals(fieldName)) {
                    deserializedStringWrapper.nullProperty = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedStringWrapper;
        });
    }
}
