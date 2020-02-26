package io.github.conanchen.message.graphql.model;

public class ConversationInvitationAcceptInputGQO {

    @javax.validation.constraints.NotNull
    private String actionId;

    public ConversationInvitationAcceptInputGQO() {
    }

    public ConversationInvitationAcceptInputGQO(String actionId) {
        this.actionId = actionId;
    }

    public String getActionId() {
        return actionId;
    }
    public void setActionId(String actionId) {
        this.actionId = actionId;
    }

}