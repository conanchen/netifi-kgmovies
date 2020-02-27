package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class LinkRepositoryToProjectPayloadGQO {

    private String clientMutationId;
    private ProjectGQO project;
    private RepositoryGQO repository;

    public LinkRepositoryToProjectPayloadGQO() {
    }

    public LinkRepositoryToProjectPayloadGQO(String clientMutationId, ProjectGQO project, RepositoryGQO repository) {
        this.clientMutationId = clientMutationId;
        this.project = project;
        this.repository = repository;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public ProjectGQO getProject() {
        return project;
    }
    public void setProject(ProjectGQO project) {
        this.project = project;
    }

    public RepositoryGQO getRepository() {
        return repository;
    }
    public void setRepository(RepositoryGQO repository) {
        this.repository = repository;
    }

}