package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.30.0 (build adae23f)", date = "2021-06-16T06:12:12.936Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.StatefulSetSpecTemplateSpecInitContainerEnvValueFrom")
@software.amazon.jsii.Jsii.Proxy(StatefulSetSpecTemplateSpecInitContainerEnvValueFrom.Jsii$Proxy.class)
public interface StatefulSetSpecTemplateSpecInitContainerEnvValueFrom extends software.amazon.jsii.JsiiSerializable {

    /**
     * config_map_key_ref block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/stateful_set.html#config_map_key_ref StatefulSet#config_map_key_ref}
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.kubernetes.StatefulSetSpecTemplateSpecInitContainerEnvValueFromConfigMapKeyRef> getConfigMapKeyRef() {
        return null;
    }

    /**
     * field_ref block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/stateful_set.html#field_ref StatefulSet#field_ref}
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.kubernetes.StatefulSetSpecTemplateSpecInitContainerEnvValueFromFieldRef> getFieldRef() {
        return null;
    }

    /**
     * resource_field_ref block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/stateful_set.html#resource_field_ref StatefulSet#resource_field_ref}
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.kubernetes.StatefulSetSpecTemplateSpecInitContainerEnvValueFromResourceFieldRef> getResourceFieldRef() {
        return null;
    }

    /**
     * secret_key_ref block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/stateful_set.html#secret_key_ref StatefulSet#secret_key_ref}
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.kubernetes.StatefulSetSpecTemplateSpecInitContainerEnvValueFromSecretKeyRef> getSecretKeyRef() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link StatefulSetSpecTemplateSpecInitContainerEnvValueFrom}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link StatefulSetSpecTemplateSpecInitContainerEnvValueFrom}
     */
    public static final class Builder implements software.amazon.jsii.Builder<StatefulSetSpecTemplateSpecInitContainerEnvValueFrom> {
        private java.util.List<imports.kubernetes.StatefulSetSpecTemplateSpecInitContainerEnvValueFromConfigMapKeyRef> configMapKeyRef;
        private java.util.List<imports.kubernetes.StatefulSetSpecTemplateSpecInitContainerEnvValueFromFieldRef> fieldRef;
        private java.util.List<imports.kubernetes.StatefulSetSpecTemplateSpecInitContainerEnvValueFromResourceFieldRef> resourceFieldRef;
        private java.util.List<imports.kubernetes.StatefulSetSpecTemplateSpecInitContainerEnvValueFromSecretKeyRef> secretKeyRef;

