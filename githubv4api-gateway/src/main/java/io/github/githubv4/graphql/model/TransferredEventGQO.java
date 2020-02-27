package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class TransferredEventGQO implements IssueTimelineItemGQO, IssueTimelineItemsGQO, PullRequestTimelineItemsGQO, NodeGQO{

    private ActorGQO actor;
    @javax.validation.constraints.NotNull
    private java.util.Date createdAt;
    private RepositoryGQO fromRepository;
    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private IssueGQO issue;

    public TransferredEventGQO() {
    }

    public TransferredEventGQO(ActorGQO actor, java.util.Date createdAt, RepositoryGQO fromRepository, String id, IssueGQO issue) {
        this.actor = actor;
        this.createdAt = createdAt;
        this.fromRepository = fromRepository;
        this.id = id;
        this.issue = issue;
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

    public RepositoryGQO getFromRepository() {
        return fromRepository;
    }
    public void setFromRepository(RepositoryGQO fromRepository) {
        this.fromRepository = fromRepository;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public IssueGQO getIssue() {
        return issue;
    }
    public void setIssue(IssueGQO issue) {
        this.issue = issue;
    }

}