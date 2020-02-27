package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class PullRequestChangedFileGQO {

    @javax.validation.constraints.NotNull
    private Integer additions;
    @javax.validation.constraints.NotNull
    private Integer deletions;
    @javax.validation.constraints.NotNull
    private String path;

    public PullRequestChangedFileGQO() {
    }

    public PullRequestChangedFileGQO(Integer additions, Integer deletions, String path) {
        this.additions = additions;
        this.deletions = deletions;
        this.path = path;
    }

    public Integer getAdditions() {
        return additions;
    }
    public void setAdditions(Integer additions) {
        this.additions = additions;
    }

    public Integer getDeletions() {
        return deletions;
    }
    public void setDeletions(Integer deletions) {
        this.deletions = deletions;
    }

    public String getPath() {
        return path;
    }
    public void setPath(String path) {
        this.path = path;
    }

}