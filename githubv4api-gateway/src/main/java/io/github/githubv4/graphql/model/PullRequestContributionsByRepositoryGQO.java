package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class PullRequestContributionsByRepositoryGQO {

    @javax.validation.constraints.NotNull
    private CreatedPullRequestContributionConnectionGQO contributions;
    @javax.validation.constraints.NotNull
    private RepositoryGQO repository;

    public PullRequestContributionsByRepositoryGQO() {
    }

    public PullRequestContributionsByRepositoryGQO(CreatedPullRequestContributionConnectionGQO contributions, RepositoryGQO repository) {
        this.contributions = contributions;
        this.repository = repository;
    }

    public CreatedPullRequestContributionConnectionGQO getContributions() {
        return contributions;
    }
    public void setContributions(CreatedPullRequestContributionConnectionGQO contributions) {
        this.contributions = contributions;
    }

    public RepositoryGQO getRepository() {
        return repository;
    }
    public void setRepository(RepositoryGQO repository) {
        this.repository = repository;
    }

}