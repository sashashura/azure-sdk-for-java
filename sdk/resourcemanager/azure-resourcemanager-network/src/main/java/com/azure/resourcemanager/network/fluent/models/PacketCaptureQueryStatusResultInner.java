// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.network.models.PcError;
import com.azure.resourcemanager.network.models.PcStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/** Status of packet capture session. */
@Fluent
public final class PacketCaptureQueryStatusResultInner {
    /*
     * The name of the packet capture resource.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * The ID of the packet capture resource.
     */
    @JsonProperty(value = "id")
    private String id;

    /*
     * The start time of the packet capture session.
     */
    @JsonProperty(value = "captureStartTime")
    private OffsetDateTime captureStartTime;

    /*
     * The status of the packet capture session.
     */
    @JsonProperty(value = "packetCaptureStatus")
    private PcStatus packetCaptureStatus;

    /*
     * The reason the current packet capture session was stopped.
     */
    @JsonProperty(value = "stopReason")
    private String stopReason;

    /*
     * List of errors of packet capture session.
     */
    @JsonProperty(value = "packetCaptureError")
    private List<PcError> packetCaptureError;

    /**
     * Get the name property: The name of the packet capture resource.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the packet capture resource.
     *
     * @param name the name value to set.
     * @return the PacketCaptureQueryStatusResultInner object itself.
     */
    public PacketCaptureQueryStatusResultInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the id property: The ID of the packet capture resource.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: The ID of the packet capture resource.
     *
     * @param id the id value to set.
     * @return the PacketCaptureQueryStatusResultInner object itself.
     */
    public PacketCaptureQueryStatusResultInner withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the captureStartTime property: The start time of the packet capture session.
     *
     * @return the captureStartTime value.
     */
    public OffsetDateTime captureStartTime() {
        return this.captureStartTime;
    }

    /**
     * Set the captureStartTime property: The start time of the packet capture session.
     *
     * @param captureStartTime the captureStartTime value to set.
     * @return the PacketCaptureQueryStatusResultInner object itself.
     */
    public PacketCaptureQueryStatusResultInner withCaptureStartTime(OffsetDateTime captureStartTime) {
        this.captureStartTime = captureStartTime;
        return this;
    }

    /**
     * Get the packetCaptureStatus property: The status of the packet capture session.
     *
     * @return the packetCaptureStatus value.
     */
    public PcStatus packetCaptureStatus() {
        return this.packetCaptureStatus;
    }

    /**
     * Set the packetCaptureStatus property: The status of the packet capture session.
     *
     * @param packetCaptureStatus the packetCaptureStatus value to set.
     * @return the PacketCaptureQueryStatusResultInner object itself.
     */
    public PacketCaptureQueryStatusResultInner withPacketCaptureStatus(PcStatus packetCaptureStatus) {
        this.packetCaptureStatus = packetCaptureStatus;
        return this;
    }

    /**
     * Get the stopReason property: The reason the current packet capture session was stopped.
     *
     * @return the stopReason value.
     */
    public String stopReason() {
        return this.stopReason;
    }

    /**
     * Set the stopReason property: The reason the current packet capture session was stopped.
     *
     * @param stopReason the stopReason value to set.
     * @return the PacketCaptureQueryStatusResultInner object itself.
     */
    public PacketCaptureQueryStatusResultInner withStopReason(String stopReason) {
        this.stopReason = stopReason;
        return this;
    }

    /**
     * Get the packetCaptureError property: List of errors of packet capture session.
     *
     * @return the packetCaptureError value.
     */
    public List<PcError> packetCaptureError() {
        return this.packetCaptureError;
    }

    /**
     * Set the packetCaptureError property: List of errors of packet capture session.
     *
     * @param packetCaptureError the packetCaptureError value to set.
     * @return the PacketCaptureQueryStatusResultInner object itself.
     */
    public PacketCaptureQueryStatusResultInner withPacketCaptureError(List<PcError> packetCaptureError) {
        this.packetCaptureError = packetCaptureError;
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
