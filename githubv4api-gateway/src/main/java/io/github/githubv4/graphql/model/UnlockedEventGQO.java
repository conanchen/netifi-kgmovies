package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class UnlockedEventGQO implements IssueTimelineItemGQO, IssueTimelineItemsGQO, PullRequestTimelineItemGQO, PullRequestTimelineItemsGQO, NodeGQO{

    private ActorGQO actor;
    @javax.validation.constraints.NotNull
    private java.util.Date createdAt;
    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private LockableGQO lockable;

    public UnlockedEventGQO() {
    }

    public UnlockedEventGQO(ActorGQO actor, java.util.Date createdAt, String id, LockableGQO lockable) {
        this.actor = actor;
        this.createdAt = createdAt;
        this.id = id;
        this.lockable = lockable;
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

    public LockableGQO getLockable() {
        return lockable;
    }
    public void setLockable(LockableGQO lockable) {
        this.lockable = lockable;
    }

}