package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class RepositoryTopicGQO implements NodeGQO, UniformResourceLocatableGQO{

    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private String resourcePath;
    @javax.validation.constraints.NotNull
    private TopicGQO topic;
    @javax.validation.constraints.NotNull
    private String url;

    public RepositoryTopicGQO() {
    }

    public RepositoryTopicGQO(String id, String resourcePath, TopicGQO topic, String url) {
        this.id = id;
        this.resourcePath = resourcePath;
        this.topic = topic;
        this.url = url;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getResourcePath() {
        return resourcePath;
    }
    public void setResourcePath(String resourcePath) {
        this.resourcePath = resourcePath;
    }

    public TopicGQO getTopic() {
        return topic;
    }
    public void setTopic(TopicGQO topic) {
        this.topic = topic;
    }

    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }

}