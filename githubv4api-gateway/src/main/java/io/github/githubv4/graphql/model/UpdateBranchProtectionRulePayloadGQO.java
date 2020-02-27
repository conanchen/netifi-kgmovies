package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class UpdateBranchProtectionRulePayloadGQO {

    private BranchProtectionRuleGQO branchProtectionRule;
    private String clientMutationId;

    public UpdateBranchProtectionRulePayloadGQO() {
    }

    public UpdateBranchProtectionRulePayloadGQO(BranchProtectionRuleGQO branchProtectionRule, String clientMutationId) {
        this.branchProtectionRule = branchProtectionRule;
        this.clientMutationId = clientMutationId;
    }

    public BranchProtectionRuleGQO getBranchProtectionRule() {
        return branchProtectionRule;
    }
    public void setBranchProtectionRule(BranchProtectionRuleGQO branchProtectionRule) {
        this.branchProtectionRule = branchProtectionRule;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

}