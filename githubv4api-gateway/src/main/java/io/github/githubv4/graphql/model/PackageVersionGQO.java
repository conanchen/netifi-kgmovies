package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class PackageVersionGQO implements NodeGQO{

    @javax.validation.constraints.NotNull
    private PackageFileConnectionGQO files;
    @javax.validation.constraints.NotNull
    private String id;
    private PackageGQO Package;
    private String platform;
    @javax.validation.constraints.NotNull
    private Boolean preRelease;
    private String readme;
    private ReleaseGQO release;
    private PackageVersionStatisticsGQO statistics;
    private String summary;
    @javax.validation.constraints.NotNull
    private String version;

    public PackageVersionGQO() {
    }

    public PackageVersionGQO(PackageFileConnectionGQO files, String id, PackageGQO Package, String platform, Boolean preRelease, String readme, ReleaseGQO release, PackageVersionStatisticsGQO statistics, String summary, String version) {
        this.files = files;
        this.id = id;
        this.Package = Package;
        this.platform = platform;
        this.preRelease = preRelease;
        this.readme = readme;
        this.release = release;
        this.statistics = statistics;
        this.summary = summary;
        this.version = version;
    }

    public PackageFileConnectionGQO getFiles() {
        return files;
    }
    public void setFiles(PackageFileConnectionGQO files) {
        this.files = files;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public PackageGQO getPackage() {
        return Package;
    }
    public void setPackage(PackageGQO Package) {
        this.Package = Package;
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

    public ReleaseGQO getRelease() {
        return release;
    }
    public void setRelease(ReleaseGQO release) {
        this.release = release;
    }

    public PackageVersionStatisticsGQO getStatistics() {
        return statistics;
    }
    public void setStatistics(PackageVersionStatisticsGQO statistics) {
        this.statistics = statistics;
    }

    public String getSummary() {
        return summary;
    }
    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getVersion() {
        return version;
    }
    public void setVersion(String version) {
        this.version = version;
    }

}