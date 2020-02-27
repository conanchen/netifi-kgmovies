package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class UserGQO implements AssigneeGQO, AuditEntryActorGQO, EnterpriseMemberGQO, PushAllowanceActorGQO, RequestedReviewerGQO, ReviewDismissalAllowanceActorGQO, SearchResultItemGQO, ActorGQO, NodeGQO, PackageOwnerGQO, ProfileOwnerGQO, ProjectOwnerGQO, RegistryPackageOwnerGQO, RegistryPackageSearchGQO, RepositoryOwnerGQO, SponsorableGQO, UniformResourceLocatableGQO{

    @javax.validation.constraints.NotNull
    private Boolean anyPinnableItems;
    @javax.validation.constraints.NotNull
    private String avatarUrl;
    private String bio;
    @javax.validation.constraints.NotNull
    private String bioHTML;
    @javax.validation.constraints.NotNull
    private CommitCommentConnectionGQO commitComments;
    private String company;
    @javax.validation.constraints.NotNull
    private String companyHTML;
    @javax.validation.constraints.NotNull
    private ContributionsCollectionGQO contributionsCollection;
    @javax.validation.constraints.NotNull
    private java.util.Date createdAt;
    private Integer databaseId;
    @javax.validation.constraints.NotNull
    private String email;
    @javax.validation.constraints.NotNull
    private FollowerConnectionGQO followers;
    @javax.validation.constraints.NotNull
    private FollowingConnectionGQO following;
    private GistGQO gist;
    @javax.validation.constraints.NotNull
    private GistCommentConnectionGQO gistComments;
    @javax.validation.constraints.NotNull
    private GistConnectionGQO gists;
    @javax.validation.constraints.NotNull
    private HovercardGQO hovercard;
    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private Boolean isBountyHunter;
    @javax.validation.constraints.NotNull
    private Boolean isCampusExpert;
    @javax.validation.constraints.NotNull
    private Boolean isDeveloperProgramMember;
    @javax.validation.constraints.NotNull
    private Boolean isEmployee;
    @javax.validation.constraints.NotNull
    private Boolean isHireable;
    @javax.validation.constraints.NotNull
    private Boolean isSiteAdmin;
    @javax.validation.constraints.NotNull
    private Boolean isViewer;
    @javax.validation.constraints.NotNull
    private IssueCommentConnectionGQO issueComments;
    @javax.validation.constraints.NotNull
    private IssueConnectionGQO issues;
    @javax.validation.constraints.NotNull
    private ProfileItemShowcaseGQO itemShowcase;
    private String location;
    @javax.validation.constraints.NotNull
    private String login;
    private String name;
    private OrganizationGQO organization;
    @javax.validation.constraints.NotNull
    private OrganizationConnectionGQO organizations;
    @javax.validation.constraints.NotNull
    private PackageConnectionGQO packages;
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
    private PublicKeyConnectionGQO publicKeys;
    @javax.validation.constraints.NotNull
    private PullRequestConnectionGQO pullRequests;
    @javax.validation.constraints.NotNull
    private RegistryPackageConnectionGQO registryPackages;
    @javax.validation.constraints.NotNull
    private RegistryPackageConnectionGQO registryPackagesForQuery;
    @javax.validation.constraints.NotNull
    private RepositoryConnectionGQO repositories;
    @javax.validation.constraints.NotNull
    private RepositoryConnectionGQO repositoriesContributedTo;
    private RepositoryGQO repository;
    @javax.validation.constraints.NotNull
    private String resourcePath;
    private SavedReplyConnectionGQO savedReplies;
    private SponsorsListingGQO sponsorsListing;
    @javax.validation.constraints.NotNull
    private SponsorshipConnectionGQO sponsorshipsAsMaintainer;
    @javax.validation.constraints.NotNull
    private SponsorshipConnectionGQO sponsorshipsAsSponsor;
    @javax.validation.constraints.NotNull
    private StarredRepositoryConnectionGQO starredRepositories;
    private UserStatusGQO status;
    @javax.validation.constraints.NotNull
    private RepositoryConnectionGQO topRepositories;
    @javax.validation.constraints.NotNull
    private java.util.Date updatedAt;
    @javax.validation.constraints.NotNull
    private String url;
    @javax.validation.constraints.NotNull
    private Boolean viewerCanChangePinnedItems;
    @javax.validation.constraints.NotNull
    private Boolean viewerCanCreateProjects;
    @javax.validation.constraints.NotNull
    private Boolean viewerCanFollow;
    @javax.validation.constraints.NotNull
    private Boolean viewerIsFollowing;
    @javax.validation.constraints.NotNull
    private RepositoryConnectionGQO watching;
    private String websiteUrl;

    public UserGQO() {
    }

    public UserGQO(Boolean anyPinnableItems, String avatarUrl, String bio, String bioHTML, CommitCommentConnectionGQO commitComments, String company, String companyHTML, ContributionsCollectionGQO contributionsCollection, java.util.Date createdAt, Integer databaseId, String email, FollowerConnectionGQO followers, FollowingConnectionGQO following, GistGQO gist, GistCommentConnectionGQO gistComments, GistConnectionGQO gists, HovercardGQO hovercard, String id, Boolean isBountyHunter, Boolean isCampusExpert, Boolean isDeveloperProgramMember, Boolean isEmployee, Boolean isHireable, Boolean isSiteAdmin, Boolean isViewer, IssueCommentConnectionGQO issueComments, IssueConnectionGQO issues, ProfileItemShowcaseGQO itemShowcase, String location, String login, String name, OrganizationGQO organization, OrganizationConnectionGQO organizations, PackageConnectionGQO packages, PinnableItemConnectionGQO pinnableItems, PinnableItemConnectionGQO pinnedItems, Integer pinnedItemsRemaining, RepositoryConnectionGQO pinnedRepositories, ProjectGQO project, ProjectConnectionGQO projects, String projectsResourcePath, String projectsUrl, PublicKeyConnectionGQO publicKeys, PullRequestConnectionGQO pullRequests, RegistryPackageConnectionGQO registryPackages, RegistryPackageConnectionGQO registryPackagesForQuery, RepositoryConnectionGQO repositories, RepositoryConnectionGQO repositoriesContributedTo, RepositoryGQO repository, String resourcePath, SavedReplyConnectionGQO savedReplies, SponsorsListingGQO sponsorsListing, SponsorshipConnectionGQO sponsorshipsAsMaintainer, SponsorshipConnectionGQO sponsorshipsAsSponsor, StarredRepositoryConnectionGQO starredRepositories, UserStatusGQO status, RepositoryConnectionGQO topRepositories, java.util.Date updatedAt, String url, Boolean viewerCanChangePinnedItems, Boolean viewerCanCreateProjects, Boolean viewerCanFollow, Boolean viewerIsFollowing, RepositoryConnectionGQO watching, String websiteUrl) {
        this.anyPinnableItems = anyPinnableItems;
        this.avatarUrl = avatarUrl;
        this.bio = bio;
        this.bioHTML = bioHTML;
        this.commitComments = commitComments;
        this.company = company;
        this.companyHTML = companyHTML;
        this.contributionsCollection = contributionsCollection;
        this.createdAt = createdAt;
        this.databaseId = databaseId;
        this.email = email;
        this.followers = followers;
        this.following = following;
        this.gist = gist;
        this.gistComments = gistComments;
        this.gists = gists;
        this.hovercard = hovercard;
        this.id = id;
        this.isBountyHunter = isBountyHunter;
        this.isCampusExpert = isCampusExpert;
        this.isDeveloperProgramMember = isDeveloperProgramMember;
        this.isEmployee = isEmployee;
        this.isHireable = isHireable;
        this.isSiteAdmin = isSiteAdmin;
        this.isViewer = isViewer;
        this.issueComments = issueComments;
        this.issues = issues;
        this.itemShowcase = itemShowcase;
        this.location = location;
        this.login = login;
        this.name = name;
        this.organization = organization;
        this.organizations = organizations;
        this.packages = packages;
        this.pinnableItems = pinnableItems;
        this.pinnedItems = pinnedItems;
        this.pinnedItemsRemaining = pinnedItemsRemaining;
        this.pinnedRepositories = pinnedRepositories;
        this.project = project;
        this.projects = projects;
        this.projectsResourcePath = projectsResourcePath;
        this.projectsUrl = projectsUrl;
        this.publicKeys = publicKeys;
        this.pullRequests = pullRequests;
        this.registryPackages = registryPackages;
        this.registryPackagesForQuery = registryPackagesForQuery;
        this.repositories = repositories;
        this.repositoriesContributedTo = repositoriesContributedTo;
        this.repository = repository;
        this.resourcePath = resourcePath;
        this.savedReplies = savedReplies;
        this.sponsorsListing = sponsorsListing;
        this.sponsorshipsAsMaintainer = sponsorshipsAsMaintainer;
        this.sponsorshipsAsSponsor = sponsorshipsAsSponsor;
        this.starredRepositories = starredRepositories;
        this.status = status;
        this.topRepositories = topRepositories;
        this.updatedAt = updatedAt;
        this.url = url;
        this.viewerCanChangePinnedItems = viewerCanChangePinnedItems;
        this.viewerCanCreateProjects = viewerCanCreateProjects;
        this.viewerCanFollow = viewerCanFollow;
        this.viewerIsFollowing = viewerIsFollowing;
        this.watching = watching;
        this.websiteUrl = websiteUrl;
    }

    public Boolean getAnyPinnableItems() {
        return anyPinnableItems;
    }
    public void setAnyPinnableItems(Boolean anyPinnableItems) {
        this.anyPinnableItems = anyPinnableItems;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }
    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public String getBio() {
        return bio;
    }
    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getBioHTML() {
        return bioHTML;
    }
    public void setBioHTML(String bioHTML) {
        this.bioHTML = bioHTML;
    }

    public CommitCommentConnectionGQO getCommitComments() {
        return commitComments;
    }
    public void setCommitComments(CommitCommentConnectionGQO commitComments) {
        this.commitComments = commitComments;
    }

    public String getCompany() {
        return company;
    }
    public void setCompany(String company) {
        this.company = company;
    }

    public String getCompanyHTML() {
        return companyHTML;
    }
    public void setCompanyHTML(String companyHTML) {
        this.companyHTML = companyHTML;
    }

    public ContributionsCollectionGQO getContributionsCollection() {
        return contributionsCollection;
    }
    public void setContributionsCollection(ContributionsCollectionGQO contributionsCollection) {
        this.contributionsCollection = contributionsCollection;
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

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public FollowerConnectionGQO getFollowers() {
        return followers;
    }
    public void setFollowers(FollowerConnectionGQO followers) {
        this.followers = followers;
    }

    public FollowingConnectionGQO getFollowing() {
        return following;
    }
    public void setFollowing(FollowingConnectionGQO following) {
        this.following = following;
    }

    public GistGQO getGist() {
        return gist;
    }
    public void setGist(GistGQO gist) {
        this.gist = gist;
    }

    public GistCommentConnectionGQO getGistComments() {
        return gistComments;
    }
    public void setGistComments(GistCommentConnectionGQO gistComments) {
        this.gistComments = gistComments;
    }

    public GistConnectionGQO getGists() {
        return gists;
    }
    public void setGists(GistConnectionGQO gists) {
        this.gists = gists;
    }

    public HovercardGQO getHovercard() {
        return hovercard;
    }
    public void setHovercard(HovercardGQO hovercard) {
        this.hovercard = hovercard;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public Boolean getIsBountyHunter() {
        return isBountyHunter;
    }
    public void setIsBountyHunter(Boolean isBountyHunter) {
        this.isBountyHunter = isBountyHunter;
    }

    public Boolean getIsCampusExpert() {
        return isCampusExpert;
    }
    public void setIsCampusExpert(Boolean isCampusExpert) {
        this.isCampusExpert = isCampusExpert;
    }

    public Boolean getIsDeveloperProgramMember() {
        return isDeveloperProgramMember;
    }
    public void setIsDeveloperProgramMember(Boolean isDeveloperProgramMember) {
        this.isDeveloperProgramMember = isDeveloperProgramMember;
    }

    public Boolean getIsEmployee() {
        return isEmployee;
    }
    public void setIsEmployee(Boolean isEmployee) {
        this.isEmployee = isEmployee;
    }

    public Boolean getIsHireable() {
        return isHireable;
    }
    public void setIsHireable(Boolean isHireable) {
        this.isHireable = isHireable;
    }

    public Boolean getIsSiteAdmin() {
        return isSiteAdmin;
    }
    public void setIsSiteAdmin(Boolean isSiteAdmin) {
        this.isSiteAdmin = isSiteAdmin;
    }

    public Boolean getIsViewer() {
        return isViewer;
    }
    public void setIsViewer(Boolean isViewer) {
        this.isViewer = isViewer;
    }

    public IssueCommentConnectionGQO getIssueComments() {
        return issueComments;
    }
    public void setIssueComments(IssueCommentConnectionGQO issueComments) {
        this.issueComments = issueComments;
    }

    public IssueConnectionGQO getIssues() {
        return issues;
    }
    public void setIssues(IssueConnectionGQO issues) {
        this.issues = issues;
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

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public OrganizationGQO getOrganization() {
        return organization;
    }
    public void setOrganization(OrganizationGQO organization) {
        this.organization = organization;
    }

    public OrganizationConnectionGQO getOrganizations() {
        return organizations;
    }
    public void setOrganizations(OrganizationConnectionGQO organizations) {
        this.organizations = organizations;
    }

    public PackageConnectionGQO getPackages() {
        return packages;
    }
    public void setPackages(PackageConnectionGQO packages) {
        this.packages = packages;
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

    public PublicKeyConnectionGQO getPublicKeys() {
        return publicKeys;
    }
    public void setPublicKeys(PublicKeyConnectionGQO publicKeys) {
        this.publicKeys = publicKeys;
    }

    public PullRequestConnectionGQO getPullRequests() {
        return pullRequests;
    }
    public void setPullRequests(PullRequestConnectionGQO pullRequests) {
        this.pullRequests = pullRequests;
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

    public RepositoryConnectionGQO getRepositoriesContributedTo() {
        return repositoriesContributedTo;
    }
    public void setRepositoriesContributedTo(RepositoryConnectionGQO repositoriesContributedTo) {
        this.repositoriesContributedTo = repositoriesContributedTo;
    }

    public RepositoryGQO getRepository() {
        return repository;
    }
    public void setRepository(RepositoryGQO repository) {
        this.repository = repository;
    }

    public String getResourcePath() {
        return resourcePath;
    }
    public void setResourcePath(String resourcePath) {
        this.resourcePath = resourcePath;
    }

    public SavedReplyConnectionGQO getSavedReplies() {
        return savedReplies;
    }
    public void setSavedReplies(SavedReplyConnectionGQO savedReplies) {
        this.savedReplies = savedReplies;
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

    public StarredRepositoryConnectionGQO getStarredRepositories() {
        return starredRepositories;
    }
    public void setStarredRepositories(StarredRepositoryConnectionGQO starredRepositories) {
        this.starredRepositories = starredRepositories;
    }

    public UserStatusGQO getStatus() {
        return status;
    }
    public void setStatus(UserStatusGQO status) {
        this.status = status;
    }

    public RepositoryConnectionGQO getTopRepositories() {
        return topRepositories;
    }
    public void setTopRepositories(RepositoryConnectionGQO topRepositories) {
        this.topRepositories = topRepositories;
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

    public Boolean getViewerCanFollow() {
        return viewerCanFollow;
    }
    public void setViewerCanFollow(Boolean viewerCanFollow) {
        this.viewerCanFollow = viewerCanFollow;
    }

    public Boolean getViewerIsFollowing() {
        return viewerIsFollowing;
    }
    public void setViewerIsFollowing(Boolean viewerIsFollowing) {
        this.viewerIsFollowing = viewerIsFollowing;
    }

    public RepositoryConnectionGQO getWatching() {
        return watching;
    }
    public void setWatching(RepositoryConnectionGQO watching) {
        this.watching = watching;
    }

    public String getWebsiteUrl() {
        return websiteUrl;
    }
    public void setWebsiteUrl(String websiteUrl) {
        this.websiteUrl = websiteUrl;
    }

}