package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class CloneTemplateRepositoryInputGQO {

    private String clientMutationId;
    private String description;
    @javax.validation.constraints.NotNull
    private String name;
    @javax.validation.constraints.NotNull
    private String ownerId;
    @javax.validation.constraints.NotNull
    private String repositoryId;
    @javax.validation.constraints.NotNull
    private RepositoryVisibilityGQO visibility;

    public CloneTemplateRepositoryInputGQO() {
    }

    public CloneTemplateRepositoryInputGQO(String clientMutationId, String description, String name, String ownerId, String repositoryId, RepositoryVisibilityGQO visibility) {
        this.clientMutationId = clientMutationId;
        this.description = description;
        this.name = name;
        this.ownerId = ownerId;
        this.repositoryId = repositoryId;
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

    public String getRepositoryId() {
        return repositoryId;
    }
    public void setRepositoryId(String repositoryId) {
        this.repositoryId = repositoryId;
    }

    public RepositoryVisibilityGQO getVisibility() {
        return visibility;
    }
    public void setVisibility(RepositoryVisibilityGQO visibility) {
        this.visibility = visibility;
    }

}