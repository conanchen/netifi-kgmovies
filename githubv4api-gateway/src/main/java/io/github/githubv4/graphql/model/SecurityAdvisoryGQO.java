package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class SecurityAdvisoryGQO implements NodeGQO{

    private Integer databaseId;
    @javax.validation.constraints.NotNull
    private String description;
    @javax.validation.constraints.NotNull
    private String ghsaId;
    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private Collection<SecurityAdvisoryIdentifierGQO> identifiers;
    @javax.validation.constraints.NotNull
    private String origin;
    @javax.validation.constraints.NotNull
    private java.util.Date publishedAt;
    @javax.validation.constraints.NotNull
    private Collection<SecurityAdvisoryReferenceGQO> references;
    @javax.validation.constraints.NotNull
    private SecurityAdvisorySeverityGQO severity;
    @javax.validation.constraints.NotNull
    private String summary;
    @javax.validation.constraints.NotNull
    private java.util.Date updatedAt;
    @javax.validation.constraints.NotNull
    private SecurityVulnerabilityConnectionGQO vulnerabilities;
    private java.util.Date withdrawnAt;

    public SecurityAdvisoryGQO() {
    }

    public SecurityAdvisoryGQO(Integer databaseId, String description, String ghsaId, String id, Collection<SecurityAdvisoryIdentifierGQO> identifiers, String origin, java.util.Date publishedAt, Collection<SecurityAdvisoryReferenceGQO> references, SecurityAdvisorySeverityGQO severity, String summary, java.util.Date updatedAt, SecurityVulnerabilityConnectionGQO vulnerabilities, java.util.Date withdrawnAt) {
        this.databaseId = databaseId;
        this.description = description;
        this.ghsaId = ghsaId;
        this.id = id;
        this.identifiers = identifiers;
        this.origin = origin;
        this.publishedAt = publishedAt;
        this.references = references;
        this.severity = severity;
        this.summary = summary;
        this.updatedAt = updatedAt;
        this.vulnerabilities = vulnerabilities;
        this.withdrawnAt = withdrawnAt;
    }

    public Integer getDatabaseId() {
        return databaseId;
    }
    public void setDatabaseId(Integer databaseId) {
        this.databaseId = databaseId;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public String getGhsaId() {
        return ghsaId;
    }
    public void setGhsaId(String ghsaId) {
        this.ghsaId = ghsaId;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public Collection<SecurityAdvisoryIdentifierGQO> getIdentifiers() {
        return identifiers;
    }
    public void setIdentifiers(Collection<SecurityAdvisoryIdentifierGQO> identifiers) {
        this.identifiers = identifiers;
    }

    public String getOrigin() {
        return origin;
    }
    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public java.util.Date getPublishedAt() {
        return publishedAt;
    }
    public void setPublishedAt(java.util.Date publishedAt) {
        this.publishedAt = publishedAt;
    }

    public Collection<SecurityAdvisoryReferenceGQO> getReferences() {
        return references;
    }
    public void setReferences(Collection<SecurityAdvisoryReferenceGQO> references) {
        this.references = references;
    }

    public SecurityAdvisorySeverityGQO getSeverity() {
        return severity;
    }
    public void setSeverity(SecurityAdvisorySeverityGQO severity) {
        this.severity = severity;
    }

    public String getSummary() {
        return summary;
    }
    public void setSummary(String summary) {
        this.summary = summary;
    }

    public java.util.Date getUpdatedAt() {
        return updatedAt;
    }
    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public SecurityVulnerabilityConnectionGQO getVulnerabilities() {
        return vulnerabilities;
    }
    public void setVulnerabilities(SecurityVulnerabilityConnectionGQO vulnerabilities) {
        this.vulnerabilities = vulnerabilities;
    }

    public java.util.Date getWithdrawnAt() {
        return withdrawnAt;
    }
    public void setWithdrawnAt(java.util.Date withdrawnAt) {
        this.withdrawnAt = withdrawnAt;
    }

}