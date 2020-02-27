package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class LicenseGQO implements NodeGQO{

    @javax.validation.constraints.NotNull
    private String body;
    @javax.validation.constraints.NotNull
    private Collection<LicenseRuleGQO> conditions;
    private String description;
    @javax.validation.constraints.NotNull
    private Boolean featured;
    @javax.validation.constraints.NotNull
    private Boolean hidden;
    @javax.validation.constraints.NotNull
    private String id;
    private String implementation;
    @javax.validation.constraints.NotNull
    private String key;
    @javax.validation.constraints.NotNull
    private Collection<LicenseRuleGQO> limitations;
    @javax.validation.constraints.NotNull
    private String name;
    private String nickname;
    @javax.validation.constraints.NotNull
    private Collection<LicenseRuleGQO> permissions;
    @javax.validation.constraints.NotNull
    private Boolean pseudoLicense;
    private String spdxId;
    private String url;

    public LicenseGQO() {
    }

    public LicenseGQO(String body, Collection<LicenseRuleGQO> conditions, String description, Boolean featured, Boolean hidden, String id, String implementation, String key, Collection<LicenseRuleGQO> limitations, String name, String nickname, Collection<LicenseRuleGQO> permissions, Boolean pseudoLicense, String spdxId, String url) {
        this.body = body;
        this.conditions = conditions;
        this.description = description;
        this.featured = featured;
        this.hidden = hidden;
        this.id = id;
        this.implementation = implementation;
        this.key = key;
        this.limitations = limitations;
        this.name = name;
        this.nickname = nickname;
        this.permissions = permissions;
        this.pseudoLicense = pseudoLicense;
        this.spdxId = spdxId;
        this.url = url;
    }

    public String getBody() {
        return body;
    }
    public void setBody(String body) {
        this.body = body;
    }

    public Collection<LicenseRuleGQO> getConditions() {
        return conditions;
    }
    public void setConditions(Collection<LicenseRuleGQO> conditions) {
        this.conditions = conditions;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getFeatured() {
        return featured;
    }
    public void setFeatured(Boolean featured) {
        this.featured = featured;
    }

    public Boolean getHidden() {
        return hidden;
    }
    public void setHidden(Boolean hidden) {
        this.hidden = hidden;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getImplementation() {
        return implementation;
    }
    public void setImplementation(String implementation) {
        this.implementation = implementation;
    }

    public String getKey() {
        return key;
    }
    public void setKey(String key) {
        this.key = key;
    }

    public Collection<LicenseRuleGQO> getLimitations() {
        return limitations;
    }
    public void setLimitations(Collection<LicenseRuleGQO> limitations) {
        this.limitations = limitations;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getNickname() {
        return nickname;
    }
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Collection<LicenseRuleGQO> getPermissions() {
        return permissions;
    }
    public void setPermissions(Collection<LicenseRuleGQO> permissions) {
        this.permissions = permissions;
    }

    public Boolean getPseudoLicense() {
        return pseudoLicense;
    }
    public void setPseudoLicense(Boolean pseudoLicense) {
        this.pseudoLicense = pseudoLicense;
    }

    public String getSpdxId() {
        return spdxId;
    }
    public void setSpdxId(String spdxId) {
        this.spdxId = spdxId;
    }

    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }

}