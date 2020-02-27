package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class StatusContextGQO implements NodeGQO{

    private String avatarUrl;
    private CommitGQO commit;
    @javax.validation.constraints.NotNull
    private String context;
    @javax.validation.constraints.NotNull
    private java.util.Date createdAt;
    private ActorGQO creator;
    private String description;
    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private StatusStateGQO state;
    private String targetUrl;

    public StatusContextGQO() {
    }

    public StatusContextGQO(String avatarUrl, CommitGQO commit, String context, java.util.Date createdAt, ActorGQO creator, String description, String id, StatusStateGQO state, String targetUrl) {
        this.avatarUrl = avatarUrl;
        this.commit = commit;
        this.context = context;
        this.createdAt = createdAt;
        this.creator = creator;
        this.description = description;
        this.id = id;
        this.state = state;
        this.targetUrl = targetUrl;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }
    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public CommitGQO getCommit() {
        return commit;
    }
    public void setCommit(CommitGQO commit) {
        this.commit = commit;
    }

    public String getContext() {
        return context;
    }
    public void setContext(String context) {
        this.context = context;
    }

    public java.util.Date getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    public ActorGQO getCreator() {
        return creator;
    }
    public void setCreator(ActorGQO creator) {
        this.creator = creator;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public StatusStateGQO getState() {
        return state;
    }
    public void setState(StatusStateGQO state) {
        this.state = state;
    }

    public String getTargetUrl() {
        return targetUrl;
    }
    public void setTargetUrl(String targetUrl) {
        this.targetUrl = targetUrl;
    }

}