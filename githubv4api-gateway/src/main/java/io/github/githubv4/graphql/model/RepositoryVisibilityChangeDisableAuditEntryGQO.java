package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class RepositoryVisibilityChangeDisableAuditEntryGQO implements OrganizationAuditEntryGQO, AuditEntryGQO, EnterpriseAuditEntryDataGQO, NodeGQO, OrganizationAuditEntryDataGQO{

    @javax.validation.constraints.NotNull
    private String action;
    private AuditEntryActorGQO actor;
    private String actorIp;
    private ActorLocationGQO actorLocation;
    private String actorLogin;
    private String actorResourcePath;
    private String actorUrl;
    @javax.validation.constraints.NotNull
    private String createdAt;
    private String enterpriseResourcePath;
    private String enterpriseSlug;
    private String enterpriseUrl;
    @javax.validation.constraints.NotNull
    private String id;
    private OperationTypeGQO operationType;
    private OrganizationGQO organization;
    private String organizationName;
    private String organizationResourcePath;
    private String organizationUrl;
    private UserGQO user;
    private String userLogin;
    private String userResourcePath;
    private String userUrl;

    public RepositoryVisibilityChangeDisableAuditEntryGQO() {
    }

    public RepositoryVisibilityChangeDisableAuditEntryGQO(String action, AuditEntryActorGQO actor, String actorIp, ActorLocationGQO actorLocation, String actorLogin, String actorResourcePath, String actorUrl, String createdAt, String enterpriseResourcePath, String enterpriseSlug, String enterpriseUrl, String id, OperationTypeGQO operationType, OrganizationGQO organization, String organizationName, String organizationResourcePath, String organizationUrl, UserGQO user, String userLogin, String userResourcePath, String userUrl) {
        this.action = action;
        this.actor = actor;
        this.actorIp = actorIp;
        this.actorLocation = actorLocation;
        this.actorLogin = actorLogin;
        this.actorResourcePath = actorResourcePath;
        this.actorUrl = actorUrl;
        this.createdAt = createdAt;
        this.enterpriseResourcePath = enterpriseResourcePath;
        this.enterpriseSlug = enterpriseSlug;
        this.enterpriseUrl = enterpriseUrl;
        this.id = id;
        this.operationType = operationType;
        this.organization = organization;
        this.organizationName = organizationName;
        this.organizationResourcePath = organizationResourcePath;
        this.organizationUrl = organizationUrl;
        this.user = user;
        this.userLogin = userLogin;
        this.userResourcePath = userResourcePath;
        this.userUrl = userUrl;
    }

    public String getAction() {
        return action;
    }
    public void setAction(String action) {
        this.action = action;
    }

    public AuditEntryActorGQO getActor() {
        return actor;
    }
    public void setActor(AuditEntryActorGQO actor) {
        this.actor = actor;
    }

    public String getActorIp() {
        return actorIp;
    }
    public void setActorIp(String actorIp) {
        this.actorIp = actorIp;
    }

    public ActorLocationGQO getActorLocation() {
        return actorLocation;
    }
    public void setActorLocation(ActorLocationGQO actorLocation) {
        this.actorLocation = actorLocation;
    }

    public String getActorLogin() {
        return actorLogin;
    }
    public void setActorLogin(String actorLogin) {
        this.actorLogin = actorLogin;
    }

    public String getActorResourcePath() {
        return actorResourcePath;
    }
    public void setActorResourcePath(String actorResourcePath) {
        this.actorResourcePath = actorResourcePath;
    }

    public String getActorUrl() {
        return actorUrl;
    }
    public void setActorUrl(String actorUrl) {
        this.actorUrl = actorUrl;
    }

    public String getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getEnterpriseResourcePath() {
        return enterpriseResourcePath;
    }
    public void setEnterpriseResourcePath(String enterpriseResourcePath) {
        this.enterpriseResourcePath = enterpriseResourcePath;
    }

    public String getEnterpriseSlug() {
        return enterpriseSlug;
    }
    public void setEnterpriseSlug(String enterpriseSlug) {
        this.enterpriseSlug = enterpriseSlug;
    }

    public String getEnterpriseUrl() {
        return enterpriseUrl;
    }
    public void setEnterpriseUrl(String enterpriseUrl) {
        this.enterpriseUrl = enterpriseUrl;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public OperationTypeGQO getOperationType() {
        return operationType;
    }
    public void setOperationType(OperationTypeGQO operationType) {
        this.operationType = operationType;
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

    public UserGQO getUser() {
        return user;
    }
    public void setUser(UserGQO user) {
        this.user = user;
    }

    public String getUserLogin() {
        return userLogin;
    }
    public void setUserLogin(String userLogin) {
        this.userLogin = userLogin;
    }

    public String getUserResourcePath() {
        return userResourcePath;
    }
    public void setUserResourcePath(String userResourcePath) {
        this.userResourcePath = userResourcePath;
    }

    public String getUserUrl() {
        return userUrl;
    }
    public void setUserUrl(String userUrl) {
        this.userUrl = userUrl;
    }

}