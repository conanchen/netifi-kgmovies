package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class OrgRestoreMemberMembershipRepositoryAuditEntryDataGQO implements OrgRestoreMemberAuditEntryMembershipGQO, RepositoryAuditEntryDataGQO{

    private RepositoryGQO repository;
    private String repositoryName;
    private String repositoryResourcePath;
    private String repositoryUrl;

    public OrgRestoreMemberMembershipRepositoryAuditEntryDataGQO() {
    }

    public OrgRestoreMemberMembershipRepositoryAuditEntryDataGQO(RepositoryGQO repository, String repositoryName, String repositoryResourcePath, String repositoryUrl) {
        this.repository = repository;
        this.repositoryName = repositoryName;
        this.repositoryResourcePath = repositoryResourcePath;
        this.repositoryUrl = repositoryUrl;
    }

    public RepositoryGQO getRepository() {
        return repository;
    }
    public void setRepository(RepositoryGQO repository) {
        this.repository = repository;
    }

    public String getRepositoryName() {
        return repositoryName;
    }
    public void setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
    }

    public String getRepositoryResourcePath() {
        return repositoryResourcePath;
    }
    public void setRepositoryResourcePath(String repositoryResourcePath) {
        this.repositoryResourcePath = repositoryResourcePath;
    }

    public String getRepositoryUrl() {
        return repositoryUrl;
    }
    public void setRepositoryUrl(String repositoryUrl) {
        this.repositoryUrl = repositoryUrl;
    }

}