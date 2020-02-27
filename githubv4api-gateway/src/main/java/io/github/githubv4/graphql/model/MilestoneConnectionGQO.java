package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class MilestoneConnectionGQO {

    private Collection<MilestoneEdgeGQO> edges;
    private Collection<MilestoneGQO> nodes;
    @javax.validation.constraints.NotNull
    private PageInfoGQO pageInfo;
    @javax.validation.constraints.NotNull
    private Integer totalCount;

    public MilestoneConnectionGQO() {
    }

    public MilestoneConnectionGQO(Collection<MilestoneEdgeGQO> edges, Collection<MilestoneGQO> nodes, PageInfoGQO pageInfo, Integer totalCount) {
        this.edges = edges;
        this.nodes = nodes;
        this.pageInfo = pageInfo;
        this.totalCount = totalCount;
    }

    public Collection<MilestoneEdgeGQO> getEdges() {
        return edges;
    }
    public void setEdges(Collection<MilestoneEdgeGQO> edges) {
        this.edges = edges;
    }

    public Collection<MilestoneGQO> getNodes() {
        return nodes;
    }
    public void setNodes(Collection<MilestoneGQO> nodes) {
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