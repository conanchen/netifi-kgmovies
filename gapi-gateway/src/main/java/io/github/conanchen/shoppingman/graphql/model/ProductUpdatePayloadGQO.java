package io.github.conanchen.shoppingman.graphql.model;

import java.util.*;

import io.github.conanchen.action.graphql.model.ActionGQO;
import io.github.conanchen.shoppingdoor.graphql.model.ProductGQO;
import io.github.conanchen.shoppingman.graphql.api.*;

public class ProductUpdatePayloadGQO {

    private ProductGQO product;
    private ActionGQO action;
    @javax.validation.constraints.NotNull
    private Collection<ProductUpdateErrorGQO> productUpdateErrors;

    public ProductUpdatePayloadGQO() {
    }

    public ProductUpdatePayloadGQO(ProductGQO product, ActionGQO action, Collection<ProductUpdateErrorGQO> productUpdateErrors) {
        this.product = product;
        this.action = action;
        this.productUpdateErrors = productUpdateErrors;
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

    public Collection<ProductUpdateErrorGQO> getProductUpdateErrors() {
        return productUpdateErrors;
    }
    public void setProductUpdateErrors(Collection<ProductUpdateErrorGQO> productUpdateErrors) {
        this.productUpdateErrors = productUpdateErrors;
    }

}