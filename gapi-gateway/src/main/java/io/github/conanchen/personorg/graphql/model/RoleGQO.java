package io.github.conanchen.personorg.graphql.model;

import io.github.conanchen.zommon.graphql.model.NodeGQO;

public class RoleGQO implements NodeGQO{

    private String roleName;
    private String alternativeHeadline;
    private String description;
    private java.util.Date createdAt;
    private PersonGQO creator;
    @javax.validation.constraints.NotNull
    private String id;

    public RoleGQO() {
    }

    public RoleGQO(String roleName, String alternativeHeadline, String description, java.util.Date createdAt, PersonGQO creator, String id) {
        this.roleName = roleName;
        this.alternativeHeadline = alternativeHeadline;
        this.description = description;
        this.createdAt = createdAt;
        this.creator = creator;
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getAlternativeHeadline() {
        return alternativeHeadline;
    }
    public void setAlternativeHeadline(String alternativeHeadline) {
        this.alternativeHeadline = alternativeHeadline;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public java.util.Date getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    public PersonGQO getCreator() {
        return creator;
    }
    public void setCreator(PersonGQO creator) {
        this.creator = creator;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

}