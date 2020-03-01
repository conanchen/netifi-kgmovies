package io.github.conanchen.acl.graphql.model;

import io.github.conanchen.person.graphql.model.UserGQO;

import java.util.Collection;

public class ACLUserGQO implements ACLSubjectGQO, ACLPartyGQO {

    private UserGQO user;
    private Collection<ACLNamespaceGQO> hasNamespace;
    private Collection<ACLGroupGQO> hasAclg;

    public ACLUserGQO() {
    }

    public ACLUserGQO(UserGQO user, Collection<ACLNamespaceGQO> hasNamespace, Collection<ACLGroupGQO> hasAclg) {
        this.user = user;
        this.hasNamespace = hasNamespace;
        this.hasAclg = hasAclg;
    }

    public UserGQO getUser() {
        return user;
    }

    public void setUser(UserGQO user) {
        this.user = user;
    }

    public Collection<ACLNamespaceGQO> getHasNamespace() {
        return hasNamespace;
    }

    public void setHasNamespace(Collection<ACLNamespaceGQO> hasNamespace) {
        this.hasNamespace = hasNamespace;
    }

    public Collection<ACLGroupGQO> getHasAclg() {
        return hasAclg;
    }

    public void setHasAclg(Collection<ACLGroupGQO> hasAclg) {
        this.hasAclg = hasAclg;
    }

}