package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class BranchProtectionRuleConflictEdgeGQO {

    @javax.validation.constraints.NotNull
    private String cursor;
    private BranchProtectionRuleConflictGQO node;

    public BranchProtectionRuleConflictEdgeGQO() {
    }

    public BranchProtectionRuleConflictEdgeGQO(String cursor, BranchProtectionRuleConflictGQO node) {
        this.cursor = cursor;
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public BranchProtectionRuleConflictGQO getNode() {
        return node;
    }
    public void setNode(BranchProtectionRuleConflictGQO node) {
        this.node = node;
    }

}