        /**
         * Sets the value of {@link StatefulSetSpecTemplateSpecInitContainerEnvValueFrom#getConfigMapKeyRef}
         * @param configMapKeyRef config_map_key_ref block.
         *                        Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/stateful_set.html#config_map_key_ref StatefulSet#config_map_key_ref}
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder configMapKeyRef(java.util.List<? extends imports.kubernetes.StatefulSetSpecTemplateSpecInitContainerEnvValueFromConfigMapKeyRef> configMapKeyRef) {
            this.configMapKeyRef = (java.util.List<imports.kubernetes.StatefulSetSpecTemplateSpecInitContainerEnvValueFromConfigMapKeyRef>)configMapKeyRef;
            return this;
        }

        /**
         * Sets the value of {@link StatefulSetSpecTemplateSpecInitContainerEnvValueFrom#getFieldRef}
         * @param fieldRef field_ref block.
         *                 Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/stateful_set.html#field_ref StatefulSet#field_ref}
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder fieldRef(java.util.List<? extends imports.kubernetes.StatefulSetSpecTemplateSpecInitContainerEnvValueFromFieldRef> fieldRef) {
            this.fieldRef = (java.util.List<imports.kubernetes.StatefulSetSpecTemplateSpecInitContainerEnvValueFromFieldRef>)fieldRef;
            return this;
        }

        /**
         * Sets the value of {@link StatefulSetSpecTemplateSpecInitContainerEnvValueFrom#getResourceFieldRef}
         * @param resourceFieldRef resource_field_ref block.
         *                         Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/stateful_set.html#resource_field_ref StatefulSet#resource_field_ref}
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder resourceFieldRef(java.util.List<? extends imports.kubernetes.StatefulSetSpecTemplateSpecInitContainerEnvValueFromResourceFieldRef> resourceFieldRef) {
            this.resourceFieldRef = (java.util.List<imports.kubernetes.StatefulSetSpecTemplateSpecInitContainerEnvValueFromResourceFieldRef>)resourceFieldRef;
            return this;
        }

        /**
         * Sets the value of {@link StatefulSetSpecTemplateSpecInitContainerEnvValueFrom#getSecretKeyRef}
         * @param secretKeyRef secret_key_ref block.
         *                     Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/stateful_set.html#secret_key_ref StatefulSet#secret_key_ref}
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder secretKeyRef(java.util.List<? extends imports.kubernetes.StatefulSetSpecTemplateSpecInitContainerEnvValueFromSecretKeyRef> secretKeyRef) {
            this.secretKeyRef = (java.util.List<imports.kubernetes.StatefulSetSpecTemplateSpecInitContainerEnvValueFromSecretKeyRef>)secretKeyRef;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link StatefulSetSpecTemplateSpecInitContainerEnvValueFrom}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public StatefulSetSpecTemplateSpecInitContainerEnvValueFrom build() {
            return new Jsii$Proxy(configMapKeyRef, fieldRef, resourceFieldRef, secretKeyRef);
        }
    }

    /**
     * An implementation for {@link StatefulSetSpecTemplateSpecInitContainerEnvValueFrom}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements StatefulSetSpecTemplateSpecInitContainerEnvValueFrom {
        private final java.util.List<imports.kubernetes.StatefulSetSpecTemplateSpecInitContainerEnvValueFromConfigMapKeyRef> configMapKeyRef;
        private final java.util.List<imports.kubernetes.StatefulSetSpecTemplateSpecInitContainerEnvValueFromFieldRef> fieldRef;
        private final java.util.List<imports.kubernetes.StatefulSetSpecTemplateSpecInitContainerEnvValueFromResourceFieldRef> resourceFieldRef;
        private final java.util.List<imports.kubernetes.StatefulSetSpecTemplateSpecInitContainerEnvValueFromSecretKeyRef> secretKeyRef;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.configMapKeyRef = software.amazon.jsii.Kernel.get(this, "configMapKeyRef", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.kubernetes.StatefulSetSpecTemplateSpecInitContainerEnvValueFromConfigMapKeyRef.class)));
            this.fieldRef = software.amazon.jsii.Kernel.get(this, "fieldRef", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.kubernetes.StatefulSetSpecTemplateSpecInitContainerEnvValueFromFieldRef.class)));
            this.resourceFieldRef = software.amazon.jsii.Kernel.get(this, "resourceFieldRef", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.kubernetes.StatefulSetSpecTemplateSpecInitContainerEnvValueFromResourceFieldRef.class)));
            this.secretKeyRef = software.amazon.jsii.Kernel.get(this, "secretKeyRef", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.kubernetes.StatefulSetSpecTemplateSpecInitContainerEnvValueFromSecretKeyRef.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.util.List<? extends imports.kubernetes.StatefulSetSpecTemplateSpecInitContainerEnvValueFromConfigMapKeyRef> configMapKeyRef, final java.util.List<? extends imports.kubernetes.StatefulSetSpecTemplateSpecInitContainerEnvValueFromFieldRef> fieldRef, final java.util.List<? extends imports.kubernetes.StatefulSetSpecTemplateSpecInitContainerEnvValueFromResourceFieldRef> resourceFieldRef, final java.util.List<? extends imports.kubernetes.StatefulSetSpecTemplateSpecInitContainerEnvValueFromSecretKeyRef> secretKeyRef) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.configMapKeyRef = (java.util.List<imports.kubernetes.StatefulSetSpecTemplateSpecInitContainerEnvValueFromConfigMapKeyRef>)configMapKeyRef;
            this.fieldRef = (java.util.List<imports.kubernetes.StatefulSetSpecTemplateSpecInitContainerEnvValueFromFieldRef>)fieldRef;
            this.resourceFieldRef = (java.util.List<imports.kubernetes.StatefulSetSpecTemplateSpecInitContainerEnvValueFromResourceFieldRef>)resourceFieldRef;
            this.secretKeyRef = (java.util.List<imports.kubernetes.StatefulSetSpecTemplateSpecInitContainerEnvValueFromSecretKeyRef>)secretKeyRef;
        }

        @Override
        public final java.util.List<imports.kubernetes.StatefulSetSpecTemplateSpecInitContainerEnvValueFromConfigMapKeyRef> getConfigMapKeyRef() {
            return this.configMapKeyRef;
        }

        @Override
        public final java.util.List<imports.kubernetes.StatefulSetSpecTemplateSpecInitContainerEnvValueFromFieldRef> getFieldRef() {
            return this.fieldRef;
        }

        @Override
        public final java.util.List<imports.kubernetes.StatefulSetSpecTemplateSpecInitContainerEnvValueFromResourceFieldRef> getResourceFieldRef() {
            return this.resourceFieldRef;
        }

        @Override
        public final java.util.List<imports.kubernetes.StatefulSetSpecTemplateSpecInitContainerEnvValueFromSecretKeyRef> getSecretKeyRef() {
            return this.secretKeyRef;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getConfigMapKeyRef() != null) {
                data.set("configMapKeyRef", om.valueToTree(this.getConfigMapKeyRef()));
            }
            if (this.getFieldRef() != null) {
                data.set("fieldRef", om.valueToTree(this.getFieldRef()));
            }
            if (this.getResourceFieldRef() != null) {
                data.set("resourceFieldRef", om.valueToTree(this.getResourceFieldRef()));
            }
            if (this.getSecretKeyRef() != null) {
                data.set("secretKeyRef", om.valueToTree(this.getSecretKeyRef()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("kubernetes.StatefulSetSpecTemplateSpecInitContainerEnvValueFrom"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            StatefulSetSpecTemplateSpecInitContainerEnvValueFrom.Jsii$Proxy that = (StatefulSetSpecTemplateSpecInitContainerEnvValueFrom.Jsii$Proxy) o;

            if (this.configMapKeyRef != null ? !this.configMapKeyRef.equals(that.configMapKeyRef) : that.configMapKeyRef != null) return false;
            if (this.fieldRef != null ? !this.fieldRef.equals(that.fieldRef) : that.fieldRef != null) return false;
            if (this.resourceFieldRef != null ? !this.resourceFieldRef.equals(that.resourceFieldRef) : that.resourceFieldRef != null) return false;
            return this.secretKeyRef != null ? this.secretKeyRef.equals(that.secretKeyRef) : that.secretKeyRef == null;
        }

        @Override
        public final int hashCode() {
            int result = this.configMapKeyRef != null ? this.configMapKeyRef.hashCode() : 0;
            result = 31 * result + (this.fieldRef != null ? this.fieldRef.hashCode() : 0);
            result = 31 * result + (this.resourceFieldRef != null ? this.resourceFieldRef.hashCode() : 0);
            result = 31 * result + (this.secretKeyRef != null ? this.secretKeyRef.hashCode() : 0);
            return result;
        }
    }
}
