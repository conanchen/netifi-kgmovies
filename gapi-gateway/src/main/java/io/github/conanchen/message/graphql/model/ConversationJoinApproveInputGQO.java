package io.github.conanchen.message.graphql.model;

import java.util.*;
import io.github.conanchen.message.graphql.api.*;

public class ConversationJoinApproveInputGQO {

    @javax.validation.constraints.NotNull
    private String actionId;

    public ConversationJoinApproveInputGQO() {
    }

    public ConversationJoinApproveInputGQO(String actionId) {
        this.actionId = actionId;
    }

    public String getActionId() {
        return actionId;
    }
    public void setActionId(String actionId) {
        this.actionId = actionId;
    }

}