package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class RemoveEnterpriseOrganizationInputGQO {

    private String clientMutationId;
    @javax.validation.constraints.NotNull
    private String enterpriseId;
    @javax.validation.constraints.NotNull
    private String organizationId;

    public RemoveEnterpriseOrganizationInputGQO() {
    }

    public RemoveEnterpriseOrganizationInputGQO(String clientMutationId, String enterpriseId, String organizationId) {
        this.clientMutationId = clientMutationId;
        this.enterpriseId = enterpriseId;
        this.organizationId = organizationId;
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

    public String getOrganizationId() {
        return organizationId;
    }
    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

}