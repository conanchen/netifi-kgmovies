package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class AddProjectColumnPayloadGQO {

    private String clientMutationId;
    private ProjectColumnEdgeGQO columnEdge;
    private ProjectGQO project;

    public AddProjectColumnPayloadGQO() {
    }

    public AddProjectColumnPayloadGQO(String clientMutationId, ProjectColumnEdgeGQO columnEdge, ProjectGQO project) {
        this.clientMutationId = clientMutationId;
        this.columnEdge = columnEdge;
        this.project = project;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public ProjectColumnEdgeGQO getColumnEdge() {
        return columnEdge;
    }
    public void setColumnEdge(ProjectColumnEdgeGQO columnEdge) {
        this.columnEdge = columnEdge;
    }

    public ProjectGQO getProject() {
        return project;
    }
    public void setProject(ProjectGQO project) {
        this.project = project;
    }

}