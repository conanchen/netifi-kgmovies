package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class UserBlockedEventGQO implements IssueTimelineItemGQO, IssueTimelineItemsGQO, PullRequestTimelineItemGQO, PullRequestTimelineItemsGQO, NodeGQO{

    private ActorGQO actor;
    @javax.validation.constraints.NotNull
    private UserBlockDurationGQO blockDuration;
    @javax.validation.constraints.NotNull
    private java.util.Date createdAt;
    @javax.validation.constraints.NotNull
    private String id;
    private UserGQO subject;

    public UserBlockedEventGQO() {
    }

    public UserBlockedEventGQO(ActorGQO actor, UserBlockDurationGQO blockDuration, java.util.Date createdAt, String id, UserGQO subject) {
        this.actor = actor;
        this.blockDuration = blockDuration;
        this.createdAt = createdAt;
        this.id = id;
        this.subject = subject;
    }

    public ActorGQO getActor() {
        return actor;
    }
    public void setActor(ActorGQO actor) {
        this.actor = actor;
    }

    public UserBlockDurationGQO getBlockDuration() {
        return blockDuration;
    }
    public void setBlockDuration(UserBlockDurationGQO blockDuration) {
        this.blockDuration = blockDuration;
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

    public UserGQO getSubject() {
        return subject;
    }
    public void setSubject(UserGQO subject) {
        this.subject = subject;
    }

}