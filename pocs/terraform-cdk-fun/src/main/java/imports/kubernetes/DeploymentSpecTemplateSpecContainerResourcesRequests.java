package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.30.0 (build adae23f)", date = "2021-06-16T06:12:12.559Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.DeploymentSpecTemplateSpecContainerResourcesRequests")
@software.amazon.jsii.Jsii.Proxy(DeploymentSpecTemplateSpecContainerResourcesRequests.Jsii$Proxy.class)
public interface DeploymentSpecTemplateSpecContainerResourcesRequests extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/kubernetes/r/deployment.html#cpu Deployment#cpu}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getCpu() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/kubernetes/r/deployment.html#memory Deployment#memory}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getMemory() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link DeploymentSpecTemplateSpecContainerResourcesRequests}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link DeploymentSpecTemplateSpecContainerResourcesRequests}
     */
    public static final class Builder implements software.amazon.jsii.Builder<DeploymentSpecTemplateSpecContainerResourcesRequests> {
        private java.lang.String cpu;
        private java.lang.String memory;

        /**
         * Sets the value of {@link DeploymentSpecTemplateSpecContainerResourcesRequests#getCpu}
         * @param cpu Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/kubernetes/r/deployment.html#cpu Deployment#cpu}.
         * @return {@code this}
         */
        public Builder cpu(java.lang.String cpu) {
            this.cpu = cpu;
            return this;
        }

        /**
         * Sets the value of {@link DeploymentSpecTemplateSpecContainerResourcesRequests#getMemory}
         * @param memory Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/kubernetes/r/deployment.html#memory Deployment#memory}.
         * @return {@code this}
         */
        public Builder memory(java.lang.String memory) {
            this.memory = memory;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link DeploymentSpecTemplateSpecContainerResourcesRequests}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public DeploymentSpecTemplateSpecContainerResourcesRequests build() {
            return new Jsii$Proxy(cpu, memory);
        }
    }

    /**
     * An implementation for {@link DeploymentSpecTemplateSpecContainerResourcesRequests}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements DeploymentSpecTemplateSpecContainerResourcesRequests {
        private final java.lang.String cpu;
        private final java.lang.String memory;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.cpu = software.amazon.jsii.Kernel.get(this, "cpu", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.memory = software.amazon.jsii.Kernel.get(this, "memory", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.String cpu, final java.lang.String memory) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.cpu = cpu;
            this.memory = memory;
        }

        @Override
        public final java.lang.String getCpu() {
            return this.cpu;
        }

        @Override
        public final java.lang.String getMemory() {
            return this.memory;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getCpu() != null) {
                data.set("cpu", om.valueToTree(this.getCpu()));
            }
            if (this.getMemory() != null) {
                data.set("memory", om.valueToTree(this.getMemory()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("kubernetes.DeploymentSpecTemplateSpecContainerResourcesRequests"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            DeploymentSpecTemplateSpecContainerResourcesRequests.Jsii$Proxy that = (DeploymentSpecTemplateSpecContainerResourcesRequests.Jsii$Proxy) o;

            if (this.cpu != null ? !this.cpu.equals(that.cpu) : that.cpu != null) return false;
            return this.memory != null ? this.memory.equals(that.memory) : that.memory == null;
        }

        @Override
        public final int hashCode() {
            int result = this.cpu != null ? this.cpu.hashCode() : 0;
            result = 31 * result + (this.memory != null ? this.memory.hashCode() : 0);
            return result;
        }
    }
}
