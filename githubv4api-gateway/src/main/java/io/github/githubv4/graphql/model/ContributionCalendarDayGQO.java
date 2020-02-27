package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class ContributionCalendarDayGQO {

    @javax.validation.constraints.NotNull
    private String color;
    @javax.validation.constraints.NotNull
    private Integer contributionCount;
    @javax.validation.constraints.NotNull
    private String date;
    @javax.validation.constraints.NotNull
    private Integer weekday;

    public ContributionCalendarDayGQO() {
    }

    public ContributionCalendarDayGQO(String color, Integer contributionCount, String date, Integer weekday) {
        this.color = color;
        this.contributionCount = contributionCount;
        this.date = date;
        this.weekday = weekday;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public Integer getContributionCount() {
        return contributionCount;
    }
    public void setContributionCount(Integer contributionCount) {
        this.contributionCount = contributionCount;
    }

    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }

    public Integer getWeekday() {
        return weekday;
    }
    public void setWeekday(Integer weekday) {
        this.weekday = weekday;
    }

}