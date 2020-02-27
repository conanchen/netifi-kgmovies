package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class UnlabeledEventGQO implements IssueTimelineItemGQO, IssueTimelineItemsGQO, PullRequestTimelineItemGQO, PullRequestTimelineItemsGQO, NodeGQO{

    private ActorGQO actor;
    @javax.validation.constraints.NotNull
    private java.util.Date createdAt;
    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private LabelGQO label;
    @javax.validation.constraints.NotNull
    private LabelableGQO labelable;

    public UnlabeledEventGQO() {
    }

    public UnlabeledEventGQO(ActorGQO actor, java.util.Date createdAt, String id, LabelGQO label, LabelableGQO labelable) {
        this.actor = actor;
        this.createdAt = createdAt;
        this.id = id;
        this.label = label;
        this.labelable = labelable;
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

    public LabelGQO getLabel() {
        return label;
    }
    public void setLabel(LabelGQO label) {
        this.label = label;
    }

    public LabelableGQO getLabelable() {
        return labelable;
    }
    public void setLabelable(LabelableGQO labelable) {
        this.labelable = labelable;
    }

}