package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class RateLimitGQO {

    @javax.validation.constraints.NotNull
    private Integer cost;
    @javax.validation.constraints.NotNull
    private Integer limit;
    @javax.validation.constraints.NotNull
    private Integer nodeCount;
    @javax.validation.constraints.NotNull
    private Integer remaining;
    @javax.validation.constraints.NotNull
    private java.util.Date resetAt;

    public RateLimitGQO() {
    }

    public RateLimitGQO(Integer cost, Integer limit, Integer nodeCount, Integer remaining, java.util.Date resetAt) {
        this.cost = cost;
        this.limit = limit;
        this.nodeCount = nodeCount;
        this.remaining = remaining;
        this.resetAt = resetAt;
    }

    public Integer getCost() {
        return cost;
    }
    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public Integer getLimit() {
        return limit;
    }
    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getNodeCount() {
        return nodeCount;
    }
    public void setNodeCount(Integer nodeCount) {
        this.nodeCount = nodeCount;
    }

    public Integer getRemaining() {
        return remaining;
    }
    public void setRemaining(Integer remaining) {
        this.remaining = remaining;
    }

    public java.util.Date getResetAt() {
        return resetAt;
    }
    public void setResetAt(java.util.Date resetAt) {
        this.resetAt = resetAt;
    }

}