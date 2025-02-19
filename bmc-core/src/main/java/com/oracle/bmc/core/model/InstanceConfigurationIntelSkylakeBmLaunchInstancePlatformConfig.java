/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * The platform configuration used when launching a bare metal instance with one of the following
 * shapes: BM.Standard2.52, BM.GPU2.2, BM.GPU3.8, or BM.DenseIO2.52 (the Intel Skylake platform).
 * <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = InstanceConfigurationIntelSkylakeBmLaunchInstancePlatformConfig.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "type")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class InstanceConfigurationIntelSkylakeBmLaunchInstancePlatformConfig
        extends InstanceConfigurationLaunchInstancePlatformConfig {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("isSecureBootEnabled")
        private Boolean isSecureBootEnabled;

        public Builder isSecureBootEnabled(Boolean isSecureBootEnabled) {
            this.isSecureBootEnabled = isSecureBootEnabled;
            this.__explicitlySet__.add("isSecureBootEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isTrustedPlatformModuleEnabled")
        private Boolean isTrustedPlatformModuleEnabled;

        public Builder isTrustedPlatformModuleEnabled(Boolean isTrustedPlatformModuleEnabled) {
            this.isTrustedPlatformModuleEnabled = isTrustedPlatformModuleEnabled;
            this.__explicitlySet__.add("isTrustedPlatformModuleEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isMeasuredBootEnabled")
        private Boolean isMeasuredBootEnabled;

        public Builder isMeasuredBootEnabled(Boolean isMeasuredBootEnabled) {
            this.isMeasuredBootEnabled = isMeasuredBootEnabled;
            this.__explicitlySet__.add("isMeasuredBootEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isMemoryEncryptionEnabled")
        private Boolean isMemoryEncryptionEnabled;

        public Builder isMemoryEncryptionEnabled(Boolean isMemoryEncryptionEnabled) {
            this.isMemoryEncryptionEnabled = isMemoryEncryptionEnabled;
            this.__explicitlySet__.add("isMemoryEncryptionEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public InstanceConfigurationIntelSkylakeBmLaunchInstancePlatformConfig build() {
            InstanceConfigurationIntelSkylakeBmLaunchInstancePlatformConfig model =
                    new InstanceConfigurationIntelSkylakeBmLaunchInstancePlatformConfig(
                            this.isSecureBootEnabled,
                            this.isTrustedPlatformModuleEnabled,
                            this.isMeasuredBootEnabled,
                            this.isMemoryEncryptionEnabled);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(InstanceConfigurationIntelSkylakeBmLaunchInstancePlatformConfig model) {
            if (model.wasPropertyExplicitlySet("isSecureBootEnabled")) {
                this.isSecureBootEnabled(model.getIsSecureBootEnabled());
            }
            if (model.wasPropertyExplicitlySet("isTrustedPlatformModuleEnabled")) {
                this.isTrustedPlatformModuleEnabled(model.getIsTrustedPlatformModuleEnabled());
            }
            if (model.wasPropertyExplicitlySet("isMeasuredBootEnabled")) {
                this.isMeasuredBootEnabled(model.getIsMeasuredBootEnabled());
            }
            if (model.wasPropertyExplicitlySet("isMemoryEncryptionEnabled")) {
                this.isMemoryEncryptionEnabled(model.getIsMemoryEncryptionEnabled());
            }
            return this;
        }
    }

    /** Create a new builder. */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    @Deprecated
    public InstanceConfigurationIntelSkylakeBmLaunchInstancePlatformConfig(
            Boolean isSecureBootEnabled,
            Boolean isTrustedPlatformModuleEnabled,
            Boolean isMeasuredBootEnabled,
            Boolean isMemoryEncryptionEnabled) {
        super(
                isSecureBootEnabled,
                isTrustedPlatformModuleEnabled,
                isMeasuredBootEnabled,
                isMemoryEncryptionEnabled);
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     *
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("InstanceConfigurationIntelSkylakeBmLaunchInstancePlatformConfig(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof InstanceConfigurationIntelSkylakeBmLaunchInstancePlatformConfig)) {
            return false;
        }

        InstanceConfigurationIntelSkylakeBmLaunchInstancePlatformConfig other =
                (InstanceConfigurationIntelSkylakeBmLaunchInstancePlatformConfig) o;
        return super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        return result;
    }
}
