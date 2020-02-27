package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class TeamRemoveRepositoryAuditEntryGQO implements OrganizationAuditEntryGQO, AuditEntryGQO, NodeGQO, OrganizationAuditEntryDataGQO, RepositoryAuditEntryDataGQO, TeamAuditEntryDataGQO{

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
    private RepositoryGQO repository;
    private String repositoryName;
    private String repositoryResourcePath;
    private String repositoryUrl;
    private TeamGQO team;
    private String teamName;
    private String teamResourcePath;
    private String teamUrl;
    private UserGQO user;
    private String userLogin;
    private String userResourcePath;
    private String userUrl;

    public TeamRemoveRepositoryAuditEntryGQO() {
    }

    public TeamRemoveRepositoryAuditEntryGQO(String action, AuditEntryActorGQO actor, String actorIp, ActorLocationGQO actorLocation, String actorLogin, String actorResourcePath, String actorUrl, String createdAt, String id, Boolean isLdapMapped, OperationTypeGQO operationType, OrganizationGQO organization, String organizationName, String organizationResourcePath, String organizationUrl, RepositoryGQO repository, String repositoryName, String repositoryResourcePath, String repositoryUrl, TeamGQO team, String teamName, String teamResourcePath, String teamUrl, UserGQO user, String userLogin, String userResourcePath, String userUrl) {
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
        this.repository = repository;
        this.repositoryName = repositoryName;
        this.repositoryResourcePath = repositoryResourcePath;
        this.repositoryUrl = repositoryUrl;
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

    public RepositoryGQO getRepository() {
        return repository;
    }
    public void setRepository(RepositoryGQO repository) {
        this.repository = repository;
    }

    public String getRepositoryName() {
        return repositoryName;
    }
    public void setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
    }

    public String getRepositoryResourcePath() {
        return repositoryResourcePath;
    }
    public void setRepositoryResourcePath(String repositoryResourcePath) {
        this.repositoryResourcePath = repositoryResourcePath;
    }

    public String getRepositoryUrl() {
        return repositoryUrl;
    }
    public void setRepositoryUrl(String repositoryUrl) {
        this.repositoryUrl = repositoryUrl;
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