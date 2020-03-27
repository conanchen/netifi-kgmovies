package io.github.conanchen.shoppingcart.graphql.model;

import io.github.conanchen.zommon.graphql.model.DisplayableErrorGQO;
import lombok.Builder;
import lombok.Data;

import java.util.Collection;

@Data
@Builder
public class CheckoutErrorGQO implements DisplayableErrorGQO{


    private CheckoutErrorCodeGQO code;
    @lombok.NonNull
    private Collection<String> field;
    @lombok.NonNull
    private String message;

    public CheckoutErrorGQO() {
    }

    public CheckoutErrorGQO( CheckoutErrorCodeGQO code,  Collection<String> field,  String message) {
        this.code = code;
        this.field = field;
        this.message = message;
    }

}