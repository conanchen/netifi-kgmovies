package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class ReviewDismissalAllowanceGQO implements NodeGQO{

    private ReviewDismissalAllowanceActorGQO actor;
    private BranchProtectionRuleGQO branchProtectionRule;
    @javax.validation.constraints.NotNull
    private String id;

    public ReviewDismissalAllowanceGQO() {
    }

    public ReviewDismissalAllowanceGQO(ReviewDismissalAllowanceActorGQO actor, BranchProtectionRuleGQO branchProtectionRule, String id) {
        this.actor = actor;
        this.branchProtectionRule = branchProtectionRule;
        this.id = id;
    }

    public ReviewDismissalAllowanceActorGQO getActor() {
        return actor;
    }
    public void setActor(ReviewDismissalAllowanceActorGQO actor) {
        this.actor = actor;
    }

    public BranchProtectionRuleGQO getBranchProtectionRule() {
        return branchProtectionRule;
    }
    public void setBranchProtectionRule(BranchProtectionRuleGQO branchProtectionRule) {
        this.branchProtectionRule = branchProtectionRule;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

}