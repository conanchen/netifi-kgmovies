package io.github.conanchen.shoppingman.graphql.model;

public class ProductOfferUpdateInputGQO {

    private String clientMutationId;
    @javax.validation.constraints.NotNull
    private String actionId;

    public ProductOfferUpdateInputGQO() {
    }

    public ProductOfferUpdateInputGQO(String clientMutationId, String actionId) {
        this.clientMutationId = clientMutationId;
        this.actionId = actionId;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public String getActionId() {
        return actionId;
    }
    public void setActionId(String actionId) {
        this.actionId = actionId;
    }

}