package io.github.conanchen.softwareapplication.graphql.model;

import java.util.*;
import io.github.conanchen.softwareapplication.graphql.api.*;
import graphql.relay.PageInfo;

public class WebhookConnectionGQO {

    @javax.validation.constraints.NotNull
    private PageInfo pageInfo;
    private Collection<WebhookEdgeGQO> edges;
    private Integer totalCount;
    private Collection<WebhookGQO> nodes;

    public WebhookConnectionGQO() {
    }

    public WebhookConnectionGQO(PageInfo pageInfo, Collection<WebhookEdgeGQO> edges, Integer totalCount, Collection<WebhookGQO> nodes) {
        this.pageInfo = pageInfo;
        this.edges = edges;
        this.totalCount = totalCount;
        this.nodes = nodes;
    }

    public PageInfo getPageInfo() {
        return pageInfo;
    }
    public void setPageInfo(PageInfo pageInfo) {
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