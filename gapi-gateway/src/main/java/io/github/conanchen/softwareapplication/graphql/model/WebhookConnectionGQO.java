package io.github.conanchen.softwareapplication.graphql.model;

import java.util.*;
import io.github.conanchen.softwareapplication.graphql.api.*;
import io.github.conanchen.zommon.graphql.model.PageInfoGQO;

public class WebhookConnectionGQO {

    @javax.validation.constraints.NotNull
    private PageInfoGQO pageInfo;
    private Collection<WebhookEdgeGQO> edges;
    private Integer totalCount;
    private Collection<WebhookGQO> nodes;

    public WebhookConnectionGQO() {
    }

    public WebhookConnectionGQO(PageInfoGQO pageInfo, Collection<WebhookEdgeGQO> edges, Integer totalCount, Collection<WebhookGQO> nodes) {
        this.pageInfo = pageInfo;
        this.edges = edges;
        this.totalCount = totalCount;
        this.nodes = nodes;
    }

    public PageInfoGQO getPageInfo() {
        return pageInfo;
    }
    public void setPageInfo(PageInfoGQO pageInfo) {
        this.pageInfo = pageInfo;
    }

    public Collection<WebhookEdgeGQO> getEdges() {
        return edges;
    }
    public void setEdges(Collection<WebhookEdgeGQO> edges) {
        this.edges = edges;
    }

    public Integer getTotalCount() {
        return totalCount;
    }
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public Collection<WebhookGQO> getNodes() {
        return nodes;
    }
    public void setNodes(Collection<WebhookGQO> nodes) {
        this.nodes = nodes;
    }

}