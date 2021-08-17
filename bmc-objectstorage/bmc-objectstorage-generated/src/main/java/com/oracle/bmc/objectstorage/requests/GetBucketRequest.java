/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.objectstorage.requests;

import com.oracle.bmc.objectstorage.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/objectstorage/GetBucketExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use GetBucketRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.Builder(
    builderClassName = "Builder",
    buildMethodName = "buildWithoutInvocationCallback",
    toBuilder = true
)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@lombok.Getter
public class GetBucketRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The Object Storage namespace used for the request.
     */
    private String namespaceName;

    /**
     * The name of the bucket. Avoid entering confidential information.
     * Example: {@code my-new-bucket1}
     *
     */
    private String bucketName;

    /**
     * The entity tag (ETag) to match with the ETag of an existing resource. If the specified ETag matches the ETag of
     * the existing resource, GET and HEAD requests will return the resource and PUT and POST requests will upload
     * the resource.
     *
     */
    private String ifMatch;

    /**
     * The entity tag (ETag) to avoid matching. The only valid value is '*', which indicates that the request should
     * fail if the resource already exists.
     *
     */
    private String ifNoneMatch;

    /**
     * The client request ID for tracing.
     */
    private String opcClientRequestId;

    /**
     * Bucket summary includes the 'namespace', 'name', 'compartmentId', 'createdBy', 'timeCreated',
     * and 'etag' fields. This parameter can also include 'approximateCount' (approximate number of objects), 'approximateSize'
     * (total approximate size in bytes of all objects) and 'autoTiering' (state of auto tiering on the bucket).
     * For example 'approximateCount,approximateSize,autoTiering'.
     *
     */
    private java.util.List<Fields> fields;

    /**
     * Bucket summary includes the 'namespace', 'name', 'compartmentId', 'createdBy', 'timeCreated',
     * and 'etag' fields. This parameter can also include 'approximateCount' (approximate number of objects), 'approximateSize'
     * (total approximate size in bytes of all objects) and 'autoTiering' (state of auto tiering on the bucket).
     * For example 'approximateCount,approximateSize,autoTiering'.
     *
     **/
    public enum Fields {
        ApproximateCount("approximateCount"),
        ApproximateSize("approximateSize"),
        AutoTiering("autoTiering"),
        ;

        private final String value;
        private static java.util.Map<String, Fields> map;

        static {
            map = new java.util.HashMap<>();
            for (Fields v : Fields.values()) {
                map.put(v.getValue(), v);
            }
        }

        Fields(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Fields create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid Fields: " + key);
        }
    };

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    GetBucketRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        private java.util.List<Fields> fields = null;

        /**
         * Bucket summary includes the 'namespace', 'name', 'compartmentId', 'createdBy', 'timeCreated',
         * and 'etag' fields. This parameter can also include 'approximateCount' (approximate number of objects), 'approximateSize'
         * (total approximate size in bytes of all objects) and 'autoTiering' (state of auto tiering on the bucket).
         * For example 'approximateCount,approximateSize,autoTiering'.
         *
         * @return this builder instance
         */
        public Builder fields(java.util.List<Fields> fields) {
            this.fields = fields;
            return this;
        }

        /**
         * Singular setter. Bucket summary includes the 'namespace', 'name', 'compartmentId', 'createdBy', 'timeCreated',
         * and 'etag' fields. This parameter can also include 'approximateCount' (approximate number of objects), 'approximateSize'
         * (total approximate size in bytes of all objects) and 'autoTiering' (state of auto tiering on the bucket).
         * For example 'approximateCount,approximateSize,autoTiering'.
         *
         * @return this builder instance
         */
        public Builder fields(Fields singularValue) {
            return this.fields(java.util.Arrays.asList(singularValue));
        }

        /**
         * Set the invocation callback for the request to be built.
         * @param invocationCallback the invocation callback to be set for the request
         * @return this builder instance
         */
        public Builder invocationCallback(
                com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                        invocationCallback) {
            this.invocationCallback = invocationCallback;
            return this;
        }

        /**
         * Set the retry configuration for the request to be built.
         * @param retryConfiguration the retry configuration to be used for the request
         * @return this builder instance
         */
        public Builder retryConfiguration(
                com.oracle.bmc.retrier.RetryConfiguration retryConfiguration) {
            this.retryConfiguration = retryConfiguration;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(GetBucketRequest o) {
            namespaceName(o.getNamespaceName());
            bucketName(o.getBucketName());
            ifMatch(o.getIfMatch());
            ifNoneMatch(o.getIfNoneMatch());
            opcClientRequestId(o.getOpcClientRequestId());
            fields(o.getFields());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GetBucketRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of GetBucketRequest
         */
        public GetBucketRequest build() {
            GetBucketRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }
    }
}
