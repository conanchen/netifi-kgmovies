package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class MinimizeCommentPayloadGQO {

    private String clientMutationId;
    private MinimizableGQO minimizedComment;

    public MinimizeCommentPayloadGQO() {
    }

    public MinimizeCommentPayloadGQO(String clientMutationId, MinimizableGQO minimizedComment) {
        this.clientMutationId = clientMutationId;
        this.minimizedComment = minimizedComment;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public MinimizableGQO getMinimizedComment() {
        return minimizedComment;
    }
    public void setMinimizedComment(MinimizableGQO minimizedComment) {
        this.minimizedComment = minimizedComment;
    }

}