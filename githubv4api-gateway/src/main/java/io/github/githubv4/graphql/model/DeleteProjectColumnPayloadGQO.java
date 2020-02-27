package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class DeleteProjectColumnPayloadGQO {

    private String clientMutationId;
    private String deletedColumnId;
    private ProjectGQO project;

    public DeleteProjectColumnPayloadGQO() {
    }

    public DeleteProjectColumnPayloadGQO(String clientMutationId, String deletedColumnId, ProjectGQO project) {
        this.clientMutationId = clientMutationId;
        this.deletedColumnId = deletedColumnId;
        this.project = project;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public String getDeletedColumnId() {
        return deletedColumnId;
    }
    public void setDeletedColumnId(String deletedColumnId) {
        this.deletedColumnId = deletedColumnId;
    }

    public ProjectGQO getProject() {
        return project;
    }
    public void setProject(ProjectGQO project) {
        this.project = project;
    }

}