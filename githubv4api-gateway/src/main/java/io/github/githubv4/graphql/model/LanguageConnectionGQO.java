package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class LanguageConnectionGQO {

    private Collection<LanguageEdgeGQO> edges;
    private Collection<LanguageGQO> nodes;
    @javax.validation.constraints.NotNull
    private PageInfoGQO pageInfo;
    @javax.validation.constraints.NotNull
    private Integer totalCount;
    @javax.validation.constraints.NotNull
    private Integer totalSize;

    public LanguageConnectionGQO() {
    }

    public LanguageConnectionGQO(Collection<LanguageEdgeGQO> edges, Collection<LanguageGQO> nodes, PageInfoGQO pageInfo, Integer totalCount, Integer totalSize) {
        this.edges = edges;
        this.nodes = nodes;
        this.pageInfo = pageInfo;
        this.totalCount = totalCount;
        this.totalSize = totalSize;
    }

    public Collection<LanguageEdgeGQO> getEdges() {
        return edges;
    }
    public void setEdges(Collection<LanguageEdgeGQO> edges) {
        this.edges = edges;
    }

    public Collection<LanguageGQO> getNodes() {
        return nodes;
    }
    public void setNodes(Collection<LanguageGQO> nodes) {
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

    public Integer getTotalSize() {
        return totalSize;
    }
    public void setTotalSize(Integer totalSize) {
        this.totalSize = totalSize;
    }

}