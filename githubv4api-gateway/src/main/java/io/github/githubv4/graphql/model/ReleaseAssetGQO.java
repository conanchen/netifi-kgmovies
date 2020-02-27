package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class ReleaseAssetGQO implements NodeGQO{

    @javax.validation.constraints.NotNull
    private String contentType;
    @javax.validation.constraints.NotNull
    private java.util.Date createdAt;
    @javax.validation.constraints.NotNull
    private Integer downloadCount;
    @javax.validation.constraints.NotNull
    private String downloadUrl;
    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private String name;
    private ReleaseGQO release;
    @javax.validation.constraints.NotNull
    private Integer size;
    @javax.validation.constraints.NotNull
    private java.util.Date updatedAt;
    @javax.validation.constraints.NotNull
    private UserGQO uploadedBy;
    @javax.validation.constraints.NotNull
    private String url;

    public ReleaseAssetGQO() {
    }

    public ReleaseAssetGQO(String contentType, java.util.Date createdAt, Integer downloadCount, String downloadUrl, String id, String name, ReleaseGQO release, Integer size, java.util.Date updatedAt, UserGQO uploadedBy, String url) {
        this.contentType = contentType;
        this.createdAt = createdAt;
        this.downloadCount = downloadCount;
        this.downloadUrl = downloadUrl;
        this.id = id;
        this.name = name;
        this.release = release;
        this.size = size;
        this.updatedAt = updatedAt;
        this.uploadedBy = uploadedBy;
        this.url = url;
    }

    public String getContentType() {
        return contentType;
    }
    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public java.util.Date getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    public Integer getDownloadCount() {
        return downloadCount;
    }
    public void setDownloadCount(Integer downloadCount) {
        this.downloadCount = downloadCount;
    }

    public String getDownloadUrl() {
        return downloadUrl;
    }
    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
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

    public ReleaseGQO getRelease() {
        return release;
    }
    public void setRelease(ReleaseGQO release) {
        this.release = release;
    }

    public Integer getSize() {
        return size;
    }
    public void setSize(Integer size) {
        this.size = size;
    }

    public java.util.Date getUpdatedAt() {
        return updatedAt;
    }
    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public UserGQO getUploadedBy() {
        return uploadedBy;
    }
    public void setUploadedBy(UserGQO uploadedBy) {
        this.uploadedBy = uploadedBy;
    }

    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }

}