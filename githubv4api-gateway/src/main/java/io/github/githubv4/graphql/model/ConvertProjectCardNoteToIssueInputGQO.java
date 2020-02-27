package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class ConvertProjectCardNoteToIssueInputGQO {

    private String body;
    private String clientMutationId;
    @javax.validation.constraints.NotNull
    private String projectCardId;
    @javax.validation.constraints.NotNull
    private String repositoryId;
    private String title;

    public ConvertProjectCardNoteToIssueInputGQO() {
    }

    public ConvertProjectCardNoteToIssueInputGQO(String body, String clientMutationId, String projectCardId, String repositoryId, String title) {
        this.body = body;
        this.clientMutationId = clientMutationId;
        this.projectCardId = projectCardId;
        this.repositoryId = repositoryId;
        this.title = title;
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

    public String getProjectCardId() {
        return projectCardId;
    }
    public void setProjectCardId(String projectCardId) {
        this.projectCardId = projectCardId;
    }

    public String getRepositoryId() {
        return repositoryId;
    }
    public void setRepositoryId(String repositoryId) {
        this.repositoryId = repositoryId;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

}