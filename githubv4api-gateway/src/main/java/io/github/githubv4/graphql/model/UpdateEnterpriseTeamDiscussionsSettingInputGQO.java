package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class UpdateEnterpriseTeamDiscussionsSettingInputGQO {

    private String clientMutationId;
    @javax.validation.constraints.NotNull
    private String enterpriseId;
    @javax.validation.constraints.NotNull
    private EnterpriseEnabledDisabledSettingValueGQO settingValue;

    public UpdateEnterpriseTeamDiscussionsSettingInputGQO() {
    }

    public UpdateEnterpriseTeamDiscussionsSettingInputGQO(String clientMutationId, String enterpriseId, EnterpriseEnabledDisabledSettingValueGQO settingValue) {
        this.clientMutationId = clientMutationId;
        this.enterpriseId = enterpriseId;
        this.settingValue = settingValue;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public String getEnterpriseId() {
        return enterpriseId;
    }
    public void setEnterpriseId(String enterpriseId) {
        this.enterpriseId = enterpriseId;
    }

    public EnterpriseEnabledDisabledSettingValueGQO getSettingValue() {
        return settingValue;
    }
    public void setSettingValue(EnterpriseEnabledDisabledSettingValueGQO settingValue) {
        this.settingValue = settingValue;
    }

}