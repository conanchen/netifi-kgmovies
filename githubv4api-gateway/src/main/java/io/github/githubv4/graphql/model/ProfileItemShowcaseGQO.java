package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class ProfileItemShowcaseGQO {

    @javax.validation.constraints.NotNull
    private Boolean hasPinnedItems;
    @javax.validation.constraints.NotNull
    private PinnableItemConnectionGQO items;

    public ProfileItemShowcaseGQO() {
    }

    public ProfileItemShowcaseGQO(Boolean hasPinnedItems, PinnableItemConnectionGQO items) {
        this.hasPinnedItems = hasPinnedItems;
        this.items = items;
    }

    public Boolean getHasPinnedItems() {
        return hasPinnedItems;
    }
    public void setHasPinnedItems(Boolean hasPinnedItems) {
        this.hasPinnedItems = hasPinnedItems;
    }

    public PinnableItemConnectionGQO getItems() {
        return items;
    }
    public void setItems(PinnableItemConnectionGQO items) {
        this.items = items;
    }

}