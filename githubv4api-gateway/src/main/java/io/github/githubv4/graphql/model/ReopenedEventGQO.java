package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class ReopenedEventGQO implements IssueTimelineItemGQO, IssueTimelineItemsGQO, PullRequestTimelineItemGQO, PullRequestTimelineItemsGQO, NodeGQO{

    private ActorGQO actor;
    @javax.validation.constraints.NotNull
    private ClosableGQO closable;
    @javax.validation.constraints.NotNull
    private java.util.Date createdAt;
    @javax.validation.constraints.NotNull
    private String id;

    public ReopenedEventGQO() {
    }

    public ReopenedEventGQO(ActorGQO actor, ClosableGQO closable, java.util.Date createdAt, String id) {
        this.actor = actor;
        this.closable = closable;
        this.createdAt = createdAt;
        this.id = id;
    }

    public ActorGQO getActor() {
        return actor;
    }
    public void setActor(ActorGQO actor) {
        this.actor = actor;
    }

    public ClosableGQO getClosable() {
        return closable;
    }
    public void setClosable(ClosableGQO closable) {
        this.closable = closable;
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

}