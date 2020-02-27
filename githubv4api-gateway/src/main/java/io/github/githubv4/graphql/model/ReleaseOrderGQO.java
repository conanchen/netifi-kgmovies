package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class ReleaseOrderGQO {

    @javax.validation.constraints.NotNull
    private OrderDirectionGQO direction;
    @javax.validation.constraints.NotNull
    private ReleaseOrderFieldGQO field;

    public ReleaseOrderGQO() {
    }

    public ReleaseOrderGQO(OrderDirectionGQO direction, ReleaseOrderFieldGQO field) {
        this.direction = direction;
        this.field = field;
    }

    public OrderDirectionGQO getDirection() {
        return direction;
    }
    public void setDirection(OrderDirectionGQO direction) {
        this.direction = direction;
    }

    public ReleaseOrderFieldGQO getField() {
        return field;
    }
    public void setField(ReleaseOrderFieldGQO field) {
        this.field = field;
    }

}