package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class ExternalIdentityGQO implements NodeGQO{

    @javax.validation.constraints.NotNull
    private String guid;
    @javax.validation.constraints.NotNull
    private String id;
    private OrganizationInvitationGQO organizationInvitation;
    private ExternalIdentitySamlAttributesGQO samlIdentity;
    private ExternalIdentityScimAttributesGQO scimIdentity;
    private UserGQO user;

    public ExternalIdentityGQO() {
    }

    public ExternalIdentityGQO(String guid, String id, OrganizationInvitationGQO organizationInvitation, ExternalIdentitySamlAttributesGQO samlIdentity, ExternalIdentityScimAttributesGQO scimIdentity, UserGQO user) {
        this.guid = guid;
        this.id = id;
        this.organizationInvitation = organizationInvitation;
        this.samlIdentity = samlIdentity;
        this.scimIdentity = scimIdentity;
        this.user = user;
    }

    public String getGuid() {
        return guid;
    }
    public void setGuid(String guid) {
        this.guid = guid;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public OrganizationInvitationGQO getOrganizationInvitation() {
        return organizationInvitation;
    }
    public void setOrganizationInvitation(OrganizationInvitationGQO organizationInvitation) {
        this.organizationInvitation = organizationInvitation;
    }

    public ExternalIdentitySamlAttributesGQO getSamlIdentity() {
        return samlIdentity;
    }
    public void setSamlIdentity(ExternalIdentitySamlAttributesGQO samlIdentity) {
        this.samlIdentity = samlIdentity;
    }

    public ExternalIdentityScimAttributesGQO getScimIdentity() {
        return scimIdentity;
    }
    public void setScimIdentity(ExternalIdentityScimAttributesGQO scimIdentity) {
        this.scimIdentity = scimIdentity;
    }

    public UserGQO getUser() {
        return user;
    }
    public void setUser(UserGQO user) {
        this.user = user;
    }

}