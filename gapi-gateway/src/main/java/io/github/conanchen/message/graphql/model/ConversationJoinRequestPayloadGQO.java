package io.github.conanchen.message.graphql.model;

import lombok.Builder;
import lombok.Data;

import java.util.Collection;
@Data
@Builder
public class ConversationJoinRequestPayloadGQO {


    private ConversationUpdateErrorCodeGQO code;
    @javax.validation.constraints.NotNull
    private Collection<String> field;
    @javax.validation.constraints.NotNull
    private String message;

    public ConversationJoinRequestPayloadGQO() {
    }

    public ConversationJoinRequestPayloadGQO( ConversationUpdateErrorCodeGQO code,  Collection<String> field,  String message) {
        this.code = code;
        this.field = field;
        this.message = message;
    }

}