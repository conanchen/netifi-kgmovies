package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class UnminimizeCommentInputGQO {

    private String clientMutationId;
    @javax.validation.constraints.NotNull
    private String subjectId;

    public UnminimizeCommentInputGQO() {
    }

    public UnminimizeCommentInputGQO(String clientMutationId, String subjectId) {
        this.clientMutationId = clientMutationId;
        this.subjectId = subjectId;
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