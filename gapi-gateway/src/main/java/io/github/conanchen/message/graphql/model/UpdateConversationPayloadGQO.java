package io.github.conanchen.message.graphql.model;

import java.util.*;
import io.github.conanchen.message.graphql.api.*;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UpdateConversationPayloadGQO {

    private ConversationGQO item;
    @javax.validation.constraints.NotNull
    private Collection<ConversationUpdateErrorGQO> errors;

    public UpdateConversationPayloadGQO() {
    }

    public UpdateConversationPayloadGQO(ConversationGQO item, Collection<ConversationUpdateErrorGQO> errors) {
        this.item = item;
        this.errors = errors;
    }

    public ConversationGQO getItem() {
        return item;
    }
    public void setItem(ConversationGQO item) {
        this.item = item;
    }

    public Collection<ConversationUpdateErrorGQO> getErrors() {
        return errors;
    }
    public void setErrors(Collection<ConversationUpdateErrorGQO> errors) {
        this.errors = errors;
    }

}