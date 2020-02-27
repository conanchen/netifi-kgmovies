package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class ReactionGroupGQO {

    @javax.validation.constraints.NotNull
    private ReactionContentGQO content;
    private java.util.Date createdAt;
    @javax.validation.constraints.NotNull
    private ReactableGQO subject;
    @javax.validation.constraints.NotNull
    private ReactingUserConnectionGQO users;
    @javax.validation.constraints.NotNull
    private Boolean viewerHasReacted;

    public ReactionGroupGQO() {
    }

    public ReactionGroupGQO(ReactionContentGQO content, java.util.Date createdAt, ReactableGQO subject, ReactingUserConnectionGQO users, Boolean viewerHasReacted) {
        this.content = content;
        this.createdAt = createdAt;
        this.subject = subject;
        this.users = users;
        this.viewerHasReacted = viewerHasReacted;
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

    public ReactableGQO getSubject() {
        return subject;
    }
    public void setSubject(ReactableGQO subject) {
        this.subject = subject;
    }

    public ReactingUserConnectionGQO getUsers() {
        return users;
    }
    public void setUsers(ReactingUserConnectionGQO users) {
        this.users = users;
    }

    public Boolean getViewerHasReacted() {
        return viewerHasReacted;
    }
    public void setViewerHasReacted(Boolean viewerHasReacted) {
        this.viewerHasReacted = viewerHasReacted;
    }

}