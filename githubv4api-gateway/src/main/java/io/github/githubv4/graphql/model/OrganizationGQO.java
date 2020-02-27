package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class OrganizationGQO implements AssigneeGQO, AuditEntryActorGQO, PermissionGranterGQO, SearchResultItemGQO, ActorGQO, MemberStatusableGQO, NodeGQO, PackageOwnerGQO, ProfileOwnerGQO, ProjectOwnerGQO, RegistryPackageOwnerGQO, RegistryPackageSearchGQO, RepositoryOwnerGQO, SponsorableGQO, UniformResourceLocatableGQO{

    @javax.validation.constraints.NotNull
    private Boolean anyPinnableItems;
    @javax.validation.constraints.NotNull
    private OrganizationAuditEntryConnectionGQO auditLog;
    @javax.validation.constraints.NotNull
    private String avatarUrl;
    @javax.validation.constraints.NotNull
    private java.util.Date createdAt;
    private Integer databaseId;
    private String description;
    private String descriptionHTML;
    private String email;
    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private Boolean isVerified;
    @javax.validation.constraints.NotNull
    private ProfileItemShowcaseGQO itemShowcase;
    private String location;
    @javax.validation.constraints.NotNull
    private String login;
    @javax.validation.constraints.NotNull
    private UserStatusConnectionGQO memberStatuses;
    @javax.validation.constraints.NotNull
    private OrganizationMemberConnectionGQO membersWithRole;
    private String name;
    @javax.validation.constraints.NotNull
    private String newTeamResourcePath;
    @javax.validation.constraints.NotNull
    private String newTeamUrl;
    private String organizationBillingEmail;
    @javax.validation.constraints.NotNull
    private PackageConnectionGQO packages;
    @javax.validation.constraints.NotNull
    private UserConnectionGQO pendingMembers;
    @javax.validation.constraints.NotNull
    private PinnableItemConnectionGQO pinnableItems;
    @javax.validation.constraints.NotNull
    private PinnableItemConnectionGQO pinnedItems;
    @javax.validation.constraints.NotNull
    private Integer pinnedItemsRemaining;
    @javax.validation.constraints.NotNull
    private RepositoryConnectionGQO pinnedRepositories;
    private ProjectGQO project;
    @javax.validation.constraints.NotNull
    private ProjectConnectionGQO projects;
    @javax.validation.constraints.NotNull
    private String projectsResourcePath;
    @javax.validation.constraints.NotNull
    private String projectsUrl;
    @javax.validation.constraints.NotNull
    private RegistryPackageConnectionGQO registryPackages;
    @javax.validation.constraints.NotNull
    private RegistryPackageConnectionGQO registryPackagesForQuery;
    @javax.validation.constraints.NotNull
    private RepositoryConnectionGQO repositories;
    private RepositoryGQO repository;
    private Boolean requiresTwoFactorAuthentication;
    @javax.validation.constraints.NotNull
    private String resourcePath;
    private OrganizationIdentityProviderGQO samlIdentityProvider;
    private SponsorsListingGQO sponsorsListing;
    @javax.validation.constraints.NotNull
    private SponsorshipConnectionGQO sponsorshipsAsMaintainer;
    @javax.validation.constraints.NotNull
    private SponsorshipConnectionGQO sponsorshipsAsSponsor;
    private TeamGQO team;
    @javax.validation.constraints.NotNull
    private TeamConnectionGQO teams;
    @javax.validation.constraints.NotNull
    private String teamsResourcePath;
    @javax.validation.constraints.NotNull
    private String teamsUrl;
    @javax.validation.constraints.NotNull
    private java.util.Date updatedAt;
    @javax.validation.constraints.NotNull
    private String url;
    @javax.validation.constraints.NotNull
    private Boolean viewerCanAdminister;
    @javax.validation.constraints.NotNull
    private Boolean viewerCanChangePinnedItems;
    @javax.validation.constraints.NotNull
    private Boolean viewerCanCreateProjects;
    @javax.validation.constraints.NotNull
    private Boolean viewerCanCreateRepositories;
    @javax.validation.constraints.NotNull
    private Boolean viewerCanCreateTeams;
    @javax.validation.constraints.NotNull
    private Boolean viewerIsAMember;
    private String websiteUrl;

    public OrganizationGQO() {
    }

    public OrganizationGQO(Boolean anyPinnableItems, OrganizationAuditEntryConnectionGQO auditLog, String avatarUrl, java.util.Date createdAt, Integer databaseId, String description, String descriptionHTML, String email, String id, Boolean isVerified, ProfileItemShowcaseGQO itemShowcase, String location, String login, UserStatusConnectionGQO memberStatuses, OrganizationMemberConnectionGQO membersWithRole, String name, String newTeamResourcePath, String newTeamUrl, String organizationBillingEmail, PackageConnectionGQO packages, UserConnectionGQO pendingMembers, PinnableItemConnectionGQO pinnableItems, PinnableItemConnectionGQO pinnedItems, Integer pinnedItemsRemaining, RepositoryConnectionGQO pinnedRepositories, ProjectGQO project, ProjectConnectionGQO projects, String projectsResourcePath, String projectsUrl, RegistryPackageConnectionGQO registryPackages, RegistryPackageConnectionGQO registryPackagesForQuery, RepositoryConnectionGQO repositories, RepositoryGQO repository, Boolean requiresTwoFactorAuthentication, String resourcePath, OrganizationIdentityProviderGQO samlIdentityProvider, SponsorsListingGQO sponsorsListing, SponsorshipConnectionGQO sponsorshipsAsMaintainer, SponsorshipConnectionGQO sponsorshipsAsSponsor, TeamGQO team, TeamConnectionGQO teams, String teamsResourcePath, String teamsUrl, java.util.Date updatedAt, String url, Boolean viewerCanAdminister, Boolean viewerCanChangePinnedItems, Boolean viewerCanCreateProjects, Boolean viewerCanCreateRepositories, Boolean viewerCanCreateTeams, Boolean viewerIsAMember, String websiteUrl) {
        this.anyPinnableItems = anyPinnableItems;
        this.auditLog = auditLog;
        this.avatarUrl = avatarUrl;
        this.createdAt = createdAt;
        this.databaseId = databaseId;
        this.description = description;
        this.descriptionHTML = descriptionHTML;
        this.email = email;
        this.id = id;
        this.isVerified = isVerified;
        this.itemShowcase = itemShowcase;
        this.location = location;
        this.login = login;
        this.memberStatuses = memberStatuses;
        this.membersWithRole = membersWithRole;
        this.name = name;
        this.newTeamResourcePath = newTeamResourcePath;
        this.newTeamUrl = newTeamUrl;
        this.organizationBillingEmail = organizationBillingEmail;
        this.packages = packages;
        this.pendingMembers = pendingMembers;
        this.pinnableItems = pinnableItems;
        this.pinnedItems = pinnedItems;
        this.pinnedItemsRemaining = pinnedItemsRemaining;
        this.pinnedRepositories = pinnedRepositories;
        this.project = project;
        this.projects = projects;
        this.projectsResourcePath = projectsResourcePath;
        this.projectsUrl = projectsUrl;
        this.registryPackages = registryPackages;
        this.registryPackagesForQuery = registryPackagesForQuery;
        this.repositories = repositories;
        this.repository = repository;
        this.requiresTwoFactorAuthentication = requiresTwoFactorAuthentication;
        this.resourcePath = resourcePath;
        this.samlIdentityProvider = samlIdentityProvider;
        this.sponsorsListing = sponsorsListing;
        this.sponsorshipsAsMaintainer = sponsorshipsAsMaintainer;
        this.sponsorshipsAsSponsor = sponsorshipsAsSponsor;
        this.team = team;
        this.teams = teams;
        this.teamsResourcePath = teamsResourcePath;
        this.teamsUrl = teamsUrl;
        this.updatedAt = updatedAt;
        this.url = url;
        this.viewerCanAdminister = viewerCanAdminister;
        this.viewerCanChangePinnedItems = viewerCanChangePinnedItems;
        this.viewerCanCreateProjects = viewerCanCreateProjects;
        this.viewerCanCreateRepositories = viewerCanCreateRepositories;
        this.viewerCanCreateTeams = viewerCanCreateTeams;
        this.viewerIsAMember = viewerIsAMember;
        this.websiteUrl = websiteUrl;
    }

    public Boolean getAnyPinnableItems() {
        return anyPinnableItems;
    }
    public void setAnyPinnableItems(Boolean anyPinnableItems) {
        this.anyPinnableItems = anyPinnableItems;
    }

    public OrganizationAuditEntryConnectionGQO getAuditLog() {
        return auditLog;
    }
    public void setAuditLog(OrganizationAuditEntryConnectionGQO auditLog) {
        this.auditLog = auditLog;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }
    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
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

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public Boolean getIsVerified() {
        return isVerified;
    }
    public void setIsVerified(Boolean isVerified) {
        this.isVerified = isVerified;
    }

    public ProfileItemShowcaseGQO getItemShowcase() {
        return itemShowcase;
    }
    public void setItemShowcase(ProfileItemShowcaseGQO itemShowcase) {
        this.itemShowcase = itemShowcase;
    }

    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }

    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }

    public UserStatusConnectionGQO getMemberStatuses() {
        return memberStatuses;
    }
    public void setMemberStatuses(UserStatusConnectionGQO memberStatuses) {
        this.memberStatuses = memberStatuses;
    }

    public OrganizationMemberConnectionGQO getMembersWithRole() {
        return membersWithRole;
    }
    public void setMembersWithRole(OrganizationMemberConnectionGQO membersWithRole) {
        this.membersWithRole = membersWithRole;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getNewTeamResourcePath() {
        return newTeamResourcePath;
    }
    public void setNewTeamResourcePath(String newTeamResourcePath) {
        this.newTeamResourcePath = newTeamResourcePath;
    }

    public String getNewTeamUrl() {
        return newTeamUrl;
    }
    public void setNewTeamUrl(String newTeamUrl) {
        this.newTeamUrl = newTeamUrl;
    }

    public String getOrganizationBillingEmail() {
        return organizationBillingEmail;
    }
    public void setOrganizationBillingEmail(String organizationBillingEmail) {
        this.organizationBillingEmail = organizationBillingEmail;
    }

    public PackageConnectionGQO getPackages() {
        return packages;
    }
    public void setPackages(PackageConnectionGQO packages) {
        this.packages = packages;
    }

    public UserConnectionGQO getPendingMembers() {
        return pendingMembers;
    }
    public void setPendingMembers(UserConnectionGQO pendingMembers) {
        this.pendingMembers = pendingMembers;
    }

    public PinnableItemConnectionGQO getPinnableItems() {
        return pinnableItems;
    }
    public void setPinnableItems(PinnableItemConnectionGQO pinnableItems) {
        this.pinnableItems = pinnableItems;
    }

    public PinnableItemConnectionGQO getPinnedItems() {
        return pinnedItems;
    }
    public void setPinnedItems(PinnableItemConnectionGQO pinnedItems) {
        this.pinnedItems = pinnedItems;
    }

    public Integer getPinnedItemsRemaining() {
        return pinnedItemsRemaining;
    }
    public void setPinnedItemsRemaining(Integer pinnedItemsRemaining) {
        this.pinnedItemsRemaining = pinnedItemsRemaining;
    }

    public RepositoryConnectionGQO getPinnedRepositories() {
        return pinnedRepositories;
    }
    public void setPinnedRepositories(RepositoryConnectionGQO pinnedRepositories) {
        this.pinnedRepositories = pinnedRepositories;
    }

    public ProjectGQO getProject() {
        return project;
    }
    public void setProject(ProjectGQO project) {
        this.project = project;
    }

    public ProjectConnectionGQO getProjects() {
        return projects;
    }
    public void setProjects(ProjectConnectionGQO projects) {
        this.projects = projects;
    }

    public String getProjectsResourcePath() {
        return projectsResourcePath;
    }
    public void setProjectsResourcePath(String projectsResourcePath) {
        this.projectsResourcePath = projectsResourcePath;
    }

    public String getProjectsUrl() {
        return projectsUrl;
    }
    public void setProjectsUrl(String projectsUrl) {
        this.projectsUrl = projectsUrl;
    }

    public RegistryPackageConnectionGQO getRegistryPackages() {
        return registryPackages;
    }
    public void setRegistryPackages(RegistryPackageConnectionGQO registryPackages) {
        this.registryPackages = registryPackages;
    }

    public RegistryPackageConnectionGQO getRegistryPackagesForQuery() {
        return registryPackagesForQuery;
    }
    public void setRegistryPackagesForQuery(RegistryPackageConnectionGQO registryPackagesForQuery) {
        this.registryPackagesForQuery = registryPackagesForQuery;
    }

    public RepositoryConnectionGQO getRepositories() {
        return repositories;
    }
    public void setRepositories(RepositoryConnectionGQO repositories) {
        this.repositories = repositories;
    }

    public RepositoryGQO getRepository() {
        return repository;
    }
    public void setRepository(RepositoryGQO repository) {
        this.repository = repository;
    }

    public Boolean getRequiresTwoFactorAuthentication() {
        return requiresTwoFactorAuthentication;
    }
    public void setRequiresTwoFactorAuthentication(Boolean requiresTwoFactorAuthentication) {
        this.requiresTwoFactorAuthentication = requiresTwoFactorAuthentication;
    }

    public String getResourcePath() {
        return resourcePath;
    }
    public void setResourcePath(String resourcePath) {
        this.resourcePath = resourcePath;
    }

    public OrganizationIdentityProviderGQO getSamlIdentityProvider() {
        return samlIdentityProvider;
    }
    public void setSamlIdentityProvider(OrganizationIdentityProviderGQO samlIdentityProvider) {
        this.samlIdentityProvider = samlIdentityProvider;
    }

    public SponsorsListingGQO getSponsorsListing() {
        return sponsorsListing;
    }
    public void setSponsorsListing(SponsorsListingGQO sponsorsListing) {
        this.sponsorsListing = sponsorsListing;
    }

    public SponsorshipConnectionGQO getSponsorshipsAsMaintainer() {
        return sponsorshipsAsMaintainer;
    }
    public void setSponsorshipsAsMaintainer(SponsorshipConnectionGQO sponsorshipsAsMaintainer) {
        this.sponsorshipsAsMaintainer = sponsorshipsAsMaintainer;
    }

    public SponsorshipConnectionGQO getSponsorshipsAsSponsor() {
        return sponsorshipsAsSponsor;
    }
    public void setSponsorshipsAsSponsor(SponsorshipConnectionGQO sponsorshipsAsSponsor) {
        this.sponsorshipsAsSponsor = sponsorshipsAsSponsor;
    }

    public TeamGQO getTeam() {
        return team;
    }
    public void setTeam(TeamGQO team) {
        this.team = team;
    }

    public TeamConnectionGQO getTeams() {
        return teams;
    }
    public void setTeams(TeamConnectionGQO teams) {
        this.teams = teams;
    }

    public String getTeamsResourcePath() {
        return teamsResourcePath;
    }
    public void setTeamsResourcePath(String teamsResourcePath) {
        this.teamsResourcePath = teamsResourcePath;
    }

    public String getTeamsUrl() {
        return teamsUrl;
    }
    public void setTeamsUrl(String teamsUrl) {
        this.teamsUrl = teamsUrl;
    }

    public java.util.Date getUpdatedAt() {
        return updatedAt;
    }
    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }

    public Boolean getViewerCanAdminister() {
        return viewerCanAdminister;
    }
    public void setViewerCanAdminister(Boolean viewerCanAdminister) {
        this.viewerCanAdminister = viewerCanAdminister;
    }

    public Boolean getViewerCanChangePinnedItems() {
        return viewerCanChangePinnedItems;
    }
    public void setViewerCanChangePinnedItems(Boolean viewerCanChangePinnedItems) {
        this.viewerCanChangePinnedItems = viewerCanChangePinnedItems;
    }

    public Boolean getViewerCanCreateProjects() {
        return viewerCanCreateProjects;
    }
    public void setViewerCanCreateProjects(Boolean viewerCanCreateProjects) {
        this.viewerCanCreateProjects = viewerCanCreateProjects;
    }

    public Boolean getViewerCanCreateRepositories() {
        return viewerCanCreateRepositories;
    }
    public void setViewerCanCreateRepositories(Boolean viewerCanCreateRepositories) {
        this.viewerCanCreateRepositories = viewerCanCreateRepositories;
    }

    public Boolean getViewerCanCreateTeams() {
        return viewerCanCreateTeams;
    }
    public void setViewerCanCreateTeams(Boolean viewerCanCreateTeams) {
        this.viewerCanCreateTeams = viewerCanCreateTeams;
    }

    public Boolean getViewerIsAMember() {
        return viewerIsAMember;
    }
    public void setViewerIsAMember(Boolean viewerIsAMember) {
        this.viewerIsAMember = viewerIsAMember;
    }

    public String getWebsiteUrl() {
        return websiteUrl;
    }
    public void setWebsiteUrl(String websiteUrl) {
        this.websiteUrl = websiteUrl;
    }

}