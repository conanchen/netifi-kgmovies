package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class AddProjectCardPayloadGQO {

    private ProjectCardEdgeGQO cardEdge;
    private String clientMutationId;
    private ProjectColumnGQO projectColumn;

    public AddProjectCardPayloadGQO() {
    }

    public AddProjectCardPayloadGQO(ProjectCardEdgeGQO cardEdge, String clientMutationId, ProjectColumnGQO projectColumn) {
        this.cardEdge = cardEdge;
        this.clientMutationId = clientMutationId;
        this.projectColumn = projectColumn;
    }

    public ProjectCardEdgeGQO getCardEdge() {
        return cardEdge;
    }
    public void setCardEdge(ProjectCardEdgeGQO cardEdge) {
        this.cardEdge = cardEdge;
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