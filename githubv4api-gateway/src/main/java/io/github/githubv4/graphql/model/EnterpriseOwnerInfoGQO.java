package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class EnterpriseOwnerInfoGQO {

    @javax.validation.constraints.NotNull
    private OrganizationConnectionGQO actionExecutionCapabilitySettingOrganizations;
    @javax.validation.constraints.NotNull
    private EnterpriseAdministratorConnectionGQO admins;
    @javax.validation.constraints.NotNull
    private UserConnectionGQO affiliatedUsersWithTwoFactorDisabled;
    @javax.validation.constraints.NotNull
    private Boolean affiliatedUsersWithTwoFactorDisabledExist;
    @javax.validation.constraints.NotNull
    private EnterpriseEnabledDisabledSettingValueGQO allowPrivateRepositoryForkingSetting;
    @javax.validation.constraints.NotNull
    private OrganizationConnectionGQO allowPrivateRepositoryForkingSettingOrganizations;
    @javax.validation.constraints.NotNull
    private EnterpriseDefaultRepositoryPermissionSettingValueGQO defaultRepositoryPermissionSetting;
    @javax.validation.constraints.NotNull
    private OrganizationConnectionGQO defaultRepositoryPermissionSettingOrganizations;
    @javax.validation.constraints.NotNull
    private EnterpriseServerInstallationConnectionGQO enterpriseServerInstallations;
    @javax.validation.constraints.NotNull
    private Boolean isUpdatingDefaultRepositoryPermission;
    @javax.validation.constraints.NotNull
    private Boolean isUpdatingTwoFactorRequirement;
    @javax.validation.constraints.NotNull
    private EnterpriseEnabledDisabledSettingValueGQO membersCanChangeRepositoryVisibilitySetting;
    @javax.validation.constraints.NotNull
    private OrganizationConnectionGQO membersCanChangeRepositoryVisibilitySettingOrganizations;
    private Boolean membersCanCreateInternalRepositoriesSetting;
    private Boolean membersCanCreatePrivateRepositoriesSetting;
    private Boolean membersCanCreatePublicRepositoriesSetting;
    private EnterpriseMembersCanCreateRepositoriesSettingValueGQO membersCanCreateRepositoriesSetting;
    @javax.validation.constraints.NotNull
    private OrganizationConnectionGQO membersCanCreateRepositoriesSettingOrganizations;
    @javax.validation.constraints.NotNull
    private EnterpriseEnabledDisabledSettingValueGQO membersCanDeleteIssuesSetting;
    @javax.validation.constraints.NotNull
    private OrganizationConnectionGQO membersCanDeleteIssuesSettingOrganizations;
    @javax.validation.constraints.NotNull
    private EnterpriseEnabledDisabledSettingValueGQO membersCanDeleteRepositoriesSetting;
    @javax.validation.constraints.NotNull
    private OrganizationConnectionGQO membersCanDeleteRepositoriesSettingOrganizations;
    @javax.validation.constraints.NotNull
    private EnterpriseEnabledDisabledSettingValueGQO membersCanInviteCollaboratorsSetting;
    @javax.validation.constraints.NotNull
    private OrganizationConnectionGQO membersCanInviteCollaboratorsSettingOrganizations;
    @javax.validation.constraints.NotNull
    private EnterpriseMembersCanMakePurchasesSettingValueGQO membersCanMakePurchasesSetting;
    @javax.validation.constraints.NotNull
    private EnterpriseEnabledDisabledSettingValueGQO membersCanUpdateProtectedBranchesSetting;
    @javax.validation.constraints.NotNull
    private OrganizationConnectionGQO membersCanUpdateProtectedBranchesSettingOrganizations;
    @javax.validation.constraints.NotNull
    private EnterpriseEnabledDisabledSettingValueGQO membersCanViewDependencyInsightsSetting;
    @javax.validation.constraints.NotNull
    private OrganizationConnectionGQO membersCanViewDependencyInsightsSettingOrganizations;
    @javax.validation.constraints.NotNull
    private EnterpriseEnabledDisabledSettingValueGQO organizationProjectsSetting;
    @javax.validation.constraints.NotNull
    private OrganizationConnectionGQO organizationProjectsSettingOrganizations;
    @javax.validation.constraints.NotNull
    private EnterpriseOutsideCollaboratorConnectionGQO outsideCollaborators;
    @javax.validation.constraints.NotNull
    private EnterpriseAdministratorInvitationConnectionGQO pendingAdminInvitations;
    @javax.validation.constraints.NotNull
    private EnterprisePendingCollaboratorConnectionGQO pendingCollaborators;
    @javax.validation.constraints.NotNull
    private EnterprisePendingMemberInvitationConnectionGQO pendingMemberInvitations;
    @javax.validation.constraints.NotNull
    private EnterpriseEnabledDisabledSettingValueGQO repositoryProjectsSetting;
    @javax.validation.constraints.NotNull
    private OrganizationConnectionGQO repositoryProjectsSettingOrganizations;
    private EnterpriseIdentityProviderGQO samlIdentityProvider;
    @javax.validation.constraints.NotNull
    private OrganizationConnectionGQO samlIdentityProviderSettingOrganizations;
    @javax.validation.constraints.NotNull
    private EnterpriseEnabledDisabledSettingValueGQO teamDiscussionsSetting;
    @javax.validation.constraints.NotNull
    private OrganizationConnectionGQO teamDiscussionsSettingOrganizations;
    @javax.validation.constraints.NotNull
    private EnterpriseEnabledSettingValueGQO twoFactorRequiredSetting;
    @javax.validation.constraints.NotNull
    private OrganizationConnectionGQO twoFactorRequiredSettingOrganizations;

    public EnterpriseOwnerInfoGQO() {
    }

    public EnterpriseOwnerInfoGQO(OrganizationConnectionGQO actionExecutionCapabilitySettingOrganizations, EnterpriseAdministratorConnectionGQO admins, UserConnectionGQO affiliatedUsersWithTwoFactorDisabled, Boolean affiliatedUsersWithTwoFactorDisabledExist, EnterpriseEnabledDisabledSettingValueGQO allowPrivateRepositoryForkingSetting, OrganizationConnectionGQO allowPrivateRepositoryForkingSettingOrganizations, EnterpriseDefaultRepositoryPermissionSettingValueGQO defaultRepositoryPermissionSetting, OrganizationConnectionGQO defaultRepositoryPermissionSettingOrganizations, EnterpriseServerInstallationConnectionGQO enterpriseServerInstallations, Boolean isUpdatingDefaultRepositoryPermission, Boolean isUpdatingTwoFactorRequirement, EnterpriseEnabledDisabledSettingValueGQO membersCanChangeRepositoryVisibilitySetting, OrganizationConnectionGQO membersCanChangeRepositoryVisibilitySettingOrganizations, Boolean membersCanCreateInternalRepositoriesSetting, Boolean membersCanCreatePrivateRepositoriesSetting, Boolean membersCanCreatePublicRepositoriesSetting, EnterpriseMembersCanCreateRepositoriesSettingValueGQO membersCanCreateRepositoriesSetting, OrganizationConnectionGQO membersCanCreateRepositoriesSettingOrganizations, EnterpriseEnabledDisabledSettingValueGQO membersCanDeleteIssuesSetting, OrganizationConnectionGQO membersCanDeleteIssuesSettingOrganizations, EnterpriseEnabledDisabledSettingValueGQO membersCanDeleteRepositoriesSetting, OrganizationConnectionGQO membersCanDeleteRepositoriesSettingOrganizations, EnterpriseEnabledDisabledSettingValueGQO membersCanInviteCollaboratorsSetting, OrganizationConnectionGQO membersCanInviteCollaboratorsSettingOrganizations, EnterpriseMembersCanMakePurchasesSettingValueGQO membersCanMakePurchasesSetting, EnterpriseEnabledDisabledSettingValueGQO membersCanUpdateProtectedBranchesSetting, OrganizationConnectionGQO membersCanUpdateProtectedBranchesSettingOrganizations, EnterpriseEnabledDisabledSettingValueGQO membersCanViewDependencyInsightsSetting, OrganizationConnectionGQO membersCanViewDependencyInsightsSettingOrganizations, EnterpriseEnabledDisabledSettingValueGQO organizationProjectsSetting, OrganizationConnectionGQO organizationProjectsSettingOrganizations, EnterpriseOutsideCollaboratorConnectionGQO outsideCollaborators, EnterpriseAdministratorInvitationConnectionGQO pendingAdminInvitations, EnterprisePendingCollaboratorConnectionGQO pendingCollaborators, EnterprisePendingMemberInvitationConnectionGQO pendingMemberInvitations, EnterpriseEnabledDisabledSettingValueGQO repositoryProjectsSetting, OrganizationConnectionGQO repositoryProjectsSettingOrganizations, EnterpriseIdentityProviderGQO samlIdentityProvider, OrganizationConnectionGQO samlIdentityProviderSettingOrganizations, EnterpriseEnabledDisabledSettingValueGQO teamDiscussionsSetting, OrganizationConnectionGQO teamDiscussionsSettingOrganizations, EnterpriseEnabledSettingValueGQO twoFactorRequiredSetting, OrganizationConnectionGQO twoFactorRequiredSettingOrganizations) {
        this.actionExecutionCapabilitySettingOrganizations = actionExecutionCapabilitySettingOrganizations;
        this.admins = admins;
        this.affiliatedUsersWithTwoFactorDisabled = affiliatedUsersWithTwoFactorDisabled;
        this.affiliatedUsersWithTwoFactorDisabledExist = affiliatedUsersWithTwoFactorDisabledExist;
        this.allowPrivateRepositoryForkingSetting = allowPrivateRepositoryForkingSetting;
        this.allowPrivateRepositoryForkingSettingOrganizations = allowPrivateRepositoryForkingSettingOrganizations;
        this.defaultRepositoryPermissionSetting = defaultRepositoryPermissionSetting;
        this.defaultRepositoryPermissionSettingOrganizations = defaultRepositoryPermissionSettingOrganizations;
        this.enterpriseServerInstallations = enterpriseServerInstallations;
        this.isUpdatingDefaultRepositoryPermission = isUpdatingDefaultRepositoryPermission;
        this.isUpdatingTwoFactorRequirement = isUpdatingTwoFactorRequirement;
        this.membersCanChangeRepositoryVisibilitySetting = membersCanChangeRepositoryVisibilitySetting;
        this.membersCanChangeRepositoryVisibilitySettingOrganizations = membersCanChangeRepositoryVisibilitySettingOrganizations;
        this.membersCanCreateInternalRepositoriesSetting = membersCanCreateInternalRepositoriesSetting;
        this.membersCanCreatePrivateRepositoriesSetting = membersCanCreatePrivateRepositoriesSetting;
        this.membersCanCreatePublicRepositoriesSetting = membersCanCreatePublicRepositoriesSetting;
        this.membersCanCreateRepositoriesSetting = membersCanCreateRepositoriesSetting;
        this.membersCanCreateRepositoriesSettingOrganizations = membersCanCreateRepositoriesSettingOrganizations;
        this.membersCanDeleteIssuesSetting = membersCanDeleteIssuesSetting;
        this.membersCanDeleteIssuesSettingOrganizations = membersCanDeleteIssuesSettingOrganizations;
        this.membersCanDeleteRepositoriesSetting = membersCanDeleteRepositoriesSetting;
        this.membersCanDeleteRepositoriesSettingOrganizations = membersCanDeleteRepositoriesSettingOrganizations;
        this.membersCanInviteCollaboratorsSetting = membersCanInviteCollaboratorsSetting;
        this.membersCanInviteCollaboratorsSettingOrganizations = membersCanInviteCollaboratorsSettingOrganizations;
        this.membersCanMakePurchasesSetting = membersCanMakePurchasesSetting;
        this.membersCanUpdateProtectedBranchesSetting = membersCanUpdateProtectedBranchesSetting;
        this.membersCanUpdateProtectedBranchesSettingOrganizations = membersCanUpdateProtectedBranchesSettingOrganizations;
        this.membersCanViewDependencyInsightsSetting = membersCanViewDependencyInsightsSetting;
        this.membersCanViewDependencyInsightsSettingOrganizations = membersCanViewDependencyInsightsSettingOrganizations;
        this.organizationProjectsSetting = organizationProjectsSetting;
        this.organizationProjectsSettingOrganizations = organizationProjectsSettingOrganizations;
        this.outsideCollaborators = outsideCollaborators;
        this.pendingAdminInvitations = pendingAdminInvitations;
        this.pendingCollaborators = pendingCollaborators;
        this.pendingMemberInvitations = pendingMemberInvitations;
        this.repositoryProjectsSetting = repositoryProjectsSetting;
        this.repositoryProjectsSettingOrganizations = repositoryProjectsSettingOrganizations;
        this.samlIdentityProvider = samlIdentityProvider;
        this.samlIdentityProviderSettingOrganizations = samlIdentityProviderSettingOrganizations;
        this.teamDiscussionsSetting = teamDiscussionsSetting;
        this.teamDiscussionsSettingOrganizations = teamDiscussionsSettingOrganizations;
        this.twoFactorRequiredSetting = twoFactorRequiredSetting;
        this.twoFactorRequiredSettingOrganizations = twoFactorRequiredSettingOrganizations;
    }

    public OrganizationConnectionGQO getActionExecutionCapabilitySettingOrganizations() {
        return actionExecutionCapabilitySettingOrganizations;
    }
    public void setActionExecutionCapabilitySettingOrganizations(OrganizationConnectionGQO actionExecutionCapabilitySettingOrganizations) {
        this.actionExecutionCapabilitySettingOrganizations = actionExecutionCapabilitySettingOrganizations;
    }

    public EnterpriseAdministratorConnectionGQO getAdmins() {
        return admins;
    }
    public void setAdmins(EnterpriseAdministratorConnectionGQO admins) {
        this.admins = admins;
    }

    public UserConnectionGQO getAffiliatedUsersWithTwoFactorDisabled() {
        return affiliatedUsersWithTwoFactorDisabled;
    }
    public void setAffiliatedUsersWithTwoFactorDisabled(UserConnectionGQO affiliatedUsersWithTwoFactorDisabled) {
        this.affiliatedUsersWithTwoFactorDisabled = affiliatedUsersWithTwoFactorDisabled;
    }

    public Boolean getAffiliatedUsersWithTwoFactorDisabledExist() {
        return affiliatedUsersWithTwoFactorDisabledExist;
    }
    public void setAffiliatedUsersWithTwoFactorDisabledExist(Boolean affiliatedUsersWithTwoFactorDisabledExist) {
        this.affiliatedUsersWithTwoFactorDisabledExist = affiliatedUsersWithTwoFactorDisabledExist;
    }

    public EnterpriseEnabledDisabledSettingValueGQO getAllowPrivateRepositoryForkingSetting() {
        return allowPrivateRepositoryForkingSetting;
    }
    public void setAllowPrivateRepositoryForkingSetting(EnterpriseEnabledDisabledSettingValueGQO allowPrivateRepositoryForkingSetting) {
        this.allowPrivateRepositoryForkingSetting = allowPrivateRepositoryForkingSetting;
    }

    public OrganizationConnectionGQO getAllowPrivateRepositoryForkingSettingOrganizations() {
        return allowPrivateRepositoryForkingSettingOrganizations;
    }
    public void setAllowPrivateRepositoryForkingSettingOrganizations(OrganizationConnectionGQO allowPrivateRepositoryForkingSettingOrganizations) {
        this.allowPrivateRepositoryForkingSettingOrganizations = allowPrivateRepositoryForkingSettingOrganizations;
    }

    public EnterpriseDefaultRepositoryPermissionSettingValueGQO getDefaultRepositoryPermissionSetting() {
        return defaultRepositoryPermissionSetting;
    }
    public void setDefaultRepositoryPermissionSetting(EnterpriseDefaultRepositoryPermissionSettingValueGQO defaultRepositoryPermissionSetting) {
        this.defaultRepositoryPermissionSetting = defaultRepositoryPermissionSetting;
    }

    public OrganizationConnectionGQO getDefaultRepositoryPermissionSettingOrganizations() {
        return defaultRepositoryPermissionSettingOrganizations;
    }
    public void setDefaultRepositoryPermissionSettingOrganizations(OrganizationConnectionGQO defaultRepositoryPermissionSettingOrganizations) {
        this.defaultRepositoryPermissionSettingOrganizations = defaultRepositoryPermissionSettingOrganizations;
    }

    public EnterpriseServerInstallationConnectionGQO getEnterpriseServerInstallations() {
        return enterpriseServerInstallations;
    }
    public void setEnterpriseServerInstallations(EnterpriseServerInstallationConnectionGQO enterpriseServerInstallations) {
        this.enterpriseServerInstallations = enterpriseServerInstallations;
    }

    public Boolean getIsUpdatingDefaultRepositoryPermission() {
        return isUpdatingDefaultRepositoryPermission;
    }
    public void setIsUpdatingDefaultRepositoryPermission(Boolean isUpdatingDefaultRepositoryPermission) {
        this.isUpdatingDefaultRepositoryPermission = isUpdatingDefaultRepositoryPermission;
    }

    public Boolean getIsUpdatingTwoFactorRequirement() {
        return isUpdatingTwoFactorRequirement;
    }
    public void setIsUpdatingTwoFactorRequirement(Boolean isUpdatingTwoFactorRequirement) {
        this.isUpdatingTwoFactorRequirement = isUpdatingTwoFactorRequirement;
    }

    public EnterpriseEnabledDisabledSettingValueGQO getMembersCanChangeRepositoryVisibilitySetting() {
        return membersCanChangeRepositoryVisibilitySetting;
    }
    public void setMembersCanChangeRepositoryVisibilitySetting(EnterpriseEnabledDisabledSettingValueGQO membersCanChangeRepositoryVisibilitySetting) {
        this.membersCanChangeRepositoryVisibilitySetting = membersCanChangeRepositoryVisibilitySetting;
    }

    public OrganizationConnectionGQO getMembersCanChangeRepositoryVisibilitySettingOrganizations() {
        return membersCanChangeRepositoryVisibilitySettingOrganizations;
    }
    public void setMembersCanChangeRepositoryVisibilitySettingOrganizations(OrganizationConnectionGQO membersCanChangeRepositoryVisibilitySettingOrganizations) {
        this.membersCanChangeRepositoryVisibilitySettingOrganizations = membersCanChangeRepositoryVisibilitySettingOrganizations;
    }

    public Boolean getMembersCanCreateInternalRepositoriesSetting() {
        return membersCanCreateInternalRepositoriesSetting;
    }
    public void setMembersCanCreateInternalRepositoriesSetting(Boolean membersCanCreateInternalRepositoriesSetting) {
        this.membersCanCreateInternalRepositoriesSetting = membersCanCreateInternalRepositoriesSetting;
    }

    public Boolean getMembersCanCreatePrivateRepositoriesSetting() {
        return membersCanCreatePrivateRepositoriesSetting;
    }
    public void setMembersCanCreatePrivateRepositoriesSetting(Boolean membersCanCreatePrivateRepositoriesSetting) {
        this.membersCanCreatePrivateRepositoriesSetting = membersCanCreatePrivateRepositoriesSetting;
    }

    public Boolean getMembersCanCreatePublicRepositoriesSetting() {
        return membersCanCreatePublicRepositoriesSetting;
    }
    public void setMembersCanCreatePublicRepositoriesSetting(Boolean membersCanCreatePublicRepositoriesSetting) {
        this.membersCanCreatePublicRepositoriesSetting = membersCanCreatePublicRepositoriesSetting;
    }

    public EnterpriseMembersCanCreateRepositoriesSettingValueGQO getMembersCanCreateRepositoriesSetting() {
        return membersCanCreateRepositoriesSetting;
    }
    public void setMembersCanCreateRepositoriesSetting(EnterpriseMembersCanCreateRepositoriesSettingValueGQO membersCanCreateRepositoriesSetting) {
        this.membersCanCreateRepositoriesSetting = membersCanCreateRepositoriesSetting;
    }

    public OrganizationConnectionGQO getMembersCanCreateRepositoriesSettingOrganizations() {
        return membersCanCreateRepositoriesSettingOrganizations;
    }
    public void setMembersCanCreateRepositoriesSettingOrganizations(OrganizationConnectionGQO membersCanCreateRepositoriesSettingOrganizations) {
        this.membersCanCreateRepositoriesSettingOrganizations = membersCanCreateRepositoriesSettingOrganizations;
    }

    public EnterpriseEnabledDisabledSettingValueGQO getMembersCanDeleteIssuesSetting() {
        return membersCanDeleteIssuesSetting;
    }
    public void setMembersCanDeleteIssuesSetting(EnterpriseEnabledDisabledSettingValueGQO membersCanDeleteIssuesSetting) {
        this.membersCanDeleteIssuesSetting = membersCanDeleteIssuesSetting;
    }

    public OrganizationConnectionGQO getMembersCanDeleteIssuesSettingOrganizations() {
        return membersCanDeleteIssuesSettingOrganizations;
    }
    public void setMembersCanDeleteIssuesSettingOrganizations(OrganizationConnectionGQO membersCanDeleteIssuesSettingOrganizations) {
        this.membersCanDeleteIssuesSettingOrganizations = membersCanDeleteIssuesSettingOrganizations;
    }

    public EnterpriseEnabledDisabledSettingValueGQO getMembersCanDeleteRepositoriesSetting() {
        return membersCanDeleteRepositoriesSetting;
    }
    public void setMembersCanDeleteRepositoriesSetting(EnterpriseEnabledDisabledSettingValueGQO membersCanDeleteRepositoriesSetting) {
        this.membersCanDeleteRepositoriesSetting = membersCanDeleteRepositoriesSetting;
    }

    public OrganizationConnectionGQO getMembersCanDeleteRepositoriesSettingOrganizations() {
        return membersCanDeleteRepositoriesSettingOrganizations;
    }
    public void setMembersCanDeleteRepositoriesSettingOrganizations(OrganizationConnectionGQO membersCanDeleteRepositoriesSettingOrganizations) {
        this.membersCanDeleteRepositoriesSettingOrganizations = membersCanDeleteRepositoriesSettingOrganizations;
    }

    public EnterpriseEnabledDisabledSettingValueGQO getMembersCanInviteCollaboratorsSetting() {
        return membersCanInviteCollaboratorsSetting;
    }
    public void setMembersCanInviteCollaboratorsSetting(EnterpriseEnabledDisabledSettingValueGQO membersCanInviteCollaboratorsSetting) {
        this.membersCanInviteCollaboratorsSetting = membersCanInviteCollaboratorsSetting;
    }

    public OrganizationConnectionGQO getMembersCanInviteCollaboratorsSettingOrganizations() {
        return membersCanInviteCollaboratorsSettingOrganizations;
    }
    public void setMembersCanInviteCollaboratorsSettingOrganizations(OrganizationConnectionGQO membersCanInviteCollaboratorsSettingOrganizations) {
        this.membersCanInviteCollaboratorsSettingOrganizations = membersCanInviteCollaboratorsSettingOrganizations;
    }

    public EnterpriseMembersCanMakePurchasesSettingValueGQO getMembersCanMakePurchasesSetting() {
        return membersCanMakePurchasesSetting;
    }
    public void setMembersCanMakePurchasesSetting(EnterpriseMembersCanMakePurchasesSettingValueGQO membersCanMakePurchasesSetting) {
        this.membersCanMakePurchasesSetting = membersCanMakePurchasesSetting;
    }

    public EnterpriseEnabledDisabledSettingValueGQO getMembersCanUpdateProtectedBranchesSetting() {
        return membersCanUpdateProtectedBranchesSetting;
    }
    public void setMembersCanUpdateProtectedBranchesSetting(EnterpriseEnabledDisabledSettingValueGQO membersCanUpdateProtectedBranchesSetting) {
        this.membersCanUpdateProtectedBranchesSetting = membersCanUpdateProtectedBranchesSetting;
    }

    public OrganizationConnectionGQO getMembersCanUpdateProtectedBranchesSettingOrganizations() {
        return membersCanUpdateProtectedBranchesSettingOrganizations;
    }
    public void setMembersCanUpdateProtectedBranchesSettingOrganizations(OrganizationConnectionGQO membersCanUpdateProtectedBranchesSettingOrganizations) {
        this.membersCanUpdateProtectedBranchesSettingOrganizations = membersCanUpdateProtectedBranchesSettingOrganizations;
    }

    public EnterpriseEnabledDisabledSettingValueGQO getMembersCanViewDependencyInsightsSetting() {
        return membersCanViewDependencyInsightsSetting;
    }
    public void setMembersCanViewDependencyInsightsSetting(EnterpriseEnabledDisabledSettingValueGQO membersCanViewDependencyInsightsSetting) {
        this.membersCanViewDependencyInsightsSetting = membersCanViewDependencyInsightsSetting;
    }

    public OrganizationConnectionGQO getMembersCanViewDependencyInsightsSettingOrganizations() {
        return membersCanViewDependencyInsightsSettingOrganizations;
    }
    public void setMembersCanViewDependencyInsightsSettingOrganizations(OrganizationConnectionGQO membersCanViewDependencyInsightsSettingOrganizations) {
        this.membersCanViewDependencyInsightsSettingOrganizations = membersCanViewDependencyInsightsSettingOrganizations;
    }

    public EnterpriseEnabledDisabledSettingValueGQO getOrganizationProjectsSetting() {
        return organizationProjectsSetting;
    }
    public void setOrganizationProjectsSetting(EnterpriseEnabledDisabledSettingValueGQO organizationProjectsSetting) {
        this.organizationProjectsSetting = organizationProjectsSetting;
    }

    public OrganizationConnectionGQO getOrganizationProjectsSettingOrganizations() {
        return organizationProjectsSettingOrganizations;
    }
    public void setOrganizationProjectsSettingOrganizations(OrganizationConnectionGQO organizationProjectsSettingOrganizations) {
        this.organizationProjectsSettingOrganizations = organizationProjectsSettingOrganizations;
    }

    public EnterpriseOutsideCollaboratorConnectionGQO getOutsideCollaborators() {
        return outsideCollaborators;
    }
    public void setOutsideCollaborators(EnterpriseOutsideCollaboratorConnectionGQO outsideCollaborators) {
        this.outsideCollaborators = outsideCollaborators;
    }

    public EnterpriseAdministratorInvitationConnectionGQO getPendingAdminInvitations() {
        return pendingAdminInvitations;
    }
    public void setPendingAdminInvitations(EnterpriseAdministratorInvitationConnectionGQO pendingAdminInvitations) {
        this.pendingAdminInvitations = pendingAdminInvitations;
    }

    public EnterprisePendingCollaboratorConnectionGQO getPendingCollaborators() {
        return pendingCollaborators;
    }
    public void setPendingCollaborators(EnterprisePendingCollaboratorConnectionGQO pendingCollaborators) {
        this.pendingCollaborators = pendingCollaborators;
    }

    public EnterprisePendingMemberInvitationConnectionGQO getPendingMemberInvitations() {
        return pendingMemberInvitations;
    }
    public void setPendingMemberInvitations(EnterprisePendingMemberInvitationConnectionGQO pendingMemberInvitations) {
        this.pendingMemberInvitations = pendingMemberInvitations;
    }

    public EnterpriseEnabledDisabledSettingValueGQO getRepositoryProjectsSetting() {
        return repositoryProjectsSetting;
    }
    public void setRepositoryProjectsSetting(EnterpriseEnabledDisabledSettingValueGQO repositoryProjectsSetting) {
        this.repositoryProjectsSetting = repositoryProjectsSetting;
    }

    public OrganizationConnectionGQO getRepositoryProjectsSettingOrganizations() {
        return repositoryProjectsSettingOrganizations;
    }
    public void setRepositoryProjectsSettingOrganizations(OrganizationConnectionGQO repositoryProjectsSettingOrganizations) {
        this.repositoryProjectsSettingOrganizations = repositoryProjectsSettingOrganizations;
    }

    public EnterpriseIdentityProviderGQO getSamlIdentityProvider() {
        return samlIdentityProvider;
    }
    public void setSamlIdentityProvider(EnterpriseIdentityProviderGQO samlIdentityProvider) {
        this.samlIdentityProvider = samlIdentityProvider;
    }

    public OrganizationConnectionGQO getSamlIdentityProviderSettingOrganizations() {
        return samlIdentityProviderSettingOrganizations;
    }
    public void setSamlIdentityProviderSettingOrganizations(OrganizationConnectionGQO samlIdentityProviderSettingOrganizations) {
        this.samlIdentityProviderSettingOrganizations = samlIdentityProviderSettingOrganizations;
    }

    public EnterpriseEnabledDisabledSettingValueGQO getTeamDiscussionsSetting() {
        return teamDiscussionsSetting;
    }
    public void setTeamDiscussionsSetting(EnterpriseEnabledDisabledSettingValueGQO teamDiscussionsSetting) {
        this.teamDiscussionsSetting = teamDiscussionsSetting;
    }

    public OrganizationConnectionGQO getTeamDiscussionsSettingOrganizations() {
        return teamDiscussionsSettingOrganizations;
    }
    public void setTeamDiscussionsSettingOrganizations(OrganizationConnectionGQO teamDiscussionsSettingOrganizations) {
        this.teamDiscussionsSettingOrganizations = teamDiscussionsSettingOrganizations;
    }

    public EnterpriseEnabledSettingValueGQO getTwoFactorRequiredSetting() {
        return twoFactorRequiredSetting;
    }
    public void setTwoFactorRequiredSetting(EnterpriseEnabledSettingValueGQO twoFactorRequiredSetting) {
        this.twoFactorRequiredSetting = twoFactorRequiredSetting;
    }

    public OrganizationConnectionGQO getTwoFactorRequiredSettingOrganizations() {
        return twoFactorRequiredSettingOrganizations;
    }
    public void setTwoFactorRequiredSettingOrganizations(OrganizationConnectionGQO twoFactorRequiredSettingOrganizations) {
        this.twoFactorRequiredSettingOrganizations = twoFactorRequiredSettingOrganizations;
    }

}