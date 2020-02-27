package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class RegistryPackageVersionStatisticsGQO {

    @javax.validation.constraints.NotNull
    private Integer downloadsThisMonth;
    @javax.validation.constraints.NotNull
    private Integer downloadsThisWeek;
    @javax.validation.constraints.NotNull
    private Integer downloadsThisYear;
    @javax.validation.constraints.NotNull
    private Integer downloadsToday;
    @javax.validation.constraints.NotNull
    private Integer downloadsTotalCount;

    public RegistryPackageVersionStatisticsGQO() {
    }

    public RegistryPackageVersionStatisticsGQO(Integer downloadsThisMonth, Integer downloadsThisWeek, Integer downloadsThisYear, Integer downloadsToday, Integer downloadsTotalCount) {
        this.downloadsThisMonth = downloadsThisMonth;
        this.downloadsThisWeek = downloadsThisWeek;
        this.downloadsThisYear = downloadsThisYear;
        this.downloadsToday = downloadsToday;
        this.downloadsTotalCount = downloadsTotalCount;
    }

    public Integer getDownloadsThisMonth() {
        return downloadsThisMonth;
    }
    public void setDownloadsThisMonth(Integer downloadsThisMonth) {
        this.downloadsThisMonth = downloadsThisMonth;
    }

    public Integer getDownloadsThisWeek() {
        return downloadsThisWeek;
    }
    public void setDownloadsThisWeek(Integer downloadsThisWeek) {
        this.downloadsThisWeek = downloadsThisWeek;
    }

    public Integer getDownloadsThisYear() {
        return downloadsThisYear;
    }
    public void setDownloadsThisYear(Integer downloadsThisYear) {
        this.downloadsThisYear = downloadsThisYear;
    }

    public Integer getDownloadsToday() {
        return downloadsToday;
    }
    public void setDownloadsToday(Integer downloadsToday) {
        this.downloadsToday = downloadsToday;
    }

    public Integer getDownloadsTotalCount() {
        return downloadsTotalCount;
    }
    public void setDownloadsTotalCount(Integer downloadsTotalCount) {
        this.downloadsTotalCount = downloadsTotalCount;
    }

}