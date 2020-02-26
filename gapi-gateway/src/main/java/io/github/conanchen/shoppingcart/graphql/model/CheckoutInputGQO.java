package io.github.conanchen.shoppingcart.graphql.model;

public class CheckoutInputGQO {

    @javax.validation.constraints.NotNull
    private String cartId;
    private String email;
    @javax.validation.constraints.NotNull
    private PostalAddressInputGQO shipping;
    private PostalAddressInputGQO billing;

    public CheckoutInputGQO() {
    }

    public CheckoutInputGQO(String cartId, String email, PostalAddressInputGQO shipping, PostalAddressInputGQO billing) {
        this.cartId = cartId;
        this.email = email;
        this.shipping = shipping;
        this.billing = billing;
    }

    public String getCartId() {
        return cartId;
    }
    public void setCartId(String cartId) {
        this.cartId = cartId;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public PostalAddressInputGQO getShipping() {
        return shipping;
    }
    public void setShipping(PostalAddressInputGQO shipping) {
        this.shipping = shipping;
    }

    public PostalAddressInputGQO getBilling() {
        return billing;
    }
    public void setBilling(PostalAddressInputGQO billing) {
        this.billing = billing;
    }

}