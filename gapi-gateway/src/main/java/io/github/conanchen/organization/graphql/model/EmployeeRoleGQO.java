package io.github.conanchen.organization.graphql.model;

import io.github.conanchen.person.graphql.model.PersonGQO;
import io.github.conanchen.zommon.graphql.model.NodeGQO;

public class EmployeeRoleGQO implements NodeGQO{

    private PersonGQO person;
    private String number;
    private OrgRoleNameGQO roleName;
    private OrganizationGQO hostingOrganization;
    private java.util.Date startDate;
    private java.util.Date endDate;
    @javax.validation.constraints.NotNull
    private String id;

    public EmployeeRoleGQO() {
    }

    public EmployeeRoleGQO(PersonGQO person, String number, OrgRoleNameGQO roleName, OrganizationGQO hostingOrganization, java.util.Date startDate, java.util.Date endDate, String id) {
        this.person = person;
        this.number = number;
        this.roleName = roleName;
        this.hostingOrganization = hostingOrganization;
        this.startDate = startDate;
        this.endDate = endDate;
        this.id = id;
    }

    public PersonGQO getPerson() {
        return person;
    }
    public void setPerson(PersonGQO person) {
        this.person = person;
    }

    public String getNumber() {
        return number;
    }
    public void setNumber(String number) {
        this.number = number;
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

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

}