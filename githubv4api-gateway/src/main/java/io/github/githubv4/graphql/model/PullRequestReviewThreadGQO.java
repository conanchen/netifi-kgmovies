package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class PullRequestReviewThreadGQO implements PullRequestTimelineItemGQO, PullRequestTimelineItemsGQO, NodeGQO{

    @javax.validation.constraints.NotNull
    private PullRequestReviewCommentConnectionGQO comments;
    @javax.validation.constraints.NotNull
    private DiffSideGQO diffSide;
    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private Boolean isResolved;
    private Integer line;
    private Integer originalLine;
    private Integer originalStartLine;
    @javax.validation.constraints.NotNull
    private PullRequestGQO pullRequest;
    @javax.validation.constraints.NotNull
    private RepositoryGQO repository;
    private UserGQO resolvedBy;
    private DiffSideGQO startDiffSide;
    private Integer startLine;
    @javax.validation.constraints.NotNull
    private Boolean viewerCanResolve;
    @javax.validation.constraints.NotNull
    private Boolean viewerCanUnresolve;

    public PullRequestReviewThreadGQO() {
    }

    public PullRequestReviewThreadGQO(PullRequestReviewCommentConnectionGQO comments, DiffSideGQO diffSide, String id, Boolean isResolved, Integer line, Integer originalLine, Integer originalStartLine, PullRequestGQO pullRequest, RepositoryGQO repository, UserGQO resolvedBy, DiffSideGQO startDiffSide, Integer startLine, Boolean viewerCanResolve, Boolean viewerCanUnresolve) {
        this.comments = comments;
        this.diffSide = diffSide;
        this.id = id;
        this.isResolved = isResolved;
        this.line = line;
        this.originalLine = originalLine;
        this.originalStartLine = originalStartLine;
        this.pullRequest = pullRequest;
        this.repository = repository;
        this.resolvedBy = resolvedBy;
        this.startDiffSide = startDiffSide;
        this.startLine = startLine;
        this.viewerCanResolve = viewerCanResolve;
        this.viewerCanUnresolve = viewerCanUnresolve;
    }

    public PullRequestReviewCommentConnectionGQO getComments() {
        return comments;
    }
    public void setComments(PullRequestReviewCommentConnectionGQO comments) {
        this.comments = comments;
    }

    public DiffSideGQO getDiffSide() {
        return diffSide;
    }
    public void setDiffSide(DiffSideGQO diffSide) {
        this.diffSide = diffSide;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public Boolean getIsResolved() {
        return isResolved;
    }
    public void setIsResolved(Boolean isResolved) {
        this.isResolved = isResolved;
    }

    public Integer getLine() {
        return line;
    }
    public void setLine(Integer line) {
        this.line = line;
    }

    public Integer getOriginalLine() {
        return originalLine;
    }
    public void setOriginalLine(Integer originalLine) {
        this.originalLine = originalLine;
    }

    public Integer getOriginalStartLine() {
        return originalStartLine;
    }
    public void setOriginalStartLine(Integer originalStartLine) {
        this.originalStartLine = originalStartLine;
    }

    public PullRequestGQO getPullRequest() {
        return pullRequest;
    }
    public void setPullRequest(PullRequestGQO pullRequest) {
        this.pullRequest = pullRequest;
    }

    public RepositoryGQO getRepository() {
        return repository;
    }
    public void setRepository(RepositoryGQO repository) {
        this.repository = repository;
    }

    public UserGQO getResolvedBy() {
        return resolvedBy;
    }
    public void setResolvedBy(UserGQO resolvedBy) {
        this.resolvedBy = resolvedBy;
    }

    public DiffSideGQO getStartDiffSide() {
        return startDiffSide;
    }
    public void setStartDiffSide(DiffSideGQO startDiffSide) {
        this.startDiffSide = startDiffSide;
    }

    public Integer getStartLine() {
        return startLine;
    }
    public void setStartLine(Integer startLine) {
        this.startLine = startLine;
    }

    public Boolean getViewerCanResolve() {
        return viewerCanResolve;
    }
    public void setViewerCanResolve(Boolean viewerCanResolve) {
        this.viewerCanResolve = viewerCanResolve;
    }

    public Boolean getViewerCanUnresolve() {
        return viewerCanUnresolve;
    }
    public void setViewerCanUnresolve(Boolean viewerCanUnresolve) {
        this.viewerCanUnresolve = viewerCanUnresolve;
    }

}