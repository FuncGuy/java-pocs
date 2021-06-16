package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.30.0 (build adae23f)", date = "2021-06-16T06:12:12.715Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.PodSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionPreference")
@software.amazon.jsii.Jsii.Proxy(PodSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionPreference.Jsii$Proxy.class)
public interface PodSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionPreference extends software.amazon.jsii.JsiiSerializable {

    /**
     * match_expressions block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/pod.html#match_expressions Pod#match_expressions}
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.kubernetes.PodSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionPreferenceMatchExpressions> getMatchExpressions() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link PodSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionPreference}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link PodSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionPreference}
     */
    public static final class Builder implements software.amazon.jsii.Builder<PodSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionPreference> {
        private java.util.List<imports.kubernetes.PodSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionPreferenceMatchExpressions> matchExpressions;

        /**
         * Sets the value of {@link PodSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionPreference#getMatchExpressions}
         * @param matchExpressions match_expressions block.
         *                         Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/pod.html#match_expressions Pod#match_expressions}
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder matchExpressions(java.util.List<? extends imports.kubernetes.PodSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionPreferenceMatchExpressions> matchExpressions) {
            this.matchExpressions = (java.util.List<imports.kubernetes.PodSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionPreferenceMatchExpressions>)matchExpressions;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link PodSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionPreference}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public PodSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionPreference build() {
            return new Jsii$Proxy(matchExpressions);
        }
    }

    /**
     * An implementation for {@link PodSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionPreference}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements PodSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionPreference {
        private final java.util.List<imports.kubernetes.PodSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionPreferenceMatchExpressions> matchExpressions;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.matchExpressions = software.amazon.jsii.Kernel.get(this, "matchExpressions", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.kubernetes.PodSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionPreferenceMatchExpressions.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.util.List<? extends imports.kubernetes.PodSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionPreferenceMatchExpressions> matchExpressions) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.matchExpressions = (java.util.List<imports.kubernetes.PodSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionPreferenceMatchExpressions>)matchExpressions;
        }

        @Override
        public final java.util.List<imports.kubernetes.PodSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionPreferenceMatchExpressions> getMatchExpressions() {
            return this.matchExpressions;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getMatchExpressions() != null) {
                data.set("matchExpressions", om.valueToTree(this.getMatchExpressions()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("kubernetes.PodSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionPreference"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            PodSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionPreference.Jsii$Proxy that = (PodSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionPreference.Jsii$Proxy) o;

            return this.matchExpressions != null ? this.matchExpressions.equals(that.matchExpressions) : that.matchExpressions == null;
        }

        @Override
        public final int hashCode() {
            int result = this.matchExpressions != null ? this.matchExpressions.hashCode() : 0;
            return result;
        }
    }
}
