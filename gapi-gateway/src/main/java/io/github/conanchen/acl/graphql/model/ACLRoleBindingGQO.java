package io.github.conanchen.acl.graphql.model;

import io.github.conanchen.zommon.graphql.model.NodeGQO;

import java.util.Collection;

public class ACLRoleBindingGQO implements NodeGQO {

    private ACLNamespaceGQO isRolebindingOf;
    private ACLRoleGQO isBindingOf;
    private Collection<ACLSubjectGQO> subjects;
    @javax.validation.constraints.NotNull
    private String id;

    public ACLRoleBindingGQO() {
    }

    public ACLRoleBindingGQO(ACLNamespaceGQO isRolebindingOf, ACLRoleGQO isBindingOf, Collection<ACLSubjectGQO> subjects, String id) {
        this.isRolebindingOf = isRolebindingOf;
        this.isBindingOf = isBindingOf;
        this.subjects = subjects;
        this.id = id;
    }

    public ACLNamespaceGQO getIsRolebindingOf() {
        return isRolebindingOf;
    }

    public void setIsRolebindingOf(ACLNamespaceGQO isRolebindingOf) {
        this.isRolebindingOf = isRolebindingOf;
    }

    public ACLRoleGQO getIsBindingOf() {
        return isBindingOf;
    }

    public void setIsBindingOf(ACLRoleGQO isBindingOf) {
        this.isBindingOf = isBindingOf;
    }

    public Collection<ACLSubjectGQO> getSubjects() {
        return subjects;
    }
    public void setSubjects(Collection<ACLSubjectGQO> subjects) {
        this.subjects = subjects;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

}