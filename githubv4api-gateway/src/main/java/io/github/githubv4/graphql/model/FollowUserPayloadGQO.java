package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class FollowUserPayloadGQO {

    private String clientMutationId;
    private UserGQO user;

    public FollowUserPayloadGQO() {
    }

    public FollowUserPayloadGQO(String clientMutationId, UserGQO user) {
        this.clientMutationId = clientMutationId;
        this.user = user;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public UserGQO getUser() {
        return user;
    }
    public void setUser(UserGQO user) {
        this.user = user;
    }

}