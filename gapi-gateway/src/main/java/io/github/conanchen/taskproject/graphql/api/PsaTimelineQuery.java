package io.github.conanchen.taskproject.graphql.api;

import io.github.conanchen.taskproject.graphql.model.PersonActivityTimelineGQO;

public interface PsaTimelineQuery {

    PersonActivityTimelineGQO psaTimeline(String id, String patlID) throws Exception;

}