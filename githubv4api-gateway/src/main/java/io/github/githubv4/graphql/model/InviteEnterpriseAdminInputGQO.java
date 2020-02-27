package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class InviteEnterpriseAdminInputGQO {

    private String clientMutationId;
    private String email;
    @javax.validation.constraints.NotNull
    private String enterpriseId;
    private String invitee;
    private EnterpriseAdministratorRoleGQO role;

    public InviteEnterpriseAdminInputGQO() {
    }

    public InviteEnterpriseAdminInputGQO(String clientMutationId, String email, String enterpriseId, String invitee, EnterpriseAdministratorRoleGQO role) {
        this.clientMutationId = clientMutationId;
        this.email = email;
        this.enterpriseId = enterpriseId;
        this.invitee = invitee;
        this.role = role;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getEnterpriseId() {
        return enterpriseId;
    }
    public void setEnterpriseId(String enterpriseId) {
        this.enterpriseId = enterpriseId;
    }

    public String getInvitee() {
        return invitee;
    }
    public void setInvitee(String invitee) {
        this.invitee = invitee;
    }

    public EnterpriseAdministratorRoleGQO getRole() {
        return role;
    }
    public void setRole(EnterpriseAdministratorRoleGQO role) {
        this.role = role;
    }

}