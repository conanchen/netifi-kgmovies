package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class CreateEnterpriseOrganizationPayloadGQO {

    private String clientMutationId;
    private EnterpriseGQO enterprise;
    private OrganizationGQO organization;

    public CreateEnterpriseOrganizationPayloadGQO() {
    }

    public CreateEnterpriseOrganizationPayloadGQO(String clientMutationId, EnterpriseGQO enterprise, OrganizationGQO organization) {
        this.clientMutationId = clientMutationId;
        this.enterprise = enterprise;
        this.organization = organization;
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

    public OrganizationGQO getOrganization() {
        return organization;
    }
    public void setOrganization(OrganizationGQO organization) {
        this.organization = organization;
    }

}