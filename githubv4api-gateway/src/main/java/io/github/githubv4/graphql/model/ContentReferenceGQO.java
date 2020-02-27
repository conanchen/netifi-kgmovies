package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class ContentReferenceGQO {

    @javax.validation.constraints.NotNull
    private Integer databaseId;
    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private String reference;

    public ContentReferenceGQO() {
    }

    public ContentReferenceGQO(Integer databaseId, String id, String reference) {
        this.databaseId = databaseId;
        this.id = id;
        this.reference = reference;
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

    public String getReference() {
        return reference;
    }
    public void setReference(String reference) {
        this.reference = reference;
    }

}