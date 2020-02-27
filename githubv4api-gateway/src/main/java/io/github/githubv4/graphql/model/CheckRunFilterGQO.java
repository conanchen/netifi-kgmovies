package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class CheckRunFilterGQO {

    private Integer appId;
    private String checkName;
    private CheckRunTypeGQO checkType;
    private CheckStatusStateGQO status;

    public CheckRunFilterGQO() {
    }

    public CheckRunFilterGQO(Integer appId, String checkName, CheckRunTypeGQO checkType, CheckStatusStateGQO status) {
        this.appId = appId;
        this.checkName = checkName;
        this.checkType = checkType;
        this.status = status;
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

    public CheckRunTypeGQO getCheckType() {
        return checkType;
    }
    public void setCheckType(CheckRunTypeGQO checkType) {
        this.checkType = checkType;
    }

    public CheckStatusStateGQO getStatus() {
        return status;
    }
    public void setStatus(CheckStatusStateGQO status) {
        this.status = status;
    }

}