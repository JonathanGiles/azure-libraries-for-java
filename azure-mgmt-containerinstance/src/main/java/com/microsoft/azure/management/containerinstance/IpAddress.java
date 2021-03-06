/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerinstance;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * IP address for the container group.
 */
public class IpAddress {
    /**
     * The list of ports exposed on the container group.
     */
    @JsonProperty(value = "ports", required = true)
    private List<Port> ports;

    /**
     * Specifies if the IP is exposed to the public internet.
     */
    @JsonProperty(value = "type", required = true)
    private String type;

    /**
     * The IP exposed to the public internet.
     */
    @JsonProperty(value = "ip")
    private String ip;

    /**
     * The Dns name label for the IP.
     */
    @JsonProperty(value = "dnsNameLabel")
    private String dnsNameLabel;

    /**
     * The FQDN for the IP.
     */
    @JsonProperty(value = "fqdn", access = JsonProperty.Access.WRITE_ONLY)
    private String fqdn;

    /**
     * Creates an instance of IpAddress class.
     */
    public IpAddress() {
        type = "Public";
    }

    /**
     * Get the ports value.
     *
     * @return the ports value
     */
    public List<Port> ports() {
        return this.ports;
    }

    /**
     * Set the ports value.
     *
     * @param ports the ports value to set
     * @return the IpAddress object itself.
     */
    public IpAddress withPorts(List<Port> ports) {
        this.ports = ports;
        return this;
    }

    /**
     * Get the type value.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type value.
     *
     * @param type the type value to set
     * @return the IpAddress object itself.
     */
    public IpAddress withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the ip value.
     *
     * @return the ip value
     */
    public String ip() {
        return this.ip;
    }

    /**
     * Set the ip value.
     *
     * @param ip the ip value to set
     * @return the IpAddress object itself.
     */
    public IpAddress withIp(String ip) {
        this.ip = ip;
        return this;
    }

    /**
     * Get the dnsNameLabel value.
     *
     * @return the dnsNameLabel value
     */
    public String dnsNameLabel() {
        return this.dnsNameLabel;
    }

    /**
     * Set the dnsNameLabel value.
     *
     * @param dnsNameLabel the dnsNameLabel value to set
     * @return the IpAddress object itself.
     */
    public IpAddress withDnsNameLabel(String dnsNameLabel) {
        this.dnsNameLabel = dnsNameLabel;
        return this;
    }

    /**
     * Get the fqdn value.
     *
     * @return the fqdn value
     */
    public String fqdn() {
        return this.fqdn;
    }

}
