package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class MarketplaceListingEdgeGQO {

    @javax.validation.constraints.NotNull
    private String cursor;
    private MarketplaceListingGQO node;

    public MarketplaceListingEdgeGQO() {
    }

    public MarketplaceListingEdgeGQO(String cursor, MarketplaceListingGQO node) {
        this.cursor = cursor;
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public MarketplaceListingGQO getNode() {
        return node;
    }
    public void setNode(MarketplaceListingGQO node) {
        this.node = node;
    }

}