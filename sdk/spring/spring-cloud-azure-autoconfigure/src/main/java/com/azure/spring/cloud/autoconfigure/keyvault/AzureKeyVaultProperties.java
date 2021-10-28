// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.spring.cloud.autoconfigure.keyvault;

import com.azure.spring.cloud.autoconfigure.properties.AbstractAzureHttpConfigurationProperties;

/**
 * Common properties for Azure Key Vault
 */
public class AzureKeyVaultProperties extends AbstractAzureHttpConfigurationProperties {

    // TODO (xiada): the default vault url
    private String endpoint;

    public String getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }
}