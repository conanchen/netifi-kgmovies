package io.github.conanchen.gobject.graphql.model;

import java.util.*;
import io.github.conanchen.gobject.graphql.api.*;
import io.github.conanchen.personorg.graphql.model.PersonGQO;
import io.github.conanchen.zommon.graphql.model.NodeGQO;

public class GxcellGQO implements NodeGQO {

    private Integer rowNo;
    private Integer colNo;
    private String value;
    private String formula;
    private PersonGQO editingBy;
    private java.util.Date editingStarted;
    private PersonGQO creator;
    private java.util.Date dateCreated;
    private java.util.Date dateModified;
    @javax.validation.constraints.NotNull
    private String id;

    public GxcellGQO() {
    }

    public GxcellGQO(Integer rowNo, Integer colNo, String value, String formula, PersonGQO editingBy, java.util.Date editingStarted, PersonGQO creator, java.util.Date dateCreated, java.util.Date dateModified, String id) {
        this.rowNo = rowNo;
        this.colNo = colNo;
        this.value = value;
        this.formula = formula;
        this.editingBy = editingBy;
        this.editingStarted = editingStarted;
        this.creator = creator;
        this.dateCreated = dateCreated;
        this.dateModified = dateModified;
        this.id = id;
    }

    public Integer getRowNo() {
        return rowNo;
    }
    public void setRowNo(Integer rowNo) {
        this.rowNo = rowNo;
    }

    public Integer getColNo() {
        return colNo;
    }
    public void setColNo(Integer colNo) {
        this.colNo = colNo;
    }

    public String getValue() {
        return value;
    }
    public void setValue(String value) {
        this.value = value;
    }

    public String getFormula() {
        return formula;
    }
    public void setFormula(String formula) {
        this.formula = formula;
    }

    public PersonGQO getEditingBy() {
        return editingBy;
    }
    public void setEditingBy(PersonGQO editingBy) {
        this.editingBy = editingBy;
    }

    public java.util.Date getEditingStarted() {
        return editingStarted;
    }
    public void setEditingStarted(java.util.Date editingStarted) {
        this.editingStarted = editingStarted;
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

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

}