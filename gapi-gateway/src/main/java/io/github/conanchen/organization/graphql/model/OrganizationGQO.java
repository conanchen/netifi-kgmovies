package io.github.conanchen.organization.graphql.model;

import io.github.conanchen.action.graphql.model.ActionGQO;
import io.github.conanchen.person.graphql.model.PersonGQO;

import java.util.Collection;

public interface OrganizationGQO {

    Collection<OrganizationGQO> getParentOrganization();

    Collection<OrganizationGQO> getSubOrganizations();

    Collection<OrganizationGQO> getDepartments();

    Collection<EmployeeRoleGQO> getEmployees();

    EmployeeRoleConnectionGQO employeesPage(String after, Integer first, Integer before, String last, String personId) throws Exception;

    Collection<PersonGQO> getFollowers();

    Collection<MemberRoleGQO> getMembers();

    MemberRoleConnectionGQO membersPage(String after, Integer first, Integer before, String last, String personId) throws Exception;

    Collection<ActionGQO> getPotentialActions();

    Collection<OrgRoleNameGQO> getHasOrgRoleName();

}