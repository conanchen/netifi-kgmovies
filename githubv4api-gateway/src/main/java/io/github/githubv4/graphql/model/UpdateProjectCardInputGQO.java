package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class UpdateProjectCardInputGQO {

    private String clientMutationId;
    private Boolean isArchived;
    private String note;
    @javax.validation.constraints.NotNull
    private String projectCardId;

    public UpdateProjectCardInputGQO() {
    }

    public UpdateProjectCardInputGQO(String clientMutationId, Boolean isArchived, String note, String projectCardId) {
        this.clientMutationId = clientMutationId;
        this.isArchived = isArchived;
        this.note = note;
        this.projectCardId = projectCardId;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public Boolean getIsArchived() {
        return isArchived;
    }
    public void setIsArchived(Boolean isArchived) {
        this.isArchived = isArchived;
    }

    public String getNote() {
        return note;
    }
    public void setNote(String note) {
        this.note = note;
    }

    public String getProjectCardId() {
        return projectCardId;
    }
    public void setProjectCardId(String projectCardId) {
        this.projectCardId = projectCardId;
    }

}