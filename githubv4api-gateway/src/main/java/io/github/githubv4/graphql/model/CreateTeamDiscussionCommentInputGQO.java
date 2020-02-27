package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class CreateTeamDiscussionCommentInputGQO {

    @javax.validation.constraints.NotNull
    private String body;
    private String clientMutationId;
    @javax.validation.constraints.NotNull
    private String discussionId;

    public CreateTeamDiscussionCommentInputGQO() {
    }

    public CreateTeamDiscussionCommentInputGQO(String body, String clientMutationId, String discussionId) {
        this.body = body;
        this.clientMutationId = clientMutationId;
        this.discussionId = discussionId;
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

    public String getDiscussionId() {
        return discussionId;
    }
    public void setDiscussionId(String discussionId) {
        this.discussionId = discussionId;
    }

}