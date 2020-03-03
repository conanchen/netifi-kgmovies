package io.github.conanchen.organization.graphql.model;

import io.github.conanchen.person.graphql.model.PersonGQO;
import io.github.conanchen.zommon.graphql.model.NodeGQO;

public class OrgRoleNameGQO implements NodeGQO {

    private OrganizationGQO isRoleNameOf;
    private String group;
    private String name;
    private String alternativeHeadline;
    private String description;
    private java.util.Date createdAt;
    private PersonGQO creator;
    @javax.validation.constraints.NotNull
    private String id;

    public OrgRoleNameGQO() {
    }

    public OrgRoleNameGQO(OrganizationGQO isRoleNameOf, String group, String name, String alternativeHeadline, String description, java.util.Date createdAt, PersonGQO creator, String id) {
        this.isRoleNameOf = isRoleNameOf;
        this.group = group;
        this.name = name;
        this.alternativeHeadline = alternativeHeadline;
        this.description = description;
        this.createdAt = createdAt;
        this.creator = creator;
        this.id = id;
    }

    public OrganizationGQO getIsRoleNameOf() {
        return isRoleNameOf;
    }

    public void setIsRoleNameOf(OrganizationGQO isRoleNameOf) {
        this.isRoleNameOf = isRoleNameOf;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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