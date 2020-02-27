package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class CommitGQO implements CloserGQO, IssueTimelineItemGQO, PullRequestTimelineItemGQO, GitObjectGQO, NodeGQO, SubscribableGQO, UniformResourceLocatableGQO{

    @javax.validation.constraints.NotNull
    private String abbreviatedOid;
    @javax.validation.constraints.NotNull
    private Integer additions;
    private PullRequestConnectionGQO associatedPullRequests;
    private GitActorGQO author;
    @javax.validation.constraints.NotNull
    private Boolean authoredByCommitter;
    @javax.validation.constraints.NotNull
    private java.util.Date authoredDate;
    @javax.validation.constraints.NotNull
    private BlameGQO blame;
    @javax.validation.constraints.NotNull
    private Integer changedFiles;
    private CheckSuiteConnectionGQO checkSuites;
    @javax.validation.constraints.NotNull
    private CommitCommentConnectionGQO comments;
    @javax.validation.constraints.NotNull
    private String commitResourcePath;
    @javax.validation.constraints.NotNull
    private String commitUrl;
    @javax.validation.constraints.NotNull
    private java.util.Date committedDate;
    @javax.validation.constraints.NotNull
    private Boolean committedViaWeb;
    private GitActorGQO committer;
    @javax.validation.constraints.NotNull
    private Integer deletions;
    private DeploymentConnectionGQO deployments;
    @javax.validation.constraints.NotNull
    private CommitHistoryConnectionGQO history;
    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private String message;
    @javax.validation.constraints.NotNull
    private String messageBody;
    @javax.validation.constraints.NotNull
    private String messageBodyHTML;
    @javax.validation.constraints.NotNull
    private String messageHeadline;
    @javax.validation.constraints.NotNull
    private String messageHeadlineHTML;
    @javax.validation.constraints.NotNull
    private String oid;
    @javax.validation.constraints.NotNull
    private CommitConnectionGQO parents;
    private java.util.Date pushedDate;
    @javax.validation.constraints.NotNull
    private RepositoryGQO repository;
    @javax.validation.constraints.NotNull
    private String resourcePath;
    private GitSignatureGQO signature;
    private StatusGQO status;
    @javax.validation.constraints.NotNull
    private String tarballUrl;
    @javax.validation.constraints.NotNull
    private TreeGQO tree;
    @javax.validation.constraints.NotNull
    private String treeResourcePath;
    @javax.validation.constraints.NotNull
    private String treeUrl;
    @javax.validation.constraints.NotNull
    private String url;
    @javax.validation.constraints.NotNull
    private Boolean viewerCanSubscribe;
    private SubscriptionStateGQO viewerSubscription;
    @javax.validation.constraints.NotNull
    private String zipballUrl;

    public CommitGQO() {
    }

    public CommitGQO(String abbreviatedOid, Integer additions, PullRequestConnectionGQO associatedPullRequests, GitActorGQO author, Boolean authoredByCommitter, java.util.Date authoredDate, BlameGQO blame, Integer changedFiles, CheckSuiteConnectionGQO checkSuites, CommitCommentConnectionGQO comments, String commitResourcePath, String commitUrl, java.util.Date committedDate, Boolean committedViaWeb, GitActorGQO committer, Integer deletions, DeploymentConnectionGQO deployments, CommitHistoryConnectionGQO history, String id, String message, String messageBody, String messageBodyHTML, String messageHeadline, String messageHeadlineHTML, String oid, CommitConnectionGQO parents, java.util.Date pushedDate, RepositoryGQO repository, String resourcePath, GitSignatureGQO signature, StatusGQO status, String tarballUrl, TreeGQO tree, String treeResourcePath, String treeUrl, String url, Boolean viewerCanSubscribe, SubscriptionStateGQO viewerSubscription, String zipballUrl) {
        this.abbreviatedOid = abbreviatedOid;
        this.additions = additions;
        this.associatedPullRequests = associatedPullRequests;
        this.author = author;
        this.authoredByCommitter = authoredByCommitter;
        this.authoredDate = authoredDate;
        this.blame = blame;
        this.changedFiles = changedFiles;
        this.checkSuites = checkSuites;
        this.comments = comments;
        this.commitResourcePath = commitResourcePath;
        this.commitUrl = commitUrl;
        this.committedDate = committedDate;
        this.committedViaWeb = committedViaWeb;
        this.committer = committer;
        this.deletions = deletions;
        this.deployments = deployments;
        this.history = history;
        this.id = id;
        this.message = message;
        this.messageBody = messageBody;
        this.messageBodyHTML = messageBodyHTML;
        this.messageHeadline = messageHeadline;
        this.messageHeadlineHTML = messageHeadlineHTML;
        this.oid = oid;
        this.parents = parents;
        this.pushedDate = pushedDate;
        this.repository = repository;
        this.resourcePath = resourcePath;
        this.signature = signature;
        this.status = status;
        this.tarballUrl = tarballUrl;
        this.tree = tree;
        this.treeResourcePath = treeResourcePath;
        this.treeUrl = treeUrl;
        this.url = url;
        this.viewerCanSubscribe = viewerCanSubscribe;
        this.viewerSubscription = viewerSubscription;
        this.zipballUrl = zipballUrl;
    }

    public String getAbbreviatedOid() {
        return abbreviatedOid;
    }
    public void setAbbreviatedOid(String abbreviatedOid) {
        this.abbreviatedOid = abbreviatedOid;
    }

    public Integer getAdditions() {
        return additions;
    }
    public void setAdditions(Integer additions) {
        this.additions = additions;
    }

    public PullRequestConnectionGQO getAssociatedPullRequests() {
        return associatedPullRequests;
    }
    public void setAssociatedPullRequests(PullRequestConnectionGQO associatedPullRequests) {
        this.associatedPullRequests = associatedPullRequests;
    }

    public GitActorGQO getAuthor() {
        return author;
    }
    public void setAuthor(GitActorGQO author) {
        this.author = author;
    }

    public Boolean getAuthoredByCommitter() {
        return authoredByCommitter;
    }
    public void setAuthoredByCommitter(Boolean authoredByCommitter) {
        this.authoredByCommitter = authoredByCommitter;
    }

    public java.util.Date getAuthoredDate() {
        return authoredDate;
    }
    public void setAuthoredDate(java.util.Date authoredDate) {
        this.authoredDate = authoredDate;
    }

    public BlameGQO getBlame() {
        return blame;
    }
    public void setBlame(BlameGQO blame) {
        this.blame = blame;
    }

    public Integer getChangedFiles() {
        return changedFiles;
    }
    public void setChangedFiles(Integer changedFiles) {
        this.changedFiles = changedFiles;
    }

    public CheckSuiteConnectionGQO getCheckSuites() {
        return checkSuites;
    }
    public void setCheckSuites(CheckSuiteConnectionGQO checkSuites) {
        this.checkSuites = checkSuites;
    }

    public CommitCommentConnectionGQO getComments() {
        return comments;
    }
    public void setComments(CommitCommentConnectionGQO comments) {
        this.comments = comments;
    }

    public String getCommitResourcePath() {
        return commitResourcePath;
    }
    public void setCommitResourcePath(String commitResourcePath) {
        this.commitResourcePath = commitResourcePath;
    }

    public String getCommitUrl() {
        return commitUrl;
    }
    public void setCommitUrl(String commitUrl) {
        this.commitUrl = commitUrl;
    }

    public java.util.Date getCommittedDate() {
        return committedDate;
    }
    public void setCommittedDate(java.util.Date committedDate) {
        this.committedDate = committedDate;
    }

    public Boolean getCommittedViaWeb() {
        return committedViaWeb;
    }
    public void setCommittedViaWeb(Boolean committedViaWeb) {
        this.committedViaWeb = committedViaWeb;
    }

    public GitActorGQO getCommitter() {
        return committer;
    }
    public void setCommitter(GitActorGQO committer) {
        this.committer = committer;
    }

    public Integer getDeletions() {
        return deletions;
    }
    public void setDeletions(Integer deletions) {
        this.deletions = deletions;
    }

    public DeploymentConnectionGQO getDeployments() {
        return deployments;
    }
    public void setDeployments(DeploymentConnectionGQO deployments) {
        this.deployments = deployments;
    }

    public CommitHistoryConnectionGQO getHistory() {
        return history;
    }
    public void setHistory(CommitHistoryConnectionGQO history) {
        this.history = history;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessageBody() {
        return messageBody;
    }
    public void setMessageBody(String messageBody) {
        this.messageBody = messageBody;
    }

    public String getMessageBodyHTML() {
        return messageBodyHTML;
    }
    public void setMessageBodyHTML(String messageBodyHTML) {
        this.messageBodyHTML = messageBodyHTML;
    }

    public String getMessageHeadline() {
        return messageHeadline;
    }
    public void setMessageHeadline(String messageHeadline) {
        this.messageHeadline = messageHeadline;
    }

    public String getMessageHeadlineHTML() {
        return messageHeadlineHTML;
    }
    public void setMessageHeadlineHTML(String messageHeadlineHTML) {
        this.messageHeadlineHTML = messageHeadlineHTML;
    }

    public String getOid() {
        return oid;
    }
    public void setOid(String oid) {
        this.oid = oid;
    }

    public CommitConnectionGQO getParents() {
        return parents;
    }
    public void setParents(CommitConnectionGQO parents) {
        this.parents = parents;
    }

    public java.util.Date getPushedDate() {
        return pushedDate;
    }
    public void setPushedDate(java.util.Date pushedDate) {
        this.pushedDate = pushedDate;
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

    public GitSignatureGQO getSignature() {
        return signature;
    }
    public void setSignature(GitSignatureGQO signature) {
        this.signature = signature;
    }

    public StatusGQO getStatus() {
        return status;
    }
    public void setStatus(StatusGQO status) {
        this.status = status;
    }

    public String getTarballUrl() {
        return tarballUrl;
    }
    public void setTarballUrl(String tarballUrl) {
        this.tarballUrl = tarballUrl;
    }

    public TreeGQO getTree() {
        return tree;
    }
    public void setTree(TreeGQO tree) {
        this.tree = tree;
    }

    public String getTreeResourcePath() {
        return treeResourcePath;
    }
    public void setTreeResourcePath(String treeResourcePath) {
        this.treeResourcePath = treeResourcePath;
    }

    public String getTreeUrl() {
        return treeUrl;
    }
    public void setTreeUrl(String treeUrl) {
        this.treeUrl = treeUrl;
    }

    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }

    public Boolean getViewerCanSubscribe() {
        return viewerCanSubscribe;
    }
    public void setViewerCanSubscribe(Boolean viewerCanSubscribe) {
        this.viewerCanSubscribe = viewerCanSubscribe;
    }

    public SubscriptionStateGQO getViewerSubscription() {
        return viewerSubscription;
    }
    public void setViewerSubscription(SubscriptionStateGQO viewerSubscription) {
        this.viewerSubscription = viewerSubscription;
    }

    public String getZipballUrl() {
        return zipballUrl;
    }
    public void setZipballUrl(String zipballUrl) {
        this.zipballUrl = zipballUrl;
    }

}