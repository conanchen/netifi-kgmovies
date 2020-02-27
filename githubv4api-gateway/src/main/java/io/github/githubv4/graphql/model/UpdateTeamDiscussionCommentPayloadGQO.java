package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class UpdateTeamDiscussionCommentPayloadGQO {

    private String clientMutationId;
    private TeamDiscussionCommentGQO teamDiscussionComment;

    public UpdateTeamDiscussionCommentPayloadGQO() {
    }

    public UpdateTeamDiscussionCommentPayloadGQO(String clientMutationId, TeamDiscussionCommentGQO teamDiscussionComment) {
        this.clientMutationId = clientMutationId;
        this.teamDiscussionComment = teamDiscussionComment;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public TeamDiscussionCommentGQO getTeamDiscussionComment() {
        return teamDiscussionComment;
    }
    public void setTeamDiscussionComment(TeamDiscussionCommentGQO teamDiscussionComment) {
        this.teamDiscussionComment = teamDiscussionComment;
    }

}