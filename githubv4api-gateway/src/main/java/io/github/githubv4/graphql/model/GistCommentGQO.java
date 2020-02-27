package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class GistCommentGQO implements CommentGQO, DeletableGQO, MinimizableGQO, NodeGQO, UpdatableGQO, UpdatableCommentGQO{

    private ActorGQO author;
    @javax.validation.constraints.NotNull
    private CommentAuthorAssociationGQO authorAssociation;
    @javax.validation.constraints.NotNull
    private String body;
    @javax.validation.constraints.NotNull
    private String bodyHTML;
    @javax.validation.constraints.NotNull
    private String bodyText;
    @javax.validation.constraints.NotNull
    private java.util.Date createdAt;
    @javax.validation.constraints.NotNull
    private Boolean createdViaEmail;
    private Integer databaseId;
    private ActorGQO editor;
    @javax.validation.constraints.NotNull
    private GistGQO gist;
    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private Boolean includesCreatedEdit;
    @javax.validation.constraints.NotNull
    private Boolean isMinimized;
    private java.util.Date lastEditedAt;
    private String minimizedReason;
    private java.util.Date publishedAt;
    @javax.validation.constraints.NotNull
    private java.util.Date updatedAt;
    private UserContentEditConnectionGQO userContentEdits;
    @javax.validation.constraints.NotNull
    private Boolean viewerCanDelete;
    @javax.validation.constraints.NotNull
    private Boolean viewerCanMinimize;
    @javax.validation.constraints.NotNull
    private Boolean viewerCanUpdate;
    @javax.validation.constraints.NotNull
    private Collection<CommentCannotUpdateReasonGQO> viewerCannotUpdateReasons;
    @javax.validation.constraints.NotNull
    private Boolean viewerDidAuthor;

    public GistCommentGQO() {
    }

    public GistCommentGQO(ActorGQO author, CommentAuthorAssociationGQO authorAssociation, String body, String bodyHTML, String bodyText, java.util.Date createdAt, Boolean createdViaEmail, Integer databaseId, ActorGQO editor, GistGQO gist, String id, Boolean includesCreatedEdit, Boolean isMinimized, java.util.Date lastEditedAt, String minimizedReason, java.util.Date publishedAt, java.util.Date updatedAt, UserContentEditConnectionGQO userContentEdits, Boolean viewerCanDelete, Boolean viewerCanMinimize, Boolean viewerCanUpdate, Collection<CommentCannotUpdateReasonGQO> viewerCannotUpdateReasons, Boolean viewerDidAuthor) {
        this.author = author;
        this.authorAssociation = authorAssociation;
        this.body = body;
        this.bodyHTML = bodyHTML;
        this.bodyText = bodyText;
        this.createdAt = createdAt;
        this.createdViaEmail = createdViaEmail;
        this.databaseId = databaseId;
        this.editor = editor;
        this.gist = gist;
        this.id = id;
        this.includesCreatedEdit = includesCreatedEdit;
        this.isMinimized = isMinimized;
        this.lastEditedAt = lastEditedAt;
        this.minimizedReason = minimizedReason;
        this.publishedAt = publishedAt;
        this.updatedAt = updatedAt;
        this.userContentEdits = userContentEdits;
        this.viewerCanDelete = viewerCanDelete;
        this.viewerCanMinimize = viewerCanMinimize;
        this.viewerCanUpdate = viewerCanUpdate;
        this.viewerCannotUpdateReasons = viewerCannotUpdateReasons;
        this.viewerDidAuthor = viewerDidAuthor;
    }

    public ActorGQO getAuthor() {
        return author;
    }
    public void setAuthor(ActorGQO author) {
        this.author = author;
    }

    public CommentAuthorAssociationGQO getAuthorAssociation() {
        return authorAssociation;
    }
    public void setAuthorAssociation(CommentAuthorAssociationGQO authorAssociation) {
        this.authorAssociation = authorAssociation;
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

    public String getBodyText() {
        return bodyText;
    }
    public void setBodyText(String bodyText) {
        this.bodyText = bodyText;
    }

    public java.util.Date getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    public Boolean getCreatedViaEmail() {
        return createdViaEmail;
    }
    public void setCreatedViaEmail(Boolean createdViaEmail) {
        this.createdViaEmail = createdViaEmail;
    }

    public Integer getDatabaseId() {
        return databaseId;
    }
    public void setDatabaseId(Integer databaseId) {
        this.databaseId = databaseId;
    }

    public ActorGQO getEditor() {
        return editor;
    }
    public void setEditor(ActorGQO editor) {
        this.editor = editor;
    }

    public GistGQO getGist() {
        return gist;
    }
    public void setGist(GistGQO gist) {
        this.gist = gist;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public Boolean getIncludesCreatedEdit() {
        return includesCreatedEdit;
    }
    public void setIncludesCreatedEdit(Boolean includesCreatedEdit) {
        this.includesCreatedEdit = includesCreatedEdit;
    }

    public Boolean getIsMinimized() {
        return isMinimized;
    }
    public void setIsMinimized(Boolean isMinimized) {
        this.isMinimized = isMinimized;
    }

    public java.util.Date getLastEditedAt() {
        return lastEditedAt;
    }
    public void setLastEditedAt(java.util.Date lastEditedAt) {
        this.lastEditedAt = lastEditedAt;
    }

    public String getMinimizedReason() {
        return minimizedReason;
    }
    public void setMinimizedReason(String minimizedReason) {
        this.minimizedReason = minimizedReason;
    }

    public java.util.Date getPublishedAt() {
        return publishedAt;
    }
    public void setPublishedAt(java.util.Date publishedAt) {
        this.publishedAt = publishedAt;
    }

    public java.util.Date getUpdatedAt() {
        return updatedAt;
    }
    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public UserContentEditConnectionGQO getUserContentEdits() {
        return userContentEdits;
    }
    public void setUserContentEdits(UserContentEditConnectionGQO userContentEdits) {
        this.userContentEdits = userContentEdits;
    }

    public Boolean getViewerCanDelete() {
        return viewerCanDelete;
    }
    public void setViewerCanDelete(Boolean viewerCanDelete) {
        this.viewerCanDelete = viewerCanDelete;
    }

    public Boolean getViewerCanMinimize() {
        return viewerCanMinimize;
    }
    public void setViewerCanMinimize(Boolean viewerCanMinimize) {
        this.viewerCanMinimize = viewerCanMinimize;
    }

    public Boolean getViewerCanUpdate() {
        return viewerCanUpdate;
    }
    public void setViewerCanUpdate(Boolean viewerCanUpdate) {
        this.viewerCanUpdate = viewerCanUpdate;
    }

    public Collection<CommentCannotUpdateReasonGQO> getViewerCannotUpdateReasons() {
        return viewerCannotUpdateReasons;
    }
    public void setViewerCannotUpdateReasons(Collection<CommentCannotUpdateReasonGQO> viewerCannotUpdateReasons) {
        this.viewerCannotUpdateReasons = viewerCannotUpdateReasons;
    }

    public Boolean getViewerDidAuthor() {
        return viewerDidAuthor;
    }
    public void setViewerDidAuthor(Boolean viewerDidAuthor) {
        this.viewerDidAuthor = viewerDidAuthor;
    }

}