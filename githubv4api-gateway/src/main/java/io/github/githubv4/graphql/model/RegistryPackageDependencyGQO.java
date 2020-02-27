package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class RegistryPackageDependencyGQO implements NodeGQO{

    @javax.validation.constraints.NotNull
    private RegistryPackageDependencyTypeGQO dependencyType;
    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private String name;
    @javax.validation.constraints.NotNull
    private String version;

    public RegistryPackageDependencyGQO() {
    }

    public RegistryPackageDependencyGQO(RegistryPackageDependencyTypeGQO dependencyType, String id, String name, String version) {
        this.dependencyType = dependencyType;
        this.id = id;
        this.name = name;
        this.version = version;
    }

    public RegistryPackageDependencyTypeGQO getDependencyType() {
        return dependencyType;
    }
    public void setDependencyType(RegistryPackageDependencyTypeGQO dependencyType) {
        this.dependencyType = dependencyType;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getVersion() {
        return version;
    }
    public void setVersion(String version) {
        this.version = version;
    }

}