package io.github.conanchen.taskproject.graphql.model;

import java.util.Collection;
import io.github.conanchen.personorg.graphql.model.PartyGQO;
import io.github.conanchen.personorg.graphql.model.PersonGQO;
import io.github.conanchen.zommon.graphql.model.NodeGQO;

public class ProjectGQO implements NodeGQO{

    private String name;
    private String alternateName;
    private String description;
    private Collection<TaskGQO> hasPart;
    private PartyGQO sponsor;
    private PersonGQO manager;
    private Collection<PersonGQO> members;
    @javax.validation.constraints.NotNull
    private String id;

    public ProjectGQO() {
    }

    public ProjectGQO(String name, String alternateName, String description, Collection<TaskGQO> hasPart, PartyGQO sponsor, PersonGQO manager, Collection<PersonGQO> members, String id) {
        this.name = name;
        this.alternateName = alternateName;
        this.description = description;
        this.hasPart = hasPart;
        this.sponsor = sponsor;
        this.manager = manager;
        this.members = members;
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

    public Collection<TaskGQO> getHasPart() {
        return hasPart;
    }
    public void setHasPart(Collection<TaskGQO> hasPart) {
        this.hasPart = hasPart;
    }

    public PartyGQO getSponsor() {
        return sponsor;
    }
    public void setSponsor(PartyGQO sponsor) {
        this.sponsor = sponsor;
    }

    public PersonGQO getManager() {
        return manager;
    }
    public void setManager(PersonGQO manager) {
        this.manager = manager;
    }

    public Collection<PersonGQO> getMembers() {
        return members;
    }
    public void setMembers(Collection<PersonGQO> members) {
        this.members = members;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

}