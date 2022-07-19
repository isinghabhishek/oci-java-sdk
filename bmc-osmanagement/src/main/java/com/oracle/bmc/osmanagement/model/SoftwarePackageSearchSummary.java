/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagement.model;

/**
 * Summary information for a software package
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190801")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = SoftwarePackageSearchSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class SoftwarePackageSearchSummary {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "name",
        "type",
        "version",
        "architecture",
        "summary",
        "advisoryType",
        "errata",
        "softwareSources"
    })
    public SoftwarePackageSearchSummary(
            String displayName,
            String name,
            String type,
            String version,
            String architecture,
            String summary,
            UpdateTypes advisoryType,
            java.util.List<Id> errata,
            java.util.List<SoftwareSourceId> softwareSources) {
        super();
        this.displayName = displayName;
        this.name = name;
        this.type = type;
        this.version = version;
        this.architecture = architecture;
        this.summary = summary;
        this.advisoryType = advisoryType;
        this.errata = errata;
        this.softwareSources = softwareSources;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Package name
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * Package name
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * Unique identifier for the package. NOTE - This is not an OCID
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * Unique identifier for the package. NOTE - This is not an OCID
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * Type of the package
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private String type;

        /**
         * Type of the package
         * @param type the value to set
         * @return this builder
         **/
        public Builder type(String type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }
        /**
         * Version of the package
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("version")
        private String version;

        /**
         * Version of the package
         * @param version the value to set
         * @return this builder
         **/
        public Builder version(String version) {
            this.version = version;
            this.__explicitlySet__.add("version");
            return this;
        }
        /**
         * the architecture for which this software was built
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("architecture")
        private String architecture;

        /**
         * the architecture for which this software was built
         * @param architecture the value to set
         * @return this builder
         **/
        public Builder architecture(String architecture) {
            this.architecture = architecture;
            this.__explicitlySet__.add("architecture");
            return this;
        }
        /**
         * a summary description of the software package
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("summary")
        private String summary;

        /**
         * a summary description of the software package
         * @param summary the value to set
         * @return this builder
         **/
        public Builder summary(String summary) {
            this.summary = summary;
            this.__explicitlySet__.add("summary");
            return this;
        }
        /**
         * Type of the erratum.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("advisoryType")
        private UpdateTypes advisoryType;

        /**
         * Type of the erratum.
         * @param advisoryType the value to set
         * @return this builder
         **/
        public Builder advisoryType(UpdateTypes advisoryType) {
            this.advisoryType = advisoryType;
            this.__explicitlySet__.add("advisoryType");
            return this;
        }
        /**
         * List of errata containing this software package
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("errata")
        private java.util.List<Id> errata;

        /**
         * List of errata containing this software package
         * @param errata the value to set
         * @return this builder
         **/
        public Builder errata(java.util.List<Id> errata) {
            this.errata = errata;
            this.__explicitlySet__.add("errata");
            return this;
        }
        /**
         * list of software sources that provide the software package
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("softwareSources")
        private java.util.List<SoftwareSourceId> softwareSources;

        /**
         * list of software sources that provide the software package
         * @param softwareSources the value to set
         * @return this builder
         **/
        public Builder softwareSources(java.util.List<SoftwareSourceId> softwareSources) {
            this.softwareSources = softwareSources;
            this.__explicitlySet__.add("softwareSources");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SoftwarePackageSearchSummary build() {
            SoftwarePackageSearchSummary __instance__ =
                    new SoftwarePackageSearchSummary(
                            displayName,
                            name,
                            type,
                            version,
                            architecture,
                            summary,
                            advisoryType,
                            errata,
                            softwareSources);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SoftwarePackageSearchSummary o) {
            Builder copiedBuilder =
                    displayName(o.getDisplayName())
                            .name(o.getName())
                            .type(o.getType())
                            .version(o.getVersion())
                            .architecture(o.getArchitecture())
                            .summary(o.getSummary())
                            .advisoryType(o.getAdvisoryType())
                            .errata(o.getErrata())
                            .softwareSources(o.getSoftwareSources());

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
     * Package name
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * Package name
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Unique identifier for the package. NOTE - This is not an OCID
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * Unique identifier for the package. NOTE - This is not an OCID
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * Type of the package
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final String type;

    /**
     * Type of the package
     * @return the value
     **/
    public String getType() {
        return type;
    }

    /**
     * Version of the package
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    private final String version;

    /**
     * Version of the package
     * @return the value
     **/
    public String getVersion() {
        return version;
    }

    /**
     * the architecture for which this software was built
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("architecture")
    private final String architecture;

    /**
     * the architecture for which this software was built
     * @return the value
     **/
    public String getArchitecture() {
        return architecture;
    }

    /**
     * a summary description of the software package
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("summary")
    private final String summary;

    /**
     * a summary description of the software package
     * @return the value
     **/
    public String getSummary() {
        return summary;
    }

    /**
     * Type of the erratum.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("advisoryType")
    private final UpdateTypes advisoryType;

    /**
     * Type of the erratum.
     * @return the value
     **/
    public UpdateTypes getAdvisoryType() {
        return advisoryType;
    }

    /**
     * List of errata containing this software package
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("errata")
    private final java.util.List<Id> errata;

    /**
     * List of errata containing this software package
     * @return the value
     **/
    public java.util.List<Id> getErrata() {
        return errata;
    }

    /**
     * list of software sources that provide the software package
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("softwareSources")
    private final java.util.List<SoftwareSourceId> softwareSources;

    /**
     * list of software sources that provide the software package
     * @return the value
     **/
    public java.util.List<SoftwareSourceId> getSoftwareSources() {
        return softwareSources;
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
        sb.append("SoftwarePackageSearchSummary(");
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", version=").append(String.valueOf(this.version));
        sb.append(", architecture=").append(String.valueOf(this.architecture));
        sb.append(", summary=").append(String.valueOf(this.summary));
        sb.append(", advisoryType=").append(String.valueOf(this.advisoryType));
        sb.append(", errata=").append(String.valueOf(this.errata));
        sb.append(", softwareSources=").append(String.valueOf(this.softwareSources));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SoftwarePackageSearchSummary)) {
            return false;
        }

        SoftwarePackageSearchSummary other = (SoftwarePackageSearchSummary) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.version, other.version)
                && java.util.Objects.equals(this.architecture, other.architecture)
                && java.util.Objects.equals(this.summary, other.summary)
                && java.util.Objects.equals(this.advisoryType, other.advisoryType)
                && java.util.Objects.equals(this.errata, other.errata)
                && java.util.Objects.equals(this.softwareSources, other.softwareSources)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.version == null ? 43 : this.version.hashCode());
        result = (result * PRIME) + (this.architecture == null ? 43 : this.architecture.hashCode());
        result = (result * PRIME) + (this.summary == null ? 43 : this.summary.hashCode());
        result = (result * PRIME) + (this.advisoryType == null ? 43 : this.advisoryType.hashCode());
        result = (result * PRIME) + (this.errata == null ? 43 : this.errata.hashCode());
        result =
                (result * PRIME)
                        + (this.softwareSources == null ? 43 : this.softwareSources.hashCode());
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
