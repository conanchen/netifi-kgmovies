package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class TeamChangeParentTeamAuditEntryGQO implements OrganizationAuditEntryGQO, AuditEntryGQO, NodeGQO, OrganizationAuditEntryDataGQO, TeamAuditEntryDataGQO{

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
    private Boolean isLdapMapped;
    private OperationTypeGQO operationType;
    private OrganizationGQO organization;
    private String organizationName;
    private String organizationResourcePath;
    private String organizationUrl;
    private TeamGQO parentTeam;
    private String parentTeamName;
    private String parentTeamNameWas;
    private String parentTeamResourcePath;
    private String parentTeamUrl;
    private TeamGQO parentTeamWas;
    private String parentTeamWasResourcePath;
    private String parentTeamWasUrl;
    private TeamGQO team;
    private String teamName;
    private String teamResourcePath;
    private String teamUrl;
    private UserGQO user;
    private String userLogin;
    private String userResourcePath;
    private String userUrl;

    public TeamChangeParentTeamAuditEntryGQO() {
    }

    public TeamChangeParentTeamAuditEntryGQO(String action, AuditEntryActorGQO actor, String actorIp, ActorLocationGQO actorLocation, String actorLogin, String actorResourcePath, String actorUrl, String createdAt, String id, Boolean isLdapMapped, OperationTypeGQO operationType, OrganizationGQO organization, String organizationName, String organizationResourcePath, String organizationUrl, TeamGQO parentTeam, String parentTeamName, String parentTeamNameWas, String parentTeamResourcePath, String parentTeamUrl, TeamGQO parentTeamWas, String parentTeamWasResourcePath, String parentTeamWasUrl, TeamGQO team, String teamName, String teamResourcePath, String teamUrl, UserGQO user, String userLogin, String userResourcePath, String userUrl) {
        this.action = action;
        this.actor = actor;
        this.actorIp = actorIp;
        this.actorLocation = actorLocation;
        this.actorLogin = actorLogin;
        this.actorResourcePath = actorResourcePath;
        this.actorUrl = actorUrl;
        this.createdAt = createdAt;
        this.id = id;
        this.isLdapMapped = isLdapMapped;
        this.operationType = operationType;
        this.organization = organization;
        this.organizationName = organizationName;
        this.organizationResourcePath = organizationResourcePath;
        this.organizationUrl = organizationUrl;
        this.parentTeam = parentTeam;
        this.parentTeamName = parentTeamName;
        this.parentTeamNameWas = parentTeamNameWas;
        this.parentTeamResourcePath = parentTeamResourcePath;
        this.parentTeamUrl = parentTeamUrl;
        this.parentTeamWas = parentTeamWas;
        this.parentTeamWasResourcePath = parentTeamWasResourcePath;
        this.parentTeamWasUrl = parentTeamWasUrl;
        this.team = team;
        this.teamName = teamName;
        this.teamResourcePath = teamResourcePath;
        this.teamUrl = teamUrl;
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

    public Boolean getIsLdapMapped() {
        return isLdapMapped;
    }
    public void setIsLdapMapped(Boolean isLdapMapped) {
        this.isLdapMapped = isLdapMapped;
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

    public TeamGQO getParentTeam() {
        return parentTeam;
    }
    public void setParentTeam(TeamGQO parentTeam) {
        this.parentTeam = parentTeam;
    }

    public String getParentTeamName() {
        return parentTeamName;
    }
    public void setParentTeamName(String parentTeamName) {
        this.parentTeamName = parentTeamName;
    }

    public String getParentTeamNameWas() {
        return parentTeamNameWas;
    }
    public void setParentTeamNameWas(String parentTeamNameWas) {
        this.parentTeamNameWas = parentTeamNameWas;
    }

    public String getParentTeamResourcePath() {
        return parentTeamResourcePath;
    }
    public void setParentTeamResourcePath(String parentTeamResourcePath) {
        this.parentTeamResourcePath = parentTeamResourcePath;
    }

    public String getParentTeamUrl() {
        return parentTeamUrl;
    }
    public void setParentTeamUrl(String parentTeamUrl) {
        this.parentTeamUrl = parentTeamUrl;
    }

    public TeamGQO getParentTeamWas() {
        return parentTeamWas;
    }
    public void setParentTeamWas(TeamGQO parentTeamWas) {
        this.parentTeamWas = parentTeamWas;
    }

    public String getParentTeamWasResourcePath() {
        return parentTeamWasResourcePath;
    }
    public void setParentTeamWasResourcePath(String parentTeamWasResourcePath) {
        this.parentTeamWasResourcePath = parentTeamWasResourcePath;
    }

    public String getParentTeamWasUrl() {
        return parentTeamWasUrl;
    }
    public void setParentTeamWasUrl(String parentTeamWasUrl) {
        this.parentTeamWasUrl = parentTeamWasUrl;
    }

    public TeamGQO getTeam() {
        return team;
    }
    public void setTeam(TeamGQO team) {
        this.team = team;
    }

    public String getTeamName() {
        return teamName;
    }
    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getTeamResourcePath() {
        return teamResourcePath;
    }
    public void setTeamResourcePath(String teamResourcePath) {
        this.teamResourcePath = teamResourcePath;
    }

    public String getTeamUrl() {
        return teamUrl;
    }
    public void setTeamUrl(String teamUrl) {
        this.teamUrl = teamUrl;
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