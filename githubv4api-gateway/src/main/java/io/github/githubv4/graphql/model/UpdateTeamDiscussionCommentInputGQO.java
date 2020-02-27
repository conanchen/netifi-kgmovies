package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class UpdateTeamDiscussionCommentInputGQO {

    @javax.validation.constraints.NotNull
    private String body;
    private String bodyVersion;
    private String clientMutationId;
    @javax.validation.constraints.NotNull
    private String id;

    public UpdateTeamDiscussionCommentInputGQO() {
    }

    public UpdateTeamDiscussionCommentInputGQO(String body, String bodyVersion, String clientMutationId, String id) {
        this.body = body;
        this.bodyVersion = bodyVersion;
        this.clientMutationId = clientMutationId;
        this.id = id;
    }

    public String getBody() {
        return body;
    }
    public void setBody(String body) {
        this.body = body;
    }

    public String getBodyVersion() {
        return bodyVersion;
    }
    public void setBodyVersion(String bodyVersion) {
        this.bodyVersion = bodyVersion;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

}