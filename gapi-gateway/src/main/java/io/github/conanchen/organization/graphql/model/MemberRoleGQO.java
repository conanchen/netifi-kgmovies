package io.github.conanchen.organization.graphql.model;

import io.github.conanchen.person.graphql.model.PersonGQO;
import io.github.conanchen.zommon.graphql.model.NodeGQO;

public class MemberRoleGQO implements NodeGQO {

    private PersonGQO member;
    private OrgRoleNameGQO roleName;
    private OrganizationGQO hostingOrganization;
    private String membershipNumber;
    private java.util.Date startDate;
    private java.util.Date endDate;
    private java.util.Date createdAt;
    private PersonGQO creator;
    @javax.validation.constraints.NotNull
    private String id;

    public MemberRoleGQO() {
    }

    public MemberRoleGQO(PersonGQO member, OrgRoleNameGQO roleName, OrganizationGQO hostingOrganization, String membershipNumber, java.util.Date startDate, java.util.Date endDate, java.util.Date createdAt, PersonGQO creator, String id) {
        this.member = member;
        this.roleName = roleName;
        this.hostingOrganization = hostingOrganization;
        this.membershipNumber = membershipNumber;
        this.startDate = startDate;
        this.endDate = endDate;
        this.createdAt = createdAt;
        this.creator = creator;
        this.id = id;
    }

    public PersonGQO getMember() {
        return member;
    }

    public void setMember(PersonGQO member) {
        this.member = member;
    }

    public OrgRoleNameGQO getRoleName() {
        return roleName;
    }

    public void setRoleName(OrgRoleNameGQO roleName) {
        this.roleName = roleName;
    }

    public OrganizationGQO getHostingOrganization() {
        return hostingOrganization;
    }

    public void setHostingOrganization(OrganizationGQO hostingOrganization) {
        this.hostingOrganization = hostingOrganization;
    }

    public String getMembershipNumber() {
        return membershipNumber;
    }

    public void setMembershipNumber(String membershipNumber) {
        this.membershipNumber = membershipNumber;
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