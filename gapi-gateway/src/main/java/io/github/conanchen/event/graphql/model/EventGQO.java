package io.github.conanchen.event.graphql.model;

import io.github.conanchen.zommon.graphql.model.NodeGQO;
import io.github.conanchen.zommon.graphql.model.ThingGQO;

public class EventGQO implements NodeGQO{

    private ThingGQO about;
    private java.util.Date doorTime;
    private DurationGQO duration;
    private java.util.Date endDate;
    private ScheduleGQO eventSchedule;
    @javax.validation.constraints.NotNull
    private String id;

    public EventGQO() {
    }

    public EventGQO(ThingGQO about, java.util.Date doorTime, DurationGQO duration, java.util.Date endDate, ScheduleGQO eventSchedule, String id) {
        this.about = about;
        this.doorTime = doorTime;
        this.duration = duration;
        this.endDate = endDate;
        this.eventSchedule = eventSchedule;
        this.id = id;
    }

    public ThingGQO getAbout() {
        return about;
    }
    public void setAbout(ThingGQO about) {
        this.about = about;
    }

    public java.util.Date getDoorTime() {
        return doorTime;
    }
    public void setDoorTime(java.util.Date doorTime) {
        this.doorTime = doorTime;
    }

    public DurationGQO getDuration() {
        return duration;
    }
    public void setDuration(DurationGQO duration) {
        this.duration = duration;
    }

    public java.util.Date getEndDate() {
        return endDate;
    }
    public void setEndDate(java.util.Date endDate) {
        this.endDate = endDate;
    }

    public ScheduleGQO getEventSchedule() {
        return eventSchedule;
    }
    public void setEventSchedule(ScheduleGQO eventSchedule) {
        this.eventSchedule = eventSchedule;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

}