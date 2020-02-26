package io.github.conanchen.message.graphql.model;

import io.github.conanchen.shoppingcart.graphql.model.DisplayableErrorGQO;

import java.util.Collection;

public class ConversationErrorGQO implements DisplayableErrorGQO {

    private ConversationErrorCodeGQO code;
    @javax.validation.constraints.NotNull
    private Collection<String> field;
    @javax.validation.constraints.NotNull
    private String message;

    public ConversationErrorGQO() {
    }

    public ConversationErrorGQO(ConversationErrorCodeGQO code, Collection<String> field, String message) {
        this.code = code;
        this.field = field;
        this.message = message;
    }

    public ConversationErrorCodeGQO getCode() {
        return code;
    }
    public void setCode(ConversationErrorCodeGQO code) {
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