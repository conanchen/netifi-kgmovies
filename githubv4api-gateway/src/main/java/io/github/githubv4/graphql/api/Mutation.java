package io.github.githubv4.graphql.api;

import java.util.*;
import io.github.githubv4.graphql.model.*;

public interface Mutation {

    AcceptEnterpriseAdministratorInvitationPayloadGQO acceptEnterpriseAdministratorInvitation(AcceptEnterpriseAdministratorInvitationInputGQO input) throws Exception;

    AcceptTopicSuggestionPayloadGQO acceptTopicSuggestion(AcceptTopicSuggestionInputGQO input) throws Exception;

    AddAssigneesToAssignablePayloadGQO addAssigneesToAssignable(AddAssigneesToAssignableInputGQO input) throws Exception;

    AddCommentPayloadGQO addComment(AddCommentInputGQO input) throws Exception;

    AddLabelsToLabelablePayloadGQO addLabelsToLabelable(AddLabelsToLabelableInputGQO input) throws Exception;

    AddProjectCardPayloadGQO addProjectCard(AddProjectCardInputGQO input) throws Exception;

    AddProjectColumnPayloadGQO addProjectColumn(AddProjectColumnInputGQO input) throws Exception;

    AddPullRequestReviewPayloadGQO addPullRequestReview(AddPullRequestReviewInputGQO input) throws Exception;

    AddPullRequestReviewCommentPayloadGQO addPullRequestReviewComment(AddPullRequestReviewCommentInputGQO input) throws Exception;

    AddPullRequestReviewThreadPayloadGQO addPullRequestReviewThread(AddPullRequestReviewThreadInputGQO input) throws Exception;

    AddReactionPayloadGQO addReaction(AddReactionInputGQO input) throws Exception;

    AddStarPayloadGQO addStar(AddStarInputGQO input) throws Exception;

    ArchiveRepositoryPayloadGQO archiveRepository(ArchiveRepositoryInputGQO input) throws Exception;

    CancelEnterpriseAdminInvitationPayloadGQO cancelEnterpriseAdminInvitation(CancelEnterpriseAdminInvitationInputGQO input) throws Exception;

    ChangeUserStatusPayloadGQO changeUserStatus(ChangeUserStatusInputGQO input) throws Exception;

    ClearLabelsFromLabelablePayloadGQO clearLabelsFromLabelable(ClearLabelsFromLabelableInputGQO input) throws Exception;

    CloneProjectPayloadGQO cloneProject(CloneProjectInputGQO input) throws Exception;

    CloneTemplateRepositoryPayloadGQO cloneTemplateRepository(CloneTemplateRepositoryInputGQO input) throws Exception;

    CloseIssuePayloadGQO closeIssue(CloseIssueInputGQO input) throws Exception;

    ClosePullRequestPayloadGQO closePullRequest(ClosePullRequestInputGQO input) throws Exception;

    ConvertProjectCardNoteToIssuePayloadGQO convertProjectCardNoteToIssue(ConvertProjectCardNoteToIssueInputGQO input) throws Exception;

    CreateBranchProtectionRulePayloadGQO createBranchProtectionRule(CreateBranchProtectionRuleInputGQO input) throws Exception;

    CreateCheckRunPayloadGQO createCheckRun(CreateCheckRunInputGQO input) throws Exception;

    CreateCheckSuitePayloadGQO createCheckSuite(CreateCheckSuiteInputGQO input) throws Exception;

    CreateContentAttachmentPayloadGQO createContentAttachment(CreateContentAttachmentInputGQO input) throws Exception;

    CreateDeploymentPayloadGQO createDeployment(CreateDeploymentInputGQO input) throws Exception;

    CreateDeploymentStatusPayloadGQO createDeploymentStatus(CreateDeploymentStatusInputGQO input) throws Exception;

    CreateEnterpriseOrganizationPayloadGQO createEnterpriseOrganization(CreateEnterpriseOrganizationInputGQO input) throws Exception;

    CreateIssuePayloadGQO createIssue(CreateIssueInputGQO input) throws Exception;

    CreateLabelPayloadGQO createLabel(CreateLabelInputGQO input) throws Exception;

    CreateProjectPayloadGQO createProject(CreateProjectInputGQO input) throws Exception;

    CreatePullRequestPayloadGQO createPullRequest(CreatePullRequestInputGQO input) throws Exception;

    CreateRefPayloadGQO createRef(CreateRefInputGQO input) throws Exception;

    CreateRepositoryPayloadGQO createRepository(CreateRepositoryInputGQO input) throws Exception;

