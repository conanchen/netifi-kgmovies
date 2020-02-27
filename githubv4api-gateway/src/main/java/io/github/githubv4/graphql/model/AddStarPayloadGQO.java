package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class AddStarPayloadGQO {

    private String clientMutationId;
    private StarrableGQO starrable;

    public AddStarPayloadGQO() {
    }

    public AddStarPayloadGQO(String clientMutationId, StarrableGQO starrable) {
        this.clientMutationId = clientMutationId;
        this.starrable = starrable;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public StarrableGQO getStarrable() {
        return starrable;
    }
    public void setStarrable(StarrableGQO starrable) {
        this.starrable = starrable;
    }

}