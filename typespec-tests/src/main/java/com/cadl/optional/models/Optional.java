// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.cadl.optional.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.Duration;
import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Map;

/**
 * The Optional model.
 */
@Fluent
public final class Optional implements JsonSerializable<Optional> {
    /*
     * The boolean property.
     */
    @Generated
    private Boolean booleanProperty;

    /*
     * The booleanNullable property.
     */
    @Generated
    private Boolean booleanNullable;

    /*
     * The booleanRequired property.
     */
    @Generated
    private final boolean booleanRequired;

    /*
     * The booleanRequiredNullable property.
     */
    @Generated
    private final Boolean booleanRequiredNullable;

    /*
     * The string property.
     */
    @Generated
    private String string;

    /*
     * The stringNullable property.
     */
    @Generated
    private String stringNullable;

    /*
     * The stringRequired property.
     */
    @Generated
    private final String stringRequired;

    /*
     * The stringRequiredNullable property.
     */
    @Generated
    private final String stringRequiredNullable;

    /*
     * The bytes property.
     */
    @Generated
    private byte[] bytes;

    /*
     * The int property.
     */
    @Generated
    private Integer intProperty;

    /*
     * The long property.
     */
    @Generated
    private Long longProperty;

    /*
     * The float property.
     */
    @Generated
    private Double floatProperty;

    /*
     * The double property.
     */
    @Generated
    private Double doubleProperty;

    /*
     * The duration property.
     */
    @Generated
    private Duration duration;

    /*
     * The dateTime property.
     */
    @Generated
    private OffsetDateTime dateTime;

    /*
     * The stringList property.
     */
    @Generated
    private List<String> stringList;

    /*
     * The bytesDict property.
     */
    @Generated
    private Map<String, byte[]> bytesDict;

    /*
     * The epochDateTimeRequiredNullable property.
     */
    @Generated
    private final Long epochDateTimeRequiredNullable;

    /*
     * The epochDateTimeNullable property.
     */
    @Generated
    private Long epochDateTimeNullable;

    /**
     * Creates an instance of Optional class.
     * 
     * @param booleanRequired the booleanRequired value to set.
     * @param booleanRequiredNullable the booleanRequiredNullable value to set.
     * @param stringRequired the stringRequired value to set.
     * @param stringRequiredNullable the stringRequiredNullable value to set.
     * @param epochDateTimeRequiredNullable the epochDateTimeRequiredNullable value to set.
     */
    @Generated
    public Optional(boolean booleanRequired, Boolean booleanRequiredNullable, String stringRequired,
        String stringRequiredNullable, OffsetDateTime epochDateTimeRequiredNullable) {
        this.booleanRequired = booleanRequired;
        this.booleanRequiredNullable = booleanRequiredNullable;
        this.stringRequired = stringRequired;
        this.stringRequiredNullable = stringRequiredNullable;
        if (epochDateTimeRequiredNullable == null) {
            this.epochDateTimeRequiredNullable = null;
        } else {
            this.epochDateTimeRequiredNullable = epochDateTimeRequiredNullable.toEpochSecond();
        }
    }

    /**
     * Get the booleanProperty property: The boolean property.
     * 
     * @return the booleanProperty value.
     */
    @Generated
    public Boolean isBooleanProperty() {
        return this.booleanProperty;
    }

    /**
     * Set the booleanProperty property: The boolean property.
     * 
     * @param booleanProperty the booleanProperty value to set.
     * @return the Optional object itself.
     */
    @Generated
    public Optional setBooleanProperty(Boolean booleanProperty) {
        this.booleanProperty = booleanProperty;
        return this;
    }

    /**
     * Get the booleanNullable property: The booleanNullable property.
     * 
     * @return the booleanNullable value.
     */
    @Generated
    public Boolean isBooleanNullable() {
        return this.booleanNullable;
    }

    /**
     * Set the booleanNullable property: The booleanNullable property.
     * 
     * @param booleanNullable the booleanNullable value to set.
     * @return the Optional object itself.
     */
    @Generated
    public Optional setBooleanNullable(Boolean booleanNullable) {
        this.booleanNullable = booleanNullable;
        return this;
    }

    /**
     * Get the booleanRequired property: The booleanRequired property.
     * 
     * @return the booleanRequired value.
     */
    @Generated
    public boolean isBooleanRequired() {
        return this.booleanRequired;
    }

