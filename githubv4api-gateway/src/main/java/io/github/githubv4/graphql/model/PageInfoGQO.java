package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class PageInfoGQO {

    private String endCursor;
    @javax.validation.constraints.NotNull
    private Boolean hasNextPage;
    @javax.validation.constraints.NotNull
    private Boolean hasPreviousPage;
    private String startCursor;

    public PageInfoGQO() {
    }

    public PageInfoGQO(String endCursor, Boolean hasNextPage, Boolean hasPreviousPage, String startCursor) {
        this.endCursor = endCursor;
        this.hasNextPage = hasNextPage;
        this.hasPreviousPage = hasPreviousPage;
        this.startCursor = startCursor;
    }

    public String getEndCursor() {
        return endCursor;
    }
    public void setEndCursor(String endCursor) {
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

}