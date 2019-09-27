package com.azure.autorest.model.codemodelfour;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * custom extensible metadata for individual protocols (ie, HTTP, etc)
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "http",
    "amqp",
    "mqtt",
    "jsonrpc"
})
public class Protocols {

    @JsonProperty("http")
    private Protocol http;
    @JsonProperty("amqp")
    private Protocol amqp;
    @JsonProperty("mqtt")
    private Protocol mqtt;
    @JsonProperty("jsonrpc")
    private Protocol jsonrpc;

    @JsonProperty("http")
    public Protocol getHttp() {
        return http;
    }

    @JsonProperty("http")
    public void setHttp(Protocol http) {
        this.http = http;
    }

    @JsonProperty("amqp")
    public Protocol getAmqp() {
        return amqp;
    }

    @JsonProperty("amqp")
    public void setAmqp(Protocol amqp) {
        this.amqp = amqp;
    }

    @JsonProperty("mqtt")
    public Protocol getMqtt() {
        return mqtt;
    }

    @JsonProperty("mqtt")
    public void setMqtt(Protocol mqtt) {
        this.mqtt = mqtt;
    }

    @JsonProperty("jsonrpc")
    public Protocol getJsonrpc() {
        return jsonrpc;
    }

    @JsonProperty("jsonrpc")
    public void setJsonrpc(Protocol jsonrpc) {
        this.jsonrpc = jsonrpc;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Protocols.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("http");
        sb.append('=');
        sb.append(((this.http == null)?"<null>":this.http));
        sb.append(',');
        sb.append("amqp");
        sb.append('=');
        sb.append(((this.amqp == null)?"<null>":this.amqp));
        sb.append(',');
        sb.append("mqtt");
        sb.append('=');
        sb.append(((this.mqtt == null)?"<null>":this.mqtt));
        sb.append(',');
        sb.append("jsonrpc");
        sb.append('=');
        sb.append(((this.jsonrpc == null)?"<null>":this.jsonrpc));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.http == null)? 0 :this.http.hashCode()));
        result = ((result* 31)+((this.jsonrpc == null)? 0 :this.jsonrpc.hashCode()));
        result = ((result* 31)+((this.amqp == null)? 0 :this.amqp.hashCode()));
        result = ((result* 31)+((this.mqtt == null)? 0 :this.mqtt.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Protocols) == false) {
            return false;
        }
        Protocols rhs = ((Protocols) other);
        return (((((this.http == rhs.http)||((this.http!= null)&&this.http.equals(rhs.http)))&&((this.jsonrpc == rhs.jsonrpc)||((this.jsonrpc!= null)&&this.jsonrpc.equals(rhs.jsonrpc))))&&((this.amqp == rhs.amqp)||((this.amqp!= null)&&this.amqp.equals(rhs.amqp))))&&((this.mqtt == rhs.mqtt)||((this.mqtt!= null)&&this.mqtt.equals(rhs.mqtt))));
    }

}
