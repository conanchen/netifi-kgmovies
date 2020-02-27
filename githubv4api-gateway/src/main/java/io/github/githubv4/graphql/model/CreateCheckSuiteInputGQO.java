package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class CreateCheckSuiteInputGQO {

    private String clientMutationId;
    @javax.validation.constraints.NotNull
    private String headSha;
    @javax.validation.constraints.NotNull
    private String repositoryId;

    public CreateCheckSuiteInputGQO() {
    }

    public CreateCheckSuiteInputGQO(String clientMutationId, String headSha, String repositoryId) {
        this.clientMutationId = clientMutationId;
        this.headSha = headSha;
        this.repositoryId = repositoryId;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public String getHeadSha() {
        return headSha;
    }
    public void setHeadSha(String headSha) {
        this.headSha = headSha;
    }

    public String getRepositoryId() {
        return repositoryId;
    }
    public void setRepositoryId(String repositoryId) {
        this.repositoryId = repositoryId;
    }

}