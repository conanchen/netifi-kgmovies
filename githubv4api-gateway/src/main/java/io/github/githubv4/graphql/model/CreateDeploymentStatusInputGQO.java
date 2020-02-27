package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class CreateDeploymentStatusInputGQO {

    private Boolean autoInactive;
    private String clientMutationId;
    @javax.validation.constraints.NotNull
    private String deploymentId;
    private String description;
    private String environment;
    private String environmentUrl;
    private String logUrl;
    @javax.validation.constraints.NotNull
    private DeploymentStatusStateGQO state;

    public CreateDeploymentStatusInputGQO() {
    }

    public CreateDeploymentStatusInputGQO(Boolean autoInactive, String clientMutationId, String deploymentId, String description, String environment, String environmentUrl, String logUrl, DeploymentStatusStateGQO state) {
        this.autoInactive = autoInactive;
        this.clientMutationId = clientMutationId;
        this.deploymentId = deploymentId;
        this.description = description;
        this.environment = environment;
        this.environmentUrl = environmentUrl;
        this.logUrl = logUrl;
        this.state = state;
    }

    public Boolean getAutoInactive() {
        return autoInactive;
    }
    public void setAutoInactive(Boolean autoInactive) {
        this.autoInactive = autoInactive;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public String getDeploymentId() {
        return deploymentId;
    }
    public void setDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
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

    public String getEnvironmentUrl() {
        return environmentUrl;
    }
    public void setEnvironmentUrl(String environmentUrl) {
        this.environmentUrl = environmentUrl;
    }

    public String getLogUrl() {
        return logUrl;
    }
    public void setLogUrl(String logUrl) {
        this.logUrl = logUrl;
    }

    public DeploymentStatusStateGQO getState() {
        return state;
    }
    public void setState(DeploymentStatusStateGQO state) {
        this.state = state;
    }

}