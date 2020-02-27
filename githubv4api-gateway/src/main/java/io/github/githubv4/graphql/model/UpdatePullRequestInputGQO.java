package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class UpdatePullRequestInputGQO {

    @javax.validation.constraints.NotNull
    private Collection<String> assigneeIds;
    private String baseRefName;
    private String body;
    private String clientMutationId;
    @javax.validation.constraints.NotNull
    private Collection<String> labelIds;
    private Boolean maintainerCanModify;
    private String milestoneId;
    @javax.validation.constraints.NotNull
    private Collection<String> projectIds;
    @javax.validation.constraints.NotNull
    private String pullRequestId;
    private PullRequestUpdateStateGQO state;
    private String title;

    public UpdatePullRequestInputGQO() {
    }

    public UpdatePullRequestInputGQO(Collection<String> assigneeIds, String baseRefName, String body, String clientMutationId, Collection<String> labelIds, Boolean maintainerCanModify, String milestoneId, Collection<String> projectIds, String pullRequestId, PullRequestUpdateStateGQO state, String title) {
        this.assigneeIds = assigneeIds;
        this.baseRefName = baseRefName;
        this.body = body;
        this.clientMutationId = clientMutationId;
        this.labelIds = labelIds;
        this.maintainerCanModify = maintainerCanModify;
        this.milestoneId = milestoneId;
        this.projectIds = projectIds;
        this.pullRequestId = pullRequestId;
        this.state = state;
        this.title = title;
    }

    public Collection<String> getAssigneeIds() {
        return assigneeIds;
    }
    public void setAssigneeIds(Collection<String> assigneeIds) {
        this.assigneeIds = assigneeIds;
    }

    public String getBaseRefName() {
        return baseRefName;
    }
    public void setBaseRefName(String baseRefName) {
        this.baseRefName = baseRefName;
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

    public Collection<String> getLabelIds() {
        return labelIds;
    }
    public void setLabelIds(Collection<String> labelIds) {
        this.labelIds = labelIds;
    }

    public Boolean getMaintainerCanModify() {
        return maintainerCanModify;
    }
    public void setMaintainerCanModify(Boolean maintainerCanModify) {
        this.maintainerCanModify = maintainerCanModify;
    }

    public String getMilestoneId() {
        return milestoneId;
    }
    public void setMilestoneId(String milestoneId) {
        this.milestoneId = milestoneId;
    }

    public Collection<String> getProjectIds() {
        return projectIds;
    }
    public void setProjectIds(Collection<String> projectIds) {
        this.projectIds = projectIds;
    }

    public String getPullRequestId() {
        return pullRequestId;
    }
    public void setPullRequestId(String pullRequestId) {
        this.pullRequestId = pullRequestId;
    }

    public PullRequestUpdateStateGQO getState() {
        return state;
    }
    public void setState(PullRequestUpdateStateGQO state) {
        this.state = state;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

}