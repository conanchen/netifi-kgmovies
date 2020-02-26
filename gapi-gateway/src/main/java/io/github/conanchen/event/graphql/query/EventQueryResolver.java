package io.github.conanchen.event.graphql.query;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import io.github.conanchen.event.graphql.api.Query;
import io.github.conanchen.event.graphql.model.EventGQO;
import io.github.conanchen.event.graphql.model.EventsConnectionGQO;
import org.springframework.stereotype.Service;

@Service
public class EventQueryResolver implements Query, GraphQLQueryResolver {

  @Override
  public EventsConnectionGQO allEvents(String after, Integer first, String before, Integer last)
      throws Exception {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public EventGQO event(String id, String eventID) throws Exception {
    // TODO Auto-generated method stub
    return null;
  }

}