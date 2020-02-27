package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class PackageVersionStatisticsGQO {

    @javax.validation.constraints.NotNull
    private Integer downloadsTotalCount;

    public PackageVersionStatisticsGQO() {
    }

    public PackageVersionStatisticsGQO(Integer downloadsTotalCount) {
        this.downloadsTotalCount = downloadsTotalCount;
    }

    public Integer getDownloadsTotalCount() {
        return downloadsTotalCount;
    }
    public void setDownloadsTotalCount(Integer downloadsTotalCount) {
        this.downloadsTotalCount = downloadsTotalCount;
    }

}