package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class AppGQO implements PushAllowanceActorGQO, SearchResultItemGQO, NodeGQO{

    @javax.validation.constraints.NotNull
    private java.util.Date createdAt;
    private Integer databaseId;
    private String description;
    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private String logoBackgroundColor;
    @javax.validation.constraints.NotNull
    private String logoUrl;
    @javax.validation.constraints.NotNull
    private String name;
    @javax.validation.constraints.NotNull
    private String slug;
    @javax.validation.constraints.NotNull
    private java.util.Date updatedAt;
    @javax.validation.constraints.NotNull
    private String url;

    public AppGQO() {
    }

    public AppGQO(java.util.Date createdAt, Integer databaseId, String description, String id, String logoBackgroundColor, String logoUrl, String name, String slug, java.util.Date updatedAt, String url) {
        this.createdAt = createdAt;
        this.databaseId = databaseId;
        this.description = description;
        this.id = id;
        this.logoBackgroundColor = logoBackgroundColor;
        this.logoUrl = logoUrl;
        this.name = name;
        this.slug = slug;
        this.updatedAt = updatedAt;
        this.url = url;
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

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getLogoBackgroundColor() {
        return logoBackgroundColor;
    }
    public void setLogoBackgroundColor(String logoBackgroundColor) {
        this.logoBackgroundColor = logoBackgroundColor;
    }

    public String getLogoUrl() {
        return logoUrl;
    }
    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getSlug() {
        return slug;
    }
    public void setSlug(String slug) {
        this.slug = slug;
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