package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class ReactionGQO implements NodeGQO{

    @javax.validation.constraints.NotNull
    private ReactionContentGQO content;
    @javax.validation.constraints.NotNull
    private java.util.Date createdAt;
    private Integer databaseId;
    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private ReactableGQO reactable;
    private UserGQO user;

    public ReactionGQO() {
    }

    public ReactionGQO(ReactionContentGQO content, java.util.Date createdAt, Integer databaseId, String id, ReactableGQO reactable, UserGQO user) {
        this.content = content;
        this.createdAt = createdAt;
        this.databaseId = databaseId;
        this.id = id;
        this.reactable = reactable;
        this.user = user;
    }

    public ReactionContentGQO getContent() {
        return content;
    }
    public void setContent(ReactionContentGQO content) {
        this.content = content;
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

    public ReactableGQO getReactable() {
        return reactable;
    }
    public void setReactable(ReactableGQO reactable) {
        this.reactable = reactable;
    }

    public UserGQO getUser() {
        return user;
    }
    public void setUser(UserGQO user) {
        this.user = user;
    }

}