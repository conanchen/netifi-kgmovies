package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class RerequestCheckSuiteInputGQO {

    @javax.validation.constraints.NotNull
    private String checkSuiteId;
    private String clientMutationId;
    @javax.validation.constraints.NotNull
    private String repositoryId;

    public RerequestCheckSuiteInputGQO() {
    }

    public RerequestCheckSuiteInputGQO(String checkSuiteId, String clientMutationId, String repositoryId) {
        this.checkSuiteId = checkSuiteId;
        this.clientMutationId = clientMutationId;
        this.repositoryId = repositoryId;
    }

    public String getCheckSuiteId() {
        return checkSuiteId;
    }
    public void setCheckSuiteId(String checkSuiteId) {
        this.checkSuiteId = checkSuiteId;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public String getRepositoryId() {
        return repositoryId;
    }
    public void setRepositoryId(String repositoryId) {
        this.repositoryId = repositoryId;
    }

}