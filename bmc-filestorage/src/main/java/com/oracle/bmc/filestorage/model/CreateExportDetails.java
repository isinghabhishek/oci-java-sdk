/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.filestorage.model;

/**
 * Details for creating the export. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20171215")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateExportDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateExportDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"exportOptions", "exportSetId", "fileSystemId", "path"})
    public CreateExportDetails(
            java.util.List<ClientOptions> exportOptions,
            String exportSetId,
            String fileSystemId,
            String path) {
        super();
        this.exportOptions = exportOptions;
        this.exportSetId = exportSetId;
        this.fileSystemId = fileSystemId;
        this.path = path;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Export options for the new export. If left unspecified, defaults to:
         *
         * <p>[ { "source" : "0.0.0.0/0", "requirePrivilegedSourcePort" : false, "access":
         * "READ_WRITE", "identitySquash": "NONE", "anonymousUid": 65534, "anonymousGid": 65534,
         * "isAnonymousAccessAllowed": false, "allowedAuth": ["SYS"] } ]
         *
         * <p>*Note:** Mount targets do not have Internet-routable IP addresses. Therefore they will
         * not be reachable from the Internet, even if an associated {@code ClientOptions} item has
         * a source of {@code 0.0.0.0/0}.
         *
         * <p>*If set to the empty array then the export will not be visible to any clients.**
         *
         * <p>The export's {@code exportOptions} can be changed after creation using the {@code
         * UpdateExport} operation.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("exportOptions")
        private java.util.List<ClientOptions> exportOptions;

        /**
         * Export options for the new export. If left unspecified, defaults to:
         *
         * <p>[ { "source" : "0.0.0.0/0", "requirePrivilegedSourcePort" : false, "access":
         * "READ_WRITE", "identitySquash": "NONE", "anonymousUid": 65534, "anonymousGid": 65534,
         * "isAnonymousAccessAllowed": false, "allowedAuth": ["SYS"] } ]
         *
         * <p>*Note:** Mount targets do not have Internet-routable IP addresses. Therefore they will
         * not be reachable from the Internet, even if an associated {@code ClientOptions} item has
         * a source of {@code 0.0.0.0/0}.
         *
         * <p>*If set to the empty array then the export will not be visible to any clients.**
         *
         * <p>The export's {@code exportOptions} can be changed after creation using the {@code
         * UpdateExport} operation.
         *
         * @param exportOptions the value to set
         * @return this builder
         */
        public Builder exportOptions(java.util.List<ClientOptions> exportOptions) {
            this.exportOptions = exportOptions;
            this.__explicitlySet__.add("exportOptions");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of
         * this export's export set.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("exportSetId")
        private String exportSetId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of
         * this export's export set.
         *
         * @param exportSetId the value to set
         * @return this builder
         */
        public Builder exportSetId(String exportSetId) {
            this.exportSetId = exportSetId;
            this.__explicitlySet__.add("exportSetId");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of
         * this export's file system.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("fileSystemId")
        private String fileSystemId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of
         * this export's file system.
         *
         * @param fileSystemId the value to set
         * @return this builder
         */
        public Builder fileSystemId(String fileSystemId) {
            this.fileSystemId = fileSystemId;
            this.__explicitlySet__.add("fileSystemId");
            return this;
        }
        /**
         * Path used to access the associated file system.
         *
         * <p>Avoid entering confidential information.
         *
         * <p>Example: {@code /mediafiles}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("path")
        private String path;

        /**
         * Path used to access the associated file system.
         *
         * <p>Avoid entering confidential information.
         *
         * <p>Example: {@code /mediafiles}
         *
         * @param path the value to set
         * @return this builder
         */
        public Builder path(String path) {
            this.path = path;
            this.__explicitlySet__.add("path");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateExportDetails build() {
            CreateExportDetails model =
                    new CreateExportDetails(
                            this.exportOptions, this.exportSetId, this.fileSystemId, this.path);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateExportDetails model) {
            if (model.wasPropertyExplicitlySet("exportOptions")) {
                this.exportOptions(model.getExportOptions());
            }
            if (model.wasPropertyExplicitlySet("exportSetId")) {
                this.exportSetId(model.getExportSetId());
            }
            if (model.wasPropertyExplicitlySet("fileSystemId")) {
                this.fileSystemId(model.getFileSystemId());
            }
            if (model.wasPropertyExplicitlySet("path")) {
                this.path(model.getPath());
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

    /**
     * Export options for the new export. If left unspecified, defaults to:
     *
     * <p>[ { "source" : "0.0.0.0/0", "requirePrivilegedSourcePort" : false, "access": "READ_WRITE",
     * "identitySquash": "NONE", "anonymousUid": 65534, "anonymousGid": 65534,
     * "isAnonymousAccessAllowed": false, "allowedAuth": ["SYS"] } ]
     *
     * <p>*Note:** Mount targets do not have Internet-routable IP addresses. Therefore they will not
     * be reachable from the Internet, even if an associated {@code ClientOptions} item has a source
     * of {@code 0.0.0.0/0}.
     *
     * <p>*If set to the empty array then the export will not be visible to any clients.**
     *
     * <p>The export's {@code exportOptions} can be changed after creation using the {@code
     * UpdateExport} operation.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("exportOptions")
    private final java.util.List<ClientOptions> exportOptions;

    /**
     * Export options for the new export. If left unspecified, defaults to:
     *
     * <p>[ { "source" : "0.0.0.0/0", "requirePrivilegedSourcePort" : false, "access": "READ_WRITE",
     * "identitySquash": "NONE", "anonymousUid": 65534, "anonymousGid": 65534,
     * "isAnonymousAccessAllowed": false, "allowedAuth": ["SYS"] } ]
     *
     * <p>*Note:** Mount targets do not have Internet-routable IP addresses. Therefore they will not
     * be reachable from the Internet, even if an associated {@code ClientOptions} item has a source
     * of {@code 0.0.0.0/0}.
     *
     * <p>*If set to the empty array then the export will not be visible to any clients.**
     *
     * <p>The export's {@code exportOptions} can be changed after creation using the {@code
     * UpdateExport} operation.
     *
     * @return the value
     */
    public java.util.List<ClientOptions> getExportOptions() {
        return exportOptions;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of this
     * export's export set.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("exportSetId")
    private final String exportSetId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of this
     * export's export set.
     *
     * @return the value
     */
    public String getExportSetId() {
        return exportSetId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of this
     * export's file system.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("fileSystemId")
    private final String fileSystemId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of this
     * export's file system.
     *
     * @return the value
     */
    public String getFileSystemId() {
        return fileSystemId;
    }

    /**
     * Path used to access the associated file system.
     *
     * <p>Avoid entering confidential information.
     *
     * <p>Example: {@code /mediafiles}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("path")
    private final String path;

    /**
     * Path used to access the associated file system.
     *
     * <p>Avoid entering confidential information.
     *
     * <p>Example: {@code /mediafiles}
     *
     * @return the value
     */
    public String getPath() {
        return path;
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
        sb.append("CreateExportDetails(");
        sb.append("super=").append(super.toString());
        sb.append("exportOptions=").append(String.valueOf(this.exportOptions));
        sb.append(", exportSetId=").append(String.valueOf(this.exportSetId));
        sb.append(", fileSystemId=").append(String.valueOf(this.fileSystemId));
        sb.append(", path=").append(String.valueOf(this.path));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateExportDetails)) {
            return false;
        }

        CreateExportDetails other = (CreateExportDetails) o;
        return java.util.Objects.equals(this.exportOptions, other.exportOptions)
                && java.util.Objects.equals(this.exportSetId, other.exportSetId)
                && java.util.Objects.equals(this.fileSystemId, other.fileSystemId)
                && java.util.Objects.equals(this.path, other.path)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.exportOptions == null ? 43 : this.exportOptions.hashCode());
        result = (result * PRIME) + (this.exportSetId == null ? 43 : this.exportSetId.hashCode());
        result = (result * PRIME) + (this.fileSystemId == null ? 43 : this.fileSystemId.hashCode());
        result = (result * PRIME) + (this.path == null ? 43 : this.path.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
