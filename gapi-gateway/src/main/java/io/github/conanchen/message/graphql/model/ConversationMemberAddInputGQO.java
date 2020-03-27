package io.github.conanchen.message.graphql.model;

import lombok.Builder;
import lombok.Data;
@Data
@Builder
public class ConversationMemberAddInputGQO {


    private String clientMutationId;
    @javax.validation.constraints.NotNull
    private String actionId;

    public ConversationMemberAddInputGQO() {
    }

    public ConversationMemberAddInputGQO( String clientMutationId,  String actionId) {
        this.clientMutationId = clientMutationId;
        this.actionId = actionId;
    }

}