package io.github.conanchen.shoppingcart.graphql.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TokenizedPaymentInputGQO {


    private String clientMutationId;
    @lombok.NonNull
    private String id;

    public TokenizedPaymentInputGQO() {
    }

    public TokenizedPaymentInputGQO( String clientMutationId,  String id) {
        this.clientMutationId = clientMutationId;
        this.id = id;
    }

}