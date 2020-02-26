package io.github.conanchen.message.graphql.model;

import io.github.conanchen.action.graphql.model.ActionGQO;

import java.util.Collection;

public class ConversationPayloadGQO {

    private ConversationGQO conversation;
    private ActionGQO action;
    @javax.validation.constraints.NotNull
    private Collection<ConversationErrorGQO> conversationErrors;

    public ConversationPayloadGQO() {
    }

    public ConversationPayloadGQO(ConversationGQO conversation, ActionGQO action, Collection<ConversationErrorGQO> conversationErrors) {
        this.conversation = conversation;
        this.action = action;
        this.conversationErrors = conversationErrors;
    }

    public ConversationGQO getConversation() {
        return conversation;
    }
    public void setConversation(ConversationGQO conversation) {
        this.conversation = conversation;
    }

    public ActionGQO getAction() {
        return action;
    }
    public void setAction(ActionGQO action) {
        this.action = action;
    }

    public Collection<ConversationErrorGQO> getConversationErrors() {
        return conversationErrors;
    }
    public void setConversationErrors(Collection<ConversationErrorGQO> conversationErrors) {
        this.conversationErrors = conversationErrors;
    }

}