package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class UpdateTeamDiscussionInputGQO {

    private String body;
    private String bodyVersion;
    private String clientMutationId;
    @javax.validation.constraints.NotNull
    private String id;
    private Boolean pinned;
    private String title;

    public UpdateTeamDiscussionInputGQO() {
    }

    public UpdateTeamDiscussionInputGQO(String body, String bodyVersion, String clientMutationId, String id, Boolean pinned, String title) {
        this.body = body;
        this.bodyVersion = bodyVersion;
        this.clientMutationId = clientMutationId;
        this.id = id;
        this.pinned = pinned;
        this.title = title;
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

    public Boolean getPinned() {
        return pinned;
    }
    public void setPinned(Boolean pinned) {
        this.pinned = pinned;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

}