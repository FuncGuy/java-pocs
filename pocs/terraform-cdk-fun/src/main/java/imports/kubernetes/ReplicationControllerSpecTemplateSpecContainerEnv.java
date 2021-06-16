package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.30.0 (build adae23f)", date = "2021-06-16T06:12:12.814Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.ReplicationControllerSpecTemplateSpecContainerEnv")
@software.amazon.jsii.Jsii.Proxy(ReplicationControllerSpecTemplateSpecContainerEnv.Jsii$Proxy.class)
public interface ReplicationControllerSpecTemplateSpecContainerEnv extends software.amazon.jsii.JsiiSerializable {

    /**
     * Name of the environment variable. Must be a C_IDENTIFIER.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/replication_controller.html#name ReplicationController#name}
     */
    @org.jetbrains.annotations.NotNull java.lang.String getName();

    /**
     * Variable references $(VAR_NAME) are expanded using the previous defined environment variables in the container and any service environment variables.
     * <p>
     * If a variable cannot be resolved, the reference in the input string will be unchanged. The $(VAR_NAME) syntax can be escaped with a double $$, ie: $$(VAR_NAME). Escaped references will never be expanded, regardless of whether the variable exists or not. Defaults to "".
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/replication_controller.html#value ReplicationController#value}
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getValue() {
        return null;
    }

    /**
     * value_from block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/replication_controller.html#value_from ReplicationController#value_from}
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.kubernetes.ReplicationControllerSpecTemplateSpecContainerEnvValueFrom> getValueFrom() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ReplicationControllerSpecTemplateSpecContainerEnv}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ReplicationControllerSpecTemplateSpecContainerEnv}
     */
    public static final class Builder implements software.amazon.jsii.Builder<ReplicationControllerSpecTemplateSpecContainerEnv> {
        private java.lang.String name;
        private java.lang.String value;
        private java.util.List<imports.kubernetes.ReplicationControllerSpecTemplateSpecContainerEnvValueFrom> valueFrom;

        /**
         * Sets the value of {@link ReplicationControllerSpecTemplateSpecContainerEnv#getName}
         * @param name Name of the environment variable. Must be a C_IDENTIFIER. This parameter is required.
         *             Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/replication_controller.html#name ReplicationController#name}
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link ReplicationControllerSpecTemplateSpecContainerEnv#getValue}
         * @param value Variable references $(VAR_NAME) are expanded using the previous defined environment variables in the container and any service environment variables.
         *              If a variable cannot be resolved, the reference in the input string will be unchanged. The $(VAR_NAME) syntax can be escaped with a double $$, ie: $$(VAR_NAME). Escaped references will never be expanded, regardless of whether the variable exists or not. Defaults to "".
         *              <p>
         *              Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/replication_controller.html#value ReplicationController#value}
         * @return {@code this}
         */
        public Builder value(java.lang.String value) {
            this.value = value;
            return this;
        }

        /**
         * Sets the value of {@link ReplicationControllerSpecTemplateSpecContainerEnv#getValueFrom}
         * @param valueFrom value_from block.
         *                  Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/replication_controller.html#value_from ReplicationController#value_from}
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder valueFrom(java.util.List<? extends imports.kubernetes.ReplicationControllerSpecTemplateSpecContainerEnvValueFrom> valueFrom) {
            this.valueFrom = (java.util.List<imports.kubernetes.ReplicationControllerSpecTemplateSpecContainerEnvValueFrom>)valueFrom;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ReplicationControllerSpecTemplateSpecContainerEnv}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public ReplicationControllerSpecTemplateSpecContainerEnv build() {
            return new Jsii$Proxy(name, value, valueFrom);
        }
    }

    /**
     * An implementation for {@link ReplicationControllerSpecTemplateSpecContainerEnv}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ReplicationControllerSpecTemplateSpecContainerEnv {
        private final java.lang.String name;
        private final java.lang.String value;
        private final java.util.List<imports.kubernetes.ReplicationControllerSpecTemplateSpecContainerEnvValueFrom> valueFrom;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.value = software.amazon.jsii.Kernel.get(this, "value", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.valueFrom = software.amazon.jsii.Kernel.get(this, "valueFrom", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.kubernetes.ReplicationControllerSpecTemplateSpecContainerEnvValueFrom.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.String name, final java.lang.String value, final java.util.List<? extends imports.kubernetes.ReplicationControllerSpecTemplateSpecContainerEnvValueFrom> valueFrom) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.name = java.util.Objects.requireNonNull(name, "name is required");
            this.value = value;
            this.valueFrom = (java.util.List<imports.kubernetes.ReplicationControllerSpecTemplateSpecContainerEnvValueFrom>)valueFrom;
        }

        @Override
        public final java.lang.String getName() {
            return this.name;
        }

        @Override
        public final java.lang.String getValue() {
            return this.value;
        }

        @Override
        public final java.util.List<imports.kubernetes.ReplicationControllerSpecTemplateSpecContainerEnvValueFrom> getValueFrom() {
            return this.valueFrom;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("name", om.valueToTree(this.getName()));
            if (this.getValue() != null) {
                data.set("value", om.valueToTree(this.getValue()));
            }
            if (this.getValueFrom() != null) {
                data.set("valueFrom", om.valueToTree(this.getValueFrom()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("kubernetes.ReplicationControllerSpecTemplateSpecContainerEnv"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ReplicationControllerSpecTemplateSpecContainerEnv.Jsii$Proxy that = (ReplicationControllerSpecTemplateSpecContainerEnv.Jsii$Proxy) o;

            if (!name.equals(that.name)) return false;
            if (this.value != null ? !this.value.equals(that.value) : that.value != null) return false;
            return this.valueFrom != null ? this.valueFrom.equals(that.valueFrom) : that.valueFrom == null;
        }

        @Override
        public final int hashCode() {
            int result = this.name.hashCode();
            result = 31 * result + (this.value != null ? this.value.hashCode() : 0);
            result = 31 * result + (this.valueFrom != null ? this.valueFrom.hashCode() : 0);
            return result;
        }
    }
}
