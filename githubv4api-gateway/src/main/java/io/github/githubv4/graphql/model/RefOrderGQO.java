package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class RefOrderGQO {

    @javax.validation.constraints.NotNull
    private OrderDirectionGQO direction;
    @javax.validation.constraints.NotNull
    private RefOrderFieldGQO field;

    public RefOrderGQO() {
    }

    public RefOrderGQO(OrderDirectionGQO direction, RefOrderFieldGQO field) {
        this.direction = direction;
        this.field = field;
    }

    public OrderDirectionGQO getDirection() {
        return direction;
    }
    public void setDirection(OrderDirectionGQO direction) {
        this.direction = direction;
    }

    public RefOrderFieldGQO getField() {
        return field;
    }
    public void setField(RefOrderFieldGQO field) {
        this.field = field;
    }

}