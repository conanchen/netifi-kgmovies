package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class DeployKeyGQO implements NodeGQO{

    @javax.validation.constraints.NotNull
    private java.util.Date createdAt;
    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private String key;
    @javax.validation.constraints.NotNull
    private Boolean readOnly;
    @javax.validation.constraints.NotNull
    private String title;
    @javax.validation.constraints.NotNull
    private Boolean verified;

    public DeployKeyGQO() {
    }

    public DeployKeyGQO(java.util.Date createdAt, String id, String key, Boolean readOnly, String title, Boolean verified) {
        this.createdAt = createdAt;
        this.id = id;
        this.key = key;
        this.readOnly = readOnly;
        this.title = title;
        this.verified = verified;
    }

    public java.util.Date getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getKey() {
        return key;
    }
    public void setKey(String key) {
        this.key = key;
    }

    public Boolean getReadOnly() {
        return readOnly;
    }
    public void setReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public Boolean getVerified() {
        return verified;
    }
    public void setVerified(Boolean verified) {
        this.verified = verified;
    }

}