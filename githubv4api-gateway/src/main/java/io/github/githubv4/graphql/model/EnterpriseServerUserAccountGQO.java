package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class EnterpriseServerUserAccountGQO implements NodeGQO{

    @javax.validation.constraints.NotNull
    private java.util.Date createdAt;
    @javax.validation.constraints.NotNull
    private EnterpriseServerUserAccountEmailConnectionGQO emails;
    @javax.validation.constraints.NotNull
    private EnterpriseServerInstallationGQO enterpriseServerInstallation;
    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private Boolean isSiteAdmin;
    @javax.validation.constraints.NotNull
    private String login;
    private String profileName;
    @javax.validation.constraints.NotNull
    private java.util.Date remoteCreatedAt;
    @javax.validation.constraints.NotNull
    private Integer remoteUserId;
    @javax.validation.constraints.NotNull
    private java.util.Date updatedAt;

    public EnterpriseServerUserAccountGQO() {
    }

    public EnterpriseServerUserAccountGQO(java.util.Date createdAt, EnterpriseServerUserAccountEmailConnectionGQO emails, EnterpriseServerInstallationGQO enterpriseServerInstallation, String id, Boolean isSiteAdmin, String login, String profileName, java.util.Date remoteCreatedAt, Integer remoteUserId, java.util.Date updatedAt) {
        this.createdAt = createdAt;
        this.emails = emails;
        this.enterpriseServerInstallation = enterpriseServerInstallation;
        this.id = id;
        this.isSiteAdmin = isSiteAdmin;
        this.login = login;
        this.profileName = profileName;
        this.remoteCreatedAt = remoteCreatedAt;
        this.remoteUserId = remoteUserId;
        this.updatedAt = updatedAt;
    }

    public java.util.Date getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    public EnterpriseServerUserAccountEmailConnectionGQO getEmails() {
        return emails;
    }
    public void setEmails(EnterpriseServerUserAccountEmailConnectionGQO emails) {
        this.emails = emails;
    }

    public EnterpriseServerInstallationGQO getEnterpriseServerInstallation() {
        return enterpriseServerInstallation;
    }
    public void setEnterpriseServerInstallation(EnterpriseServerInstallationGQO enterpriseServerInstallation) {
        this.enterpriseServerInstallation = enterpriseServerInstallation;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public Boolean getIsSiteAdmin() {
        return isSiteAdmin;
    }
    public void setIsSiteAdmin(Boolean isSiteAdmin) {
        this.isSiteAdmin = isSiteAdmin;
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

    public java.util.Date getRemoteCreatedAt() {
        return remoteCreatedAt;
    }
    public void setRemoteCreatedAt(java.util.Date remoteCreatedAt) {
        this.remoteCreatedAt = remoteCreatedAt;
    }

    public Integer getRemoteUserId() {
        return remoteUserId;
    }
    public void setRemoteUserId(Integer remoteUserId) {
        this.remoteUserId = remoteUserId;
    }

    public java.util.Date getUpdatedAt() {
        return updatedAt;
    }
    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

}