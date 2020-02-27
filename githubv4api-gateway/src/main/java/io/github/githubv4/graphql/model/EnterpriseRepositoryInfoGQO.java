package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class EnterpriseRepositoryInfoGQO implements NodeGQO{

    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private Boolean isPrivate;
    @javax.validation.constraints.NotNull
    private String name;
    @javax.validation.constraints.NotNull
    private String nameWithOwner;

    public EnterpriseRepositoryInfoGQO() {
    }

    public EnterpriseRepositoryInfoGQO(String id, Boolean isPrivate, String name, String nameWithOwner) {
        this.id = id;
        this.isPrivate = isPrivate;
        this.name = name;
        this.nameWithOwner = nameWithOwner;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public Boolean getIsPrivate() {
        return isPrivate;
    }
    public void setIsPrivate(Boolean isPrivate) {
        this.isPrivate = isPrivate;
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

}