package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class GistGQO implements PinnableItemGQO, NodeGQO, StarrableGQO, UniformResourceLocatableGQO{

    @javax.validation.constraints.NotNull
    private GistCommentConnectionGQO comments;
    @javax.validation.constraints.NotNull
    private java.util.Date createdAt;
    private String description;
    private Collection<GistFileGQO> files;
    @javax.validation.constraints.NotNull
    private GistConnectionGQO forks;
    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private Boolean isFork;
    @javax.validation.constraints.NotNull
    private Boolean isPublic;
    @javax.validation.constraints.NotNull
    private String name;
    private RepositoryOwnerGQO owner;
    private java.util.Date pushedAt;
    @javax.validation.constraints.NotNull
    private String resourcePath;
    @javax.validation.constraints.NotNull
    private StargazerConnectionGQO stargazers;
    @javax.validation.constraints.NotNull
    private java.util.Date updatedAt;
    @javax.validation.constraints.NotNull
    private String url;
    @javax.validation.constraints.NotNull
    private Boolean viewerHasStarred;

    public GistGQO() {
    }

    public GistGQO(GistCommentConnectionGQO comments, java.util.Date createdAt, String description, Collection<GistFileGQO> files, GistConnectionGQO forks, String id, Boolean isFork, Boolean isPublic, String name, RepositoryOwnerGQO owner, java.util.Date pushedAt, String resourcePath, StargazerConnectionGQO stargazers, java.util.Date updatedAt, String url, Boolean viewerHasStarred) {
        this.comments = comments;
        this.createdAt = createdAt;
        this.description = description;
        this.files = files;
        this.forks = forks;
        this.id = id;
        this.isFork = isFork;
        this.isPublic = isPublic;
        this.name = name;
        this.owner = owner;
        this.pushedAt = pushedAt;
        this.resourcePath = resourcePath;
        this.stargazers = stargazers;
        this.updatedAt = updatedAt;
        this.url = url;
        this.viewerHasStarred = viewerHasStarred;
    }

    public GistCommentConnectionGQO getComments() {
        return comments;
    }
    public void setComments(GistCommentConnectionGQO comments) {
        this.comments = comments;
    }

    public java.util.Date getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public Collection<GistFileGQO> getFiles() {
        return files;
    }
    public void setFiles(Collection<GistFileGQO> files) {
        this.files = files;
    }

    public GistConnectionGQO getForks() {
        return forks;
    }
    public void setForks(GistConnectionGQO forks) {
        this.forks = forks;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public Boolean getIsFork() {
        return isFork;
    }
    public void setIsFork(Boolean isFork) {
        this.isFork = isFork;
    }

    public Boolean getIsPublic() {
        return isPublic;
    }
    public void setIsPublic(Boolean isPublic) {
        this.isPublic = isPublic;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public RepositoryOwnerGQO getOwner() {
        return owner;
    }
    public void setOwner(RepositoryOwnerGQO owner) {
        this.owner = owner;
    }

    public java.util.Date getPushedAt() {
        return pushedAt;
    }
    public void setPushedAt(java.util.Date pushedAt) {
        this.pushedAt = pushedAt;
    }

    public String getResourcePath() {
        return resourcePath;
    }
    public void setResourcePath(String resourcePath) {
        this.resourcePath = resourcePath;
    }

    public StargazerConnectionGQO getStargazers() {
        return stargazers;
    }
    public void setStargazers(StargazerConnectionGQO stargazers) {
        this.stargazers = stargazers;
    }

    public java.util.Date getUpdatedAt() {
        return updatedAt;
    }
    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }

    public Boolean getViewerHasStarred() {
        return viewerHasStarred;
    }
    public void setViewerHasStarred(Boolean viewerHasStarred) {
        this.viewerHasStarred = viewerHasStarred;
    }

}