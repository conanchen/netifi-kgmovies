package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class MergeBranchPayloadGQO {

    private String clientMutationId;
    private CommitGQO mergeCommit;

    public MergeBranchPayloadGQO() {
    }

    public MergeBranchPayloadGQO(String clientMutationId, CommitGQO mergeCommit) {
        this.clientMutationId = clientMutationId;
        this.mergeCommit = mergeCommit;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public CommitGQO getMergeCommit() {
        return mergeCommit;
    }
    public void setMergeCommit(CommitGQO mergeCommit) {
        this.mergeCommit = mergeCommit;
    }

}