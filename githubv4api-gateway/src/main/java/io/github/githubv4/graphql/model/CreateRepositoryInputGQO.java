package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class CreateRepositoryInputGQO {

    private String clientMutationId;
    private String description;
    private Boolean hasIssuesEnabled;
    private Boolean hasWikiEnabled;
    private String homepageUrl;
    @javax.validation.constraints.NotNull
    private String name;
    private String ownerId;
    private String teamId;
    private Boolean template;
    @javax.validation.constraints.NotNull
    private RepositoryVisibilityGQO visibility;

    public CreateRepositoryInputGQO() {
    }

    public CreateRepositoryInputGQO(String clientMutationId, String description, Boolean hasIssuesEnabled, Boolean hasWikiEnabled, String homepageUrl, String name, String ownerId, String teamId, Boolean template, RepositoryVisibilityGQO visibility) {
        this.clientMutationId = clientMutationId;
        this.description = description;
        this.hasIssuesEnabled = hasIssuesEnabled;
        this.hasWikiEnabled = hasWikiEnabled;
        this.homepageUrl = homepageUrl;
        this.name = name;
        this.ownerId = ownerId;
        this.teamId = teamId;
        this.template = template;
        this.visibility = visibility;
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

    public String getOwnerId() {
        return ownerId;
    }
    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    public String getTeamId() {
        return teamId;
    }
    public void setTeamId(String teamId) {
        this.teamId = teamId;
    }

    public Boolean getTemplate() {
        return template;
    }
    public void setTemplate(Boolean template) {
        this.template = template;
    }

    public RepositoryVisibilityGQO getVisibility() {
        return visibility;
    }
    public void setVisibility(RepositoryVisibilityGQO visibility) {
        this.visibility = visibility;
    }

}