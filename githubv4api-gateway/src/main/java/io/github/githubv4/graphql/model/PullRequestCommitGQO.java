package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class PullRequestCommitGQO implements PullRequestTimelineItemsGQO, NodeGQO, UniformResourceLocatableGQO{

    @javax.validation.constraints.NotNull
    private CommitGQO commit;
    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private PullRequestGQO pullRequest;
    @javax.validation.constraints.NotNull
    private String resourcePath;
    @javax.validation.constraints.NotNull
    private String url;

    public PullRequestCommitGQO() {
    }

    public PullRequestCommitGQO(CommitGQO commit, String id, PullRequestGQO pullRequest, String resourcePath, String url) {
        this.commit = commit;
        this.id = id;
        this.pullRequest = pullRequest;
        this.resourcePath = resourcePath;
        this.url = url;
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

    public PullRequestGQO getPullRequest() {
        return pullRequest;
    }
    public void setPullRequest(PullRequestGQO pullRequest) {
        this.pullRequest = pullRequest;
    }

    public String getResourcePath() {
        return resourcePath;
    }
    public void setResourcePath(String resourcePath) {
        this.resourcePath = resourcePath;
    }

    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }

}