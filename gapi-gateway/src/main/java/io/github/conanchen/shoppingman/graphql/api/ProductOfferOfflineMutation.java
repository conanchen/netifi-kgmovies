package io.github.conanchen.shoppingman.graphql.api;

import io.github.conanchen.shoppingman.graphql.model.*;
import java.util.*;

public interface ProductOfferOfflineMutation {

    @javax.validation.constraints.NotNull
    ProductOfferOfflinePayloadGQO productOfferOffline(ProductOfferOfflineInputGQO input) throws Exception;

}