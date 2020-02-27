package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class UpdateProjectCardPayloadGQO {

    private String clientMutationId;
    private ProjectCardGQO projectCard;

    public UpdateProjectCardPayloadGQO() {
    }

    public UpdateProjectCardPayloadGQO(String clientMutationId, ProjectCardGQO projectCard) {
        this.clientMutationId = clientMutationId;
        this.projectCard = projectCard;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public ProjectCardGQO getProjectCard() {
        return projectCard;
    }
    public void setProjectCard(ProjectCardGQO projectCard) {
        this.projectCard = projectCard;
    }

}