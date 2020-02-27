package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class CreateDeploymentStatusPayloadGQO {

    private String clientMutationId;
    private DeploymentStatusGQO deploymentStatus;

    public CreateDeploymentStatusPayloadGQO() {
    }

    public CreateDeploymentStatusPayloadGQO(String clientMutationId, DeploymentStatusGQO deploymentStatus) {
        this.clientMutationId = clientMutationId;
        this.deploymentStatus = deploymentStatus;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public DeploymentStatusGQO getDeploymentStatus() {
        return deploymentStatus;
    }
    public void setDeploymentStatus(DeploymentStatusGQO deploymentStatus) {
        this.deploymentStatus = deploymentStatus;
    }

}