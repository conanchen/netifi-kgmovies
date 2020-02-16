package io.github.conanchen.taskproject.graphql.model;

import java.util.Collection;
import io.github.conanchen.action.graphql.model.ActionGQO;
import io.github.conanchen.message.graphql.model.PersonGQO;
import io.github.conanchen.zommon.graphql.model.NodeGQO;

public class PersonActivityTimelineGQO implements NodeGQO{

    private PersonGQO about;
    private String name;
    private String alternateName;
    private String description;
    private Collection<ActionGQO> personActivities;
    @javax.validation.constraints.NotNull
    private String id;

    public PersonActivityTimelineGQO() {
    }

    public PersonActivityTimelineGQO(PersonGQO about, String name, String alternateName, String description, Collection<ActionGQO> personActivities, String id) {
        this.about = about;
        this.name = name;
        this.alternateName = alternateName;
        this.description = description;
        this.personActivities = personActivities;
        this.id = id;
    }

    public PersonGQO getAbout() {
        return about;
    }
    public void setAbout(PersonGQO about) {
        this.about = about;
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

    public Collection<ActionGQO> getPersonActivities() {
        return personActivities;
    }
    public void setPersonActivities(Collection<ActionGQO> personActivities) {
        this.personActivities = personActivities;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

}