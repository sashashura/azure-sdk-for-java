// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.spring.service.servicebus.properties;

import com.azure.messaging.servicebus.models.ServiceBusReceiveMode;
import com.azure.messaging.servicebus.models.SubQueue;

import java.time.Duration;

/**
 *
 */
public interface ServiceBusConsumerDescriptor extends ServiceBusCommonDescriptor {

    Boolean getSessionEnabled();

    Boolean getAutoComplete();

    Integer getPrefetchCount();

    SubQueue getSubQueue();

    ServiceBusReceiveMode getReceiveMode();

    String getSubscriptionName();

    Duration getMaxAutoLockRenewDuration();

}