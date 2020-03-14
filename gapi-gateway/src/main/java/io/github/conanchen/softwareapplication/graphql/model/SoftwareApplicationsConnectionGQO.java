package io.github.conanchen.softwareapplication.graphql.model;

import graphql.relay.PageInfo;

import java.util.Collection;

public class SoftwareApplicationsConnectionGQO {

    @javax.validation.constraints.NotNull
    private PageInfo pageInfo;
    private Collection<SoftwareApplicationsEdgeGQO> edges;
    private Integer totalCount;
    private Collection<SoftwareApplicationGQO> films;

    public SoftwareApplicationsConnectionGQO() {
    }

    public SoftwareApplicationsConnectionGQO(PageInfo pageInfo, Collection<SoftwareApplicationsEdgeGQO> edges, Integer totalCount, Collection<SoftwareApplicationGQO> films) {
        this.pageInfo = pageInfo;
        this.edges = edges;
        this.totalCount = totalCount;
        this.films = films;
    }

    public PageInfo getPageInfo() {
        return pageInfo;
    }
    public void setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
    }

    public Collection<SoftwareApplicationsEdgeGQO> getEdges() {
        return edges;
    }
    public void setEdges(Collection<SoftwareApplicationsEdgeGQO> edges) {
        this.edges = edges;
    }

    public Integer getTotalCount() {
        return totalCount;
    }
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public Collection<SoftwareApplicationGQO> getFilms() {
        return films;
    }
    public void setFilms(Collection<SoftwareApplicationGQO> films) {
        this.films = films;
    }

}