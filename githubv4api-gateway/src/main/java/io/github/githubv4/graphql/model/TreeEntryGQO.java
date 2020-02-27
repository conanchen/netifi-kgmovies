package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class TreeEntryGQO {

    @javax.validation.constraints.NotNull
    private Integer mode;
    @javax.validation.constraints.NotNull
    private String name;
    private GitObjectGQO object;
    @javax.validation.constraints.NotNull
    private String oid;
    @javax.validation.constraints.NotNull
    private RepositoryGQO repository;
    @javax.validation.constraints.NotNull
    private String type;

    public TreeEntryGQO() {
    }

    public TreeEntryGQO(Integer mode, String name, GitObjectGQO object, String oid, RepositoryGQO repository, String type) {
        this.mode = mode;
        this.name = name;
        this.object = object;
        this.oid = oid;
        this.repository = repository;
        this.type = type;
    }

    public Integer getMode() {
        return mode;
    }
    public void setMode(Integer mode) {
        this.mode = mode;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public GitObjectGQO getObject() {
        return object;
    }
    public void setObject(GitObjectGQO object) {
        this.object = object;
    }

    public String getOid() {
        return oid;
    }
    public void setOid(String oid) {
        this.oid = oid;
    }

    public RepositoryGQO getRepository() {
        return repository;
    }
    public void setRepository(RepositoryGQO repository) {
        this.repository = repository;
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

}