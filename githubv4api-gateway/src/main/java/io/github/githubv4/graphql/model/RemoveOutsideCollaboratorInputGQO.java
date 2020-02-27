package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class RemoveOutsideCollaboratorInputGQO {

    private String clientMutationId;
    @javax.validation.constraints.NotNull
    private String organizationId;
    @javax.validation.constraints.NotNull
    private String userId;

    public RemoveOutsideCollaboratorInputGQO() {
    }

    public RemoveOutsideCollaboratorInputGQO(String clientMutationId, String organizationId, String userId) {
        this.clientMutationId = clientMutationId;
        this.organizationId = organizationId;
        this.userId = userId;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public String getOrganizationId() {
        return organizationId;
    }
    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }

}