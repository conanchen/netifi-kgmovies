package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class RemoveEnterpriseAdminPayloadGQO {

    private UserGQO admin;
    private String clientMutationId;
    private EnterpriseGQO enterprise;
    private String message;
    private UserGQO viewer;

    public RemoveEnterpriseAdminPayloadGQO() {
    }

    public RemoveEnterpriseAdminPayloadGQO(UserGQO admin, String clientMutationId, EnterpriseGQO enterprise, String message, UserGQO viewer) {
        this.admin = admin;
        this.clientMutationId = clientMutationId;
        this.enterprise = enterprise;
        this.message = message;
        this.viewer = viewer;
    }

    public UserGQO getAdmin() {
        return admin;
    }
    public void setAdmin(UserGQO admin) {
        this.admin = admin;
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

    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }

    public UserGQO getViewer() {
        return viewer;
    }
    public void setViewer(UserGQO viewer) {
        this.viewer = viewer;
    }

}