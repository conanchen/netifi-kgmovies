package io.github.conanchen.organization.graphql.model;

public class OwnershipGQO {

    private PartyGQO acquiredFrom;
    private java.util.Date ownedFrom;
    private java.util.Date ownedThrough;
    private OwnableGQO owned;
    private PartyGQO owner;

    public OwnershipGQO() {
    }

    public OwnershipGQO(PartyGQO acquiredFrom, java.util.Date ownedFrom, java.util.Date ownedThrough, OwnableGQO owned, PartyGQO owner) {
        this.acquiredFrom = acquiredFrom;
        this.ownedFrom = ownedFrom;
        this.ownedThrough = ownedThrough;
        this.owned = owned;
        this.owner = owner;
    }

    public PartyGQO getAcquiredFrom() {
        return acquiredFrom;
    }
    public void setAcquiredFrom(PartyGQO acquiredFrom) {
        this.acquiredFrom = acquiredFrom;
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

    public OwnableGQO getOwned() {
        return owned;
    }
    public void setOwned(OwnableGQO owned) {
        this.owned = owned;
    }

    public PartyGQO getOwner() {
        return owner;
    }
    public void setOwner(PartyGQO owner) {
        this.owner = owner;
    }

}