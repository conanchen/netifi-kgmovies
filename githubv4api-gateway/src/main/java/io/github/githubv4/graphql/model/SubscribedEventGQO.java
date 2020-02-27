package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class SubscribedEventGQO implements IssueTimelineItemGQO, IssueTimelineItemsGQO, PullRequestTimelineItemGQO, PullRequestTimelineItemsGQO, NodeGQO{

    private ActorGQO actor;
    @javax.validation.constraints.NotNull
    private java.util.Date createdAt;
    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private SubscribableGQO subscribable;

    public SubscribedEventGQO() {
    }

    public SubscribedEventGQO(ActorGQO actor, java.util.Date createdAt, String id, SubscribableGQO subscribable) {
        this.actor = actor;
        this.createdAt = createdAt;
        this.id = id;
        this.subscribable = subscribable;
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

    public SubscribableGQO getSubscribable() {
        return subscribable;
    }
    public void setSubscribable(SubscribableGQO subscribable) {
        this.subscribable = subscribable;
    }

}