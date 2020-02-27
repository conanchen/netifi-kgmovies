package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class UpdateEnterpriseActionExecutionCapabilitySettingInputGQO {

    @javax.validation.constraints.NotNull
    private ActionExecutionCapabilitySettingGQO capability;
    private String clientMutationId;
    @javax.validation.constraints.NotNull
    private String enterpriseId;

    public UpdateEnterpriseActionExecutionCapabilitySettingInputGQO() {
    }

    public UpdateEnterpriseActionExecutionCapabilitySettingInputGQO(ActionExecutionCapabilitySettingGQO capability, String clientMutationId, String enterpriseId) {
        this.capability = capability;
        this.clientMutationId = clientMutationId;
        this.enterpriseId = enterpriseId;
    }

    public ActionExecutionCapabilitySettingGQO getCapability() {
        return capability;
    }
    public void setCapability(ActionExecutionCapabilitySettingGQO capability) {
        this.capability = capability;
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

}