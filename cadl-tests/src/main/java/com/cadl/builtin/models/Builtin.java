// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.cadl.builtin.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.CoreUtils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.Duration;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

/** The Builtin model. */
@Immutable
public final class Builtin {
    /*
     * The formatString property.
     */
    @JsonProperty(value = "formatString", required = true)
    private FormatString formatString;

    /*
     * The boolean property.
     */
    @JsonProperty(value = "boolean", required = true)
    private boolean booleanProperty;

    /*
     * The string property.
     */
    @JsonProperty(value = "string", required = true)
    private String string;

    /*
     * The bytes property.
     */
    @JsonProperty(value = "bytes", required = true)
    private byte[] bytes;

    /*
     * The int property.
     */
    @JsonProperty(value = "int", required = true)
    private int intProperty;

    /*
     * The safeint property.
     */
    @JsonProperty(value = "safeint", required = true)
    private long safeint;

    /*
     * The long property.
     */
    @JsonProperty(value = "long", required = true)
    private long longProperty;

    /*
     * The float property.
     */
    @JsonProperty(value = "float", required = true)
    private double floatProperty;

    /*
     * The double property.
     */
    @JsonProperty(value = "double", required = true)
    private double doubleProperty;

    /*
     * The duration property.
     */
    @JsonProperty(value = "duration", required = true)
    private Duration duration;

    /*
     * The dateTime property.
     */
    @JsonProperty(value = "dateTime", required = true)
    private OffsetDateTime dateTime;

    /*
     * The stringList property.
     */
    @JsonProperty(value = "stringList", required = true)
    private List<String> stringList;

    /*
     * The bytesDict property.
     */
    @JsonProperty(value = "bytesDict", required = true)
    private Map<String, byte[]> bytesDict;

    /*
     * The uri property.
     */
    @JsonProperty(value = "uri", required = true)
    private String uri;

    /**
     * Creates an instance of Builtin class.
     *
     * @param formatString the formatString value to set.
     * @param booleanProperty the booleanProperty value to set.
     * @param string the string value to set.
     * @param bytes the bytes value to set.
     * @param intProperty the intProperty value to set.
     * @param safeint the safeint value to set.
     * @param longProperty the longProperty value to set.
     * @param floatProperty the floatProperty value to set.
     * @param doubleProperty the doubleProperty value to set.
     * @param duration the duration value to set.
     * @param dateTime the dateTime value to set.
     * @param stringList the stringList value to set.
     * @param bytesDict the bytesDict value to set.
     * @param uri the uri value to set.
     */
    @JsonCreator
    private Builtin(
            @JsonProperty(value = "formatString", required = true) FormatString formatString,
            @JsonProperty(value = "boolean", required = true) boolean booleanProperty,
            @JsonProperty(value = "string", required = true) String string,
            @JsonProperty(value = "bytes", required = true) byte[] bytes,
            @JsonProperty(value = "int", required = true) int intProperty,
            @JsonProperty(value = "safeint", required = true) long safeint,
            @JsonProperty(value = "long", required = true) long longProperty,
            @JsonProperty(value = "float", required = true) double floatProperty,
            @JsonProperty(value = "double", required = true) double doubleProperty,
            @JsonProperty(value = "duration", required = true) Duration duration,
            @JsonProperty(value = "dateTime", required = true) OffsetDateTime dateTime,
            @JsonProperty(value = "stringList", required = true) List<String> stringList,
            @JsonProperty(value = "bytesDict", required = true) Map<String, byte[]> bytesDict,
            @JsonProperty(value = "uri", required = true) String uri) {
        this.formatString = formatString;
        this.booleanProperty = booleanProperty;
        this.string = string;
        this.bytes = bytes;
        this.intProperty = intProperty;
        this.safeint = safeint;
        this.longProperty = longProperty;
        this.floatProperty = floatProperty;
        this.doubleProperty = doubleProperty;
        this.duration = duration;
        this.dateTime = dateTime;
        this.stringList = stringList;
        this.bytesDict = bytesDict;
        this.uri = uri;
    }

    /**
     * Get the formatString property: The formatString property.
     *
     * @return the formatString value.
     */
    public FormatString getFormatString() {
        return this.formatString;
    }

    /**
     * Get the booleanProperty property: The boolean property.
     *
     * @return the booleanProperty value.
     */
    public boolean isBooleanProperty() {
        return this.booleanProperty;
    }

    /**
     * Get the string property: The string property.
     *
     * @return the string value.
     */
    public String getString() {
        return this.string;
    }

    /**
     * Get the bytes property: The bytes property.
     *
     * @return the bytes value.
     */
    public byte[] getBytes() {
        return CoreUtils.clone(this.bytes);
    }

    /**
     * Get the intProperty property: The int property.
     *
     * @return the intProperty value.
     */
    public int getIntProperty() {
        return this.intProperty;
    }

    /**
     * Get the safeint property: The safeint property.
     *
     * @return the safeint value.
     */
    public long getSafeint() {
        return this.safeint;
    }

    /**
     * Get the longProperty property: The long property.
     *
     * @return the longProperty value.
     */
    public long getLongProperty() {
        return this.longProperty;
    }

    /**
     * Get the floatProperty property: The float property.
     *
     * @return the floatProperty value.
     */
    public double getFloatProperty() {
        return this.floatProperty;
    }

    /**
     * Get the doubleProperty property: The double property.
     *
     * @return the doubleProperty value.
     */
    public double getDoubleProperty() {
        return this.doubleProperty;
    }

    /**
     * Get the duration property: The duration property.
     *
     * @return the duration value.
     */
    public Duration getDuration() {
        return this.duration;
    }

    /**
     * Get the dateTime property: The dateTime property.
     *
     * @return the dateTime value.
     */
    public OffsetDateTime getDateTime() {
        return this.dateTime;
    }

    /**
     * Get the stringList property: The stringList property.
     *
     * @return the stringList value.
     */
    public List<String> getStringList() {
        return this.stringList;
    }

    /**
     * Get the bytesDict property: The bytesDict property.
     *
     * @return the bytesDict value.
     */
    public Map<String, byte[]> getBytesDict() {
        return this.bytesDict;
    }

    /**
     * Get the uri property: The uri property.
     *
     * @return the uri value.
     */
    public String getUri() {
        return this.uri;
    }
}
