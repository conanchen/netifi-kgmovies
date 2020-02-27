package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class UpdateTeamReviewAssignmentPayloadGQO {

    private String clientMutationId;
    private TeamGQO team;

    public UpdateTeamReviewAssignmentPayloadGQO() {
    }

    public UpdateTeamReviewAssignmentPayloadGQO(String clientMutationId, TeamGQO team) {
        this.clientMutationId = clientMutationId;
        this.team = team;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public TeamGQO getTeam() {
        return team;
    }
    public void setTeam(TeamGQO team) {
        this.team = team;
    }

}