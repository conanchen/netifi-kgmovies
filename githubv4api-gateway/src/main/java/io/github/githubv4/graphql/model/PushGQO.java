package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class PushGQO implements NodeGQO{

    @javax.validation.constraints.NotNull
    private String id;
    private String nextSha;
    @javax.validation.constraints.NotNull
    private String permalink;
    private String previousSha;
    @javax.validation.constraints.NotNull
    private UserGQO pusher;
    @javax.validation.constraints.NotNull
    private RepositoryGQO repository;

    public PushGQO() {
    }

    public PushGQO(String id, String nextSha, String permalink, String previousSha, UserGQO pusher, RepositoryGQO repository) {
        this.id = id;
        this.nextSha = nextSha;
        this.permalink = permalink;
        this.previousSha = previousSha;
        this.pusher = pusher;
        this.repository = repository;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getNextSha() {
        return nextSha;
    }
    public void setNextSha(String nextSha) {
        this.nextSha = nextSha;
    }

    public String getPermalink() {
        return permalink;
    }
    public void setPermalink(String permalink) {
        this.permalink = permalink;
    }

    public String getPreviousSha() {
        return previousSha;
    }
    public void setPreviousSha(String previousSha) {
        this.previousSha = previousSha;
    }

    public UserGQO getPusher() {
        return pusher;
    }
    public void setPusher(UserGQO pusher) {
        this.pusher = pusher;
    }

    public RepositoryGQO getRepository() {
        return repository;
    }
    public void setRepository(RepositoryGQO repository) {
        this.repository = repository;
    }

}