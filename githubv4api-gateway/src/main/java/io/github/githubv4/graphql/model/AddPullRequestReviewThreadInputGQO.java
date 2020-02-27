package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class AddPullRequestReviewThreadInputGQO {

    @javax.validation.constraints.NotNull
    private String body;
    private String clientMutationId;
    @javax.validation.constraints.NotNull
    private Integer line;
    @javax.validation.constraints.NotNull
    private String path;
    @javax.validation.constraints.NotNull
    private String pullRequestReviewId;
    private DiffSideGQO side;
    private Integer startLine;
    private DiffSideGQO startSide;

    public AddPullRequestReviewThreadInputGQO() {
    }

    public AddPullRequestReviewThreadInputGQO(String body, String clientMutationId, Integer line, String path, String pullRequestReviewId, DiffSideGQO side, Integer startLine, DiffSideGQO startSide) {
        this.body = body;
        this.clientMutationId = clientMutationId;
        this.line = line;
        this.path = path;
        this.pullRequestReviewId = pullRequestReviewId;
        this.side = side;
        this.startLine = startLine;
        this.startSide = startSide;
    }

    public String getBody() {
        return body;
    }
    public void setBody(String body) {
        this.body = body;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public Integer getLine() {
        return line;
    }
    public void setLine(Integer line) {
        this.line = line;
    }

    public String getPath() {
        return path;
    }
    public void setPath(String path) {
        this.path = path;
    }

    public String getPullRequestReviewId() {
        return pullRequestReviewId;
    }
    public void setPullRequestReviewId(String pullRequestReviewId) {
        this.pullRequestReviewId = pullRequestReviewId;
    }

    public DiffSideGQO getSide() {
        return side;
    }
    public void setSide(DiffSideGQO side) {
        this.side = side;
    }

    public Integer getStartLine() {
        return startLine;
    }
    public void setStartLine(Integer startLine) {
        this.startLine = startLine;
    }

    public DiffSideGQO getStartSide() {
        return startSide;
    }
    public void setStartSide(DiffSideGQO startSide) {
        this.startSide = startSide;
    }

}