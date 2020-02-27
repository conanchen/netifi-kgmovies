package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class ReferencedEventGQO implements IssueTimelineItemGQO, IssueTimelineItemsGQO, PullRequestTimelineItemGQO, PullRequestTimelineItemsGQO, NodeGQO{

    private ActorGQO actor;
    private CommitGQO commit;
    @javax.validation.constraints.NotNull
    private RepositoryGQO commitRepository;
    @javax.validation.constraints.NotNull
    private java.util.Date createdAt;
    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private Boolean isCrossRepository;
    @javax.validation.constraints.NotNull
    private Boolean isDirectReference;
    @javax.validation.constraints.NotNull
    private ReferencedSubjectGQO subject;

    public ReferencedEventGQO() {
    }

    public ReferencedEventGQO(ActorGQO actor, CommitGQO commit, RepositoryGQO commitRepository, java.util.Date createdAt, String id, Boolean isCrossRepository, Boolean isDirectReference, ReferencedSubjectGQO subject) {
        this.actor = actor;
        this.commit = commit;
        this.commitRepository = commitRepository;
        this.createdAt = createdAt;
        this.id = id;
        this.isCrossRepository = isCrossRepository;
        this.isDirectReference = isDirectReference;
        this.subject = subject;
    }

    public ActorGQO getActor() {
        return actor;
    }
    public void setActor(ActorGQO actor) {
        this.actor = actor;
    }

    public CommitGQO getCommit() {
        return commit;
    }
    public void setCommit(CommitGQO commit) {
        this.commit = commit;
    }

    public RepositoryGQO getCommitRepository() {
        return commitRepository;
    }
    public void setCommitRepository(RepositoryGQO commitRepository) {
        this.commitRepository = commitRepository;
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

    public Boolean getIsDirectReference() {
        return isDirectReference;
    }
    public void setIsDirectReference(Boolean isDirectReference) {
        this.isDirectReference = isDirectReference;
    }

    public ReferencedSubjectGQO getSubject() {
        return subject;
    }
    public void setSubject(ReferencedSubjectGQO subject) {
        this.subject = subject;
    }

}