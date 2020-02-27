package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class UpdateEnterpriseTwoFactorAuthenticationRequiredSettingInputGQO {

    private String clientMutationId;
    @javax.validation.constraints.NotNull
    private String enterpriseId;
    @javax.validation.constraints.NotNull
    private EnterpriseEnabledSettingValueGQO settingValue;

    public UpdateEnterpriseTwoFactorAuthenticationRequiredSettingInputGQO() {
    }

    public UpdateEnterpriseTwoFactorAuthenticationRequiredSettingInputGQO(String clientMutationId, String enterpriseId, EnterpriseEnabledSettingValueGQO settingValue) {
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

    public EnterpriseEnabledSettingValueGQO getSettingValue() {
        return settingValue;
    }
    public void setSettingValue(EnterpriseEnabledSettingValueGQO settingValue) {
        this.settingValue = settingValue;
    }

}