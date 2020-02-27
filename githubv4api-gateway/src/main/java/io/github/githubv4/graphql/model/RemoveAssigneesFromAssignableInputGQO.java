package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class RemoveAssigneesFromAssignableInputGQO {

    @javax.validation.constraints.NotNull
    private String assignableId;
    @javax.validation.constraints.NotNull
    private Collection<String> assigneeIds;
    private String clientMutationId;

    public RemoveAssigneesFromAssignableInputGQO() {
    }

    public RemoveAssigneesFromAssignableInputGQO(String assignableId, Collection<String> assigneeIds, String clientMutationId) {
        this.assignableId = assignableId;
        this.assigneeIds = assigneeIds;
        this.clientMutationId = clientMutationId;
    }

    public String getAssignableId() {
        return assignableId;
    }
    public void setAssignableId(String assignableId) {
        this.assignableId = assignableId;
    }

    public Collection<String> getAssigneeIds() {
        return assigneeIds;
    }
    public void setAssigneeIds(Collection<String> assigneeIds) {
        this.assigneeIds = assigneeIds;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

}