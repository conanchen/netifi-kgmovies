package io.github.conanchen.gobject.graphql.model;

import java.util.*;
import io.github.conanchen.gobject.graphql.api.*;
import io.github.conanchen.personorg.graphql.model.PersonGQO;
import io.github.conanchen.zommon.graphql.model.NodeGQO;

public class GxcelObjectGQO implements GObjectGQO, NodeGQO {

    @javax.validation.constraints.NotNull
    private String name;
    private PersonGQO creator;
    private java.util.Date dateCreated;
    private java.util.Date dateModified;
    private Collection<GxsheetGQO> sheets;
    @javax.validation.constraints.NotNull
    private String id;

    public GxcelObjectGQO() {
    }

    public GxcelObjectGQO(String name, PersonGQO creator, java.util.Date dateCreated, java.util.Date dateModified, Collection<GxsheetGQO> sheets, String id) {
        this.name = name;
        this.creator = creator;
        this.dateCreated = dateCreated;
        this.dateModified = dateModified;
        this.sheets = sheets;
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

    public Collection<GxsheetGQO> getSheets() {
        return sheets;
    }
    public void setSheets(Collection<GxsheetGQO> sheets) {
        this.sheets = sheets;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

}