package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class CreateProjectInputGQO {

    private String body;
    private String clientMutationId;
    @javax.validation.constraints.NotNull
    private String name;
    @javax.validation.constraints.NotNull
    private String ownerId;
    @javax.validation.constraints.NotNull
    private Collection<String> repositoryIds;
    private ProjectTemplateGQO template;

    public CreateProjectInputGQO() {
    }

    public CreateProjectInputGQO(String body, String clientMutationId, String name, String ownerId, Collection<String> repositoryIds, ProjectTemplateGQO template) {
        this.body = body;
        this.clientMutationId = clientMutationId;
        this.name = name;
        this.ownerId = ownerId;
        this.repositoryIds = repositoryIds;
        this.template = template;
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

    public String getOwnerId() {
        return ownerId;
    }
    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    public Collection<String> getRepositoryIds() {
        return repositoryIds;
    }
    public void setRepositoryIds(Collection<String> repositoryIds) {
        this.repositoryIds = repositoryIds;
    }

    public ProjectTemplateGQO getTemplate() {
        return template;
    }
    public void setTemplate(ProjectTemplateGQO template) {
        this.template = template;
    }

}