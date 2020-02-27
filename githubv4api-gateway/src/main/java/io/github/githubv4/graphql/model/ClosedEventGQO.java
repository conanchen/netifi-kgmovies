package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class ClosedEventGQO implements IssueTimelineItemGQO, IssueTimelineItemsGQO, PullRequestTimelineItemGQO, PullRequestTimelineItemsGQO, NodeGQO, UniformResourceLocatableGQO{

    private ActorGQO actor;
    @javax.validation.constraints.NotNull
    private ClosableGQO closable;
    private CloserGQO closer;
    @javax.validation.constraints.NotNull
    private java.util.Date createdAt;
    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private String resourcePath;
    @javax.validation.constraints.NotNull
    private String url;

    public ClosedEventGQO() {
    }

    public ClosedEventGQO(ActorGQO actor, ClosableGQO closable, CloserGQO closer, java.util.Date createdAt, String id, String resourcePath, String url) {
        this.actor = actor;
        this.closable = closable;
        this.closer = closer;
        this.createdAt = createdAt;
        this.id = id;
        this.resourcePath = resourcePath;
        this.url = url;
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

    public CloserGQO getCloser() {
        return closer;
    }
    public void setCloser(CloserGQO closer) {
        this.closer = closer;
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

    public String getResourcePath() {
        return resourcePath;
    }
    public void setResourcePath(String resourcePath) {
        this.resourcePath = resourcePath;
    }

    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }

}