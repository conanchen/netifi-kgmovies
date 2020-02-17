package io.github.conanchen.shoppingdoor.graphql.model;

import io.github.conanchen.personorg.graphql.model.PartyGQO;
import io.github.conanchen.zommon.graphql.model.NodeGQO;
import io.github.conanchen.zommon.graphql.model.ThingGQO;

public class OfferGQO implements ThingGQO, OrderableThingGQO, NodeGQO{

    private Boolean isOrderable;
    private String name;
    private String alternateName;
    private String description;
    private ProductGQO itemOffered;
    private PartyGQO offeredBy;
    private Integer price;
    @javax.validation.constraints.NotNull
    private String id;

    public OfferGQO() {
    }

    public OfferGQO(Boolean isOrderable, String name, String alternateName, String description, ProductGQO itemOffered, PartyGQO offeredBy, Integer price, String id) {
        this.isOrderable = isOrderable;
        this.name = name;
        this.alternateName = alternateName;
        this.description = description;
        this.itemOffered = itemOffered;
        this.offeredBy = offeredBy;
        this.price = price;
        this.id = id;
    }

    public Boolean getIsOrderable() {
        return isOrderable;
    }
    public void setIsOrderable(Boolean isOrderable) {
        this.isOrderable = isOrderable;
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

    public ProductGQO getItemOffered() {
        return itemOffered;
    }
    public void setItemOffered(ProductGQO itemOffered) {
        this.itemOffered = itemOffered;
    }

    public PartyGQO getOfferedBy() {
        return offeredBy;
    }
    public void setOfferedBy(PartyGQO offeredBy) {
        this.offeredBy = offeredBy;
    }

    public Integer getPrice() {
        return price;
    }
    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

}