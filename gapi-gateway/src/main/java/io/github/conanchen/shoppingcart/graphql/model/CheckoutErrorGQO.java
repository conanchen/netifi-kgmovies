package io.github.conanchen.shoppingcart.graphql.model;

import java.util.Collection;

public class CheckoutErrorGQO implements DisplayableErrorGQO{

    private CheckoutErrorCodeGQO code;
    @javax.validation.constraints.NotNull
    private Collection<String> field;
    @javax.validation.constraints.NotNull
    private String message;

    public CheckoutErrorGQO() {
    }

    public CheckoutErrorGQO(CheckoutErrorCodeGQO code, Collection<String> field, String message) {
        this.code = code;
        this.field = field;
        this.message = message;
    }

    public CheckoutErrorCodeGQO getCode() {
        return code;
    }
    public void setCode(CheckoutErrorCodeGQO code) {
        this.code = code;
    }

    public Collection<String> getField() {
        return field;
    }
    public void setField(Collection<String> field) {
        this.field = field;
    }

    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }

}