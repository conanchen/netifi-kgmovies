package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class MentionedEventGQO implements IssueTimelineItemsGQO, PullRequestTimelineItemsGQO, NodeGQO{

    private ActorGQO actor;
    @javax.validation.constraints.NotNull
    private java.util.Date createdAt;
    private Integer databaseId;
    @javax.validation.constraints.NotNull
    private String id;

    public MentionedEventGQO() {
    }

    public MentionedEventGQO(ActorGQO actor, java.util.Date createdAt, Integer databaseId, String id) {
        this.actor = actor;
        this.createdAt = createdAt;
        this.databaseId = databaseId;
        this.id = id;
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

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

}