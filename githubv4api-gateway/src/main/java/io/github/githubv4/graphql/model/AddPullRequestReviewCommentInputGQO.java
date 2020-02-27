package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class AddPullRequestReviewCommentInputGQO {

    @javax.validation.constraints.NotNull
    private String body;
    private String clientMutationId;
    private String commitOID;
    private String inReplyTo;
    private String path;
    private Integer position;
    private String pullRequestId;
    private String pullRequestReviewId;

    public AddPullRequestReviewCommentInputGQO() {
    }

    public AddPullRequestReviewCommentInputGQO(String body, String clientMutationId, String commitOID, String inReplyTo, String path, Integer position, String pullRequestId, String pullRequestReviewId) {
        this.body = body;
        this.clientMutationId = clientMutationId;
        this.commitOID = commitOID;
        this.inReplyTo = inReplyTo;
        this.path = path;
        this.position = position;
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

    public String getCommitOID() {
        return commitOID;
    }
    public void setCommitOID(String commitOID) {
        this.commitOID = commitOID;
    }

    public String getInReplyTo() {
        return inReplyTo;
    }
    public void setInReplyTo(String inReplyTo) {
        this.inReplyTo = inReplyTo;
    }

    public String getPath() {
        return path;
    }
    public void setPath(String path) {
        this.path = path;
    }

    public Integer getPosition() {
        return position;
    }
    public void setPosition(Integer position) {
        this.position = position;
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