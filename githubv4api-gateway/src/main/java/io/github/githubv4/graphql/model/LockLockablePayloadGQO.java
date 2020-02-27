package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class LockLockablePayloadGQO {

    private ActorGQO actor;
    private String clientMutationId;
    private LockableGQO lockedRecord;

    public LockLockablePayloadGQO() {
    }

    public LockLockablePayloadGQO(ActorGQO actor, String clientMutationId, LockableGQO lockedRecord) {
        this.actor = actor;
        this.clientMutationId = clientMutationId;
        this.lockedRecord = lockedRecord;
    }

    public ActorGQO getActor() {
        return actor;
    }
    public void setActor(ActorGQO actor) {
        this.actor = actor;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public LockableGQO getLockedRecord() {
        return lockedRecord;
    }
    public void setLockedRecord(LockableGQO lockedRecord) {
        this.lockedRecord = lockedRecord;
    }

}