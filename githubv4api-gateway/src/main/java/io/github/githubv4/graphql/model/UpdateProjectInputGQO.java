package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class UpdateProjectInputGQO {

    private String body;
    private String clientMutationId;
    private String name;
    @javax.validation.constraints.NotNull
    private String projectId;
    private Boolean Public;
    private ProjectStateGQO state;

    public UpdateProjectInputGQO() {
    }

    public UpdateProjectInputGQO(String body, String clientMutationId, String name, String projectId, Boolean Public, ProjectStateGQO state) {
        this.body = body;
        this.clientMutationId = clientMutationId;
        this.name = name;
        this.projectId = projectId;
        this.Public = Public;
        this.state = state;
    }

    public String getBody() {
        return body;
    }
    public void setBody(String body) {
        this.body = body;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getProjectId() {
        return projectId;
    }
    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public Boolean getPublic() {
        return Public;
    }
    public void setPublic(Boolean Public) {
        this.Public = Public;
    }

    public ProjectStateGQO getState() {
        return state;
    }
    public void setState(ProjectStateGQO state) {
        this.state = state;
    }

}