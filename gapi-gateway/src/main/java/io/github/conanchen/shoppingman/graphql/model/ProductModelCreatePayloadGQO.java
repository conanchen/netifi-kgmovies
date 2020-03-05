package io.github.conanchen.shoppingman.graphql.model;

import io.github.conanchen.action.graphql.model.ActionGQO;
import io.github.conanchen.shoppingdoor.graphql.model.ProductModelGQO;

import java.util.Collection;

public class ProductModelCreatePayloadGQO {

    private ProductModelGQO productModel;
    private ActionGQO action;
    @javax.validation.constraints.NotNull
    private Collection<ProductModelCreateErrorGQO> productModelCreateErrors;

    public ProductModelCreatePayloadGQO() {
    }

    public ProductModelCreatePayloadGQO(ProductModelGQO productModel, ActionGQO action, Collection<ProductModelCreateErrorGQO> productModelCreateErrors) {
        this.productModel = productModel;
        this.action = action;
        this.productModelCreateErrors = productModelCreateErrors;
    }

    public ProductModelGQO getProductModel() {
        return productModel;
    }

    public void setProductModel(ProductModelGQO productModel) {
        this.productModel = productModel;
    }

    public ActionGQO getAction() {
        return action;
    }

    public void setAction(ActionGQO action) {
        this.action = action;
    }

    public Collection<ProductModelCreateErrorGQO> getProductModelCreateErrors() {
        return productModelCreateErrors;
    }

    public void setProductModelCreateErrors(Collection<ProductModelCreateErrorGQO> productModelCreateErrors) {
        this.productModelCreateErrors = productModelCreateErrors;
    }

}