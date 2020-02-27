package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class DependencyGraphManifestGQO implements NodeGQO{

    @javax.validation.constraints.NotNull
    private String blobPath;
    private DependencyGraphDependencyConnectionGQO dependencies;
    private Integer dependenciesCount;
    @javax.validation.constraints.NotNull
    private Boolean exceedsMaxSize;
    @javax.validation.constraints.NotNull
    private String filename;
    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private Boolean parseable;
    @javax.validation.constraints.NotNull
    private RepositoryGQO repository;

    public DependencyGraphManifestGQO() {
    }

    public DependencyGraphManifestGQO(String blobPath, DependencyGraphDependencyConnectionGQO dependencies, Integer dependenciesCount, Boolean exceedsMaxSize, String filename, String id, Boolean parseable, RepositoryGQO repository) {
        this.blobPath = blobPath;
        this.dependencies = dependencies;
        this.dependenciesCount = dependenciesCount;
        this.exceedsMaxSize = exceedsMaxSize;
        this.filename = filename;
        this.id = id;
        this.parseable = parseable;
        this.repository = repository;
    }

    public String getBlobPath() {
        return blobPath;
    }
    public void setBlobPath(String blobPath) {
        this.blobPath = blobPath;
    }

    public DependencyGraphDependencyConnectionGQO getDependencies() {
        return dependencies;
    }
    public void setDependencies(DependencyGraphDependencyConnectionGQO dependencies) {
        this.dependencies = dependencies;
    }

    public Integer getDependenciesCount() {
        return dependenciesCount;
    }
    public void setDependenciesCount(Integer dependenciesCount) {
        this.dependenciesCount = dependenciesCount;
    }

    public Boolean getExceedsMaxSize() {
        return exceedsMaxSize;
    }
    public void setExceedsMaxSize(Boolean exceedsMaxSize) {
        this.exceedsMaxSize = exceedsMaxSize;
    }

    public String getFilename() {
        return filename;
    }
    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public Boolean getParseable() {
        return parseable;
    }
    public void setParseable(Boolean parseable) {
        this.parseable = parseable;
    }

    public RepositoryGQO getRepository() {
        return repository;
    }
    public void setRepository(RepositoryGQO repository) {
        this.repository = repository;
    }

}