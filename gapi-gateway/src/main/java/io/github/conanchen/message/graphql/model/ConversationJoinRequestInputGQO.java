package io.github.conanchen.message.graphql.model;

public class ConversationJoinRequestInputGQO {

    @javax.validation.constraints.NotNull
    private String actionId;

    public ConversationJoinRequestInputGQO() {
    }

    public ConversationJoinRequestInputGQO(String actionId) {
        this.actionId = actionId;
    }

    public String getActionId() {
        return actionId;
    }
    public void setActionId(String actionId) {
        this.actionId = actionId;
    }

}