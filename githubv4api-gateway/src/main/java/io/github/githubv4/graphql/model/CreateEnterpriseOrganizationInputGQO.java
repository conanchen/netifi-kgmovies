package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class CreateEnterpriseOrganizationInputGQO {

    @javax.validation.constraints.NotNull
    private Collection<String> adminLogins;
    @javax.validation.constraints.NotNull
    private String billingEmail;
    private String clientMutationId;
    @javax.validation.constraints.NotNull
    private String enterpriseId;
    @javax.validation.constraints.NotNull
    private String login;
    @javax.validation.constraints.NotNull
    private String profileName;

    public CreateEnterpriseOrganizationInputGQO() {
    }

    public CreateEnterpriseOrganizationInputGQO(Collection<String> adminLogins, String billingEmail, String clientMutationId, String enterpriseId, String login, String profileName) {
        this.adminLogins = adminLogins;
        this.billingEmail = billingEmail;
        this.clientMutationId = clientMutationId;
        this.enterpriseId = enterpriseId;
        this.login = login;
        this.profileName = profileName;
    }

    public Collection<String> getAdminLogins() {
        return adminLogins;
    }
    public void setAdminLogins(Collection<String> adminLogins) {
        this.adminLogins = adminLogins;
    }

    public String getBillingEmail() {
        return billingEmail;
    }
    public void setBillingEmail(String billingEmail) {
        this.billingEmail = billingEmail;
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

    public String getProfileName() {
        return profileName;
    }
    public void setProfileName(String profileName) {
        this.profileName = profileName;
    }

}