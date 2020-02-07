package io.github.conanchen.message.graphql.model;

import java.util.Collection;

import io.github.conanchen.zommon.graphql.model.PageInfoGQO;
import io.github.conanchen.message.graphql.model.ConversationsEdgeGQO;

public class ConversationsConnectionGQO {

    @javax.validation.constraints.NotNull
    private PageInfoGQO pageInfo;
    private Collection<ConversationsEdgeGQO> edges;
    private Integer totalCount;
    private Collection<ConversationGQO> films;

    public ConversationsConnectionGQO() {
    }

    public ConversationsConnectionGQO(final PageInfoGQO pageInfo, final Collection<ConversationsEdgeGQO> edges, final Integer totalCount, final Collection<ConversationGQO> films) {
        this.pageInfo = pageInfo;
        this.edges = edges;
        this.totalCount = totalCount;
        this.films = films;
    }

    public PageInfoGQO getPageInfo() {
        return pageInfo;
    }
    public void setPageInfo(final PageInfoGQO pageInfo) {
        this.pageInfo = pageInfo;
    }

    public Collection<ConversationsEdgeGQO> getEdges() {
        return edges;
    }
    public void setEdges(final Collection<ConversationsEdgeGQO> edges) {
        this.edges = edges;
    }

    public Integer getTotalCount() {
        return totalCount;
    }
    public void setTotalCount(final Integer totalCount) {
        this.totalCount = totalCount;
    }

    public Collection<ConversationGQO> getFilms() {
        return films;
    }
    public void setFilms(final Collection<ConversationGQO> films) {
        this.films = films;
    }

}