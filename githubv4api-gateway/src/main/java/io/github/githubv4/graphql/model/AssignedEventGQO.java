package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class AssignedEventGQO implements IssueTimelineItemGQO, IssueTimelineItemsGQO, PullRequestTimelineItemGQO, PullRequestTimelineItemsGQO, NodeGQO{

    private ActorGQO actor;
    @javax.validation.constraints.NotNull
    private AssignableGQO assignable;
    private AssigneeGQO assignee;
    @javax.validation.constraints.NotNull
    private java.util.Date createdAt;
    @javax.validation.constraints.NotNull
    private String id;
    private UserGQO user;

    public AssignedEventGQO() {
    }

    public AssignedEventGQO(ActorGQO actor, AssignableGQO assignable, AssigneeGQO assignee, java.util.Date createdAt, String id, UserGQO user) {
        this.actor = actor;
        this.assignable = assignable;
        this.assignee = assignee;
        this.createdAt = createdAt;
        this.id = id;
        this.user = user;
    }

    public ActorGQO getActor() {
        return actor;
    }
    public void setActor(ActorGQO actor) {
        this.actor = actor;
    }

    public AssignableGQO getAssignable() {
        return assignable;
    }
    public void setAssignable(AssignableGQO assignable) {
        this.assignable = assignable;
    }

    public AssigneeGQO getAssignee() {
        return assignee;
    }
    public void setAssignee(AssigneeGQO assignee) {
        this.assignee = assignee;
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

    public UserGQO getUser() {
        return user;
    }
    public void setUser(UserGQO user) {
        this.user = user;
    }

}