package io.github.conanchen.event.graphql.api;

import java.util.*;
import io.github.conanchen.event.graphql.model.*;

public interface EventQuery {

    EventGQO event(String id, String eventID) throws Exception;

}