package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class UpdateSubscriptionPayloadGQO {

    private String clientMutationId;
    private SubscribableGQO subscribable;

    public UpdateSubscriptionPayloadGQO() {
    }

    public UpdateSubscriptionPayloadGQO(String clientMutationId, SubscribableGQO subscribable) {
        this.clientMutationId = clientMutationId;
        this.subscribable = subscribable;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public SubscribableGQO getSubscribable() {
        return subscribable;
    }
    public void setSubscribable(SubscribableGQO subscribable) {
        this.subscribable = subscribable;
    }

}