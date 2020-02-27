package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class UpdateCheckRunInputGQO {

    @javax.validation.constraints.NotNull
    private Collection<CheckRunActionGQO> actions;
    @javax.validation.constraints.NotNull
    private String checkRunId;
    private String clientMutationId;
    private java.util.Date completedAt;
    private CheckConclusionStateGQO conclusion;
    private String detailsUrl;
    private String externalId;
    private String name;
    private CheckRunOutputGQO output;
    @javax.validation.constraints.NotNull
    private String repositoryId;
    private java.util.Date startedAt;
    private RequestableCheckStatusStateGQO status;

    public UpdateCheckRunInputGQO() {
    }

    public UpdateCheckRunInputGQO(Collection<CheckRunActionGQO> actions, String checkRunId, String clientMutationId, java.util.Date completedAt, CheckConclusionStateGQO conclusion, String detailsUrl, String externalId, String name, CheckRunOutputGQO output, String repositoryId, java.util.Date startedAt, RequestableCheckStatusStateGQO status) {
        this.actions = actions;
        this.checkRunId = checkRunId;
        this.clientMutationId = clientMutationId;
        this.completedAt = completedAt;
        this.conclusion = conclusion;
        this.detailsUrl = detailsUrl;
        this.externalId = externalId;
        this.name = name;
        this.output = output;
        this.repositoryId = repositoryId;
        this.startedAt = startedAt;
        this.status = status;
    }

    public Collection<CheckRunActionGQO> getActions() {
        return actions;
    }
    public void setActions(Collection<CheckRunActionGQO> actions) {
        this.actions = actions;
    }

    public String getCheckRunId() {
        return checkRunId;
    }
    public void setCheckRunId(String checkRunId) {
        this.checkRunId = checkRunId;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public java.util.Date getCompletedAt() {
        return completedAt;
    }
    public void setCompletedAt(java.util.Date completedAt) {
        this.completedAt = completedAt;
    }

    public CheckConclusionStateGQO getConclusion() {
        return conclusion;
    }
    public void setConclusion(CheckConclusionStateGQO conclusion) {
        this.conclusion = conclusion;
    }

    public String getDetailsUrl() {
        return detailsUrl;
    }
    public void setDetailsUrl(String detailsUrl) {
        this.detailsUrl = detailsUrl;
    }

    public String getExternalId() {
        return externalId;
    }
    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public CheckRunOutputGQO getOutput() {
        return output;
    }
    public void setOutput(CheckRunOutputGQO output) {
        this.output = output;
    }

    public String getRepositoryId() {
        return repositoryId;
    }
    public void setRepositoryId(String repositoryId) {
        this.repositoryId = repositoryId;
    }

    public java.util.Date getStartedAt() {
        return startedAt;
    }
    public void setStartedAt(java.util.Date startedAt) {
        this.startedAt = startedAt;
    }

    public RequestableCheckStatusStateGQO getStatus() {
        return status;
    }
    public void setStatus(RequestableCheckStatusStateGQO status) {
        this.status = status;
    }

}