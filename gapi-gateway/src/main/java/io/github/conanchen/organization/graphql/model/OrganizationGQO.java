package io.github.conanchen.organization.graphql.model;

import io.github.conanchen.action.graphql.model.ActionGQO;
import io.github.conanchen.person.graphql.model.PersonGQO;

import java.util.Collection;

public interface OrganizationGQO {

    Collection<OrganizationGQO> getParentOrganization();

    Collection<OrganizationGQO> getSubOrganizations();

    Collection<OrganizationGQO> getDepartments();

    Collection<EmployeeRoleGQO> getEmployees();

    Collection<PersonGQO> getFollowers();

    Collection<MemberRoleGQO> getMembers();

    Collection<ActionGQO> getPotentialActions();

    Collection<OrgRoleNameGQO> getHasOrgRoleName();

}