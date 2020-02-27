package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class SearchResultItemConnectionGQO {

    @javax.validation.constraints.NotNull
    private Integer codeCount;
    private Collection<SearchResultItemEdgeGQO> edges;
    @javax.validation.constraints.NotNull
    private Integer issueCount;
    private Collection<SearchResultItemGQO> nodes;
    @javax.validation.constraints.NotNull
    private PageInfoGQO pageInfo;
    @javax.validation.constraints.NotNull
    private Integer repositoryCount;
    @javax.validation.constraints.NotNull
    private Integer userCount;
    @javax.validation.constraints.NotNull
    private Integer wikiCount;

    public SearchResultItemConnectionGQO() {
    }

    public SearchResultItemConnectionGQO(Integer codeCount, Collection<SearchResultItemEdgeGQO> edges, Integer issueCount, Collection<SearchResultItemGQO> nodes, PageInfoGQO pageInfo, Integer repositoryCount, Integer userCount, Integer wikiCount) {
        this.codeCount = codeCount;
        this.edges = edges;
        this.issueCount = issueCount;
        this.nodes = nodes;
        this.pageInfo = pageInfo;
        this.repositoryCount = repositoryCount;
        this.userCount = userCount;
        this.wikiCount = wikiCount;
    }

    public Integer getCodeCount() {
        return codeCount;
    }
    public void setCodeCount(Integer codeCount) {
        this.codeCount = codeCount;
    }

    public Collection<SearchResultItemEdgeGQO> getEdges() {
        return edges;
    }
    public void setEdges(Collection<SearchResultItemEdgeGQO> edges) {
        this.edges = edges;
    }

    public Integer getIssueCount() {
        return issueCount;
    }
    public void setIssueCount(Integer issueCount) {
        this.issueCount = issueCount;
    }

    public Collection<SearchResultItemGQO> getNodes() {
        return nodes;
    }
    public void setNodes(Collection<SearchResultItemGQO> nodes) {
        this.nodes = nodes;
    }

    public PageInfoGQO getPageInfo() {
        return pageInfo;
    }
    public void setPageInfo(PageInfoGQO pageInfo) {
        this.pageInfo = pageInfo;
    }

    public Integer getRepositoryCount() {
        return repositoryCount;
    }
    public void setRepositoryCount(Integer repositoryCount) {
        this.repositoryCount = repositoryCount;
    }

    public Integer getUserCount() {
        return userCount;
    }
    public void setUserCount(Integer userCount) {
        this.userCount = userCount;
    }

    public Integer getWikiCount() {
        return wikiCount;
    }
    public void setWikiCount(Integer wikiCount) {
        this.wikiCount = wikiCount;
    }

}