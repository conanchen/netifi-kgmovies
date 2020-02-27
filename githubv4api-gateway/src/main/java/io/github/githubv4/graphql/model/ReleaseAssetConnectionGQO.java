package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class ReleaseAssetConnectionGQO {

    private Collection<ReleaseAssetEdgeGQO> edges;
    private Collection<ReleaseAssetGQO> nodes;
    @javax.validation.constraints.NotNull
    private PageInfoGQO pageInfo;
    @javax.validation.constraints.NotNull
    private Integer totalCount;

    public ReleaseAssetConnectionGQO() {
    }

    public ReleaseAssetConnectionGQO(Collection<ReleaseAssetEdgeGQO> edges, Collection<ReleaseAssetGQO> nodes, PageInfoGQO pageInfo, Integer totalCount) {
        this.edges = edges;
        this.nodes = nodes;
        this.pageInfo = pageInfo;
        this.totalCount = totalCount;
    }

    public Collection<ReleaseAssetEdgeGQO> getEdges() {
        return edges;
    }
    public void setEdges(Collection<ReleaseAssetEdgeGQO> edges) {
        this.edges = edges;
    }

    public Collection<ReleaseAssetGQO> getNodes() {
        return nodes;
    }
    public void setNodes(Collection<ReleaseAssetGQO> nodes) {
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