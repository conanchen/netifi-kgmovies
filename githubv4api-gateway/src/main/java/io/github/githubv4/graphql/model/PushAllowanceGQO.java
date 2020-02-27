package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class PushAllowanceGQO implements NodeGQO{

    private PushAllowanceActorGQO actor;
    private BranchProtectionRuleGQO branchProtectionRule;
    @javax.validation.constraints.NotNull
    private String id;

    public PushAllowanceGQO() {
    }

    public PushAllowanceGQO(PushAllowanceActorGQO actor, BranchProtectionRuleGQO branchProtectionRule, String id) {
        this.actor = actor;
        this.branchProtectionRule = branchProtectionRule;
        this.id = id;
    }

    public PushAllowanceActorGQO getActor() {
        return actor;
    }
    public void setActor(PushAllowanceActorGQO actor) {
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