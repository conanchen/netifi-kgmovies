package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class EnterpriseServerUserAccountsUploadGQO implements NodeGQO{

    @javax.validation.constraints.NotNull
    private java.util.Date createdAt;
    @javax.validation.constraints.NotNull
    private EnterpriseGQO enterprise;
    @javax.validation.constraints.NotNull
    private EnterpriseServerInstallationGQO enterpriseServerInstallation;
    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private String name;
    @javax.validation.constraints.NotNull
    private EnterpriseServerUserAccountsUploadSyncStateGQO syncState;
    @javax.validation.constraints.NotNull
    private java.util.Date updatedAt;

    public EnterpriseServerUserAccountsUploadGQO() {
    }

    public EnterpriseServerUserAccountsUploadGQO(java.util.Date createdAt, EnterpriseGQO enterprise, EnterpriseServerInstallationGQO enterpriseServerInstallation, String id, String name, EnterpriseServerUserAccountsUploadSyncStateGQO syncState, java.util.Date updatedAt) {
        this.createdAt = createdAt;
        this.enterprise = enterprise;
        this.enterpriseServerInstallation = enterpriseServerInstallation;
        this.id = id;
        this.name = name;
        this.syncState = syncState;
        this.updatedAt = updatedAt;
    }

    public java.util.Date getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    public EnterpriseGQO getEnterprise() {
        return enterprise;
    }
    public void setEnterprise(EnterpriseGQO enterprise) {
        this.enterprise = enterprise;
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

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public EnterpriseServerUserAccountsUploadSyncStateGQO getSyncState() {
        return syncState;
    }
    public void setSyncState(EnterpriseServerUserAccountsUploadSyncStateGQO syncState) {
        this.syncState = syncState;
    }

    public java.util.Date getUpdatedAt() {
        return updatedAt;
    }
    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

}