package io.github.conanchen.shopping.graphql.model;

import io.github.conanchen.zommon.graphql.model.NodeGQO;

public class ProductGQO implements NodeGQO{

    private String name;
    private String productID;
    @javax.validation.constraints.NotNull
    private String id;

    public ProductGQO() {
    }

    public ProductGQO(String name, String productID, String id) {
        this.name = name;
        this.productID = productID;
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getProductID() {
        return productID;
    }
    public void setProductID(String productID) {
        this.productID = productID;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

}