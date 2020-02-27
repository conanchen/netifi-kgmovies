package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class AddPullRequestReviewInputGQO {

    private String body;
    private String clientMutationId;
    private Collection<DraftPullRequestReviewCommentGQO> comments;
    private String commitOID;
    private PullRequestReviewEventGQO event;
    @javax.validation.constraints.NotNull
    private String pullRequestId;
    private Collection<DraftPullRequestReviewThreadGQO> threads;

    public AddPullRequestReviewInputGQO() {
    }

    public AddPullRequestReviewInputGQO(String body, String clientMutationId, Collection<DraftPullRequestReviewCommentGQO> comments, String commitOID, PullRequestReviewEventGQO event, String pullRequestId, Collection<DraftPullRequestReviewThreadGQO> threads) {
        this.body = body;
        this.clientMutationId = clientMutationId;
        this.comments = comments;
        this.commitOID = commitOID;
        this.event = event;
        this.pullRequestId = pullRequestId;
        this.threads = threads;
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

    public Collection<DraftPullRequestReviewCommentGQO> getComments() {
        return comments;
    }
    public void setComments(Collection<DraftPullRequestReviewCommentGQO> comments) {
        this.comments = comments;
    }

    public String getCommitOID() {
        return commitOID;
    }
    public void setCommitOID(String commitOID) {
        this.commitOID = commitOID;
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

    public Collection<DraftPullRequestReviewThreadGQO> getThreads() {
        return threads;
    }
    public void setThreads(Collection<DraftPullRequestReviewThreadGQO> threads) {
        this.threads = threads;
    }

}