package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class DraftPullRequestReviewThreadGQO {

    @javax.validation.constraints.NotNull
    private String body;
    @javax.validation.constraints.NotNull
    private Integer line;
    @javax.validation.constraints.NotNull
    private String path;
    private DiffSideGQO side;
    private Integer startLine;
    private DiffSideGQO startSide;

    public DraftPullRequestReviewThreadGQO() {
    }

    public DraftPullRequestReviewThreadGQO(String body, Integer line, String path, DiffSideGQO side, Integer startLine, DiffSideGQO startSide) {
        this.body = body;
        this.line = line;
        this.path = path;
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