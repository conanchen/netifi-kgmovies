package io.github.conanchen.gobject.graphql.model;

import io.github.conanchen.person.graphql.model.PersonGQO;
import io.github.conanchen.zommon.graphql.model.NodeGQO;

import java.util.Collection;

public class GxsheetGQO implements NodeGQO {

    private String name;
    private Collection<GxcolumnDefGQO> columndefs;
    private Collection<AggregateGxcellGQO> aggregateCells;
    private PersonGQO creator;
    private java.util.Date dateCreated;
    private java.util.Date dateModified;
    private Collection<GxmergedcellGQO> mergedCells;
    @javax.validation.constraints.NotNull
    private String id;

    public GxsheetGQO() {
    }

    public GxsheetGQO(String name, Collection<GxcolumnDefGQO> columndefs, Collection<AggregateGxcellGQO> aggregateCells, PersonGQO creator, java.util.Date dateCreated, java.util.Date dateModified, Collection<GxmergedcellGQO> mergedCells, String id) {
        this.name = name;
        this.columndefs = columndefs;
        this.aggregateCells = aggregateCells;
        this.creator = creator;
        this.dateCreated = dateCreated;
        this.dateModified = dateModified;
        this.mergedCells = mergedCells;
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Collection<GxcolumnDefGQO> getColumndefs() {
        return columndefs;
    }
    public void setColumndefs(Collection<GxcolumnDefGQO> columndefs) {
        this.columndefs = columndefs;
    }

    public Collection<AggregateGxcellGQO> getAggregateCells() {
        return aggregateCells;
    }
    public void setAggregateCells(Collection<AggregateGxcellGQO> aggregateCells) {
        this.aggregateCells = aggregateCells;
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

    public Collection<GxmergedcellGQO> getMergedCells() {
        return mergedCells;
    }
    public void setMergedCells(Collection<GxmergedcellGQO> mergedCells) {
        this.mergedCells = mergedCells;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

}