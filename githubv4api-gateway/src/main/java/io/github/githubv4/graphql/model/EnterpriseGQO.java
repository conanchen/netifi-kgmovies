package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class EnterpriseGQO implements NodeGQO{

    @javax.validation.constraints.NotNull
    private String avatarUrl;
    private EnterpriseBillingInfoGQO billingInfo;
    @javax.validation.constraints.NotNull
    private java.util.Date createdAt;
    private Integer databaseId;
    private String description;
    @javax.validation.constraints.NotNull
    private String descriptionHTML;
    @javax.validation.constraints.NotNull
    private String id;
    private String location;
    @javax.validation.constraints.NotNull
    private EnterpriseMemberConnectionGQO members;
    @javax.validation.constraints.NotNull
    private String name;
    @javax.validation.constraints.NotNull
    private OrganizationConnectionGQO organizations;
    private EnterpriseOwnerInfoGQO ownerInfo;
    @javax.validation.constraints.NotNull
    private String resourcePath;
    @javax.validation.constraints.NotNull
    private String url;
    @javax.validation.constraints.NotNull
    private EnterpriseUserAccountConnectionGQO userAccounts;
    @javax.validation.constraints.NotNull
    private Boolean viewerIsAdmin;
    private String websiteUrl;

    public EnterpriseGQO() {
    }

    public EnterpriseGQO(String avatarUrl, EnterpriseBillingInfoGQO billingInfo, java.util.Date createdAt, Integer databaseId, String description, String descriptionHTML, String id, String location, EnterpriseMemberConnectionGQO members, String name, OrganizationConnectionGQO organizations, EnterpriseOwnerInfoGQO ownerInfo, String resourcePath, String url, EnterpriseUserAccountConnectionGQO userAccounts, Boolean viewerIsAdmin, String websiteUrl) {
        this.avatarUrl = avatarUrl;
        this.billingInfo = billingInfo;
        this.createdAt = createdAt;
        this.databaseId = databaseId;
        this.description = description;
        this.descriptionHTML = descriptionHTML;
        this.id = id;
        this.location = location;
        this.members = members;
        this.name = name;
        this.organizations = organizations;
        this.ownerInfo = ownerInfo;
        this.resourcePath = resourcePath;
        this.url = url;
        this.userAccounts = userAccounts;
        this.viewerIsAdmin = viewerIsAdmin;
        this.websiteUrl = websiteUrl;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }
    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public EnterpriseBillingInfoGQO getBillingInfo() {
        return billingInfo;
    }
    public void setBillingInfo(EnterpriseBillingInfoGQO billingInfo) {
        this.billingInfo = billingInfo;
    }

    public java.util.Date getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
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

    public String getDescriptionHTML() {
        return descriptionHTML;
    }
    public void setDescriptionHTML(String descriptionHTML) {
        this.descriptionHTML = descriptionHTML;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }

    public EnterpriseMemberConnectionGQO getMembers() {
        return members;
    }
    public void setMembers(EnterpriseMemberConnectionGQO members) {
        this.members = members;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public OrganizationConnectionGQO getOrganizations() {
        return organizations;
    }
    public void setOrganizations(OrganizationConnectionGQO organizations) {
        this.organizations = organizations;
    }

    public EnterpriseOwnerInfoGQO getOwnerInfo() {
        return ownerInfo;
    }
    public void setOwnerInfo(EnterpriseOwnerInfoGQO ownerInfo) {
        this.ownerInfo = ownerInfo;
    }

    public String getResourcePath() {
        return resourcePath;
    }
    public void setResourcePath(String resourcePath) {
        this.resourcePath = resourcePath;
    }

    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }

    public EnterpriseUserAccountConnectionGQO getUserAccounts() {
        return userAccounts;
    }
    public void setUserAccounts(EnterpriseUserAccountConnectionGQO userAccounts) {
        this.userAccounts = userAccounts;
    }

    public Boolean getViewerIsAdmin() {
        return viewerIsAdmin;
    }
    public void setViewerIsAdmin(Boolean viewerIsAdmin) {
        this.viewerIsAdmin = viewerIsAdmin;
    }

    public String getWebsiteUrl() {
        return websiteUrl;
    }
    public void setWebsiteUrl(String websiteUrl) {
        this.websiteUrl = websiteUrl;
    }

}