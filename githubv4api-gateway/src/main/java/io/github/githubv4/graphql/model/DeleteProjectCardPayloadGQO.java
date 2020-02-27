package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class DeleteProjectCardPayloadGQO {

    private String clientMutationId;
    private ProjectColumnGQO column;
    private String deletedCardId;

    public DeleteProjectCardPayloadGQO() {
    }

    public DeleteProjectCardPayloadGQO(String clientMutationId, ProjectColumnGQO column, String deletedCardId) {
        this.clientMutationId = clientMutationId;
        this.column = column;
        this.deletedCardId = deletedCardId;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public ProjectColumnGQO getColumn() {
        return column;
    }
    public void setColumn(ProjectColumnGQO column) {
        this.column = column;
    }

    public String getDeletedCardId() {
        return deletedCardId;
    }
    public void setDeletedCardId(String deletedCardId) {
        this.deletedCardId = deletedCardId;
    }

}