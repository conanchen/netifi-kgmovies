package io.github.conanchen.shoppingman.graphql.model;

import java.util.*;

import io.github.conanchen.action.graphql.model.ActionGQO;
import io.github.conanchen.shoppingdoor.graphql.model.OfferGQO;
import io.github.conanchen.shoppingman.graphql.api.*;

public class ProductOfferCreatePayloadGQO {

    private OfferGQO productOffer;
    private ActionGQO action;
    @javax.validation.constraints.NotNull
    private Collection<ProductOfferCreateErrorGQO> productOfferCreateErrors;

    public ProductOfferCreatePayloadGQO() {
    }

    public ProductOfferCreatePayloadGQO(OfferGQO productOffer, ActionGQO action, Collection<ProductOfferCreateErrorGQO> productOfferCreateErrors) {
        this.productOffer = productOffer;
        this.action = action;
        this.productOfferCreateErrors = productOfferCreateErrors;
    }

    public OfferGQO getProductOffer() {
        return productOffer;
    }
    public void setProductOffer(OfferGQO productOffer) {
        this.productOffer = productOffer;
    }

    public ActionGQO getAction() {
        return action;
    }
    public void setAction(ActionGQO action) {
        this.action = action;
    }

    public Collection<ProductOfferCreateErrorGQO> getProductOfferCreateErrors() {
        return productOfferCreateErrors;
    }
    public void setProductOfferCreateErrors(Collection<ProductOfferCreateErrorGQO> productOfferCreateErrors) {
        this.productOfferCreateErrors = productOfferCreateErrors;
    }

}