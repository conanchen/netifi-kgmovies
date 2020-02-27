package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class CreateBranchProtectionRuleInputGQO {

    private String clientMutationId;
    private Boolean dismissesStaleReviews;
    private Boolean isAdminEnforced;
    @javax.validation.constraints.NotNull
    private String pattern;
    @javax.validation.constraints.NotNull
    private Collection<String> pushActorIds;
    @javax.validation.constraints.NotNull
    private String repositoryId;
    private Integer requiredApprovingReviewCount;
    @javax.validation.constraints.NotNull
    private Collection<String> requiredStatusCheckContexts;
    private Boolean requiresApprovingReviews;
    private Boolean requiresCodeOwnerReviews;
    private Boolean requiresCommitSignatures;
    private Boolean requiresStatusChecks;
    private Boolean requiresStrictStatusChecks;
    private Boolean restrictsPushes;
    private Boolean restrictsReviewDismissals;
    @javax.validation.constraints.NotNull
    private Collection<String> reviewDismissalActorIds;

    public CreateBranchProtectionRuleInputGQO() {
    }

    public CreateBranchProtectionRuleInputGQO(String clientMutationId, Boolean dismissesStaleReviews, Boolean isAdminEnforced, String pattern, Collection<String> pushActorIds, String repositoryId, Integer requiredApprovingReviewCount, Collection<String> requiredStatusCheckContexts, Boolean requiresApprovingReviews, Boolean requiresCodeOwnerReviews, Boolean requiresCommitSignatures, Boolean requiresStatusChecks, Boolean requiresStrictStatusChecks, Boolean restrictsPushes, Boolean restrictsReviewDismissals, Collection<String> reviewDismissalActorIds) {
        this.clientMutationId = clientMutationId;
        this.dismissesStaleReviews = dismissesStaleReviews;
        this.isAdminEnforced = isAdminEnforced;
        this.pattern = pattern;
        this.pushActorIds = pushActorIds;
        this.repositoryId = repositoryId;
        this.requiredApprovingReviewCount = requiredApprovingReviewCount;
        this.requiredStatusCheckContexts = requiredStatusCheckContexts;
        this.requiresApprovingReviews = requiresApprovingReviews;
        this.requiresCodeOwnerReviews = requiresCodeOwnerReviews;
        this.requiresCommitSignatures = requiresCommitSignatures;
        this.requiresStatusChecks = requiresStatusChecks;
        this.requiresStrictStatusChecks = requiresStrictStatusChecks;
        this.restrictsPushes = restrictsPushes;
        this.restrictsReviewDismissals = restrictsReviewDismissals;
        this.reviewDismissalActorIds = reviewDismissalActorIds;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public Boolean getDismissesStaleReviews() {
        return dismissesStaleReviews;
    }
    public void setDismissesStaleReviews(Boolean dismissesStaleReviews) {
        this.dismissesStaleReviews = dismissesStaleReviews;
    }

    public Boolean getIsAdminEnforced() {
        return isAdminEnforced;
    }
    public void setIsAdminEnforced(Boolean isAdminEnforced) {
        this.isAdminEnforced = isAdminEnforced;
    }

    public String getPattern() {
        return pattern;
    }
    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    public Collection<String> getPushActorIds() {
        return pushActorIds;
    }
    public void setPushActorIds(Collection<String> pushActorIds) {
        this.pushActorIds = pushActorIds;
    }

    public String getRepositoryId() {
        return repositoryId;
    }
    public void setRepositoryId(String repositoryId) {
        this.repositoryId = repositoryId;
    }

    public Integer getRequiredApprovingReviewCount() {
        return requiredApprovingReviewCount;
    }
    public void setRequiredApprovingReviewCount(Integer requiredApprovingReviewCount) {
        this.requiredApprovingReviewCount = requiredApprovingReviewCount;
    }

    public Collection<String> getRequiredStatusCheckContexts() {
        return requiredStatusCheckContexts;
    }
    public void setRequiredStatusCheckContexts(Collection<String> requiredStatusCheckContexts) {
        this.requiredStatusCheckContexts = requiredStatusCheckContexts;
    }

    public Boolean getRequiresApprovingReviews() {
        return requiresApprovingReviews;
    }
    public void setRequiresApprovingReviews(Boolean requiresApprovingReviews) {
        this.requiresApprovingReviews = requiresApprovingReviews;
    }

    public Boolean getRequiresCodeOwnerReviews() {
        return requiresCodeOwnerReviews;
    }
    public void setRequiresCodeOwnerReviews(Boolean requiresCodeOwnerReviews) {
        this.requiresCodeOwnerReviews = requiresCodeOwnerReviews;
    }

    public Boolean getRequiresCommitSignatures() {
        return requiresCommitSignatures;
    }
    public void setRequiresCommitSignatures(Boolean requiresCommitSignatures) {
        this.requiresCommitSignatures = requiresCommitSignatures;
    }

    public Boolean getRequiresStatusChecks() {
        return requiresStatusChecks;
    }
    public void setRequiresStatusChecks(Boolean requiresStatusChecks) {
        this.requiresStatusChecks = requiresStatusChecks;
    }

    public Boolean getRequiresStrictStatusChecks() {
        return requiresStrictStatusChecks;
    }
    public void setRequiresStrictStatusChecks(Boolean requiresStrictStatusChecks) {
        this.requiresStrictStatusChecks = requiresStrictStatusChecks;
    }

    public Boolean getRestrictsPushes() {
        return restrictsPushes;
    }
    public void setRestrictsPushes(Boolean restrictsPushes) {
        this.restrictsPushes = restrictsPushes;
    }

    public Boolean getRestrictsReviewDismissals() {
        return restrictsReviewDismissals;
    }
    public void setRestrictsReviewDismissals(Boolean restrictsReviewDismissals) {
        this.restrictsReviewDismissals = restrictsReviewDismissals;
    }

    public Collection<String> getReviewDismissalActorIds() {
        return reviewDismissalActorIds;
    }
    public void setReviewDismissalActorIds(Collection<String> reviewDismissalActorIds) {
        this.reviewDismissalActorIds = reviewDismissalActorIds;
    }

}