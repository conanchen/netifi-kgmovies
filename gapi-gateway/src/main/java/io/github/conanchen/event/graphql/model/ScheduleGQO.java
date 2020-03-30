package io.github.conanchen.event.graphql.model;

import java.util.*;
import io.github.conanchen.person.graphql.model.*;
import io.github.conanchen.organization.graphql.model.*;
import io.github.conanchen.acl.graphql.model.*;
import io.github.conanchen.shoppingfulfill.graphql.model.*;
import io.github.conanchen.place.graphql.model.*;
import io.github.conanchen.event.graphql.api.*;
import io.github.conanchen.action.graphql.model.*;
import io.github.conanchen.shoppingcart.graphql.model.*;
import io.github.conanchen.zommon.graphql.model.*;
import io.github.conanchen.shoppingdoor.graphql.model.*;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

@Data
@Builder
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
    @lombok.NonNull
    private String id;

    public ScheduleGQO() {
    }

    public ScheduleGQO( String name,  String alternateName,  String description,  DayOfWeekGQO byDay,  Integer byMonth,  Integer byMonthDay,  DurationGQO duration,  java.util.Date exceptDate,  Integer repeatCount,  DurationGQO repeatFrequency,  String id) {
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

}