package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class AddProjectCardInputGQO {

    private String clientMutationId;
    private String contentId;
    private String note;
    @javax.validation.constraints.NotNull
    private String projectColumnId;

    public AddProjectCardInputGQO() {
    }

    public AddProjectCardInputGQO(String clientMutationId, String contentId, String note, String projectColumnId) {
        this.clientMutationId = clientMutationId;
        this.contentId = contentId;
        this.note = note;
        this.projectColumnId = projectColumnId;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public String getContentId() {
        return contentId;
    }
    public void setContentId(String contentId) {
        this.contentId = contentId;
    }

    public String getNote() {
        return note;
    }
    public void setNote(String note) {
        this.note = note;
    }

    public String getProjectColumnId() {
        return projectColumnId;
    }
    public void setProjectColumnId(String projectColumnId) {
        this.projectColumnId = projectColumnId;
    }

}