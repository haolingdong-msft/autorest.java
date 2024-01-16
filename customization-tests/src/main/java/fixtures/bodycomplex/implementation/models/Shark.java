// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package fixtures.bodycomplex.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.OffsetDateTime;
import java.util.List;

/**
 * <!-- start generated doc -->
 * The Shark model.
 * <!-- end generated doc -->
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "fishtype",
    defaultImpl = Shark.class)
@JsonTypeName("shark")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "sawshark", value = Sawshark.class),
    @JsonSubTypes.Type(name = "goblin", value = GoblinShark.class),
    @JsonSubTypes.Type(name = "cookiecuttershark", value = Cookiecuttershark.class) })
@Fluent
public class Shark extends Fish {
    /*
     * The age property.
     */
    @JsonProperty(value = "age")
    private Integer age;

    /*
     * The birthday property.
     */
    @JsonProperty(value = "birthday", required = true)
    private OffsetDateTime birthday;

    /**
     * Creates an instance of Shark class.
     */
    public Shark() {
    }

    /**
     * Get the age property: The age property.
     * 
     * @return the age value.
     */
    public Integer getAge() {
        return this.age;
    }

    /**
     * Set the age property: The age property.
     * 
     * @param age the age value to set.
     * @return the Shark object itself.
     */
    public Shark setAge(Integer age) {
        this.age = age;
        return this;
    }

    /**
     * Get the birthday property: The birthday property.
     * 
     * @return the birthday value.
     */
    public OffsetDateTime getBirthday() {
        return this.birthday;
    }

    /**
     * Set the birthday property: The birthday property.
     * 
     * @param birthday the birthday value to set.
     * @return the Shark object itself.
     */
    public Shark setBirthday(OffsetDateTime birthday) {
        this.birthday = birthday;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Shark setSpecies(String species) {
        super.setSpecies(species);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Shark setLength(float length) {
        super.setLength(length);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Shark setSiblings(List<Fish> siblings) {
        super.setSiblings(siblings);
        return this;
    }
}
