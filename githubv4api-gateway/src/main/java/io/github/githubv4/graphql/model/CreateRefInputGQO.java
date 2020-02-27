package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class CreateRefInputGQO {

    private String clientMutationId;
    @javax.validation.constraints.NotNull
    private String name;
    @javax.validation.constraints.NotNull
    private String oid;
    @javax.validation.constraints.NotNull
    private String repositoryId;

    public CreateRefInputGQO() {
    }

    public CreateRefInputGQO(String clientMutationId, String name, String oid, String repositoryId) {
        this.clientMutationId = clientMutationId;
        this.name = name;
        this.oid = oid;
        this.repositoryId = repositoryId;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getOid() {
        return oid;
    }
    public void setOid(String oid) {
        this.oid = oid;
    }

    public String getRepositoryId() {
        return repositoryId;
    }
    public void setRepositoryId(String repositoryId) {
        this.repositoryId = repositoryId;
    }

}