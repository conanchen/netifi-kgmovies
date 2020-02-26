package io.github.conanchen.message.graphql.model;

import java.util.Collection;

import io.github.conanchen.zommon.graphql.model.PageInfoGQO;
import io.github.conanchen.message.graphql.model.ConversationsEdgeGQO;

public class ConversationsConnectionGQO {

    @javax.validation.constraints.NotNull
    private PageInfoGQO pageInfo;
    private Collection<ConversationsEdgeGQO> edges;
    private Integer totalCount;
    private Collection<ConversationGQO> items;

    public ConversationsConnectionGQO() {
    }

    public ConversationsConnectionGQO(PageInfoGQO pageInfo, Collection<ConversationsEdgeGQO> edges, Integer totalCount, Collection<ConversationGQO> items) {
        this.pageInfo = pageInfo;
        this.edges = edges;
        this.totalCount = totalCount;
        this.items = items;
    }

    public PageInfoGQO getPageInfo() {
        return pageInfo;
    }
    public void setPageInfo(PageInfoGQO pageInfo) {
        this.pageInfo = pageInfo;
    }

    public Collection<ConversationsEdgeGQO> getEdges() {
        return edges;
    }
    public void setEdges(Collection<ConversationsEdgeGQO> edges) {
        this.edges = edges;
    }

    public Integer getTotalCount() {
        return totalCount;
    }
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public Collection<ConversationGQO> getItems() {
        return items;
    }
    public void setItems(Collection<ConversationGQO> items) {
        this.items = items;
    }

}