package io.github.conanchen.action.graphql.model;

import io.github.conanchen.person.graphql.model.PersonGQO;
import io.github.conanchen.place.graphql.model.PlaceGQO;
import io.github.conanchen.zommon.graphql.model.ThingGQO;

import java.util.Collection;

public interface ActionGQO {

    Collection<PersonGQO> getAgent();

    Collection<PersonGQO> getParticipant();

    ThingGQO getObject();

    EntryPointGQO getTarget();

    java.util.Date getStartTime();

    java.util.Date getEndTime();

    PlaceGQO getLocation();

    String getDescription();

}