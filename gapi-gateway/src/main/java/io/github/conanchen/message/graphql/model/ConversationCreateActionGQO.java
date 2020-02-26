package io.github.conanchen.message.graphql.model;

import io.github.conanchen.action.graphql.model.ActionGQO;
import io.github.conanchen.action.graphql.model.EntryPointGQO;
import io.github.conanchen.person.graphql.model.PersonGQO;
import io.github.conanchen.place.graphql.model.PlaceGQO;
import io.github.conanchen.zommon.graphql.model.NodeGQO;
import io.github.conanchen.zommon.graphql.model.ThingGQO;

import java.util.Collection;

public class ConversationCreateActionGQO implements ActionGQO, NodeGQO{

    private Collection<PersonGQO> agent;
    private Collection<PersonGQO> participant;
    private ThingGQO object;
    private EntryPointGQO target;
    private java.util.Date startTime;
    private java.util.Date endTime;
    private PlaceGQO location;
    private String description;
    @javax.validation.constraints.NotNull
    private String id;

    public ConversationCreateActionGQO() {
    }

    public ConversationCreateActionGQO(Collection<PersonGQO> agent, Collection<PersonGQO> participant, ThingGQO object, EntryPointGQO target, java.util.Date startTime, java.util.Date endTime, PlaceGQO location, String description, String id) {
        this.agent = agent;
        this.participant = participant;
        this.object = object;
        this.target = target;
        this.startTime = startTime;
        this.endTime = endTime;
        this.location = location;
        this.description = description;
        this.id = id;
    }

    public Collection<PersonGQO> getAgent() {
        return agent;
    }
    public void setAgent(Collection<PersonGQO> agent) {
        this.agent = agent;
    }

    public Collection<PersonGQO> getParticipant() {
        return participant;
    }
    public void setParticipant(Collection<PersonGQO> participant) {
        this.participant = participant;
    }

    public ThingGQO getObject() {
        return object;
    }
    public void setObject(ThingGQO object) {
        this.object = object;
    }

    public EntryPointGQO getTarget() {
        return target;
    }
    public void setTarget(EntryPointGQO target) {
        this.target = target;
    }

    public java.util.Date getStartTime() {
        return startTime;
    }
    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    public java.util.Date getEndTime() {
        return endTime;
    }
    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    public PlaceGQO getLocation() {
        return location;
    }
    public void setLocation(PlaceGQO location) {
        this.location = location;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

}