package io.github.conanchen.event.graphql.model;

import io.github.conanchen.zommon.graphql.model.NodeGQO;

public class ScheduleGQO implements NodeGQO{

    private String name;
    private String alternateName;
    private String description;
    private DayOfWeekGQO byDay;
    private Integer byMonth;
    private Integer byMonthDay;
    private DurationGQO duration;
    private java.util.Date exceptDate;
    private Integer repeatCount;
    private DurationGQO repeatFrequency;
    @javax.validation.constraints.NotNull
    private String id;

    public ScheduleGQO() {
    }

    public ScheduleGQO(String name, String alternateName, String description, DayOfWeekGQO byDay, Integer byMonth, Integer byMonthDay, DurationGQO duration, java.util.Date exceptDate, Integer repeatCount, DurationGQO repeatFrequency, String id) {
        this.name = name;
        this.alternateName = alternateName;
        this.description = description;
        this.byDay = byDay;
        this.byMonth = byMonth;
        this.byMonthDay = byMonthDay;
        this.duration = duration;
        this.exceptDate = exceptDate;
        this.repeatCount = repeatCount;
        this.repeatFrequency = repeatFrequency;
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

    public DayOfWeekGQO getByDay() {
        return byDay;
    }
    public void setByDay(DayOfWeekGQO byDay) {
        this.byDay = byDay;
    }

    public Integer getByMonth() {
        return byMonth;
    }
    public void setByMonth(Integer byMonth) {
        this.byMonth = byMonth;
    }

    public Integer getByMonthDay() {
        return byMonthDay;
    }
    public void setByMonthDay(Integer byMonthDay) {
        this.byMonthDay = byMonthDay;
    }

    public DurationGQO getDuration() {
        return duration;
    }
    public void setDuration(DurationGQO duration) {
        this.duration = duration;
    }

    public java.util.Date getExceptDate() {
        return exceptDate;
    }
    public void setExceptDate(java.util.Date exceptDate) {
        this.exceptDate = exceptDate;
    }

    public Integer getRepeatCount() {
        return repeatCount;
    }
    public void setRepeatCount(Integer repeatCount) {
        this.repeatCount = repeatCount;
    }

    public DurationGQO getRepeatFrequency() {
        return repeatFrequency;
    }
    public void setRepeatFrequency(DurationGQO repeatFrequency) {
        this.repeatFrequency = repeatFrequency;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

}