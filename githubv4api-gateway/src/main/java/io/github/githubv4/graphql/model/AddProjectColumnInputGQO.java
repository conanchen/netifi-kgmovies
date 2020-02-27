package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class AddProjectColumnInputGQO {

    private String clientMutationId;
    @javax.validation.constraints.NotNull
    private String name;
    @javax.validation.constraints.NotNull
    private String projectId;

    public AddProjectColumnInputGQO() {
    }

    public AddProjectColumnInputGQO(String clientMutationId, String name, String projectId) {
        this.clientMutationId = clientMutationId;
        this.name = name;
        this.projectId = projectId;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getProjectId() {
        return projectId;
    }
    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

}