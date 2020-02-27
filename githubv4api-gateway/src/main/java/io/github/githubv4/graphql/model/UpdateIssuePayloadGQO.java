package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class UpdateIssuePayloadGQO {

    private ActorGQO actor;
    private String clientMutationId;
    private IssueGQO issue;

    public UpdateIssuePayloadGQO() {
    }

    public UpdateIssuePayloadGQO(ActorGQO actor, String clientMutationId, IssueGQO issue) {
        this.actor = actor;
        this.clientMutationId = clientMutationId;
        this.issue = issue;
    }

    public ActorGQO getActor() {
        return actor;
    }
    public void setActor(ActorGQO actor) {
        this.actor = actor;
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