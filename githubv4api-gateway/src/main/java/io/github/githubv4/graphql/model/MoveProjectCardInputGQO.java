package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class MoveProjectCardInputGQO {

    private String afterCardId;
    @javax.validation.constraints.NotNull
    private String cardId;
    private String clientMutationId;
    @javax.validation.constraints.NotNull
    private String columnId;

    public MoveProjectCardInputGQO() {
    }

    public MoveProjectCardInputGQO(String afterCardId, String cardId, String clientMutationId, String columnId) {
        this.afterCardId = afterCardId;
        this.cardId = cardId;
        this.clientMutationId = clientMutationId;
        this.columnId = columnId;
    }

    public String getAfterCardId() {
        return afterCardId;
    }
    public void setAfterCardId(String afterCardId) {
        this.afterCardId = afterCardId;
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

    public String getColumnId() {
        return columnId;
    }
    public void setColumnId(String columnId) {
        this.columnId = columnId;
    }

}