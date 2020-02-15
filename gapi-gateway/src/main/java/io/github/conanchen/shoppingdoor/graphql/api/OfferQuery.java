package io.github.conanchen.shoppingdoor.graphql.api;

import io.github.conanchen.shoppingdoor.graphql.model.OfferGQO;

public interface OfferQuery {

    OfferGQO offer(String id, String offerID) throws Exception;

}