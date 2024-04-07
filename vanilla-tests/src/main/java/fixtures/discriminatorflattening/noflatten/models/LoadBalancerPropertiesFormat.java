// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package fixtures.discriminatorflattening.noflatten.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Properties of the load balancer.
 */
@Fluent
public final class LoadBalancerPropertiesFormat implements JsonSerializable<LoadBalancerPropertiesFormat> {
    /*
     * Collection of backend address pools used by a load balancer.
     */
    private List<BackendAddressPool> backendAddressPools;

    /**
     * Creates an instance of LoadBalancerPropertiesFormat class.
     */
    public LoadBalancerPropertiesFormat() {
    }

    /**
     * Get the backendAddressPools property: Collection of backend address pools used by a load balancer.
     * 
     * @return the backendAddressPools value.
     */
    public List<BackendAddressPool> getBackendAddressPools() {
        return this.backendAddressPools;
    }

    /**
     * Set the backendAddressPools property: Collection of backend address pools used by a load balancer.
     * 
     * @param backendAddressPools the backendAddressPools value to set.
     * @return the LoadBalancerPropertiesFormat object itself.
     */
    public LoadBalancerPropertiesFormat setBackendAddressPools(List<BackendAddressPool> backendAddressPools) {
        this.backendAddressPools = backendAddressPools;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (getBackendAddressPools() != null) {
            getBackendAddressPools().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("backendAddressPools", this.backendAddressPools,
            (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of LoadBalancerPropertiesFormat from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of LoadBalancerPropertiesFormat if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the LoadBalancerPropertiesFormat.
     */
    public static LoadBalancerPropertiesFormat fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            LoadBalancerPropertiesFormat deserializedLoadBalancerPropertiesFormat = new LoadBalancerPropertiesFormat();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("backendAddressPools".equals(fieldName)) {
                    List<BackendAddressPool> backendAddressPools
                        = reader.readArray(reader1 -> BackendAddressPool.fromJson(reader1));
                    deserializedLoadBalancerPropertiesFormat.backendAddressPools = backendAddressPools;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedLoadBalancerPropertiesFormat;
        });
    }
}
