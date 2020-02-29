package io.github.conanchen.acl.graphql.model;

import io.github.conanchen.zommon.graphql.model.NodeGQO;
import io.github.conanchen.zommon.graphql.model.ThingGQO;

import java.util.Collection;

public class ACLGroupGQO implements ACLSubjectGQO, ThingGQO, NodeGQO {

    private String name;
    private String alternateName;
    private String description;
    private Collection<ACLUserGQO> member;
    @javax.validation.constraints.NotNull
    private String id;

    public ACLGroupGQO() {
    }

    public ACLGroupGQO(String name, String alternateName, String description, Collection<ACLUserGQO> member, String id) {
        this.name = name;
        this.alternateName = alternateName;
        this.description = description;
        this.member = member;
        this.id = id;
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

    public Collection<ACLUserGQO> getMember() {
        return member;
    }

    public void setMember(Collection<ACLUserGQO> member) {
        this.member = member;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}