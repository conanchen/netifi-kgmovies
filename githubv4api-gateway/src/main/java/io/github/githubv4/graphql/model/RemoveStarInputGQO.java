package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class RemoveStarInputGQO {

    private String clientMutationId;
    @javax.validation.constraints.NotNull
    private String starrableId;

    public RemoveStarInputGQO() {
    }

    public RemoveStarInputGQO(String clientMutationId, String starrableId) {
        this.clientMutationId = clientMutationId;
        this.starrableId = starrableId;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public String getStarrableId() {
        return starrableId;
    }
    public void setStarrableId(String starrableId) {
        this.starrableId = starrableId;
    }

}