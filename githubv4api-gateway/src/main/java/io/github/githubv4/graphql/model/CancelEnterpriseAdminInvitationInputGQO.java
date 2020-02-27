package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class CancelEnterpriseAdminInvitationInputGQO {

    private String clientMutationId;
    @javax.validation.constraints.NotNull
    private String invitationId;

    public CancelEnterpriseAdminInvitationInputGQO() {
    }

    public CancelEnterpriseAdminInvitationInputGQO(String clientMutationId, String invitationId) {
        this.clientMutationId = clientMutationId;
        this.invitationId = invitationId;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public String getInvitationId() {
        return invitationId;
    }
    public void setInvitationId(String invitationId) {
        this.invitationId = invitationId;
    }

}