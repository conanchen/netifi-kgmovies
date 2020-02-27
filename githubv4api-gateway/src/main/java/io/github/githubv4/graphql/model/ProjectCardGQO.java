package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class ProjectCardGQO implements NodeGQO{

    private ProjectColumnGQO column;
    private ProjectCardItemGQO content;
    @javax.validation.constraints.NotNull
    private java.util.Date createdAt;
    private ActorGQO creator;
    private Integer databaseId;
    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private Boolean isArchived;
    private String note;
    @javax.validation.constraints.NotNull
    private ProjectGQO project;
    @javax.validation.constraints.NotNull
    private String resourcePath;
    private ProjectCardStateGQO state;
    @javax.validation.constraints.NotNull
    private java.util.Date updatedAt;
    @javax.validation.constraints.NotNull
    private String url;

    public ProjectCardGQO() {
    }

    public ProjectCardGQO(ProjectColumnGQO column, ProjectCardItemGQO content, java.util.Date createdAt, ActorGQO creator, Integer databaseId, String id, Boolean isArchived, String note, ProjectGQO project, String resourcePath, ProjectCardStateGQO state, java.util.Date updatedAt, String url) {
        this.column = column;
        this.content = content;
        this.createdAt = createdAt;
        this.creator = creator;
        this.databaseId = databaseId;
        this.id = id;
        this.isArchived = isArchived;
        this.note = note;
        this.project = project;
        this.resourcePath = resourcePath;
        this.state = state;
        this.updatedAt = updatedAt;
        this.url = url;
    }

    public ProjectColumnGQO getColumn() {
        return column;
    }
    public void setColumn(ProjectColumnGQO column) {
        this.column = column;
    }

    public ProjectCardItemGQO getContent() {
        return content;
    }
    public void setContent(ProjectCardItemGQO content) {
        this.content = content;
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

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public Boolean getIsArchived() {
        return isArchived;
    }
    public void setIsArchived(Boolean isArchived) {
        this.isArchived = isArchived;
    }

    public String getNote() {
        return note;
    }
    public void setNote(String note) {
        this.note = note;
    }

    public ProjectGQO getProject() {
        return project;
    }
    public void setProject(ProjectGQO project) {
        this.project = project;
    }

    public String getResourcePath() {
        return resourcePath;
    }
    public void setResourcePath(String resourcePath) {
        this.resourcePath = resourcePath;
    }

    public ProjectCardStateGQO getState() {
        return state;
    }
    public void setState(ProjectCardStateGQO state) {
        this.state = state;
    }

    public java.util.Date getUpdatedAt() {
        return updatedAt;
    }
    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }

}