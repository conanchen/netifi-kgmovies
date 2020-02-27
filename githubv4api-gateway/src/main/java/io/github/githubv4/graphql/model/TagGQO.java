package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class TagGQO implements GitObjectGQO, NodeGQO{

    @javax.validation.constraints.NotNull
    private String abbreviatedOid;
    @javax.validation.constraints.NotNull
    private String commitResourcePath;
    @javax.validation.constraints.NotNull
    private String commitUrl;
    @javax.validation.constraints.NotNull
    private String id;
    private String message;
    @javax.validation.constraints.NotNull
    private String name;
    @javax.validation.constraints.NotNull
    private String oid;
    @javax.validation.constraints.NotNull
    private RepositoryGQO repository;
    private GitActorGQO tagger;
    @javax.validation.constraints.NotNull
    private GitObjectGQO target;

    public TagGQO() {
    }

    public TagGQO(String abbreviatedOid, String commitResourcePath, String commitUrl, String id, String message, String name, String oid, RepositoryGQO repository, GitActorGQO tagger, GitObjectGQO target) {
        this.abbreviatedOid = abbreviatedOid;
        this.commitResourcePath = commitResourcePath;
        this.commitUrl = commitUrl;
        this.id = id;
        this.message = message;
        this.name = name;
        this.oid = oid;
        this.repository = repository;
        this.tagger = tagger;
        this.target = target;
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

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
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

    public GitActorGQO getTagger() {
        return tagger;
    }
    public void setTagger(GitActorGQO tagger) {
        this.tagger = tagger;
    }

    public GitObjectGQO getTarget() {
        return target;
    }
    public void setTarget(GitObjectGQO target) {
        this.target = target;
    }

}