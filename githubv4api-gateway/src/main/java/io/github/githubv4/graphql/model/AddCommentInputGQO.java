package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class AddCommentInputGQO {

    @javax.validation.constraints.NotNull
    private String body;
    private String clientMutationId;
    @javax.validation.constraints.NotNull
    private String subjectId;

    public AddCommentInputGQO() {
    }

    public AddCommentInputGQO(String body, String clientMutationId, String subjectId) {
        this.body = body;
        this.clientMutationId = clientMutationId;
        this.subjectId = subjectId;
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

    public String getSubjectId() {
        return subjectId;
    }
    public void setSubjectId(String subjectId) {
        this.subjectId = subjectId;
    }

}