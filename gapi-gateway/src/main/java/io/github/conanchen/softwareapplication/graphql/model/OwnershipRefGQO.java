package io.github.conanchen.softwareapplication.graphql.model;

public class OwnershipRefGQO {

    private String id;
    private String identifier;
    private String name;
    private String alternateName;
    private String description;
    private java.util.Date ownedFrom;
    private java.util.Date ownedThrough;
    private ThingRefGQO owned;

    public OwnershipRefGQO() {
    }

    public OwnershipRefGQO(String id, String identifier, String name, String alternateName, String description, java.util.Date ownedFrom, java.util.Date ownedThrough, ThingRefGQO owned) {
        this.id = id;
        this.identifier = identifier;
        this.name = name;
        this.alternateName = alternateName;
        this.description = description;
        this.ownedFrom = ownedFrom;
        this.ownedThrough = ownedThrough;
        this.owned = owned;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getIdentifier() {
        return identifier;
    }
    public void setIdentifier(String identifier) {
        this.identifier = identifier;
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

    public java.util.Date getOwnedFrom() {
        return ownedFrom;
    }
    public void setOwnedFrom(java.util.Date ownedFrom) {
        this.ownedFrom = ownedFrom;
    }

    public java.util.Date getOwnedThrough() {
        return ownedThrough;
    }
    public void setOwnedThrough(java.util.Date ownedThrough) {
        this.ownedThrough = ownedThrough;
    }

    public ThingRefGQO getOwned() {
        return owned;
    }
    public void setOwned(ThingRefGQO owned) {
        this.owned = owned;
    }

}