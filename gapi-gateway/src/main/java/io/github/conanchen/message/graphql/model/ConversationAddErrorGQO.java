package io.github.conanchen.message.graphql.model;

import java.util.*;
import io.github.conanchen.message.graphql.api.*;
import io.github.conanchen.zommon.graphql.model.DisplayableErrorGQO;

public class ConversationAddErrorGQO implements DisplayableErrorGQO {

    private ConversationAddErrorCodeGQO code;
    @javax.validation.constraints.NotNull
    private Collection<String> field;
    @javax.validation.constraints.NotNull
    private String message;

    public ConversationAddErrorGQO() {
    }

    public ConversationAddErrorGQO(ConversationAddErrorCodeGQO code, Collection<String> field, String message) {
        this.code = code;
        this.field = field;
        this.message = message;
    }

    public ConversationAddErrorCodeGQO getCode() {
        return code;
    }
    public void setCode(ConversationAddErrorCodeGQO code) {
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