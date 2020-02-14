package io.github.conanchen.shopping.graphql.model;

import java.util.Collection;
import io.github.conanchen.message.graphql.model.ActionGQO;
import io.github.conanchen.zommon.graphql.model.NodeGQO;
import io.github.conanchen.zommon.graphql.model.PlaceGQO;
import io.github.conanchen.zommon.graphql.model.ThingGQO;

public class GeneralServiceGQO implements ThingGQO, OrderableThingGQO, ServiceGQO, NodeGQO{

    private Boolean isOrderable;
    private String name;
    private String alternateName;
    private String description;
    private PlaceGQO areaServed;
    private OpeningHoursSpecificationGQO hoursAvailable;
    private ProductGQO isRelatedTo;
    private ServiceGQO isSimilarTo;
    private Collection<ActionGQO> potentialAction;
    private Collection<ItemCategoryGQO> itemCategory;
    @javax.validation.constraints.NotNull
    private String id;

    public GeneralServiceGQO() {
    }

    public GeneralServiceGQO(Boolean isOrderable, String name, String alternateName, String description, PlaceGQO areaServed, OpeningHoursSpecificationGQO hoursAvailable, ProductGQO isRelatedTo, ServiceGQO isSimilarTo, Collection<ActionGQO> potentialAction, Collection<ItemCategoryGQO> itemCategory, String id) {
        this.isOrderable = isOrderable;
        this.name = name;
        this.alternateName = alternateName;
        this.description = description;
        this.areaServed = areaServed;
        this.hoursAvailable = hoursAvailable;
        this.isRelatedTo = isRelatedTo;
        this.isSimilarTo = isSimilarTo;
        this.potentialAction = potentialAction;
        this.itemCategory = itemCategory;
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

    public PlaceGQO getAreaServed() {
        return areaServed;
    }
    public void setAreaServed(PlaceGQO areaServed) {
        this.areaServed = areaServed;
    }

    public OpeningHoursSpecificationGQO getHoursAvailable() {
        return hoursAvailable;
    }
    public void setHoursAvailable(OpeningHoursSpecificationGQO hoursAvailable) {
        this.hoursAvailable = hoursAvailable;
    }

    public ProductGQO getIsRelatedTo() {
        return isRelatedTo;
    }
    public void setIsRelatedTo(ProductGQO isRelatedTo) {
        this.isRelatedTo = isRelatedTo;
    }

    public ServiceGQO getIsSimilarTo() {
        return isSimilarTo;
    }
    public void setIsSimilarTo(ServiceGQO isSimilarTo) {
        this.isSimilarTo = isSimilarTo;
    }

    public Collection<ActionGQO> getPotentialAction() {
        return potentialAction;
    }
    public void setPotentialAction(Collection<ActionGQO> potentialAction) {
        this.potentialAction = potentialAction;
    }

    public Collection<ItemCategoryGQO> getItemCategory() {
        return itemCategory;
    }
    public void setItemCategory(Collection<ItemCategoryGQO> itemCategory) {
        this.itemCategory = itemCategory;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

}