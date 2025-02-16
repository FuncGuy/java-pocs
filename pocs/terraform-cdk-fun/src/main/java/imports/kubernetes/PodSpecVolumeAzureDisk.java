package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.30.0 (build adae23f)", date = "2021-06-16T06:12:12.754Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.PodSpecVolumeAzureDisk")
@software.amazon.jsii.Jsii.Proxy(PodSpecVolumeAzureDisk.Jsii$Proxy.class)
public interface PodSpecVolumeAzureDisk extends software.amazon.jsii.JsiiSerializable {

    /**
     * Host Caching mode: None, Read Only, Read Write.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/pod.html#caching_mode Pod#caching_mode}
     */
    @org.jetbrains.annotations.NotNull java.lang.String getCachingMode();

    /**
     * The URI the data disk in the blob storage.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/pod.html#data_disk_uri Pod#data_disk_uri}
     */
    @org.jetbrains.annotations.NotNull java.lang.String getDataDiskUri();

    /**
     * The Name of the data disk in the blob storage.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/pod.html#disk_name Pod#disk_name}
     */
    @org.jetbrains.annotations.NotNull java.lang.String getDiskName();

    /**
     * Filesystem type to mount.
     * <p>
     * Must be a filesystem type supported by the host operating system. Ex. "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/pod.html#fs_type Pod#fs_type}
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getFsType() {
        return null;
    }

    /**
     * Whether to force the read-only setting in VolumeMounts. Defaults to false (read/write).
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/pod.html#read_only Pod#read_only}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getReadOnly() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link PodSpecVolumeAzureDisk}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link PodSpecVolumeAzureDisk}
     */
    public static final class Builder implements software.amazon.jsii.Builder<PodSpecVolumeAzureDisk> {
        private java.lang.String cachingMode;
        private java.lang.String dataDiskUri;
        private java.lang.String diskName;
        private java.lang.String fsType;
        private java.lang.Boolean readOnly;

        /**
         * Sets the value of {@link PodSpecVolumeAzureDisk#getCachingMode}
         * @param cachingMode Host Caching mode: None, Read Only, Read Write. This parameter is required.
         *                    Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/pod.html#caching_mode Pod#caching_mode}
         * @return {@code this}
         */
        public Builder cachingMode(java.lang.String cachingMode) {
            this.cachingMode = cachingMode;
            return this;
        }

        /**
         * Sets the value of {@link PodSpecVolumeAzureDisk#getDataDiskUri}
         * @param dataDiskUri The URI the data disk in the blob storage. This parameter is required.
         *                    Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/pod.html#data_disk_uri Pod#data_disk_uri}
         * @return {@code this}
         */
        public Builder dataDiskUri(java.lang.String dataDiskUri) {
            this.dataDiskUri = dataDiskUri;
            return this;
        }

        /**
         * Sets the value of {@link PodSpecVolumeAzureDisk#getDiskName}
         * @param diskName The Name of the data disk in the blob storage. This parameter is required.
         *                 Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/pod.html#disk_name Pod#disk_name}
         * @return {@code this}
         */
        public Builder diskName(java.lang.String diskName) {
            this.diskName = diskName;
            return this;
        }

        /**
         * Sets the value of {@link PodSpecVolumeAzureDisk#getFsType}
         * @param fsType Filesystem type to mount.
         *               Must be a filesystem type supported by the host operating system. Ex. "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified.
         *               <p>
         *               Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/pod.html#fs_type Pod#fs_type}
         * @return {@code this}
         */
        public Builder fsType(java.lang.String fsType) {
            this.fsType = fsType;
            return this;
        }

        /**
         * Sets the value of {@link PodSpecVolumeAzureDisk#getReadOnly}
         * @param readOnly Whether to force the read-only setting in VolumeMounts. Defaults to false (read/write).
         *                 Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/pod.html#read_only Pod#read_only}
         * @return {@code this}
         */
        public Builder readOnly(java.lang.Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link PodSpecVolumeAzureDisk}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public PodSpecVolumeAzureDisk build() {
            return new Jsii$Proxy(cachingMode, dataDiskUri, diskName, fsType, readOnly);
        }
    }

    /**
     * An implementation for {@link PodSpecVolumeAzureDisk}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements PodSpecVolumeAzureDisk {
        private final java.lang.String cachingMode;
        private final java.lang.String dataDiskUri;
        private final java.lang.String diskName;
        private final java.lang.String fsType;
        private final java.lang.Boolean readOnly;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.cachingMode = software.amazon.jsii.Kernel.get(this, "cachingMode", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.dataDiskUri = software.amazon.jsii.Kernel.get(this, "dataDiskUri", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.diskName = software.amazon.jsii.Kernel.get(this, "diskName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.fsType = software.amazon.jsii.Kernel.get(this, "fsType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.readOnly = software.amazon.jsii.Kernel.get(this, "readOnly", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.String cachingMode, final java.lang.String dataDiskUri, final java.lang.String diskName, final java.lang.String fsType, final java.lang.Boolean readOnly) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.cachingMode = java.util.Objects.requireNonNull(cachingMode, "cachingMode is required");
            this.dataDiskUri = java.util.Objects.requireNonNull(dataDiskUri, "dataDiskUri is required");
            this.diskName = java.util.Objects.requireNonNull(diskName, "diskName is required");
            this.fsType = fsType;
            this.readOnly = readOnly;
        }

        @Override
        public final java.lang.String getCachingMode() {
            return this.cachingMode;
        }

        @Override
        public final java.lang.String getDataDiskUri() {
            return this.dataDiskUri;
        }

        @Override
        public final java.lang.String getDiskName() {
            return this.diskName;
        }

        @Override
        public final java.lang.String getFsType() {
            return this.fsType;
        }

        @Override
        public final java.lang.Boolean getReadOnly() {
            return this.readOnly;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("cachingMode", om.valueToTree(this.getCachingMode()));
            data.set("dataDiskUri", om.valueToTree(this.getDataDiskUri()));
            data.set("diskName", om.valueToTree(this.getDiskName()));
            if (this.getFsType() != null) {
                data.set("fsType", om.valueToTree(this.getFsType()));
            }
            if (this.getReadOnly() != null) {
                data.set("readOnly", om.valueToTree(this.getReadOnly()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("kubernetes.PodSpecVolumeAzureDisk"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            PodSpecVolumeAzureDisk.Jsii$Proxy that = (PodSpecVolumeAzureDisk.Jsii$Proxy) o;

            if (!cachingMode.equals(that.cachingMode)) return false;
            if (!dataDiskUri.equals(that.dataDiskUri)) return false;
            if (!diskName.equals(that.diskName)) return false;
            if (this.fsType != null ? !this.fsType.equals(that.fsType) : that.fsType != null) return false;
            return this.readOnly != null ? this.readOnly.equals(that.readOnly) : that.readOnly == null;
        }

        @Override
        public final int hashCode() {
            int result = this.cachingMode.hashCode();
            result = 31 * result + (this.dataDiskUri.hashCode());
            result = 31 * result + (this.diskName.hashCode());
            result = 31 * result + (this.fsType != null ? this.fsType.hashCode() : 0);
            result = 31 * result + (this.readOnly != null ? this.readOnly.hashCode() : 0);
            return result;
        }
    }
}
