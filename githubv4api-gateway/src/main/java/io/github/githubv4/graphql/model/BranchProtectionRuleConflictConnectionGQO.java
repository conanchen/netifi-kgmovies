package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class BranchProtectionRuleConflictConnectionGQO {

    private Collection<BranchProtectionRuleConflictEdgeGQO> edges;
    private Collection<BranchProtectionRuleConflictGQO> nodes;
    @javax.validation.constraints.NotNull
    private PageInfoGQO pageInfo;
    @javax.validation.constraints.NotNull
    private Integer totalCount;

    public BranchProtectionRuleConflictConnectionGQO() {
    }

    public BranchProtectionRuleConflictConnectionGQO(Collection<BranchProtectionRuleConflictEdgeGQO> edges, Collection<BranchProtectionRuleConflictGQO> nodes, PageInfoGQO pageInfo, Integer totalCount) {
        this.edges = edges;
        this.nodes = nodes;
        this.pageInfo = pageInfo;
        this.totalCount = totalCount;
    }

    public Collection<BranchProtectionRuleConflictEdgeGQO> getEdges() {
        return edges;
    }
    public void setEdges(Collection<BranchProtectionRuleConflictEdgeGQO> edges) {
        this.edges = edges;
    }

    public Collection<BranchProtectionRuleConflictGQO> getNodes() {
        return nodes;
    }
    public void setNodes(Collection<BranchProtectionRuleConflictGQO> nodes) {
        this.nodes = nodes;
    }

    public PageInfoGQO getPageInfo() {
        return pageInfo;
    }
    public void setPageInfo(PageInfoGQO pageInfo) {
        this.pageInfo = pageInfo;
    }

    public Integer getTotalCount() {
        return totalCount;
    }
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

}