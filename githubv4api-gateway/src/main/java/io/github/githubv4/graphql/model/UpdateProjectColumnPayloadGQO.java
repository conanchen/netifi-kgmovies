package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class UpdateProjectColumnPayloadGQO {

    private String clientMutationId;
    private ProjectColumnGQO projectColumn;

    public UpdateProjectColumnPayloadGQO() {
    }

    public UpdateProjectColumnPayloadGQO(String clientMutationId, ProjectColumnGQO projectColumn) {
        this.clientMutationId = clientMutationId;
        this.projectColumn = projectColumn;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public ProjectColumnGQO getProjectColumn() {
        return projectColumn;
    }
    public void setProjectColumn(ProjectColumnGQO projectColumn) {
        this.projectColumn = projectColumn;
    }

}