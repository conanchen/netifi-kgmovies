package io.github.conanchen.message.graphql.model;

import io.github.conanchen.shoppingcart.graphql.model.DisplayableErrorGQO;

import java.util.Collection;

public class MessageErrorGQO implements DisplayableErrorGQO {

    private MessageErrorCodeGQO code;
    @javax.validation.constraints.NotNull
    private Collection<String> field;
    @javax.validation.constraints.NotNull
    private String message;

    public MessageErrorGQO() {
    }

    public MessageErrorGQO(MessageErrorCodeGQO code, Collection<String> field, String message) {
        this.code = code;
        this.field = field;
        this.message = message;
    }

    public MessageErrorCodeGQO getCode() {
        return code;
    }
    public void setCode(MessageErrorCodeGQO code) {
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