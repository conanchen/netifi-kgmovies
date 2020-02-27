package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class UpdateEnterpriseProfilePayloadGQO {

    private String clientMutationId;
    private EnterpriseGQO enterprise;

    public UpdateEnterpriseProfilePayloadGQO() {
    }

    public UpdateEnterpriseProfilePayloadGQO(String clientMutationId, EnterpriseGQO enterprise) {
        this.clientMutationId = clientMutationId;
        this.enterprise = enterprise;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public EnterpriseGQO getEnterprise() {
        return enterprise;
    }
    public void setEnterprise(EnterpriseGQO enterprise) {
        this.enterprise = enterprise;
    }

}