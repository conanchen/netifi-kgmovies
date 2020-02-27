package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class IssueCommentGQO implements IssueTimelineItemGQO, IssueTimelineItemsGQO, PullRequestTimelineItemGQO, PullRequestTimelineItemsGQO, CommentGQO, DeletableGQO, MinimizableGQO, NodeGQO, ReactableGQO, RepositoryNodeGQO, UpdatableGQO, UpdatableCommentGQO{

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
    private String id;
    @javax.validation.constraints.NotNull
    private Boolean includesCreatedEdit;
    @javax.validation.constraints.NotNull
    private Boolean isMinimized;
    @javax.validation.constraints.NotNull
    private IssueGQO issue;
    private java.util.Date lastEditedAt;
    private String minimizedReason;
    private java.util.Date publishedAt;
    private PullRequestGQO pullRequest;
    @javax.validation.constraints.NotNull
    private Collection<ReactionGroupGQO> reactionGroups;
    @javax.validation.constraints.NotNull
    private ReactionConnectionGQO reactions;
    @javax.validation.constraints.NotNull
    private RepositoryGQO repository;
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
    private Boolean viewerCanMinimize;
    @javax.validation.constraints.NotNull
    private Boolean viewerCanReact;
    @javax.validation.constraints.NotNull
    private Boolean viewerCanUpdate;
    @javax.validation.constraints.NotNull
    private Collection<CommentCannotUpdateReasonGQO> viewerCannotUpdateReasons;
    @javax.validation.constraints.NotNull
    private Boolean viewerDidAuthor;

    public IssueCommentGQO() {
    }

    public IssueCommentGQO(ActorGQO author, CommentAuthorAssociationGQO authorAssociation, String body, String bodyHTML, String bodyText, java.util.Date createdAt, Boolean createdViaEmail, Integer databaseId, ActorGQO editor, String id, Boolean includesCreatedEdit, Boolean isMinimized, IssueGQO issue, java.util.Date lastEditedAt, String minimizedReason, java.util.Date publishedAt, PullRequestGQO pullRequest, Collection<ReactionGroupGQO> reactionGroups, ReactionConnectionGQO reactions, RepositoryGQO repository, String resourcePath, java.util.Date updatedAt, String url, UserContentEditConnectionGQO userContentEdits, Boolean viewerCanDelete, Boolean viewerCanMinimize, Boolean viewerCanReact, Boolean viewerCanUpdate, Collection<CommentCannotUpdateReasonGQO> viewerCannotUpdateReasons, Boolean viewerDidAuthor) {
        this.author = author;
        this.authorAssociation = authorAssociation;
        this.body = body;
        this.bodyHTML = bodyHTML;
        this.bodyText = bodyText;
        this.createdAt = createdAt;
        this.createdViaEmail = createdViaEmail;
        this.databaseId = databaseId;
        this.editor = editor;
        this.id = id;
        this.includesCreatedEdit = includesCreatedEdit;
        this.isMinimized = isMinimized;
        this.issue = issue;
        this.lastEditedAt = lastEditedAt;
        this.minimizedReason = minimizedReason;
        this.publishedAt = publishedAt;
        this.pullRequest = pullRequest;
        this.reactionGroups = reactionGroups;
        this.reactions = reactions;
        this.repository = repository;
        this.resourcePath = resourcePath;
        this.updatedAt = updatedAt;
        this.url = url;
        this.userContentEdits = userContentEdits;
        this.viewerCanDelete = viewerCanDelete;
        this.viewerCanMinimize = viewerCanMinimize;
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

    public IssueGQO getIssue() {
        return issue;
    }
    public void setIssue(IssueGQO issue) {
        this.issue = issue;
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

    public PullRequestGQO getPullRequest() {
        return pullRequest;
    }
    public void setPullRequest(PullRequestGQO pullRequest) {
        this.pullRequest = pullRequest;
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

    public RepositoryGQO getRepository() {
        return repository;
    }
    public void setRepository(RepositoryGQO repository) {
        this.repository = repository;
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

    public Boolean getViewerCanMinimize() {
        return viewerCanMinimize;
    }
    public void setViewerCanMinimize(Boolean viewerCanMinimize) {
        this.viewerCanMinimize = viewerCanMinimize;
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