/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.aivision.model;

/**
 * A single cell in a table.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220125")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Cell.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class Cell {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("text")
        private String text;

        public Builder text(String text) {
            this.text = text;
            this.__explicitlySet__.add("text");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("rowIndex")
        private Integer rowIndex;

        public Builder rowIndex(Integer rowIndex) {
            this.rowIndex = rowIndex;
            this.__explicitlySet__.add("rowIndex");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("columnIndex")
        private Integer columnIndex;

        public Builder columnIndex(Integer columnIndex) {
            this.columnIndex = columnIndex;
            this.__explicitlySet__.add("columnIndex");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("confidence")
        private Float confidence;

        public Builder confidence(Float confidence) {
            this.confidence = confidence;
            this.__explicitlySet__.add("confidence");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("boundingPolygon")
        private BoundingPolygon boundingPolygon;

        public Builder boundingPolygon(BoundingPolygon boundingPolygon) {
            this.boundingPolygon = boundingPolygon;
            this.__explicitlySet__.add("boundingPolygon");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("wordIndexes")
        private java.util.List<Integer> wordIndexes;

        public Builder wordIndexes(java.util.List<Integer> wordIndexes) {
            this.wordIndexes = wordIndexes;
            this.__explicitlySet__.add("wordIndexes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Cell build() {
            Cell __instance__ =
                    new Cell(text, rowIndex, columnIndex, confidence, boundingPolygon, wordIndexes);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Cell o) {
            Builder copiedBuilder =
                    text(o.getText())
                            .rowIndex(o.getRowIndex())
                            .columnIndex(o.getColumnIndex())
                            .confidence(o.getConfidence())
                            .boundingPolygon(o.getBoundingPolygon())
                            .wordIndexes(o.getWordIndexes());

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
     * Text recognized in the cell.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("text")
    String text;

    /**
     * Index of the cell inside the row.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("rowIndex")
    Integer rowIndex;

    /**
     * Index of the cell inside the column.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("columnIndex")
    Integer columnIndex;

    /**
     * Confidence score between 0 to 1.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("confidence")
    Float confidence;

    @com.fasterxml.jackson.annotation.JsonProperty("boundingPolygon")
    BoundingPolygon boundingPolygon;

    /**
     * Words detected in the cell.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("wordIndexes")
    java.util.List<Integer> wordIndexes;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
