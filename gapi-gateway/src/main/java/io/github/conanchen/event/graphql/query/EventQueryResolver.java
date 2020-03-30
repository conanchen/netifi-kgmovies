package io.github.conanchen.event.graphql.query;

import graphql.kickstart.tools.GraphQLQueryResolver;
import graphql.relay.Connection;
import graphql.schema.DataFetchingEnvironment;
import io.github.conanchen.event.graphql.api.Query;
import io.github.conanchen.event.graphql.model.EventGQO;
import org.springframework.stereotype.Service;

@Service
public class EventQueryResolver implements Query, GraphQLQueryResolver {


  @Override
  public Connection<EventGQO> allEvents(String after, Integer first, String before, Integer last, DataFetchingEnvironment env) {
    return null;
  }

  @Override
  public EventGQO event(String id, String eventID, DataFetchingEnvironment env) throws Exception {
    return null;
  }
}