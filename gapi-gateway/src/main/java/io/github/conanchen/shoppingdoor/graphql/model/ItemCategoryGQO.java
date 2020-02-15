package io.github.conanchen.shoppingdoor.graphql.model;

import io.github.conanchen.zommon.graphql.model.NodeGQO;

public class ItemCategoryGQO implements NodeGQO{

    @javax.validation.constraints.NotNull
    private String itcgID;
    private String name;
    private String alternateName;
    private String description;
    private Integer orderQty;
    @javax.validation.constraints.NotNull
    private String id;

    public ItemCategoryGQO() {
    }

    public ItemCategoryGQO(String itcgID, String name, String alternateName, String description, Integer orderQty, String id) {
        this.itcgID = itcgID;
        this.name = name;
        this.alternateName = alternateName;
        this.description = description;
        this.orderQty = orderQty;
        this.id = id;
    }

    public String getItcgID() {
        return itcgID;
    }
    public void setItcgID(String itcgID) {
        this.itcgID = itcgID;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getAlternateName() {
        return alternateName;
    }
    public void setAlternateName(String alternateName) {
        this.alternateName = alternateName;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getOrderQty() {
        return orderQty;
    }
    public void setOrderQty(Integer orderQty) {
        this.orderQty = orderQty;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

}