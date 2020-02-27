package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public interface SubscribableGQO {

    String getId();

    Boolean getViewerCanSubscribe();

    SubscriptionStateGQO getViewerSubscription();

}