package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class PackageGQO implements NodeGQO{

    @javax.validation.constraints.NotNull
    private String id;
    private PackageVersionGQO latestVersion;
    @javax.validation.constraints.NotNull
    private String name;
    @javax.validation.constraints.NotNull
    private PackageTypeGQO packageType;
    private RepositoryGQO repository;
    private PackageStatisticsGQO statistics;
    private PackageVersionGQO version;
    @javax.validation.constraints.NotNull
    private PackageVersionConnectionGQO versions;

    public PackageGQO() {
    }

    public PackageGQO(String id, PackageVersionGQO latestVersion, String name, PackageTypeGQO packageType, RepositoryGQO repository, PackageStatisticsGQO statistics, PackageVersionGQO version, PackageVersionConnectionGQO versions) {
        this.id = id;
        this.latestVersion = latestVersion;
        this.name = name;
        this.packageType = packageType;
        this.repository = repository;
        this.statistics = statistics;
        this.version = version;
        this.versions = versions;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public PackageVersionGQO getLatestVersion() {
        return latestVersion;
    }
    public void setLatestVersion(PackageVersionGQO latestVersion) {
        this.latestVersion = latestVersion;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public PackageTypeGQO getPackageType() {
        return packageType;
    }
    public void setPackageType(PackageTypeGQO packageType) {
        this.packageType = packageType;
    }

    public RepositoryGQO getRepository() {
        return repository;
    }
    public void setRepository(RepositoryGQO repository) {
        this.repository = repository;
    }

    public PackageStatisticsGQO getStatistics() {
        return statistics;
    }
    public void setStatistics(PackageStatisticsGQO statistics) {
        this.statistics = statistics;
    }

    public PackageVersionGQO getVersion() {
        return version;
    }
    public void setVersion(PackageVersionGQO version) {
        this.version = version;
    }

    public PackageVersionConnectionGQO getVersions() {
        return versions;
    }
    public void setVersions(PackageVersionConnectionGQO versions) {
        this.versions = versions;
    }

}