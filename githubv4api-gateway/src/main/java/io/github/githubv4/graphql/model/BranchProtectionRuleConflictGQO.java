package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class BranchProtectionRuleConflictGQO {

    private BranchProtectionRuleGQO branchProtectionRule;
    private BranchProtectionRuleGQO conflictingBranchProtectionRule;
    private RefGQO ref;

    public BranchProtectionRuleConflictGQO() {
    }

    public BranchProtectionRuleConflictGQO(BranchProtectionRuleGQO branchProtectionRule, BranchProtectionRuleGQO conflictingBranchProtectionRule, RefGQO ref) {
        this.branchProtectionRule = branchProtectionRule;
        this.conflictingBranchProtectionRule = conflictingBranchProtectionRule;
        this.ref = ref;
    }

    public BranchProtectionRuleGQO getBranchProtectionRule() {
        return branchProtectionRule;
    }
    public void setBranchProtectionRule(BranchProtectionRuleGQO branchProtectionRule) {
        this.branchProtectionRule = branchProtectionRule;
    }

    public BranchProtectionRuleGQO getConflictingBranchProtectionRule() {
        return conflictingBranchProtectionRule;
    }
    public void setConflictingBranchProtectionRule(BranchProtectionRuleGQO conflictingBranchProtectionRule) {
        this.conflictingBranchProtectionRule = conflictingBranchProtectionRule;
    }

    public RefGQO getRef() {
        return ref;
    }
    public void setRef(RefGQO ref) {
        this.ref = ref;
    }

}