    /**
     * Get the booleanRequiredNullable property: The booleanRequiredNullable property.
     * 
     * @return the booleanRequiredNullable value.
     */
    @Generated
    public Boolean isBooleanRequiredNullable() {
        return this.booleanRequiredNullable;
    }

    /**
     * Get the string property: The string property.
     * 
     * @return the string value.
     */
    @Generated
    public String getString() {
        return this.string;
    }

    /**
     * Set the string property: The string property.
     * 
     * @param string the string value to set.
     * @return the Optional object itself.
     */
    @Generated
    public Optional setString(String string) {
        this.string = string;
        return this;
    }

    /**
     * Get the stringNullable property: The stringNullable property.
     * 
     * @return the stringNullable value.
     */
    @Generated
    public String getStringNullable() {
        return this.stringNullable;
    }

    /**
     * Set the stringNullable property: The stringNullable property.
     * 
     * @param stringNullable the stringNullable value to set.
     * @return the Optional object itself.
     */
    @Generated
    public Optional setStringNullable(String stringNullable) {
        this.stringNullable = stringNullable;
        return this;
    }

    /**
     * Get the stringRequired property: The stringRequired property.
     * 
     * @return the stringRequired value.
     */
    @Generated
    public String getStringRequired() {
        return this.stringRequired;
    }

    /**
     * Get the stringRequiredNullable property: The stringRequiredNullable property.
     * 
     * @return the stringRequiredNullable value.
     */
    @Generated
    public String getStringRequiredNullable() {
        return this.stringRequiredNullable;
    }

    /**
     * Get the bytes property: The bytes property.
     * 
     * @return the bytes value.
     */
    @Generated
    public byte[] getBytes() {
        return CoreUtils.clone(this.bytes);
    }

    /**
     * Set the bytes property: The bytes property.
     * 
     * @param bytes the bytes value to set.
     * @return the Optional object itself.
     */
    @Generated
    public Optional setBytes(byte[] bytes) {
        this.bytes = CoreUtils.clone(bytes);
        return this;
    }

    /**
     * Get the intProperty property: The int property.
     * 
     * @return the intProperty value.
     */
    @Generated
    public Integer getIntProperty() {
        return this.intProperty;
    }

    /**
     * Set the intProperty property: The int property.
     * 
     * @param intProperty the intProperty value to set.
     * @return the Optional object itself.
     */
    @Generated
    public Optional setIntProperty(Integer intProperty) {
        this.intProperty = intProperty;
        return this;
    }

    /**
     * Get the longProperty property: The long property.
     * 
     * @return the longProperty value.
     */
    @Generated
    public Long getLongProperty() {
        return this.longProperty;
    }

    /**
     * Set the longProperty property: The long property.
     * 
     * @param longProperty the longProperty value to set.
     * @return the Optional object itself.
     */
    @Generated
    public Optional setLongProperty(Long longProperty) {
        this.longProperty = longProperty;
        return this;
    }

    /**
     * Get the floatProperty property: The float property.
     * 
     * @return the floatProperty value.
     */
    @Generated
    public Double getFloatProperty() {
        return this.floatProperty;
    }

    /**
     * Set the floatProperty property: The float property.
     * 
     * @param floatProperty the floatProperty value to set.
     * @return the Optional object itself.
     */
    @Generated
    public Optional setFloatProperty(Double floatProperty) {
        this.floatProperty = floatProperty;
        return this;
    }

    /**
     * Get the doubleProperty property: The double property.
     * 
     * @return the doubleProperty value.
     */
    @Generated
    public Double getDoubleProperty() {
        return this.doubleProperty;
    }

    /**
     * Set the doubleProperty property: The double property.
     * 
     * @param doubleProperty the doubleProperty value to set.
     * @return the Optional object itself.
     */
    @Generated
    public Optional setDoubleProperty(Double doubleProperty) {
        this.doubleProperty = doubleProperty;
        return this;
    }

    /**
     * Get the duration property: The duration property.
     * 
     * @return the duration value.
     */
    @Generated
    public Duration getDuration() {
        return this.duration;
    }

    /**
     * Set the duration property: The duration property.
     * 
     * @param duration the duration value to set.
     * @return the Optional object itself.
     */
    @Generated
    public Optional setDuration(Duration duration) {
        this.duration = duration;
        return this;
    }

    /**
     * Get the dateTime property: The dateTime property.
     * 
     * @return the dateTime value.
     */
    @Generated
    public OffsetDateTime getDateTime() {
        return this.dateTime;
    }

