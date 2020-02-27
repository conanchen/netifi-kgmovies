package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class DeployedEventGQO implements PullRequestTimelineItemGQO, PullRequestTimelineItemsGQO, NodeGQO{

    private ActorGQO actor;
    @javax.validation.constraints.NotNull
    private java.util.Date createdAt;
    private Integer databaseId;
    @javax.validation.constraints.NotNull
    private DeploymentGQO deployment;
    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private PullRequestGQO pullRequest;
    private RefGQO ref;

    public DeployedEventGQO() {
    }

    public DeployedEventGQO(ActorGQO actor, java.util.Date createdAt, Integer databaseId, DeploymentGQO deployment, String id, PullRequestGQO pullRequest, RefGQO ref) {
        this.actor = actor;
        this.createdAt = createdAt;
        this.databaseId = databaseId;
        this.deployment = deployment;
        this.id = id;
        this.pullRequest = pullRequest;
        this.ref = ref;
    }

    public ActorGQO getActor() {
        return actor;
    }
    public void setActor(ActorGQO actor) {
        this.actor = actor;
    }

    public java.util.Date getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    public Integer getDatabaseId() {
        return databaseId;
    }
    public void setDatabaseId(Integer databaseId) {
        this.databaseId = databaseId;
    }

    public DeploymentGQO getDeployment() {
        return deployment;
    }
    public void setDeployment(DeploymentGQO deployment) {
        this.deployment = deployment;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public PullRequestGQO getPullRequest() {
        return pullRequest;
    }
    public void setPullRequest(PullRequestGQO pullRequest) {
        this.pullRequest = pullRequest;
    }

    public RefGQO getRef() {
        return ref;
    }
    public void setRef(RefGQO ref) {
        this.ref = ref;
    }

}