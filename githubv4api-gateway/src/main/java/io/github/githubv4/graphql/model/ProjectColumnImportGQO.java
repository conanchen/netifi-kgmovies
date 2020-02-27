package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class ProjectColumnImportGQO {

    @javax.validation.constraints.NotNull
    private String columnName;
    @javax.validation.constraints.NotNull
    private Collection<ProjectCardImportGQO> issues;
    @javax.validation.constraints.NotNull
    private Integer position;

    public ProjectColumnImportGQO() {
    }

    public ProjectColumnImportGQO(String columnName, Collection<ProjectCardImportGQO> issues, Integer position) {
        this.columnName = columnName;
        this.issues = issues;
        this.position = position;
    }

    public String getColumnName() {
        return columnName;
    }
    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    public Collection<ProjectCardImportGQO> getIssues() {
        return issues;
    }
    public void setIssues(Collection<ProjectCardImportGQO> issues) {
        this.issues = issues;
    }

    public Integer getPosition() {
        return position;
    }
    public void setPosition(Integer position) {
        this.position = position;
    }

}