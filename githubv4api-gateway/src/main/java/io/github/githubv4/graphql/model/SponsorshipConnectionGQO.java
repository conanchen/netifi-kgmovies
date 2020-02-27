package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class SponsorshipConnectionGQO {

    private Collection<SponsorshipEdgeGQO> edges;
    private Collection<SponsorshipGQO> nodes;
    @javax.validation.constraints.NotNull
    private PageInfoGQO pageInfo;
    @javax.validation.constraints.NotNull
    private Integer totalCount;

    public SponsorshipConnectionGQO() {
    }

    public SponsorshipConnectionGQO(Collection<SponsorshipEdgeGQO> edges, Collection<SponsorshipGQO> nodes, PageInfoGQO pageInfo, Integer totalCount) {
        this.edges = edges;
        this.nodes = nodes;
        this.pageInfo = pageInfo;
        this.totalCount = totalCount;
    }

    public Collection<SponsorshipEdgeGQO> getEdges() {
        return edges;
    }
    public void setEdges(Collection<SponsorshipEdgeGQO> edges) {
        this.edges = edges;
    }

    public Collection<SponsorshipGQO> getNodes() {
        return nodes;
    }
    public void setNodes(Collection<SponsorshipGQO> nodes) {
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