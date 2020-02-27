package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class CheckSuiteFilterGQO {

    private Integer appId;
    private String checkName;

    public CheckSuiteFilterGQO() {
    }

    public CheckSuiteFilterGQO(Integer appId, String checkName) {
        this.appId = appId;
        this.checkName = checkName;
    }

    public Integer getAppId() {
        return appId;
    }
    public void setAppId(Integer appId) {
        this.appId = appId;
    }

    public String getCheckName() {
        return checkName;
    }
    public void setCheckName(String checkName) {
        this.checkName = checkName;
    }

}