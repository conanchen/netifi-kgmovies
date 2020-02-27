package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class BlameRangeGQO {

    @javax.validation.constraints.NotNull
    private Integer age;
    @javax.validation.constraints.NotNull
    private CommitGQO commit;
    @javax.validation.constraints.NotNull
    private Integer endingLine;
    @javax.validation.constraints.NotNull
    private Integer startingLine;

    public BlameRangeGQO() {
    }

    public BlameRangeGQO(Integer age, CommitGQO commit, Integer endingLine, Integer startingLine) {
        this.age = age;
        this.commit = commit;
        this.endingLine = endingLine;
        this.startingLine = startingLine;
    }

    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }

    public CommitGQO getCommit() {
        return commit;
    }
    public void setCommit(CommitGQO commit) {
        this.commit = commit;
    }

    public Integer getEndingLine() {
        return endingLine;
    }
    public void setEndingLine(Integer endingLine) {
        this.endingLine = endingLine;
    }

    public Integer getStartingLine() {
        return startingLine;
    }
    public void setStartingLine(Integer startingLine) {
        this.startingLine = startingLine;
    }

}