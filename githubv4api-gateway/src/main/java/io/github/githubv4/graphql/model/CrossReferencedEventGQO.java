package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class CrossReferencedEventGQO implements IssueTimelineItemGQO, IssueTimelineItemsGQO, PullRequestTimelineItemGQO, PullRequestTimelineItemsGQO, NodeGQO, UniformResourceLocatableGQO{

    private ActorGQO actor;
    @javax.validation.constraints.NotNull
    private java.util.Date createdAt;
    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private Boolean isCrossRepository;
    @javax.validation.constraints.NotNull
    private java.util.Date referencedAt;
    @javax.validation.constraints.NotNull
    private String resourcePath;
    @javax.validation.constraints.NotNull
    private ReferencedSubjectGQO source;
    @javax.validation.constraints.NotNull
    private ReferencedSubjectGQO target;
    @javax.validation.constraints.NotNull
    private String url;
    @javax.validation.constraints.NotNull
    private Boolean willCloseTarget;

    public CrossReferencedEventGQO() {
    }

    public CrossReferencedEventGQO(ActorGQO actor, java.util.Date createdAt, String id, Boolean isCrossRepository, java.util.Date referencedAt, String resourcePath, ReferencedSubjectGQO source, ReferencedSubjectGQO target, String url, Boolean willCloseTarget) {
        this.actor = actor;
        this.createdAt = createdAt;
        this.id = id;
        this.isCrossRepository = isCrossRepository;
        this.referencedAt = referencedAt;
        this.resourcePath = resourcePath;
        this.source = source;
        this.target = target;
        this.url = url;
        this.willCloseTarget = willCloseTarget;
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

    public java.util.Date getReferencedAt() {
        return referencedAt;
    }
    public void setReferencedAt(java.util.Date referencedAt) {
        this.referencedAt = referencedAt;
    }

    public String getResourcePath() {
        return resourcePath;
    }
    public void setResourcePath(String resourcePath) {
        this.resourcePath = resourcePath;
    }

    public ReferencedSubjectGQO getSource() {
        return source;
    }
    public void setSource(ReferencedSubjectGQO source) {
        this.source = source;
    }

    public ReferencedSubjectGQO getTarget() {
        return target;
    }
    public void setTarget(ReferencedSubjectGQO target) {
        this.target = target;
    }

    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }

    public Boolean getWillCloseTarget() {
        return willCloseTarget;
    }
    public void setWillCloseTarget(Boolean willCloseTarget) {
        this.willCloseTarget = willCloseTarget;
    }

}