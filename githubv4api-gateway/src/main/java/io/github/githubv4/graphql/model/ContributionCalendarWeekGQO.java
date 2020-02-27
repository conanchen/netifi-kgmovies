package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class ContributionCalendarWeekGQO {

    @javax.validation.constraints.NotNull
    private Collection<ContributionCalendarDayGQO> contributionDays;
    @javax.validation.constraints.NotNull
    private String firstDay;

    public ContributionCalendarWeekGQO() {
    }

    public ContributionCalendarWeekGQO(Collection<ContributionCalendarDayGQO> contributionDays, String firstDay) {
        this.contributionDays = contributionDays;
        this.firstDay = firstDay;
    }

    public Collection<ContributionCalendarDayGQO> getContributionDays() {
        return contributionDays;
    }
    public void setContributionDays(Collection<ContributionCalendarDayGQO> contributionDays) {
        this.contributionDays = contributionDays;
    }

    public String getFirstDay() {
        return firstDay;
    }
    public void setFirstDay(String firstDay) {
        this.firstDay = firstDay;
    }

}