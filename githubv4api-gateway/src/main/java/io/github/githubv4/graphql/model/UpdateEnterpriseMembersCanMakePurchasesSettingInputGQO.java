package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class UpdateEnterpriseMembersCanMakePurchasesSettingInputGQO {

    private String clientMutationId;
    @javax.validation.constraints.NotNull
    private String enterpriseId;
    @javax.validation.constraints.NotNull
    private EnterpriseMembersCanMakePurchasesSettingValueGQO settingValue;

    public UpdateEnterpriseMembersCanMakePurchasesSettingInputGQO() {
    }

    public UpdateEnterpriseMembersCanMakePurchasesSettingInputGQO(String clientMutationId, String enterpriseId, EnterpriseMembersCanMakePurchasesSettingValueGQO settingValue) {
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

    public EnterpriseMembersCanMakePurchasesSettingValueGQO getSettingValue() {
        return settingValue;
    }
    public void setSettingValue(EnterpriseMembersCanMakePurchasesSettingValueGQO settingValue) {
        this.settingValue = settingValue;
    }

}