package io.github.conanchen.shoppingman.graphql.api;

import io.github.conanchen.shoppingman.graphql.model.*;
import java.util.*;

public interface ProductOfferUpdateMutation {

    @javax.validation.constraints.NotNull
    ProductOfferUpdatePayloadGQO productOfferUpdate(ProductOfferUpdateInputGQO input) throws Exception;

}