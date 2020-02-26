package io.github.conanchen.event.graphql.api;

import io.github.conanchen.event.graphql.model.EventGQO;
import io.github.conanchen.event.graphql.model.EventsConnectionGQO;

public interface Query {

    EventsConnectionGQO allEvents(String after, Integer first, String before, Integer last) throws Exception;

    EventGQO event(String id, String eventID) throws Exception;

}