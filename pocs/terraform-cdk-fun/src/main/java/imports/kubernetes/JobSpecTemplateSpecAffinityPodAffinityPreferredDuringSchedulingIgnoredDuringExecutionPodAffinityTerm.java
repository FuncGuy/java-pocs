package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.30.0 (build adae23f)", date = "2021-06-16T06:12:12.611Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.JobSpecTemplateSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTerm")
@software.amazon.jsii.Jsii.Proxy(JobSpecTemplateSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTerm.Jsii$Proxy.class)
public interface JobSpecTemplateSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTerm extends software.amazon.jsii.JsiiSerializable {

    /**
     * label_selector block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/job.html#label_selector Job#label_selector}
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.kubernetes.JobSpecTemplateSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTermLabelSelector> getLabelSelector() {
        return null;
    }

    /**
     * namespaces specifies which namespaces the labelSelector applies to (matches against); null or empty list means 'this pod's namespace'.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/job.html#namespaces Job#namespaces}
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getNamespaces() {
        return null;
    }

    /**
     * empty topology key is interpreted by the scheduler as 'all topologies'.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/job.html#topology_key Job#topology_key}
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getTopologyKey() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link JobSpecTemplateSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTerm}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link JobSpecTemplateSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTerm}
     */
    public static final class Builder implements software.amazon.jsii.Builder<JobSpecTemplateSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTerm> {
        private java.util.List<imports.kubernetes.JobSpecTemplateSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTermLabelSelector> labelSelector;
        private java.util.List<java.lang.String> namespaces;
        private java.lang.String topologyKey;

        /**
         * Sets the value of {@link JobSpecTemplateSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTerm#getLabelSelector}
         * @param labelSelector label_selector block.
         *                      Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/job.html#label_selector Job#label_selector}
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder labelSelector(java.util.List<? extends imports.kubernetes.JobSpecTemplateSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTermLabelSelector> labelSelector) {
            this.labelSelector = (java.util.List<imports.kubernetes.JobSpecTemplateSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTermLabelSelector>)labelSelector;
            return this;
        }

        /**
         * Sets the value of {@link JobSpecTemplateSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTerm#getNamespaces}
         * @param namespaces namespaces specifies which namespaces the labelSelector applies to (matches against); null or empty list means 'this pod's namespace'.
         *                   Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/job.html#namespaces Job#namespaces}
         * @return {@code this}
         */
        public Builder namespaces(java.util.List<java.lang.String> namespaces) {
            this.namespaces = namespaces;
            return this;
        }

        /**
         * Sets the value of {@link JobSpecTemplateSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTerm#getTopologyKey}
         * @param topologyKey empty topology key is interpreted by the scheduler as 'all topologies'.
         *                    Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/job.html#topology_key Job#topology_key}
         * @return {@code this}
         */
        public Builder topologyKey(java.lang.String topologyKey) {
            this.topologyKey = topologyKey;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link JobSpecTemplateSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTerm}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public JobSpecTemplateSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTerm build() {
            return new Jsii$Proxy(labelSelector, namespaces, topologyKey);
        }
    }

    /**
     * An implementation for {@link JobSpecTemplateSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTerm}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements JobSpecTemplateSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTerm {
        private final java.util.List<imports.kubernetes.JobSpecTemplateSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTermLabelSelector> labelSelector;
        private final java.util.List<java.lang.String> namespaces;
        private final java.lang.String topologyKey;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.labelSelector = software.amazon.jsii.Kernel.get(this, "labelSelector", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.kubernetes.JobSpecTemplateSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTermLabelSelector.class)));
            this.namespaces = software.amazon.jsii.Kernel.get(this, "namespaces", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.topologyKey = software.amazon.jsii.Kernel.get(this, "topologyKey", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.util.List<? extends imports.kubernetes.JobSpecTemplateSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTermLabelSelector> labelSelector, final java.util.List<java.lang.String> namespaces, final java.lang.String topologyKey) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.labelSelector = (java.util.List<imports.kubernetes.JobSpecTemplateSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTermLabelSelector>)labelSelector;
            this.namespaces = namespaces;
            this.topologyKey = topologyKey;
        }

        @Override
        public final java.util.List<imports.kubernetes.JobSpecTemplateSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTermLabelSelector> getLabelSelector() {
            return this.labelSelector;
        }

        @Override
        public final java.util.List<java.lang.String> getNamespaces() {
            return this.namespaces;
        }

        @Override
        public final java.lang.String getTopologyKey() {
            return this.topologyKey;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getLabelSelector() != null) {
                data.set("labelSelector", om.valueToTree(this.getLabelSelector()));
            }
            if (this.getNamespaces() != null) {
                data.set("namespaces", om.valueToTree(this.getNamespaces()));
            }
            if (this.getTopologyKey() != null) {
                data.set("topologyKey", om.valueToTree(this.getTopologyKey()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("kubernetes.JobSpecTemplateSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTerm"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            JobSpecTemplateSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTerm.Jsii$Proxy that = (JobSpecTemplateSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTerm.Jsii$Proxy) o;

            if (this.labelSelector != null ? !this.labelSelector.equals(that.labelSelector) : that.labelSelector != null) return false;
            if (this.namespaces != null ? !this.namespaces.equals(that.namespaces) : that.namespaces != null) return false;
            return this.topologyKey != null ? this.topologyKey.equals(that.topologyKey) : that.topologyKey == null;
        }

        @Override
        public final int hashCode() {
            int result = this.labelSelector != null ? this.labelSelector.hashCode() : 0;
            result = 31 * result + (this.namespaces != null ? this.namespaces.hashCode() : 0);
            result = 31 * result + (this.topologyKey != null ? this.topologyKey.hashCode() : 0);
            return result;
        }
    }
}
