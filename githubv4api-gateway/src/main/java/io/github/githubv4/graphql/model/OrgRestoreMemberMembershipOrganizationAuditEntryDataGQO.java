package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class OrgRestoreMemberMembershipOrganizationAuditEntryDataGQO implements OrgRestoreMemberAuditEntryMembershipGQO, OrganizationAuditEntryDataGQO{

    private OrganizationGQO organization;
    private String organizationName;
    private String organizationResourcePath;
    private String organizationUrl;

    public OrgRestoreMemberMembershipOrganizationAuditEntryDataGQO() {
    }

    public OrgRestoreMemberMembershipOrganizationAuditEntryDataGQO(OrganizationGQO organization, String organizationName, String organizationResourcePath, String organizationUrl) {
        this.organization = organization;
        this.organizationName = organizationName;
        this.organizationResourcePath = organizationResourcePath;
        this.organizationUrl = organizationUrl;
    }

    public OrganizationGQO getOrganization() {
        return organization;
    }
    public void setOrganization(OrganizationGQO organization) {
        this.organization = organization;
    }

    public String getOrganizationName() {
        return organizationName;
    }
    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public String getOrganizationResourcePath() {
        return organizationResourcePath;
    }
    public void setOrganizationResourcePath(String organizationResourcePath) {
        this.organizationResourcePath = organizationResourcePath;
    }

    public String getOrganizationUrl() {
        return organizationUrl;
    }
    public void setOrganizationUrl(String organizationUrl) {
        this.organizationUrl = organizationUrl;
    }

}