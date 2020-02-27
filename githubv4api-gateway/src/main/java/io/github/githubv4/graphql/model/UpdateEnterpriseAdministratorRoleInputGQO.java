package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class UpdateEnterpriseAdministratorRoleInputGQO {

    private String clientMutationId;
    @javax.validation.constraints.NotNull
    private String enterpriseId;
    @javax.validation.constraints.NotNull
    private String login;
    @javax.validation.constraints.NotNull
    private EnterpriseAdministratorRoleGQO role;

    public UpdateEnterpriseAdministratorRoleInputGQO() {
    }

    public UpdateEnterpriseAdministratorRoleInputGQO(String clientMutationId, String enterpriseId, String login, EnterpriseAdministratorRoleGQO role) {
        this.clientMutationId = clientMutationId;
        this.enterpriseId = enterpriseId;
        this.login = login;
        this.role = role;
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

    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }

    public EnterpriseAdministratorRoleGQO getRole() {
        return role;
    }
    public void setRole(EnterpriseAdministratorRoleGQO role) {
        this.role = role;
    }

}