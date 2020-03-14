package io.github.conanchen.message.graphql.model;

import java.util.*;
import io.github.conanchen.message.graphql.api.*;
import graphql.relay.PageInfo;

public class ConversationConnectionGQO {

    @javax.validation.constraints.NotNull
    private PageInfo pageInfo;
    private Collection<ConversationEdgeGQO> edges;
    private Integer totalCount;
    private Collection<ConversationGQO> nodes;

    public ConversationConnectionGQO() {
    }

    public ConversationConnectionGQO(PageInfo pageInfo, Collection<ConversationEdgeGQO> edges, Integer totalCount, Collection<ConversationGQO> nodes) {
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

    public Collection<ConversationEdgeGQO> getEdges() {
        return edges;
    }
    public void setEdges(Collection<ConversationEdgeGQO> edges) {
        this.edges = edges;
    }

    public Integer getTotalCount() {
        return totalCount;
    }
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public Collection<ConversationGQO> getNodes() {
        return nodes;
    }
    public void setNodes(Collection<ConversationGQO> nodes) {
        this.nodes = nodes;
    }

}