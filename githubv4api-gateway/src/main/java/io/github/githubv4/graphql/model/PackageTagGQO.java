package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class PackageTagGQO implements NodeGQO{

    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private String name;
    private PackageVersionGQO version;

    public PackageTagGQO() {
    }

    public PackageTagGQO(String id, String name, PackageVersionGQO version) {
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

    public PackageVersionGQO getVersion() {
        return version;
    }
    public void setVersion(PackageVersionGQO version) {
        this.version = version;
    }

}