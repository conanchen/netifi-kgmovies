package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class EnterpriseIdentityProviderGQO implements NodeGQO{

    private SamlDigestAlgorithmGQO digestMethod;
    private EnterpriseGQO enterprise;
    @javax.validation.constraints.NotNull
    private ExternalIdentityConnectionGQO externalIdentities;
    @javax.validation.constraints.NotNull
    private String id;
    private String idpCertificate;
    private String issuer;
    @javax.validation.constraints.NotNull
    private Collection<String> recoveryCodes;
    private SamlSignatureAlgorithmGQO signatureMethod;
    private String ssoUrl;

    public EnterpriseIdentityProviderGQO() {
    }

    public EnterpriseIdentityProviderGQO(SamlDigestAlgorithmGQO digestMethod, EnterpriseGQO enterprise, ExternalIdentityConnectionGQO externalIdentities, String id, String idpCertificate, String issuer, Collection<String> recoveryCodes, SamlSignatureAlgorithmGQO signatureMethod, String ssoUrl) {
        this.digestMethod = digestMethod;
        this.enterprise = enterprise;
        this.externalIdentities = externalIdentities;
        this.id = id;
        this.idpCertificate = idpCertificate;
        this.issuer = issuer;
        this.recoveryCodes = recoveryCodes;
        this.signatureMethod = signatureMethod;
        this.ssoUrl = ssoUrl;
    }

    public SamlDigestAlgorithmGQO getDigestMethod() {
        return digestMethod;
    }
    public void setDigestMethod(SamlDigestAlgorithmGQO digestMethod) {
        this.digestMethod = digestMethod;
    }

    public EnterpriseGQO getEnterprise() {
        return enterprise;
    }
    public void setEnterprise(EnterpriseGQO enterprise) {
        this.enterprise = enterprise;
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

    public Collection<String> getRecoveryCodes() {
        return recoveryCodes;
    }
    public void setRecoveryCodes(Collection<String> recoveryCodes) {
        this.recoveryCodes = recoveryCodes;
    }

    public SamlSignatureAlgorithmGQO getSignatureMethod() {
        return signatureMethod;
    }
    public void setSignatureMethod(SamlSignatureAlgorithmGQO signatureMethod) {
        this.signatureMethod = signatureMethod;
    }

    public String getSsoUrl() {
        return ssoUrl;
    }
    public void setSsoUrl(String ssoUrl) {
        this.ssoUrl = ssoUrl;
    }

}