package imports.kubernetes;

@javax.annotation.Generated(value = "jsii-pacmak/1.30.0 (build adae23f)", date = "2021-06-16T06:12:12.659Z")
@software.amazon.jsii.Jsii(module = imports.kubernetes.$Module.class, fqn = "kubernetes.JobSpecTemplateSpecVolumeGitRepo")
@software.amazon.jsii.Jsii.Proxy(JobSpecTemplateSpecVolumeGitRepo.Jsii$Proxy.class)
public interface JobSpecTemplateSpecVolumeGitRepo extends software.amazon.jsii.JsiiSerializable {

    /**
     * Target directory name.
     * <p>
     * Must not contain or start with '..'. If '.' is supplied, the volume directory will be the git repository. Otherwise, if specified, the volume will contain the git repository in the subdirectory with the given name.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/job.html#directory Job#directory}
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getDirectory() {
        return null;
    }

    /**
     * Repository URL.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/job.html#repository Job#repository}
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getRepository() {
        return null;
    }

    /**
     * Commit hash for the specified revision.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/job.html#revision Job#revision}
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getRevision() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link JobSpecTemplateSpecVolumeGitRepo}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link JobSpecTemplateSpecVolumeGitRepo}
     */
    public static final class Builder implements software.amazon.jsii.Builder<JobSpecTemplateSpecVolumeGitRepo> {
        private java.lang.String directory;
        private java.lang.String repository;
        private java.lang.String revision;

        /**
         * Sets the value of {@link JobSpecTemplateSpecVolumeGitRepo#getDirectory}
         * @param directory Target directory name.
         *                  Must not contain or start with '..'. If '.' is supplied, the volume directory will be the git repository. Otherwise, if specified, the volume will contain the git repository in the subdirectory with the given name.
         *                  <p>
         *                  Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/job.html#directory Job#directory}
         * @return {@code this}
         */
        public Builder directory(java.lang.String directory) {
            this.directory = directory;
            return this;
        }

        /**
         * Sets the value of {@link JobSpecTemplateSpecVolumeGitRepo#getRepository}
         * @param repository Repository URL.
         *                   Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/job.html#repository Job#repository}
         * @return {@code this}
         */
        public Builder repository(java.lang.String repository) {
            this.repository = repository;
            return this;
        }

        /**
         * Sets the value of {@link JobSpecTemplateSpecVolumeGitRepo#getRevision}
         * @param revision Commit hash for the specified revision.
         *                 Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kubernetes/r/job.html#revision Job#revision}
         * @return {@code this}
         */
        public Builder revision(java.lang.String revision) {
            this.revision = revision;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link JobSpecTemplateSpecVolumeGitRepo}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public JobSpecTemplateSpecVolumeGitRepo build() {
            return new Jsii$Proxy(directory, repository, revision);
        }
    }

    /**
     * An implementation for {@link JobSpecTemplateSpecVolumeGitRepo}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements JobSpecTemplateSpecVolumeGitRepo {
        private final java.lang.String directory;
        private final java.lang.String repository;
        private final java.lang.String revision;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.directory = software.amazon.jsii.Kernel.get(this, "directory", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.repository = software.amazon.jsii.Kernel.get(this, "repository", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.revision = software.amazon.jsii.Kernel.get(this, "revision", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.String directory, final java.lang.String repository, final java.lang.String revision) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.directory = directory;
            this.repository = repository;
            this.revision = revision;
        }

        @Override
        public final java.lang.String getDirectory() {
            return this.directory;
        }

        @Override
        public final java.lang.String getRepository() {
            return this.repository;
        }

        @Override
        public final java.lang.String getRevision() {
            return this.revision;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getDirectory() != null) {
                data.set("directory", om.valueToTree(this.getDirectory()));
            }
            if (this.getRepository() != null) {
                data.set("repository", om.valueToTree(this.getRepository()));
            }
            if (this.getRevision() != null) {
                data.set("revision", om.valueToTree(this.getRevision()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("kubernetes.JobSpecTemplateSpecVolumeGitRepo"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            JobSpecTemplateSpecVolumeGitRepo.Jsii$Proxy that = (JobSpecTemplateSpecVolumeGitRepo.Jsii$Proxy) o;

            if (this.directory != null ? !this.directory.equals(that.directory) : that.directory != null) return false;
            if (this.repository != null ? !this.repository.equals(that.repository) : that.repository != null) return false;
            return this.revision != null ? this.revision.equals(that.revision) : that.revision == null;
        }

        @Override
        public final int hashCode() {
            int result = this.directory != null ? this.directory.hashCode() : 0;
            result = 31 * result + (this.repository != null ? this.repository.hashCode() : 0);
            result = 31 * result + (this.revision != null ? this.revision.hashCode() : 0);
            return result;
        }
    }
}
