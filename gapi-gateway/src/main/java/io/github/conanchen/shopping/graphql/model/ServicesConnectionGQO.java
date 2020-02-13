package io.github.conanchen.shopping.graphql.model;

import java.util.Collection;
import io.github.conanchen.zommon.graphql.model.PageInfoGQO;

public class ServicesConnectionGQO {

    @javax.validation.constraints.NotNull
    private PageInfoGQO pageInfo;
    private Collection<ServicesEdgeGQO> edges;
    private Integer totalCount;
    private Collection<ServiceGQO> services;

    public ServicesConnectionGQO() {
    }

    public ServicesConnectionGQO(PageInfoGQO pageInfo, Collection<ServicesEdgeGQO> edges, Integer totalCount, Collection<ServiceGQO> services) {
        this.pageInfo = pageInfo;
        this.edges = edges;
        this.totalCount = totalCount;
        this.services = services;
    }

    public PageInfoGQO getPageInfo() {
        return pageInfo;
    }
    public void setPageInfo(PageInfoGQO pageInfo) {
        this.pageInfo = pageInfo;
    }

    public Collection<ServicesEdgeGQO> getEdges() {
        return edges;
    }
    public void setEdges(Collection<ServicesEdgeGQO> edges) {
        this.edges = edges;
    }

    public Integer getTotalCount() {
        return totalCount;
    }
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public Collection<ServiceGQO> getServices() {
        return services;
    }
    public void setServices(Collection<ServiceGQO> services) {
        this.services = services;
    }

}