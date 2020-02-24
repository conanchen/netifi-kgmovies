package io.github.conanchen.gobject.graphql.model;

import io.github.conanchen.personorg.graphql.model.PersonGQO;
import io.github.conanchen.zommon.graphql.model.NodeGQO;

public class GeneralObjectGQO implements GObjectGQO, NodeGQO {

    @javax.validation.constraints.NotNull
    private String name;
    private PersonGQO creator;
    private java.util.Date dateCreated;
    private java.util.Date dateModified;
    private Integer contentSize;
    private java.lang.String contentUrl;
    @javax.validation.constraints.NotNull
    private String id;

    public GeneralObjectGQO() {
    }

    public GeneralObjectGQO(String name, PersonGQO creator, java.util.Date dateCreated, java.util.Date dateModified, Integer contentSize, java.lang.String contentUrl, String id) {
        this.name = name;
        this.creator = creator;
        this.dateCreated = dateCreated;
        this.dateModified = dateModified;
        this.contentSize = contentSize;
        this.contentUrl = contentUrl;
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public PersonGQO getCreator() {
        return creator;
    }
    public void setCreator(PersonGQO creator) {
        this.creator = creator;
    }

    public java.util.Date getDateCreated() {
        return dateCreated;
    }
    public void setDateCreated(java.util.Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public java.util.Date getDateModified() {
        return dateModified;
    }
    public void setDateModified(java.util.Date dateModified) {
        this.dateModified = dateModified;
    }

    public Integer getContentSize() {
        return contentSize;
    }
    public void setContentSize(Integer contentSize) {
        this.contentSize = contentSize;
    }

    public java.lang.String getContentUrl() {
        return contentUrl;
    }
    public void setContentUrl(java.lang.String contentUrl) {
        this.contentUrl = contentUrl;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

}