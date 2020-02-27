package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class ReactionOrderGQO {

    @javax.validation.constraints.NotNull
    private OrderDirectionGQO direction;
    @javax.validation.constraints.NotNull
    private ReactionOrderFieldGQO field;

    public ReactionOrderGQO() {
    }

    public ReactionOrderGQO(OrderDirectionGQO direction, ReactionOrderFieldGQO field) {
        this.direction = direction;
        this.field = field;
    }

    public OrderDirectionGQO getDirection() {
        return direction;
    }
    public void setDirection(OrderDirectionGQO direction) {
        this.direction = direction;
    }

    public ReactionOrderFieldGQO getField() {
        return field;
    }
    public void setField(ReactionOrderFieldGQO field) {
        this.field = field;
    }

}