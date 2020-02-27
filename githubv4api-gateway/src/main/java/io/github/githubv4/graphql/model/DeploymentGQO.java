package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class DeploymentGQO implements NodeGQO{

    private CommitGQO commit;
    @javax.validation.constraints.NotNull
    private String commitOid;
    @javax.validation.constraints.NotNull
    private java.util.Date createdAt;
    private ActorGQO creator;
    private Integer databaseId;
    private String description;
    private String environment;
    @javax.validation.constraints.NotNull
    private String id;
    private String latestEnvironment;
    private DeploymentStatusGQO latestStatus;
    private String originalEnvironment;
    private String payload;
    private RefGQO ref;
    @javax.validation.constraints.NotNull
    private RepositoryGQO repository;
    private DeploymentStateGQO state;
    private DeploymentStatusConnectionGQO statuses;
    private String task;
    @javax.validation.constraints.NotNull
    private java.util.Date updatedAt;

    public DeploymentGQO() {
    }

    public DeploymentGQO(CommitGQO commit, String commitOid, java.util.Date createdAt, ActorGQO creator, Integer databaseId, String description, String environment, String id, String latestEnvironment, DeploymentStatusGQO latestStatus, String originalEnvironment, String payload, RefGQO ref, RepositoryGQO repository, DeploymentStateGQO state, DeploymentStatusConnectionGQO statuses, String task, java.util.Date updatedAt) {
        this.commit = commit;
        this.commitOid = commitOid;
        this.createdAt = createdAt;
        this.creator = creator;
        this.databaseId = databaseId;
        this.description = description;
        this.environment = environment;
        this.id = id;
        this.latestEnvironment = latestEnvironment;
        this.latestStatus = latestStatus;
        this.originalEnvironment = originalEnvironment;
        this.payload = payload;
        this.ref = ref;
        this.repository = repository;
        this.state = state;
        this.statuses = statuses;
        this.task = task;
        this.updatedAt = updatedAt;
    }

    public CommitGQO getCommit() {
        return commit;
    }
    public void setCommit(CommitGQO commit) {
        this.commit = commit;
    }

    public String getCommitOid() {
        return commitOid;
    }
    public void setCommitOid(String commitOid) {
        this.commitOid = commitOid;
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

    public Integer getDatabaseId() {
        return databaseId;
    }
    public void setDatabaseId(Integer databaseId) {
        this.databaseId = databaseId;
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

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getLatestEnvironment() {
        return latestEnvironment;
    }
    public void setLatestEnvironment(String latestEnvironment) {
        this.latestEnvironment = latestEnvironment;
    }

    public DeploymentStatusGQO getLatestStatus() {
        return latestStatus;
    }
    public void setLatestStatus(DeploymentStatusGQO latestStatus) {
        this.latestStatus = latestStatus;
    }

    public String getOriginalEnvironment() {
        return originalEnvironment;
    }
    public void setOriginalEnvironment(String originalEnvironment) {
        this.originalEnvironment = originalEnvironment;
    }

    public String getPayload() {
        return payload;
    }
    public void setPayload(String payload) {
        this.payload = payload;
    }

    public RefGQO getRef() {
        return ref;
    }
    public void setRef(RefGQO ref) {
        this.ref = ref;
    }

    public RepositoryGQO getRepository() {
        return repository;
    }
    public void setRepository(RepositoryGQO repository) {
        this.repository = repository;
    }

    public DeploymentStateGQO getState() {
        return state;
    }
    public void setState(DeploymentStateGQO state) {
        this.state = state;
    }

    public DeploymentStatusConnectionGQO getStatuses() {
        return statuses;
    }
    public void setStatuses(DeploymentStatusConnectionGQO statuses) {
        this.statuses = statuses;
    }

    public String getTask() {
        return task;
    }
    public void setTask(String task) {
        this.task = task;
    }

    public java.util.Date getUpdatedAt() {
        return updatedAt;
    }
    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

}