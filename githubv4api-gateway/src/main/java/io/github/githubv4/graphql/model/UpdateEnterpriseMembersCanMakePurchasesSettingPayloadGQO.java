package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class UpdateEnterpriseMembersCanMakePurchasesSettingPayloadGQO {

    private String clientMutationId;
    private EnterpriseGQO enterprise;
    private String message;

    public UpdateEnterpriseMembersCanMakePurchasesSettingPayloadGQO() {
    }

    public UpdateEnterpriseMembersCanMakePurchasesSettingPayloadGQO(String clientMutationId, EnterpriseGQO enterprise, String message) {
        this.clientMutationId = clientMutationId;
        this.enterprise = enterprise;
        this.message = message;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public EnterpriseGQO getEnterprise() {
        return enterprise;
    }
    public void setEnterprise(EnterpriseGQO enterprise) {
        this.enterprise = enterprise;
    }

    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }

}