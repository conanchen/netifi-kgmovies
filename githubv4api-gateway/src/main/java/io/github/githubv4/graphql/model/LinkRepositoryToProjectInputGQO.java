package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class LinkRepositoryToProjectInputGQO {

    private String clientMutationId;
    @javax.validation.constraints.NotNull
    private String projectId;
    @javax.validation.constraints.NotNull
    private String repositoryId;

    public LinkRepositoryToProjectInputGQO() {
    }

    public LinkRepositoryToProjectInputGQO(String clientMutationId, String projectId, String repositoryId) {
        this.clientMutationId = clientMutationId;
        this.projectId = projectId;
        this.repositoryId = repositoryId;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public String getProjectId() {
        return projectId;
    }
    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getRepositoryId() {
        return repositoryId;
    }
    public void setRepositoryId(String repositoryId) {
        this.repositoryId = repositoryId;
    }

}