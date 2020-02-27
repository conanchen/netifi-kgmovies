package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class BranchProtectionRuleConnectionGQO {

    private Collection<BranchProtectionRuleEdgeGQO> edges;
    private Collection<BranchProtectionRuleGQO> nodes;
    @javax.validation.constraints.NotNull
    private PageInfoGQO pageInfo;
    @javax.validation.constraints.NotNull
    private Integer totalCount;

    public BranchProtectionRuleConnectionGQO() {
    }

    public BranchProtectionRuleConnectionGQO(Collection<BranchProtectionRuleEdgeGQO> edges, Collection<BranchProtectionRuleGQO> nodes, PageInfoGQO pageInfo, Integer totalCount) {
        this.edges = edges;
        this.nodes = nodes;
        this.pageInfo = pageInfo;
        this.totalCount = totalCount;
    }

    public Collection<BranchProtectionRuleEdgeGQO> getEdges() {
        return edges;
    }
    public void setEdges(Collection<BranchProtectionRuleEdgeGQO> edges) {
        this.edges = edges;
    }

    public Collection<BranchProtectionRuleGQO> getNodes() {
        return nodes;
    }
    public void setNodes(Collection<BranchProtectionRuleGQO> nodes) {
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