package io.github.conanchen.event.graphql.model;

import java.util.Collection;
import io.github.conanchen.zommon.graphql.model.PageInfoGQO;

public class EventsConnectionGQO {

    @javax.validation.constraints.NotNull
    private PageInfoGQO pageInfo;
    private Collection<EventsEdgeGQO> edges;
    private Integer totalCount;
    private Collection<EventGQO> events;

    public EventsConnectionGQO() {
    }

    public EventsConnectionGQO(PageInfoGQO pageInfo, Collection<EventsEdgeGQO> edges, Integer totalCount, Collection<EventGQO> events) {
        this.pageInfo = pageInfo;
        this.edges = edges;
        this.totalCount = totalCount;
        this.events = events;
    }

    public PageInfoGQO getPageInfo() {
        return pageInfo;
    }
    public void setPageInfo(PageInfoGQO pageInfo) {
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