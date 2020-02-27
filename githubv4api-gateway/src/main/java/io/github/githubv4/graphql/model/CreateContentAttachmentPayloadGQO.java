package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class CreateContentAttachmentPayloadGQO {

    private String clientMutationId;
    private ContentAttachmentGQO contentAttachment;

    public CreateContentAttachmentPayloadGQO() {
    }

    public CreateContentAttachmentPayloadGQO(String clientMutationId, ContentAttachmentGQO contentAttachment) {
        this.clientMutationId = clientMutationId;
        this.contentAttachment = contentAttachment;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public ContentAttachmentGQO getContentAttachment() {
        return contentAttachment;
    }
    public void setContentAttachment(ContentAttachmentGQO contentAttachment) {
        this.contentAttachment = contentAttachment;
    }

}