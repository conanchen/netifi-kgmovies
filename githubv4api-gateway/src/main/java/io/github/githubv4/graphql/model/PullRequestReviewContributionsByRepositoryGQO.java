package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class PullRequestReviewContributionsByRepositoryGQO {

    @javax.validation.constraints.NotNull
    private CreatedPullRequestReviewContributionConnectionGQO contributions;
    @javax.validation.constraints.NotNull
    private RepositoryGQO repository;

    public PullRequestReviewContributionsByRepositoryGQO() {
    }

    public PullRequestReviewContributionsByRepositoryGQO(CreatedPullRequestReviewContributionConnectionGQO contributions, RepositoryGQO repository) {
        this.contributions = contributions;
        this.repository = repository;
    }

    public CreatedPullRequestReviewContributionConnectionGQO getContributions() {
        return contributions;
    }
    public void setContributions(CreatedPullRequestReviewContributionConnectionGQO contributions) {
        this.contributions = contributions;
    }

    public RepositoryGQO getRepository() {
        return repository;
    }
    public void setRepository(RepositoryGQO repository) {
        this.repository = repository;
    }

}