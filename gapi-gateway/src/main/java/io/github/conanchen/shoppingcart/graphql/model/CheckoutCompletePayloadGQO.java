package io.github.conanchen.shoppingcart.graphql.model;

import java.util.*;
import io.github.conanchen.person.graphql.model.*;
import io.github.conanchen.organization.graphql.model.*;
import io.github.conanchen.acl.graphql.model.*;
import io.github.conanchen.shoppingfulfill.graphql.model.*;
import io.github.conanchen.place.graphql.model.*;
import io.github.conanchen.shoppingcart.graphql.api.*;
import io.github.conanchen.action.graphql.model.*;
import io.github.conanchen.shoppingcart.graphql.model.*;
import io.github.conanchen.zommon.graphql.model.*;
import io.github.conanchen.shoppingdoor.graphql.model.*;

import lombok.Builder;
import lombok.Data;
@Data
@Builder
public class CheckoutCompletePayloadGQO {


    private PoderGQO poder;
    @javax.validation.constraints.NotNull
    private Collection<CheckoutErrorGQO> checkoutErrors;

    public CheckoutCompletePayloadGQO() {
    }

    public CheckoutCompletePayloadGQO( PoderGQO poder,  Collection<CheckoutErrorGQO> checkoutErrors) {
        this.poder = poder;
        this.checkoutErrors = checkoutErrors;
    }

}