package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class ContributionsCollectionGQO {

    @javax.validation.constraints.NotNull
    private Collection<CommitContributionsByRepositoryGQO> commitContributionsByRepository;
    @javax.validation.constraints.NotNull
    private ContributionCalendarGQO contributionCalendar;
    @javax.validation.constraints.NotNull
    private Collection<Integer> contributionYears;
    @javax.validation.constraints.NotNull
    private Boolean doesEndInCurrentMonth;
    private String earliestRestrictedContributionDate;
    @javax.validation.constraints.NotNull
    private java.util.Date endedAt;
    private CreatedIssueOrRestrictedContributionGQO firstIssueContribution;
    private CreatedPullRequestOrRestrictedContributionGQO firstPullRequestContribution;
    private CreatedRepositoryOrRestrictedContributionGQO firstRepositoryContribution;
    @javax.validation.constraints.NotNull
    private Boolean hasActivityInThePast;
    @javax.validation.constraints.NotNull
    private Boolean hasAnyContributions;
    @javax.validation.constraints.NotNull
    private Boolean hasAnyRestrictedContributions;
    @javax.validation.constraints.NotNull
    private Boolean isSingleDay;
    @javax.validation.constraints.NotNull
    private CreatedIssueContributionConnectionGQO issueContributions;
    @javax.validation.constraints.NotNull
    private Collection<IssueContributionsByRepositoryGQO> issueContributionsByRepository;
    private JoinedGitHubContributionGQO joinedGitHubContribution;
    private String latestRestrictedContributionDate;
    private ContributionsCollectionGQO mostRecentCollectionWithActivity;
    private ContributionsCollectionGQO mostRecentCollectionWithoutActivity;
    private CreatedIssueContributionGQO popularIssueContribution;
    private CreatedPullRequestContributionGQO popularPullRequestContribution;
    @javax.validation.constraints.NotNull
    private CreatedPullRequestContributionConnectionGQO pullRequestContributions;
    @javax.validation.constraints.NotNull
    private Collection<PullRequestContributionsByRepositoryGQO> pullRequestContributionsByRepository;
    @javax.validation.constraints.NotNull
    private CreatedPullRequestReviewContributionConnectionGQO pullRequestReviewContributions;
    @javax.validation.constraints.NotNull
    private Collection<PullRequestReviewContributionsByRepositoryGQO> pullRequestReviewContributionsByRepository;
    @javax.validation.constraints.NotNull
    private CreatedRepositoryContributionConnectionGQO repositoryContributions;
    @javax.validation.constraints.NotNull
    private Integer restrictedContributionsCount;
    @javax.validation.constraints.NotNull
    private java.util.Date startedAt;
    @javax.validation.constraints.NotNull
    private Integer totalCommitContributions;
    @javax.validation.constraints.NotNull
    private Integer totalIssueContributions;
    @javax.validation.constraints.NotNull
    private Integer totalPullRequestContributions;
    @javax.validation.constraints.NotNull
    private Integer totalPullRequestReviewContributions;
    @javax.validation.constraints.NotNull
    private Integer totalRepositoriesWithContributedCommits;
    @javax.validation.constraints.NotNull
    private Integer totalRepositoriesWithContributedIssues;
    @javax.validation.constraints.NotNull
    private Integer totalRepositoriesWithContributedPullRequestReviews;
    @javax.validation.constraints.NotNull
    private Integer totalRepositoriesWithContributedPullRequests;
    @javax.validation.constraints.NotNull
    private Integer totalRepositoryContributions;
    @javax.validation.constraints.NotNull
    private UserGQO user;

    public ContributionsCollectionGQO() {
    }

    public ContributionsCollectionGQO(Collection<CommitContributionsByRepositoryGQO> commitContributionsByRepository, ContributionCalendarGQO contributionCalendar, Collection<Integer> contributionYears, Boolean doesEndInCurrentMonth, String earliestRestrictedContributionDate, java.util.Date endedAt, CreatedIssueOrRestrictedContributionGQO firstIssueContribution, CreatedPullRequestOrRestrictedContributionGQO firstPullRequestContribution, CreatedRepositoryOrRestrictedContributionGQO firstRepositoryContribution, Boolean hasActivityInThePast, Boolean hasAnyContributions, Boolean hasAnyRestrictedContributions, Boolean isSingleDay, CreatedIssueContributionConnectionGQO issueContributions, Collection<IssueContributionsByRepositoryGQO> issueContributionsByRepository, JoinedGitHubContributionGQO joinedGitHubContribution, String latestRestrictedContributionDate, ContributionsCollectionGQO mostRecentCollectionWithActivity, ContributionsCollectionGQO mostRecentCollectionWithoutActivity, CreatedIssueContributionGQO popularIssueContribution, CreatedPullRequestContributionGQO popularPullRequestContribution, CreatedPullRequestContributionConnectionGQO pullRequestContributions, Collection<PullRequestContributionsByRepositoryGQO> pullRequestContributionsByRepository, CreatedPullRequestReviewContributionConnectionGQO pullRequestReviewContributions, Collection<PullRequestReviewContributionsByRepositoryGQO> pullRequestReviewContributionsByRepository, CreatedRepositoryContributionConnectionGQO repositoryContributions, Integer restrictedContributionsCount, java.util.Date startedAt, Integer totalCommitContributions, Integer totalIssueContributions, Integer totalPullRequestContributions, Integer totalPullRequestReviewContributions, Integer totalRepositoriesWithContributedCommits, Integer totalRepositoriesWithContributedIssues, Integer totalRepositoriesWithContributedPullRequestReviews, Integer totalRepositoriesWithContributedPullRequests, Integer totalRepositoryContributions, UserGQO user) {
        this.commitContributionsByRepository = commitContributionsByRepository;
        this.contributionCalendar = contributionCalendar;
        this.contributionYears = contributionYears;
        this.doesEndInCurrentMonth = doesEndInCurrentMonth;
        this.earliestRestrictedContributionDate = earliestRestrictedContributionDate;
        this.endedAt = endedAt;
        this.firstIssueContribution = firstIssueContribution;
        this.firstPullRequestContribution = firstPullRequestContribution;
        this.firstRepositoryContribution = firstRepositoryContribution;
        this.hasActivityInThePast = hasActivityInThePast;
        this.hasAnyContributions = hasAnyContributions;
        this.hasAnyRestrictedContributions = hasAnyRestrictedContributions;
        this.isSingleDay = isSingleDay;
        this.issueContributions = issueContributions;
        this.issueContributionsByRepository = issueContributionsByRepository;
        this.joinedGitHubContribution = joinedGitHubContribution;
        this.latestRestrictedContributionDate = latestRestrictedContributionDate;
        this.mostRecentCollectionWithActivity = mostRecentCollectionWithActivity;
        this.mostRecentCollectionWithoutActivity = mostRecentCollectionWithoutActivity;
        this.popularIssueContribution = popularIssueContribution;
        this.popularPullRequestContribution = popularPullRequestContribution;
        this.pullRequestContributions = pullRequestContributions;
        this.pullRequestContributionsByRepository = pullRequestContributionsByRepository;
        this.pullRequestReviewContributions = pullRequestReviewContributions;
        this.pullRequestReviewContributionsByRepository = pullRequestReviewContributionsByRepository;
        this.repositoryContributions = repositoryContributions;
        this.restrictedContributionsCount = restrictedContributionsCount;
        this.startedAt = startedAt;
        this.totalCommitContributions = totalCommitContributions;
        this.totalIssueContributions = totalIssueContributions;
        this.totalPullRequestContributions = totalPullRequestContributions;
        this.totalPullRequestReviewContributions = totalPullRequestReviewContributions;
        this.totalRepositoriesWithContributedCommits = totalRepositoriesWithContributedCommits;
        this.totalRepositoriesWithContributedIssues = totalRepositoriesWithContributedIssues;
        this.totalRepositoriesWithContributedPullRequestReviews = totalRepositoriesWithContributedPullRequestReviews;
        this.totalRepositoriesWithContributedPullRequests = totalRepositoriesWithContributedPullRequests;
        this.totalRepositoryContributions = totalRepositoryContributions;
        this.user = user;
    }

    public Collection<CommitContributionsByRepositoryGQO> getCommitContributionsByRepository() {
        return commitContributionsByRepository;
    }
    public void setCommitContributionsByRepository(Collection<CommitContributionsByRepositoryGQO> commitContributionsByRepository) {
        this.commitContributionsByRepository = commitContributionsByRepository;
    }

    public ContributionCalendarGQO getContributionCalendar() {
        return contributionCalendar;
    }
    public void setContributionCalendar(ContributionCalendarGQO contributionCalendar) {
        this.contributionCalendar = contributionCalendar;
    }

    public Collection<Integer> getContributionYears() {
        return contributionYears;
    }
    public void setContributionYears(Collection<Integer> contributionYears) {
        this.contributionYears = contributionYears;
    }

    public Boolean getDoesEndInCurrentMonth() {
        return doesEndInCurrentMonth;
    }
    public void setDoesEndInCurrentMonth(Boolean doesEndInCurrentMonth) {
        this.doesEndInCurrentMonth = doesEndInCurrentMonth;
    }

    public String getEarliestRestrictedContributionDate() {
        return earliestRestrictedContributionDate;
    }
    public void setEarliestRestrictedContributionDate(String earliestRestrictedContributionDate) {
        this.earliestRestrictedContributionDate = earliestRestrictedContributionDate;
    }

    public java.util.Date getEndedAt() {
        return endedAt;
    }
    public void setEndedAt(java.util.Date endedAt) {
        this.endedAt = endedAt;
    }

    public CreatedIssueOrRestrictedContributionGQO getFirstIssueContribution() {
        return firstIssueContribution;
    }
    public void setFirstIssueContribution(CreatedIssueOrRestrictedContributionGQO firstIssueContribution) {
        this.firstIssueContribution = firstIssueContribution;
    }

    public CreatedPullRequestOrRestrictedContributionGQO getFirstPullRequestContribution() {
        return firstPullRequestContribution;
    }
    public void setFirstPullRequestContribution(CreatedPullRequestOrRestrictedContributionGQO firstPullRequestContribution) {
        this.firstPullRequestContribution = firstPullRequestContribution;
    }

    public CreatedRepositoryOrRestrictedContributionGQO getFirstRepositoryContribution() {
        return firstRepositoryContribution;
    }
    public void setFirstRepositoryContribution(CreatedRepositoryOrRestrictedContributionGQO firstRepositoryContribution) {
        this.firstRepositoryContribution = firstRepositoryContribution;
    }

    public Boolean getHasActivityInThePast() {
        return hasActivityInThePast;
    }
    public void setHasActivityInThePast(Boolean hasActivityInThePast) {
        this.hasActivityInThePast = hasActivityInThePast;
    }

    public Boolean getHasAnyContributions() {
        return hasAnyContributions;
    }
    public void setHasAnyContributions(Boolean hasAnyContributions) {
        this.hasAnyContributions = hasAnyContributions;
    }

    public Boolean getHasAnyRestrictedContributions() {
        return hasAnyRestrictedContributions;
    }
    public void setHasAnyRestrictedContributions(Boolean hasAnyRestrictedContributions) {
        this.hasAnyRestrictedContributions = hasAnyRestrictedContributions;
    }

    public Boolean getIsSingleDay() {
        return isSingleDay;
    }
    public void setIsSingleDay(Boolean isSingleDay) {
        this.isSingleDay = isSingleDay;
    }

    public CreatedIssueContributionConnectionGQO getIssueContributions() {
        return issueContributions;
    }
    public void setIssueContributions(CreatedIssueContributionConnectionGQO issueContributions) {
        this.issueContributions = issueContributions;
    }

    public Collection<IssueContributionsByRepositoryGQO> getIssueContributionsByRepository() {
        return issueContributionsByRepository;
    }
    public void setIssueContributionsByRepository(Collection<IssueContributionsByRepositoryGQO> issueContributionsByRepository) {
        this.issueContributionsByRepository = issueContributionsByRepository;
    }

    public JoinedGitHubContributionGQO getJoinedGitHubContribution() {
        return joinedGitHubContribution;
    }
    public void setJoinedGitHubContribution(JoinedGitHubContributionGQO joinedGitHubContribution) {
        this.joinedGitHubContribution = joinedGitHubContribution;
    }

    public String getLatestRestrictedContributionDate() {
        return latestRestrictedContributionDate;
    }
    public void setLatestRestrictedContributionDate(String latestRestrictedContributionDate) {
        this.latestRestrictedContributionDate = latestRestrictedContributionDate;
    }

    public ContributionsCollectionGQO getMostRecentCollectionWithActivity() {
        return mostRecentCollectionWithActivity;
    }
    public void setMostRecentCollectionWithActivity(ContributionsCollectionGQO mostRecentCollectionWithActivity) {
        this.mostRecentCollectionWithActivity = mostRecentCollectionWithActivity;
    }

    public ContributionsCollectionGQO getMostRecentCollectionWithoutActivity() {
        return mostRecentCollectionWithoutActivity;
    }
    public void setMostRecentCollectionWithoutActivity(ContributionsCollectionGQO mostRecentCollectionWithoutActivity) {
        this.mostRecentCollectionWithoutActivity = mostRecentCollectionWithoutActivity;
    }

    public CreatedIssueContributionGQO getPopularIssueContribution() {
        return popularIssueContribution;
    }
    public void setPopularIssueContribution(CreatedIssueContributionGQO popularIssueContribution) {
        this.popularIssueContribution = popularIssueContribution;
    }

    public CreatedPullRequestContributionGQO getPopularPullRequestContribution() {
        return popularPullRequestContribution;
    }
    public void setPopularPullRequestContribution(CreatedPullRequestContributionGQO popularPullRequestContribution) {
        this.popularPullRequestContribution = popularPullRequestContribution;
    }

    public CreatedPullRequestContributionConnectionGQO getPullRequestContributions() {
        return pullRequestContributions;
    }
    public void setPullRequestContributions(CreatedPullRequestContributionConnectionGQO pullRequestContributions) {
        this.pullRequestContributions = pullRequestContributions;
    }

    public Collection<PullRequestContributionsByRepositoryGQO> getPullRequestContributionsByRepository() {
        return pullRequestContributionsByRepository;
    }
    public void setPullRequestContributionsByRepository(Collection<PullRequestContributionsByRepositoryGQO> pullRequestContributionsByRepository) {
        this.pullRequestContributionsByRepository = pullRequestContributionsByRepository;
    }

    public CreatedPullRequestReviewContributionConnectionGQO getPullRequestReviewContributions() {
        return pullRequestReviewContributions;
    }
    public void setPullRequestReviewContributions(CreatedPullRequestReviewContributionConnectionGQO pullRequestReviewContributions) {
        this.pullRequestReviewContributions = pullRequestReviewContributions;
    }

    public Collection<PullRequestReviewContributionsByRepositoryGQO> getPullRequestReviewContributionsByRepository() {
        return pullRequestReviewContributionsByRepository;
    }
    public void setPullRequestReviewContributionsByRepository(Collection<PullRequestReviewContributionsByRepositoryGQO> pullRequestReviewContributionsByRepository) {
        this.pullRequestReviewContributionsByRepository = pullRequestReviewContributionsByRepository;
    }

    public CreatedRepositoryContributionConnectionGQO getRepositoryContributions() {
        return repositoryContributions;
    }
    public void setRepositoryContributions(CreatedRepositoryContributionConnectionGQO repositoryContributions) {
        this.repositoryContributions = repositoryContributions;
    }

    public Integer getRestrictedContributionsCount() {
        return restrictedContributionsCount;
    }
    public void setRestrictedContributionsCount(Integer restrictedContributionsCount) {
        this.restrictedContributionsCount = restrictedContributionsCount;
    }

    public java.util.Date getStartedAt() {
        return startedAt;
    }
    public void setStartedAt(java.util.Date startedAt) {
        this.startedAt = startedAt;
    }

    public Integer getTotalCommitContributions() {
        return totalCommitContributions;
    }
    public void setTotalCommitContributions(Integer totalCommitContributions) {
        this.totalCommitContributions = totalCommitContributions;
    }

    public Integer getTotalIssueContributions() {
        return totalIssueContributions;
    }
    public void setTotalIssueContributions(Integer totalIssueContributions) {
        this.totalIssueContributions = totalIssueContributions;
    }

    public Integer getTotalPullRequestContributions() {
        return totalPullRequestContributions;
    }
    public void setTotalPullRequestContributions(Integer totalPullRequestContributions) {
        this.totalPullRequestContributions = totalPullRequestContributions;
    }

    public Integer getTotalPullRequestReviewContributions() {
        return totalPullRequestReviewContributions;
    }
    public void setTotalPullRequestReviewContributions(Integer totalPullRequestReviewContributions) {
        this.totalPullRequestReviewContributions = totalPullRequestReviewContributions;
    }

    public Integer getTotalRepositoriesWithContributedCommits() {
        return totalRepositoriesWithContributedCommits;
    }
    public void setTotalRepositoriesWithContributedCommits(Integer totalRepositoriesWithContributedCommits) {
        this.totalRepositoriesWithContributedCommits = totalRepositoriesWithContributedCommits;
    }

    public Integer getTotalRepositoriesWithContributedIssues() {
        return totalRepositoriesWithContributedIssues;
    }
    public void setTotalRepositoriesWithContributedIssues(Integer totalRepositoriesWithContributedIssues) {
        this.totalRepositoriesWithContributedIssues = totalRepositoriesWithContributedIssues;
    }

    public Integer getTotalRepositoriesWithContributedPullRequestReviews() {
        return totalRepositoriesWithContributedPullRequestReviews;
    }
    public void setTotalRepositoriesWithContributedPullRequestReviews(Integer totalRepositoriesWithContributedPullRequestReviews) {
        this.totalRepositoriesWithContributedPullRequestReviews = totalRepositoriesWithContributedPullRequestReviews;
    }

    public Integer getTotalRepositoriesWithContributedPullRequests() {
        return totalRepositoriesWithContributedPullRequests;
    }
    public void setTotalRepositoriesWithContributedPullRequests(Integer totalRepositoriesWithContributedPullRequests) {
        this.totalRepositoriesWithContributedPullRequests = totalRepositoriesWithContributedPullRequests;
    }

    public Integer getTotalRepositoryContributions() {
        return totalRepositoryContributions;
    }
    public void setTotalRepositoryContributions(Integer totalRepositoryContributions) {
        this.totalRepositoryContributions = totalRepositoryContributions;
    }

    public UserGQO getUser() {
        return user;
    }
    public void setUser(UserGQO user) {
        this.user = user;
    }

}