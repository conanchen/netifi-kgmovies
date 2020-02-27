package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class OrganizationIdentityProviderGQO implements NodeGQO{

    private String digestMethod;
    @javax.validation.constraints.NotNull
    private ExternalIdentityConnectionGQO externalIdentities;
    @javax.validation.constraints.NotNull
    private String id;
    private String idpCertificate;
    private String issuer;
    private OrganizationGQO organization;
    private String signatureMethod;
    private String ssoUrl;

    public OrganizationIdentityProviderGQO() {
    }

    public OrganizationIdentityProviderGQO(String digestMethod, ExternalIdentityConnectionGQO externalIdentities, String id, String idpCertificate, String issuer, OrganizationGQO organization, String signatureMethod, String ssoUrl) {
        this.digestMethod = digestMethod;
        this.externalIdentities = externalIdentities;
        this.id = id;
        this.idpCertificate = idpCertificate;
        this.issuer = issuer;
        this.organization = organization;
        this.signatureMethod = signatureMethod;
        this.ssoUrl = ssoUrl;
    }

    public String getDigestMethod() {
        return digestMethod;
    }
    public void setDigestMethod(String digestMethod) {
        this.digestMethod = digestMethod;
    }

    public ExternalIdentityConnectionGQO getExternalIdentities() {
        return externalIdentities;
    }
    public void setExternalIdentities(ExternalIdentityConnectionGQO externalIdentities) {
        this.externalIdentities = externalIdentities;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getIdpCertificate() {
        return idpCertificate;
    }
    public void setIdpCertificate(String idpCertificate) {
        this.idpCertificate = idpCertificate;
    }

    public String getIssuer() {
        return issuer;
    }
    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }

    public OrganizationGQO getOrganization() {
        return organization;
    }
    public void setOrganization(OrganizationGQO organization) {
        this.organization = organization;
    }

    public String getSignatureMethod() {
        return signatureMethod;
    }
    public void setSignatureMethod(String signatureMethod) {
        this.signatureMethod = signatureMethod;
    }

    public String getSsoUrl() {
        return ssoUrl;
    }
    public void setSsoUrl(String ssoUrl) {
        this.ssoUrl = ssoUrl;
    }

}