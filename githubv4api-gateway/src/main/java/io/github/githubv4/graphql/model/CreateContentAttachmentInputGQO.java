package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class CreateContentAttachmentInputGQO {

    @javax.validation.constraints.NotNull
    private String body;
    private String clientMutationId;
    @javax.validation.constraints.NotNull
    private String contentReferenceId;
    @javax.validation.constraints.NotNull
    private String title;

    public CreateContentAttachmentInputGQO() {
    }

    public CreateContentAttachmentInputGQO(String body, String clientMutationId, String contentReferenceId, String title) {
        this.body = body;
        this.clientMutationId = clientMutationId;
        this.contentReferenceId = contentReferenceId;
        this.title = title;
    }

    public String getBody() {
        return body;
    }
    public void setBody(String body) {
        this.body = body;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public String getContentReferenceId() {
        return contentReferenceId;
    }
    public void setContentReferenceId(String contentReferenceId) {
        this.contentReferenceId = contentReferenceId;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

}