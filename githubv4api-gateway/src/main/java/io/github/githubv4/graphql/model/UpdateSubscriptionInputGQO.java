package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class UpdateSubscriptionInputGQO {

    private String clientMutationId;
    @javax.validation.constraints.NotNull
    private SubscriptionStateGQO state;
    @javax.validation.constraints.NotNull
    private String subscribableId;

    public UpdateSubscriptionInputGQO() {
    }

    public UpdateSubscriptionInputGQO(String clientMutationId, SubscriptionStateGQO state, String subscribableId) {
        this.clientMutationId = clientMutationId;
        this.state = state;
        this.subscribableId = subscribableId;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public SubscriptionStateGQO getState() {
        return state;
    }
    public void setState(SubscriptionStateGQO state) {
        this.state = state;
    }

    public String getSubscribableId() {
        return subscribableId;
    }
    public void setSubscribableId(String subscribableId) {
        this.subscribableId = subscribableId;
    }

}