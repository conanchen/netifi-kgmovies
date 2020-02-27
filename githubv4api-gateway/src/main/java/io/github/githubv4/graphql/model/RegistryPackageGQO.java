package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class RegistryPackageGQO implements NodeGQO{

    @javax.validation.constraints.NotNull
    private String color;
    @javax.validation.constraints.NotNull
    private String id;
    private RegistryPackageVersionGQO latestVersion;
    @javax.validation.constraints.NotNull
    private String name;
    @javax.validation.constraints.NotNull
    private String nameWithOwner;
    private RegistryPackageFileGQO packageFileByGuid;
    private RegistryPackageFileGQO packageFileBySha256;
    @javax.validation.constraints.NotNull
    private RegistryPackageTypeGQO packageType;
    private RegistryPackageVersionConnectionGQO preReleaseVersions;
    private String registryPackageType;
    private RepositoryGQO repository;
    private RegistryPackageStatisticsGQO statistics;
    @javax.validation.constraints.NotNull
    private RegistryPackageTagConnectionGQO tags;
    private TopicConnectionGQO topics;
    private RegistryPackageVersionGQO version;
    private RegistryPackageVersionGQO versionByPlatform;
    private RegistryPackageVersionGQO versionBySha256;
    @javax.validation.constraints.NotNull
    private RegistryPackageVersionConnectionGQO versions;
    private RegistryPackageVersionConnectionGQO versionsByMetadatum;

    public RegistryPackageGQO() {
    }

    public RegistryPackageGQO(String color, String id, RegistryPackageVersionGQO latestVersion, String name, String nameWithOwner, RegistryPackageFileGQO packageFileByGuid, RegistryPackageFileGQO packageFileBySha256, RegistryPackageTypeGQO packageType, RegistryPackageVersionConnectionGQO preReleaseVersions, String registryPackageType, RepositoryGQO repository, RegistryPackageStatisticsGQO statistics, RegistryPackageTagConnectionGQO tags, TopicConnectionGQO topics, RegistryPackageVersionGQO version, RegistryPackageVersionGQO versionByPlatform, RegistryPackageVersionGQO versionBySha256, RegistryPackageVersionConnectionGQO versions, RegistryPackageVersionConnectionGQO versionsByMetadatum) {
        this.color = color;
        this.id = id;
        this.latestVersion = latestVersion;
        this.name = name;
        this.nameWithOwner = nameWithOwner;
        this.packageFileByGuid = packageFileByGuid;
        this.packageFileBySha256 = packageFileBySha256;
        this.packageType = packageType;
        this.preReleaseVersions = preReleaseVersions;
        this.registryPackageType = registryPackageType;
        this.repository = repository;
        this.statistics = statistics;
        this.tags = tags;
        this.topics = topics;
        this.version = version;
        this.versionByPlatform = versionByPlatform;
        this.versionBySha256 = versionBySha256;
        this.versions = versions;
        this.versionsByMetadatum = versionsByMetadatum;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public RegistryPackageVersionGQO getLatestVersion() {
        return latestVersion;
    }
    public void setLatestVersion(RegistryPackageVersionGQO latestVersion) {
        this.latestVersion = latestVersion;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getNameWithOwner() {
        return nameWithOwner;
    }
    public void setNameWithOwner(String nameWithOwner) {
        this.nameWithOwner = nameWithOwner;
    }

    public RegistryPackageFileGQO getPackageFileByGuid() {
        return packageFileByGuid;
    }
    public void setPackageFileByGuid(RegistryPackageFileGQO packageFileByGuid) {
        this.packageFileByGuid = packageFileByGuid;
    }

    public RegistryPackageFileGQO getPackageFileBySha256() {
        return packageFileBySha256;
    }
    public void setPackageFileBySha256(RegistryPackageFileGQO packageFileBySha256) {
        this.packageFileBySha256 = packageFileBySha256;
    }

    public RegistryPackageTypeGQO getPackageType() {
        return packageType;
    }
    public void setPackageType(RegistryPackageTypeGQO packageType) {
        this.packageType = packageType;
    }

    public RegistryPackageVersionConnectionGQO getPreReleaseVersions() {
        return preReleaseVersions;
    }
    public void setPreReleaseVersions(RegistryPackageVersionConnectionGQO preReleaseVersions) {
        this.preReleaseVersions = preReleaseVersions;
    }

    public String getRegistryPackageType() {
        return registryPackageType;
    }
    public void setRegistryPackageType(String registryPackageType) {
        this.registryPackageType = registryPackageType;
    }

    public RepositoryGQO getRepository() {
        return repository;
    }
    public void setRepository(RepositoryGQO repository) {
        this.repository = repository;
    }

    public RegistryPackageStatisticsGQO getStatistics() {
        return statistics;
    }
    public void setStatistics(RegistryPackageStatisticsGQO statistics) {
        this.statistics = statistics;
    }

    public RegistryPackageTagConnectionGQO getTags() {
        return tags;
    }
    public void setTags(RegistryPackageTagConnectionGQO tags) {
        this.tags = tags;
    }

    public TopicConnectionGQO getTopics() {
        return topics;
    }
    public void setTopics(TopicConnectionGQO topics) {
        this.topics = topics;
    }

    public RegistryPackageVersionGQO getVersion() {
        return version;
    }
    public void setVersion(RegistryPackageVersionGQO version) {
        this.version = version;
    }

    public RegistryPackageVersionGQO getVersionByPlatform() {
        return versionByPlatform;
    }
    public void setVersionByPlatform(RegistryPackageVersionGQO versionByPlatform) {
        this.versionByPlatform = versionByPlatform;
    }

    public RegistryPackageVersionGQO getVersionBySha256() {
        return versionBySha256;
    }
    public void setVersionBySha256(RegistryPackageVersionGQO versionBySha256) {
        this.versionBySha256 = versionBySha256;
    }

    public RegistryPackageVersionConnectionGQO getVersions() {
        return versions;
    }
    public void setVersions(RegistryPackageVersionConnectionGQO versions) {
        this.versions = versions;
    }

    public RegistryPackageVersionConnectionGQO getVersionsByMetadatum() {
        return versionsByMetadatum;
    }
    public void setVersionsByMetadatum(RegistryPackageVersionConnectionGQO versionsByMetadatum) {
        this.versionsByMetadatum = versionsByMetadatum;
    }

}