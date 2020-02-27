package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class InviteEnterpriseAdminPayloadGQO {

    private String clientMutationId;
    private EnterpriseAdministratorInvitationGQO invitation;

    public InviteEnterpriseAdminPayloadGQO() {
    }

    public InviteEnterpriseAdminPayloadGQO(String clientMutationId, EnterpriseAdministratorInvitationGQO invitation) {
        this.clientMutationId = clientMutationId;
        this.invitation = invitation;
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

}