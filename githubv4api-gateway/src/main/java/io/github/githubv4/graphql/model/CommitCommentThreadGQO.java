package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class CommitCommentThreadGQO implements PullRequestTimelineItemGQO, NodeGQO, RepositoryNodeGQO{

    @javax.validation.constraints.NotNull
    private CommitCommentConnectionGQO comments;
    private CommitGQO commit;
    @javax.validation.constraints.NotNull
    private String id;
    private String path;
    private Integer position;
    @javax.validation.constraints.NotNull
    private RepositoryGQO repository;

    public CommitCommentThreadGQO() {
    }

    public CommitCommentThreadGQO(CommitCommentConnectionGQO comments, CommitGQO commit, String id, String path, Integer position, RepositoryGQO repository) {
        this.comments = comments;
        this.commit = commit;
        this.id = id;
        this.path = path;
        this.position = position;
        this.repository = repository;
    }

    public CommitCommentConnectionGQO getComments() {
        return comments;
    }
    public void setComments(CommitCommentConnectionGQO comments) {
        this.comments = comments;
    }

    public CommitGQO getCommit() {
        return commit;
    }
    public void setCommit(CommitGQO commit) {
        this.commit = commit;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getPath() {
        return path;
    }
    public void setPath(String path) {
        this.path = path;
    }

    public Integer getPosition() {
        return position;
    }
    public void setPosition(Integer position) {
        this.position = position;
    }

    public RepositoryGQO getRepository() {
        return repository;
    }
    public void setRepository(RepositoryGQO repository) {
        this.repository = repository;
    }

}