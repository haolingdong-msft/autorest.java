// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package fixtures.streamstylexmlserialization.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;
import com.azure.xml.XmlReader;
import com.azure.xml.XmlSerializable;
import com.azure.xml.XmlToken;
import com.azure.xml.XmlWriter;
import java.util.ArrayList;
import java.util.List;
import javax.xml.namespace.QName;
import javax.xml.stream.XMLStreamException;

/**
 * The Blobs model.
 */
@Fluent
public final class Blobs implements XmlSerializable<Blobs> {
    /*
     * The BlobPrefix property.
     */
    private List<BlobPrefix> blobPrefix = new ArrayList<>();

    /*
     * The Blob property.
     */
    private List<Blob> blob = new ArrayList<>();

    /**
     * Creates an instance of Blobs class.
     */
    public Blobs() {
    }

    /**
     * Get the blobPrefix property: The BlobPrefix property.
     * 
     * @return the blobPrefix value.
     */
    public List<BlobPrefix> getBlobPrefix() {
        return this.blobPrefix;
    }

    /**
     * Set the blobPrefix property: The BlobPrefix property.
     * 
     * @param blobPrefix the blobPrefix value to set.
     * @return the Blobs object itself.
     */
    public Blobs setBlobPrefix(List<BlobPrefix> blobPrefix) {
        this.blobPrefix = blobPrefix;
        return this;
    }

    /**
     * Get the blob property: The Blob property.
     * 
     * @return the blob value.
     */
    public List<Blob> getBlob() {
        return this.blob;
    }

    /**
     * Set the blob property: The Blob property.
     * 
     * @param blob the blob value to set.
     * @return the Blobs object itself.
     */
    public Blobs setBlob(List<Blob> blob) {
        this.blob = blob;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (getBlobPrefix() != null) {
            getBlobPrefix().forEach(e -> e.validate());
        }
        if (getBlob() != null) {
            getBlob().forEach(e -> e.validate());
        }
    }

    @Override
    public XmlWriter toXml(XmlWriter xmlWriter) throws XMLStreamException {
        return toXml(xmlWriter, null);
    }

    @Override
    public XmlWriter toXml(XmlWriter xmlWriter, String rootElementName) throws XMLStreamException {
        rootElementName = CoreUtils.isNullOrEmpty(rootElementName) ? "Blobs" : rootElementName;
        xmlWriter.writeStartElement(rootElementName);
        if (this.blobPrefix != null) {
            for (BlobPrefix element : this.blobPrefix) {
                xmlWriter.writeXml(element, "BlobPrefix");
            }
        }
        if (this.blob != null) {
            for (Blob element : this.blob) {
                xmlWriter.writeXml(element, "Blob");
            }
        }
        return xmlWriter.writeEndElement();
    }

    /**
     * Reads an instance of Blobs from the XmlReader.
     * 
     * @param xmlReader The XmlReader being read.
     * @return An instance of Blobs if the XmlReader was pointing to an instance of it, or null if it was pointing to XML null.
     * @throws XMLStreamException If an error occurs while reading the Blobs.
     */
    public static Blobs fromXml(XmlReader xmlReader) throws XMLStreamException {
        return fromXml(xmlReader, null);
    }

    /**
     * Reads an instance of Blobs from the XmlReader.
     * 
     * @param xmlReader The XmlReader being read.
     * @param rootElementName Optional root element name to override the default defined by the model. Used to support cases where the model can deserialize from different root element names.
     * @return An instance of Blobs if the XmlReader was pointing to an instance of it, or null if it was pointing to XML null.
     * @throws XMLStreamException If an error occurs while reading the Blobs.
     */
    public static Blobs fromXml(XmlReader xmlReader, String rootElementName) throws XMLStreamException {
        String finalRootElementName = CoreUtils.isNullOrEmpty(rootElementName) ? "Blobs" : rootElementName;
        return xmlReader.readObject(finalRootElementName, reader -> {
            Blobs deserializedBlobs = new Blobs();
            while (reader.nextElement() != XmlToken.END_ELEMENT) {
                QName elementName = reader.getElementName();

                if ("BlobPrefix".equals(elementName.getLocalPart())) {
                    deserializedBlobs.blobPrefix.add(BlobPrefix.fromXml(reader, "BlobPrefix"));
                } else if ("Blob".equals(elementName.getLocalPart())) {
                    deserializedBlobs.blob.add(Blob.fromXml(reader, "Blob"));
                } else {
                    reader.skipElement();
                }
            }

            return deserializedBlobs;
        });
    }
}
