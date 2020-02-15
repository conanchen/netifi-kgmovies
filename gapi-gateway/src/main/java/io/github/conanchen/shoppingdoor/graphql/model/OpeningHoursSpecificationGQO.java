package io.github.conanchen.shoppingdoor.graphql.model;

import io.github.conanchen.zommon.graphql.model.NodeGQO;

public class OpeningHoursSpecificationGQO implements NodeGQO{

    private String name;
    private String alternateName;
    private String description;
    private java.util.Date closes;
    private java.util.Date opens;
    private java.util.Date validFrom;
    private java.util.Date validThrough;
    @javax.validation.constraints.NotNull
    private String id;

    public OpeningHoursSpecificationGQO() {
    }

    public OpeningHoursSpecificationGQO(String name, String alternateName, String description, java.util.Date closes, java.util.Date opens, java.util.Date validFrom, java.util.Date validThrough, String id) {
        this.name = name;
        this.alternateName = alternateName;
        this.description = description;
        this.closes = closes;
        this.opens = opens;
        this.validFrom = validFrom;
        this.validThrough = validThrough;
        this.id = id;
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

    public java.util.Date getCloses() {
        return closes;
    }
    public void setCloses(java.util.Date closes) {
        this.closes = closes;
    }

    public java.util.Date getOpens() {
        return opens;
    }
    public void setOpens(java.util.Date opens) {
        this.opens = opens;
    }

    public java.util.Date getValidFrom() {
        return validFrom;
    }
    public void setValidFrom(java.util.Date validFrom) {
        this.validFrom = validFrom;
    }

    public java.util.Date getValidThrough() {
        return validThrough;
    }
    public void setValidThrough(java.util.Date validThrough) {
        this.validThrough = validThrough;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

}