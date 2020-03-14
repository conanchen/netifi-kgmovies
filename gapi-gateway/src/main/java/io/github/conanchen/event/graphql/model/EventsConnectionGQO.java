package io.github.conanchen.event.graphql.model;

import graphql.relay.PageInfo;

import java.util.Collection;

public class EventsConnectionGQO {

    @javax.validation.constraints.NotNull
    private PageInfo pageInfo;
    private Collection<EventsEdgeGQO> edges;
    private Integer totalCount;
    private Collection<EventGQO> events;

    public EventsConnectionGQO() {
    }

    public EventsConnectionGQO(PageInfo pageInfo, Collection<EventsEdgeGQO> edges, Integer totalCount, Collection<EventGQO> events) {
        this.pageInfo = pageInfo;
        this.edges = edges;
        this.totalCount = totalCount;
        this.events = events;
    }

    public PageInfo getPageInfo() {
        return pageInfo;
    }
    public void setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
    }

    public Collection<EventsEdgeGQO> getEdges() {
        return edges;
    }
    public void setEdges(Collection<EventsEdgeGQO> edges) {
        this.edges = edges;
    }

    public Integer getTotalCount() {
        return totalCount;
    }
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public Collection<EventGQO> getEvents() {
        return events;
    }
    public void setEvents(Collection<EventGQO> events) {
        this.events = events;
    }

}