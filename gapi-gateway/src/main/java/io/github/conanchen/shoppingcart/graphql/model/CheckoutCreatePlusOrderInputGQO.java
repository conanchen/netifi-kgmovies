package io.github.conanchen.shoppingcart.graphql.model;

public class CheckoutCreatePlusOrderInputGQO {

    @javax.validation.constraints.NotNull
    private String id;

    public CheckoutCreatePlusOrderInputGQO() {
    }

    public CheckoutCreatePlusOrderInputGQO(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

}