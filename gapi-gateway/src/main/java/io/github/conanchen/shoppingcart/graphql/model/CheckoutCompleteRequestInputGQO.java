package io.github.conanchen.shoppingcart.graphql.model;

public class CheckoutCompleteRequestInputGQO {

    @javax.validation.constraints.NotNull
    private String id;

    public CheckoutCompleteRequestInputGQO() {
    }

    public CheckoutCompleteRequestInputGQO(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

}