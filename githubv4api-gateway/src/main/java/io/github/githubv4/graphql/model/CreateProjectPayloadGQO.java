package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class CreateProjectPayloadGQO {

    private String clientMutationId;
    private ProjectGQO project;

    public CreateProjectPayloadGQO() {
    }

    public CreateProjectPayloadGQO(String clientMutationId, ProjectGQO project) {
        this.clientMutationId = clientMutationId;
        this.project = project;
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

}