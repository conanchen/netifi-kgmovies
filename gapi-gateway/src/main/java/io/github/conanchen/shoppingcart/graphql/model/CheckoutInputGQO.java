package io.github.conanchen.shoppingcart.graphql.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CheckoutInputGQO {


    private String clientMutationId;
    @lombok.NonNull
    private String cartId;

    private String email;
    @lombok.NonNull
    private PostalAddressInputGQO shipping;

    private PostalAddressInputGQO billing;

    public CheckoutInputGQO() {
    }

    public CheckoutInputGQO( String clientMutationId,  String cartId,  String email,  PostalAddressInputGQO shipping,  PostalAddressInputGQO billing) {
        this.clientMutationId = clientMutationId;
        this.cartId = cartId;
        this.email = email;
        this.shipping = shipping;
        this.billing = billing;
    }

}