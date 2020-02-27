package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class TeamDiscussionCommentGQO implements CommentGQO, DeletableGQO, NodeGQO, ReactableGQO, UniformResourceLocatableGQO, UpdatableGQO, UpdatableCommentGQO{

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
    private String bodyVersion;
    @javax.validation.constraints.NotNull
    private java.util.Date createdAt;
    @javax.validation.constraints.NotNull
    private Boolean createdViaEmail;
    private Integer databaseId;
    @javax.validation.constraints.NotNull
    private TeamDiscussionGQO discussion;
    private ActorGQO editor;
    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private Boolean includesCreatedEdit;
    private java.util.Date lastEditedAt;
    @javax.validation.constraints.NotNull
    private Integer number;
    private java.util.Date publishedAt;
    @javax.validation.constraints.NotNull
    private Collection<ReactionGroupGQO> reactionGroups;
    @javax.validation.constraints.NotNull
    private ReactionConnectionGQO reactions;
    @javax.validation.constraints.NotNull
    private String resourcePath;
    @javax.validation.constraints.NotNull
    private java.util.Date updatedAt;
    @javax.validation.constraints.NotNull
    private String url;
    private UserContentEditConnectionGQO userContentEdits;
    @javax.validation.constraints.NotNull
    private Boolean viewerCanDelete;
    @javax.validation.constraints.NotNull
    private Boolean viewerCanReact;
    @javax.validation.constraints.NotNull
    private Boolean viewerCanUpdate;
    @javax.validation.constraints.NotNull
    private Collection<CommentCannotUpdateReasonGQO> viewerCannotUpdateReasons;
    @javax.validation.constraints.NotNull
    private Boolean viewerDidAuthor;

    public TeamDiscussionCommentGQO() {
    }

    public TeamDiscussionCommentGQO(ActorGQO author, CommentAuthorAssociationGQO authorAssociation, String body, String bodyHTML, String bodyText, String bodyVersion, java.util.Date createdAt, Boolean createdViaEmail, Integer databaseId, TeamDiscussionGQO discussion, ActorGQO editor, String id, Boolean includesCreatedEdit, java.util.Date lastEditedAt, Integer number, java.util.Date publishedAt, Collection<ReactionGroupGQO> reactionGroups, ReactionConnectionGQO reactions, String resourcePath, java.util.Date updatedAt, String url, UserContentEditConnectionGQO userContentEdits, Boolean viewerCanDelete, Boolean viewerCanReact, Boolean viewerCanUpdate, Collection<CommentCannotUpdateReasonGQO> viewerCannotUpdateReasons, Boolean viewerDidAuthor) {
        this.author = author;
        this.authorAssociation = authorAssociation;
        this.body = body;
        this.bodyHTML = bodyHTML;
        this.bodyText = bodyText;
        this.bodyVersion = bodyVersion;
        this.createdAt = createdAt;
        this.createdViaEmail = createdViaEmail;
        this.databaseId = databaseId;
        this.discussion = discussion;
        this.editor = editor;
        this.id = id;
        this.includesCreatedEdit = includesCreatedEdit;
        this.lastEditedAt = lastEditedAt;
        this.number = number;
        this.publishedAt = publishedAt;
        this.reactionGroups = reactionGroups;
        this.reactions = reactions;
        this.resourcePath = resourcePath;
        this.updatedAt = updatedAt;
        this.url = url;
        this.userContentEdits = userContentEdits;
        this.viewerCanDelete = viewerCanDelete;
        this.viewerCanReact = viewerCanReact;
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

    public String getBodyVersion() {
        return bodyVersion;
    }
    public void setBodyVersion(String bodyVersion) {
        this.bodyVersion = bodyVersion;
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

    public TeamDiscussionGQO getDiscussion() {
        return discussion;
    }
    public void setDiscussion(TeamDiscussionGQO discussion) {
        this.discussion = discussion;
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

    public Boolean getIncludesCreatedEdit() {
        return includesCreatedEdit;
    }
    public void setIncludesCreatedEdit(Boolean includesCreatedEdit) {
        this.includesCreatedEdit = includesCreatedEdit;
    }

    public java.util.Date getLastEditedAt() {
        return lastEditedAt;
    }
    public void setLastEditedAt(java.util.Date lastEditedAt) {
        this.lastEditedAt = lastEditedAt;
    }

    public Integer getNumber() {
        return number;
    }
    public void setNumber(Integer number) {
        this.number = number;
    }

    public java.util.Date getPublishedAt() {
        return publishedAt;
    }
    public void setPublishedAt(java.util.Date publishedAt) {
        this.publishedAt = publishedAt;
    }

    public Collection<ReactionGroupGQO> getReactionGroups() {
        return reactionGroups;
    }
    public void setReactionGroups(Collection<ReactionGroupGQO> reactionGroups) {
        this.reactionGroups = reactionGroups;
    }

    public ReactionConnectionGQO getReactions() {
        return reactions;
    }
    public void setReactions(ReactionConnectionGQO reactions) {
        this.reactions = reactions;
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

    public Boolean getViewerCanReact() {
        return viewerCanReact;
    }
    public void setViewerCanReact(Boolean viewerCanReact) {
        this.viewerCanReact = viewerCanReact;
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