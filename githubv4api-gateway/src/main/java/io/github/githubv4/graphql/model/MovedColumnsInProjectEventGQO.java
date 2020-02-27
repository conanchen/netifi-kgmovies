package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class MovedColumnsInProjectEventGQO implements IssueTimelineItemsGQO, PullRequestTimelineItemsGQO, NodeGQO{

    private ActorGQO actor;
    @javax.validation.constraints.NotNull
    private java.util.Date createdAt;
    private Integer databaseId;
    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private String previousProjectColumnName;
    private ProjectGQO project;
    private ProjectCardGQO projectCard;
    @javax.validation.constraints.NotNull
    private String projectColumnName;

    public MovedColumnsInProjectEventGQO() {
    }

    public MovedColumnsInProjectEventGQO(ActorGQO actor, java.util.Date createdAt, Integer databaseId, String id, String previousProjectColumnName, ProjectGQO project, ProjectCardGQO projectCard, String projectColumnName) {
        this.actor = actor;
        this.createdAt = createdAt;
        this.databaseId = databaseId;
        this.id = id;
        this.previousProjectColumnName = previousProjectColumnName;
        this.project = project;
        this.projectCard = projectCard;
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

    public String getPreviousProjectColumnName() {
        return previousProjectColumnName;
    }
    public void setPreviousProjectColumnName(String previousProjectColumnName) {
        this.previousProjectColumnName = previousProjectColumnName;
    }

    public ProjectGQO getProject() {
        return project;
    }
    public void setProject(ProjectGQO project) {
        this.project = project;
    }

    public ProjectCardGQO getProjectCard() {
        return projectCard;
    }
    public void setProjectCard(ProjectCardGQO projectCard) {
        this.projectCard = projectCard;
    }

    public String getProjectColumnName() {
        return projectColumnName;
    }
    public void setProjectColumnName(String projectColumnName) {
        this.projectColumnName = projectColumnName;
    }

}