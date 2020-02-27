package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class RemoveReactionInputGQO {

    private String clientMutationId;
    @javax.validation.constraints.NotNull
    private ReactionContentGQO content;
    @javax.validation.constraints.NotNull
    private String subjectId;

    public RemoveReactionInputGQO() {
    }

    public RemoveReactionInputGQO(String clientMutationId, ReactionContentGQO content, String subjectId) {
        this.clientMutationId = clientMutationId;
        this.content = content;
        this.subjectId = subjectId;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public ReactionContentGQO getContent() {
        return content;
    }
    public void setContent(ReactionContentGQO content) {
        this.content = content;
    }

    public String getSubjectId() {
        return subjectId;
    }
    public void setSubjectId(String subjectId) {
        this.subjectId = subjectId;
    }

}