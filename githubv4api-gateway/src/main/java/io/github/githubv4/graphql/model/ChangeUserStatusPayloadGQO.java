package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class ChangeUserStatusPayloadGQO {

    private String clientMutationId;
    private UserStatusGQO status;

    public ChangeUserStatusPayloadGQO() {
    }

    public ChangeUserStatusPayloadGQO(String clientMutationId, UserStatusGQO status) {
        this.clientMutationId = clientMutationId;
        this.status = status;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public UserStatusGQO getStatus() {
        return status;
    }
    public void setStatus(UserStatusGQO status) {
        this.status = status;
    }

}