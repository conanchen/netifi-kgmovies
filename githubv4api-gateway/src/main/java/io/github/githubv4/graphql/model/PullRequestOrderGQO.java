package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class PullRequestOrderGQO {

    @javax.validation.constraints.NotNull
    private OrderDirectionGQO direction;
    @javax.validation.constraints.NotNull
    private PullRequestOrderFieldGQO field;

    public PullRequestOrderGQO() {
    }

    public PullRequestOrderGQO(OrderDirectionGQO direction, PullRequestOrderFieldGQO field) {
        this.direction = direction;
        this.field = field;
    }

    public OrderDirectionGQO getDirection() {
        return direction;
    }
    public void setDirection(OrderDirectionGQO direction) {
        this.direction = direction;
    }

    public PullRequestOrderFieldGQO getField() {
        return field;
    }
    public void setField(PullRequestOrderFieldGQO field) {
        this.field = field;
    }

}