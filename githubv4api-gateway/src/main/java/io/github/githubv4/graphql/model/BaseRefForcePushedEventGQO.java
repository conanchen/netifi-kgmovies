package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class BaseRefForcePushedEventGQO implements PullRequestTimelineItemGQO, PullRequestTimelineItemsGQO, NodeGQO{

    private ActorGQO actor;
    private CommitGQO afterCommit;
    private CommitGQO beforeCommit;
    @javax.validation.constraints.NotNull
    private java.util.Date createdAt;
    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private PullRequestGQO pullRequest;
    private RefGQO ref;

    public BaseRefForcePushedEventGQO() {
    }

    public BaseRefForcePushedEventGQO(ActorGQO actor, CommitGQO afterCommit, CommitGQO beforeCommit, java.util.Date createdAt, String id, PullRequestGQO pullRequest, RefGQO ref) {
        this.actor = actor;
        this.afterCommit = afterCommit;
        this.beforeCommit = beforeCommit;
        this.createdAt = createdAt;
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

    public CommitGQO getAfterCommit() {
        return afterCommit;
    }
    public void setAfterCommit(CommitGQO afterCommit) {
        this.afterCommit = afterCommit;
    }

    public CommitGQO getBeforeCommit() {
        return beforeCommit;
    }
    public void setBeforeCommit(CommitGQO beforeCommit) {
        this.beforeCommit = beforeCommit;
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

    public RefGQO getRef() {
        return ref;
    }
    public void setRef(RefGQO ref) {
        this.ref = ref;
    }

}