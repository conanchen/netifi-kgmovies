package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class UpdateTeamReviewAssignmentInputGQO {

    private TeamReviewAssignmentAlgorithmGQO algorithm;
    private String clientMutationId;
    @javax.validation.constraints.NotNull
    private Boolean enabled;
    @javax.validation.constraints.NotNull
    private Collection<String> excludedTeamMemberIds;
    @javax.validation.constraints.NotNull
    private String id;
    private Boolean notifyTeam;
    private Integer teamMemberCount;

    public UpdateTeamReviewAssignmentInputGQO() {
    }

    public UpdateTeamReviewAssignmentInputGQO(TeamReviewAssignmentAlgorithmGQO algorithm, String clientMutationId, Boolean enabled, Collection<String> excludedTeamMemberIds, String id, Boolean notifyTeam, Integer teamMemberCount) {
        this.algorithm = algorithm;
        this.clientMutationId = clientMutationId;
        this.enabled = enabled;
        this.excludedTeamMemberIds = excludedTeamMemberIds;
        this.id = id;
        this.notifyTeam = notifyTeam;
        this.teamMemberCount = teamMemberCount;
    }

    public TeamReviewAssignmentAlgorithmGQO getAlgorithm() {
        return algorithm;
    }
    public void setAlgorithm(TeamReviewAssignmentAlgorithmGQO algorithm) {
        this.algorithm = algorithm;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public Boolean getEnabled() {
        return enabled;
    }
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public Collection<String> getExcludedTeamMemberIds() {
        return excludedTeamMemberIds;
    }
    public void setExcludedTeamMemberIds(Collection<String> excludedTeamMemberIds) {
        this.excludedTeamMemberIds = excludedTeamMemberIds;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public Boolean getNotifyTeam() {
        return notifyTeam;
    }
    public void setNotifyTeam(Boolean notifyTeam) {
        this.notifyTeam = notifyTeam;
    }

    public Integer getTeamMemberCount() {
        return teamMemberCount;
    }
    public void setTeamMemberCount(Integer teamMemberCount) {
        this.teamMemberCount = teamMemberCount;
    }

}