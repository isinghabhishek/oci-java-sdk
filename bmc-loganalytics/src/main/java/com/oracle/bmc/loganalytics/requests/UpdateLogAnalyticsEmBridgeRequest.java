/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.requests;

import com.oracle.bmc.loganalytics.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loganalytics/UpdateLogAnalyticsEmBridgeExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use UpdateLogAnalyticsEmBridgeRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@lombok.Builder(builderClassName = "Builder", buildMethodName = "buildWithoutInvocationCallback")
@lombok.Getter
public class UpdateLogAnalyticsEmBridgeRequest
        extends com.oracle.bmc.requests.BmcRequest<UpdateLogAnalyticsEmBridgeDetails> {

    /**
     * The Logging Analytics namespace used for the request.
     *
     */
    private String namespaceName;

    /**
     * The log analytics enterprise manager bridge OCID.
     *
     */
    private String logAnalyticsEmBridgeId;

    /**
     * Log analytics enterprise manager information to be updated.
     */
    private UpdateLogAnalyticsEmBridgeDetails updateLogAnalyticsEmBridgeDetails;

    /**
     * For optimistic concurrency control. In the PUT or DELETE call
     * for a resource, set the `if-match` parameter to the value of the
     * etag from a previous GET or POST response for that resource.
     * The resource will be updated or deleted only if the etag you
     * provide matches the resource's current etag value.
     *
     */
    private String ifMatch;

    /**
     * The client request ID for tracing.
     */
    private String opcRequestId;

    /**
     * Alternative accessor for the body parameter.
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public UpdateLogAnalyticsEmBridgeDetails getBody$() {
        return updateLogAnalyticsEmBridgeDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateLogAnalyticsEmBridgeRequest, UpdateLogAnalyticsEmBridgeDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

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
        public Builder copy(UpdateLogAnalyticsEmBridgeRequest o) {
            namespaceName(o.getNamespaceName());
            logAnalyticsEmBridgeId(o.getLogAnalyticsEmBridgeId());
            updateLogAnalyticsEmBridgeDetails(o.getUpdateLogAnalyticsEmBridgeDetails());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateLogAnalyticsEmBridgeRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of UpdateLogAnalyticsEmBridgeRequest
         */
        public UpdateLogAnalyticsEmBridgeRequest build() {
            UpdateLogAnalyticsEmBridgeRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Alternative setter for the body parameter.
         * @param body the body parameter
         * @return this builder instance
         */
        @com.oracle.bmc.InternalSdk
        public Builder body$(UpdateLogAnalyticsEmBridgeDetails body) {
            updateLogAnalyticsEmBridgeDetails(body);
            return this;
        }
    }
}
