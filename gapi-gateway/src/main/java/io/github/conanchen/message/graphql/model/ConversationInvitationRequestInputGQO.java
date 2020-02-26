package io.github.conanchen.message.graphql.model;

import java.util.*;
import io.github.conanchen.message.graphql.api.*;

public class ConversationInvitationRequestInputGQO {

    @javax.validation.constraints.NotNull
    private String actionId;

    public ConversationInvitationRequestInputGQO() {
    }

    public ConversationInvitationRequestInputGQO(String actionId) {
        this.actionId = actionId;
    }

    public String getActionId() {
        return actionId;
    }
    public void setActionId(String actionId) {
        this.actionId = actionId;
    }

}