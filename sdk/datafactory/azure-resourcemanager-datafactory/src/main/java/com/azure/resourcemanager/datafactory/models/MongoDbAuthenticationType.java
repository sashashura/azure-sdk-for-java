// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The authentication type to be used to connect to the MongoDB database. */
public final class MongoDbAuthenticationType extends ExpandableStringEnum<MongoDbAuthenticationType> {
    /** Static value Basic for MongoDbAuthenticationType. */
    public static final MongoDbAuthenticationType BASIC = fromString("Basic");

    /** Static value Anonymous for MongoDbAuthenticationType. */
    public static final MongoDbAuthenticationType ANONYMOUS = fromString("Anonymous");

    /**
     * Creates or finds a MongoDbAuthenticationType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding MongoDbAuthenticationType.
     */
    @JsonCreator
    public static MongoDbAuthenticationType fromString(String name) {
        return fromString(name, MongoDbAuthenticationType.class);
    }

    /**
     * Gets known MongoDbAuthenticationType values.
     *
     * @return known MongoDbAuthenticationType values.
     */
    public static Collection<MongoDbAuthenticationType> values() {
        return values(MongoDbAuthenticationType.class);
    }
}
