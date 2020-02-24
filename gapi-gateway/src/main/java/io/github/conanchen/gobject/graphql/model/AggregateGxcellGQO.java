package io.github.conanchen.gobject.graphql.model;

import java.util.*;
import io.github.conanchen.gobject.graphql.api.*;
import io.github.conanchen.zommon.graphql.model.NodeGQO;

public class AggregateGxcellGQO implements NodeGQO {

    private String name;
    private Collection<GxcellGQO> cells;
    private Collection<GxcellGQO> subtotalCells;
    @javax.validation.constraints.NotNull
    private String id;

    public AggregateGxcellGQO() {
    }

    public AggregateGxcellGQO(String name, Collection<GxcellGQO> cells, Collection<GxcellGQO> subtotalCells, String id) {
        this.name = name;
        this.cells = cells;
        this.subtotalCells = subtotalCells;
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Collection<GxcellGQO> getCells() {
        return cells;
    }
    public void setCells(Collection<GxcellGQO> cells) {
        this.cells = cells;
    }

    public Collection<GxcellGQO> getSubtotalCells() {
        return subtotalCells;
    }
    public void setSubtotalCells(Collection<GxcellGQO> subtotalCells) {
        this.subtotalCells = subtotalCells;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

}