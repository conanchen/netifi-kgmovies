package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class IssueGQO implements IssueOrPullRequestGQO, MilestoneItemGQO, ProjectCardItemGQO, ReferencedSubjectGQO, RenamedTitleSubjectGQO, SearchResultItemGQO, AssignableGQO, ClosableGQO, CommentGQO, LabelableGQO, LockableGQO, NodeGQO, ReactableGQO, RepositoryNodeGQO, SubscribableGQO, UniformResourceLocatableGQO, UpdatableGQO, UpdatableCommentGQO{

    private LockReasonGQO activeLockReason;
    @javax.validation.constraints.NotNull
    private UserConnectionGQO assignees;
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
    private Boolean closed;
    private java.util.Date closedAt;
    @javax.validation.constraints.NotNull
    private IssueCommentConnectionGQO comments;
    @javax.validation.constraints.NotNull
    private java.util.Date createdAt;
    @javax.validation.constraints.NotNull
    private Boolean createdViaEmail;
    private Integer databaseId;
    private ActorGQO editor;
    @javax.validation.constraints.NotNull
    private HovercardGQO hovercard;
    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private Boolean includesCreatedEdit;
    private LabelConnectionGQO labels;
    private java.util.Date lastEditedAt;
    @javax.validation.constraints.NotNull
    private Boolean locked;
    private MilestoneGQO milestone;
    @javax.validation.constraints.NotNull
    private Integer number;
    @javax.validation.constraints.NotNull
    private UserConnectionGQO participants;
    @javax.validation.constraints.NotNull
    private ProjectCardConnectionGQO projectCards;
    private java.util.Date publishedAt;
    @javax.validation.constraints.NotNull
    private Collection<ReactionGroupGQO> reactionGroups;
    @javax.validation.constraints.NotNull
    private ReactionConnectionGQO reactions;
    @javax.validation.constraints.NotNull
    private RepositoryGQO repository;
    @javax.validation.constraints.NotNull
    private String resourcePath;
    @javax.validation.constraints.NotNull
    private IssueStateGQO state;
    @javax.validation.constraints.NotNull
    private IssueTimelineConnectionGQO timeline;
    @javax.validation.constraints.NotNull
    private IssueTimelineItemsConnectionGQO timelineItems;
    @javax.validation.constraints.NotNull
    private String title;
    @javax.validation.constraints.NotNull
    private java.util.Date updatedAt;
    @javax.validation.constraints.NotNull
    private String url;
    private UserContentEditConnectionGQO userContentEdits;
    @javax.validation.constraints.NotNull
    private Boolean viewerCanReact;
    @javax.validation.constraints.NotNull
    private Boolean viewerCanSubscribe;
    @javax.validation.constraints.NotNull
    private Boolean viewerCanUpdate;
    @javax.validation.constraints.NotNull
    private Collection<CommentCannotUpdateReasonGQO> viewerCannotUpdateReasons;
    @javax.validation.constraints.NotNull
    private Boolean viewerDidAuthor;
    private SubscriptionStateGQO viewerSubscription;

    public IssueGQO() {
    }

    public IssueGQO(LockReasonGQO activeLockReason, UserConnectionGQO assignees, ActorGQO author, CommentAuthorAssociationGQO authorAssociation, String body, String bodyHTML, String bodyText, Boolean closed, java.util.Date closedAt, IssueCommentConnectionGQO comments, java.util.Date createdAt, Boolean createdViaEmail, Integer databaseId, ActorGQO editor, HovercardGQO hovercard, String id, Boolean includesCreatedEdit, LabelConnectionGQO labels, java.util.Date lastEditedAt, Boolean locked, MilestoneGQO milestone, Integer number, UserConnectionGQO participants, ProjectCardConnectionGQO projectCards, java.util.Date publishedAt, Collection<ReactionGroupGQO> reactionGroups, ReactionConnectionGQO reactions, RepositoryGQO repository, String resourcePath, IssueStateGQO state, IssueTimelineConnectionGQO timeline, IssueTimelineItemsConnectionGQO timelineItems, String title, java.util.Date updatedAt, String url, UserContentEditConnectionGQO userContentEdits, Boolean viewerCanReact, Boolean viewerCanSubscribe, Boolean viewerCanUpdate, Collection<CommentCannotUpdateReasonGQO> viewerCannotUpdateReasons, Boolean viewerDidAuthor, SubscriptionStateGQO viewerSubscription) {
        this.activeLockReason = activeLockReason;
        this.assignees = assignees;
        this.author = author;
        this.authorAssociation = authorAssociation;
        this.body = body;
        this.bodyHTML = bodyHTML;
        this.bodyText = bodyText;
        this.closed = closed;
        this.closedAt = closedAt;
        this.comments = comments;
        this.createdAt = createdAt;
        this.createdViaEmail = createdViaEmail;
        this.databaseId = databaseId;
        this.editor = editor;
        this.hovercard = hovercard;
        this.id = id;
        this.includesCreatedEdit = includesCreatedEdit;
        this.labels = labels;
        this.lastEditedAt = lastEditedAt;
        this.locked = locked;
        this.milestone = milestone;
        this.number = number;
        this.participants = participants;
        this.projectCards = projectCards;
        this.publishedAt = publishedAt;
        this.reactionGroups = reactionGroups;
        this.reactions = reactions;
        this.repository = repository;
        this.resourcePath = resourcePath;
        this.state = state;
        this.timeline = timeline;
        this.timelineItems = timelineItems;
        this.title = title;
        this.updatedAt = updatedAt;
        this.url = url;
        this.userContentEdits = userContentEdits;
        this.viewerCanReact = viewerCanReact;
        this.viewerCanSubscribe = viewerCanSubscribe;
        this.viewerCanUpdate = viewerCanUpdate;
        this.viewerCannotUpdateReasons = viewerCannotUpdateReasons;
        this.viewerDidAuthor = viewerDidAuthor;
        this.viewerSubscription = viewerSubscription;
    }

    public LockReasonGQO getActiveLockReason() {
        return activeLockReason;
    }
    public void setActiveLockReason(LockReasonGQO activeLockReason) {
        this.activeLockReason = activeLockReason;
    }

    public UserConnectionGQO getAssignees() {
        return assignees;
    }
    public void setAssignees(UserConnectionGQO assignees) {
        this.assignees = assignees;
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

    public Boolean getClosed() {
        return closed;
    }
    public void setClosed(Boolean closed) {
        this.closed = closed;
    }

    public java.util.Date getClosedAt() {
        return closedAt;
    }
    public void setClosedAt(java.util.Date closedAt) {
        this.closedAt = closedAt;
    }

    public IssueCommentConnectionGQO getComments() {
        return comments;
    }
    public void setComments(IssueCommentConnectionGQO comments) {
        this.comments = comments;
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

    public HovercardGQO getHovercard() {
        return hovercard;
    }
    public void setHovercard(HovercardGQO hovercard) {
        this.hovercard = hovercard;
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

    public LabelConnectionGQO getLabels() {
        return labels;
    }
    public void setLabels(LabelConnectionGQO labels) {
        this.labels = labels;
    }

    public java.util.Date getLastEditedAt() {
        return lastEditedAt;
    }
    public void setLastEditedAt(java.util.Date lastEditedAt) {
        this.lastEditedAt = lastEditedAt;
    }

    public Boolean getLocked() {
        return locked;
    }
    public void setLocked(Boolean locked) {
        this.locked = locked;
    }

    public MilestoneGQO getMilestone() {
        return milestone;
    }
    public void setMilestone(MilestoneGQO milestone) {
        this.milestone = milestone;
    }

    public Integer getNumber() {
        return number;
    }
    public void setNumber(Integer number) {
        this.number = number;
    }

    public UserConnectionGQO getParticipants() {
        return participants;
    }
    public void setParticipants(UserConnectionGQO participants) {
        this.participants = participants;
    }

    public ProjectCardConnectionGQO getProjectCards() {
        return projectCards;
    }
    public void setProjectCards(ProjectCardConnectionGQO projectCards) {
        this.projectCards = projectCards;
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

    public IssueStateGQO getState() {
        return state;
    }
    public void setState(IssueStateGQO state) {
        this.state = state;
    }

    public IssueTimelineConnectionGQO getTimeline() {
        return timeline;
    }
    public void setTimeline(IssueTimelineConnectionGQO timeline) {
        this.timeline = timeline;
    }

    public IssueTimelineItemsConnectionGQO getTimelineItems() {
        return timelineItems;
    }
    public void setTimelineItems(IssueTimelineItemsConnectionGQO timelineItems) {
        this.timelineItems = timelineItems;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
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

    public Boolean getViewerCanReact() {
        return viewerCanReact;
    }
    public void setViewerCanReact(Boolean viewerCanReact) {
        this.viewerCanReact = viewerCanReact;
    }

    public Boolean getViewerCanSubscribe() {
        return viewerCanSubscribe;
    }
    public void setViewerCanSubscribe(Boolean viewerCanSubscribe) {
        this.viewerCanSubscribe = viewerCanSubscribe;
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

    public SubscriptionStateGQO getViewerSubscription() {
        return viewerSubscription;
    }
    public void setViewerSubscription(SubscriptionStateGQO viewerSubscription) {
        this.viewerSubscription = viewerSubscription;
    }

}