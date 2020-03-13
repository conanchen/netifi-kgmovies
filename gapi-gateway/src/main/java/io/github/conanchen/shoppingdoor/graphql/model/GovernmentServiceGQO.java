package io.github.conanchen.shoppingdoor.graphql.model;

import io.github.conanchen.action.graphql.model.ActionGQO;
import io.github.conanchen.message.graphql.model.AggregateReviewGQO;
import io.github.conanchen.organization.graphql.model.OrganizationGQO;
import io.github.conanchen.place.graphql.model.PlaceGQO;
import io.github.conanchen.zommon.graphql.model.NodeGQO;
import io.github.conanchen.zommon.graphql.model.ThingGQO;

import java.util.Collection;

public class GovernmentServiceGQO implements ThingGQO, ServiceGQO, NodeGQO{

    private OrganizationGQO serviceOperator;
    private String name;
    private String alternateName;
    private String description;
    private AggregateReviewGQO aggregateReview;
    private PlaceGQO areaServed;
    private OpeningHoursSpecificationGQO hoursAvailable;
    private ProductGQO isRelatedTo;
    private ServiceGQO isSimilarTo;
    private Collection<ActionGQO> potentialAction;
    private Collection<ItemCategoryGQO> itemCategory;
    private AggregateOfferGQO offers;
    private Collection<DemandGQO> demands;
    @javax.validation.constraints.NotNull
    private String id;

    public GovernmentServiceGQO() {
    }

    public GovernmentServiceGQO(OrganizationGQO serviceOperator, String name, String alternateName, String description, AggregateReviewGQO aggregateReview, PlaceGQO areaServed, OpeningHoursSpecificationGQO hoursAvailable, ProductGQO isRelatedTo, ServiceGQO isSimilarTo, Collection<ActionGQO> potentialAction, Collection<ItemCategoryGQO> itemCategory, AggregateOfferGQO offers, Collection<DemandGQO> demands, String id) {
        this.serviceOperator = serviceOperator;
        this.name = name;
        this.alternateName = alternateName;
        this.description = description;
        this.aggregateReview = aggregateReview;
        this.areaServed = areaServed;
        this.hoursAvailable = hoursAvailable;
        this.isRelatedTo = isRelatedTo;
        this.isSimilarTo = isSimilarTo;
        this.potentialAction = potentialAction;
        this.itemCategory = itemCategory;
        this.offers = offers;
        this.demands = demands;
        this.id = id;
    }

    public OrganizationGQO getServiceOperator() {
        return serviceOperator;
    }
    public void setServiceOperator(OrganizationGQO serviceOperator) {
        this.serviceOperator = serviceOperator;
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

    public AggregateReviewGQO getAggregateReview() {
        return aggregateReview;
    }
    public void setAggregateReview(AggregateReviewGQO aggregateReview) {
        this.aggregateReview = aggregateReview;
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

    public AggregateOfferGQO getOffers() {
        return offers;
    }
    public void setOffers(AggregateOfferGQO offers) {
        this.offers = offers;
    }

    public Collection<DemandGQO> getDemands() {
        return demands;
    }
    public void setDemands(Collection<DemandGQO> demands) {
        this.demands = demands;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

}