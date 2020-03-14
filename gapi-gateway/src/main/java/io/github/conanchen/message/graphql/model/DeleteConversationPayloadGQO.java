package io.github.conanchen.message.graphql.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class DeleteConversationPayloadGQO {

    private ConversationDeleteErrorCodeGQO code;
    @javax.validation.constraints.NotNull
    private String message;

    public DeleteConversationPayloadGQO() {
    }

    public DeleteConversationPayloadGQO(ConversationDeleteErrorCodeGQO code, String message) {
        this.code = code;
        this.message = message;
    }

    public ConversationDeleteErrorCodeGQO getCode() {
        return code;
    }
    public void setCode(ConversationDeleteErrorCodeGQO code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }

}