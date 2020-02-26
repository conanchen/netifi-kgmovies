package io.github.conanchen.message.graphql.model;

public class ConversationMemberRemoveInputGQO {

    @javax.validation.constraints.NotNull
    private String actionId;

    public ConversationMemberRemoveInputGQO() {
    }

    public ConversationMemberRemoveInputGQO(String actionId) {
        this.actionId = actionId;
    }

    public String getActionId() {
        return actionId;
    }
    public void setActionId(String actionId) {
        this.actionId = actionId;
    }

}