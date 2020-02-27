package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class EnterpriseServerUserAccountEmailGQO implements NodeGQO{

    @javax.validation.constraints.NotNull
    private java.util.Date createdAt;
    @javax.validation.constraints.NotNull
    private String email;
    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private Boolean isPrimary;
    @javax.validation.constraints.NotNull
    private java.util.Date updatedAt;
    @javax.validation.constraints.NotNull
    private EnterpriseServerUserAccountGQO userAccount;

    public EnterpriseServerUserAccountEmailGQO() {
    }

    public EnterpriseServerUserAccountEmailGQO(java.util.Date createdAt, String email, String id, Boolean isPrimary, java.util.Date updatedAt, EnterpriseServerUserAccountGQO userAccount) {
        this.createdAt = createdAt;
        this.email = email;
        this.id = id;
        this.isPrimary = isPrimary;
        this.updatedAt = updatedAt;
        this.userAccount = userAccount;
    }

    public java.util.Date getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public Boolean getIsPrimary() {
        return isPrimary;
    }
    public void setIsPrimary(Boolean isPrimary) {
        this.isPrimary = isPrimary;
    }

    public java.util.Date getUpdatedAt() {
        return updatedAt;
    }
    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public EnterpriseServerUserAccountGQO getUserAccount() {
        return userAccount;
    }
    public void setUserAccount(EnterpriseServerUserAccountGQO userAccount) {
        this.userAccount = userAccount;
    }

}