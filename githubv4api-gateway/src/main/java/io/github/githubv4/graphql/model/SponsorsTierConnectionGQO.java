package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class SponsorsTierConnectionGQO {

    private Collection<SponsorsTierEdgeGQO> edges;
    private Collection<SponsorsTierGQO> nodes;
    @javax.validation.constraints.NotNull
    private PageInfoGQO pageInfo;
    @javax.validation.constraints.NotNull
    private Integer totalCount;

    public SponsorsTierConnectionGQO() {
    }

    public SponsorsTierConnectionGQO(Collection<SponsorsTierEdgeGQO> edges, Collection<SponsorsTierGQO> nodes, PageInfoGQO pageInfo, Integer totalCount) {
        this.edges = edges;
        this.nodes = nodes;
        this.pageInfo = pageInfo;
        this.totalCount = totalCount;
    }

    public Collection<SponsorsTierEdgeGQO> getEdges() {
        return edges;
    }
    public void setEdges(Collection<SponsorsTierEdgeGQO> edges) {
        this.edges = edges;
    }

    public Collection<SponsorsTierGQO> getNodes() {
        return nodes;
    }
    public void setNodes(Collection<SponsorsTierGQO> nodes) {
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