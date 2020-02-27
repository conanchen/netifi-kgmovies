package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class UnminimizeCommentPayloadGQO {

    private String clientMutationId;
    private MinimizableGQO unminimizedComment;

    public UnminimizeCommentPayloadGQO() {
    }

    public UnminimizeCommentPayloadGQO(String clientMutationId, MinimizableGQO unminimizedComment) {
        this.clientMutationId = clientMutationId;
        this.unminimizedComment = unminimizedComment;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public MinimizableGQO getUnminimizedComment() {
        return unminimizedComment;
    }
    public void setUnminimizedComment(MinimizableGQO unminimizedComment) {
        this.unminimizedComment = unminimizedComment;
    }

}