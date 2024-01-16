// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package fixtures.bodycomplex.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/**
 * <!-- start generated doc -->
 * The DatetimeWrapper model.
 * <!-- end generated doc -->
 */
@Fluent
public final class DatetimeWrapper {
    /*
     * The field property.
     */
    @JsonProperty(value = "field")
    private OffsetDateTime field;

    /*
     * The now property.
     */
    @JsonProperty(value = "now")
    private OffsetDateTime now;

    /**
     * Creates an instance of DatetimeWrapper class.
     */
    public DatetimeWrapper() {
    }

    /**
     * Get the field property: The field property.
     * 
     * @return the field value.
     */
    public OffsetDateTime getField() {
        return this.field;
    }

    /**
     * Set the field property: The field property.
     * 
     * @param field the field value to set.
     * @return the DatetimeWrapper object itself.
     */
    public DatetimeWrapper setField(OffsetDateTime field) {
        this.field = field;
        return this;
    }

    /**
     * Get the now property: The now property.
     * 
     * @return the now value.
     */
    public OffsetDateTime getNow() {
        return this.now;
    }

    /**
     * Set the now property: The now property.
     * 
     * @param now the now value to set.
     * @return the DatetimeWrapper object itself.
     */
    public DatetimeWrapper setNow(OffsetDateTime now) {
        this.now = now;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
