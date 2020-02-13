package io.github.conanchen.shopping.graphql.model;

import java.util.Collection;
import io.github.conanchen.message.graphql.model.OrganizationGQO;
import io.github.conanchen.zommon.graphql.model.NodeGQO;

public class ProductGQO implements OrderableThingGQO, NodeGQO{

    private Boolean isOrderable;
    private String name;
    private String productID;
    private Collection<ProductGQO> isRelatedTo;
    private Collection<ProductGQO> isSimilarTo;
    private OrganizationGQO manufacturer;
    private Collection<ItemCategoryGQO> itemCategory;
    @javax.validation.constraints.NotNull
    private String id;

    public ProductGQO() {
    }

    public ProductGQO(Boolean isOrderable, String name, String productID, Collection<ProductGQO> isRelatedTo, Collection<ProductGQO> isSimilarTo, OrganizationGQO manufacturer, Collection<ItemCategoryGQO> itemCategory, String id) {
        this.isOrderable = isOrderable;
        this.name = name;
        this.productID = productID;
        this.isRelatedTo = isRelatedTo;
        this.isSimilarTo = isSimilarTo;
        this.manufacturer = manufacturer;
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

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

}