package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class RemoveEnterpriseAdminInputGQO {

    private String clientMutationId;
    @javax.validation.constraints.NotNull
    private String enterpriseId;
    @javax.validation.constraints.NotNull
    private String login;

    public RemoveEnterpriseAdminInputGQO() {
    }

    public RemoveEnterpriseAdminInputGQO(String clientMutationId, String enterpriseId, String login) {
        this.clientMutationId = clientMutationId;
        this.enterpriseId = enterpriseId;
        this.login = login;
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

}