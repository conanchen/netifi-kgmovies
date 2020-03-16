package io.github.conanchen.message.graphql.model;

import java.util.*;
import io.github.conanchen.movies.graphql.model.*;
import io.github.conanchen.person.graphql.model.*;
import io.github.conanchen.message.graphql.api.*;

import lombok.Builder;
import lombok.Data;
@Data
@Builder
public class ConversationMemberRemovePayloadGQO {


    private ConversationUpdateErrorCodeGQO code;
    @javax.validation.constraints.NotNull
    private Collection<String> field;
    @javax.validation.constraints.NotNull
    private String message;

    public ConversationMemberRemovePayloadGQO() {
    }

    public ConversationMemberRemovePayloadGQO( ConversationUpdateErrorCodeGQO code,  Collection<String> field,  String message) {
        this.code = code;
        this.field = field;
        this.message = message;
    }

}