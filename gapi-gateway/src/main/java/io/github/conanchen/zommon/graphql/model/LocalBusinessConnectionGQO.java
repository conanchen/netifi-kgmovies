package io.github.conanchen.zommon.graphql.model;

import java.util.*;
import io.github.conanchen.zommon.graphql.api.*;

public class LocalBusinessConnectionGQO {

    @javax.validation.constraints.NotNull
    private PageInfoGQO pageInfo;
    private Collection<LocalBusinessGQO> edges;
    private Integer totalCount;
    private Collection<LocalBusinessGQO> localBusiness;

    public LocalBusinessConnectionGQO() {
    }

    public LocalBusinessConnectionGQO(PageInfoGQO pageInfo, Collection<LocalBusinessGQO> edges, Integer totalCount, Collection<LocalBusinessGQO> localBusiness) {
        this.pageInfo = pageInfo;
        this.edges = edges;
        this.totalCount = totalCount;
        this.localBusiness = localBusiness;
    }

    public PageInfoGQO getPageInfo() {
        return pageInfo;
    }
    public void setPageInfo(PageInfoGQO pageInfo) {
        this.pageInfo = pageInfo;
    }

    public Collection<LocalBusinessGQO> getEdges() {
        return edges;
    }
    public void setEdges(Collection<LocalBusinessGQO> edges) {
        this.edges = edges;
    }

    public Integer getTotalCount() {
        return totalCount;
    }
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public Collection<LocalBusinessGQO> getLocalBusiness() {
        return localBusiness;
    }
    public void setLocalBusiness(Collection<LocalBusinessGQO> localBusiness) {
        this.localBusiness = localBusiness;
    }

}