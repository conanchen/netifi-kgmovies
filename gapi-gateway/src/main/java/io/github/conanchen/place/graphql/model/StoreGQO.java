package io.github.conanchen.place.graphql.model;

import io.github.conanchen.action.graphql.model.ActionGQO;
import io.github.conanchen.organization.graphql.model.*;
import io.github.conanchen.person.graphql.model.PersonGQO;
import io.github.conanchen.zommon.graphql.model.NodeGQO;
import io.github.conanchen.zommon.graphql.model.ThingGQO;

import java.util.Collection;

public class StoreGQO implements ThingGQO, OrganizationGQO, LocalBusinessGQO, NodeGQO {

    private String openingHours;
    private String paymentAccepted;
    private String priceRange;
    private String name;
    private String alternateName;
    private String description;
    private java.util.Date dateCreated;
    private java.util.Date dateModified;
    private Collection<OrganizationGQO> parentOrganization;
    private Collection<OrganizationGQO> subOrganizations;
    private Collection<OrganizationGQO> departments;
    private Collection<EmployeeRoleGQO> employees;
    private EmployeeRoleConnectionGQO employeesPage;
    private Collection<PersonGQO> followers;
    private Collection<MemberRoleGQO> members;
    private MemberRoleConnectionGQO membersPage;
    private Collection<ActionGQO> potentialActions;
    private Collection<OrgRoleNameGQO> hasOrgRoleName;
    private Integer followernum;
    @javax.validation.constraints.NotNull
    private String id;

    public StoreGQO() {
    }

    public StoreGQO(String openingHours, String paymentAccepted, String priceRange, String name, String alternateName, String description, java.util.Date dateCreated, java.util.Date dateModified, Collection<OrganizationGQO> parentOrganization, Collection<OrganizationGQO> subOrganizations, Collection<OrganizationGQO> departments, Collection<EmployeeRoleGQO> employees, EmployeeRoleConnectionGQO employeesPage, Collection<PersonGQO> followers, Collection<MemberRoleGQO> members, MemberRoleConnectionGQO membersPage, Collection<ActionGQO> potentialActions, Collection<OrgRoleNameGQO> hasOrgRoleName, Integer followernum, String id) {
        this.openingHours = openingHours;
        this.paymentAccepted = paymentAccepted;
        this.priceRange = priceRange;
        this.name = name;
        this.alternateName = alternateName;
        this.description = description;
        this.dateCreated = dateCreated;
        this.dateModified = dateModified;
        this.parentOrganization = parentOrganization;
        this.subOrganizations = subOrganizations;
        this.departments = departments;
        this.employees = employees;
        this.employeesPage = employeesPage;
        this.followers = followers;
        this.members = members;
        this.membersPage = membersPage;
        this.potentialActions = potentialActions;
        this.hasOrgRoleName = hasOrgRoleName;
        this.followernum = followernum;
        this.id = id;
    }

    public String getOpeningHours() {
        return openingHours;
    }
    public void setOpeningHours(String openingHours) {
        this.openingHours = openingHours;
    }

    public String getPaymentAccepted() {
        return paymentAccepted;
    }
    public void setPaymentAccepted(String paymentAccepted) {
        this.paymentAccepted = paymentAccepted;
    }

    public String getPriceRange() {
        return priceRange;
    }
    public void setPriceRange(String priceRange) {
        this.priceRange = priceRange;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getAlternateName() {
        return alternateName;
    }
    public void setAlternateName(String alternateName) {
        this.alternateName = alternateName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public java.util.Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(java.util.Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public java.util.Date getDateModified() {
        return dateModified;
    }

    public void setDateModified(java.util.Date dateModified) {
        this.dateModified = dateModified;
    }

    public Collection<OrganizationGQO> getParentOrganization() {
        return parentOrganization;
    }

    public void setParentOrganization(Collection<OrganizationGQO> parentOrganization) {
        this.parentOrganization = parentOrganization;
    }

    public Collection<OrganizationGQO> getSubOrganizations() {
        return subOrganizations;
    }
    public void setSubOrganizations(Collection<OrganizationGQO> subOrganizations) {
        this.subOrganizations = subOrganizations;
    }

    public Collection<OrganizationGQO> getDepartments() {
        return departments;
    }

    public void setDepartments(Collection<OrganizationGQO> departments) {
        this.departments = departments;
    }

    public Collection<EmployeeRoleGQO> getEmployees() {
        return employees;
    }

    @Override
    public EmployeeRoleConnectionGQO employeesPage(String after, Integer first, Integer before, String last, String personId) throws Exception {
        return null;
    }

    public void setEmployees(Collection<EmployeeRoleGQO> employees) {
        this.employees = employees;
    }

    public EmployeeRoleConnectionGQO getEmployeesPage() {
        return employeesPage;
    }

    public void setEmployeesPage(EmployeeRoleConnectionGQO employeesPage) {
        this.employeesPage = employeesPage;
    }

    public Collection<PersonGQO> getFollowers() {
        return followers;
    }

    public void setFollowers(Collection<PersonGQO> followers) {
        this.followers = followers;
    }

    public Collection<MemberRoleGQO> getMembers() {
        return members;
    }

    public void setMembers(Collection<MemberRoleGQO> members) {
        this.members = members;
    }

    public MemberRoleConnectionGQO getMembersPage() {
        return membersPage;
    }

    public void setMembersPage(MemberRoleConnectionGQO membersPage) {
        this.membersPage = membersPage;
    }

    public Collection<ActionGQO> getPotentialActions() {
        return potentialActions;
    }

    public void setPotentialActions(Collection<ActionGQO> potentialActions) {
        this.potentialActions = potentialActions;
    }

    public Collection<OrgRoleNameGQO> getHasOrgRoleName() {
        return hasOrgRoleName;
    }

    public void setHasOrgRoleName(Collection<OrgRoleNameGQO> hasOrgRoleName) {
        this.hasOrgRoleName = hasOrgRoleName;
    }

    public Integer getFollowernum() {
        return followernum;
    }

    public void setFollowernum(Integer followernum) {
        this.followernum = followernum;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public MemberRoleConnectionGQO membersPage(String after, Integer first, Integer before, String last, String personId) throws Exception {
        // TODO Auto-generated method stub
        return null;
    }
}