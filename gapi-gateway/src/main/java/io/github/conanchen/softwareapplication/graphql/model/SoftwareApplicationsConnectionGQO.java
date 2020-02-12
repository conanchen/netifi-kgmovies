package io.github.conanchen.softwareapplication.graphql.model;

import java.util.Collection;
import io.github.conanchen.zommon.graphql.model.PageInfoGQO;

public class SoftwareApplicationsConnectionGQO {

    @javax.validation.constraints.NotNull
    private PageInfoGQO pageInfo;
    private Collection<SoftwareApplicationsEdgeGQO> edges;
    private Integer totalCount;
    private Collection<SoftwareApplicationGQO> films;

    public SoftwareApplicationsConnectionGQO() {
    }

    public SoftwareApplicationsConnectionGQO(PageInfoGQO pageInfo, Collection<SoftwareApplicationsEdgeGQO> edges, Integer totalCount, Collection<SoftwareApplicationGQO> films) {
        this.pageInfo = pageInfo;
        this.edges = edges;
        this.totalCount = totalCount;
        this.films = films;
    }

    public PageInfoGQO getPageInfo() {
        return pageInfo;
    }
    public void setPageInfo(PageInfoGQO pageInfo) {
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