/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * Details to generate a downloadable discovery report.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = GenerateDiscoveryReportForDownloadDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class GenerateDiscoveryReportForDownloadDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("discoveryJobId")
        private String discoveryJobId;

        public Builder discoveryJobId(String discoveryJobId) {
            this.discoveryJobId = discoveryJobId;
            this.__explicitlySet__.add("discoveryJobId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("reportFormat")
        private ReportFormat reportFormat;

        public Builder reportFormat(ReportFormat reportFormat) {
            this.reportFormat = reportFormat;
            this.__explicitlySet__.add("reportFormat");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public GenerateDiscoveryReportForDownloadDetails build() {
            GenerateDiscoveryReportForDownloadDetails __instance__ =
                    new GenerateDiscoveryReportForDownloadDetails(discoveryJobId, reportFormat);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(GenerateDiscoveryReportForDownloadDetails o) {
            Builder copiedBuilder =
                    discoveryJobId(o.getDiscoveryJobId()).reportFormat(o.getReportFormat());

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

    /**
     * The OCID of the discovery job.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("discoveryJobId")
    String discoveryJobId;
    /**
     * Format of the report.
     **/
    public enum ReportFormat {
        Pdf("PDF"),
        Xls("XLS"),
        ;

        private final String value;
        private static java.util.Map<String, ReportFormat> map;

        static {
            map = new java.util.HashMap<>();
            for (ReportFormat v : ReportFormat.values()) {
                map.put(v.getValue(), v);
            }
        }

        ReportFormat(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ReportFormat create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid ReportFormat: " + key);
        }
    };
    /**
     * Format of the report.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("reportFormat")
    ReportFormat reportFormat;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
