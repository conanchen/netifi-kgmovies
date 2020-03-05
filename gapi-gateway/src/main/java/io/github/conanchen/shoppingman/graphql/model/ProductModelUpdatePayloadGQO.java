package io.github.conanchen.shoppingman.graphql.model;

import io.github.conanchen.action.graphql.model.ActionGQO;
import io.github.conanchen.shoppingdoor.graphql.model.ProductModelGQO;

import java.util.Collection;

public class ProductModelUpdatePayloadGQO {

    private ProductModelGQO productModel;
    private ActionGQO action;
    @javax.validation.constraints.NotNull
    private Collection<ProductModelUpdateErrorGQO> productModelUpdateErrors;

    public ProductModelUpdatePayloadGQO() {
    }

    public ProductModelUpdatePayloadGQO(ProductModelGQO productModel, ActionGQO action, Collection<ProductModelUpdateErrorGQO> productModelUpdateErrors) {
        this.productModel = productModel;
        this.action = action;
        this.productModelUpdateErrors = productModelUpdateErrors;
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

    public Collection<ProductModelUpdateErrorGQO> getProductModelUpdateErrors() {
        return productModelUpdateErrors;
    }

    public void setProductModelUpdateErrors(Collection<ProductModelUpdateErrorGQO> productModelUpdateErrors) {
        this.productModelUpdateErrors = productModelUpdateErrors;
    }

}