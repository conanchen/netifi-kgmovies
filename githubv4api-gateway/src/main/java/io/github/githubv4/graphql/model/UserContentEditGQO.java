package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class UserContentEditGQO implements NodeGQO{

    @javax.validation.constraints.NotNull
    private java.util.Date createdAt;
    private java.util.Date deletedAt;
    private ActorGQO deletedBy;
    private String diff;
    @javax.validation.constraints.NotNull
    private java.util.Date editedAt;
    private ActorGQO editor;
    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private java.util.Date updatedAt;

    public UserContentEditGQO() {
    }

    public UserContentEditGQO(java.util.Date createdAt, java.util.Date deletedAt, ActorGQO deletedBy, String diff, java.util.Date editedAt, ActorGQO editor, String id, java.util.Date updatedAt) {
        this.createdAt = createdAt;
        this.deletedAt = deletedAt;
        this.deletedBy = deletedBy;
        this.diff = diff;
        this.editedAt = editedAt;
        this.editor = editor;
        this.id = id;
        this.updatedAt = updatedAt;
    }

    public java.util.Date getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    public java.util.Date getDeletedAt() {
        return deletedAt;
    }
    public void setDeletedAt(java.util.Date deletedAt) {
        this.deletedAt = deletedAt;
    }

    public ActorGQO getDeletedBy() {
        return deletedBy;
    }
    public void setDeletedBy(ActorGQO deletedBy) {
        this.deletedBy = deletedBy;
    }

    public String getDiff() {
        return diff;
    }
    public void setDiff(String diff) {
        this.diff = diff;
    }

    public java.util.Date getEditedAt() {
        return editedAt;
    }
    public void setEditedAt(java.util.Date editedAt) {
        this.editedAt = editedAt;
    }

    public ActorGQO getEditor() {
        return editor;
    }
    public void setEditor(ActorGQO editor) {
        this.editor = editor;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public java.util.Date getUpdatedAt() {
        return updatedAt;
    }
    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

}