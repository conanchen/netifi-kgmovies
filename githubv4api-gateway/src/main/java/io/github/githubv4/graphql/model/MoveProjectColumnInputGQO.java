package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class MoveProjectColumnInputGQO {

    private String afterColumnId;
    private String clientMutationId;
    @javax.validation.constraints.NotNull
    private String columnId;

    public MoveProjectColumnInputGQO() {
    }

    public MoveProjectColumnInputGQO(String afterColumnId, String clientMutationId, String columnId) {
        this.afterColumnId = afterColumnId;
        this.clientMutationId = clientMutationId;
        this.columnId = columnId;
    }

    public String getAfterColumnId() {
        return afterColumnId;
    }
    public void setAfterColumnId(String afterColumnId) {
        this.afterColumnId = afterColumnId;
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