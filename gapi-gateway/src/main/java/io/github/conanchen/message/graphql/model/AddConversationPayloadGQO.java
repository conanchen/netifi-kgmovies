package io.github.conanchen.message.graphql.model;

import java.util.*;
import io.github.conanchen.message.graphql.api.*;

public class AddConversationPayloadGQO {

    private ConversationGQO item;
    @javax.validation.constraints.NotNull
    private Collection<ConversationAddErrorGQO> errors;

    public AddConversationPayloadGQO() {
    }

    public AddConversationPayloadGQO(ConversationGQO item, Collection<ConversationAddErrorGQO> errors) {
        this.item = item;
        this.errors = errors;
    }

    public ConversationGQO getItem() {
        return item;
    }
    public void setItem(ConversationGQO item) {
        this.item = item;
    }

    public Collection<ConversationAddErrorGQO> getErrors() {
        return errors;
    }
    public void setErrors(Collection<ConversationAddErrorGQO> errors) {
        this.errors = errors;
    }
    
}