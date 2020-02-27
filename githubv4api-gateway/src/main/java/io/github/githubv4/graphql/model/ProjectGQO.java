package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class ProjectGQO implements ClosableGQO, NodeGQO, UpdatableGQO{

    private String body;
    @javax.validation.constraints.NotNull
    private String bodyHTML;
    @javax.validation.constraints.NotNull
    private Boolean closed;
    private java.util.Date closedAt;
    @javax.validation.constraints.NotNull
    private ProjectColumnConnectionGQO columns;
    @javax.validation.constraints.NotNull
    private java.util.Date createdAt;
    private ActorGQO creator;
    private Integer databaseId;
    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private String name;
    @javax.validation.constraints.NotNull
    private Integer number;
    @javax.validation.constraints.NotNull
    private ProjectOwnerGQO owner;
    @javax.validation.constraints.NotNull
    private ProjectCardConnectionGQO pendingCards;
    @javax.validation.constraints.NotNull
    private String resourcePath;
    @javax.validation.constraints.NotNull
    private ProjectStateGQO state;
    @javax.validation.constraints.NotNull
    private java.util.Date updatedAt;
    @javax.validation.constraints.NotNull
    private String url;
    @javax.validation.constraints.NotNull
    private Boolean viewerCanUpdate;

    public ProjectGQO() {
    }

    public ProjectGQO(String body, String bodyHTML, Boolean closed, java.util.Date closedAt, ProjectColumnConnectionGQO columns, java.util.Date createdAt, ActorGQO creator, Integer databaseId, String id, String name, Integer number, ProjectOwnerGQO owner, ProjectCardConnectionGQO pendingCards, String resourcePath, ProjectStateGQO state, java.util.Date updatedAt, String url, Boolean viewerCanUpdate) {
        this.body = body;
        this.bodyHTML = bodyHTML;
        this.closed = closed;
        this.closedAt = closedAt;
        this.columns = columns;
        this.createdAt = createdAt;
        this.creator = creator;
        this.databaseId = databaseId;
        this.id = id;
        this.name = name;
        this.number = number;
        this.owner = owner;
        this.pendingCards = pendingCards;
        this.resourcePath = resourcePath;
        this.state = state;
        this.updatedAt = updatedAt;
        this.url = url;
        this.viewerCanUpdate = viewerCanUpdate;
    }

    public String getBody() {
        return body;
    }
    public void setBody(String body) {
        this.body = body;
    }

    public String getBodyHTML() {
        return bodyHTML;
    }
    public void setBodyHTML(String bodyHTML) {
        this.bodyHTML = bodyHTML;
    }

    public Boolean getClosed() {
        return closed;
    }
    public void setClosed(Boolean closed) {
        this.closed = closed;
    }

    public java.util.Date getClosedAt() {
        return closedAt;
    }
    public void setClosedAt(java.util.Date closedAt) {
        this.closedAt = closedAt;
    }

    public ProjectColumnConnectionGQO getColumns() {
        return columns;
    }
    public void setColumns(ProjectColumnConnectionGQO columns) {
        this.columns = columns;
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

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumber() {
        return number;
    }
    public void setNumber(Integer number) {
        this.number = number;
    }

    public ProjectOwnerGQO getOwner() {
        return owner;
    }
    public void setOwner(ProjectOwnerGQO owner) {
        this.owner = owner;
    }

    public ProjectCardConnectionGQO getPendingCards() {
        return pendingCards;
    }
    public void setPendingCards(ProjectCardConnectionGQO pendingCards) {
        this.pendingCards = pendingCards;
    }

    public String getResourcePath() {
        return resourcePath;
    }
    public void setResourcePath(String resourcePath) {
        this.resourcePath = resourcePath;
    }

    public ProjectStateGQO getState() {
        return state;
    }
    public void setState(ProjectStateGQO state) {
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

    public Boolean getViewerCanUpdate() {
        return viewerCanUpdate;
    }
    public void setViewerCanUpdate(Boolean viewerCanUpdate) {
        this.viewerCanUpdate = viewerCanUpdate;
    }

}