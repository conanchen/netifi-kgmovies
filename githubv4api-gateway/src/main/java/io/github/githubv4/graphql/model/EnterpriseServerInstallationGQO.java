package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class EnterpriseServerInstallationGQO implements NodeGQO{

    @javax.validation.constraints.NotNull
    private java.util.Date createdAt;
    @javax.validation.constraints.NotNull
    private String customerName;
    @javax.validation.constraints.NotNull
    private String hostName;
    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private Boolean isConnected;
    @javax.validation.constraints.NotNull
    private java.util.Date updatedAt;
    @javax.validation.constraints.NotNull
    private EnterpriseServerUserAccountConnectionGQO userAccounts;
    @javax.validation.constraints.NotNull
    private EnterpriseServerUserAccountsUploadConnectionGQO userAccountsUploads;

    public EnterpriseServerInstallationGQO() {
    }

    public EnterpriseServerInstallationGQO(java.util.Date createdAt, String customerName, String hostName, String id, Boolean isConnected, java.util.Date updatedAt, EnterpriseServerUserAccountConnectionGQO userAccounts, EnterpriseServerUserAccountsUploadConnectionGQO userAccountsUploads) {
        this.createdAt = createdAt;
        this.customerName = customerName;
        this.hostName = hostName;
        this.id = id;
        this.isConnected = isConnected;
        this.updatedAt = updatedAt;
        this.userAccounts = userAccounts;
        this.userAccountsUploads = userAccountsUploads;
    }

    public java.util.Date getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    public String getCustomerName() {
        return customerName;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getHostName() {
        return hostName;
    }
    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public Boolean getIsConnected() {
        return isConnected;
    }
    public void setIsConnected(Boolean isConnected) {
        this.isConnected = isConnected;
    }

    public java.util.Date getUpdatedAt() {
        return updatedAt;
    }
    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public EnterpriseServerUserAccountConnectionGQO getUserAccounts() {
        return userAccounts;
    }
    public void setUserAccounts(EnterpriseServerUserAccountConnectionGQO userAccounts) {
        this.userAccounts = userAccounts;
    }

    public EnterpriseServerUserAccountsUploadConnectionGQO getUserAccountsUploads() {
        return userAccountsUploads;
    }
    public void setUserAccountsUploads(EnterpriseServerUserAccountsUploadConnectionGQO userAccountsUploads) {
        this.userAccountsUploads = userAccountsUploads;
    }

}