package io.github.conanchen.personorg.graphql.model;

import io.github.conanchen.zommon.graphql.model.NodeGQO;

public class MembershipGQO implements NodeGQO{

    private PersonGQO person;
    private RoleGQO role;
    private OrganizationGQO organization;
    private java.util.Date startDate;
    private java.util.Date endDate;
    private java.util.Date createdAt;
    private PersonGQO creator;
    @javax.validation.constraints.NotNull
    private String id;

    public MembershipGQO() {
    }

    public MembershipGQO(PersonGQO person, RoleGQO role, OrganizationGQO organization, java.util.Date startDate, java.util.Date endDate, java.util.Date createdAt, PersonGQO creator, String id) {
        this.person = person;
        this.role = role;
        this.organization = organization;
        this.startDate = startDate;
        this.endDate = endDate;
        this.createdAt = createdAt;
        this.creator = creator;
        this.id = id;
    }

    public PersonGQO getPerson() {
        return person;
    }
    public void setPerson(PersonGQO person) {
        this.person = person;
    }

    public RoleGQO getRole() {
        return role;
    }
    public void setRole(RoleGQO role) {
        this.role = role;
    }

    public OrganizationGQO getOrganization() {
        return organization;
    }
    public void setOrganization(OrganizationGQO organization) {
        this.organization = organization;
    }

    public java.util.Date getStartDate() {
        return startDate;
    }
    public void setStartDate(java.util.Date startDate) {
        this.startDate = startDate;
    }

    public java.util.Date getEndDate() {
        return endDate;
    }
    public void setEndDate(java.util.Date endDate) {
        this.endDate = endDate;
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