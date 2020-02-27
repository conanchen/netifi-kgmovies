package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class PullRequestGQO implements CloserGQO, IssueOrPullRequestGQO, MilestoneItemGQO, ProjectCardItemGQO, ReferencedSubjectGQO, RenamedTitleSubjectGQO, SearchResultItemGQO, AssignableGQO, ClosableGQO, CommentGQO, LabelableGQO, LockableGQO, NodeGQO, ReactableGQO, RepositoryNodeGQO, SubscribableGQO, UniformResourceLocatableGQO, UpdatableGQO, UpdatableCommentGQO{

    private LockReasonGQO activeLockReason;
    @javax.validation.constraints.NotNull
    private Integer additions;
    @javax.validation.constraints.NotNull
    private UserConnectionGQO assignees;
    private ActorGQO author;
    @javax.validation.constraints.NotNull
    private CommentAuthorAssociationGQO authorAssociation;
    private RefGQO baseRef;
    @javax.validation.constraints.NotNull
    private String baseRefName;
    @javax.validation.constraints.NotNull
    private String baseRefOid;
    private RepositoryGQO baseRepository;
    @javax.validation.constraints.NotNull
    private String body;
    @javax.validation.constraints.NotNull
    private String bodyHTML;
    @javax.validation.constraints.NotNull
    private String bodyText;
    @javax.validation.constraints.NotNull
    private Boolean canBeRebased;
    @javax.validation.constraints.NotNull
    private Integer changedFiles;
    @javax.validation.constraints.NotNull
    private String checksResourcePath;
    @javax.validation.constraints.NotNull
    private String checksUrl;
    @javax.validation.constraints.NotNull
    private Boolean closed;
    private java.util.Date closedAt;
    @javax.validation.constraints.NotNull
    private IssueCommentConnectionGQO comments;
    @javax.validation.constraints.NotNull
    private PullRequestCommitConnectionGQO commits;
    @javax.validation.constraints.NotNull
    private java.util.Date createdAt;
    @javax.validation.constraints.NotNull
    private Boolean createdViaEmail;
    private Integer databaseId;
    @javax.validation.constraints.NotNull
    private Integer deletions;
    private ActorGQO editor;
    private PullRequestChangedFileConnectionGQO files;
    private RefGQO headRef;
    @javax.validation.constraints.NotNull
    private String headRefName;
    @javax.validation.constraints.NotNull
    private String headRefOid;
    private RepositoryGQO headRepository;
    private RepositoryOwnerGQO headRepositoryOwner;
    @javax.validation.constraints.NotNull
    private HovercardGQO hovercard;
    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private Boolean includesCreatedEdit;
    @javax.validation.constraints.NotNull
    private Boolean isCrossRepository;
    @javax.validation.constraints.NotNull
    private Boolean isDraft;
    private LabelConnectionGQO labels;
    private java.util.Date lastEditedAt;
    @javax.validation.constraints.NotNull
    private Boolean locked;
    @javax.validation.constraints.NotNull
    private Boolean maintainerCanModify;
    private CommitGQO mergeCommit;
    @javax.validation.constraints.NotNull
    private MergeStateStatusGQO mergeStateStatus;
    @javax.validation.constraints.NotNull
    private MergeableStateGQO mergeable;
    @javax.validation.constraints.NotNull
    private Boolean merged;
    private java.util.Date mergedAt;
    private ActorGQO mergedBy;
    private MilestoneGQO milestone;
    @javax.validation.constraints.NotNull
    private Integer number;
    @javax.validation.constraints.NotNull
    private UserConnectionGQO participants;
    @javax.validation.constraints.NotNull
    private String permalink;
    private CommitGQO potentialMergeCommit;
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
    private String revertResourcePath;
    @javax.validation.constraints.NotNull
    private String revertUrl;
    private ReviewRequestConnectionGQO reviewRequests;
    @javax.validation.constraints.NotNull
    private PullRequestReviewThreadConnectionGQO reviewThreads;
    private PullRequestReviewConnectionGQO reviews;
    @javax.validation.constraints.NotNull
    private PullRequestStateGQO state;
    @javax.validation.constraints.NotNull
    private Collection<SuggestedReviewerGQO> suggestedReviewers;
    @javax.validation.constraints.NotNull
    private PullRequestTimelineConnectionGQO timeline;
    @javax.validation.constraints.NotNull
    private PullRequestTimelineItemsConnectionGQO timelineItems;
    @javax.validation.constraints.NotNull
    private String title;
    @javax.validation.constraints.NotNull
    private java.util.Date updatedAt;
    @javax.validation.constraints.NotNull
    private String url;
    private UserContentEditConnectionGQO userContentEdits;
    @javax.validation.constraints.NotNull
    private Boolean viewerCanApplySuggestion;
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

    public PullRequestGQO() {
    }

    public PullRequestGQO(LockReasonGQO activeLockReason, Integer additions, UserConnectionGQO assignees, ActorGQO author, CommentAuthorAssociationGQO authorAssociation, RefGQO baseRef, String baseRefName, String baseRefOid, RepositoryGQO baseRepository, String body, String bodyHTML, String bodyText, Boolean canBeRebased, Integer changedFiles, String checksResourcePath, String checksUrl, Boolean closed, java.util.Date closedAt, IssueCommentConnectionGQO comments, PullRequestCommitConnectionGQO commits, java.util.Date createdAt, Boolean createdViaEmail, Integer databaseId, Integer deletions, ActorGQO editor, PullRequestChangedFileConnectionGQO files, RefGQO headRef, String headRefName, String headRefOid, RepositoryGQO headRepository, RepositoryOwnerGQO headRepositoryOwner, HovercardGQO hovercard, String id, Boolean includesCreatedEdit, Boolean isCrossRepository, Boolean isDraft, LabelConnectionGQO labels, java.util.Date lastEditedAt, Boolean locked, Boolean maintainerCanModify, CommitGQO mergeCommit, MergeStateStatusGQO mergeStateStatus, MergeableStateGQO mergeable, Boolean merged, java.util.Date mergedAt, ActorGQO mergedBy, MilestoneGQO milestone, Integer number, UserConnectionGQO participants, String permalink, CommitGQO potentialMergeCommit, ProjectCardConnectionGQO projectCards, java.util.Date publishedAt, Collection<ReactionGroupGQO> reactionGroups, ReactionConnectionGQO reactions, RepositoryGQO repository, String resourcePath, String revertResourcePath, String revertUrl, ReviewRequestConnectionGQO reviewRequests, PullRequestReviewThreadConnectionGQO reviewThreads, PullRequestReviewConnectionGQO reviews, PullRequestStateGQO state, Collection<SuggestedReviewerGQO> suggestedReviewers, PullRequestTimelineConnectionGQO timeline, PullRequestTimelineItemsConnectionGQO timelineItems, String title, java.util.Date updatedAt, String url, UserContentEditConnectionGQO userContentEdits, Boolean viewerCanApplySuggestion, Boolean viewerCanReact, Boolean viewerCanSubscribe, Boolean viewerCanUpdate, Collection<CommentCannotUpdateReasonGQO> viewerCannotUpdateReasons, Boolean viewerDidAuthor, SubscriptionStateGQO viewerSubscription) {
        this.activeLockReason = activeLockReason;
        this.additions = additions;
        this.assignees = assignees;
        this.author = author;
        this.authorAssociation = authorAssociation;
        this.baseRef = baseRef;
        this.baseRefName = baseRefName;
        this.baseRefOid = baseRefOid;
        this.baseRepository = baseRepository;
        this.body = body;
        this.bodyHTML = bodyHTML;
        this.bodyText = bodyText;
        this.canBeRebased = canBeRebased;
        this.changedFiles = changedFiles;
        this.checksResourcePath = checksResourcePath;
        this.checksUrl = checksUrl;
        this.closed = closed;
        this.closedAt = closedAt;
        this.comments = comments;
        this.commits = commits;
        this.createdAt = createdAt;
        this.createdViaEmail = createdViaEmail;
        this.databaseId = databaseId;
        this.deletions = deletions;
        this.editor = editor;
        this.files = files;
        this.headRef = headRef;
        this.headRefName = headRefName;
        this.headRefOid = headRefOid;
        this.headRepository = headRepository;
        this.headRepositoryOwner = headRepositoryOwner;
        this.hovercard = hovercard;
        this.id = id;
        this.includesCreatedEdit = includesCreatedEdit;
        this.isCrossRepository = isCrossRepository;
        this.isDraft = isDraft;
        this.labels = labels;
        this.lastEditedAt = lastEditedAt;
        this.locked = locked;
        this.maintainerCanModify = maintainerCanModify;
        this.mergeCommit = mergeCommit;
        this.mergeStateStatus = mergeStateStatus;
        this.mergeable = mergeable;
        this.merged = merged;
        this.mergedAt = mergedAt;
        this.mergedBy = mergedBy;
        this.milestone = milestone;
        this.number = number;
        this.participants = participants;
        this.permalink = permalink;
        this.potentialMergeCommit = potentialMergeCommit;
        this.projectCards = projectCards;
        this.publishedAt = publishedAt;
        this.reactionGroups = reactionGroups;
        this.reactions = reactions;
        this.repository = repository;
        this.resourcePath = resourcePath;
        this.revertResourcePath = revertResourcePath;
        this.revertUrl = revertUrl;
        this.reviewRequests = reviewRequests;
        this.reviewThreads = reviewThreads;
        this.reviews = reviews;
        this.state = state;
        this.suggestedReviewers = suggestedReviewers;
        this.timeline = timeline;
        this.timelineItems = timelineItems;
        this.title = title;
        this.updatedAt = updatedAt;
        this.url = url;
        this.userContentEdits = userContentEdits;
        this.viewerCanApplySuggestion = viewerCanApplySuggestion;
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

    public Integer getAdditions() {
        return additions;
    }
    public void setAdditions(Integer additions) {
        this.additions = additions;
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

    public RefGQO getBaseRef() {
        return baseRef;
    }
    public void setBaseRef(RefGQO baseRef) {
        this.baseRef = baseRef;
    }

    public String getBaseRefName() {
        return baseRefName;
    }
    public void setBaseRefName(String baseRefName) {
        this.baseRefName = baseRefName;
    }

    public String getBaseRefOid() {
        return baseRefOid;
    }
    public void setBaseRefOid(String baseRefOid) {
        this.baseRefOid = baseRefOid;
    }

    public RepositoryGQO getBaseRepository() {
        return baseRepository;
    }
    public void setBaseRepository(RepositoryGQO baseRepository) {
        this.baseRepository = baseRepository;
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

    public Boolean getCanBeRebased() {
        return canBeRebased;
    }
    public void setCanBeRebased(Boolean canBeRebased) {
        this.canBeRebased = canBeRebased;
    }

    public Integer getChangedFiles() {
        return changedFiles;
    }
    public void setChangedFiles(Integer changedFiles) {
        this.changedFiles = changedFiles;
    }

    public String getChecksResourcePath() {
        return checksResourcePath;
    }
    public void setChecksResourcePath(String checksResourcePath) {
        this.checksResourcePath = checksResourcePath;
    }

    public String getChecksUrl() {
        return checksUrl;
    }
    public void setChecksUrl(String checksUrl) {
        this.checksUrl = checksUrl;
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

    public PullRequestCommitConnectionGQO getCommits() {
        return commits;
    }
    public void setCommits(PullRequestCommitConnectionGQO commits) {
        this.commits = commits;
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

    public Integer getDeletions() {
        return deletions;
    }
    public void setDeletions(Integer deletions) {
        this.deletions = deletions;
    }

    public ActorGQO getEditor() {
        return editor;
    }
    public void setEditor(ActorGQO editor) {
        this.editor = editor;
    }

    public PullRequestChangedFileConnectionGQO getFiles() {
        return files;
    }
    public void setFiles(PullRequestChangedFileConnectionGQO files) {
        this.files = files;
    }

    public RefGQO getHeadRef() {
        return headRef;
    }
    public void setHeadRef(RefGQO headRef) {
        this.headRef = headRef;
    }

    public String getHeadRefName() {
        return headRefName;
    }
    public void setHeadRefName(String headRefName) {
        this.headRefName = headRefName;
    }

    public String getHeadRefOid() {
        return headRefOid;
    }
    public void setHeadRefOid(String headRefOid) {
        this.headRefOid = headRefOid;
    }

    public RepositoryGQO getHeadRepository() {
        return headRepository;
    }
    public void setHeadRepository(RepositoryGQO headRepository) {
        this.headRepository = headRepository;
    }

    public RepositoryOwnerGQO getHeadRepositoryOwner() {
        return headRepositoryOwner;
    }
    public void setHeadRepositoryOwner(RepositoryOwnerGQO headRepositoryOwner) {
        this.headRepositoryOwner = headRepositoryOwner;
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

    public Boolean getIsCrossRepository() {
        return isCrossRepository;
    }
    public void setIsCrossRepository(Boolean isCrossRepository) {
        this.isCrossRepository = isCrossRepository;
    }

    public Boolean getIsDraft() {
        return isDraft;
    }
    public void setIsDraft(Boolean isDraft) {
        this.isDraft = isDraft;
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

    public Boolean getMaintainerCanModify() {
        return maintainerCanModify;
    }
    public void setMaintainerCanModify(Boolean maintainerCanModify) {
        this.maintainerCanModify = maintainerCanModify;
    }

    public CommitGQO getMergeCommit() {
        return mergeCommit;
    }
    public void setMergeCommit(CommitGQO mergeCommit) {
        this.mergeCommit = mergeCommit;
    }

    public MergeStateStatusGQO getMergeStateStatus() {
        return mergeStateStatus;
    }
    public void setMergeStateStatus(MergeStateStatusGQO mergeStateStatus) {
        this.mergeStateStatus = mergeStateStatus;
    }

    public MergeableStateGQO getMergeable() {
        return mergeable;
    }
    public void setMergeable(MergeableStateGQO mergeable) {
        this.mergeable = mergeable;
    }

    public Boolean getMerged() {
        return merged;
    }
    public void setMerged(Boolean merged) {
        this.merged = merged;
    }

    public java.util.Date getMergedAt() {
        return mergedAt;
    }
    public void setMergedAt(java.util.Date mergedAt) {
        this.mergedAt = mergedAt;
    }

    public ActorGQO getMergedBy() {
        return mergedBy;
    }
    public void setMergedBy(ActorGQO mergedBy) {
        this.mergedBy = mergedBy;
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

    public String getPermalink() {
        return permalink;
    }
    public void setPermalink(String permalink) {
        this.permalink = permalink;
    }

    public CommitGQO getPotentialMergeCommit() {
        return potentialMergeCommit;
    }
    public void setPotentialMergeCommit(CommitGQO potentialMergeCommit) {
        this.potentialMergeCommit = potentialMergeCommit;
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

    public String getRevertResourcePath() {
        return revertResourcePath;
    }
    public void setRevertResourcePath(String revertResourcePath) {
        this.revertResourcePath = revertResourcePath;
    }

    public String getRevertUrl() {
        return revertUrl;
    }
    public void setRevertUrl(String revertUrl) {
        this.revertUrl = revertUrl;
    }

    public ReviewRequestConnectionGQO getReviewRequests() {
        return reviewRequests;
    }
    public void setReviewRequests(ReviewRequestConnectionGQO reviewRequests) {
        this.reviewRequests = reviewRequests;
    }

    public PullRequestReviewThreadConnectionGQO getReviewThreads() {
        return reviewThreads;
    }
    public void setReviewThreads(PullRequestReviewThreadConnectionGQO reviewThreads) {
        this.reviewThreads = reviewThreads;
    }

    public PullRequestReviewConnectionGQO getReviews() {
        return reviews;
    }
    public void setReviews(PullRequestReviewConnectionGQO reviews) {
        this.reviews = reviews;
    }

    public PullRequestStateGQO getState() {
        return state;
    }
    public void setState(PullRequestStateGQO state) {
        this.state = state;
    }

    public Collection<SuggestedReviewerGQO> getSuggestedReviewers() {
        return suggestedReviewers;
    }
    public void setSuggestedReviewers(Collection<SuggestedReviewerGQO> suggestedReviewers) {
        this.suggestedReviewers = suggestedReviewers;
    }

    public PullRequestTimelineConnectionGQO getTimeline() {
        return timeline;
    }
    public void setTimeline(PullRequestTimelineConnectionGQO timeline) {
        this.timeline = timeline;
    }

    public PullRequestTimelineItemsConnectionGQO getTimelineItems() {
        return timelineItems;
    }
    public void setTimelineItems(PullRequestTimelineItemsConnectionGQO timelineItems) {
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

    public Boolean getViewerCanApplySuggestion() {
        return viewerCanApplySuggestion;
    }
    public void setViewerCanApplySuggestion(Boolean viewerCanApplySuggestion) {
        this.viewerCanApplySuggestion = viewerCanApplySuggestion;
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