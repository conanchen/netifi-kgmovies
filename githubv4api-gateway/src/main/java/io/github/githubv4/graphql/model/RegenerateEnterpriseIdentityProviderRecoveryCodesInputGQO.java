package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class RegenerateEnterpriseIdentityProviderRecoveryCodesInputGQO {

    private String clientMutationId;
    @javax.validation.constraints.NotNull
    private String enterpriseId;

    public RegenerateEnterpriseIdentityProviderRecoveryCodesInputGQO() {
    }

    public RegenerateEnterpriseIdentityProviderRecoveryCodesInputGQO(String clientMutationId, String enterpriseId) {
        this.clientMutationId = clientMutationId;
        this.enterpriseId = enterpriseId;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public String getEnterpriseId() {
        return enterpriseId;
    }
    public void setEnterpriseId(String enterpriseId) {
        this.enterpriseId = enterpriseId;
    }

}