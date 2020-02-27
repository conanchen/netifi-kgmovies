package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class RemoveOutsideCollaboratorPayloadGQO {

    private String clientMutationId;
    private UserGQO removedUser;

    public RemoveOutsideCollaboratorPayloadGQO() {
    }

    public RemoveOutsideCollaboratorPayloadGQO(String clientMutationId, UserGQO removedUser) {
        this.clientMutationId = clientMutationId;
        this.removedUser = removedUser;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public UserGQO getRemovedUser() {
        return removedUser;
    }
    public void setRemovedUser(UserGQO removedUser) {
        this.removedUser = removedUser;
    }

}