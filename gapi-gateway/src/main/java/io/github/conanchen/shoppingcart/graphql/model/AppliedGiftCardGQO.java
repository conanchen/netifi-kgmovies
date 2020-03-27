package io.github.conanchen.shoppingcart.graphql.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AppliedGiftCardGQO {


    private String id;

    public AppliedGiftCardGQO() {
    }

    public AppliedGiftCardGQO( String id) {
        this.id = id;
    }

}