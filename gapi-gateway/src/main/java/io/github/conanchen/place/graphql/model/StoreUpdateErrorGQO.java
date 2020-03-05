package io.github.conanchen.place.graphql.model;

import io.github.conanchen.zommon.graphql.model.DisplayableErrorGQO;

import java.util.Collection;

public class StoreUpdateErrorGQO implements DisplayableErrorGQO {

    private StoreUpdateErrorCodeGQO code;
    @javax.validation.constraints.NotNull
    private Collection<String> field;
    @javax.validation.constraints.NotNull
    private String message;

    public StoreUpdateErrorGQO() {
    }

    public StoreUpdateErrorGQO(StoreUpdateErrorCodeGQO code, Collection<String> field, String message) {
        this.code = code;
        this.field = field;
        this.message = message;
    }

    public StoreUpdateErrorCodeGQO getCode() {
        return code;
    }

    public void setCode(StoreUpdateErrorCodeGQO code) {
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