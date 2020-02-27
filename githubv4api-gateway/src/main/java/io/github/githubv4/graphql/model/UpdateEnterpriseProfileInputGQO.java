package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class UpdateEnterpriseProfileInputGQO {

    private String clientMutationId;
    private String description;
    @javax.validation.constraints.NotNull
    private String enterpriseId;
    private String location;
    private String name;
    private String websiteUrl;

    public UpdateEnterpriseProfileInputGQO() {
    }

    public UpdateEnterpriseProfileInputGQO(String clientMutationId, String description, String enterpriseId, String location, String name, String websiteUrl) {
        this.clientMutationId = clientMutationId;
        this.description = description;
        this.enterpriseId = enterpriseId;
        this.location = location;
        this.name = name;
        this.websiteUrl = websiteUrl;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public String getEnterpriseId() {
        return enterpriseId;
    }
    public void setEnterpriseId(String enterpriseId) {
        this.enterpriseId = enterpriseId;
    }

    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getWebsiteUrl() {
        return websiteUrl;
    }
    public void setWebsiteUrl(String websiteUrl) {
        this.websiteUrl = websiteUrl;
    }

}