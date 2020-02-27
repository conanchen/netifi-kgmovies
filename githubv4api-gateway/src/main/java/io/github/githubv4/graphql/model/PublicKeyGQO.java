package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class PublicKeyGQO implements NodeGQO{

    private java.util.Date accessedAt;
    private java.util.Date createdAt;
    @javax.validation.constraints.NotNull
    private String fingerprint;
    @javax.validation.constraints.NotNull
    private String id;
    private Boolean isReadOnly;
    @javax.validation.constraints.NotNull
    private String key;
    private java.util.Date updatedAt;

    public PublicKeyGQO() {
    }

    public PublicKeyGQO(java.util.Date accessedAt, java.util.Date createdAt, String fingerprint, String id, Boolean isReadOnly, String key, java.util.Date updatedAt) {
        this.accessedAt = accessedAt;
        this.createdAt = createdAt;
        this.fingerprint = fingerprint;
        this.id = id;
        this.isReadOnly = isReadOnly;
        this.key = key;
        this.updatedAt = updatedAt;
    }

    public java.util.Date getAccessedAt() {
        return accessedAt;
    }
    public void setAccessedAt(java.util.Date accessedAt) {
        this.accessedAt = accessedAt;
    }

    public java.util.Date getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    public String getFingerprint() {
        return fingerprint;
    }
    public void setFingerprint(String fingerprint) {
        this.fingerprint = fingerprint;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public Boolean getIsReadOnly() {
        return isReadOnly;
    }
    public void setIsReadOnly(Boolean isReadOnly) {
        this.isReadOnly = isReadOnly;
    }

    public String getKey() {
        return key;
    }
    public void setKey(String key) {
        this.key = key;
    }

    public java.util.Date getUpdatedAt() {
        return updatedAt;
    }
    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

}