package io.github.conanchen.event.graphql.api;

import java.util.*;
import io.github.conanchen.event.graphql.model.*;

public interface AllEventsQuery {

    EventsConnectionGQO allEvents(String after, Integer first, String before, Integer last) throws Exception;

}