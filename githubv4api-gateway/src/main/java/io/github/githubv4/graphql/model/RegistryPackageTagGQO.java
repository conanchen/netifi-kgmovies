package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class RegistryPackageTagGQO implements NodeGQO{

    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private String name;
    private RegistryPackageVersionGQO version;

    public RegistryPackageTagGQO() {
    }

    public RegistryPackageTagGQO(String id, String name, RegistryPackageVersionGQO version) {
        this.id = id;
        this.name = name;
        this.version = version;
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

    public RegistryPackageVersionGQO getVersion() {
        return version;
    }
    public void setVersion(RegistryPackageVersionGQO version) {
        this.version = version;
    }

}