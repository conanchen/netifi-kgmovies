package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class CancelEnterpriseAdminInvitationPayloadGQO {

    private String clientMutationId;
    private EnterpriseAdministratorInvitationGQO invitation;
    private String message;

    public CancelEnterpriseAdminInvitationPayloadGQO() {
    }

    public CancelEnterpriseAdminInvitationPayloadGQO(String clientMutationId, EnterpriseAdministratorInvitationGQO invitation, String message) {
        this.clientMutationId = clientMutationId;
        this.invitation = invitation;
        this.message = message;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public EnterpriseAdministratorInvitationGQO getInvitation() {
        return invitation;
    }
    public void setInvitation(EnterpriseAdministratorInvitationGQO invitation) {
        this.invitation = invitation;
    }

    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }

}