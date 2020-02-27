package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class DeleteRefPayloadGQO {

    private String clientMutationId;

    public DeleteRefPayloadGQO() {
    }

    public DeleteRefPayloadGQO(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

}