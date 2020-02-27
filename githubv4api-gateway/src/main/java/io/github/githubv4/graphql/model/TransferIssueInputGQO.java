package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class TransferIssueInputGQO {

    private String clientMutationId;
    @javax.validation.constraints.NotNull
    private String issueId;
    @javax.validation.constraints.NotNull
    private String repositoryId;

    public TransferIssueInputGQO() {
    }

    public TransferIssueInputGQO(String clientMutationId, String issueId, String repositoryId) {
        this.clientMutationId = clientMutationId;
        this.issueId = issueId;
        this.repositoryId = repositoryId;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public String getIssueId() {
        return issueId;
    }
    public void setIssueId(String issueId) {
        this.issueId = issueId;
    }

    public String getRepositoryId() {
        return repositoryId;
    }
    public void setRepositoryId(String repositoryId) {
        this.repositoryId = repositoryId;
    }

}