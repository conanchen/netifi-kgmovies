package io.github.conanchen.shoppingdoor.graphql.model;

import io.github.conanchen.message.graphql.model.AggregateReviewGQO;
import io.github.conanchen.message.graphql.model.ConversationGQO;
import io.github.conanchen.organization.graphql.model.OrganizationGQO;
import io.github.conanchen.zommon.graphql.model.ConversationalThingGQO;
import io.github.conanchen.zommon.graphql.model.NodeGQO;
import io.github.conanchen.zommon.graphql.model.ThingGQO;

import java.util.Collection;

public class GeneralProductGQO implements ThingGQO, ProductGQO, ShoppingableGQO, ConversationalThingGQO, NodeGQO {

    private Boolean isShoppingable;
    private String name;
    private String alternateName;
    private String description;
    private String productID;
    private Collection<ProductGQO> isRelatedTo;
    private Collection<ProductGQO> isSimilarTo;
    private OrganizationGQO manufacturer;
    private Collection<ItemCategoryGQO> itemCategory;
    private Collection<ProductModelGQO> models;
    private AggregateOfferGQO offers;
    private Collection<DemandGQO> demands;
    private AggregateReviewGQO aggregateReview;
    private Collection<ConversationGQO> availableConversations;
    private ConversationGQO defaultConversation;
    @javax.validation.constraints.NotNull
    private String id;

    public GeneralProductGQO() {
    }

    public GeneralProductGQO(Boolean isShoppingable, String name, String alternateName, String description, String productID, Collection<ProductGQO> isRelatedTo, Collection<ProductGQO> isSimilarTo, OrganizationGQO manufacturer, Collection<ItemCategoryGQO> itemCategory, Collection<ProductModelGQO> models, AggregateOfferGQO offers, Collection<DemandGQO> demands, AggregateReviewGQO aggregateReview, Collection<ConversationGQO> availableConversations, ConversationGQO defaultConversation, String id) {
        this.isShoppingable = isShoppingable;
        this.name = name;
        this.alternateName = alternateName;
        this.description = description;
        this.productID = productID;
        this.isRelatedTo = isRelatedTo;
        this.isSimilarTo = isSimilarTo;
        this.manufacturer = manufacturer;
        this.itemCategory = itemCategory;
        this.models = models;
        this.offers = offers;
        this.demands = demands;
        this.aggregateReview = aggregateReview;
        this.availableConversations = availableConversations;
        this.defaultConversation = defaultConversation;
        this.id = id;
    }

    public Boolean getIsShoppingable() {
        return isShoppingable;
    }
    public void setIsShoppingable(Boolean isShoppingable) {
        this.isShoppingable = isShoppingable;
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

    public Collection<ItemCategoryGQO> getItemCategory() {
        return itemCategory;
    }
    public void setItemCategory(Collection<ItemCategoryGQO> itemCategory) {
        this.itemCategory = itemCategory;
    }

    public Collection<ProductModelGQO> getModels() {
        return models;
    }
    public void setModels(Collection<ProductModelGQO> models) {
        this.models = models;
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

    public AggregateReviewGQO getAggregateReview() {
        return aggregateReview;
    }
    public void setAggregateReview(AggregateReviewGQO aggregateReview) {
        this.aggregateReview = aggregateReview;
    }

    public Collection<ConversationGQO> getAvailableConversations() {
        return availableConversations;
    }
    public void setAvailableConversations(Collection<ConversationGQO> availableConversations) {
        this.availableConversations = availableConversations;
    }

    public ConversationGQO getDefaultConversation() {
        return defaultConversation;
    }
    public void setDefaultConversation(ConversationGQO defaultConversation) {
        this.defaultConversation = defaultConversation;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

}