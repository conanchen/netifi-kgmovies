package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class RegenerateEnterpriseIdentityProviderRecoveryCodesPayloadGQO {

    private String clientMutationId;
    private EnterpriseIdentityProviderGQO identityProvider;

    public RegenerateEnterpriseIdentityProviderRecoveryCodesPayloadGQO() {
    }

    public RegenerateEnterpriseIdentityProviderRecoveryCodesPayloadGQO(String clientMutationId, EnterpriseIdentityProviderGQO identityProvider) {
        this.clientMutationId = clientMutationId;
        this.identityProvider = identityProvider;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public EnterpriseIdentityProviderGQO getIdentityProvider() {
        return identityProvider;
    }
    public void setIdentityProvider(EnterpriseIdentityProviderGQO identityProvider) {
        this.identityProvider = identityProvider;
    }

}