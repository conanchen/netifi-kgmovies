package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class RenamedTitleEventGQO implements IssueTimelineItemGQO, IssueTimelineItemsGQO, PullRequestTimelineItemGQO, PullRequestTimelineItemsGQO, NodeGQO{

    private ActorGQO actor;
    @javax.validation.constraints.NotNull
    private java.util.Date createdAt;
    @javax.validation.constraints.NotNull
    private String currentTitle;
    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private String previousTitle;
    @javax.validation.constraints.NotNull
    private RenamedTitleSubjectGQO subject;

    public RenamedTitleEventGQO() {
    }

    public RenamedTitleEventGQO(ActorGQO actor, java.util.Date createdAt, String currentTitle, String id, String previousTitle, RenamedTitleSubjectGQO subject) {
        this.actor = actor;
        this.createdAt = createdAt;
        this.currentTitle = currentTitle;
        this.id = id;
        this.previousTitle = previousTitle;
        this.subject = subject;
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

    public String getCurrentTitle() {
        return currentTitle;
    }
    public void setCurrentTitle(String currentTitle) {
        this.currentTitle = currentTitle;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getPreviousTitle() {
        return previousTitle;
    }
    public void setPreviousTitle(String previousTitle) {
        this.previousTitle = previousTitle;
    }

    public RenamedTitleSubjectGQO getSubject() {
        return subject;
    }
    public void setSubject(RenamedTitleSubjectGQO subject) {
        this.subject = subject;
    }

}