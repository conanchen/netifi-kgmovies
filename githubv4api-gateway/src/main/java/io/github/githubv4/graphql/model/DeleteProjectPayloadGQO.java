package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class DeleteProjectPayloadGQO {

    private String clientMutationId;
    private ProjectOwnerGQO owner;

    public DeleteProjectPayloadGQO() {
    }

    public DeleteProjectPayloadGQO(String clientMutationId, ProjectOwnerGQO owner) {
        this.clientMutationId = clientMutationId;
        this.owner = owner;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public ProjectOwnerGQO getOwner() {
        return owner;
    }
    public void setOwner(ProjectOwnerGQO owner) {
        this.owner = owner;
    }

}