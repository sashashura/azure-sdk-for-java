// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.spring.core.properties.client;

import com.azure.core.http.policy.HttpLogDetailLevel;
import com.azure.spring.core.aware.ClientAware;

import java.util.HashSet;
import java.util.Set;

/**
 * Options related to http logging. For example, if you want to log the http request or response, you could set the
 * level to {@link HttpLogDetailLevel#BASIC} or some other levels.
 */
public class HttpLoggingProperties implements ClientAware.HttpLogging {

    /**
     * Gets the level of detail to log on HTTP messages.
     */
    private HttpLogDetailLevel level;
    /**
     * The whitelisted headers that should be logged.
     */
    private final Set<String> allowedHeaderNames = new HashSet<>();
    /**
     * The whitelisted query parameters.
     */
    private final Set<String> allowedQueryParamNames = new HashSet<>();
    /**
     * Whether to pretty print the message bodies.
     */
    private Boolean prettyPrintBody;

    public HttpLogDetailLevel getLevel() {
        return level;
    }

    public void setLevel(HttpLogDetailLevel level) {
        this.level = level;
    }

    public Set<String> getAllowedHeaderNames() {
        return allowedHeaderNames;
    }

    public Set<String> getAllowedQueryParamNames() {
        return allowedQueryParamNames;
    }

    public Boolean getPrettyPrintBody() {
        return prettyPrintBody;
    }

    public void setPrettyPrintBody(Boolean prettyPrintBody) {
        this.prettyPrintBody = prettyPrintBody;
    }

}