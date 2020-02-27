package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class DraftPullRequestReviewCommentGQO {

    @javax.validation.constraints.NotNull
    private String body;
    @javax.validation.constraints.NotNull
    private String path;
    @javax.validation.constraints.NotNull
    private Integer position;

    public DraftPullRequestReviewCommentGQO() {
    }

    public DraftPullRequestReviewCommentGQO(String body, String path, Integer position) {
        this.body = body;
        this.path = path;
        this.position = position;
    }

    public String getBody() {
        return body;
    }
    public void setBody(String body) {
        this.body = body;
    }

    public String getPath() {
        return path;
    }
    public void setPath(String path) {
        this.path = path;
    }

    public Integer getPosition() {
        return position;
    }
    public void setPosition(Integer position) {
        this.position = position;
    }

}