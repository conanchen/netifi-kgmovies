package io.github.conanchen.shoppingman.graphql.model;

import java.util.*;

import io.github.conanchen.action.graphql.model.ActionGQO;
import io.github.conanchen.shoppingdoor.graphql.model.ProductGQO;
import io.github.conanchen.shoppingman.graphql.api.*;

public class ProductCreatePayloadGQO {

    private ProductGQO product;
    private ActionGQO action;
    @javax.validation.constraints.NotNull
    private Collection<ProductCreateErrorGQO> productCreateErrors;

    public ProductCreatePayloadGQO() {
    }

    public ProductCreatePayloadGQO(ProductGQO product, ActionGQO action, Collection<ProductCreateErrorGQO> productCreateErrors) {
        this.product = product;
        this.action = action;
        this.productCreateErrors = productCreateErrors;
    }

    public ProductGQO getProduct() {
        return product;
    }
    public void setProduct(ProductGQO product) {
        this.product = product;
    }

    public ActionGQO getAction() {
        return action;
    }
    public void setAction(ActionGQO action) {
        this.action = action;
    }

    public Collection<ProductCreateErrorGQO> getProductCreateErrors() {
        return productCreateErrors;
    }
    public void setProductCreateErrors(Collection<ProductCreateErrorGQO> productCreateErrors) {
        this.productCreateErrors = productCreateErrors;
    }

}