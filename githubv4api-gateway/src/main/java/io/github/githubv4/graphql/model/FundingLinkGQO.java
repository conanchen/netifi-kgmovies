package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class FundingLinkGQO {

    @javax.validation.constraints.NotNull
    private FundingPlatformGQO platform;
    @javax.validation.constraints.NotNull
    private String url;

    public FundingLinkGQO() {
    }

    public FundingLinkGQO(FundingPlatformGQO platform, String url) {
        this.platform = platform;
        this.url = url;
    }

    public FundingPlatformGQO getPlatform() {
        return platform;
    }
    public void setPlatform(FundingPlatformGQO platform) {
        this.platform = platform;
    }

    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }

}