package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class MergeBranchInputGQO {

    @javax.validation.constraints.NotNull
    private String base;
    private String clientMutationId;
    private String commitMessage;
    @javax.validation.constraints.NotNull
    private String head;
    @javax.validation.constraints.NotNull
    private String repositoryId;

    public MergeBranchInputGQO() {
    }

    public MergeBranchInputGQO(String base, String clientMutationId, String commitMessage, String head, String repositoryId) {
        this.base = base;
        this.clientMutationId = clientMutationId;
        this.commitMessage = commitMessage;
        this.head = head;
        this.repositoryId = repositoryId;
    }

    public String getBase() {
        return base;
    }
    public void setBase(String base) {
        this.base = base;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public String getCommitMessage() {
        return commitMessage;
    }
    public void setCommitMessage(String commitMessage) {
        this.commitMessage = commitMessage;
    }

    public String getHead() {
        return head;
    }
    public void setHead(String head) {
        this.head = head;
    }

    public String getRepositoryId() {
        return repositoryId;
    }
    public void setRepositoryId(String repositoryId) {
        this.repositoryId = repositoryId;
    }

}