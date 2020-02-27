package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class BranchProtectionRuleGQO implements NodeGQO{

    @javax.validation.constraints.NotNull
    private BranchProtectionRuleConflictConnectionGQO branchProtectionRuleConflicts;
    private ActorGQO creator;
    private Integer databaseId;
    @javax.validation.constraints.NotNull
    private Boolean dismissesStaleReviews;
    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private Boolean isAdminEnforced;
    @javax.validation.constraints.NotNull
    private RefConnectionGQO matchingRefs;
    @javax.validation.constraints.NotNull
    private String pattern;
    @javax.validation.constraints.NotNull
    private PushAllowanceConnectionGQO pushAllowances;
    private RepositoryGQO repository;
    private Integer requiredApprovingReviewCount;
    private Collection<String> requiredStatusCheckContexts;
    @javax.validation.constraints.NotNull
    private Boolean requiresApprovingReviews;
    @javax.validation.constraints.NotNull
    private Boolean requiresCodeOwnerReviews;
    @javax.validation.constraints.NotNull
    private Boolean requiresCommitSignatures;
    @javax.validation.constraints.NotNull
    private Boolean requiresStatusChecks;
    @javax.validation.constraints.NotNull
    private Boolean requiresStrictStatusChecks;
    @javax.validation.constraints.NotNull
    private Boolean restrictsPushes;
    @javax.validation.constraints.NotNull
    private Boolean restrictsReviewDismissals;
    @javax.validation.constraints.NotNull
    private ReviewDismissalAllowanceConnectionGQO reviewDismissalAllowances;

    public BranchProtectionRuleGQO() {
    }

    public BranchProtectionRuleGQO(BranchProtectionRuleConflictConnectionGQO branchProtectionRuleConflicts, ActorGQO creator, Integer databaseId, Boolean dismissesStaleReviews, String id, Boolean isAdminEnforced, RefConnectionGQO matchingRefs, String pattern, PushAllowanceConnectionGQO pushAllowances, RepositoryGQO repository, Integer requiredApprovingReviewCount, Collection<String> requiredStatusCheckContexts, Boolean requiresApprovingReviews, Boolean requiresCodeOwnerReviews, Boolean requiresCommitSignatures, Boolean requiresStatusChecks, Boolean requiresStrictStatusChecks, Boolean restrictsPushes, Boolean restrictsReviewDismissals, ReviewDismissalAllowanceConnectionGQO reviewDismissalAllowances) {
        this.branchProtectionRuleConflicts = branchProtectionRuleConflicts;
        this.creator = creator;
        this.databaseId = databaseId;
        this.dismissesStaleReviews = dismissesStaleReviews;
        this.id = id;
        this.isAdminEnforced = isAdminEnforced;
        this.matchingRefs = matchingRefs;
        this.pattern = pattern;
        this.pushAllowances = pushAllowances;
        this.repository = repository;
        this.requiredApprovingReviewCount = requiredApprovingReviewCount;
        this.requiredStatusCheckContexts = requiredStatusCheckContexts;
        this.requiresApprovingReviews = requiresApprovingReviews;
        this.requiresCodeOwnerReviews = requiresCodeOwnerReviews;
        this.requiresCommitSignatures = requiresCommitSignatures;
        this.requiresStatusChecks = requiresStatusChecks;
        this.requiresStrictStatusChecks = requiresStrictStatusChecks;
        this.restrictsPushes = restrictsPushes;
        this.restrictsReviewDismissals = restrictsReviewDismissals;
        this.reviewDismissalAllowances = reviewDismissalAllowances;
    }

    public BranchProtectionRuleConflictConnectionGQO getBranchProtectionRuleConflicts() {
        return branchProtectionRuleConflicts;
    }
    public void setBranchProtectionRuleConflicts(BranchProtectionRuleConflictConnectionGQO branchProtectionRuleConflicts) {
        this.branchProtectionRuleConflicts = branchProtectionRuleConflicts;
    }

    public ActorGQO getCreator() {
        return creator;
    }
    public void setCreator(ActorGQO creator) {
        this.creator = creator;
    }

    public Integer getDatabaseId() {
        return databaseId;
    }
    public void setDatabaseId(Integer databaseId) {
        this.databaseId = databaseId;
    }

    public Boolean getDismissesStaleReviews() {
        return dismissesStaleReviews;
    }
    public void setDismissesStaleReviews(Boolean dismissesStaleReviews) {
        this.dismissesStaleReviews = dismissesStaleReviews;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public Boolean getIsAdminEnforced() {
        return isAdminEnforced;
    }
    public void setIsAdminEnforced(Boolean isAdminEnforced) {
        this.isAdminEnforced = isAdminEnforced;
    }

    public RefConnectionGQO getMatchingRefs() {
        return matchingRefs;
    }
    public void setMatchingRefs(RefConnectionGQO matchingRefs) {
        this.matchingRefs = matchingRefs;
    }

    public String getPattern() {
        return pattern;
    }
    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    public PushAllowanceConnectionGQO getPushAllowances() {
        return pushAllowances;
    }
    public void setPushAllowances(PushAllowanceConnectionGQO pushAllowances) {
        this.pushAllowances = pushAllowances;
    }

    public RepositoryGQO getRepository() {
        return repository;
    }
    public void setRepository(RepositoryGQO repository) {
        this.repository = repository;
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

    public ReviewDismissalAllowanceConnectionGQO getReviewDismissalAllowances() {
        return reviewDismissalAllowances;
    }
    public void setReviewDismissalAllowances(ReviewDismissalAllowanceConnectionGQO reviewDismissalAllowances) {
        this.reviewDismissalAllowances = reviewDismissalAllowances;
    }

}