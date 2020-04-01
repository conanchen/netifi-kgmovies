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
public class EventGQO implements NodeGQO{


    private ThingGQO about;

    private java.util.Date doorTime;

    private DurationGQO duration;

    private java.util.Date endDate;

    private ScheduleGQO eventSchedule;
    @lombok.NonNull
    private String id;

    public EventGQO() {
    }

    public EventGQO( ThingGQO about,  java.util.Date doorTime,  DurationGQO duration,  java.util.Date endDate,  ScheduleGQO eventSchedule,  String id) {
        this.about = about;
        this.doorTime = doorTime;
        this.duration = duration;
        this.endDate = endDate;
        this.eventSchedule = eventSchedule;
        this.id = id;
    }

}