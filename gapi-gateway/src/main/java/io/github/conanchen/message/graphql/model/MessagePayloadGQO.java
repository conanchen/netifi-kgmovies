package io.github.conanchen.message.graphql.model;

import java.util.*;

import io.github.conanchen.action.graphql.model.ActionGQO;
import io.github.conanchen.message.graphql.api.*;

public class MessagePayloadGQO {

    private MessageGQO message;
    private ActionGQO action;
    @javax.validation.constraints.NotNull
    private Collection<MessageErrorGQO> messageErrors;

    public MessagePayloadGQO() {
    }

    public MessagePayloadGQO(MessageGQO message, ActionGQO action, Collection<MessageErrorGQO> messageErrors) {
        this.message = message;
        this.action = action;
        this.messageErrors = messageErrors;
    }

    public MessageGQO getMessage() {
        return message;
    }
    public void setMessage(MessageGQO message) {
        this.message = message;
    }

    public ActionGQO getAction() {
        return action;
    }
    public void setAction(ActionGQO action) {
        this.action = action;
    }

    public Collection<MessageErrorGQO> getMessageErrors() {
        return messageErrors;
    }
    public void setMessageErrors(Collection<MessageErrorGQO> messageErrors) {
        this.messageErrors = messageErrors;
    }

}