package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class RemoveAssigneesFromAssignablePayloadGQO {

    private AssignableGQO assignable;
    private String clientMutationId;

    public RemoveAssigneesFromAssignablePayloadGQO() {
    }

    public RemoveAssigneesFromAssignablePayloadGQO(AssignableGQO assignable, String clientMutationId) {
        this.assignable = assignable;
        this.clientMutationId = clientMutationId;
    }

    public AssignableGQO getAssignable() {
        return assignable;
    }
    public void setAssignable(AssignableGQO assignable) {
        this.assignable = assignable;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

}