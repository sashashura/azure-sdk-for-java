// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
package com.azure.spring.cloud.stream.binder.servicebus.config;

import com.azure.spring.cloud.stream.binder.servicebus.ServiceBusHealthIndicator;
import com.azure.spring.cloud.stream.binder.servicebus.ServiceBusMessageChannelBinder;
import org.springframework.boot.actuate.autoconfigure.health.ConditionalOnEnabledHealthIndicator;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Auto configuration for {@link ServiceBusHealthIndicator}.
 */
@Configuration
@ConditionalOnClass(name = "org.springframework.boot.actuate.health.HealthIndicator")
@ConditionalOnEnabledHealthIndicator("binders")
public class ServiceBusBinderHealthIndicatorConfiguration {

    @Bean
    public ServiceBusHealthIndicator serviceBusHealthIndicator(ServiceBusMessageChannelBinder binder) {
        return new ServiceBusHealthIndicator(binder);
    }


}