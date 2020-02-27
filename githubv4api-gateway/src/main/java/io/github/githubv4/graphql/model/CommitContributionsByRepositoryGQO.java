package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class CommitContributionsByRepositoryGQO {

    @javax.validation.constraints.NotNull
    private CreatedCommitContributionConnectionGQO contributions;
    @javax.validation.constraints.NotNull
    private RepositoryGQO repository;
    @javax.validation.constraints.NotNull
    private String resourcePath;
    @javax.validation.constraints.NotNull
    private String url;

    public CommitContributionsByRepositoryGQO() {
    }

    public CommitContributionsByRepositoryGQO(CreatedCommitContributionConnectionGQO contributions, RepositoryGQO repository, String resourcePath, String url) {
        this.contributions = contributions;
        this.repository = repository;
        this.resourcePath = resourcePath;
        this.url = url;
    }

    public CreatedCommitContributionConnectionGQO getContributions() {
        return contributions;
    }
    public void setContributions(CreatedCommitContributionConnectionGQO contributions) {
        this.contributions = contributions;
    }

    public RepositoryGQO getRepository() {
        return repository;
    }
    public void setRepository(RepositoryGQO repository) {
        this.repository = repository;
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