    /**
     * Set the dateTime property: The dateTime property.
     * 
     * @param dateTime the dateTime value to set.
     * @return the Optional object itself.
     */
    @Generated
    public Optional setDateTime(OffsetDateTime dateTime) {
        this.dateTime = dateTime;
        return this;
    }

    /**
     * Get the stringList property: The stringList property.
     * 
     * @return the stringList value.
     */
    @Generated
    public List<String> getStringList() {
        return this.stringList;
    }

    /**
     * Set the stringList property: The stringList property.
     * 
     * @param stringList the stringList value to set.
     * @return the Optional object itself.
     */
    @Generated
    public Optional setStringList(List<String> stringList) {
        this.stringList = stringList;
        return this;
    }

    /**
     * Get the bytesDict property: The bytesDict property.
     * 
     * @return the bytesDict value.
     */
    @Generated
    public Map<String, byte[]> getBytesDict() {
        return this.bytesDict;
    }

    /**
     * Set the bytesDict property: The bytesDict property.
     * 
     * @param bytesDict the bytesDict value to set.
     * @return the Optional object itself.
     */
    @Generated
    public Optional setBytesDict(Map<String, byte[]> bytesDict) {
        this.bytesDict = bytesDict;
        return this;
    }

    /**
     * Get the epochDateTimeRequiredNullable property: The epochDateTimeRequiredNullable property.
     * 
     * @return the epochDateTimeRequiredNullable value.
     */
    @Generated
    public OffsetDateTime getEpochDateTimeRequiredNullable() {
        if (this.epochDateTimeRequiredNullable == null) {
            return null;
        }
        return OffsetDateTime.ofInstant(Instant.ofEpochSecond(this.epochDateTimeRequiredNullable), ZoneOffset.UTC);
    }

    /**
     * Get the epochDateTimeNullable property: The epochDateTimeNullable property.
     * 
     * @return the epochDateTimeNullable value.
     */
    @Generated
    public OffsetDateTime getEpochDateTimeNullable() {
        if (this.epochDateTimeNullable == null) {
            return null;
        }
        return OffsetDateTime.ofInstant(Instant.ofEpochSecond(this.epochDateTimeNullable), ZoneOffset.UTC);
    }

