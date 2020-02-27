package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class CheckSuiteAutoTriggerPreferenceGQO {

    @javax.validation.constraints.NotNull
    private String appId;
    @javax.validation.constraints.NotNull
    private Boolean setting;

    public CheckSuiteAutoTriggerPreferenceGQO() {
    }

    public CheckSuiteAutoTriggerPreferenceGQO(String appId, Boolean setting) {
        this.appId = appId;
        this.setting = setting;
    }

    public String getAppId() {
        return appId;
    }
    public void setAppId(String appId) {
        this.appId = appId;
    }

    public Boolean getSetting() {
        return setting;
    }
    public void setSetting(Boolean setting) {
        this.setting = setting;
    }

}