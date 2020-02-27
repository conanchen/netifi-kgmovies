package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class CreateRefPayloadGQO {

    private String clientMutationId;
    private RefGQO ref;

    public CreateRefPayloadGQO() {
    }

    public CreateRefPayloadGQO(String clientMutationId, RefGQO ref) {
        this.clientMutationId = clientMutationId;
        this.ref = ref;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public RefGQO getRef() {
        return ref;
    }
    public void setRef(RefGQO ref) {
        this.ref = ref;
    }

}