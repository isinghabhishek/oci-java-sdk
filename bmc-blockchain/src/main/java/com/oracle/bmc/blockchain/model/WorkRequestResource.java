/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.blockchain.model;

/**
 * A resource created or operated on by a work request.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20191010")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = WorkRequestResource.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class WorkRequestResource {
    @Deprecated
    @java.beans.ConstructorProperties({
        "entityType",
        "actionType",
        "identifier",
        "entityUri",
        "subTypeDetails"
    })
    public WorkRequestResource(
            String entityType,
            ActionType actionType,
            String identifier,
            String entityUri,
            java.util.List<WorkRequestResourceSubTypeDetail> subTypeDetails) {
        super();
        this.entityType = entityType;
        this.actionType = actionType;
        this.identifier = identifier;
        this.entityUri = entityUri;
        this.subTypeDetails = subTypeDetails;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The resource type the work request is affects.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("entityType")
        private String entityType;

        /**
         * The resource type the work request is affects.
         * @param entityType the value to set
         * @return this builder
         **/
        public Builder entityType(String entityType) {
            this.entityType = entityType;
            this.__explicitlySet__.add("entityType");
            return this;
        }
        /**
         * The way in which this resource is affected by the work tracked in the work request.
         * A resource being created, updated, or deleted will remain in the IN_PROGRESS state until
         * work is complete for that resource at which point it will transition to CREATED, UPDATED,
         * or DELETED, respectively.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("actionType")
        private ActionType actionType;

        /**
         * The way in which this resource is affected by the work tracked in the work request.
         * A resource being created, updated, or deleted will remain in the IN_PROGRESS state until
         * work is complete for that resource at which point it will transition to CREATED, UPDATED,
         * or DELETED, respectively.
         *
         * @param actionType the value to set
         * @return this builder
         **/
        public Builder actionType(ActionType actionType) {
            this.actionType = actionType;
            this.__explicitlySet__.add("actionType");
            return this;
        }
        /**
         * The identifier of the resource the work request affects.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("identifier")
        private String identifier;

        /**
         * The identifier of the resource the work request affects.
         * @param identifier the value to set
         * @return this builder
         **/
        public Builder identifier(String identifier) {
            this.identifier = identifier;
            this.__explicitlySet__.add("identifier");
            return this;
        }
        /**
         * The URI path that the user can do a GET on to access the resource metadata
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("entityUri")
        private String entityUri;

        /**
         * The URI path that the user can do a GET on to access the resource metadata
         * @param entityUri the value to set
         * @return this builder
         **/
        public Builder entityUri(String entityUri) {
            this.entityUri = entityUri;
            this.__explicitlySet__.add("entityUri");
            return this;
        }
        /**
         * Collection of SubType information for a work request resource\u00A9
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("subTypeDetails")
        private java.util.List<WorkRequestResourceSubTypeDetail> subTypeDetails;

        /**
         * Collection of SubType information for a work request resource\u00A9
         * @param subTypeDetails the value to set
         * @return this builder
         **/
        public Builder subTypeDetails(
                java.util.List<WorkRequestResourceSubTypeDetail> subTypeDetails) {
            this.subTypeDetails = subTypeDetails;
            this.__explicitlySet__.add("subTypeDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public WorkRequestResource build() {
            WorkRequestResource __instance__ =
                    new WorkRequestResource(
                            entityType, actionType, identifier, entityUri, subTypeDetails);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(WorkRequestResource o) {
            Builder copiedBuilder =
                    entityType(o.getEntityType())
                            .actionType(o.getActionType())
                            .identifier(o.getIdentifier())
                            .entityUri(o.getEntityUri())
                            .subTypeDetails(o.getSubTypeDetails());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * The resource type the work request is affects.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("entityType")
    private final String entityType;

    /**
     * The resource type the work request is affects.
     * @return the value
     **/
    public String getEntityType() {
        return entityType;
    }

    /**
     * The way in which this resource is affected by the work tracked in the work request.
     * A resource being created, updated, or deleted will remain in the IN_PROGRESS state until
     * work is complete for that resource at which point it will transition to CREATED, UPDATED,
     * or DELETED, respectively.
     *
     **/
    public enum ActionType {
        Created("CREATED"),
        Updated("UPDATED"),
        Deleted("DELETED"),
        InProgress("IN_PROGRESS"),
        Related("RELATED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ActionType.class);

        private final String value;
        private static java.util.Map<String, ActionType> map;

        static {
            map = new java.util.HashMap<>();
            for (ActionType v : ActionType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ActionType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ActionType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ActionType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The way in which this resource is affected by the work tracked in the work request.
     * A resource being created, updated, or deleted will remain in the IN_PROGRESS state until
     * work is complete for that resource at which point it will transition to CREATED, UPDATED,
     * or DELETED, respectively.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("actionType")
    private final ActionType actionType;

    /**
     * The way in which this resource is affected by the work tracked in the work request.
     * A resource being created, updated, or deleted will remain in the IN_PROGRESS state until
     * work is complete for that resource at which point it will transition to CREATED, UPDATED,
     * or DELETED, respectively.
     *
     * @return the value
     **/
    public ActionType getActionType() {
        return actionType;
    }

    /**
     * The identifier of the resource the work request affects.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("identifier")
    private final String identifier;

    /**
     * The identifier of the resource the work request affects.
     * @return the value
     **/
    public String getIdentifier() {
        return identifier;
    }

    /**
     * The URI path that the user can do a GET on to access the resource metadata
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("entityUri")
    private final String entityUri;

    /**
     * The URI path that the user can do a GET on to access the resource metadata
     * @return the value
     **/
    public String getEntityUri() {
        return entityUri;
    }

    /**
     * Collection of SubType information for a work request resource\u00A9
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("subTypeDetails")
    private final java.util.List<WorkRequestResourceSubTypeDetail> subTypeDetails;

    /**
     * Collection of SubType information for a work request resource\u00A9
     * @return the value
     **/
    public java.util.List<WorkRequestResourceSubTypeDetail> getSubTypeDetails() {
        return subTypeDetails;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("WorkRequestResource(");
        sb.append("entityType=").append(String.valueOf(this.entityType));
        sb.append(", actionType=").append(String.valueOf(this.actionType));
        sb.append(", identifier=").append(String.valueOf(this.identifier));
        sb.append(", entityUri=").append(String.valueOf(this.entityUri));
        sb.append(", subTypeDetails=").append(String.valueOf(this.subTypeDetails));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof WorkRequestResource)) {
            return false;
        }

        WorkRequestResource other = (WorkRequestResource) o;
        return java.util.Objects.equals(this.entityType, other.entityType)
                && java.util.Objects.equals(this.actionType, other.actionType)
                && java.util.Objects.equals(this.identifier, other.identifier)
                && java.util.Objects.equals(this.entityUri, other.entityUri)
                && java.util.Objects.equals(this.subTypeDetails, other.subTypeDetails)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.entityType == null ? 43 : this.entityType.hashCode());
        result = (result * PRIME) + (this.actionType == null ? 43 : this.actionType.hashCode());
        result = (result * PRIME) + (this.identifier == null ? 43 : this.identifier.hashCode());
        result = (result * PRIME) + (this.entityUri == null ? 43 : this.entityUri.hashCode());
        result =
                (result * PRIME)
                        + (this.subTypeDetails == null ? 43 : this.subTypeDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
