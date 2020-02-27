package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class MilestonedEventGQO implements IssueTimelineItemGQO, IssueTimelineItemsGQO, PullRequestTimelineItemGQO, PullRequestTimelineItemsGQO, NodeGQO{

    private ActorGQO actor;
    @javax.validation.constraints.NotNull
    private java.util.Date createdAt;
    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private String milestoneTitle;
    @javax.validation.constraints.NotNull
    private MilestoneItemGQO subject;

    public MilestonedEventGQO() {
    }

    public MilestonedEventGQO(ActorGQO actor, java.util.Date createdAt, String id, String milestoneTitle, MilestoneItemGQO subject) {
        this.actor = actor;
        this.createdAt = createdAt;
        this.id = id;
        this.milestoneTitle = milestoneTitle;
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

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getMilestoneTitle() {
        return milestoneTitle;
    }
    public void setMilestoneTitle(String milestoneTitle) {
        this.milestoneTitle = milestoneTitle;
    }

    public MilestoneItemGQO getSubject() {
        return subject;
    }
    public void setSubject(MilestoneItemGQO subject) {
        this.subject = subject;
    }

}