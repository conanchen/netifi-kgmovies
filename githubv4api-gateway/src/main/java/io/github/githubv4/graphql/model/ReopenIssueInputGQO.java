package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class ReopenIssueInputGQO {

    private String clientMutationId;
    @javax.validation.constraints.NotNull
    private String issueId;

    public ReopenIssueInputGQO() {
    }

    public ReopenIssueInputGQO(String clientMutationId, String issueId) {
        this.clientMutationId = clientMutationId;
        this.issueId = issueId;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public String getIssueId() {
        return issueId;
    }
    public void setIssueId(String issueId) {
        this.issueId = issueId;
    }

}