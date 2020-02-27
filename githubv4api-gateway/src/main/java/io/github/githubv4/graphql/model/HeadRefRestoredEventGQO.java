package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class HeadRefRestoredEventGQO implements PullRequestTimelineItemGQO, PullRequestTimelineItemsGQO, NodeGQO{

    private ActorGQO actor;
    @javax.validation.constraints.NotNull
    private java.util.Date createdAt;
    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private PullRequestGQO pullRequest;

    public HeadRefRestoredEventGQO() {
    }

    public HeadRefRestoredEventGQO(ActorGQO actor, java.util.Date createdAt, String id, PullRequestGQO pullRequest) {
        this.actor = actor;
        this.createdAt = createdAt;
        this.id = id;
        this.pullRequest = pullRequest;
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

}