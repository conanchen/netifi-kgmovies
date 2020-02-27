package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class DeleteProjectInputGQO {

    private String clientMutationId;
    @javax.validation.constraints.NotNull
    private String projectId;

    public DeleteProjectInputGQO() {
    }

    public DeleteProjectInputGQO(String clientMutationId, String projectId) {
        this.clientMutationId = clientMutationId;
        this.projectId = projectId;
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

}