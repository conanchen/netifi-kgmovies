package io.github.conanchen.shoppingcart.graphql.model;

public class AlipayPaymentStep2InputGQO {

    @javax.validation.constraints.NotNull
    private String id;

    public AlipayPaymentStep2InputGQO() {
    }

    public AlipayPaymentStep2InputGQO(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

}