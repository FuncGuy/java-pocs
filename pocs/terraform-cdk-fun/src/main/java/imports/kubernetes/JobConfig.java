package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.30.0 (build adae23f)", date = "2021-06-16T06:12:12.607Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.JobConfig")
@software.amazon.jsii.Jsii.Proxy(JobConfig.Jsii$Proxy.class)
public interface JobConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    /**
     * metadata block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/job.html#metadata Job#metadata}
     */
    @org.jetbrains.annotations.NotNull java.util.List<imports.kubernetes.JobMetadata> getMetadata();

    /**
     * spec block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/job.html#spec Job#spec}
     */
    @org.jetbrains.annotations.NotNull java.util.List<imports.kubernetes.JobSpec> getSpec();

    /**
     * timeouts block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/job.html#timeouts Job#timeouts}
     */
    default @org.jetbrains.annotations.Nullable imports.kubernetes.JobTimeouts getTimeouts() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/kubernetes/r/job.html#wait_for_completion Job#wait_for_completion}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getWaitForCompletion() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link JobConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link JobConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<JobConfig> {
        private java.util.List<imports.kubernetes.JobMetadata> metadata;
        private java.util.List<imports.kubernetes.JobSpec> spec;
        private imports.kubernetes.JobTimeouts timeouts;
        private java.lang.Boolean waitForCompletion;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link JobConfig#getMetadata}
         * @param metadata metadata block. This parameter is required.
         *                 Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/job.html#metadata Job#metadata}
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder metadata(java.util.List<? extends imports.kubernetes.JobMetadata> metadata) {
            this.metadata = (java.util.List<imports.kubernetes.JobMetadata>)metadata;
            return this;
        }

        /**
         * Sets the value of {@link JobConfig#getSpec}
         * @param spec spec block. This parameter is required.
         *             Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/job.html#spec Job#spec}
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder spec(java.util.List<? extends imports.kubernetes.JobSpec> spec) {
            this.spec = (java.util.List<imports.kubernetes.JobSpec>)spec;
            return this;
        }

        /**
         * Sets the value of {@link JobConfig#getTimeouts}
         * @param timeouts timeouts block.
         *                 Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/job.html#timeouts Job#timeouts}
         * @return {@code this}
         */
        public Builder timeouts(imports.kubernetes.JobTimeouts timeouts) {
            this.timeouts = timeouts;
            return this;
        }

        /**
         * Sets the value of {@link JobConfig#getWaitForCompletion}
         * @param waitForCompletion Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/kubernetes/r/job.html#wait_for_completion Job#wait_for_completion}.
         * @return {@code this}
         */
        public Builder waitForCompletion(java.lang.Boolean waitForCompletion) {
            this.waitForCompletion = waitForCompletion;
            return this;
        }

        /**
         * Sets the value of {@link JobConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link JobConfig#getDependsOn}
         * @param dependsOn the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        @SuppressWarnings("unchecked")
        public Builder dependsOn(java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn) {
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            return this;
        }

        /**
         * Sets the value of {@link JobConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link JobConfig#getProvider}
         * @param provider the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder provider(com.hashicorp.cdktf.TerraformProvider provider) {
            this.provider = provider;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link JobConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public JobConfig build() {
            return new Jsii$Proxy(metadata, spec, timeouts, waitForCompletion, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link JobConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements JobConfig {
        private final java.util.List<imports.kubernetes.JobMetadata> metadata;
        private final java.util.List<imports.kubernetes.JobSpec> spec;
        private final imports.kubernetes.JobTimeouts timeouts;
        private final java.lang.Boolean waitForCompletion;
        private final java.lang.Number count;
        private final java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private final com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.metadata = software.amazon.jsii.Kernel.get(this, "metadata", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.kubernetes.JobMetadata.class)));
            this.spec = software.amazon.jsii.Kernel.get(this, "spec", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.kubernetes.JobSpec.class)));
            this.timeouts = software.amazon.jsii.Kernel.get(this, "timeouts", software.amazon.jsii.NativeType.forClass(imports.kubernetes.JobTimeouts.class));
            this.waitForCompletion = software.amazon.jsii.Kernel.get(this, "waitForCompletion", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.util.List<? extends imports.kubernetes.JobMetadata> metadata, final java.util.List<? extends imports.kubernetes.JobSpec> spec, final imports.kubernetes.JobTimeouts timeouts, final java.lang.Boolean waitForCompletion, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.metadata = (java.util.List<imports.kubernetes.JobMetadata>)java.util.Objects.requireNonNull(metadata, "metadata is required");
            this.spec = (java.util.List<imports.kubernetes.JobSpec>)java.util.Objects.requireNonNull(spec, "spec is required");
            this.timeouts = timeouts;
            this.waitForCompletion = waitForCompletion;
            this.count = count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            this.lifecycle = lifecycle;
            this.provider = provider;
        }

        @Override
        public final java.util.List<imports.kubernetes.JobMetadata> getMetadata() {
            return this.metadata;
        }

        @Override
        public final java.util.List<imports.kubernetes.JobSpec> getSpec() {
            return this.spec;
        }

        @Override
        public final imports.kubernetes.JobTimeouts getTimeouts() {
            return this.timeouts;
        }

        @Override
        public final java.lang.Boolean getWaitForCompletion() {
            return this.waitForCompletion;
        }

        @Override
        public final java.lang.Number getCount() {
            return this.count;
        }

        @Override
        public final java.util.List<com.hashicorp.cdktf.ITerraformDependable> getDependsOn() {
            return this.dependsOn;
        }

        @Override
        public final com.hashicorp.cdktf.TerraformResourceLifecycle getLifecycle() {
            return this.lifecycle;
        }

        @Override
        public final com.hashicorp.cdktf.TerraformProvider getProvider() {
            return this.provider;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("metadata", om.valueToTree(this.getMetadata()));
            data.set("spec", om.valueToTree(this.getSpec()));
            if (this.getTimeouts() != null) {
                data.set("timeouts", om.valueToTree(this.getTimeouts()));
            }
            if (this.getWaitForCompletion() != null) {
                data.set("waitForCompletion", om.valueToTree(this.getWaitForCompletion()));
            }
            if (this.getCount() != null) {
                data.set("count", om.valueToTree(this.getCount()));
            }
            if (this.getDependsOn() != null) {
                data.set("dependsOn", om.valueToTree(this.getDependsOn()));
            }
            if (this.getLifecycle() != null) {
                data.set("lifecycle", om.valueToTree(this.getLifecycle()));
            }
            if (this.getProvider() != null) {
                data.set("provider", om.valueToTree(this.getProvider()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("kubernetes.JobConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            JobConfig.Jsii$Proxy that = (JobConfig.Jsii$Proxy) o;

            if (!metadata.equals(that.metadata)) return false;
            if (!spec.equals(that.spec)) return false;
            if (this.timeouts != null ? !this.timeouts.equals(that.timeouts) : that.timeouts != null) return false;
            if (this.waitForCompletion != null ? !this.waitForCompletion.equals(that.waitForCompletion) : that.waitForCompletion != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.metadata.hashCode();
            result = 31 * result + (this.spec.hashCode());
            result = 31 * result + (this.timeouts != null ? this.timeouts.hashCode() : 0);
            result = 31 * result + (this.waitForCompletion != null ? this.waitForCompletion.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            return result;
        }
    }
}
