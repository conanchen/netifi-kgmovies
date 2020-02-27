package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class ContributionCalendarMonthGQO {

    @javax.validation.constraints.NotNull
    private String firstDay;
    @javax.validation.constraints.NotNull
    private String name;
    @javax.validation.constraints.NotNull
    private Integer totalWeeks;
    @javax.validation.constraints.NotNull
    private Integer year;

    public ContributionCalendarMonthGQO() {
    }

    public ContributionCalendarMonthGQO(String firstDay, String name, Integer totalWeeks, Integer year) {
        this.firstDay = firstDay;
        this.name = name;
        this.totalWeeks = totalWeeks;
        this.year = year;
    }

    public String getFirstDay() {
        return firstDay;
    }
    public void setFirstDay(String firstDay) {
        this.firstDay = firstDay;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Integer getTotalWeeks() {
        return totalWeeks;
    }
    public void setTotalWeeks(Integer totalWeeks) {
        this.totalWeeks = totalWeeks;
    }

    public Integer getYear() {
        return year;
    }
    public void setYear(Integer year) {
        this.year = year;
    }

}