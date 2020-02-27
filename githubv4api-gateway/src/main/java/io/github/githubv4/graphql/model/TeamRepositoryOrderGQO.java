package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class TeamRepositoryOrderGQO {

    @javax.validation.constraints.NotNull
    private OrderDirectionGQO direction;
    @javax.validation.constraints.NotNull
    private TeamRepositoryOrderFieldGQO field;

    public TeamRepositoryOrderGQO() {
    }

    public TeamRepositoryOrderGQO(OrderDirectionGQO direction, TeamRepositoryOrderFieldGQO field) {
        this.direction = direction;
        this.field = field;
    }

    public OrderDirectionGQO getDirection() {
        return direction;
    }
    public void setDirection(OrderDirectionGQO direction) {
        this.direction = direction;
    }

    public TeamRepositoryOrderFieldGQO getField() {
        return field;
    }
    public void setField(TeamRepositoryOrderFieldGQO field) {
        this.field = field;
    }

}