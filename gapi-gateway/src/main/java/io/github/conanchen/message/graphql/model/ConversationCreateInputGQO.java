package io.github.conanchen.message.graphql.model;

public class ConversationCreateInputGQO {

    @javax.validation.constraints.NotNull
    private String actionId;

    public ConversationCreateInputGQO() {
    }

    public ConversationCreateInputGQO(String actionId) {
        this.actionId = actionId;
    }

    public String getActionId() {
        return actionId;
    }
    public void setActionId(String actionId) {
        this.actionId = actionId;
    }

}