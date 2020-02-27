package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class MoveProjectColumnPayloadGQO {

    private String clientMutationId;
    private ProjectColumnEdgeGQO columnEdge;

    public MoveProjectColumnPayloadGQO() {
    }

    public MoveProjectColumnPayloadGQO(String clientMutationId, ProjectColumnEdgeGQO columnEdge) {
        this.clientMutationId = clientMutationId;
        this.columnEdge = columnEdge;
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

}