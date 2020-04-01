package io.github.conanchen.shoppingcart.graphql.model;

import lombok.Builder;
import lombok.Data;

import java.util.Collection;

@Data
@Builder
public class SetCartItemsInputGQO {

    @lombok.NonNull
    private String cartId;
    @lombok.NonNull
    private Collection<SetCartItemInputGQO> items;

    public SetCartItemsInputGQO() {
    }

    public SetCartItemsInputGQO( String cartId,  Collection<SetCartItemInputGQO> items) {
        this.cartId = cartId;
        this.items = items;
    }

}