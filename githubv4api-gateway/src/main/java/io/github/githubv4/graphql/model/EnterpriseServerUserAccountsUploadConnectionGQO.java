package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class EnterpriseServerUserAccountsUploadConnectionGQO {

    private Collection<EnterpriseServerUserAccountsUploadEdgeGQO> edges;
    private Collection<EnterpriseServerUserAccountsUploadGQO> nodes;
    @javax.validation.constraints.NotNull
    private PageInfoGQO pageInfo;
    @javax.validation.constraints.NotNull
    private Integer totalCount;

    public EnterpriseServerUserAccountsUploadConnectionGQO() {
    }

    public EnterpriseServerUserAccountsUploadConnectionGQO(Collection<EnterpriseServerUserAccountsUploadEdgeGQO> edges, Collection<EnterpriseServerUserAccountsUploadGQO> nodes, PageInfoGQO pageInfo, Integer totalCount) {
        this.edges = edges;
        this.nodes = nodes;
        this.pageInfo = pageInfo;
        this.totalCount = totalCount;
    }

    public Collection<EnterpriseServerUserAccountsUploadEdgeGQO> getEdges() {
        return edges;
    }
    public void setEdges(Collection<EnterpriseServerUserAccountsUploadEdgeGQO> edges) {
        this.edges = edges;
    }

    public Collection<EnterpriseServerUserAccountsUploadGQO> getNodes() {
        return nodes;
    }
    public void setNodes(Collection<EnterpriseServerUserAccountsUploadGQO> nodes) {
        this.nodes = nodes;
    }

    public PageInfoGQO getPageInfo() {
        return pageInfo;
    }
    public void setPageInfo(PageInfoGQO pageInfo) {
        this.pageInfo = pageInfo;
    }

    public Integer getTotalCount() {
        return totalCount;
    }
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

}