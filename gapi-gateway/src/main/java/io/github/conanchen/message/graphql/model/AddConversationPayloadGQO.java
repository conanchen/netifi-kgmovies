package io.github.conanchen.message.graphql.model;

import java.util.*;

import io.github.conanchen.message.graphql.api.*;
import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
@Builder
public class AddConversationPayloadGQO {

    private ConversationGQO item;
    @javax.validation.constraints.NotNull
    private Collection<ConversationAddErrorGQO> errors;

    public AddConversationPayloadGQO() {
    }

    public AddConversationPayloadGQO(ConversationGQO item, @NotNull Collection<ConversationAddErrorGQO> errors) {
        this.item = item;
        this.errors = errors;
    }
}