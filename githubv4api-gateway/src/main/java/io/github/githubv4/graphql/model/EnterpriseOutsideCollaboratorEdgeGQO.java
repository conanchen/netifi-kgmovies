package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class EnterpriseOutsideCollaboratorEdgeGQO {

    @javax.validation.constraints.NotNull
    private String cursor;
    @javax.validation.constraints.NotNull
    private Boolean isUnlicensed;
    private UserGQO node;
    @javax.validation.constraints.NotNull
    private EnterpriseRepositoryInfoConnectionGQO repositories;

    public EnterpriseOutsideCollaboratorEdgeGQO() {
    }

    public EnterpriseOutsideCollaboratorEdgeGQO(String cursor, Boolean isUnlicensed, UserGQO node, EnterpriseRepositoryInfoConnectionGQO repositories) {
        this.cursor = cursor;
        this.isUnlicensed = isUnlicensed;
        this.node = node;
        this.repositories = repositories;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public Boolean getIsUnlicensed() {
        return isUnlicensed;
    }
    public void setIsUnlicensed(Boolean isUnlicensed) {
        this.isUnlicensed = isUnlicensed;
    }

    public UserGQO getNode() {
        return node;
    }
    public void setNode(UserGQO node) {
        this.node = node;
    }

    public EnterpriseRepositoryInfoConnectionGQO getRepositories() {
        return repositories;
    }
    public void setRepositories(EnterpriseRepositoryInfoConnectionGQO repositories) {
        this.repositories = repositories;
    }

}