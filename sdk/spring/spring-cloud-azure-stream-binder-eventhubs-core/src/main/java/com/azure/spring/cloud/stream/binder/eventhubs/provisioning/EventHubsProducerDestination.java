// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.spring.cloud.stream.binder.eventhubs.provisioning;

import org.springframework.cloud.stream.provisioning.ProducerDestination;

/**
 *
 */
public class EventHubsProducerDestination implements ProducerDestination {

    private final String name;

    public EventHubsProducerDestination(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getNameForPartition(int partition) {
        return this.name + "-" + partition;
    }

    @Override
    public String toString() {
        return "EventHubsProducerDestination{" + "name='" + name + '\'' + '}';
    }
}