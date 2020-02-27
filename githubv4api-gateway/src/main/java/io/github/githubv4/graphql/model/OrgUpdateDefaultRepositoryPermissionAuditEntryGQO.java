package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class OrgUpdateDefaultRepositoryPermissionAuditEntryGQO implements OrganizationAuditEntryGQO, AuditEntryGQO, NodeGQO, OrganizationAuditEntryDataGQO{

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
    @javax.validation.constraints.NotNull
    private String id;
    private OperationTypeGQO operationType;
    private OrganizationGQO organization;
    private String organizationName;
    private String organizationResourcePath;
    private String organizationUrl;
    private OrgUpdateDefaultRepositoryPermissionAuditEntryPermissionGQO permission;
    private OrgUpdateDefaultRepositoryPermissionAuditEntryPermissionGQO permissionWas;
    private UserGQO user;
    private String userLogin;
    private String userResourcePath;
    private String userUrl;

    public OrgUpdateDefaultRepositoryPermissionAuditEntryGQO() {
    }

    public OrgUpdateDefaultRepositoryPermissionAuditEntryGQO(String action, AuditEntryActorGQO actor, String actorIp, ActorLocationGQO actorLocation, String actorLogin, String actorResourcePath, String actorUrl, String createdAt, String id, OperationTypeGQO operationType, OrganizationGQO organization, String organizationName, String organizationResourcePath, String organizationUrl, OrgUpdateDefaultRepositoryPermissionAuditEntryPermissionGQO permission, OrgUpdateDefaultRepositoryPermissionAuditEntryPermissionGQO permissionWas, UserGQO user, String userLogin, String userResourcePath, String userUrl) {
        this.action = action;
        this.actor = actor;
        this.actorIp = actorIp;
        this.actorLocation = actorLocation;
        this.actorLogin = actorLogin;
        this.actorResourcePath = actorResourcePath;
        this.actorUrl = actorUrl;
        this.createdAt = createdAt;
        this.id = id;
        this.operationType = operationType;
        this.organization = organization;
        this.organizationName = organizationName;
        this.organizationResourcePath = organizationResourcePath;
        this.organizationUrl = organizationUrl;
        this.permission = permission;
        this.permissionWas = permissionWas;
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

    public OrgUpdateDefaultRepositoryPermissionAuditEntryPermissionGQO getPermission() {
        return permission;
    }
    public void setPermission(OrgUpdateDefaultRepositoryPermissionAuditEntryPermissionGQO permission) {
        this.permission = permission;
    }

    public OrgUpdateDefaultRepositoryPermissionAuditEntryPermissionGQO getPermissionWas() {
        return permissionWas;
    }
    public void setPermissionWas(OrgUpdateDefaultRepositoryPermissionAuditEntryPermissionGQO permissionWas) {
        this.permissionWas = permissionWas;
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