package io.github.conanchen.event.graphql.api;

import io.github.conanchen.event.graphql.model.EventGQO;

public interface EventQuery {

    EventGQO event(String id, String eventID) throws Exception;

}