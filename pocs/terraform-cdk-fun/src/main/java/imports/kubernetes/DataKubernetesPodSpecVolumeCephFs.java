package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.30.0 (build adae23f)", date = "2021-06-16T06:12:12.527Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.DataKubernetesPodSpecVolumeCephFs")
public class DataKubernetesPodSpecVolumeCephFs extends com.hashicorp.cdktf.ComplexComputedList {

    protected DataKubernetesPodSpecVolumeCephFs(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected DataKubernetesPodSpecVolumeCephFs(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource This parameter is required.
     * @param terraformAttribute This parameter is required.
     * @param complexComputedListIndex This parameter is required.
     */
    @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
    public DataKubernetesPodSpecVolumeCephFs(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.ITerraformResource terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute, final @org.jetbrains.annotations.NotNull java.lang.String complexComputedListIndex) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required"), java.util.Objects.requireNonNull(complexComputedListIndex, "complexComputedListIndex is required") });
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getMonitors() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "monitors", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getPath() {
        return software.amazon.jsii.Kernel.get(this, "path", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Boolean getReadOnly() {
        return software.amazon.jsii.Kernel.get(this, "readOnly", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getSecretFile() {
        return software.amazon.jsii.Kernel.get(this, "secretFile", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getSecretRef() {
        return software.amazon.jsii.Kernel.get(this, "secretRef", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getUser() {
        return software.amazon.jsii.Kernel.get(this, "user", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }
}
