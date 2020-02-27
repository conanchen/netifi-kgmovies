package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class PinIssuePayloadGQO {

    private String clientMutationId;
    private IssueGQO issue;

    public PinIssuePayloadGQO() {
    }

    public PinIssuePayloadGQO(String clientMutationId, IssueGQO issue) {
        this.clientMutationId = clientMutationId;
        this.issue = issue;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public IssueGQO getIssue() {
        return issue;
    }
    public void setIssue(IssueGQO issue) {
        this.issue = issue;
    }

}