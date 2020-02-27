package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class CreateTeamDiscussionPayloadGQO {

    private String clientMutationId;
    private TeamDiscussionGQO teamDiscussion;

    public CreateTeamDiscussionPayloadGQO() {
    }

    public CreateTeamDiscussionPayloadGQO(String clientMutationId, TeamDiscussionGQO teamDiscussion) {
        this.clientMutationId = clientMutationId;
        this.teamDiscussion = teamDiscussion;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public TeamDiscussionGQO getTeamDiscussion() {
        return teamDiscussion;
    }
    public void setTeamDiscussion(TeamDiscussionGQO teamDiscussion) {
        this.teamDiscussion = teamDiscussion;
    }

}