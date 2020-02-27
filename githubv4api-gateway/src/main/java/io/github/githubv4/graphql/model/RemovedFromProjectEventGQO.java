package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class RemovedFromProjectEventGQO implements IssueTimelineItemsGQO, PullRequestTimelineItemsGQO, NodeGQO{

    private ActorGQO actor;
    @javax.validation.constraints.NotNull
    private java.util.Date createdAt;
    private Integer databaseId;
    @javax.validation.constraints.NotNull
    private String id;
    private ProjectGQO project;
    @javax.validation.constraints.NotNull
    private String projectColumnName;

    public RemovedFromProjectEventGQO() {
    }

    public RemovedFromProjectEventGQO(ActorGQO actor, java.util.Date createdAt, Integer databaseId, String id, ProjectGQO project, String projectColumnName) {
        this.actor = actor;
        this.createdAt = createdAt;
        this.databaseId = databaseId;
        this.id = id;
        this.project = project;
        this.projectColumnName = projectColumnName;
    }

    public ActorGQO getActor() {
        return actor;
    }
    public void setActor(ActorGQO actor) {
        this.actor = actor;
    }

    public java.util.Date getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    public Integer getDatabaseId() {
        return databaseId;
    }
    public void setDatabaseId(Integer databaseId) {
        this.databaseId = databaseId;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public ProjectGQO getProject() {
        return project;
    }
    public void setProject(ProjectGQO project) {
        this.project = project;
    }

    public String getProjectColumnName() {
        return projectColumnName;
    }
    public void setProjectColumnName(String projectColumnName) {
        this.projectColumnName = projectColumnName;
    }

}