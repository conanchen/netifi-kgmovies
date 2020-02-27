package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class UpdateProjectColumnInputGQO {

    private String clientMutationId;
    @javax.validation.constraints.NotNull
    private String name;
    @javax.validation.constraints.NotNull
    private String projectColumnId;

    public UpdateProjectColumnInputGQO() {
    }

    public UpdateProjectColumnInputGQO(String clientMutationId, String name, String projectColumnId) {
        this.clientMutationId = clientMutationId;
        this.name = name;
        this.projectColumnId = projectColumnId;
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

    public String getProjectColumnId() {
        return projectColumnId;
    }
    public void setProjectColumnId(String projectColumnId) {
        this.projectColumnId = projectColumnId;
    }

}