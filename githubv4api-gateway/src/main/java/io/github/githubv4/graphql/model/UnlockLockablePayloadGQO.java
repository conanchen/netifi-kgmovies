package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class UnlockLockablePayloadGQO {

    private ActorGQO actor;
    private String clientMutationId;
    private LockableGQO unlockedRecord;

    public UnlockLockablePayloadGQO() {
    }

    public UnlockLockablePayloadGQO(ActorGQO actor, String clientMutationId, LockableGQO unlockedRecord) {
        this.actor = actor;
        this.clientMutationId = clientMutationId;
        this.unlockedRecord = unlockedRecord;
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

    public LockableGQO getUnlockedRecord() {
        return unlockedRecord;
    }
    public void setUnlockedRecord(LockableGQO unlockedRecord) {
        this.unlockedRecord = unlockedRecord;
    }

}