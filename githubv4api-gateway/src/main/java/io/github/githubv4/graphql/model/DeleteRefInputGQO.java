package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class DeleteRefInputGQO {

    private String clientMutationId;
    @javax.validation.constraints.NotNull
    private String refId;

    public DeleteRefInputGQO() {
    }

    public DeleteRefInputGQO(String clientMutationId, String refId) {
        this.clientMutationId = clientMutationId;
        this.refId = refId;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public String getRefId() {
        return refId;
    }
    public void setRefId(String refId) {
        this.refId = refId;
    }

}