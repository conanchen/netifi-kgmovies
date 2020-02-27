package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class TeamOrderGQO {

    @javax.validation.constraints.NotNull
    private OrderDirectionGQO direction;
    @javax.validation.constraints.NotNull
    private TeamOrderFieldGQO field;

    public TeamOrderGQO() {
    }

    public TeamOrderGQO(OrderDirectionGQO direction, TeamOrderFieldGQO field) {
        this.direction = direction;
        this.field = field;
    }

    public OrderDirectionGQO getDirection() {
        return direction;
    }
    public void setDirection(OrderDirectionGQO direction) {
        this.direction = direction;
    }

    public TeamOrderFieldGQO getField() {
        return field;
    }
    public void setField(TeamOrderFieldGQO field) {
        this.field = field;
    }

}