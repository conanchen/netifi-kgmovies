package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class TeamGQO implements PermissionGranterGQO, PushAllowanceActorGQO, RequestedReviewerGQO, ReviewDismissalAllowanceActorGQO, MemberStatusableGQO, NodeGQO, SubscribableGQO{

    @javax.validation.constraints.NotNull
    private TeamConnectionGQO ancestors;
    private String avatarUrl;
    @javax.validation.constraints.NotNull
    private TeamConnectionGQO childTeams;
    @javax.validation.constraints.NotNull
    private String combinedSlug;
    @javax.validation.constraints.NotNull
    private java.util.Date createdAt;
    private String description;
    private TeamDiscussionGQO discussion;
    @javax.validation.constraints.NotNull
    private TeamDiscussionConnectionGQO discussions;
    @javax.validation.constraints.NotNull
    private String discussionsResourcePath;
    @javax.validation.constraints.NotNull
    private String discussionsUrl;
    @javax.validation.constraints.NotNull
    private String editTeamResourcePath;
    @javax.validation.constraints.NotNull
    private String editTeamUrl;
    @javax.validation.constraints.NotNull
    private String id;
    private OrganizationInvitationConnectionGQO invitations;
    @javax.validation.constraints.NotNull
    private UserStatusConnectionGQO memberStatuses;
    @javax.validation.constraints.NotNull
    private TeamMemberConnectionGQO members;
    @javax.validation.constraints.NotNull
    private String membersResourcePath;
    @javax.validation.constraints.NotNull
    private String membersUrl;
    @javax.validation.constraints.NotNull
    private String name;
    @javax.validation.constraints.NotNull
    private String newTeamResourcePath;
    @javax.validation.constraints.NotNull
    private String newTeamUrl;
    @javax.validation.constraints.NotNull
    private OrganizationGQO organization;
    private TeamGQO parentTeam;
    @javax.validation.constraints.NotNull
    private TeamPrivacyGQO privacy;
    @javax.validation.constraints.NotNull
    private TeamRepositoryConnectionGQO repositories;
    @javax.validation.constraints.NotNull
    private String repositoriesResourcePath;
    @javax.validation.constraints.NotNull
    private String repositoriesUrl;
    @javax.validation.constraints.NotNull
    private String resourcePath;
    private TeamReviewAssignmentAlgorithmGQO reviewRequestDelegationAlgorithm;
    @javax.validation.constraints.NotNull
    private Boolean reviewRequestDelegationEnabled;
    private Integer reviewRequestDelegationMemberCount;
    @javax.validation.constraints.NotNull
    private Boolean reviewRequestDelegationNotifyTeam;
    @javax.validation.constraints.NotNull
    private String slug;
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
    private Boolean viewerCanSubscribe;
    private SubscriptionStateGQO viewerSubscription;

    public TeamGQO() {
    }

    public TeamGQO(TeamConnectionGQO ancestors, String avatarUrl, TeamConnectionGQO childTeams, String combinedSlug, java.util.Date createdAt, String description, TeamDiscussionGQO discussion, TeamDiscussionConnectionGQO discussions, String discussionsResourcePath, String discussionsUrl, String editTeamResourcePath, String editTeamUrl, String id, OrganizationInvitationConnectionGQO invitations, UserStatusConnectionGQO memberStatuses, TeamMemberConnectionGQO members, String membersResourcePath, String membersUrl, String name, String newTeamResourcePath, String newTeamUrl, OrganizationGQO organization, TeamGQO parentTeam, TeamPrivacyGQO privacy, TeamRepositoryConnectionGQO repositories, String repositoriesResourcePath, String repositoriesUrl, String resourcePath, TeamReviewAssignmentAlgorithmGQO reviewRequestDelegationAlgorithm, Boolean reviewRequestDelegationEnabled, Integer reviewRequestDelegationMemberCount, Boolean reviewRequestDelegationNotifyTeam, String slug, String teamsResourcePath, String teamsUrl, java.util.Date updatedAt, String url, Boolean viewerCanAdminister, Boolean viewerCanSubscribe, SubscriptionStateGQO viewerSubscription) {
        this.ancestors = ancestors;
        this.avatarUrl = avatarUrl;
        this.childTeams = childTeams;
        this.combinedSlug = combinedSlug;
        this.createdAt = createdAt;
        this.description = description;
        this.discussion = discussion;
        this.discussions = discussions;
        this.discussionsResourcePath = discussionsResourcePath;
        this.discussionsUrl = discussionsUrl;
        this.editTeamResourcePath = editTeamResourcePath;
        this.editTeamUrl = editTeamUrl;
        this.id = id;
        this.invitations = invitations;
        this.memberStatuses = memberStatuses;
        this.members = members;
        this.membersResourcePath = membersResourcePath;
        this.membersUrl = membersUrl;
        this.name = name;
        this.newTeamResourcePath = newTeamResourcePath;
        this.newTeamUrl = newTeamUrl;
        this.organization = organization;
        this.parentTeam = parentTeam;
        this.privacy = privacy;
        this.repositories = repositories;
        this.repositoriesResourcePath = repositoriesResourcePath;
        this.repositoriesUrl = repositoriesUrl;
        this.resourcePath = resourcePath;
        this.reviewRequestDelegationAlgorithm = reviewRequestDelegationAlgorithm;
        this.reviewRequestDelegationEnabled = reviewRequestDelegationEnabled;
        this.reviewRequestDelegationMemberCount = reviewRequestDelegationMemberCount;
        this.reviewRequestDelegationNotifyTeam = reviewRequestDelegationNotifyTeam;
        this.slug = slug;
        this.teamsResourcePath = teamsResourcePath;
        this.teamsUrl = teamsUrl;
        this.updatedAt = updatedAt;
        this.url = url;
        this.viewerCanAdminister = viewerCanAdminister;
        this.viewerCanSubscribe = viewerCanSubscribe;
        this.viewerSubscription = viewerSubscription;
    }

    public TeamConnectionGQO getAncestors() {
        return ancestors;
    }
    public void setAncestors(TeamConnectionGQO ancestors) {
        this.ancestors = ancestors;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }
    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public TeamConnectionGQO getChildTeams() {
        return childTeams;
    }
    public void setChildTeams(TeamConnectionGQO childTeams) {
        this.childTeams = childTeams;
    }

    public String getCombinedSlug() {
        return combinedSlug;
    }
    public void setCombinedSlug(String combinedSlug) {
        this.combinedSlug = combinedSlug;
    }

    public java.util.Date getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public TeamDiscussionGQO getDiscussion() {
        return discussion;
    }
    public void setDiscussion(TeamDiscussionGQO discussion) {
        this.discussion = discussion;
    }

    public TeamDiscussionConnectionGQO getDiscussions() {
        return discussions;
    }
    public void setDiscussions(TeamDiscussionConnectionGQO discussions) {
        this.discussions = discussions;
    }

    public String getDiscussionsResourcePath() {
        return discussionsResourcePath;
    }
    public void setDiscussionsResourcePath(String discussionsResourcePath) {
        this.discussionsResourcePath = discussionsResourcePath;
    }

    public String getDiscussionsUrl() {
        return discussionsUrl;
    }
    public void setDiscussionsUrl(String discussionsUrl) {
        this.discussionsUrl = discussionsUrl;
    }

    public String getEditTeamResourcePath() {
        return editTeamResourcePath;
    }
    public void setEditTeamResourcePath(String editTeamResourcePath) {
        this.editTeamResourcePath = editTeamResourcePath;
    }

    public String getEditTeamUrl() {
        return editTeamUrl;
    }
    public void setEditTeamUrl(String editTeamUrl) {
        this.editTeamUrl = editTeamUrl;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public OrganizationInvitationConnectionGQO getInvitations() {
        return invitations;
    }
    public void setInvitations(OrganizationInvitationConnectionGQO invitations) {
        this.invitations = invitations;
    }

    public UserStatusConnectionGQO getMemberStatuses() {
        return memberStatuses;
    }
    public void setMemberStatuses(UserStatusConnectionGQO memberStatuses) {
        this.memberStatuses = memberStatuses;
    }

    public TeamMemberConnectionGQO getMembers() {
        return members;
    }
    public void setMembers(TeamMemberConnectionGQO members) {
        this.members = members;
    }

    public String getMembersResourcePath() {
        return membersResourcePath;
    }
    public void setMembersResourcePath(String membersResourcePath) {
        this.membersResourcePath = membersResourcePath;
    }

    public String getMembersUrl() {
        return membersUrl;
    }
    public void setMembersUrl(String membersUrl) {
        this.membersUrl = membersUrl;
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

    public OrganizationGQO getOrganization() {
        return organization;
    }
    public void setOrganization(OrganizationGQO organization) {
        this.organization = organization;
    }

    public TeamGQO getParentTeam() {
        return parentTeam;
    }
    public void setParentTeam(TeamGQO parentTeam) {
        this.parentTeam = parentTeam;
    }

    public TeamPrivacyGQO getPrivacy() {
        return privacy;
    }
    public void setPrivacy(TeamPrivacyGQO privacy) {
        this.privacy = privacy;
    }

    public TeamRepositoryConnectionGQO getRepositories() {
        return repositories;
    }
    public void setRepositories(TeamRepositoryConnectionGQO repositories) {
        this.repositories = repositories;
    }

    public String getRepositoriesResourcePath() {
        return repositoriesResourcePath;
    }
    public void setRepositoriesResourcePath(String repositoriesResourcePath) {
        this.repositoriesResourcePath = repositoriesResourcePath;
    }

    public String getRepositoriesUrl() {
        return repositoriesUrl;
    }
    public void setRepositoriesUrl(String repositoriesUrl) {
        this.repositoriesUrl = repositoriesUrl;
    }

    public String getResourcePath() {
        return resourcePath;
    }
    public void setResourcePath(String resourcePath) {
        this.resourcePath = resourcePath;
    }

    public TeamReviewAssignmentAlgorithmGQO getReviewRequestDelegationAlgorithm() {
        return reviewRequestDelegationAlgorithm;
    }
    public void setReviewRequestDelegationAlgorithm(TeamReviewAssignmentAlgorithmGQO reviewRequestDelegationAlgorithm) {
        this.reviewRequestDelegationAlgorithm = reviewRequestDelegationAlgorithm;
    }

    public Boolean getReviewRequestDelegationEnabled() {
        return reviewRequestDelegationEnabled;
    }
    public void setReviewRequestDelegationEnabled(Boolean reviewRequestDelegationEnabled) {
        this.reviewRequestDelegationEnabled = reviewRequestDelegationEnabled;
    }

    public Integer getReviewRequestDelegationMemberCount() {
        return reviewRequestDelegationMemberCount;
    }
    public void setReviewRequestDelegationMemberCount(Integer reviewRequestDelegationMemberCount) {
        this.reviewRequestDelegationMemberCount = reviewRequestDelegationMemberCount;
    }

    public Boolean getReviewRequestDelegationNotifyTeam() {
        return reviewRequestDelegationNotifyTeam;
    }
    public void setReviewRequestDelegationNotifyTeam(Boolean reviewRequestDelegationNotifyTeam) {
        this.reviewRequestDelegationNotifyTeam = reviewRequestDelegationNotifyTeam;
    }

    public String getSlug() {
        return slug;
    }
    public void setSlug(String slug) {
        this.slug = slug;
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

    public Boolean getViewerCanSubscribe() {
        return viewerCanSubscribe;
    }
    public void setViewerCanSubscribe(Boolean viewerCanSubscribe) {
        this.viewerCanSubscribe = viewerCanSubscribe;
    }

    public SubscriptionStateGQO getViewerSubscription() {
        return viewerSubscription;
    }
    public void setViewerSubscription(SubscriptionStateGQO viewerSubscription) {
        this.viewerSubscription = viewerSubscription;
    }

}