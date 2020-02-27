package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class DeleteBranchProtectionRuleInputGQO {

    @javax.validation.constraints.NotNull
    private String branchProtectionRuleId;
    private String clientMutationId;

    public DeleteBranchProtectionRuleInputGQO() {
    }

    public DeleteBranchProtectionRuleInputGQO(String branchProtectionRuleId, String clientMutationId) {
        this.branchProtectionRuleId = branchProtectionRuleId;
        this.clientMutationId = clientMutationId;
    }

    public String getBranchProtectionRuleId() {
        return branchProtectionRuleId;
    }
    public void setBranchProtectionRuleId(String branchProtectionRuleId) {
        this.branchProtectionRuleId = branchProtectionRuleId;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

}