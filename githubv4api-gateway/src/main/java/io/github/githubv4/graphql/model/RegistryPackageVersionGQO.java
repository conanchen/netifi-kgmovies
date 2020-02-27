package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class RegistryPackageVersionGQO implements NodeGQO{

    @javax.validation.constraints.NotNull
    private Boolean deleted;
    @javax.validation.constraints.NotNull
    private RegistryPackageDependencyConnectionGQO dependencies;
    private RegistryPackageFileGQO fileByName;
    @javax.validation.constraints.NotNull
    private RegistryPackageFileConnectionGQO files;
    @javax.validation.constraints.NotNull
    private String id;
    private String installationCommand;
    private String manifest;
    private String platform;
    @javax.validation.constraints.NotNull
    private Boolean preRelease;
    private String readme;
    private String readmeHtml;
    private RegistryPackageGQO registryPackage;
    private ReleaseGQO release;
    private String sha256;
    private Integer size;
    private RegistryPackageVersionStatisticsGQO statistics;
    private String summary;
    @javax.validation.constraints.NotNull
    private java.util.Date updatedAt;
    @javax.validation.constraints.NotNull
    private String version;
    @javax.validation.constraints.NotNull
    private Boolean viewerCanEdit;

    public RegistryPackageVersionGQO() {
    }

    public RegistryPackageVersionGQO(Boolean deleted, RegistryPackageDependencyConnectionGQO dependencies, RegistryPackageFileGQO fileByName, RegistryPackageFileConnectionGQO files, String id, String installationCommand, String manifest, String platform, Boolean preRelease, String readme, String readmeHtml, RegistryPackageGQO registryPackage, ReleaseGQO release, String sha256, Integer size, RegistryPackageVersionStatisticsGQO statistics, String summary, java.util.Date updatedAt, String version, Boolean viewerCanEdit) {
        this.deleted = deleted;
        this.dependencies = dependencies;
        this.fileByName = fileByName;
        this.files = files;
        this.id = id;
        this.installationCommand = installationCommand;
        this.manifest = manifest;
        this.platform = platform;
        this.preRelease = preRelease;
        this.readme = readme;
        this.readmeHtml = readmeHtml;
        this.registryPackage = registryPackage;
        this.release = release;
        this.sha256 = sha256;
        this.size = size;
        this.statistics = statistics;
        this.summary = summary;
        this.updatedAt = updatedAt;
        this.version = version;
        this.viewerCanEdit = viewerCanEdit;
    }

    public Boolean getDeleted() {
        return deleted;
    }
    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public RegistryPackageDependencyConnectionGQO getDependencies() {
        return dependencies;
    }
    public void setDependencies(RegistryPackageDependencyConnectionGQO dependencies) {
        this.dependencies = dependencies;
    }

    public RegistryPackageFileGQO getFileByName() {
        return fileByName;
    }
    public void setFileByName(RegistryPackageFileGQO fileByName) {
        this.fileByName = fileByName;
    }

    public RegistryPackageFileConnectionGQO getFiles() {
        return files;
    }
    public void setFiles(RegistryPackageFileConnectionGQO files) {
        this.files = files;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getInstallationCommand() {
        return installationCommand;
    }
    public void setInstallationCommand(String installationCommand) {
        this.installationCommand = installationCommand;
    }

    public String getManifest() {
        return manifest;
    }
    public void setManifest(String manifest) {
        this.manifest = manifest;
    }

    public String getPlatform() {
        return platform;
    }
    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public Boolean getPreRelease() {
        return preRelease;
    }
    public void setPreRelease(Boolean preRelease) {
        this.preRelease = preRelease;
    }

    public String getReadme() {
        return readme;
    }
    public void setReadme(String readme) {
        this.readme = readme;
    }

    public String getReadmeHtml() {
        return readmeHtml;
    }
    public void setReadmeHtml(String readmeHtml) {
        this.readmeHtml = readmeHtml;
    }

    public RegistryPackageGQO getRegistryPackage() {
        return registryPackage;
    }
    public void setRegistryPackage(RegistryPackageGQO registryPackage) {
        this.registryPackage = registryPackage;
    }

    public ReleaseGQO getRelease() {
        return release;
    }
    public void setRelease(ReleaseGQO release) {
        this.release = release;
    }

    public String getSha256() {
        return sha256;
    }
    public void setSha256(String sha256) {
        this.sha256 = sha256;
    }

    public Integer getSize() {
        return size;
    }
    public void setSize(Integer size) {
        this.size = size;
    }

    public RegistryPackageVersionStatisticsGQO getStatistics() {
        return statistics;
    }
    public void setStatistics(RegistryPackageVersionStatisticsGQO statistics) {
        this.statistics = statistics;
    }

    public String getSummary() {
        return summary;
    }
    public void setSummary(String summary) {
        this.summary = summary;
    }

    public java.util.Date getUpdatedAt() {
        return updatedAt;
    }
    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getVersion() {
        return version;
    }
    public void setVersion(String version) {
        this.version = version;
    }

    public Boolean getViewerCanEdit() {
        return viewerCanEdit;
    }
    public void setViewerCanEdit(Boolean viewerCanEdit) {
        this.viewerCanEdit = viewerCanEdit;
    }

}