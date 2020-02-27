package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class ContentAttachmentGQO {

    @javax.validation.constraints.NotNull
    private String body;
    @javax.validation.constraints.NotNull
    private ContentReferenceGQO contentReference;
    @javax.validation.constraints.NotNull
    private Integer databaseId;
    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private String title;

    public ContentAttachmentGQO() {
    }

    public ContentAttachmentGQO(String body, ContentReferenceGQO contentReference, Integer databaseId, String id, String title) {
        this.body = body;
        this.contentReference = contentReference;
        this.databaseId = databaseId;
        this.id = id;
        this.title = title;
    }

    public String getBody() {
        return body;
    }
    public void setBody(String body) {
        this.body = body;
    }

    public ContentReferenceGQO getContentReference() {
        return contentReference;
    }
    public void setContentReference(ContentReferenceGQO contentReference) {
        this.contentReference = contentReference;
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

}