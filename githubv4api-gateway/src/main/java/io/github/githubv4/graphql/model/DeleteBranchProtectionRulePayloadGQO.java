package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class DeleteBranchProtectionRulePayloadGQO {

    private String clientMutationId;

    public DeleteBranchProtectionRulePayloadGQO() {
    }

    public DeleteBranchProtectionRulePayloadGQO(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

}