package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class ReleaseGQO implements NodeGQO, UniformResourceLocatableGQO{

    private UserGQO author;
    @javax.validation.constraints.NotNull
    private java.util.Date createdAt;
    private String description;
    private String descriptionHTML;
    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private Boolean isDraft;
    @javax.validation.constraints.NotNull
    private Boolean isPrerelease;
    private String name;
    private java.util.Date publishedAt;
    @javax.validation.constraints.NotNull
    private ReleaseAssetConnectionGQO releaseAssets;
    @javax.validation.constraints.NotNull
    private String resourcePath;
    private String shortDescriptionHTML;
    private RefGQO tag;
    @javax.validation.constraints.NotNull
    private String tagName;
    @javax.validation.constraints.NotNull
    private java.util.Date updatedAt;
    @javax.validation.constraints.NotNull
    private String url;

    public ReleaseGQO() {
    }

    public ReleaseGQO(UserGQO author, java.util.Date createdAt, String description, String descriptionHTML, String id, Boolean isDraft, Boolean isPrerelease, String name, java.util.Date publishedAt, ReleaseAssetConnectionGQO releaseAssets, String resourcePath, String shortDescriptionHTML, RefGQO tag, String tagName, java.util.Date updatedAt, String url) {
        this.author = author;
        this.createdAt = createdAt;
        this.description = description;
        this.descriptionHTML = descriptionHTML;
        this.id = id;
        this.isDraft = isDraft;
        this.isPrerelease = isPrerelease;
        this.name = name;
        this.publishedAt = publishedAt;
        this.releaseAssets = releaseAssets;
        this.resourcePath = resourcePath;
        this.shortDescriptionHTML = shortDescriptionHTML;
        this.tag = tag;
        this.tagName = tagName;
        this.updatedAt = updatedAt;
        this.url = url;
    }

    public UserGQO getAuthor() {
        return author;
    }
    public void setAuthor(UserGQO author) {
        this.author = author;
    }

    public java.util.Date getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescriptionHTML() {
        return descriptionHTML;
    }
    public void setDescriptionHTML(String descriptionHTML) {
        this.descriptionHTML = descriptionHTML;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public Boolean getIsDraft() {
        return isDraft;
    }
    public void setIsDraft(Boolean isDraft) {
        this.isDraft = isDraft;
    }

    public Boolean getIsPrerelease() {
        return isPrerelease;
    }
    public void setIsPrerelease(Boolean isPrerelease) {
        this.isPrerelease = isPrerelease;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public java.util.Date getPublishedAt() {
        return publishedAt;
    }
    public void setPublishedAt(java.util.Date publishedAt) {
        this.publishedAt = publishedAt;
    }

    public ReleaseAssetConnectionGQO getReleaseAssets() {
        return releaseAssets;
    }
    public void setReleaseAssets(ReleaseAssetConnectionGQO releaseAssets) {
        this.releaseAssets = releaseAssets;
    }

    public String getResourcePath() {
        return resourcePath;
    }
    public void setResourcePath(String resourcePath) {
        this.resourcePath = resourcePath;
    }

    public String getShortDescriptionHTML() {
        return shortDescriptionHTML;
    }
    public void setShortDescriptionHTML(String shortDescriptionHTML) {
        this.shortDescriptionHTML = shortDescriptionHTML;
    }

    public RefGQO getTag() {
        return tag;
    }
    public void setTag(RefGQO tag) {
        this.tag = tag;
    }

    public String getTagName() {
        return tagName;
    }
    public void setTagName(String tagName) {
        this.tagName = tagName;
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