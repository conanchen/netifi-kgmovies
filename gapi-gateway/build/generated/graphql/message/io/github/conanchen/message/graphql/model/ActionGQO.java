package io.github.conanchen.message.graphql.model;

import java.util.*;
import io.github.conanchen.message.graphql.api.*;

public interface ActionGQO {

    PersonGQO getAgent();

    java.util.Date getStartTime();

    java.util.Date getEndTime();

    PlaceGQO getLocation();

    MessageGQO getObject();

    String getDescription();

}