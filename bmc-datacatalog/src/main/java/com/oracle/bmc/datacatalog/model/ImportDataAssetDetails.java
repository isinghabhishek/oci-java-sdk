/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacatalog.model;

/**
 * Specifies the file contents to be imported.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190325")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ImportDataAssetDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ImportDataAssetDetails {
    @Deprecated
    @java.beans.ConstructorProperties({"importFileContents"})
    public ImportDataAssetDetails(byte[] importFileContents) {
        super();
        this.importFileContents = importFileContents;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The file contents to be imported. File size not to exceed 10 MB.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("importFileContents")
        private byte[] importFileContents;

        /**
         * The file contents to be imported. File size not to exceed 10 MB.
         * @param importFileContents the value to set
         * @return this builder
         **/
        public Builder importFileContents(byte[] importFileContents) {
            this.importFileContents = importFileContents;
            this.__explicitlySet__.add("importFileContents");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ImportDataAssetDetails build() {
            ImportDataAssetDetails __instance__ = new ImportDataAssetDetails(importFileContents);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ImportDataAssetDetails o) {
            Builder copiedBuilder = importFileContents(o.getImportFileContents());

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
     * The file contents to be imported. File size not to exceed 10 MB.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("importFileContents")
    private final byte[] importFileContents;

    /**
     * The file contents to be imported. File size not to exceed 10 MB.
     * @return the value
     **/
    public byte[] getImportFileContents() {
        return importFileContents;
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
        sb.append("ImportDataAssetDetails(");
        sb.append("importFileContents=")
                .append(
                        (includeByteArrayContents
                                ? java.util.Arrays.toString(this.importFileContents)
                                : (String.valueOf(this.importFileContents)
                                        + (this.importFileContents != null
                                                ? " (byte[" + this.importFileContents.length + "])"
                                                : ""))));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ImportDataAssetDetails)) {
            return false;
        }

        ImportDataAssetDetails other = (ImportDataAssetDetails) o;
        return java.util.Arrays.equals(this.importFileContents, other.importFileContents)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + java.util.Arrays.hashCode(this.importFileContents);
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
