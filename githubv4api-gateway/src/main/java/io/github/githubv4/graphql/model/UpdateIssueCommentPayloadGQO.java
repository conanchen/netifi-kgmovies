package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class UpdateIssueCommentPayloadGQO {

    private String clientMutationId;
    private IssueCommentGQO issueComment;

    public UpdateIssueCommentPayloadGQO() {
    }

    public UpdateIssueCommentPayloadGQO(String clientMutationId, IssueCommentGQO issueComment) {
        this.clientMutationId = clientMutationId;
        this.issueComment = issueComment;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public IssueCommentGQO getIssueComment() {
        return issueComment;
    }
    public void setIssueComment(IssueCommentGQO issueComment) {
        this.issueComment = issueComment;
    }

}