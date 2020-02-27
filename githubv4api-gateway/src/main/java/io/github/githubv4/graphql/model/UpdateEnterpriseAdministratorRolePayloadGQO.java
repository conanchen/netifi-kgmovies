package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class UpdateEnterpriseAdministratorRolePayloadGQO {

    private String clientMutationId;
    private String message;

    public UpdateEnterpriseAdministratorRolePayloadGQO() {
    }

    public UpdateEnterpriseAdministratorRolePayloadGQO(String clientMutationId, String message) {
        this.clientMutationId = clientMutationId;
        this.message = message;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }

}