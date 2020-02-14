package io.github.conanchen.message.graphql.model;

import io.github.conanchen.zommon.graphql.model.PlaceGQO;

public interface ActionGQO {

    PersonGQO getAgent();

    java.util.Date getStartTime();

    java.util.Date getEndTime();

    PlaceGQO getLocation();

    MessageGQO getObject();

    String getDescription();

}