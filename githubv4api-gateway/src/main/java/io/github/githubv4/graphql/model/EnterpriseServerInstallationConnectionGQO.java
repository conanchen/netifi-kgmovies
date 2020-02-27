package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class EnterpriseServerInstallationConnectionGQO {

    private Collection<EnterpriseServerInstallationEdgeGQO> edges;
    private Collection<EnterpriseServerInstallationGQO> nodes;
    @javax.validation.constraints.NotNull
    private PageInfoGQO pageInfo;
    @javax.validation.constraints.NotNull
    private Integer totalCount;

    public EnterpriseServerInstallationConnectionGQO() {
    }

    public EnterpriseServerInstallationConnectionGQO(Collection<EnterpriseServerInstallationEdgeGQO> edges, Collection<EnterpriseServerInstallationGQO> nodes, PageInfoGQO pageInfo, Integer totalCount) {
        this.edges = edges;
        this.nodes = nodes;
        this.pageInfo = pageInfo;
        this.totalCount = totalCount;
    }

    public Collection<EnterpriseServerInstallationEdgeGQO> getEdges() {
        return edges;
    }
    public void setEdges(Collection<EnterpriseServerInstallationEdgeGQO> edges) {
        this.edges = edges;
    }

    public Collection<EnterpriseServerInstallationGQO> getNodes() {
        return nodes;
    }
    public void setNodes(Collection<EnterpriseServerInstallationGQO> nodes) {
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