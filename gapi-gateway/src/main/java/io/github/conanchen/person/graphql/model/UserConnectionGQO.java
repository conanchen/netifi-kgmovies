package io.github.conanchen.person.graphql.model;

import java.util.*;
import io.github.conanchen.person.graphql.api.*;
import io.github.conanchen.zommon.graphql.model.PageInfoGQO;

public class UserConnectionGQO {

    @javax.validation.constraints.NotNull
    private PageInfoGQO pageInfo;
    private Collection<UserEdgeGQO> edges;
    private Integer totalCount;
    private Collection<UserGQO> nodes;

    public UserConnectionGQO() {
    }

    public UserConnectionGQO(PageInfoGQO pageInfo, Collection<UserEdgeGQO> edges, Integer totalCount, Collection<UserGQO> nodes) {
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

    public Collection<UserEdgeGQO> getEdges() {
        return edges;
    }
    public void setEdges(Collection<UserEdgeGQO> edges) {
        this.edges = edges;
    }

    public Integer getTotalCount() {
        return totalCount;
    }
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public Collection<UserGQO> getNodes() {
        return nodes;
    }
    public void setNodes(Collection<UserGQO> nodes) {
        this.nodes = nodes;
    }

}