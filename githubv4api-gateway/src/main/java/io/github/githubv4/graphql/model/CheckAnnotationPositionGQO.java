package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class CheckAnnotationPositionGQO {

    private Integer column;
    @javax.validation.constraints.NotNull
    private Integer line;

    public CheckAnnotationPositionGQO() {
    }

    public CheckAnnotationPositionGQO(Integer column, Integer line) {
        this.column = column;
        this.line = line;
    }

    public Integer getColumn() {
        return column;
    }
    public void setColumn(Integer column) {
        this.column = column;
    }

    public Integer getLine() {
        return line;
    }
    public void setLine(Integer line) {
        this.line = line;
    }

}