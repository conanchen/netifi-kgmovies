package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class TeamMemberOrderGQO {

    @javax.validation.constraints.NotNull
    private OrderDirectionGQO direction;
    @javax.validation.constraints.NotNull
    private TeamMemberOrderFieldGQO field;

    public TeamMemberOrderGQO() {
    }

    public TeamMemberOrderGQO(OrderDirectionGQO direction, TeamMemberOrderFieldGQO field) {
        this.direction = direction;
        this.field = field;
    }

    public OrderDirectionGQO getDirection() {
        return direction;
    }
    public void setDirection(OrderDirectionGQO direction) {
        this.direction = direction;
    }

    public TeamMemberOrderFieldGQO getField() {
        return field;
    }
    public void setField(TeamMemberOrderFieldGQO field) {
        this.field = field;
    }

}