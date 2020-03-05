package io.github.conanchen.shoppingman.graphql.model;

import java.util.*;

import io.github.conanchen.action.graphql.model.ActionGQO;
import io.github.conanchen.shoppingdoor.graphql.model.OfferGQO;
import io.github.conanchen.shoppingman.graphql.api.*;

public class ProductOfferOnlinePayloadGQO {

    private OfferGQO productOffer;
    private ActionGQO action;
    @javax.validation.constraints.NotNull
    private Collection<ProductOfferOnlineErrorGQO> productOfferOnlineErrors;

    public ProductOfferOnlinePayloadGQO() {
    }

    public ProductOfferOnlinePayloadGQO(OfferGQO productOffer, ActionGQO action, Collection<ProductOfferOnlineErrorGQO> productOfferOnlineErrors) {
        this.productOffer = productOffer;
        this.action = action;
        this.productOfferOnlineErrors = productOfferOnlineErrors;
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

    public Collection<ProductOfferOnlineErrorGQO> getProductOfferOnlineErrors() {
        return productOfferOnlineErrors;
    }
    public void setProductOfferOnlineErrors(Collection<ProductOfferOnlineErrorGQO> productOfferOnlineErrors) {
        this.productOfferOnlineErrors = productOfferOnlineErrors;
    }

}