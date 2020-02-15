package io.github.conanchen.shoppingcart.graphql.model;

import java.util.Collection;
import io.github.conanchen.zommon.graphql.model.CustomAttributeInputGQO;

public class SetCartItemInputGQO {

    @javax.validation.constraints.NotNull
    private String id;
    private String name;
    private String description;
    private CartItemTypeGQO type;
    private Collection<String> images;
    @javax.validation.constraints.NotNull
    private Integer price;
    private CurrencyInputGQO currency;
    private Integer quantity;
    private Collection<CustomAttributeInputGQO> attributes;

    public SetCartItemInputGQO() {
    }

    public SetCartItemInputGQO(String id, String name, String description, CartItemTypeGQO type, Collection<String> images, Integer price, CurrencyInputGQO currency, Integer quantity, Collection<CustomAttributeInputGQO> attributes) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.type = type;
        this.images = images;
        this.price = price;
        this.currency = currency;
        this.quantity = quantity;
        this.attributes = attributes;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public CartItemTypeGQO getType() {
        return type;
    }
    public void setType(CartItemTypeGQO type) {
        this.type = type;
    }

    public Collection<String> getImages() {
        return images;
    }
    public void setImages(Collection<String> images) {
        this.images = images;
    }

    public Integer getPrice() {
        return price;
    }
    public void setPrice(Integer price) {
        this.price = price;
    }

    public CurrencyInputGQO getCurrency() {
        return currency;
    }
    public void setCurrency(CurrencyInputGQO currency) {
        this.currency = currency;
    }

    public Integer getQuantity() {
        return quantity;
    }
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Collection<CustomAttributeInputGQO> getAttributes() {
        return attributes;
    }
    public void setAttributes(Collection<CustomAttributeInputGQO> attributes) {
        this.attributes = attributes;
    }

}