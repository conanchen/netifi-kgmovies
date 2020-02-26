package io.github.conanchen.gobject.graphql.model;

import io.github.conanchen.person.graphql.model.PersonGQO;
import io.github.conanchen.zommon.graphql.model.NodeGQO;
import io.github.conanchen.zommon.graphql.model.ThingGQO;

public class GxcellGQO implements NodeGQO{

    private Integer rowNo;
    private Integer colNo;
    private String value;
    private ThingGQO valueFrom;
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

    public GxcellGQO(Integer rowNo, Integer colNo, String value, ThingGQO valueFrom, String formula, PersonGQO editingBy, java.util.Date editingStarted, PersonGQO creator, java.util.Date dateCreated, java.util.Date dateModified, String id) {
        this.rowNo = rowNo;
        this.colNo = colNo;
        this.value = value;
        this.valueFrom = valueFrom;
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

    public ThingGQO getValueFrom() {
        return valueFrom;
    }
    public void setValueFrom(ThingGQO valueFrom) {
        this.valueFrom = valueFrom;
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