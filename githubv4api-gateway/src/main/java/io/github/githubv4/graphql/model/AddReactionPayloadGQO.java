package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class AddReactionPayloadGQO {

    private String clientMutationId;
    private ReactionGQO reaction;
    private ReactableGQO subject;

    public AddReactionPayloadGQO() {
    }

    public AddReactionPayloadGQO(String clientMutationId, ReactionGQO reaction, ReactableGQO subject) {
        this.clientMutationId = clientMutationId;
        this.reaction = reaction;
        this.subject = subject;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public ReactionGQO getReaction() {
        return reaction;
    }
    public void setReaction(ReactionGQO reaction) {
        this.reaction = reaction;
    }

    public ReactableGQO getSubject() {
        return subject;
    }
    public void setSubject(ReactableGQO subject) {
        this.subject = subject;
    }

}