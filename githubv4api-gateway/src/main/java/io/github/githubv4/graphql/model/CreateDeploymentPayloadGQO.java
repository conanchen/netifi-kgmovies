package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class CreateDeploymentPayloadGQO {

    private Boolean autoMerged;
    private String clientMutationId;
    private DeploymentGQO deployment;

    public CreateDeploymentPayloadGQO() {
    }

    public CreateDeploymentPayloadGQO(Boolean autoMerged, String clientMutationId, DeploymentGQO deployment) {
        this.autoMerged = autoMerged;
        this.clientMutationId = clientMutationId;
        this.deployment = deployment;
    }

    public Boolean getAutoMerged() {
        return autoMerged;
    }
    public void setAutoMerged(Boolean autoMerged) {
        this.autoMerged = autoMerged;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public DeploymentGQO getDeployment() {
        return deployment;
    }
    public void setDeployment(DeploymentGQO deployment) {
        this.deployment = deployment;
    }

}