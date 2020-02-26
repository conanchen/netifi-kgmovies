package io.github.conanchen.place.graphql.model;

import io.github.conanchen.action.graphql.model.ActionGQO;
import io.github.conanchen.personorg.graphql.model.MembershipConnectionGQO;
import io.github.conanchen.personorg.graphql.model.MembershipGQO;
import io.github.conanchen.personorg.graphql.model.OrganizationGQO;
import io.github.conanchen.personorg.graphql.model.PersonGQO;
import io.github.conanchen.zommon.graphql.model.NodeGQO;

import java.util.Collection;

public class StoreGQO implements OrganizationGQO, LocalBusinessGQO, NodeGQO{

    private String openingHours;
    private String paymentAccepted;
    private String priceRange;
    private Collection<OrganizationGQO> parentOrganization;
    private Collection<OrganizationGQO> subOrganizations;
    private Collection<OrganizationGQO> departments;
    private Collection<PersonGQO> employees;
    private Collection<PersonGQO> followees;
    private Collection<ActionGQO> potentialActions;
    private Collection<MembershipGQO> members;
    private MembershipConnectionGQO membersPage;
    @javax.validation.constraints.NotNull
    private String id;

    public StoreGQO() {
    }

    public StoreGQO(String openingHours, String paymentAccepted, String priceRange, Collection<OrganizationGQO> parentOrganization, Collection<OrganizationGQO> subOrganizations, Collection<OrganizationGQO> departments, Collection<PersonGQO> employees, Collection<PersonGQO> followees, Collection<ActionGQO> potentialActions, Collection<MembershipGQO> members, MembershipConnectionGQO membersPage, String id) {
        this.openingHours = openingHours;
        this.paymentAccepted = paymentAccepted;
        this.priceRange = priceRange;
        this.parentOrganization = parentOrganization;
        this.subOrganizations = subOrganizations;
        this.departments = departments;
        this.employees = employees;
        this.followees = followees;
        this.potentialActions = potentialActions;
        this.members = members;
        this.membersPage = membersPage;
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

    public Collection<PersonGQO> getEmployees() {
        return employees;
    }
    public void setEmployees(Collection<PersonGQO> employees) {
        this.employees = employees;
    }

    public Collection<PersonGQO> getFollowees() {
        return followees;
    }
    public void setFollowees(Collection<PersonGQO> followees) {
        this.followees = followees;
    }

    public Collection<ActionGQO> getPotentialActions() {
        return potentialActions;
    }
    public void setPotentialActions(Collection<ActionGQO> potentialActions) {
        this.potentialActions = potentialActions;
    }

    public Collection<MembershipGQO> getMembers() {
        return members;
    }
    public void setMembers(Collection<MembershipGQO> members) {
        this.members = members;
    }

    public MembershipConnectionGQO getMembersPage() {
        return membersPage;
    }
    public void setMembersPage(MembershipConnectionGQO membersPage) {
        this.membersPage = membersPage;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public MembershipConnectionGQO membersPage(String after, Integer first, Integer before, String last, String personId) throws Exception {
        // TODO Auto-generated method stub
        return null;
    }
}