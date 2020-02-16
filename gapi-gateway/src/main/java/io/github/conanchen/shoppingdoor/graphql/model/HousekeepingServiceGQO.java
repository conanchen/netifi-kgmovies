package io.github.conanchen.shoppingdoor.graphql.model;

import java.util.Collection;
import io.github.conanchen.intangible.graphql.model.AggregateRatingGQO;
import io.github.conanchen.intangible.graphql.model.ReviewGQO;
import io.github.conanchen.message.graphql.model.ActionGQO;
import io.github.conanchen.zommon.graphql.model.NodeGQO;
import io.github.conanchen.zommon.graphql.model.PlaceGQO;
import io.github.conanchen.zommon.graphql.model.ThingGQO;

public class HousekeepingServiceGQO implements ThingGQO, OrderableThingGQO, ServiceGQO, NodeGQO{

    private Boolean isOrderable;
    private String name;
    private String alternateName;
    private String description;
    private AggregateRatingGQO aggregateRating;
    private PlaceGQO areaServed;
    private OpeningHoursSpecificationGQO hoursAvailable;
    private ProductGQO isRelatedTo;
    private ServiceGQO isSimilarTo;
    private Collection<ActionGQO> potentialAction;
    private Collection<ItemCategoryGQO> itemCategory;
    private Collection<OfferGQO> offers;
    private Collection<DemandGQO> demands;
    private Collection<ReviewGQO> review;
    @javax.validation.constraints.NotNull
    private String id;

    public HousekeepingServiceGQO() {
    }

    public HousekeepingServiceGQO(Boolean isOrderable, String name, String alternateName, String description, AggregateRatingGQO aggregateRating, PlaceGQO areaServed, OpeningHoursSpecificationGQO hoursAvailable, ProductGQO isRelatedTo, ServiceGQO isSimilarTo, Collection<ActionGQO> potentialAction, Collection<ItemCategoryGQO> itemCategory, Collection<OfferGQO> offers, Collection<DemandGQO> demands, Collection<ReviewGQO> review, String id) {
        this.isOrderable = isOrderable;
        this.name = name;
        this.alternateName = alternateName;
        this.description = description;
        this.aggregateRating = aggregateRating;
        this.areaServed = areaServed;
        this.hoursAvailable = hoursAvailable;
        this.isRelatedTo = isRelatedTo;
        this.isSimilarTo = isSimilarTo;
        this.potentialAction = potentialAction;
        this.itemCategory = itemCategory;
        this.offers = offers;
        this.demands = demands;
        this.review = review;
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

    public AggregateRatingGQO getAggregateRating() {
        return aggregateRating;
    }
    public void setAggregateRating(AggregateRatingGQO aggregateRating) {
        this.aggregateRating = aggregateRating;
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

    public Collection<OfferGQO> getOffers() {
        return offers;
    }
    public void setOffers(Collection<OfferGQO> offers) {
        this.offers = offers;
    }

    public Collection<DemandGQO> getDemands() {
        return demands;
    }
    public void setDemands(Collection<DemandGQO> demands) {
        this.demands = demands;
    }

    public Collection<ReviewGQO> getReview() {
        return review;
    }
    public void setReview(Collection<ReviewGQO> review) {
        this.review = review;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

}