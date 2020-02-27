package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class DependencyGraphDependencyGQO {

    @javax.validation.constraints.NotNull
    private Boolean hasDependencies;
    private String packageManager;
    @javax.validation.constraints.NotNull
    private String packageName;
    private RepositoryGQO repository;
    @javax.validation.constraints.NotNull
    private String requirements;

    public DependencyGraphDependencyGQO() {
    }

    public DependencyGraphDependencyGQO(Boolean hasDependencies, String packageManager, String packageName, RepositoryGQO repository, String requirements) {
        this.hasDependencies = hasDependencies;
        this.packageManager = packageManager;
        this.packageName = packageName;
        this.repository = repository;
        this.requirements = requirements;
    }

    public Boolean getHasDependencies() {
        return hasDependencies;
    }
    public void setHasDependencies(Boolean hasDependencies) {
        this.hasDependencies = hasDependencies;
    }

    public String getPackageManager() {
        return packageManager;
    }
    public void setPackageManager(String packageManager) {
        this.packageManager = packageManager;
    }

    public String getPackageName() {
        return packageName;
    }
    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public RepositoryGQO getRepository() {
        return repository;
    }
    public void setRepository(RepositoryGQO repository) {
        this.repository = repository;
    }

    public String getRequirements() {
        return requirements;
    }
    public void setRequirements(String requirements) {
        this.requirements = requirements;
    }

}