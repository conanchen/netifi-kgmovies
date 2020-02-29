package io.github.conanchen.acl.graphql.model;

import io.github.conanchen.person.graphql.model.UserGQO;

import java.util.Collection;

public class ACLUserGQO implements ACLSubjectGQO, ACLPartyGQO {

    private UserGQO user;
    private Collection<ACLRoleGQO> hasAclr;

    public ACLUserGQO() {
    }

    public ACLUserGQO(UserGQO user, Collection<ACLRoleGQO> hasAclr) {
        this.user = user;
        this.hasAclr = hasAclr;
    }

    public UserGQO getUser() {
        return user;
    }

    public void setUser(UserGQO user) {
        this.user = user;
    }

    public Collection<ACLRoleGQO> getHasAclr() {
        return hasAclr;
    }

    public void setHasAclr(Collection<ACLRoleGQO> hasAclr) {
        this.hasAclr = hasAclr;
    }

}