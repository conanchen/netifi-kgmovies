package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class CloneProjectPayloadGQO {

    private String clientMutationId;
    private String jobStatusId;
    private ProjectGQO project;

    public CloneProjectPayloadGQO() {
    }

    public CloneProjectPayloadGQO(String clientMutationId, String jobStatusId, ProjectGQO project) {
        this.clientMutationId = clientMutationId;
        this.jobStatusId = jobStatusId;
        this.project = project;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public String getJobStatusId() {
        return jobStatusId;
    }
    public void setJobStatusId(String jobStatusId) {
        this.jobStatusId = jobStatusId;
    }

    public ProjectGQO getProject() {
        return project;
    }
    public void setProject(ProjectGQO project) {
        this.project = project;
    }

}