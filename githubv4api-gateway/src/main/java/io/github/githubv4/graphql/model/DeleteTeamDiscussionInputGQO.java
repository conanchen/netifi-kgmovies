package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class DeleteTeamDiscussionInputGQO {

    private String clientMutationId;
    @javax.validation.constraints.NotNull
    private String id;

    public DeleteTeamDiscussionInputGQO() {
    }

    public DeleteTeamDiscussionInputGQO(String clientMutationId, String id) {
        this.clientMutationId = clientMutationId;
        this.id = id;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

}