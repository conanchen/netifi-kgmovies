package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class TeamDiscussionOrderGQO {

    @javax.validation.constraints.NotNull
    private OrderDirectionGQO direction;
    @javax.validation.constraints.NotNull
    private TeamDiscussionOrderFieldGQO field;

    public TeamDiscussionOrderGQO() {
    }

    public TeamDiscussionOrderGQO(OrderDirectionGQO direction, TeamDiscussionOrderFieldGQO field) {
        this.direction = direction;
        this.field = field;
    }

    public OrderDirectionGQO getDirection() {
        return direction;
    }
    public void setDirection(OrderDirectionGQO direction) {
        this.direction = direction;
    }

    public TeamDiscussionOrderFieldGQO getField() {
        return field;
    }
    public void setField(TeamDiscussionOrderFieldGQO field) {
        this.field = field;
    }

}