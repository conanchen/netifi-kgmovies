package io.github.conanchen.shoppingdoor.graphql.model;

import java.util.Collection;
import io.github.conanchen.intangible.graphql.model.ReviewGQO;
import io.github.conanchen.personorg.graphql.model.OrganizationGQO;
import io.github.conanchen.zommon.graphql.model.NodeGQO;
import io.github.conanchen.zommon.graphql.model.ThingGQO;

public class ProductModelGQO implements ThingGQO, OrderableThingGQO, NodeGQO{

    private ProductModelGQO isVariantOf;
    private ProductModelGQO predecessorOf;
    private ProductModelGQO successorOf;
    private Boolean isOrderable;
    private String name;
    private String alternateName;
    private String description;
    private String productID;
    private Collection<ProductGQO> isRelatedTo;
    private Collection<ProductGQO> isSimilarTo;
    private OrganizationGQO manufacturer;
    private AggregateOfferGQO offers;
    private Collection<DemandGQO> demands;
    private Collection<ReviewGQO> review;
    @javax.validation.constraints.NotNull
    private String id;

    public ProductModelGQO() {
    }

    public ProductModelGQO(ProductModelGQO isVariantOf, ProductModelGQO predecessorOf, ProductModelGQO successorOf, Boolean isOrderable, String name, String alternateName, String description, String productID, Collection<ProductGQO> isRelatedTo, Collection<ProductGQO> isSimilarTo, OrganizationGQO manufacturer, AggregateOfferGQO offers, Collection<DemandGQO> demands, Collection<ReviewGQO> review, String id) {
        this.isVariantOf = isVariantOf;
        this.predecessorOf = predecessorOf;
        this.successorOf = successorOf;
        this.isOrderable = isOrderable;
        this.name = name;
        this.alternateName = alternateName;
        this.description = description;
        this.productID = productID;
        this.isRelatedTo = isRelatedTo;
        this.isSimilarTo = isSimilarTo;
        this.manufacturer = manufacturer;
        this.offers = offers;
        this.demands = demands;
        this.review = review;
        this.id = id;
    }

    public ProductModelGQO getIsVariantOf() {
        return isVariantOf;
    }
    public void setIsVariantOf(ProductModelGQO isVariantOf) {
        this.isVariantOf = isVariantOf;
    }

    public ProductModelGQO getPredecessorOf() {
        return predecessorOf;
    }
    public void setPredecessorOf(ProductModelGQO predecessorOf) {
        this.predecessorOf = predecessorOf;
    }

    public ProductModelGQO getSuccessorOf() {
        return successorOf;
    }
    public void setSuccessorOf(ProductModelGQO successorOf) {
        this.successorOf = successorOf;
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

    public String getProductID() {
        return productID;
    }
    public void setProductID(String productID) {
        this.productID = productID;
    }

    public Collection<ProductGQO> getIsRelatedTo() {
        return isRelatedTo;
    }
    public void setIsRelatedTo(Collection<ProductGQO> isRelatedTo) {
        this.isRelatedTo = isRelatedTo;
    }

    public Collection<ProductGQO> getIsSimilarTo() {
        return isSimilarTo;
    }
    public void setIsSimilarTo(Collection<ProductGQO> isSimilarTo) {
        this.isSimilarTo = isSimilarTo;
    }

    public OrganizationGQO getManufacturer() {
        return manufacturer;
    }
    public void setManufacturer(OrganizationGQO manufacturer) {
        this.manufacturer = manufacturer;
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