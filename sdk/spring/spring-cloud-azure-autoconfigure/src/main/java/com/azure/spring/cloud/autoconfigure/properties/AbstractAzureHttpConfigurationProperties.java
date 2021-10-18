// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.spring.cloud.autoconfigure.properties;

import com.azure.spring.core.properties.client.HttpClientProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;

/**
 * Configuration properties base class for all Azure Http clients.
 */
public abstract class AbstractAzureHttpConfigurationProperties extends AbstractAzureServiceConfigurationProperties {

    @NestedConfigurationProperty
    protected final HttpClientProperties client = new HttpClientProperties();

    @Override
    public HttpClientProperties getClient() {
        return client;
    }
}