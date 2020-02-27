package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class ProjectCardImportGQO {

    @javax.validation.constraints.NotNull
    private Integer number;
    @javax.validation.constraints.NotNull
    private String repository;

    public ProjectCardImportGQO() {
    }

    public ProjectCardImportGQO(Integer number, String repository) {
        this.number = number;
        this.repository = repository;
    }

    public Integer getNumber() {
        return number;
    }
    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getRepository() {
        return repository;
    }
    public void setRepository(String repository) {
        this.repository = repository;
    }

}