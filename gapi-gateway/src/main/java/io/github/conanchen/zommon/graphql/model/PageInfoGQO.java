package io.github.conanchen.zommon.graphql.model;

import java.util.*;

public class PageInfoGQO {

    @javax.validation.constraints.NotNull
    private Boolean hasNextPage;
    @javax.validation.constraints.NotNull
    private Boolean hasPreviousPage;
    private String startCursor;
    private String endCursor;

    public PageInfoGQO() {
    }

    public PageInfoGQO(Boolean hasNextPage, Boolean hasPreviousPage, String startCursor, String endCursor) {
        this.hasNextPage = hasNextPage;
        this.hasPreviousPage = hasPreviousPage;
        this.startCursor = startCursor;
        this.endCursor = endCursor;
    }

    public Boolean getHasNextPage() {
        return hasNextPage;
    }
    public void setHasNextPage(Boolean hasNextPage) {
        this.hasNextPage = hasNextPage;
    }

    public Boolean getHasPreviousPage() {
        return hasPreviousPage;
    }
    public void setHasPreviousPage(Boolean hasPreviousPage) {
        this.hasPreviousPage = hasPreviousPage;
    }

    public String getStartCursor() {
        return startCursor;
    }
    public void setStartCursor(String startCursor) {
        this.startCursor = startCursor;
    }

    public String getEndCursor() {
        return endCursor;
    }
    public void setEndCursor(String endCursor) {
        this.endCursor = endCursor;
    }

}