package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class CreateDeploymentInputGQO {

    private Boolean autoMerge;
    private String clientMutationId;
    private String description;
    private String environment;
    private String payload;
    @javax.validation.constraints.NotNull
    private String refId;
    @javax.validation.constraints.NotNull
    private String repositoryId;
    @javax.validation.constraints.NotNull
    private Collection<String> requiredContexts;
    private String task;

    public CreateDeploymentInputGQO() {
    }

    public CreateDeploymentInputGQO(Boolean autoMerge, String clientMutationId, String description, String environment, String payload, String refId, String repositoryId, Collection<String> requiredContexts, String task) {
        this.autoMerge = autoMerge;
        this.clientMutationId = clientMutationId;
        this.description = description;
        this.environment = environment;
        this.payload = payload;
        this.refId = refId;
        this.repositoryId = repositoryId;
        this.requiredContexts = requiredContexts;
        this.task = task;
    }

    public Boolean getAutoMerge() {
        return autoMerge;
    }
    public void setAutoMerge(Boolean autoMerge) {
        this.autoMerge = autoMerge;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public String getEnvironment() {
        return environment;
    }
    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    public String getPayload() {
        return payload;
    }
    public void setPayload(String payload) {
        this.payload = payload;
    }

    public String getRefId() {
        return refId;
    }
    public void setRefId(String refId) {
        this.refId = refId;
    }

    public String getRepositoryId() {
        return repositoryId;
    }
    public void setRepositoryId(String repositoryId) {
        this.repositoryId = repositoryId;
    }

    public Collection<String> getRequiredContexts() {
        return requiredContexts;
    }
    public void setRequiredContexts(Collection<String> requiredContexts) {
        this.requiredContexts = requiredContexts;
    }

    public String getTask() {
        return task;
    }
    public void setTask(String task) {
        this.task = task;
    }

}