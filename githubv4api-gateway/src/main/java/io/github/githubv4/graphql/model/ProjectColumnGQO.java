package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class ProjectColumnGQO implements NodeGQO{

    @javax.validation.constraints.NotNull
    private ProjectCardConnectionGQO cards;
    @javax.validation.constraints.NotNull
    private java.util.Date createdAt;
    private Integer databaseId;
    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private String name;
    @javax.validation.constraints.NotNull
    private ProjectGQO project;
    private ProjectColumnPurposeGQO purpose;
    @javax.validation.constraints.NotNull
    private String resourcePath;
    @javax.validation.constraints.NotNull
    private java.util.Date updatedAt;
    @javax.validation.constraints.NotNull
    private String url;

    public ProjectColumnGQO() {
    }

    public ProjectColumnGQO(ProjectCardConnectionGQO cards, java.util.Date createdAt, Integer databaseId, String id, String name, ProjectGQO project, ProjectColumnPurposeGQO purpose, String resourcePath, java.util.Date updatedAt, String url) {
        this.cards = cards;
        this.createdAt = createdAt;
        this.databaseId = databaseId;
        this.id = id;
        this.name = name;
        this.project = project;
        this.purpose = purpose;
        this.resourcePath = resourcePath;
        this.updatedAt = updatedAt;
        this.url = url;
    }

    public ProjectCardConnectionGQO getCards() {
        return cards;
    }
    public void setCards(ProjectCardConnectionGQO cards) {
        this.cards = cards;
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

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public ProjectGQO getProject() {
        return project;
    }
    public void setProject(ProjectGQO project) {
        this.project = project;
    }

    public ProjectColumnPurposeGQO getPurpose() {
        return purpose;
    }
    public void setPurpose(ProjectColumnPurposeGQO purpose) {
        this.purpose = purpose;
    }

    public String getResourcePath() {
        return resourcePath;
    }
    public void setResourcePath(String resourcePath) {
        this.resourcePath = resourcePath;
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