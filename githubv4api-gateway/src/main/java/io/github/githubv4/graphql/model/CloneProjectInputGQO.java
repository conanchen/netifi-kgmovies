package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class CloneProjectInputGQO {

    private String body;
    private String clientMutationId;
    @javax.validation.constraints.NotNull
    private Boolean includeWorkflows;
    @javax.validation.constraints.NotNull
    private String name;
    private Boolean Public;
    @javax.validation.constraints.NotNull
    private String sourceId;
    @javax.validation.constraints.NotNull
    private String targetOwnerId;

    public CloneProjectInputGQO() {
    }

    public CloneProjectInputGQO(String body, String clientMutationId, Boolean includeWorkflows, String name, Boolean Public, String sourceId, String targetOwnerId) {
        this.body = body;
        this.clientMutationId = clientMutationId;
        this.includeWorkflows = includeWorkflows;
        this.name = name;
        this.Public = Public;
        this.sourceId = sourceId;
        this.targetOwnerId = targetOwnerId;
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

    public Boolean getIncludeWorkflows() {
        return includeWorkflows;
    }
    public void setIncludeWorkflows(Boolean includeWorkflows) {
        this.includeWorkflows = includeWorkflows;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Boolean getPublic() {
        return Public;
    }
    public void setPublic(Boolean Public) {
        this.Public = Public;
    }

    public String getSourceId() {
        return sourceId;
    }
    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    public String getTargetOwnerId() {
        return targetOwnerId;
    }
    public void setTargetOwnerId(String targetOwnerId) {
        this.targetOwnerId = targetOwnerId;
    }

}