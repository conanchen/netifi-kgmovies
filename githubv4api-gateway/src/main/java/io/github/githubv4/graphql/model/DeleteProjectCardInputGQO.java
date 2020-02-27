package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class DeleteProjectCardInputGQO {

    @javax.validation.constraints.NotNull
    private String cardId;
    private String clientMutationId;

    public DeleteProjectCardInputGQO() {
    }

    public DeleteProjectCardInputGQO(String cardId, String clientMutationId) {
        this.cardId = cardId;
        this.clientMutationId = clientMutationId;
    }

    public String getCardId() {
        return cardId;
    }
    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

}