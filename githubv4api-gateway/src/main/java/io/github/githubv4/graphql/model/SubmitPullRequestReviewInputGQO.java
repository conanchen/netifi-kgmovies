package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class SubmitPullRequestReviewInputGQO {

    private String body;
    private String clientMutationId;
    @javax.validation.constraints.NotNull
    private PullRequestReviewEventGQO event;
    private String pullRequestId;
    private String pullRequestReviewId;

    public SubmitPullRequestReviewInputGQO() {
    }

    public SubmitPullRequestReviewInputGQO(String body, String clientMutationId, PullRequestReviewEventGQO event, String pullRequestId, String pullRequestReviewId) {
        this.body = body;
        this.clientMutationId = clientMutationId;
        this.event = event;
        this.pullRequestId = pullRequestId;
        this.pullRequestReviewId = pullRequestReviewId;
    }

    public String getBody() {
        return body;
    }
    public void setBody(String body) {
        this.body = body;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public PullRequestReviewEventGQO getEvent() {
        return event;
    }
    public void setEvent(PullRequestReviewEventGQO event) {
        this.event = event;
    }

    public String getPullRequestId() {
        return pullRequestId;
    }
    public void setPullRequestId(String pullRequestId) {
        this.pullRequestId = pullRequestId;
    }

    public String getPullRequestReviewId() {
        return pullRequestReviewId;
    }
    public void setPullRequestReviewId(String pullRequestReviewId) {
        this.pullRequestReviewId = pullRequestReviewId;
    }

}