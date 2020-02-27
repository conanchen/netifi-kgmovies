package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class UnresolveReviewThreadInputGQO {

    private String clientMutationId;
    @javax.validation.constraints.NotNull
    private String threadId;

    public UnresolveReviewThreadInputGQO() {
    }

    public UnresolveReviewThreadInputGQO(String clientMutationId, String threadId) {
        this.clientMutationId = clientMutationId;
        this.threadId = threadId;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public String getThreadId() {
        return threadId;
    }
    public void setThreadId(String threadId) {
        this.threadId = threadId;
    }

}