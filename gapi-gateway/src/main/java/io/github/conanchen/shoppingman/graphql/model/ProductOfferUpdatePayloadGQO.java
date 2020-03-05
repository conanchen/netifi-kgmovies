package io.github.conanchen.shoppingman.graphql.model;

import java.util.*;

import io.github.conanchen.action.graphql.model.ActionGQO;
import io.github.conanchen.shoppingdoor.graphql.model.OfferGQO;
import io.github.conanchen.shoppingman.graphql.api.*;

public class ProductOfferUpdatePayloadGQO {

    private OfferGQO productOffer;
    private ActionGQO action;
    @javax.validation.constraints.NotNull
    private Collection<ProductOfferUpdateErrorGQO> productOfferUpdateErrors;

    public ProductOfferUpdatePayloadGQO() {
    }

    public ProductOfferUpdatePayloadGQO(OfferGQO productOffer, ActionGQO action, Collection<ProductOfferUpdateErrorGQO> productOfferUpdateErrors) {
        this.productOffer = productOffer;
        this.action = action;
        this.productOfferUpdateErrors = productOfferUpdateErrors;
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

    public Collection<ProductOfferUpdateErrorGQO> getProductOfferUpdateErrors() {
        return productOfferUpdateErrors;
    }
    public void setProductOfferUpdateErrors(Collection<ProductOfferUpdateErrorGQO> productOfferUpdateErrors) {
        this.productOfferUpdateErrors = productOfferUpdateErrors;
    }

}