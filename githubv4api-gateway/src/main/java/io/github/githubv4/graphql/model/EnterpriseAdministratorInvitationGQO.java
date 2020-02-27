package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class EnterpriseAdministratorInvitationGQO implements NodeGQO{

    @javax.validation.constraints.NotNull
    private java.util.Date createdAt;
    private String email;
    @javax.validation.constraints.NotNull
    private EnterpriseGQO enterprise;
    @javax.validation.constraints.NotNull
    private String id;
    private UserGQO invitee;
    private UserGQO inviter;
    @javax.validation.constraints.NotNull
    private EnterpriseAdministratorRoleGQO role;

    public EnterpriseAdministratorInvitationGQO() {
    }

    public EnterpriseAdministratorInvitationGQO(java.util.Date createdAt, String email, EnterpriseGQO enterprise, String id, UserGQO invitee, UserGQO inviter, EnterpriseAdministratorRoleGQO role) {
        this.createdAt = createdAt;
        this.email = email;
        this.enterprise = enterprise;
        this.id = id;
        this.invitee = invitee;
        this.inviter = inviter;
        this.role = role;
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

    public EnterpriseGQO getEnterprise() {
        return enterprise;
    }
    public void setEnterprise(EnterpriseGQO enterprise) {
        this.enterprise = enterprise;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public UserGQO getInvitee() {
        return invitee;
    }
    public void setInvitee(UserGQO invitee) {
        this.invitee = invitee;
    }

    public UserGQO getInviter() {
        return inviter;
    }
    public void setInviter(UserGQO inviter) {
        this.inviter = inviter;
    }

    public EnterpriseAdministratorRoleGQO getRole() {
        return role;
    }
    public void setRole(EnterpriseAdministratorRoleGQO role) {
        this.role = role;
    }

}