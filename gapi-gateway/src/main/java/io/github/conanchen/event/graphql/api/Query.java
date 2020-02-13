package io.github.conanchen.event.graphql.api;

import java.util.*;
import io.github.conanchen.event.graphql.model.*;

public interface Query {

    EventsConnectionGQO allEvents(String after, Integer first, String before, Integer last) throws Exception;

    EventGQO event(String id, String eventID) throws Exception;

}