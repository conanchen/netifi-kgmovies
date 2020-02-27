package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class IssueContributionsByRepositoryGQO {

    @javax.validation.constraints.NotNull
    private CreatedIssueContributionConnectionGQO contributions;
    @javax.validation.constraints.NotNull
    private RepositoryGQO repository;

    public IssueContributionsByRepositoryGQO() {
    }

    public IssueContributionsByRepositoryGQO(CreatedIssueContributionConnectionGQO contributions, RepositoryGQO repository) {
        this.contributions = contributions;
        this.repository = repository;
    }

    public CreatedIssueContributionConnectionGQO getContributions() {
        return contributions;
    }
    public void setContributions(CreatedIssueContributionConnectionGQO contributions) {
        this.contributions = contributions;
    }

    public RepositoryGQO getRepository() {
        return repository;
    }
    public void setRepository(RepositoryGQO repository) {
        this.repository = repository;
    }

}