    CreateTeamDiscussionPayloadGQO createTeamDiscussion(CreateTeamDiscussionInputGQO input) throws Exception;

    CreateTeamDiscussionCommentPayloadGQO createTeamDiscussionComment(CreateTeamDiscussionCommentInputGQO input) throws Exception;

    DeclineTopicSuggestionPayloadGQO declineTopicSuggestion(DeclineTopicSuggestionInputGQO input) throws Exception;

    DeleteBranchProtectionRulePayloadGQO deleteBranchProtectionRule(DeleteBranchProtectionRuleInputGQO input) throws Exception;

    DeleteDeploymentPayloadGQO deleteDeployment(DeleteDeploymentInputGQO input) throws Exception;

    DeleteIssuePayloadGQO deleteIssue(DeleteIssueInputGQO input) throws Exception;

    DeleteIssueCommentPayloadGQO deleteIssueComment(DeleteIssueCommentInputGQO input) throws Exception;

    DeleteLabelPayloadGQO deleteLabel(DeleteLabelInputGQO input) throws Exception;

    DeletePackageVersionPayloadGQO deletePackageVersion(DeletePackageVersionInputGQO input) throws Exception;

    DeleteProjectPayloadGQO deleteProject(DeleteProjectInputGQO input) throws Exception;

    DeleteProjectCardPayloadGQO deleteProjectCard(DeleteProjectCardInputGQO input) throws Exception;

    DeleteProjectColumnPayloadGQO deleteProjectColumn(DeleteProjectColumnInputGQO input) throws Exception;

    DeletePullRequestReviewPayloadGQO deletePullRequestReview(DeletePullRequestReviewInputGQO input) throws Exception;

    DeletePullRequestReviewCommentPayloadGQO deletePullRequestReviewComment(DeletePullRequestReviewCommentInputGQO input) throws Exception;

    DeleteRefPayloadGQO deleteRef(DeleteRefInputGQO input) throws Exception;

    DeleteTeamDiscussionPayloadGQO deleteTeamDiscussion(DeleteTeamDiscussionInputGQO input) throws Exception;

    DeleteTeamDiscussionCommentPayloadGQO deleteTeamDiscussionComment(DeleteTeamDiscussionCommentInputGQO input) throws Exception;

    DismissPullRequestReviewPayloadGQO dismissPullRequestReview(DismissPullRequestReviewInputGQO input) throws Exception;

    FollowUserPayloadGQO followUser(FollowUserInputGQO input) throws Exception;

    ImportProjectPayloadGQO importProject(ImportProjectInputGQO input) throws Exception;

    InviteEnterpriseAdminPayloadGQO inviteEnterpriseAdmin(InviteEnterpriseAdminInputGQO input) throws Exception;

    LinkRepositoryToProjectPayloadGQO linkRepositoryToProject(LinkRepositoryToProjectInputGQO input) throws Exception;

    LockLockablePayloadGQO lockLockable(LockLockableInputGQO input) throws Exception;

    MarkPullRequestReadyForReviewPayloadGQO markPullRequestReadyForReview(MarkPullRequestReadyForReviewInputGQO input) throws Exception;

    MergeBranchPayloadGQO mergeBranch(MergeBranchInputGQO input) throws Exception;

    MergePullRequestPayloadGQO mergePullRequest(MergePullRequestInputGQO input) throws Exception;

    MinimizeCommentPayloadGQO minimizeComment(MinimizeCommentInputGQO input) throws Exception;

    MoveProjectCardPayloadGQO moveProjectCard(MoveProjectCardInputGQO input) throws Exception;

    MoveProjectColumnPayloadGQO moveProjectColumn(MoveProjectColumnInputGQO input) throws Exception;

    PinIssuePayloadGQO pinIssue(PinIssueInputGQO input) throws Exception;

    RegenerateEnterpriseIdentityProviderRecoveryCodesPayloadGQO regenerateEnterpriseIdentityProviderRecoveryCodes(RegenerateEnterpriseIdentityProviderRecoveryCodesInputGQO input) throws Exception;

    RemoveAssigneesFromAssignablePayloadGQO removeAssigneesFromAssignable(RemoveAssigneesFromAssignableInputGQO input) throws Exception;

    RemoveEnterpriseAdminPayloadGQO removeEnterpriseAdmin(RemoveEnterpriseAdminInputGQO input) throws Exception;

    RemoveEnterpriseOrganizationPayloadGQO removeEnterpriseOrganization(RemoveEnterpriseOrganizationInputGQO input) throws Exception;

