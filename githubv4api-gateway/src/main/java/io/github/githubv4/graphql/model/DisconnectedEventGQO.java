package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class DisconnectedEventGQO implements IssueTimelineItemsGQO, PullRequestTimelineItemsGQO, NodeGQO{

    private ActorGQO actor;
    @javax.validation.constraints.NotNull
    private java.util.Date createdAt;
    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private Boolean isCrossRepository;
    @javax.validation.constraints.NotNull
    private ReferencedSubjectGQO source;
    @javax.validation.constraints.NotNull
    private ReferencedSubjectGQO subject;

    public DisconnectedEventGQO() {
    }

    public DisconnectedEventGQO(ActorGQO actor, java.util.Date createdAt, String id, Boolean isCrossRepository, ReferencedSubjectGQO source, ReferencedSubjectGQO subject) {
        this.actor = actor;
        this.createdAt = createdAt;
        this.id = id;
        this.isCrossRepository = isCrossRepository;
        this.source = source;
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

    public Boolean getIsCrossRepository() {
        return isCrossRepository;
    }
    public void setIsCrossRepository(Boolean isCrossRepository) {
        this.isCrossRepository = isCrossRepository;
    }

    public ReferencedSubjectGQO getSource() {
        return source;
    }
    public void setSource(ReferencedSubjectGQO source) {
        this.source = source;
    }

    public ReferencedSubjectGQO getSubject() {
        return subject;
    }
    public void setSubject(ReferencedSubjectGQO subject) {
        this.subject = subject;
    }

}