package io.github.conanchen.action.graphql.model;

import io.github.conanchen.message.graphql.model.MessageGQO;
import io.github.conanchen.personorg.graphql.model.PersonGQO;
import io.github.conanchen.place.graphql.model.PlaceGQO;
import io.github.conanchen.zommon.graphql.model.NodeGQO;

public class UpdateActionGQO implements ActionGQO, NodeGQO{

    private PersonGQO agent;
    private java.util.Date startTime;
    private java.util.Date endTime;
    private PlaceGQO location;
    private MessageGQO object;
    private String description;
    @javax.validation.constraints.NotNull
    private String id;

    public UpdateActionGQO() {
    }

    public UpdateActionGQO(PersonGQO agent, java.util.Date startTime, java.util.Date endTime, PlaceGQO location, MessageGQO object, String description, String id) {
        this.agent = agent;
        this.startTime = startTime;
        this.endTime = endTime;
        this.location = location;
        this.object = object;
        this.description = description;
        this.id = id;
    }

    public PersonGQO getAgent() {
        return agent;
    }
    public void setAgent(PersonGQO agent) {
        this.agent = agent;
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

    public MessageGQO getObject() {
        return object;
    }
    public void setObject(MessageGQO object) {
        this.object = object;
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