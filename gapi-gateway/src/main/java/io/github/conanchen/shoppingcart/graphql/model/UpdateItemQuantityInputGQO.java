package io.github.conanchen.shoppingcart.graphql.model;

public class UpdateItemQuantityInputGQO {

    @javax.validation.constraints.NotNull
    private String cartId;
    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private Integer by;

    public UpdateItemQuantityInputGQO() {
    }

    public UpdateItemQuantityInputGQO(String cartId, String id, Integer by) {
        this.cartId = cartId;
        this.id = id;
        this.by = by;
    }

    public String getCartId() {
        return cartId;
    }
    public void setCartId(String cartId) {
        this.cartId = cartId;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public Integer getBy() {
        return by;
    }
    public void setBy(Integer by) {
        this.by = by;
    }

}