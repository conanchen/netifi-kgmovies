package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class TopicGQO implements NodeGQO, StarrableGQO{

    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private String name;
    @javax.validation.constraints.NotNull
    private Collection<TopicGQO> relatedTopics;
    @javax.validation.constraints.NotNull
    private StargazerConnectionGQO stargazers;
    @javax.validation.constraints.NotNull
    private Boolean viewerHasStarred;

    public TopicGQO() {
    }

    public TopicGQO(String id, String name, Collection<TopicGQO> relatedTopics, StargazerConnectionGQO stargazers, Boolean viewerHasStarred) {
        this.id = id;
        this.name = name;
        this.relatedTopics = relatedTopics;
        this.stargazers = stargazers;
        this.viewerHasStarred = viewerHasStarred;
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

    public Collection<TopicGQO> getRelatedTopics() {
        return relatedTopics;
    }
    public void setRelatedTopics(Collection<TopicGQO> relatedTopics) {
        this.relatedTopics = relatedTopics;
    }

    public StargazerConnectionGQO getStargazers() {
        return stargazers;
    }
    public void setStargazers(StargazerConnectionGQO stargazers) {
        this.stargazers = stargazers;
    }

    public Boolean getViewerHasStarred() {
        return viewerHasStarred;
    }
    public void setViewerHasStarred(Boolean viewerHasStarred) {
        this.viewerHasStarred = viewerHasStarred;
    }

}