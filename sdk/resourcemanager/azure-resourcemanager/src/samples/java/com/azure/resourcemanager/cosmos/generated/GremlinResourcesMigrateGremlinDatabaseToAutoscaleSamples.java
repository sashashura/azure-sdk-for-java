// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated;

import com.azure.core.util.Context;

/** Samples for GremlinResources MigrateGremlinDatabaseToAutoscale. */
public final class GremlinResourcesMigrateGremlinDatabaseToAutoscaleSamples {
    /*
     * x-ms-original-file: specification/cosmos-db/resource-manager/Microsoft.DocumentDB/stable/2021-10-15/examples/CosmosDBGremlinDatabaseMigrateToAutoscale.json
     */
    /**
     * Sample code: CosmosDBGremlinDatabaseMigrateToAutoscale.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void cosmosDBGremlinDatabaseMigrateToAutoscale(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .cosmosDBAccounts()
            .manager()
            .serviceClient()
            .getGremlinResources()
            .migrateGremlinDatabaseToAutoscale("rg1", "ddb1", "databaseName", Context.NONE);
    }
}