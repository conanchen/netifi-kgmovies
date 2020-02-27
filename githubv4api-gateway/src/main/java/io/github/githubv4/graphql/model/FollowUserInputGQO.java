package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class FollowUserInputGQO {

    private String clientMutationId;
    @javax.validation.constraints.NotNull
    private String userId;

    public FollowUserInputGQO() {
    }

    public FollowUserInputGQO(String clientMutationId, String userId) {
        this.clientMutationId = clientMutationId;
        this.userId = userId;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }

}