package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class DeleteProjectColumnInputGQO {

    private String clientMutationId;
    @javax.validation.constraints.NotNull
    private String columnId;

    public DeleteProjectColumnInputGQO() {
    }

    public DeleteProjectColumnInputGQO(String clientMutationId, String columnId) {
        this.clientMutationId = clientMutationId;
        this.columnId = columnId;
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