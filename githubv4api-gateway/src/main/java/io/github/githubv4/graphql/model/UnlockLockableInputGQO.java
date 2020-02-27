package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class UnlockLockableInputGQO {

    private String clientMutationId;
    @javax.validation.constraints.NotNull
    private String lockableId;

    public UnlockLockableInputGQO() {
    }

    public UnlockLockableInputGQO(String clientMutationId, String lockableId) {
        this.clientMutationId = clientMutationId;
        this.lockableId = lockableId;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public String getLockableId() {
        return lockableId;
    }
    public void setLockableId(String lockableId) {
        this.lockableId = lockableId;
    }

}