package io.github.conanchen.message.graphql.model;

import java.util.*;
import io.github.conanchen.movies.graphql.model.*;
import io.github.conanchen.person.graphql.model.*;
import io.github.conanchen.message.graphql.api.*;

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