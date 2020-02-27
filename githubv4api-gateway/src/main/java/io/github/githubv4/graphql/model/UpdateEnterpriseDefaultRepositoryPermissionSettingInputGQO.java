package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class UpdateEnterpriseDefaultRepositoryPermissionSettingInputGQO {

    private String clientMutationId;
    @javax.validation.constraints.NotNull
    private String enterpriseId;
    @javax.validation.constraints.NotNull
    private EnterpriseDefaultRepositoryPermissionSettingValueGQO settingValue;

    public UpdateEnterpriseDefaultRepositoryPermissionSettingInputGQO() {
    }

    public UpdateEnterpriseDefaultRepositoryPermissionSettingInputGQO(String clientMutationId, String enterpriseId, EnterpriseDefaultRepositoryPermissionSettingValueGQO settingValue) {
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

    public EnterpriseDefaultRepositoryPermissionSettingValueGQO getSettingValue() {
        return settingValue;
    }
    public void setSettingValue(EnterpriseDefaultRepositoryPermissionSettingValueGQO settingValue) {
        this.settingValue = settingValue;
    }

}