    RemoveLabelsFromLabelablePayloadGQO removeLabelsFromLabelable(RemoveLabelsFromLabelableInputGQO input) throws Exception;

    RemoveOutsideCollaboratorPayloadGQO removeOutsideCollaborator(RemoveOutsideCollaboratorInputGQO input) throws Exception;

    RemoveReactionPayloadGQO removeReaction(RemoveReactionInputGQO input) throws Exception;

    RemoveStarPayloadGQO removeStar(RemoveStarInputGQO input) throws Exception;

    ReopenIssuePayloadGQO reopenIssue(ReopenIssueInputGQO input) throws Exception;

    ReopenPullRequestPayloadGQO reopenPullRequest(ReopenPullRequestInputGQO input) throws Exception;

    RequestReviewsPayloadGQO requestReviews(RequestReviewsInputGQO input) throws Exception;

    RerequestCheckSuitePayloadGQO rerequestCheckSuite(RerequestCheckSuiteInputGQO input) throws Exception;

    ResolveReviewThreadPayloadGQO resolveReviewThread(ResolveReviewThreadInputGQO input) throws Exception;

    SubmitPullRequestReviewPayloadGQO submitPullRequestReview(SubmitPullRequestReviewInputGQO input) throws Exception;

    TransferIssuePayloadGQO transferIssue(TransferIssueInputGQO input) throws Exception;

    UnarchiveRepositoryPayloadGQO unarchiveRepository(UnarchiveRepositoryInputGQO input) throws Exception;

    UnfollowUserPayloadGQO unfollowUser(UnfollowUserInputGQO input) throws Exception;

    UnlinkRepositoryFromProjectPayloadGQO unlinkRepositoryFromProject(UnlinkRepositoryFromProjectInputGQO input) throws Exception;

    UnlockLockablePayloadGQO unlockLockable(UnlockLockableInputGQO input) throws Exception;

    UnmarkIssueAsDuplicatePayloadGQO unmarkIssueAsDuplicate(UnmarkIssueAsDuplicateInputGQO input) throws Exception;

    UnminimizeCommentPayloadGQO unminimizeComment(UnminimizeCommentInputGQO input) throws Exception;

    UnpinIssuePayloadGQO unpinIssue(UnpinIssueInputGQO input) throws Exception;

    UnresolveReviewThreadPayloadGQO unresolveReviewThread(UnresolveReviewThreadInputGQO input) throws Exception;

    UpdateBranchProtectionRulePayloadGQO updateBranchProtectionRule(UpdateBranchProtectionRuleInputGQO input) throws Exception;

    UpdateCheckRunPayloadGQO updateCheckRun(UpdateCheckRunInputGQO input) throws Exception;

    UpdateCheckSuitePreferencesPayloadGQO updateCheckSuitePreferences(UpdateCheckSuitePreferencesInputGQO input) throws Exception;

    UpdateEnterpriseActionExecutionCapabilitySettingPayloadGQO updateEnterpriseActionExecutionCapabilitySetting(UpdateEnterpriseActionExecutionCapabilitySettingInputGQO input) throws Exception;

    UpdateEnterpriseAdministratorRolePayloadGQO updateEnterpriseAdministratorRole(UpdateEnterpriseAdministratorRoleInputGQO input) throws Exception;

    UpdateEnterpriseAllowPrivateRepositoryForkingSettingPayloadGQO updateEnterpriseAllowPrivateRepositoryForkingSetting(UpdateEnterpriseAllowPrivateRepositoryForkingSettingInputGQO input) throws Exception;

    UpdateEnterpriseDefaultRepositoryPermissionSettingPayloadGQO updateEnterpriseDefaultRepositoryPermissionSetting(UpdateEnterpriseDefaultRepositoryPermissionSettingInputGQO input) throws Exception;

    UpdateEnterpriseMembersCanChangeRepositoryVisibilitySettingPayloadGQO updateEnterpriseMembersCanChangeRepositoryVisibilitySetting(UpdateEnterpriseMembersCanChangeRepositoryVisibilitySettingInputGQO input) throws Exception;

    UpdateEnterpriseMembersCanCreateRepositoriesSettingPayloadGQO updateEnterpriseMembersCanCreateRepositoriesSetting(UpdateEnterpriseMembersCanCreateRepositoriesSettingInputGQO input) throws Exception;

    UpdateEnterpriseMembersCanDeleteIssuesSettingPayloadGQO updateEnterpriseMembersCanDeleteIssuesSetting(UpdateEnterpriseMembersCanDeleteIssuesSettingInputGQO input) throws Exception;

