package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class RefGQO implements NodeGQO{

    @javax.validation.constraints.NotNull
    private PullRequestConnectionGQO associatedPullRequests;
    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private String name;
    @javax.validation.constraints.NotNull
    private String prefix;
    @javax.validation.constraints.NotNull
    private RepositoryGQO repository;
    @javax.validation.constraints.NotNull
    private GitObjectGQO target;

    public RefGQO() {
    }

    public RefGQO(PullRequestConnectionGQO associatedPullRequests, String id, String name, String prefix, RepositoryGQO repository, GitObjectGQO target) {
        this.associatedPullRequests = associatedPullRequests;
        this.id = id;
        this.name = name;
        this.prefix = prefix;
        this.repository = repository;
        this.target = target;
    }

    public PullRequestConnectionGQO getAssociatedPullRequests() {
        return associatedPullRequests;
    }
    public void setAssociatedPullRequests(PullRequestConnectionGQO associatedPullRequests) {
        this.associatedPullRequests = associatedPullRequests;
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

    public String getPrefix() {
        return prefix;
    }
    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public RepositoryGQO getRepository() {
        return repository;
    }
    public void setRepository(RepositoryGQO repository) {
        this.repository = repository;
    }

    public GitObjectGQO getTarget() {
        return target;
    }
    public void setTarget(GitObjectGQO target) {
        this.target = target;
    }

}