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

/** I am a complex type with no XML node. */
@Fluent
public final class ComplexTypeNoMeta implements XmlSerializable<ComplexTypeNoMeta> {
    /*
     * The id of the res
     */
    private String id;

    /** Creates an instance of ComplexTypeNoMeta class. */
    public ComplexTypeNoMeta() {}

    /**
     * Get the id property: The id of the res.
     *
     * @return the id value.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Set the id property: The id of the res.
     *
     * @param id the id value to set.
     * @return the ComplexTypeNoMeta object itself.
     */
    public ComplexTypeNoMeta setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {}

    @Override
    public XmlWriter toXml(XmlWriter xmlWriter) throws XMLStreamException {
        xmlWriter.writeStartElement("ComplexTypeNoMeta");
        xmlWriter.writeStringElement("ID", this.id);
        return xmlWriter.writeEndElement();
    }

    /**
     * Reads an instance of ComplexTypeNoMeta from the XmlReader.
     *
     * @param xmlReader The XmlReader being read.
     * @return An instance of ComplexTypeNoMeta if the XmlReader was pointing to an instance of it, or null if it was
     *     pointing to XML null.
     */
    public static ComplexTypeNoMeta fromXml(XmlReader xmlReader) throws XMLStreamException {
        return xmlReader.readObject(
                "ComplexTypeNoMeta",
                reader -> {
                    String id = null;
                    while (reader.nextElement() != XmlToken.END_ELEMENT) {
                        QName fieldName = reader.getElementName();

                        if ("ID".equals(fieldName.getLocalPart())) {
                            id = reader.getStringElement();
                        } else {
                            reader.skipElement();
                        }
                    }
                    ComplexTypeNoMeta deserializedValue = new ComplexTypeNoMeta();
                    deserializedValue.id = id;

                    return deserializedValue;
                });
    }
}
