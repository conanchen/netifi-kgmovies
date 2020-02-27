package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class MarketplaceListingConnectionGQO {

    private Collection<MarketplaceListingEdgeGQO> edges;
    private Collection<MarketplaceListingGQO> nodes;
    @javax.validation.constraints.NotNull
    private PageInfoGQO pageInfo;
    @javax.validation.constraints.NotNull
    private Integer totalCount;

    public MarketplaceListingConnectionGQO() {
    }

    public MarketplaceListingConnectionGQO(Collection<MarketplaceListingEdgeGQO> edges, Collection<MarketplaceListingGQO> nodes, PageInfoGQO pageInfo, Integer totalCount) {
        this.edges = edges;
        this.nodes = nodes;
        this.pageInfo = pageInfo;
        this.totalCount = totalCount;
    }

    public Collection<MarketplaceListingEdgeGQO> getEdges() {
        return edges;
    }
    public void setEdges(Collection<MarketplaceListingEdgeGQO> edges) {
        this.edges = edges;
    }

    public Collection<MarketplaceListingGQO> getNodes() {
        return nodes;
    }
    public void setNodes(Collection<MarketplaceListingGQO> nodes) {
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