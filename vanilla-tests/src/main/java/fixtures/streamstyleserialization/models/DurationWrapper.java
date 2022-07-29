// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package fixtures.streamstyleserialization.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.time.Duration;

/** The DurationWrapper model. */
@Fluent
public final class DurationWrapper implements JsonSerializable<DurationWrapper> {
    /*
     * The field property.
     */
    private Duration field;

    /**
     * Get the field property: The field property.
     *
     * @return the field value.
     */
    public Duration getField() {
        return this.field;
    }

    /**
     * Set the field property: The field property.
     *
     * @param field the field value to set.
     * @return the DurationWrapper object itself.
     */
    public DurationWrapper setField(Duration field) {
        this.field = field;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {}

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("field", this.field == null ? null : this.field.toString(), false);
        return jsonWriter.writeEndObject().flush();
    }

    /**
     * Reads an instance of DurationWrapper from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of DurationWrapper if the JsonReader was pointing to an instance of it, or null if it was
     *     pointing to JSON null.
     */
    public static DurationWrapper fromJson(JsonReader jsonReader) {
        return jsonReader.readObject(
                reader -> {
                    Duration field = null;
                    while (reader.nextToken() != JsonToken.END_OBJECT) {
                        String fieldName = reader.getFieldName();
                        reader.nextToken();

                        if ("field".equals(fieldName)) {
                            field = reader.getNullableValue(r -> Duration.parse(reader.getStringValue()));
                        } else {
                            reader.skipChildren();
                        }
                    }
                    DurationWrapper deserializedValue = new DurationWrapper();
                    deserializedValue.field = field;

                    return deserializedValue;
                });
    }
}
