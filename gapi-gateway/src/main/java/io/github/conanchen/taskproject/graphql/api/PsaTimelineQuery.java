package io.github.conanchen.taskproject.graphql.api;

import java.util.*;
import io.github.conanchen.taskproject.graphql.model.*;

public interface PsaTimelineQuery {

    PersonActivityTimelineGQO psaTimeline(String id, String patlID) throws Exception;

}