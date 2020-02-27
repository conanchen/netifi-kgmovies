package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class MilestoneOrderGQO {

    @javax.validation.constraints.NotNull
    private OrderDirectionGQO direction;
    @javax.validation.constraints.NotNull
    private MilestoneOrderFieldGQO field;

    public MilestoneOrderGQO() {
    }

    public MilestoneOrderGQO(OrderDirectionGQO direction, MilestoneOrderFieldGQO field) {
        this.direction = direction;
        this.field = field;
    }

    public OrderDirectionGQO getDirection() {
        return direction;
    }
    public void setDirection(OrderDirectionGQO direction) {
        this.direction = direction;
    }

    public MilestoneOrderFieldGQO getField() {
        return field;
    }
    public void setField(MilestoneOrderFieldGQO field) {
        this.field = field;
    }

}