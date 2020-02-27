package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class CheckRunGQO implements NodeGQO, UniformResourceLocatableGQO{

    private CheckAnnotationConnectionGQO annotations;
    @javax.validation.constraints.NotNull
    private CheckSuiteGQO checkSuite;
    private java.util.Date completedAt;
    private CheckConclusionStateGQO conclusion;
    private Integer databaseId;
    private String detailsUrl;
    private String externalId;
    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private String name;
    @javax.validation.constraints.NotNull
    private String permalink;
    @javax.validation.constraints.NotNull
    private RepositoryGQO repository;
    @javax.validation.constraints.NotNull
    private String resourcePath;
    private java.util.Date startedAt;
    @javax.validation.constraints.NotNull
    private CheckStatusStateGQO status;
    private String summary;
    private String text;
    private String title;
    @javax.validation.constraints.NotNull
    private String url;

    public CheckRunGQO() {
    }

    public CheckRunGQO(CheckAnnotationConnectionGQO annotations, CheckSuiteGQO checkSuite, java.util.Date completedAt, CheckConclusionStateGQO conclusion, Integer databaseId, String detailsUrl, String externalId, String id, String name, String permalink, RepositoryGQO repository, String resourcePath, java.util.Date startedAt, CheckStatusStateGQO status, String summary, String text, String title, String url) {
        this.annotations = annotations;
        this.checkSuite = checkSuite;
        this.completedAt = completedAt;
        this.conclusion = conclusion;
        this.databaseId = databaseId;
        this.detailsUrl = detailsUrl;
        this.externalId = externalId;
        this.id = id;
        this.name = name;
        this.permalink = permalink;
        this.repository = repository;
        this.resourcePath = resourcePath;
        this.startedAt = startedAt;
        this.status = status;
        this.summary = summary;
        this.text = text;
        this.title = title;
        this.url = url;
    }

    public CheckAnnotationConnectionGQO getAnnotations() {
        return annotations;
    }
    public void setAnnotations(CheckAnnotationConnectionGQO annotations) {
        this.annotations = annotations;
    }

    public CheckSuiteGQO getCheckSuite() {
        return checkSuite;
    }
    public void setCheckSuite(CheckSuiteGQO checkSuite) {
        this.checkSuite = checkSuite;
    }

    public java.util.Date getCompletedAt() {
        return completedAt;
    }
    public void setCompletedAt(java.util.Date completedAt) {
        this.completedAt = completedAt;
    }

    public CheckConclusionStateGQO getConclusion() {
        return conclusion;
    }
    public void setConclusion(CheckConclusionStateGQO conclusion) {
        this.conclusion = conclusion;
    }

    public Integer getDatabaseId() {
        return databaseId;
    }
    public void setDatabaseId(Integer databaseId) {
        this.databaseId = databaseId;
    }

    public String getDetailsUrl() {
        return detailsUrl;
    }
    public void setDetailsUrl(String detailsUrl) {
        this.detailsUrl = detailsUrl;
    }

    public String getExternalId() {
        return externalId;
    }
    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getPermalink() {
        return permalink;
    }
    public void setPermalink(String permalink) {
        this.permalink = permalink;
    }

    public RepositoryGQO getRepository() {
        return repository;
    }
    public void setRepository(RepositoryGQO repository) {
        this.repository = repository;
    }

    public String getResourcePath() {
        return resourcePath;
    }
    public void setResourcePath(String resourcePath) {
        this.resourcePath = resourcePath;
    }

    public java.util.Date getStartedAt() {
        return startedAt;
    }
    public void setStartedAt(java.util.Date startedAt) {
        this.startedAt = startedAt;
    }

    public CheckStatusStateGQO getStatus() {
        return status;
    }
    public void setStatus(CheckStatusStateGQO status) {
        this.status = status;
    }

    public String getSummary() {
        return summary;
    }
    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }

}