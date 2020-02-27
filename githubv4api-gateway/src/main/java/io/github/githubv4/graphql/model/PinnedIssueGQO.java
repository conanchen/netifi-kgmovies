package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class PinnedIssueGQO implements NodeGQO{

    private Integer databaseId;
    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private IssueGQO issue;
    @javax.validation.constraints.NotNull
    private ActorGQO pinnedBy;
    @javax.validation.constraints.NotNull
    private RepositoryGQO repository;

    public PinnedIssueGQO() {
    }

    public PinnedIssueGQO(Integer databaseId, String id, IssueGQO issue, ActorGQO pinnedBy, RepositoryGQO repository) {
        this.databaseId = databaseId;
        this.id = id;
        this.issue = issue;
        this.pinnedBy = pinnedBy;
        this.repository = repository;
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

    public IssueGQO getIssue() {
        return issue;
    }
    public void setIssue(IssueGQO issue) {
        this.issue = issue;
    }

    public ActorGQO getPinnedBy() {
        return pinnedBy;
    }
    public void setPinnedBy(ActorGQO pinnedBy) {
        this.pinnedBy = pinnedBy;
    }

    public RepositoryGQO getRepository() {
        return repository;
    }
    public void setRepository(RepositoryGQO repository) {
        this.repository = repository;
    }

}