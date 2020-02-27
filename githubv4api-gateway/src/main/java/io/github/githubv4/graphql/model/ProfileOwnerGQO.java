package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public interface ProfileOwnerGQO {

    Boolean getAnyPinnableItems();

    String getEmail();

    String getId();

    ProfileItemShowcaseGQO getItemShowcase();

    String getLocation();

    String getLogin();

    String getName();

    PinnableItemConnectionGQO getPinnableItems();

    PinnableItemConnectionGQO getPinnedItems();

    Integer getPinnedItemsRemaining();

    Boolean getViewerCanChangePinnedItems();

    String getWebsiteUrl();

}