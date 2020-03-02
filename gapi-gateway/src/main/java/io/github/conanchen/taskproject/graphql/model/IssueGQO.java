package io.github.conanchen.taskproject.graphql.model;

import java.util.*;

import io.github.conanchen.person.graphql.model.PersonGQO;
import io.github.conanchen.person.graphql.model.UserConnectionGQO;
import io.github.conanchen.taskproject.graphql.api.*;
import io.github.conanchen.zommon.graphql.model.NodeGQO;
import io.github.conanchen.zommon.graphql.model.ThingGQO;

public class IssueGQO implements ThingGQO, NodeGQO {

    private String name;
    private String alternateName;
    private String description;
    private PersonGQO creator;
    private Collection<PersonGQO> assignees;
    @javax.validation.constraints.NotNull
    private UserConnectionGQO participants;
    private Collection<TaskGQO> tasks;
    @javax.validation.constraints.NotNull
    private String id;

    public IssueGQO() {
    }

    public IssueGQO(String name, String alternateName, String description, PersonGQO creator, Collection<PersonGQO> assignees, UserConnectionGQO participants, Collection<TaskGQO> tasks, String id) {
        this.name = name;
        this.alternateName = alternateName;
        this.description = description;
        this.creator = creator;
        this.assignees = assignees;
        this.participants = participants;
        this.tasks = tasks;
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

    public PersonGQO getCreator() {
        return creator;
    }
    public void setCreator(PersonGQO creator) {
        this.creator = creator;
    }

    public Collection<PersonGQO> getAssignees() {
        return assignees;
    }
    public void setAssignees(Collection<PersonGQO> assignees) {
        this.assignees = assignees;
    }

    public UserConnectionGQO getParticipants() {
        return participants;
    }
    public void setParticipants(UserConnectionGQO participants) {
        this.participants = participants;
    }

    public Collection<TaskGQO> getTasks() {
        return tasks;
    }
    public void setTasks(Collection<TaskGQO> tasks) {
        this.tasks = tasks;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    @javax.validation.constraints.NotNull
    UserConnectionGQO participants(String after, Integer first, String before, Integer last) throws Exception{
        // TODO Auto-generated method stub
        return null;
    }

}