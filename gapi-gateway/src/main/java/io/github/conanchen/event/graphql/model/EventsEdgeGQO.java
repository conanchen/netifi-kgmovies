package io.github.conanchen.event.graphql.model;

import java.util.*;
import io.github.conanchen.event.graphql.api.*;

public class EventsEdgeGQO {

    private EventGQO node;
    @javax.validation.constraints.NotNull
    private String cursor;

    public EventsEdgeGQO() {
    }

    public EventsEdgeGQO(EventGQO node, String cursor) {
        this.node = node;
        this.cursor = cursor;
    }

    public EventGQO getNode() {
        return node;
    }
    public void setNode(EventGQO node) {
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

}