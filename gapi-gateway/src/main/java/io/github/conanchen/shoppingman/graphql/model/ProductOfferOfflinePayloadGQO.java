package io.github.conanchen.shoppingman.graphql.model;

import java.util.*;

import io.github.conanchen.action.graphql.model.ActionGQO;
import io.github.conanchen.shoppingdoor.graphql.model.OfferGQO;
import io.github.conanchen.shoppingman.graphql.api.*;

public class ProductOfferOfflinePayloadGQO {

    private OfferGQO productOffer;
    private ActionGQO action;
    @javax.validation.constraints.NotNull
    private Collection<ProductOfferOfflineErrorGQO> productOfferOfflineErrors;

    public ProductOfferOfflinePayloadGQO() {
    }

    public ProductOfferOfflinePayloadGQO(OfferGQO productOffer, ActionGQO action, Collection<ProductOfferOfflineErrorGQO> productOfferOfflineErrors) {
        this.productOffer = productOffer;
        this.action = action;
        this.productOfferOfflineErrors = productOfferOfflineErrors;
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

    public Collection<ProductOfferOfflineErrorGQO> getProductOfferOfflineErrors() {
        return productOfferOfflineErrors;
    }
    public void setProductOfferOfflineErrors(Collection<ProductOfferOfflineErrorGQO> productOfferOfflineErrors) {
        this.productOfferOfflineErrors = productOfferOfflineErrors;
    }

}