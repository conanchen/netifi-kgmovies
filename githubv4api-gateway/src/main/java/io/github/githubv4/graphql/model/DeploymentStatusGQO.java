package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class DeploymentStatusGQO implements NodeGQO{

    @javax.validation.constraints.NotNull
    private java.util.Date createdAt;
    private ActorGQO creator;
    @javax.validation.constraints.NotNull
    private DeploymentGQO deployment;
    private String description;
    private String environment;
    private String environmentUrl;
    @javax.validation.constraints.NotNull
    private String id;
    private String logUrl;
    @javax.validation.constraints.NotNull
    private DeploymentStatusStateGQO state;
    @javax.validation.constraints.NotNull
    private java.util.Date updatedAt;

    public DeploymentStatusGQO() {
    }

    public DeploymentStatusGQO(java.util.Date createdAt, ActorGQO creator, DeploymentGQO deployment, String description, String environment, String environmentUrl, String id, String logUrl, DeploymentStatusStateGQO state, java.util.Date updatedAt) {
        this.createdAt = createdAt;
        this.creator = creator;
        this.deployment = deployment;
        this.description = description;
        this.environment = environment;
        this.environmentUrl = environmentUrl;
        this.id = id;
        this.logUrl = logUrl;
        this.state = state;
        this.updatedAt = updatedAt;
    }

    public java.util.Date getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    public ActorGQO getCreator() {
        return creator;
    }
    public void setCreator(ActorGQO creator) {
        this.creator = creator;
    }

    public DeploymentGQO getDeployment() {
        return deployment;
    }
    public void setDeployment(DeploymentGQO deployment) {
        this.deployment = deployment;
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

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
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

    public java.util.Date getUpdatedAt() {
        return updatedAt;
    }
    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

}