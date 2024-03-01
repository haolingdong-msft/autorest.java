// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package fixtures.xmlservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;
import com.azure.xml.XmlReader;
import com.azure.xml.XmlSerializable;
import com.azure.xml.XmlToken;
import com.azure.xml.XmlWriter;
import javax.xml.namespace.QName;
import javax.xml.stream.XMLStreamException;

/**
 * I am a complex type with no XML node.
 */
@Fluent
public final class ComplexTypeNoMeta implements XmlSerializable<ComplexTypeNoMeta> {
    /*
     * The id of the res
     */
    private String id;

    /**
     * Creates an instance of ComplexTypeNoMeta class.
     */
    public ComplexTypeNoMeta() {
    }

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
    public void validate() {
    }

    @Override
    public XmlWriter toXml(XmlWriter xmlWriter) throws XMLStreamException {
        return toXml(xmlWriter, null);
    }

    @Override
    public XmlWriter toXml(XmlWriter xmlWriter, String rootElementName) throws XMLStreamException {
        rootElementName = CoreUtils.isNullOrEmpty(rootElementName) ? "ComplexTypeNoMeta" : rootElementName;
        xmlWriter.writeStartElement(rootElementName);
        xmlWriter.writeStringElement("ID", this.id);
        return xmlWriter.writeEndElement();
    }

    /**
     * Reads an instance of ComplexTypeNoMeta from the XmlReader.
     * 
     * @param xmlReader The XmlReader being read.
     * @return An instance of ComplexTypeNoMeta if the XmlReader was pointing to an instance of it, or null if it was pointing to XML null.
     * @throws XMLStreamException If an error occurs while reading the ComplexTypeNoMeta.
     */
    public static ComplexTypeNoMeta fromXml(XmlReader xmlReader) throws XMLStreamException {
        return fromXml(xmlReader, null);
    }

    /**
     * Reads an instance of ComplexTypeNoMeta from the XmlReader.
     * 
     * @param xmlReader The XmlReader being read.
     * @param rootElementName Optional root element name to override the default defined by the model. Used to support cases where the model can deserialize from different root element names.
     * @return An instance of ComplexTypeNoMeta if the XmlReader was pointing to an instance of it, or null if it was pointing to XML null.
     * @throws XMLStreamException If an error occurs while reading the ComplexTypeNoMeta.
     */
    public static ComplexTypeNoMeta fromXml(XmlReader xmlReader, String rootElementName) throws XMLStreamException {
        String finalRootElementName = CoreUtils.isNullOrEmpty(rootElementName) ? "ComplexTypeNoMeta" : rootElementName;
        return xmlReader.readObject(finalRootElementName, reader -> {
            ComplexTypeNoMeta deserializedComplexTypeNoMeta = new ComplexTypeNoMeta();
            while (reader.nextElement() != XmlToken.END_ELEMENT) {
                QName elementName = reader.getElementName();

                if ("ID".equals(elementName.getLocalPart())) {
                    deserializedComplexTypeNoMeta.id = reader.getStringElement();
                } else {
                    reader.skipElement();
                }
            }

            return deserializedComplexTypeNoMeta;
        });
    }
}