    /**
     * Set the epochDateTimeNullable property: The epochDateTimeNullable property.
     * 
     * @param epochDateTimeNullable the epochDateTimeNullable value to set.
     * @return the Optional object itself.
     */
    @Generated
    public Optional setEpochDateTimeNullable(OffsetDateTime epochDateTimeNullable) {
        if (epochDateTimeNullable == null) {
            this.epochDateTimeNullable = null;
        } else {
            this.epochDateTimeNullable = epochDateTimeNullable.toEpochSecond();
        }
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeBooleanField("booleanRequired", this.booleanRequired);
        jsonWriter.writeBooleanField("booleanRequiredNullable", this.booleanRequiredNullable);
        jsonWriter.writeStringField("stringRequired", this.stringRequired);
        jsonWriter.writeStringField("stringRequiredNullable", this.stringRequiredNullable);
        jsonWriter.writeNumberField("epochDateTimeRequiredNullable", this.epochDateTimeRequiredNullable);
        jsonWriter.writeBooleanField("boolean", this.booleanProperty);
        jsonWriter.writeBooleanField("booleanNullable", this.booleanNullable);
        jsonWriter.writeStringField("string", this.string);
        jsonWriter.writeStringField("stringNullable", this.stringNullable);
        jsonWriter.writeBinaryField("bytes", this.bytes);
        jsonWriter.writeNumberField("int", this.intProperty);
        jsonWriter.writeNumberField("long", this.longProperty);
        jsonWriter.writeNumberField("float", this.floatProperty);
        jsonWriter.writeNumberField("double", this.doubleProperty);
        jsonWriter.writeStringField("duration", CoreUtils.durationToStringWithDays(this.duration));
        jsonWriter.writeStringField("dateTime",
            this.dateTime == null ? null : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.dateTime));
        jsonWriter.writeArrayField("stringList", this.stringList, (writer, element) -> writer.writeString(element));
        jsonWriter.writeMapField("bytesDict", this.bytesDict, (writer, element) -> writer.writeBinary(element));
        jsonWriter.writeNumberField("epochDateTimeNullable", this.epochDateTimeNullable);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of Optional from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of Optional if the JsonReader was pointing to an instance of it, or null if it was pointing
     * to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the Optional.
     */
    @Generated
    public static Optional fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            boolean booleanRequired = false;
            Boolean booleanRequiredNullable = null;
            String stringRequired = null;
            String stringRequiredNullable = null;
            OffsetDateTime epochDateTimeRequiredNullable = null;
            Boolean booleanProperty = null;
            Boolean booleanNullable = null;
            String string = null;
            String stringNullable = null;
            byte[] bytes = null;
            Integer intProperty = null;
            Long longProperty = null;
            Double floatProperty = null;
            Double doubleProperty = null;
            Duration duration = null;
            OffsetDateTime dateTime = null;
            List<String> stringList = null;
            Map<String, byte[]> bytesDict = null;
            Long epochDateTimeNullable = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("booleanRequired".equals(fieldName)) {
                    booleanRequired = reader.getBoolean();
                } else if ("booleanRequiredNullable".equals(fieldName)) {
                    booleanRequiredNullable = reader.getNullable(JsonReader::getBoolean);
                } else if ("stringRequired".equals(fieldName)) {
                    stringRequired = reader.getString();
                } else if ("stringRequiredNullable".equals(fieldName)) {
                    stringRequiredNullable = reader.getString();
                } else if ("epochDateTimeRequiredNullable".equals(fieldName)) {
                    Long epochDateTimeRequiredNullableHolder = reader.getNullable(JsonReader::getLong);
                    if (epochDateTimeRequiredNullableHolder != null) {
                        epochDateTimeRequiredNullable = OffsetDateTime
                            .ofInstant(Instant.ofEpochSecond(epochDateTimeRequiredNullableHolder), ZoneOffset.UTC);
                    }
                } else if ("boolean".equals(fieldName)) {
                    booleanProperty = reader.getNullable(JsonReader::getBoolean);
                } else if ("booleanNullable".equals(fieldName)) {
                    booleanNullable = reader.getNullable(JsonReader::getBoolean);
                } else if ("string".equals(fieldName)) {
                    string = reader.getString();
                } else if ("stringNullable".equals(fieldName)) {
                    stringNullable = reader.getString();
                } else if ("bytes".equals(fieldName)) {
                    bytes = reader.getBinary();
                } else if ("int".equals(fieldName)) {
                    intProperty = reader.getNullable(JsonReader::getInt);
                } else if ("long".equals(fieldName)) {
                    longProperty = reader.getNullable(JsonReader::getLong);
                } else if ("float".equals(fieldName)) {
                    floatProperty = reader.getNullable(JsonReader::getDouble);
                } else if ("double".equals(fieldName)) {
                    doubleProperty = reader.getNullable(JsonReader::getDouble);
                } else if ("duration".equals(fieldName)) {
                    duration = reader.getNullable(nonNullReader -> Duration.parse(nonNullReader.getString()));
                } else if ("dateTime".equals(fieldName)) {
                    dateTime = reader.getNullable(nonNullReader -> OffsetDateTime.parse(nonNullReader.getString()));
                } else if ("stringList".equals(fieldName)) {
                    stringList = reader.readArray(reader1 -> reader1.getString());
                } else if ("bytesDict".equals(fieldName)) {
                    bytesDict = reader.readMap(reader1 -> reader1.getBinary());
                } else if ("epochDateTimeNullable".equals(fieldName)) {
                    epochDateTimeNullable = reader.getNullable(JsonReader::getLong);
                } else {
                    reader.skipChildren();
                }
            }
            Optional deserializedOptional = new Optional(booleanRequired, booleanRequiredNullable, stringRequired,
                stringRequiredNullable, epochDateTimeRequiredNullable);
            deserializedOptional.booleanProperty = booleanProperty;
            deserializedOptional.booleanNullable = booleanNullable;
            deserializedOptional.string = string;
            deserializedOptional.stringNullable = stringNullable;
            deserializedOptional.bytes = bytes;
            deserializedOptional.intProperty = intProperty;
            deserializedOptional.longProperty = longProperty;
            deserializedOptional.floatProperty = floatProperty;
            deserializedOptional.doubleProperty = doubleProperty;
            deserializedOptional.duration = duration;
            deserializedOptional.dateTime = dateTime;
            deserializedOptional.stringList = stringList;
            deserializedOptional.bytesDict = bytesDict;
            deserializedOptional.epochDateTimeNullable = epochDateTimeNullable;

            return deserializedOptional;
        });
    }
}
