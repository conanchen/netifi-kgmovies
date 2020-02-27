package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class AddPullRequestReviewThreadPayloadGQO {

    private String clientMutationId;
    private PullRequestReviewThreadGQO thread;

    public AddPullRequestReviewThreadPayloadGQO() {
    }

    public AddPullRequestReviewThreadPayloadGQO(String clientMutationId, PullRequestReviewThreadGQO thread) {
        this.clientMutationId = clientMutationId;
        this.thread = thread;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public PullRequestReviewThreadGQO getThread() {
        return thread;
    }
    public void setThread(PullRequestReviewThreadGQO thread) {
        this.thread = thread;
    }

}