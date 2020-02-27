package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class SavedReplyGQO implements NodeGQO{

    @javax.validation.constraints.NotNull
    private String body;
    @javax.validation.constraints.NotNull
    private String bodyHTML;
    private Integer databaseId;
    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private String title;
    private ActorGQO user;

    public SavedReplyGQO() {
    }

    public SavedReplyGQO(String body, String bodyHTML, Integer databaseId, String id, String title, ActorGQO user) {
        this.body = body;
        this.bodyHTML = bodyHTML;
        this.databaseId = databaseId;
        this.id = id;
        this.title = title;
        this.user = user;
    }

    public String getBody() {
        return body;
    }
    public void setBody(String body) {
        this.body = body;
    }

    public String getBodyHTML() {
        return bodyHTML;
    }
    public void setBodyHTML(String bodyHTML) {
        this.bodyHTML = bodyHTML;
    }

    public Integer getDatabaseId() {
        return databaseId;
    }
    public void setDatabaseId(Integer databaseId) {
        this.databaseId = databaseId;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public ActorGQO getUser() {
        return user;
    }
    public void setUser(ActorGQO user) {
        this.user = user;
    }

}