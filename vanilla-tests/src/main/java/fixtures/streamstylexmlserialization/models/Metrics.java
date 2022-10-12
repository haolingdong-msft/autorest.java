// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package fixtures.streamstylexmlserialization.models;

import com.azure.core.annotation.Fluent;
import com.azure.xml.XmlReader;
import com.azure.xml.XmlSerializable;
import com.azure.xml.XmlToken;
import com.azure.xml.XmlWriter;
import javax.xml.namespace.QName;
import javax.xml.stream.XMLStreamException;

/** The Metrics model. */
@Fluent
public final class Metrics implements XmlSerializable<Metrics> {
    /*
     * The version of Storage Analytics to configure.
     */
    private String version;

    /*
     * Indicates whether metrics are enabled for the Blob service.
     */
    private boolean enabled;

    /*
     * Indicates whether metrics should generate summary statistics for called API operations.
     */
    private Boolean includeAPIs;

    /*
     * the retention policy
     */
    private RetentionPolicy retentionPolicy;

    /** Creates an instance of Metrics class. */
    public Metrics() {}

    /**
     * Get the version property: The version of Storage Analytics to configure.
     *
     * @return the version value.
     */
    public String getVersion() {
        return this.version;
    }

    /**
     * Set the version property: The version of Storage Analytics to configure.
     *
     * @param version the version value to set.
     * @return the Metrics object itself.
     */
    public Metrics setVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * Get the enabled property: Indicates whether metrics are enabled for the Blob service.
     *
     * @return the enabled value.
     */
    public boolean isEnabled() {
        return this.enabled;
    }

    /**
     * Set the enabled property: Indicates whether metrics are enabled for the Blob service.
     *
     * @param enabled the enabled value to set.
     * @return the Metrics object itself.
     */
    public Metrics setEnabled(boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get the includeAPIs property: Indicates whether metrics should generate summary statistics for called API
     * operations.
     *
     * @return the includeAPIs value.
     */
    public Boolean isIncludeAPIs() {
        return this.includeAPIs;
    }

    /**
     * Set the includeAPIs property: Indicates whether metrics should generate summary statistics for called API
     * operations.
     *
     * @param includeAPIs the includeAPIs value to set.
     * @return the Metrics object itself.
     */
    public Metrics setIncludeAPIs(Boolean includeAPIs) {
        this.includeAPIs = includeAPIs;
        return this;
    }

    /**
     * Get the retentionPolicy property: the retention policy.
     *
     * @return the retentionPolicy value.
     */
    public RetentionPolicy getRetentionPolicy() {
        return this.retentionPolicy;
    }

    /**
     * Set the retentionPolicy property: the retention policy.
     *
     * @param retentionPolicy the retentionPolicy value to set.
     * @return the Metrics object itself.
     */
    public Metrics setRetentionPolicy(RetentionPolicy retentionPolicy) {
        this.retentionPolicy = retentionPolicy;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (getRetentionPolicy() != null) {
            getRetentionPolicy().validate();
        }
    }

    @Override
    public XmlWriter toXml(XmlWriter xmlWriter) throws XMLStreamException {
        xmlWriter.writeStartElement("Metrics");
        xmlWriter.writeStringElement("Version", this.version);
        xmlWriter.writeBooleanElement("Enabled", this.enabled);
        xmlWriter.writeBooleanElement("IncludeAPIs", this.includeAPIs);
        xmlWriter.writeXml(this.retentionPolicy);
        return xmlWriter.writeEndElement();
    }

    /**
     * Reads an instance of Metrics from the XmlReader.
     *
     * @param xmlReader The XmlReader being read.
     * @return An instance of Metrics if the XmlReader was pointing to an instance of it, or null if it was pointing to
     *     XML null.
     */
    public static Metrics fromXml(XmlReader xmlReader) throws XMLStreamException {
        return xmlReader.readObject(
                "Metrics",
                reader -> {
                    String version = null;
                    boolean enabled = false;
                    Boolean includeAPIs = null;
                    RetentionPolicy retentionPolicy = null;
                    while (reader.nextElement() != XmlToken.END_ELEMENT) {
                        QName fieldName = reader.getElementName();

                        if ("Version".equals(fieldName.getLocalPart())) {
                            version = reader.getStringElement();
                        } else if ("Enabled".equals(fieldName.getLocalPart())) {
                            enabled = reader.getBooleanElement();
                        } else if ("IncludeAPIs".equals(fieldName.getLocalPart())) {
                            includeAPIs = reader.getNullableElement(Boolean::parseBoolean);
                        } else if ("RetentionPolicy".equals(fieldName.getLocalPart())) {
                            retentionPolicy = RetentionPolicy.fromXml(reader);
                        } else {
                            reader.skipElement();
                        }
                    }
                    Metrics deserializedValue = new Metrics();
                    deserializedValue.version = version;
                    deserializedValue.enabled = enabled;
                    deserializedValue.includeAPIs = includeAPIs;
                    deserializedValue.retentionPolicy = retentionPolicy;

                    return deserializedValue;
                });
    }
}
