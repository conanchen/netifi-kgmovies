package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class DeletePackageVersionPayloadGQO {

    private String clientMutationId;
    private Boolean success;

    public DeletePackageVersionPayloadGQO() {
    }

    public DeletePackageVersionPayloadGQO(String clientMutationId, Boolean success) {
        this.clientMutationId = clientMutationId;
        this.success = success;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public Boolean getSuccess() {
        return success;
    }
    public void setSuccess(Boolean success) {
        this.success = success;
    }

}