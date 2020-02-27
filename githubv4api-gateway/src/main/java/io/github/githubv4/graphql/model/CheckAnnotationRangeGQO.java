package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class CheckAnnotationRangeGQO {

    private Integer endColumn;
    @javax.validation.constraints.NotNull
    private Integer endLine;
    private Integer startColumn;
    @javax.validation.constraints.NotNull
    private Integer startLine;

    public CheckAnnotationRangeGQO() {
    }

    public CheckAnnotationRangeGQO(Integer endColumn, Integer endLine, Integer startColumn, Integer startLine) {
        this.endColumn = endColumn;
        this.endLine = endLine;
        this.startColumn = startColumn;
        this.startLine = startLine;
    }

    public Integer getEndColumn() {
        return endColumn;
    }
    public void setEndColumn(Integer endColumn) {
        this.endColumn = endColumn;
    }

    public Integer getEndLine() {
        return endLine;
    }
    public void setEndLine(Integer endLine) {
        this.endLine = endLine;
    }

    public Integer getStartColumn() {
        return startColumn;
    }
    public void setStartColumn(Integer startColumn) {
        this.startColumn = startColumn;
    }

    public Integer getStartLine() {
        return startLine;
    }
    public void setStartLine(Integer startLine) {
        this.startLine = startLine;
    }

}