package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class DeleteDeploymentPayloadGQO {

    private String clientMutationId;

    public DeleteDeploymentPayloadGQO() {
    }

    public DeleteDeploymentPayloadGQO(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

}