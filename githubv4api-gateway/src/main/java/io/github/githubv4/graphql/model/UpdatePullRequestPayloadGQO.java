package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class UpdatePullRequestPayloadGQO {

    private ActorGQO actor;
    private String clientMutationId;
    private PullRequestGQO pullRequest;

    public UpdatePullRequestPayloadGQO() {
    }

    public UpdatePullRequestPayloadGQO(ActorGQO actor, String clientMutationId, PullRequestGQO pullRequest) {
        this.actor = actor;
        this.clientMutationId = clientMutationId;
        this.pullRequest = pullRequest;
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

    public PullRequestGQO getPullRequest() {
        return pullRequest;
    }
    public void setPullRequest(PullRequestGQO pullRequest) {
        this.pullRequest = pullRequest;
    }

}