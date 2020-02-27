package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class RemoveEnterpriseOrganizationPayloadGQO {

    private String clientMutationId;
    private EnterpriseGQO enterprise;
    private OrganizationGQO organization;
    private UserGQO viewer;

    public RemoveEnterpriseOrganizationPayloadGQO() {
    }

    public RemoveEnterpriseOrganizationPayloadGQO(String clientMutationId, EnterpriseGQO enterprise, OrganizationGQO organization, UserGQO viewer) {
        this.clientMutationId = clientMutationId;
        this.enterprise = enterprise;
        this.organization = organization;
        this.viewer = viewer;
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

    public UserGQO getViewer() {
        return viewer;
    }
    public void setViewer(UserGQO viewer) {
        this.viewer = viewer;
    }

}