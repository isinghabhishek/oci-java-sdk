/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudguard.model;

/**
 * The information required to create TargetDetectorRecipe
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200131")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = AttachTargetDetectorRecipeDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class AttachTargetDetectorRecipeDetails {
    @Deprecated
    @java.beans.ConstructorProperties({"detectorRecipeId"})
    public AttachTargetDetectorRecipeDetails(String detectorRecipeId) {
        super();
        this.detectorRecipeId = detectorRecipeId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * DetectorRecipe Identifier
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("detectorRecipeId")
        private String detectorRecipeId;

        /**
         * DetectorRecipe Identifier
         * @param detectorRecipeId the value to set
         * @return this builder
         **/
        public Builder detectorRecipeId(String detectorRecipeId) {
            this.detectorRecipeId = detectorRecipeId;
            this.__explicitlySet__.add("detectorRecipeId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AttachTargetDetectorRecipeDetails build() {
            AttachTargetDetectorRecipeDetails __instance__ =
                    new AttachTargetDetectorRecipeDetails(detectorRecipeId);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AttachTargetDetectorRecipeDetails o) {
            Builder copiedBuilder = detectorRecipeId(o.getDetectorRecipeId());

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
     * DetectorRecipe Identifier
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("detectorRecipeId")
    private final String detectorRecipeId;

    /**
     * DetectorRecipe Identifier
     * @return the value
     **/
    public String getDetectorRecipeId() {
        return detectorRecipeId;
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
        sb.append("AttachTargetDetectorRecipeDetails(");
        sb.append("detectorRecipeId=").append(String.valueOf(this.detectorRecipeId));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AttachTargetDetectorRecipeDetails)) {
            return false;
        }

        AttachTargetDetectorRecipeDetails other = (AttachTargetDetectorRecipeDetails) o;
        return java.util.Objects.equals(this.detectorRecipeId, other.detectorRecipeId)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.detectorRecipeId == null ? 43 : this.detectorRecipeId.hashCode());
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
