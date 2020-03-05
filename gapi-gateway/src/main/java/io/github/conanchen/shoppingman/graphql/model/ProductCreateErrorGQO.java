package io.github.conanchen.shoppingman.graphql.model;

import java.util.*;
import io.github.conanchen.shoppingman.graphql.api.*;
import io.github.conanchen.zommon.graphql.model.DisplayableErrorGQO;

public class ProductCreateErrorGQO implements DisplayableErrorGQO {

    private ProductCreateErrorCodeGQO code;
    @javax.validation.constraints.NotNull
    private Collection<String> field;
    @javax.validation.constraints.NotNull
    private String message;

    public ProductCreateErrorGQO() {
    }

    public ProductCreateErrorGQO(ProductCreateErrorCodeGQO code, Collection<String> field, String message) {
        this.code = code;
        this.field = field;
        this.message = message;
    }

    public ProductCreateErrorCodeGQO getCode() {
        return code;
    }
    public void setCode(ProductCreateErrorCodeGQO code) {
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