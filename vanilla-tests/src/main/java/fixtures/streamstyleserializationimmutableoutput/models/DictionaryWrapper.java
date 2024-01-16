// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package fixtures.streamstyleserializationimmutableoutput.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.Map;

/**
 * <!-- start generated doc -->
 * The DictionaryWrapper model.
 * <!-- end generated doc -->
 */
@Fluent
public final class DictionaryWrapper implements JsonSerializable<DictionaryWrapper> {
    /*
     * Dictionary of <string>
     */
    private Map<String, String> defaultProgram;

    /**
     * Creates an instance of DictionaryWrapper class.
     */
    public DictionaryWrapper() {
    }

    /**
     * Get the defaultProgram property: Dictionary of &lt;string&gt;.
     * 
     * @return the defaultProgram value.
     */
    public Map<String, String> getDefaultProgram() {
        return this.defaultProgram;
    }

    /**
     * Set the defaultProgram property: Dictionary of &lt;string&gt;.
     * 
     * @param defaultProgram the defaultProgram value to set.
     * @return the DictionaryWrapper object itself.
     */
    public DictionaryWrapper setDefaultProgram(Map<String, String> defaultProgram) {
        this.defaultProgram = defaultProgram;
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
        jsonWriter.writeMapField("defaultProgram", this.defaultProgram,
            (writer, element) -> writer.writeString(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DictionaryWrapper from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of DictionaryWrapper if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the DictionaryWrapper.
     */
    public static DictionaryWrapper fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            DictionaryWrapper deserializedDictionaryWrapper = new DictionaryWrapper();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("defaultProgram".equals(fieldName)) {
                    Map<String, String> defaultProgram = reader.readMap(reader1 -> reader1.getString());
                    deserializedDictionaryWrapper.defaultProgram = defaultProgram;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedDictionaryWrapper;
        });
    }
}
