package io.github.conanchen.event.graphql.api;

import io.github.conanchen.event.graphql.model.EventsConnectionGQO;

public interface AllEventsQuery {

    EventsConnectionGQO allEvents(String after, Integer first, String before, Integer last) throws Exception;

}