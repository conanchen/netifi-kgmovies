package io.github.conanchen.acl.graphql.model;

import io.github.conanchen.zommon.graphql.model.NodeGQO;

import java.util.Collection;

public class ACLRoleGQO implements NodeGQO {

    @javax.validation.constraints.NotNull
    private String name;
    @javax.validation.constraints.NotNull
    private Collection<ACLVerbGQO> verbs;
    @javax.validation.constraints.NotNull
    private Collection<ACLResourceGQO> objects;
    private String alternateName;
    private String description;
    private ACLNamespaceGQO isRoleOf;
    private Collection<ACLRoleBindingGQO> hasRolebinding;
    @javax.validation.constraints.NotNull
    private String id;

    public ACLRoleGQO() {
    }

    public ACLRoleGQO(String name, Collection<ACLVerbGQO> verbs, Collection<ACLResourceGQO> objects, String alternateName, String description, ACLNamespaceGQO isRoleOf, Collection<ACLRoleBindingGQO> hasRolebinding, String id) {
        this.name = name;
        this.verbs = verbs;
        this.objects = objects;
        this.alternateName = alternateName;
        this.description = description;
        this.isRoleOf = isRoleOf;
        this.hasRolebinding = hasRolebinding;
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Collection<ACLVerbGQO> getVerbs() {
        return verbs;
    }
    public void setVerbs(Collection<ACLVerbGQO> verbs) {
        this.verbs = verbs;
    }

    public Collection<ACLResourceGQO> getObjects() {
        return objects;
    }
    public void setObjects(Collection<ACLResourceGQO> objects) {
        this.objects = objects;
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

    public ACLNamespaceGQO getIsRoleOf() {
        return isRoleOf;
    }

    public void setIsRoleOf(ACLNamespaceGQO isRoleOf) {
        this.isRoleOf = isRoleOf;
    }

    public Collection<ACLRoleBindingGQO> getHasRolebinding() {
        return hasRolebinding;
    }

    public void setHasRolebinding(Collection<ACLRoleBindingGQO> hasRolebinding) {
        this.hasRolebinding = hasRolebinding;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}