    UpdateEnterpriseMembersCanDeleteRepositoriesSettingPayloadGQO updateEnterpriseMembersCanDeleteRepositoriesSetting(UpdateEnterpriseMembersCanDeleteRepositoriesSettingInputGQO input) throws Exception;

    UpdateEnterpriseMembersCanInviteCollaboratorsSettingPayloadGQO updateEnterpriseMembersCanInviteCollaboratorsSetting(UpdateEnterpriseMembersCanInviteCollaboratorsSettingInputGQO input) throws Exception;

    UpdateEnterpriseMembersCanMakePurchasesSettingPayloadGQO updateEnterpriseMembersCanMakePurchasesSetting(UpdateEnterpriseMembersCanMakePurchasesSettingInputGQO input) throws Exception;

    UpdateEnterpriseMembersCanUpdateProtectedBranchesSettingPayloadGQO updateEnterpriseMembersCanUpdateProtectedBranchesSetting(UpdateEnterpriseMembersCanUpdateProtectedBranchesSettingInputGQO input) throws Exception;

    UpdateEnterpriseMembersCanViewDependencyInsightsSettingPayloadGQO updateEnterpriseMembersCanViewDependencyInsightsSetting(UpdateEnterpriseMembersCanViewDependencyInsightsSettingInputGQO input) throws Exception;

    UpdateEnterpriseOrganizationProjectsSettingPayloadGQO updateEnterpriseOrganizationProjectsSetting(UpdateEnterpriseOrganizationProjectsSettingInputGQO input) throws Exception;

    UpdateEnterpriseProfilePayloadGQO updateEnterpriseProfile(UpdateEnterpriseProfileInputGQO input) throws Exception;

    UpdateEnterpriseRepositoryProjectsSettingPayloadGQO updateEnterpriseRepositoryProjectsSetting(UpdateEnterpriseRepositoryProjectsSettingInputGQO input) throws Exception;

    UpdateEnterpriseTeamDiscussionsSettingPayloadGQO updateEnterpriseTeamDiscussionsSetting(UpdateEnterpriseTeamDiscussionsSettingInputGQO input) throws Exception;

    UpdateEnterpriseTwoFactorAuthenticationRequiredSettingPayloadGQO updateEnterpriseTwoFactorAuthenticationRequiredSetting(UpdateEnterpriseTwoFactorAuthenticationRequiredSettingInputGQO input) throws Exception;

    UpdateIssuePayloadGQO updateIssue(UpdateIssueInputGQO input) throws Exception;

    UpdateIssueCommentPayloadGQO updateIssueComment(UpdateIssueCommentInputGQO input) throws Exception;

    UpdateLabelPayloadGQO updateLabel(UpdateLabelInputGQO input) throws Exception;

    UpdateProjectPayloadGQO updateProject(UpdateProjectInputGQO input) throws Exception;

    UpdateProjectCardPayloadGQO updateProjectCard(UpdateProjectCardInputGQO input) throws Exception;

    UpdateProjectColumnPayloadGQO updateProjectColumn(UpdateProjectColumnInputGQO input) throws Exception;

    UpdatePullRequestPayloadGQO updatePullRequest(UpdatePullRequestInputGQO input) throws Exception;

    UpdatePullRequestReviewPayloadGQO updatePullRequestReview(UpdatePullRequestReviewInputGQO input) throws Exception;

    UpdatePullRequestReviewCommentPayloadGQO updatePullRequestReviewComment(UpdatePullRequestReviewCommentInputGQO input) throws Exception;

    UpdateRefPayloadGQO updateRef(UpdateRefInputGQO input) throws Exception;

    UpdateRefsPayloadGQO updateRefs(UpdateRefsInputGQO input) throws Exception;

    UpdateRepositoryPayloadGQO updateRepository(UpdateRepositoryInputGQO input) throws Exception;

    UpdateSubscriptionPayloadGQO updateSubscription(UpdateSubscriptionInputGQO input) throws Exception;

    UpdateTeamDiscussionPayloadGQO updateTeamDiscussion(UpdateTeamDiscussionInputGQO input) throws Exception;

    UpdateTeamDiscussionCommentPayloadGQO updateTeamDiscussionComment(UpdateTeamDiscussionCommentInputGQO input) throws Exception;

    UpdateTeamReviewAssignmentPayloadGQO updateTeamReviewAssignment(UpdateTeamReviewAssignmentInputGQO input) throws Exception;

    UpdateTopicsPayloadGQO updateTopics(UpdateTopicsInputGQO input) throws Exception;

}