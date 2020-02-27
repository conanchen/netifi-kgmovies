package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class UpdateRepositoryInputGQO {

    private String clientMutationId;
    private String description;
    private Boolean hasIssuesEnabled;
    private Boolean hasProjectsEnabled;
    private Boolean hasWikiEnabled;
    private String homepageUrl;
    private String name;
    @javax.validation.constraints.NotNull
    private String repositoryId;
    private Boolean template;

    public UpdateRepositoryInputGQO() {
    }

    public UpdateRepositoryInputGQO(String clientMutationId, String description, Boolean hasIssuesEnabled, Boolean hasProjectsEnabled, Boolean hasWikiEnabled, String homepageUrl, String name, String repositoryId, Boolean template) {
        this.clientMutationId = clientMutationId;
        this.description = description;
        this.hasIssuesEnabled = hasIssuesEnabled;
        this.hasProjectsEnabled = hasProjectsEnabled;
        this.hasWikiEnabled = hasWikiEnabled;
        this.homepageUrl = homepageUrl;
        this.name = name;
        this.repositoryId = repositoryId;
        this.template = template;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getHasIssuesEnabled() {
        return hasIssuesEnabled;
    }
    public void setHasIssuesEnabled(Boolean hasIssuesEnabled) {
        this.hasIssuesEnabled = hasIssuesEnabled;
    }

    public Boolean getHasProjectsEnabled() {
        return hasProjectsEnabled;
    }
    public void setHasProjectsEnabled(Boolean hasProjectsEnabled) {
        this.hasProjectsEnabled = hasProjectsEnabled;
    }

    public Boolean getHasWikiEnabled() {
        return hasWikiEnabled;
    }
    public void setHasWikiEnabled(Boolean hasWikiEnabled) {
        this.hasWikiEnabled = hasWikiEnabled;
    }

    public String getHomepageUrl() {
        return homepageUrl;
    }
    public void setHomepageUrl(String homepageUrl) {
        this.homepageUrl = homepageUrl;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getRepositoryId() {
        return repositoryId;
    }
    public void setRepositoryId(String repositoryId) {
        this.repositoryId = repositoryId;
    }

    public Boolean getTemplate() {
        return template;
    }
    public void setTemplate(Boolean template) {
        this.template = template;
    }

}