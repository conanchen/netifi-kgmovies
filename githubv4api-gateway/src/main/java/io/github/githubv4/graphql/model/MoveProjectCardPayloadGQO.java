package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class MoveProjectCardPayloadGQO {

    private ProjectCardEdgeGQO cardEdge;
    private String clientMutationId;

    public MoveProjectCardPayloadGQO() {
    }

    public MoveProjectCardPayloadGQO(ProjectCardEdgeGQO cardEdge, String clientMutationId) {
        this.cardEdge = cardEdge;
        this.clientMutationId = clientMutationId;
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

}