package io.github.conanchen.shoppingcart.graphql.model;

public class EmptyCartInputGQO {

    @javax.validation.constraints.NotNull
    private String id;

    public EmptyCartInputGQO() {
    }

    public EmptyCartInputGQO(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

}