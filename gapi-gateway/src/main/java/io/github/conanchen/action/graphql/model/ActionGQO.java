package io.github.conanchen.action.graphql.model;

import io.github.conanchen.message.graphql.model.MessageGQO;
import io.github.conanchen.message.graphql.model.PersonGQO;
import io.github.conanchen.place.graphql.model.PlaceGQO;

public interface ActionGQO {

    PersonGQO getAgent();

    java.util.Date getStartTime();

    java.util.Date getEndTime();

    PlaceGQO getLocation();

    MessageGQO getObject();

    String getDescription();

}