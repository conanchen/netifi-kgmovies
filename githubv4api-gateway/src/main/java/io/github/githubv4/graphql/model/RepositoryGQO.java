package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class RepositoryGQO implements PermissionGranterGQO, PinnableItemGQO, SearchResultItemGQO, NodeGQO, PackageOwnerGQO, ProjectOwnerGQO, RegistryPackageOwnerGQO, RegistryPackageSearchGQO, RepositoryInfoGQO, StarrableGQO, SubscribableGQO, UniformResourceLocatableGQO{

    @javax.validation.constraints.NotNull
    private UserConnectionGQO assignableUsers;
    @javax.validation.constraints.NotNull
    private BranchProtectionRuleConnectionGQO branchProtectionRules;
    private CodeOfConductGQO codeOfConduct;
    private RepositoryCollaboratorConnectionGQO collaborators;
    @javax.validation.constraints.NotNull
    private CommitCommentConnectionGQO commitComments;
    @javax.validation.constraints.NotNull
    private java.util.Date createdAt;
    private Integer databaseId;
    private RefGQO defaultBranchRef;
    @javax.validation.constraints.NotNull
    private Boolean deleteBranchOnMerge;
    private DependencyGraphManifestConnectionGQO dependencyGraphManifests;
    @javax.validation.constraints.NotNull
    private DeployKeyConnectionGQO deployKeys;
    @javax.validation.constraints.NotNull
    private DeploymentConnectionGQO deployments;
    private String description;
    @javax.validation.constraints.NotNull
    private String descriptionHTML;
    private Integer diskUsage;
    @javax.validation.constraints.NotNull
    private Integer forkCount;
    @javax.validation.constraints.NotNull
    private RepositoryConnectionGQO forks;
    @javax.validation.constraints.NotNull
    private Collection<FundingLinkGQO> fundingLinks;
    @javax.validation.constraints.NotNull
    private Boolean hasIssuesEnabled;
    @javax.validation.constraints.NotNull
    private Boolean hasProjectsEnabled;
    @javax.validation.constraints.NotNull
    private Boolean hasWikiEnabled;
    private String homepageUrl;
    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private Boolean isArchived;
    @javax.validation.constraints.NotNull
    private Boolean isDisabled;
    @javax.validation.constraints.NotNull
    private Boolean isFork;
    @javax.validation.constraints.NotNull
    private Boolean isLocked;
    @javax.validation.constraints.NotNull
    private Boolean isMirror;
    @javax.validation.constraints.NotNull
    private Boolean isPrivate;
    @javax.validation.constraints.NotNull
    private Boolean isTemplate;
    private IssueGQO issue;
    private IssueOrPullRequestGQO issueOrPullRequest;
    @javax.validation.constraints.NotNull
    private IssueConnectionGQO issues;
    private LabelGQO label;
    private LabelConnectionGQO labels;
    private LanguageConnectionGQO languages;
    private LicenseGQO licenseInfo;
    private RepositoryLockReasonGQO lockReason;
    @javax.validation.constraints.NotNull
    private UserConnectionGQO mentionableUsers;
    @javax.validation.constraints.NotNull
    private Boolean mergeCommitAllowed;
    private MilestoneGQO milestone;
    private MilestoneConnectionGQO milestones;
    private String mirrorUrl;
    @javax.validation.constraints.NotNull
    private String name;
    @javax.validation.constraints.NotNull
    private String nameWithOwner;
    private GitObjectGQO object;
    @javax.validation.constraints.NotNull
    private String openGraphImageUrl;
    @javax.validation.constraints.NotNull
    private RepositoryOwnerGQO owner;
    @javax.validation.constraints.NotNull
    private PackageConnectionGQO packages;
    private RepositoryGQO parent;
    private PinnedIssueConnectionGQO pinnedIssues;
    private LanguageGQO primaryLanguage;
    private ProjectGQO project;
    @javax.validation.constraints.NotNull
    private ProjectConnectionGQO projects;
    @javax.validation.constraints.NotNull
    private String projectsResourcePath;
    @javax.validation.constraints.NotNull
    private String projectsUrl;
    private PullRequestGQO pullRequest;
    @javax.validation.constraints.NotNull
    private PullRequestConnectionGQO pullRequests;
    private java.util.Date pushedAt;
    @javax.validation.constraints.NotNull
    private Boolean rebaseMergeAllowed;
    private RefGQO ref;
    private RefConnectionGQO refs;
    @javax.validation.constraints.NotNull
    private RegistryPackageConnectionGQO registryPackages;
    @javax.validation.constraints.NotNull
    private RegistryPackageConnectionGQO registryPackagesForQuery;
    private ReleaseGQO release;
    @javax.validation.constraints.NotNull
    private ReleaseConnectionGQO releases;
    @javax.validation.constraints.NotNull
    private RepositoryTopicConnectionGQO repositoryTopics;
    @javax.validation.constraints.NotNull
    private String resourcePath;
    @javax.validation.constraints.NotNull
    private String shortDescriptionHTML;
    @javax.validation.constraints.NotNull
    private Boolean squashMergeAllowed;
    @javax.validation.constraints.NotNull
    private String sshUrl;
    @javax.validation.constraints.NotNull
    private StargazerConnectionGQO stargazers;
    private String tempCloneToken;
    private RepositoryGQO templateRepository;
    @javax.validation.constraints.NotNull
    private java.util.Date updatedAt;
    @javax.validation.constraints.NotNull
    private String url;
    @javax.validation.constraints.NotNull
    private Boolean usesCustomOpenGraphImage;
    @javax.validation.constraints.NotNull
    private Boolean viewerCanAdminister;
    @javax.validation.constraints.NotNull
    private Boolean viewerCanCreateProjects;
    @javax.validation.constraints.NotNull
    private Boolean viewerCanSubscribe;
    @javax.validation.constraints.NotNull
    private Boolean viewerCanUpdateTopics;
    @javax.validation.constraints.NotNull
    private Boolean viewerHasStarred;
    private RepositoryPermissionGQO viewerPermission;
    private SubscriptionStateGQO viewerSubscription;
    private RepositoryVulnerabilityAlertConnectionGQO vulnerabilityAlerts;
    @javax.validation.constraints.NotNull
    private UserConnectionGQO watchers;

    public RepositoryGQO() {
    }

    public RepositoryGQO(UserConnectionGQO assignableUsers, BranchProtectionRuleConnectionGQO branchProtectionRules, CodeOfConductGQO codeOfConduct, RepositoryCollaboratorConnectionGQO collaborators, CommitCommentConnectionGQO commitComments, java.util.Date createdAt, Integer databaseId, RefGQO defaultBranchRef, Boolean deleteBranchOnMerge, DependencyGraphManifestConnectionGQO dependencyGraphManifests, DeployKeyConnectionGQO deployKeys, DeploymentConnectionGQO deployments, String description, String descriptionHTML, Integer diskUsage, Integer forkCount, RepositoryConnectionGQO forks, Collection<FundingLinkGQO> fundingLinks, Boolean hasIssuesEnabled, Boolean hasProjectsEnabled, Boolean hasWikiEnabled, String homepageUrl, String id, Boolean isArchived, Boolean isDisabled, Boolean isFork, Boolean isLocked, Boolean isMirror, Boolean isPrivate, Boolean isTemplate, IssueGQO issue, IssueOrPullRequestGQO issueOrPullRequest, IssueConnectionGQO issues, LabelGQO label, LabelConnectionGQO labels, LanguageConnectionGQO languages, LicenseGQO licenseInfo, RepositoryLockReasonGQO lockReason, UserConnectionGQO mentionableUsers, Boolean mergeCommitAllowed, MilestoneGQO milestone, MilestoneConnectionGQO milestones, String mirrorUrl, String name, String nameWithOwner, GitObjectGQO object, String openGraphImageUrl, RepositoryOwnerGQO owner, PackageConnectionGQO packages, RepositoryGQO parent, PinnedIssueConnectionGQO pinnedIssues, LanguageGQO primaryLanguage, ProjectGQO project, ProjectConnectionGQO projects, String projectsResourcePath, String projectsUrl, PullRequestGQO pullRequest, PullRequestConnectionGQO pullRequests, java.util.Date pushedAt, Boolean rebaseMergeAllowed, RefGQO ref, RefConnectionGQO refs, RegistryPackageConnectionGQO registryPackages, RegistryPackageConnectionGQO registryPackagesForQuery, ReleaseGQO release, ReleaseConnectionGQO releases, RepositoryTopicConnectionGQO repositoryTopics, String resourcePath, String shortDescriptionHTML, Boolean squashMergeAllowed, String sshUrl, StargazerConnectionGQO stargazers, String tempCloneToken, RepositoryGQO templateRepository, java.util.Date updatedAt, String url, Boolean usesCustomOpenGraphImage, Boolean viewerCanAdminister, Boolean viewerCanCreateProjects, Boolean viewerCanSubscribe, Boolean viewerCanUpdateTopics, Boolean viewerHasStarred, RepositoryPermissionGQO viewerPermission, SubscriptionStateGQO viewerSubscription, RepositoryVulnerabilityAlertConnectionGQO vulnerabilityAlerts, UserConnectionGQO watchers) {
        this.assignableUsers = assignableUsers;
        this.branchProtectionRules = branchProtectionRules;
        this.codeOfConduct = codeOfConduct;
        this.collaborators = collaborators;
        this.commitComments = commitComments;
        this.createdAt = createdAt;
        this.databaseId = databaseId;
        this.defaultBranchRef = defaultBranchRef;
        this.deleteBranchOnMerge = deleteBranchOnMerge;
        this.dependencyGraphManifests = dependencyGraphManifests;
        this.deployKeys = deployKeys;
        this.deployments = deployments;
        this.description = description;
        this.descriptionHTML = descriptionHTML;
        this.diskUsage = diskUsage;
        this.forkCount = forkCount;
        this.forks = forks;
        this.fundingLinks = fundingLinks;
        this.hasIssuesEnabled = hasIssuesEnabled;
        this.hasProjectsEnabled = hasProjectsEnabled;
        this.hasWikiEnabled = hasWikiEnabled;
        this.homepageUrl = homepageUrl;
        this.id = id;
        this.isArchived = isArchived;
        this.isDisabled = isDisabled;
        this.isFork = isFork;
        this.isLocked = isLocked;
        this.isMirror = isMirror;
        this.isPrivate = isPrivate;
        this.isTemplate = isTemplate;
        this.issue = issue;
        this.issueOrPullRequest = issueOrPullRequest;
        this.issues = issues;
        this.label = label;
        this.labels = labels;
        this.languages = languages;
        this.licenseInfo = licenseInfo;
        this.lockReason = lockReason;
        this.mentionableUsers = mentionableUsers;
        this.mergeCommitAllowed = mergeCommitAllowed;
        this.milestone = milestone;
        this.milestones = milestones;
        this.mirrorUrl = mirrorUrl;
        this.name = name;
        this.nameWithOwner = nameWithOwner;
        this.object = object;
        this.openGraphImageUrl = openGraphImageUrl;
        this.owner = owner;
        this.packages = packages;
        this.parent = parent;
        this.pinnedIssues = pinnedIssues;
        this.primaryLanguage = primaryLanguage;
        this.project = project;
        this.projects = projects;
        this.projectsResourcePath = projectsResourcePath;
        this.projectsUrl = projectsUrl;
        this.pullRequest = pullRequest;
        this.pullRequests = pullRequests;
        this.pushedAt = pushedAt;
        this.rebaseMergeAllowed = rebaseMergeAllowed;
        this.ref = ref;
        this.refs = refs;
        this.registryPackages = registryPackages;
        this.registryPackagesForQuery = registryPackagesForQuery;
        this.release = release;
        this.releases = releases;
        this.repositoryTopics = repositoryTopics;
        this.resourcePath = resourcePath;
        this.shortDescriptionHTML = shortDescriptionHTML;
        this.squashMergeAllowed = squashMergeAllowed;
        this.sshUrl = sshUrl;
        this.stargazers = stargazers;
        this.tempCloneToken = tempCloneToken;
        this.templateRepository = templateRepository;
        this.updatedAt = updatedAt;
        this.url = url;
        this.usesCustomOpenGraphImage = usesCustomOpenGraphImage;
        this.viewerCanAdminister = viewerCanAdminister;
        this.viewerCanCreateProjects = viewerCanCreateProjects;
        this.viewerCanSubscribe = viewerCanSubscribe;
        this.viewerCanUpdateTopics = viewerCanUpdateTopics;
        this.viewerHasStarred = viewerHasStarred;
        this.viewerPermission = viewerPermission;
        this.viewerSubscription = viewerSubscription;
        this.vulnerabilityAlerts = vulnerabilityAlerts;
        this.watchers = watchers;
    }

    public UserConnectionGQO getAssignableUsers() {
        return assignableUsers;
    }
    public void setAssignableUsers(UserConnectionGQO assignableUsers) {
        this.assignableUsers = assignableUsers;
    }

    public BranchProtectionRuleConnectionGQO getBranchProtectionRules() {
        return branchProtectionRules;
    }
    public void setBranchProtectionRules(BranchProtectionRuleConnectionGQO branchProtectionRules) {
        this.branchProtectionRules = branchProtectionRules;
    }

    public CodeOfConductGQO getCodeOfConduct() {
        return codeOfConduct;
    }
    public void setCodeOfConduct(CodeOfConductGQO codeOfConduct) {
        this.codeOfConduct = codeOfConduct;
    }

    public RepositoryCollaboratorConnectionGQO getCollaborators() {
        return collaborators;
    }
    public void setCollaborators(RepositoryCollaboratorConnectionGQO collaborators) {
        this.collaborators = collaborators;
    }

    public CommitCommentConnectionGQO getCommitComments() {
        return commitComments;
    }
    public void setCommitComments(CommitCommentConnectionGQO commitComments) {
        this.commitComments = commitComments;
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

    public RefGQO getDefaultBranchRef() {
        return defaultBranchRef;
    }
    public void setDefaultBranchRef(RefGQO defaultBranchRef) {
        this.defaultBranchRef = defaultBranchRef;
    }

    public Boolean getDeleteBranchOnMerge() {
        return deleteBranchOnMerge;
    }
    public void setDeleteBranchOnMerge(Boolean deleteBranchOnMerge) {
        this.deleteBranchOnMerge = deleteBranchOnMerge;
    }

    public DependencyGraphManifestConnectionGQO getDependencyGraphManifests() {
        return dependencyGraphManifests;
    }
    public void setDependencyGraphManifests(DependencyGraphManifestConnectionGQO dependencyGraphManifests) {
        this.dependencyGraphManifests = dependencyGraphManifests;
    }

    public DeployKeyConnectionGQO getDeployKeys() {
        return deployKeys;
    }
    public void setDeployKeys(DeployKeyConnectionGQO deployKeys) {
        this.deployKeys = deployKeys;
    }

    public DeploymentConnectionGQO getDeployments() {
        return deployments;
    }
    public void setDeployments(DeploymentConnectionGQO deployments) {
        this.deployments = deployments;
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

    public Integer getDiskUsage() {
        return diskUsage;
    }
    public void setDiskUsage(Integer diskUsage) {
        this.diskUsage = diskUsage;
    }

    public Integer getForkCount() {
        return forkCount;
    }
    public void setForkCount(Integer forkCount) {
        this.forkCount = forkCount;
    }

    public RepositoryConnectionGQO getForks() {
        return forks;
    }
    public void setForks(RepositoryConnectionGQO forks) {
        this.forks = forks;
    }

    public Collection<FundingLinkGQO> getFundingLinks() {
        return fundingLinks;
    }
    public void setFundingLinks(Collection<FundingLinkGQO> fundingLinks) {
        this.fundingLinks = fundingLinks;
    }

    public Boolean getHasIssuesEnabled() {
        return hasIssuesEnabled;
    }
    public void setHasIssuesEnabled(Boolean hasIssuesEnabled) {
        this.hasIssuesEnabled = hasIssuesEnabled;
    }

    public Boolean getHasProjectsEnabled() {
        return hasProjectsEnabled;
    }
    public void setHasProjectsEnabled(Boolean hasProjectsEnabled) {
        this.hasProjectsEnabled = hasProjectsEnabled;
    }

    public Boolean getHasWikiEnabled() {
        return hasWikiEnabled;
    }
    public void setHasWikiEnabled(Boolean hasWikiEnabled) {
        this.hasWikiEnabled = hasWikiEnabled;
    }

    public String getHomepageUrl() {
        return homepageUrl;
    }
    public void setHomepageUrl(String homepageUrl) {
        this.homepageUrl = homepageUrl;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public Boolean getIsArchived() {
        return isArchived;
    }
    public void setIsArchived(Boolean isArchived) {
        this.isArchived = isArchived;
    }

    public Boolean getIsDisabled() {
        return isDisabled;
    }
    public void setIsDisabled(Boolean isDisabled) {
        this.isDisabled = isDisabled;
    }

    public Boolean getIsFork() {
        return isFork;
    }
    public void setIsFork(Boolean isFork) {
        this.isFork = isFork;
    }

    public Boolean getIsLocked() {
        return isLocked;
    }
    public void setIsLocked(Boolean isLocked) {
        this.isLocked = isLocked;
    }

    public Boolean getIsMirror() {
        return isMirror;
    }
    public void setIsMirror(Boolean isMirror) {
        this.isMirror = isMirror;
    }

    public Boolean getIsPrivate() {
        return isPrivate;
    }
    public void setIsPrivate(Boolean isPrivate) {
        this.isPrivate = isPrivate;
    }

    public Boolean getIsTemplate() {
        return isTemplate;
    }
    public void setIsTemplate(Boolean isTemplate) {
        this.isTemplate = isTemplate;
    }

    public IssueGQO getIssue() {
        return issue;
    }
    public void setIssue(IssueGQO issue) {
        this.issue = issue;
    }

    public IssueOrPullRequestGQO getIssueOrPullRequest() {
        return issueOrPullRequest;
    }
    public void setIssueOrPullRequest(IssueOrPullRequestGQO issueOrPullRequest) {
        this.issueOrPullRequest = issueOrPullRequest;
    }

    public IssueConnectionGQO getIssues() {
        return issues;
    }
    public void setIssues(IssueConnectionGQO issues) {
        this.issues = issues;
    }

    public LabelGQO getLabel() {
        return label;
    }
    public void setLabel(LabelGQO label) {
        this.label = label;
    }

    public LabelConnectionGQO getLabels() {
        return labels;
    }
    public void setLabels(LabelConnectionGQO labels) {
        this.labels = labels;
    }

    public LanguageConnectionGQO getLanguages() {
        return languages;
    }
    public void setLanguages(LanguageConnectionGQO languages) {
        this.languages = languages;
    }

    public LicenseGQO getLicenseInfo() {
        return licenseInfo;
    }
    public void setLicenseInfo(LicenseGQO licenseInfo) {
        this.licenseInfo = licenseInfo;
    }

    public RepositoryLockReasonGQO getLockReason() {
        return lockReason;
    }
    public void setLockReason(RepositoryLockReasonGQO lockReason) {
        this.lockReason = lockReason;
    }

    public UserConnectionGQO getMentionableUsers() {
        return mentionableUsers;
    }
    public void setMentionableUsers(UserConnectionGQO mentionableUsers) {
        this.mentionableUsers = mentionableUsers;
    }

    public Boolean getMergeCommitAllowed() {
        return mergeCommitAllowed;
    }
    public void setMergeCommitAllowed(Boolean mergeCommitAllowed) {
        this.mergeCommitAllowed = mergeCommitAllowed;
    }

    public MilestoneGQO getMilestone() {
        return milestone;
    }
    public void setMilestone(MilestoneGQO milestone) {
        this.milestone = milestone;
    }

    public MilestoneConnectionGQO getMilestones() {
        return milestones;
    }
    public void setMilestones(MilestoneConnectionGQO milestones) {
        this.milestones = milestones;
    }

    public String getMirrorUrl() {
        return mirrorUrl;
    }
    public void setMirrorUrl(String mirrorUrl) {
        this.mirrorUrl = mirrorUrl;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getNameWithOwner() {
        return nameWithOwner;
    }
    public void setNameWithOwner(String nameWithOwner) {
        this.nameWithOwner = nameWithOwner;
    }

    public GitObjectGQO getObject() {
        return object;
    }
    public void setObject(GitObjectGQO object) {
        this.object = object;
    }

    public String getOpenGraphImageUrl() {
        return openGraphImageUrl;
    }
    public void setOpenGraphImageUrl(String openGraphImageUrl) {
        this.openGraphImageUrl = openGraphImageUrl;
    }

    public RepositoryOwnerGQO getOwner() {
        return owner;
    }
    public void setOwner(RepositoryOwnerGQO owner) {
        this.owner = owner;
    }

    public PackageConnectionGQO getPackages() {
        return packages;
    }
    public void setPackages(PackageConnectionGQO packages) {
        this.packages = packages;
    }

    public RepositoryGQO getParent() {
        return parent;
    }
    public void setParent(RepositoryGQO parent) {
        this.parent = parent;
    }

    public PinnedIssueConnectionGQO getPinnedIssues() {
        return pinnedIssues;
    }
    public void setPinnedIssues(PinnedIssueConnectionGQO pinnedIssues) {
        this.pinnedIssues = pinnedIssues;
    }

    public LanguageGQO getPrimaryLanguage() {
        return primaryLanguage;
    }
    public void setPrimaryLanguage(LanguageGQO primaryLanguage) {
        this.primaryLanguage = primaryLanguage;
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

    public PullRequestGQO getPullRequest() {
        return pullRequest;
    }
    public void setPullRequest(PullRequestGQO pullRequest) {
        this.pullRequest = pullRequest;
    }

    public PullRequestConnectionGQO getPullRequests() {
        return pullRequests;
    }
    public void setPullRequests(PullRequestConnectionGQO pullRequests) {
        this.pullRequests = pullRequests;
    }

    public java.util.Date getPushedAt() {
        return pushedAt;
    }
    public void setPushedAt(java.util.Date pushedAt) {
        this.pushedAt = pushedAt;
    }

    public Boolean getRebaseMergeAllowed() {
        return rebaseMergeAllowed;
    }
    public void setRebaseMergeAllowed(Boolean rebaseMergeAllowed) {
        this.rebaseMergeAllowed = rebaseMergeAllowed;
    }

    public RefGQO getRef() {
        return ref;
    }
    public void setRef(RefGQO ref) {
        this.ref = ref;
    }

    public RefConnectionGQO getRefs() {
        return refs;
    }
    public void setRefs(RefConnectionGQO refs) {
        this.refs = refs;
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

    public ReleaseGQO getRelease() {
        return release;
    }
    public void setRelease(ReleaseGQO release) {
        this.release = release;
    }

    public ReleaseConnectionGQO getReleases() {
        return releases;
    }
    public void setReleases(ReleaseConnectionGQO releases) {
        this.releases = releases;
    }

    public RepositoryTopicConnectionGQO getRepositoryTopics() {
        return repositoryTopics;
    }
    public void setRepositoryTopics(RepositoryTopicConnectionGQO repositoryTopics) {
        this.repositoryTopics = repositoryTopics;
    }

    public String getResourcePath() {
        return resourcePath;
    }
    public void setResourcePath(String resourcePath) {
        this.resourcePath = resourcePath;
    }

    public String getShortDescriptionHTML() {
        return shortDescriptionHTML;
    }
    public void setShortDescriptionHTML(String shortDescriptionHTML) {
        this.shortDescriptionHTML = shortDescriptionHTML;
    }

    public Boolean getSquashMergeAllowed() {
        return squashMergeAllowed;
    }
    public void setSquashMergeAllowed(Boolean squashMergeAllowed) {
        this.squashMergeAllowed = squashMergeAllowed;
    }

    public String getSshUrl() {
        return sshUrl;
    }
    public void setSshUrl(String sshUrl) {
        this.sshUrl = sshUrl;
    }

    public StargazerConnectionGQO getStargazers() {
        return stargazers;
    }
    public void setStargazers(StargazerConnectionGQO stargazers) {
        this.stargazers = stargazers;
    }

    public String getTempCloneToken() {
        return tempCloneToken;
    }
    public void setTempCloneToken(String tempCloneToken) {
        this.tempCloneToken = tempCloneToken;
    }

    public RepositoryGQO getTemplateRepository() {
        return templateRepository;
    }
    public void setTemplateRepository(RepositoryGQO templateRepository) {
        this.templateRepository = templateRepository;
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

    public Boolean getUsesCustomOpenGraphImage() {
        return usesCustomOpenGraphImage;
    }
    public void setUsesCustomOpenGraphImage(Boolean usesCustomOpenGraphImage) {
        this.usesCustomOpenGraphImage = usesCustomOpenGraphImage;
    }

    public Boolean getViewerCanAdminister() {
        return viewerCanAdminister;
    }
    public void setViewerCanAdminister(Boolean viewerCanAdminister) {
        this.viewerCanAdminister = viewerCanAdminister;
    }

    public Boolean getViewerCanCreateProjects() {
        return viewerCanCreateProjects;
    }
    public void setViewerCanCreateProjects(Boolean viewerCanCreateProjects) {
        this.viewerCanCreateProjects = viewerCanCreateProjects;
    }

    public Boolean getViewerCanSubscribe() {
        return viewerCanSubscribe;
    }
    public void setViewerCanSubscribe(Boolean viewerCanSubscribe) {
        this.viewerCanSubscribe = viewerCanSubscribe;
    }

    public Boolean getViewerCanUpdateTopics() {
        return viewerCanUpdateTopics;
    }
    public void setViewerCanUpdateTopics(Boolean viewerCanUpdateTopics) {
        this.viewerCanUpdateTopics = viewerCanUpdateTopics;
    }

    public Boolean getViewerHasStarred() {
        return viewerHasStarred;
    }
    public void setViewerHasStarred(Boolean viewerHasStarred) {
        this.viewerHasStarred = viewerHasStarred;
    }

    public RepositoryPermissionGQO getViewerPermission() {
        return viewerPermission;
    }
    public void setViewerPermission(RepositoryPermissionGQO viewerPermission) {
        this.viewerPermission = viewerPermission;
    }

    public SubscriptionStateGQO getViewerSubscription() {
        return viewerSubscription;
    }
    public void setViewerSubscription(SubscriptionStateGQO viewerSubscription) {
        this.viewerSubscription = viewerSubscription;
    }

    public RepositoryVulnerabilityAlertConnectionGQO getVulnerabilityAlerts() {
        return vulnerabilityAlerts;
    }
    public void setVulnerabilityAlerts(RepositoryVulnerabilityAlertConnectionGQO vulnerabilityAlerts) {
        this.vulnerabilityAlerts = vulnerabilityAlerts;
    }

    public UserConnectionGQO getWatchers() {
        return watchers;
    }
    public void setWatchers(UserConnectionGQO watchers) {
        this.watchers = watchers;
    }

}