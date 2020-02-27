package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class EnterpriseUserAccountGQO implements EnterpriseMemberGQO, ActorGQO, NodeGQO{

    @javax.validation.constraints.NotNull
    private String avatarUrl;
    @javax.validation.constraints.NotNull
    private java.util.Date createdAt;
    @javax.validation.constraints.NotNull
    private EnterpriseGQO enterprise;
    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private String login;
    private String name;
    @javax.validation.constraints.NotNull
    private EnterpriseOrganizationMembershipConnectionGQO organizations;
    @javax.validation.constraints.NotNull
    private String resourcePath;
    @javax.validation.constraints.NotNull
    private java.util.Date updatedAt;
    @javax.validation.constraints.NotNull
    private String url;
    private UserGQO user;

    public EnterpriseUserAccountGQO() {
    }

    public EnterpriseUserAccountGQO(String avatarUrl, java.util.Date createdAt, EnterpriseGQO enterprise, String id, String login, String name, EnterpriseOrganizationMembershipConnectionGQO organizations, String resourcePath, java.util.Date updatedAt, String url, UserGQO user) {
        this.avatarUrl = avatarUrl;
        this.createdAt = createdAt;
        this.enterprise = enterprise;
        this.id = id;
        this.login = login;
        this.name = name;
        this.organizations = organizations;
        this.resourcePath = resourcePath;
        this.updatedAt = updatedAt;
        this.url = url;
        this.user = user;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }
    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public java.util.Date getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    public EnterpriseGQO getEnterprise() {
        return enterprise;
    }
    public void setEnterprise(EnterpriseGQO enterprise) {
        this.enterprise = enterprise;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public EnterpriseOrganizationMembershipConnectionGQO getOrganizations() {
        return organizations;
    }
    public void setOrganizations(EnterpriseOrganizationMembershipConnectionGQO organizations) {
        this.organizations = organizations;
    }

    public String getResourcePath() {
        return resourcePath;
    }
    public void setResourcePath(String resourcePath) {
        this.resourcePath = resourcePath;
    }

    public java.util.Date getUpdatedAt() {
        return updatedAt;
    }
    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }

    public UserGQO getUser() {
        return user;
    }
    public void setUser(UserGQO user) {
        this.user = user;
    }

}