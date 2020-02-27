package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class OrganizationInvitationGQO implements NodeGQO{

    @javax.validation.constraints.NotNull
    private java.util.Date createdAt;
    private String email;
    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private OrganizationInvitationTypeGQO invitationType;
    private UserGQO invitee;
    @javax.validation.constraints.NotNull
    private UserGQO inviter;
    @javax.validation.constraints.NotNull
    private OrganizationGQO organization;
    @javax.validation.constraints.NotNull
    private OrganizationInvitationRoleGQO role;

    public OrganizationInvitationGQO() {
    }

    public OrganizationInvitationGQO(java.util.Date createdAt, String email, String id, OrganizationInvitationTypeGQO invitationType, UserGQO invitee, UserGQO inviter, OrganizationGQO organization, OrganizationInvitationRoleGQO role) {
        this.createdAt = createdAt;
        this.email = email;
        this.id = id;
        this.invitationType = invitationType;
        this.invitee = invitee;
        this.inviter = inviter;
        this.organization = organization;
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

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public OrganizationInvitationTypeGQO getInvitationType() {
        return invitationType;
    }
    public void setInvitationType(OrganizationInvitationTypeGQO invitationType) {
        this.invitationType = invitationType;
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

    public OrganizationGQO getOrganization() {
        return organization;
    }
    public void setOrganization(OrganizationGQO organization) {
        this.organization = organization;
    }

    public OrganizationInvitationRoleGQO getRole() {
        return role;
    }
    public void setRole(OrganizationInvitationRoleGQO role) {
        this.role = role;
    }

}