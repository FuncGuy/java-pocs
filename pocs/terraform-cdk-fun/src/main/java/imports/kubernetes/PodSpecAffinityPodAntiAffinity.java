package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.30.0 (build adae23f)", date = "2021-06-16T06:12:12.717Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.PodSpecAffinityPodAntiAffinity")
@software.amazon.jsii.Jsii.Proxy(PodSpecAffinityPodAntiAffinity.Jsii$Proxy.class)
public interface PodSpecAffinityPodAntiAffinity extends software.amazon.jsii.JsiiSerializable {

    /**
     * preferred_during_scheduling_ignored_during_execution block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/pod.html#preferred_during_scheduling_ignored_during_execution Pod#preferred_during_scheduling_ignored_during_execution}
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.kubernetes.PodSpecAffinityPodAntiAffinityPreferredDuringSchedulingIgnoredDuringExecution> getPreferredDuringSchedulingIgnoredDuringExecution() {
        return null;
    }

    /**
     * required_during_scheduling_ignored_during_execution block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/pod.html#required_during_scheduling_ignored_during_execution Pod#required_during_scheduling_ignored_during_execution}
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.kubernetes.PodSpecAffinityPodAntiAffinityRequiredDuringSchedulingIgnoredDuringExecution> getRequiredDuringSchedulingIgnoredDuringExecution() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link PodSpecAffinityPodAntiAffinity}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link PodSpecAffinityPodAntiAffinity}
     */
    public static final class Builder implements software.amazon.jsii.Builder<PodSpecAffinityPodAntiAffinity> {
        private java.util.List<imports.kubernetes.PodSpecAffinityPodAntiAffinityPreferredDuringSchedulingIgnoredDuringExecution> preferredDuringSchedulingIgnoredDuringExecution;
        private java.util.List<imports.kubernetes.PodSpecAffinityPodAntiAffinityRequiredDuringSchedulingIgnoredDuringExecution> requiredDuringSchedulingIgnoredDuringExecution;

