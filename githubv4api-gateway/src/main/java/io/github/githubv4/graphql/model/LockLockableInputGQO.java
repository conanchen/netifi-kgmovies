package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class LockLockableInputGQO {

    private String clientMutationId;
    private LockReasonGQO lockReason;
    @javax.validation.constraints.NotNull
    private String lockableId;

    public LockLockableInputGQO() {
    }

    public LockLockableInputGQO(String clientMutationId, LockReasonGQO lockReason, String lockableId) {
        this.clientMutationId = clientMutationId;
        this.lockReason = lockReason;
        this.lockableId = lockableId;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public LockReasonGQO getLockReason() {
        return lockReason;
    }
    public void setLockReason(LockReasonGQO lockReason) {
        this.lockReason = lockReason;
    }

    public String getLockableId() {
        return lockableId;
    }
    public void setLockableId(String lockableId) {
        this.lockableId = lockableId;
    }

}