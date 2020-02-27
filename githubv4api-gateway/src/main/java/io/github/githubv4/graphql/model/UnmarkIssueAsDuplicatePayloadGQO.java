package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class UnmarkIssueAsDuplicatePayloadGQO {

    private String clientMutationId;
    private IssueOrPullRequestGQO duplicate;

    public UnmarkIssueAsDuplicatePayloadGQO() {
    }

    public UnmarkIssueAsDuplicatePayloadGQO(String clientMutationId, IssueOrPullRequestGQO duplicate) {
        this.clientMutationId = clientMutationId;
        this.duplicate = duplicate;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public IssueOrPullRequestGQO getDuplicate() {
        return duplicate;
    }
    public void setDuplicate(IssueOrPullRequestGQO duplicate) {
        this.duplicate = duplicate;
    }

}