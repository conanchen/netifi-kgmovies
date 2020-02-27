package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class LabelOrderGQO {

    @javax.validation.constraints.NotNull
    private OrderDirectionGQO direction;
    @javax.validation.constraints.NotNull
    private LabelOrderFieldGQO field;

    public LabelOrderGQO() {
    }

    public LabelOrderGQO(OrderDirectionGQO direction, LabelOrderFieldGQO field) {
        this.direction = direction;
        this.field = field;
    }

    public OrderDirectionGQO getDirection() {
        return direction;
    }
    public void setDirection(OrderDirectionGQO direction) {
        this.direction = direction;
    }

    public LabelOrderFieldGQO getField() {
        return field;
    }
    public void setField(LabelOrderFieldGQO field) {
        this.field = field;
    }

}