// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.videoanalyzer.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of LivePipelines. */
public interface LivePipelines {
    /**
     * Retrieves a list of live pipelines that have been created, along with their JSON representations.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The Azure Video Analyzer account name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a collection of LivePipeline items.
     */
    PagedIterable<LivePipeline> list(String resourceGroupName, String accountName);

    /**
     * Retrieves a list of live pipelines that have been created, along with their JSON representations.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The Azure Video Analyzer account name.
     * @param filter Restricts the set of items returned.
     * @param top Specifies a non-negative integer n that limits the number of items returned from a collection. The
     *     service returns the number of available items up to but not greater than the specified value n.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a collection of LivePipeline items.
     */
    PagedIterable<LivePipeline> list(
        String resourceGroupName, String accountName, String filter, Integer top, Context context);

    /**
     * Retrieves a specific live pipeline by name. If a live pipeline with that name has been previously created, the
     * call will return the JSON representation of that instance.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The Azure Video Analyzer account name.
     * @param livePipelineName Live pipeline unique identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return live pipeline represents a unique instance of a live topology, used for real-time ingestion, archiving
     *     and publishing of content for a unique RTSP camera.
     */
    LivePipeline get(String resourceGroupName, String accountName, String livePipelineName);

    /**
     * Retrieves a specific live pipeline by name. If a live pipeline with that name has been previously created, the
     * call will return the JSON representation of that instance.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The Azure Video Analyzer account name.
     * @param livePipelineName Live pipeline unique identifier.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return live pipeline represents a unique instance of a live topology, used for real-time ingestion, archiving
     *     and publishing of content for a unique RTSP camera.
     */
    Response<LivePipeline> getWithResponse(
        String resourceGroupName, String accountName, String livePipelineName, Context context);

    /**
     * Deletes a live pipeline with the given name.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The Azure Video Analyzer account name.
     * @param livePipelineName Live pipeline unique identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String accountName, String livePipelineName);

    /**
     * Deletes a live pipeline with the given name.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The Azure Video Analyzer account name.
     * @param livePipelineName Live pipeline unique identifier.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    Response<Void> deleteWithResponse(
        String resourceGroupName, String accountName, String livePipelineName, Context context);

    /**
     * Activates a live pipeline with the given name.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The Azure Video Analyzer account name.
     * @param livePipelineName Live pipeline unique identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void activate(String resourceGroupName, String accountName, String livePipelineName);

    /**
     * Activates a live pipeline with the given name.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The Azure Video Analyzer account name.
     * @param livePipelineName Live pipeline unique identifier.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void activate(String resourceGroupName, String accountName, String livePipelineName, Context context);

    /**
     * Deactivates a live pipeline with the given name.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The Azure Video Analyzer account name.
     * @param livePipelineName Live pipeline unique identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deactivate(String resourceGroupName, String accountName, String livePipelineName);

    /**
     * Deactivates a live pipeline with the given name.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The Azure Video Analyzer account name.
     * @param livePipelineName Live pipeline unique identifier.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deactivate(String resourceGroupName, String accountName, String livePipelineName, Context context);

    /**
     * Retrieves a specific live pipeline by name. If a live pipeline with that name has been previously created, the
     * call will return the JSON representation of that instance.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return live pipeline represents a unique instance of a live topology, used for real-time ingestion, archiving
     *     and publishing of content for a unique RTSP camera.
     */
    LivePipeline getById(String id);

    /**
     * Retrieves a specific live pipeline by name. If a live pipeline with that name has been previously created, the
     * call will return the JSON representation of that instance.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return live pipeline represents a unique instance of a live topology, used for real-time ingestion, archiving
     *     and publishing of content for a unique RTSP camera.
     */
    Response<LivePipeline> getByIdWithResponse(String id, Context context);

    /**
     * Deletes a live pipeline with the given name.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes a live pipeline with the given name.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    Response<Void> deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new LivePipeline resource.
     *
     * @param name resource name.
     * @return the first stage of the new LivePipeline definition.
     */
    LivePipeline.DefinitionStages.Blank define(String name);
}