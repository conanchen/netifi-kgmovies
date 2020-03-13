package io.github.conanchen.message.graphql.model;

import java.util.*;
import io.github.conanchen.message.graphql.api.*;

public class AddConversationPayloadGQO {

    private ConversationGQO item;
    @javax.validation.constraints.NotNull
    private Collection<ConversationAddErrorGQO> errors;
    private Collection<ConversationConnectionGQO> conversationSearch;

    public AddConversationPayloadGQO() {
    }

    public AddConversationPayloadGQO(ConversationGQO item, Collection<ConversationAddErrorGQO> errors, Collection<ConversationConnectionGQO> conversationSearch) {
        this.item = item;
        this.errors = errors;
        this.conversationSearch = conversationSearch;
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

    public Collection<ConversationConnectionGQO> getConversationSearch() {
        return conversationSearch;
    }
    public void setConversationSearch(Collection<ConversationConnectionGQO> conversationSearch) {
        this.conversationSearch = conversationSearch;
    }

}