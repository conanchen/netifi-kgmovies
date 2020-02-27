package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class CreatePullRequestInputGQO {

    @javax.validation.constraints.NotNull
    private String baseRefName;
    private String body;
    private String clientMutationId;
    private Boolean draft;
    @javax.validation.constraints.NotNull
    private String headRefName;
    private Boolean maintainerCanModify;
    @javax.validation.constraints.NotNull
    private String repositoryId;
    @javax.validation.constraints.NotNull
    private String title;

    public CreatePullRequestInputGQO() {
    }

    public CreatePullRequestInputGQO(String baseRefName, String body, String clientMutationId, Boolean draft, String headRefName, Boolean maintainerCanModify, String repositoryId, String title) {
        this.baseRefName = baseRefName;
        this.body = body;
        this.clientMutationId = clientMutationId;
        this.draft = draft;
        this.headRefName = headRefName;
        this.maintainerCanModify = maintainerCanModify;
        this.repositoryId = repositoryId;
        this.title = title;
    }

    public String getBaseRefName() {
        return baseRefName;
    }
    public void setBaseRefName(String baseRefName) {
        this.baseRefName = baseRefName;
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

    public Boolean getDraft() {
        return draft;
    }
    public void setDraft(Boolean draft) {
        this.draft = draft;
    }

    public String getHeadRefName() {
        return headRefName;
    }
    public void setHeadRefName(String headRefName) {
        this.headRefName = headRefName;
    }

    public Boolean getMaintainerCanModify() {
        return maintainerCanModify;
    }
    public void setMaintainerCanModify(Boolean maintainerCanModify) {
        this.maintainerCanModify = maintainerCanModify;
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