package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class ContributionCalendarGQO {

    @javax.validation.constraints.NotNull
    private Collection<String> colors;
    @javax.validation.constraints.NotNull
    private Boolean isHalloween;
    @javax.validation.constraints.NotNull
    private Collection<ContributionCalendarMonthGQO> months;
    @javax.validation.constraints.NotNull
    private Integer totalContributions;
    @javax.validation.constraints.NotNull
    private Collection<ContributionCalendarWeekGQO> weeks;

    public ContributionCalendarGQO() {
    }

    public ContributionCalendarGQO(Collection<String> colors, Boolean isHalloween, Collection<ContributionCalendarMonthGQO> months, Integer totalContributions, Collection<ContributionCalendarWeekGQO> weeks) {
        this.colors = colors;
        this.isHalloween = isHalloween;
        this.months = months;
        this.totalContributions = totalContributions;
        this.weeks = weeks;
    }

    public Collection<String> getColors() {
        return colors;
    }
    public void setColors(Collection<String> colors) {
        this.colors = colors;
    }

    public Boolean getIsHalloween() {
        return isHalloween;
    }
    public void setIsHalloween(Boolean isHalloween) {
        this.isHalloween = isHalloween;
    }

    public Collection<ContributionCalendarMonthGQO> getMonths() {
        return months;
    }
    public void setMonths(Collection<ContributionCalendarMonthGQO> months) {
        this.months = months;
    }

    public Integer getTotalContributions() {
        return totalContributions;
    }
    public void setTotalContributions(Integer totalContributions) {
        this.totalContributions = totalContributions;
    }

    public Collection<ContributionCalendarWeekGQO> getWeeks() {
        return weeks;
    }
    public void setWeeks(Collection<ContributionCalendarWeekGQO> weeks) {
        this.weeks = weeks;
    }

}