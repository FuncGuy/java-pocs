package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.30.0 (build adae23f)", date = "2021-06-16T06:12:12.524Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.DataKubernetesPodSpecInitContainerReadinessProbeTcpSocket")
public class DataKubernetesPodSpecInitContainerReadinessProbeTcpSocket extends com.hashicorp.cdktf.ComplexComputedList {

    protected DataKubernetesPodSpecInitContainerReadinessProbeTcpSocket(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected DataKubernetesPodSpecInitContainerReadinessProbeTcpSocket(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource This parameter is required.
     * @param terraformAttribute This parameter is required.
     * @param complexComputedListIndex This parameter is required.
     */
    @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
    public DataKubernetesPodSpecInitContainerReadinessProbeTcpSocket(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.ITerraformResource terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute, final @org.jetbrains.annotations.NotNull java.lang.String complexComputedListIndex) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required"), java.util.Objects.requireNonNull(complexComputedListIndex, "complexComputedListIndex is required") });
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getPort() {
        return software.amazon.jsii.Kernel.get(this, "port", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }
}
