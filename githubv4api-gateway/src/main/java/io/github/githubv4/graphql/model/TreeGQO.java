package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class TreeGQO implements GitObjectGQO, NodeGQO{

    @javax.validation.constraints.NotNull
    private String abbreviatedOid;
    @javax.validation.constraints.NotNull
    private String commitResourcePath;
    @javax.validation.constraints.NotNull
    private String commitUrl;
    @javax.validation.constraints.NotNull
    private Collection<TreeEntryGQO> entries;
    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private String oid;
    @javax.validation.constraints.NotNull
    private RepositoryGQO repository;

    public TreeGQO() {
    }

    public TreeGQO(String abbreviatedOid, String commitResourcePath, String commitUrl, Collection<TreeEntryGQO> entries, String id, String oid, RepositoryGQO repository) {
        this.abbreviatedOid = abbreviatedOid;
        this.commitResourcePath = commitResourcePath;
        this.commitUrl = commitUrl;
        this.entries = entries;
        this.id = id;
        this.oid = oid;
        this.repository = repository;
    }

    public String getAbbreviatedOid() {
        return abbreviatedOid;
    }
    public void setAbbreviatedOid(String abbreviatedOid) {
        this.abbreviatedOid = abbreviatedOid;
    }

    public String getCommitResourcePath() {
        return commitResourcePath;
    }
    public void setCommitResourcePath(String commitResourcePath) {
        this.commitResourcePath = commitResourcePath;
    }

    public String getCommitUrl() {
        return commitUrl;
    }
    public void setCommitUrl(String commitUrl) {
        this.commitUrl = commitUrl;
    }

    public Collection<TreeEntryGQO> getEntries() {
        return entries;
    }
    public void setEntries(Collection<TreeEntryGQO> entries) {
        this.entries = entries;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
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

}