        /**
         * Sets the value of {@link PodSpecAffinityPodAntiAffinity#getPreferredDuringSchedulingIgnoredDuringExecution}
         * @param preferredDuringSchedulingIgnoredDuringExecution preferred_during_scheduling_ignored_during_execution block.
         *                                                        Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/pod.html#preferred_during_scheduling_ignored_during_execution Pod#preferred_during_scheduling_ignored_during_execution}
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder preferredDuringSchedulingIgnoredDuringExecution(java.util.List<? extends imports.kubernetes.PodSpecAffinityPodAntiAffinityPreferredDuringSchedulingIgnoredDuringExecution> preferredDuringSchedulingIgnoredDuringExecution) {
            this.preferredDuringSchedulingIgnoredDuringExecution = (java.util.List<imports.kubernetes.PodSpecAffinityPodAntiAffinityPreferredDuringSchedulingIgnoredDuringExecution>)preferredDuringSchedulingIgnoredDuringExecution;
            return this;
        }

        /**
         * Sets the value of {@link PodSpecAffinityPodAntiAffinity#getRequiredDuringSchedulingIgnoredDuringExecution}
         * @param requiredDuringSchedulingIgnoredDuringExecution required_during_scheduling_ignored_during_execution block.
         *                                                       Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/pod.html#required_during_scheduling_ignored_during_execution Pod#required_during_scheduling_ignored_during_execution}
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder requiredDuringSchedulingIgnoredDuringExecution(java.util.List<? extends imports.kubernetes.PodSpecAffinityPodAntiAffinityRequiredDuringSchedulingIgnoredDuringExecution> requiredDuringSchedulingIgnoredDuringExecution) {
            this.requiredDuringSchedulingIgnoredDuringExecution = (java.util.List<imports.kubernetes.PodSpecAffinityPodAntiAffinityRequiredDuringSchedulingIgnoredDuringExecution>)requiredDuringSchedulingIgnoredDuringExecution;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link PodSpecAffinityPodAntiAffinity}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public PodSpecAffinityPodAntiAffinity build() {
            return new Jsii$Proxy(preferredDuringSchedulingIgnoredDuringExecution, requiredDuringSchedulingIgnoredDuringExecution);
        }
    }

    /**
     * An implementation for {@link PodSpecAffinityPodAntiAffinity}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements PodSpecAffinityPodAntiAffinity {
        private final java.util.List<imports.kubernetes.PodSpecAffinityPodAntiAffinityPreferredDuringSchedulingIgnoredDuringExecution> preferredDuringSchedulingIgnoredDuringExecution;
        private final java.util.List<imports.kubernetes.PodSpecAffinityPodAntiAffinityRequiredDuringSchedulingIgnoredDuringExecution> requiredDuringSchedulingIgnoredDuringExecution;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.preferredDuringSchedulingIgnoredDuringExecution = software.amazon.jsii.Kernel.get(this, "preferredDuringSchedulingIgnoredDuringExecution", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.kubernetes.PodSpecAffinityPodAntiAffinityPreferredDuringSchedulingIgnoredDuringExecution.class)));
            this.requiredDuringSchedulingIgnoredDuringExecution = software.amazon.jsii.Kernel.get(this, "requiredDuringSchedulingIgnoredDuringExecution", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.kubernetes.PodSpecAffinityPodAntiAffinityRequiredDuringSchedulingIgnoredDuringExecution.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.util.List<? extends imports.kubernetes.PodSpecAffinityPodAntiAffinityPreferredDuringSchedulingIgnoredDuringExecution> preferredDuringSchedulingIgnoredDuringExecution, final java.util.List<? extends imports.kubernetes.PodSpecAffinityPodAntiAffinityRequiredDuringSchedulingIgnoredDuringExecution> requiredDuringSchedulingIgnoredDuringExecution) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.preferredDuringSchedulingIgnoredDuringExecution = (java.util.List<imports.kubernetes.PodSpecAffinityPodAntiAffinityPreferredDuringSchedulingIgnoredDuringExecution>)preferredDuringSchedulingIgnoredDuringExecution;
            this.requiredDuringSchedulingIgnoredDuringExecution = (java.util.List<imports.kubernetes.PodSpecAffinityPodAntiAffinityRequiredDuringSchedulingIgnoredDuringExecution>)requiredDuringSchedulingIgnoredDuringExecution;
        }

        @Override
        public final java.util.List<imports.kubernetes.PodSpecAffinityPodAntiAffinityPreferredDuringSchedulingIgnoredDuringExecution> getPreferredDuringSchedulingIgnoredDuringExecution() {
            return this.preferredDuringSchedulingIgnoredDuringExecution;
        }

        @Override
        public final java.util.List<imports.kubernetes.PodSpecAffinityPodAntiAffinityRequiredDuringSchedulingIgnoredDuringExecution> getRequiredDuringSchedulingIgnoredDuringExecution() {
            return this.requiredDuringSchedulingIgnoredDuringExecution;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getPreferredDuringSchedulingIgnoredDuringExecution() != null) {
                data.set("preferredDuringSchedulingIgnoredDuringExecution", om.valueToTree(this.getPreferredDuringSchedulingIgnoredDuringExecution()));
            }
            if (this.getRequiredDuringSchedulingIgnoredDuringExecution() != null) {
                data.set("requiredDuringSchedulingIgnoredDuringExecution", om.valueToTree(this.getRequiredDuringSchedulingIgnoredDuringExecution()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("kubernetes.PodSpecAffinityPodAntiAffinity"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            PodSpecAffinityPodAntiAffinity.Jsii$Proxy that = (PodSpecAffinityPodAntiAffinity.Jsii$Proxy) o;

            if (this.preferredDuringSchedulingIgnoredDuringExecution != null ? !this.preferredDuringSchedulingIgnoredDuringExecution.equals(that.preferredDuringSchedulingIgnoredDuringExecution) : that.preferredDuringSchedulingIgnoredDuringExecution != null) return false;
            return this.requiredDuringSchedulingIgnoredDuringExecution != null ? this.requiredDuringSchedulingIgnoredDuringExecution.equals(that.requiredDuringSchedulingIgnoredDuringExecution) : that.requiredDuringSchedulingIgnoredDuringExecution == null;
        }

        @Override
        public final int hashCode() {
            int result = this.preferredDuringSchedulingIgnoredDuringExecution != null ? this.preferredDuringSchedulingIgnoredDuringExecution.hashCode() : 0;
            result = 31 * result + (this.requiredDuringSchedulingIgnoredDuringExecution != null ? this.requiredDuringSchedulingIgnoredDuringExecution.hashCode() : 0);
            return result;
        }
    }
}
